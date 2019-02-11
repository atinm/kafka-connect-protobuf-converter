package com.blueapron.connect.protobuf;

import com.squareup.wire.Wire;
import com.squareup.wire.Message;
import com.squareup.wire.Message.Datatype;
import org.apache.kafka.connect.data.Date;
import org.apache.kafka.connect.data.Field;
import org.apache.kafka.connect.data.Schema;
import org.apache.kafka.connect.data.SchemaAndValue;
import org.apache.kafka.connect.data.SchemaBuilder;
import org.apache.kafka.connect.data.Struct;
import org.apache.kafka.connect.data.Timestamp;
import org.apache.kafka.connect.errors.ConnectException;
import org.apache.kafka.connect.errors.DataException;

import java.lang.reflect.Method;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.io.IOException;
import java.nio.ByteBuffer;
import okio.ByteString;

class ProtobufData {
  private final Class<? extends com.squareup.wire.Message.Builder> builder;
  private final Class clazz;
  private final Schema schema;
  private final String legacyName;
  public static final Message.Datatype[] PROTO_TYPES_WITH_DEFAULTS = new Message.Datatype[] { Datatype.INT32,
      Datatype.INT64, Datatype.UINT32, Datatype.UINT64, Datatype.SINT32, Datatype.SINT64, Datatype.BOOL, Datatype.ENUM,
      Datatype.STRING, Datatype.BYTES, Datatype.MESSAGE, Datatype.FIXED32, Datatype.SFIXED32, Datatype.FIXED64,
      Datatype.SFIXED64, Datatype.FLOAT, Datatype.DOUBLE };
  private HashMap<String, String> connectProtoNameMap = new HashMap<String, String>();

  ProtobufData(Class<? extends com.squareup.wire.Message> clazz, String legacyName) {
    this.legacyName = legacyName;
    this.clazz = clazz;

    try {
      Class[] nested = clazz.getDeclaredClasses();
      for (Class c : nested) {
        if (c.getSimpleName().equals("Builder")) {
          builder = c.asSubclass(Class.forName("Message.Builder"));
          break;
        }
      }
    } catch (NoSuchMethodException e) {
      throw new ConnectException(
          "Proto class " + clazz.getCanonicalName() + " is not a valid com.squareup.wire.Message class", e);
    }

    this.schema = toConnectSchema(builder.newInstance().build());
  }

  private Message getMessage(byte[] value) {
    try {
      return new Wire().parseFrom(value, this.clazz);
    } catch (IOException e) {
      throw new DataException("Invalid protobuf data", e);
    }
  }

  private String getProtoMapKey(String descriptorContainingTypeName, String connectFieldName) {
    return descriptorContainingTypeName.concat(connectFieldName);
  }

  private String getConnectFieldName(java.lang.reflect.Field field) {
    String name = field.getName();
    connectProtoNameMap.put(getProtoMapKey(field.getDeclaringClass().getCanonicalName(), name), field.getName());
    return name;
  }

  private String getProtoFieldName(String canonicalName, String connectFieldName) {
    return connectProtoNameMap.get(getProtoMapKey(canonicalName, connectFieldName));
  }

  SchemaAndValue toConnectData(byte[] value) {
    Message message = getMessage(value);
    if (message == null) {
      return SchemaAndValue.NULL;
    }

    return new SchemaAndValue(this.schema, message);
  }

  /*
       * Retrieving fields list of specified class and which
       * are annotated by incoming annotation class
       * If recursively is true, retrieving fields from all class hierarchy
       *
       * @param clazz - where fields are searching
       * @param annotationClass - specified annotation class
       * @param recursively param
       * @return list of annotated fields
       */
  private static List<java.lang.reflect.Field> getAnnotatedDeclaredFields(Class clazz, Class annotationClass) {
    java.lang.reflect.Field[] allFields = clazz.getDeclaredFields();
    List<java.lang.reflect.Field> annotatedFields = new LinkedList<java.lang.reflect.Field>();

    for (java.lang.reflect.Field field : allFields) {
      if (field.isAnnotationPresent(annotationClass))
        annotatedFields.add(field);
    }

    return annotatedFields;
  }

  private Schema toConnectSchema(Message message) {
    try {
      final SchemaBuilder builder = SchemaBuilder.struct();
      final List<java.lang.reflect.Field> fieldList = getAnnotatedDeclaredFields(clazz, Class.forName("ProtoField"));
      for (java.lang.reflect.Field field : fieldList) {
        builder.field(getConnectFieldName(field), toConnectSchema(field));
      }

      return builder.build();
    } catch (ClassNotFoundException e) {
      throw new ConnectException("Proto class ProtoField not found in the classpath");
    }
  }

