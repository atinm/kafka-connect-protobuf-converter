// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TestProto.proto

package com.blueapron.connect.protobuf;

public final class TestMessageProtos {
  private TestMessageProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.blueapron.connect.protobuf.TestMessageProtos.legacyName);
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface TestMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:TestMessage)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string test_string = 1;</code>
     */
    java.lang.String getTestString();
    /**
     * <code>string test_string = 1;</code>
     */
    com.google.protobuf.ByteString
        getTestStringBytes();

    /**
     * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
     */
    java.lang.String getSomeField();
    /**
     * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
     */
    com.google.protobuf.ByteString
        getSomeFieldBytes();
  }
  /**
   * Protobuf type {@code TestMessage}
   */
  public  static final class TestMessage extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:TestMessage)
      TestMessageOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use TestMessage.newBuilder() to construct.
    private TestMessage(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private TestMessage() {
      testString_ = "";
      someField_ = "";
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private TestMessage(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              testString_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              someField_ = s;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.blueapron.connect.protobuf.TestMessageProtos.internal_static_TestMessage_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.blueapron.connect.protobuf.TestMessageProtos.internal_static_TestMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.class, com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.Builder.class);
    }

    public static final int TEST_STRING_FIELD_NUMBER = 1;
    private volatile java.lang.Object testString_;
    /**
     * <code>string test_string = 1;</code>
     */
    public java.lang.String getTestString() {
      java.lang.Object ref = testString_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        testString_ = s;
        return s;
      }
    }
    /**
     * <code>string test_string = 1;</code>
     */
    public com.google.protobuf.ByteString
        getTestStringBytes() {
      java.lang.Object ref = testString_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        testString_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int SOME_FIELD_FIELD_NUMBER = 2;
    private volatile java.lang.Object someField_;
    /**
     * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
     */
    public java.lang.String getSomeField() {
      java.lang.Object ref = someField_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        someField_ = s;
        return s;
      }
    }
    /**
     * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
     */
    public com.google.protobuf.ByteString
        getSomeFieldBytes() {
      java.lang.Object ref = someField_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        someField_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTestStringBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, testString_);
      }
      if (!getSomeFieldBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, someField_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTestStringBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, testString_);
      }
      if (!getSomeFieldBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, someField_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof com.blueapron.connect.protobuf.TestMessageProtos.TestMessage)) {
        return super.equals(obj);
      }
      com.blueapron.connect.protobuf.TestMessageProtos.TestMessage other = (com.blueapron.connect.protobuf.TestMessageProtos.TestMessage) obj;

      boolean result = true;
      result = result && getTestString()
          .equals(other.getTestString());
      result = result && getSomeField()
          .equals(other.getSomeField());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TEST_STRING_FIELD_NUMBER;
      hash = (53 * hash) + getTestString().hashCode();
      hash = (37 * hash) + SOME_FIELD_FIELD_NUMBER;
      hash = (53 * hash) + getSomeField().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.blueapron.connect.protobuf.TestMessageProtos.TestMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code TestMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:TestMessage)
        com.blueapron.connect.protobuf.TestMessageProtos.TestMessageOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.blueapron.connect.protobuf.TestMessageProtos.internal_static_TestMessage_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.blueapron.connect.protobuf.TestMessageProtos.internal_static_TestMessage_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.class, com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.Builder.class);
      }

      // Construct using com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage
                .alwaysUseFieldBuilders) {
        }
      }
      public Builder clear() {
        super.clear();
        testString_ = "";

        someField_ = "";

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.blueapron.connect.protobuf.TestMessageProtos.internal_static_TestMessage_descriptor;
      }

      public com.blueapron.connect.protobuf.TestMessageProtos.TestMessage getDefaultInstanceForType() {
        return com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.getDefaultInstance();
      }

      public com.blueapron.connect.protobuf.TestMessageProtos.TestMessage build() {
        com.blueapron.connect.protobuf.TestMessageProtos.TestMessage result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.blueapron.connect.protobuf.TestMessageProtos.TestMessage buildPartial() {
        com.blueapron.connect.protobuf.TestMessageProtos.TestMessage result = new com.blueapron.connect.protobuf.TestMessageProtos.TestMessage(this);
        result.testString_ = testString_;
        result.someField_ = someField_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.blueapron.connect.protobuf.TestMessageProtos.TestMessage) {
          return mergeFrom((com.blueapron.connect.protobuf.TestMessageProtos.TestMessage)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.blueapron.connect.protobuf.TestMessageProtos.TestMessage other) {
        if (other == com.blueapron.connect.protobuf.TestMessageProtos.TestMessage.getDefaultInstance()) return this;
        if (!other.getTestString().isEmpty()) {
          testString_ = other.testString_;
          onChanged();
        }
        if (!other.getSomeField().isEmpty()) {
          someField_ = other.someField_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      public final boolean isInitialized() {
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.blueapron.connect.protobuf.TestMessageProtos.TestMessage parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.blueapron.connect.protobuf.TestMessageProtos.TestMessage) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object testString_ = "";
      /**
       * <code>string test_string = 1;</code>
       */
      public java.lang.String getTestString() {
        java.lang.Object ref = testString_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          testString_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string test_string = 1;</code>
       */
      public com.google.protobuf.ByteString
          getTestStringBytes() {
        java.lang.Object ref = testString_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          testString_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string test_string = 1;</code>
       */
      public Builder setTestString(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        testString_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string test_string = 1;</code>
       */
      public Builder clearTestString() {
        
        testString_ = getDefaultInstance().getTestString();
        onChanged();
        return this;
      }
      /**
       * <code>string test_string = 1;</code>
       */
      public Builder setTestStringBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        testString_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object someField_ = "";
      /**
       * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
       */
      public java.lang.String getSomeField() {
        java.lang.Object ref = someField_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          someField_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
       */
      public com.google.protobuf.ByteString
          getSomeFieldBytes() {
        java.lang.Object ref = someField_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          someField_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
       */
      public Builder setSomeField(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        someField_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
       */
      public Builder clearSomeField() {
        
        someField_ = getDefaultInstance().getSomeField();
        onChanged();
        return this;
      }
      /**
       * <code>string some_field = 2 [(.legacy_name) = "legacy_field_name"];</code>
       */
      public Builder setSomeFieldBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        someField_ = value;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:TestMessage)
    }

    // @@protoc_insertion_point(class_scope:TestMessage)
    private static final com.blueapron.connect.protobuf.TestMessageProtos.TestMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.blueapron.connect.protobuf.TestMessageProtos.TestMessage();
    }

    public static com.blueapron.connect.protobuf.TestMessageProtos.TestMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<TestMessage>
        PARSER = new com.google.protobuf.AbstractParser<TestMessage>() {
      public TestMessage parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
          return new TestMessage(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<TestMessage> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<TestMessage> getParserForType() {
      return PARSER;
    }

    public com.blueapron.connect.protobuf.TestMessageProtos.TestMessage getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public static final int LEGACY_NAME_FIELD_NUMBER = 51234;
  /**
   * <code>extend .google.protobuf.FieldOptions { ... }</code>
   */
  public static final
    com.google.protobuf.GeneratedMessage.GeneratedExtension<
      com.google.protobuf.DescriptorProtos.FieldOptions,
      java.lang.String> legacyName = com.google.protobuf.GeneratedMessage
          .newFileScopedGeneratedExtension(
        java.lang.String.class,
        null);
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TestMessage_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_TestMessage_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017TestProto.proto\032 google/protobuf/descr" +
      "iptor.proto\"M\n\013TestMessage\022\023\n\013test_strin" +
      "g\030\001 \001(\t\022)\n\nsome_field\030\002 \001(\tB\025\222\202\031\021legacy_" +
      "field_name:4\n\013legacy_name\022\035.google.proto" +
      "buf.FieldOptions\030\242\220\003 \001(\tB3\n\036com.blueapro" +
      "n.connect.protobufB\021TestMessageProtosb\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.protobuf.DescriptorProtos.getDescriptor(),
        }, assigner);
    internal_static_TestMessage_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TestMessage_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_TestMessage_descriptor,
        new java.lang.String[] { "TestString", "SomeField", });
    legacyName.internalInit(descriptor.getExtensions().get(0));
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.blueapron.connect.protobuf.TestMessageProtos.legacyName);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.google.protobuf.DescriptorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