  private boolean isTimestampDescriptor(java.lang.reflect.Field field) {
    return field.getType().getCanonicalName().equals("google.protobuf.Timestamp");
  }

  private boolean isDateDescriptor(java.lang.reflect.Field field) {
    return field.getType().getCanonicalName().equals("google.type.Date");
  }

  private Schema toConnectSchema(java.lang.reflect.Field field) {
    final SchemaBuilder builder;

    switch (field.getType().getSimpleName()) {
    case "Integer": {
      builder = SchemaBuilder.int32();
      break;
    }

    case "Long": {
      builder = SchemaBuilder.int64();
      break;
    }

    case "Float": {
      builder = SchemaBuilder.float32();
      break;
    }

    case "Double": {
      builder = SchemaBuilder.float64();
      break;
    }

    case "Boolean": {
      builder = SchemaBuilder.bool();
      break;
    }

    case "String":
      builder = SchemaBuilder.string();
      break;

    case "ByteString":
      builder = SchemaBuilder.bytes();
      break;

    default:
      if (field.getType().isEnum()) {
        builder = SchemaBuilder.string();
        break;
      }

      if (isTimestampDescriptor(field)) {
        builder = Timestamp.builder();
        break;
      }

      if (isDateDescriptor(field)) {
        builder = Date.builder();
        break;
      }

      if (field.getType().getSimpleName().startsWith("class")) {
        builder = SchemaBuilder.struct();
        for (java.lang.reflect.Field f : field.getClass().getFields()) {
          builder.field(getConnectFieldName(f), toConnectSchema(f));
        }
      } else {
        throw new DataException("Unknown Connect schema type: " + field.getType());
      }
    }

    builder.optional();
    Schema schema = builder.build();

    if (field.getType().isArray()) {
      final SchemaBuilder arrayBuilder = SchemaBuilder.array(schema);
      arrayBuilder.optional();
      schema = arrayBuilder.build();
    }

    return schema;
  }

  private boolean isProtobufTimestamp(Schema schema) {
    return Timestamp.SCHEMA.name().equals(schema.name());
  }

  private boolean isProtobufDate(Schema schema) {
    return Date.SCHEMA.name().equals(schema.name());
  }

  byte[] fromConnectData(Object value) {
    final Struct struct = (Struct) value;

    for (Field field : this.schema.fields()) {
      fromConnectData((com.squareup.wire.Message.Builder)this.builder, field, struct.get(field));
    }

    return builder.build().toByteArray();
  }

  private void fromConnectData(com.squareup.wire.Message.Builder builder, Field field, Object value) {
    final String protobufFieldName = getProtoFieldName(builder.getClass().getCanonicalName(), field.name());
    try {
      final java.lang.reflect.Field f = builder.getClass().getDeclaredField(protobufFieldName);
      if (f == null) {
        // Ignore unknown fields
        return;
      }

      final Schema schema = field.schema();
      final Schema.Type schemaType = schema.type();

      try {
        switch (schemaType) {
        case INT32: {
          final Integer intValue = (Integer) value; // Check for correct type
          f.set(builder.getClass(), intValue);
          return;
        }

        case INT64: {
          final Long longValue = (Long) value; // Check for correct type
          f.set(builder.getClass(), longValue);
          return;
        }

        case FLOAT32: {
          final Float floatValue = (Float) value; // Check for correct type
          f.set(builder.getClass(), floatValue);
          return;
        }

        case FLOAT64: {
          final Double doubleValue = (Double) value; // Check for correct type
          f.set(builder.getClass(), doubleValue);
          return;
        }

        case BOOLEAN: {
          final Boolean boolValue = (Boolean) value; // Check for correct type
          f.set(builder.getClass(), boolValue);
          return;
        }

        case STRING: {
          final String stringValue = (String) value; // Check for correct type
          f.set(builder.getClass(), stringValue);
          return;
        }

        case BYTES: {
          final ByteBuffer bytesValue = value instanceof byte[] ? ByteBuffer.wrap((byte[]) value) : (ByteBuffer) value;
          f.set(builder.getClass(), bytesValue.duplicate());
          return;
        }

        default:
          throw new DataException("Unknown schema type: " + schema.type());
        }
      } catch (ClassCastException e) {
        throw new DataException("Invalid type for " + schema.type() + ": " + value.getClass());
      } catch (IllegalAccessException e) {
        throw new DataException("Invalid type for " + schema.type() + ": " + value.getClass());
      }
    } catch (NoSuchFieldException e) {
      throw new ConnectException("Field " + protobufFieldName + " not found in the classpath");
    }
  }
}
