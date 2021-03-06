// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: roundup.proto

package com.example.mq_protocol.dynamic_protocol;

public final class RoundUppro {
  private RoundUppro() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RoundUpOrBuilder extends
      // @@protoc_insertion_point(interface_extends:RoundUp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string className = 1;</code>
     * @return The className.
     */
    String getClassName();
    /**
     * <code>string className = 1;</code>
     * @return The bytes for className.
     */
    com.google.protobuf.ByteString
        getClassNameBytes();

    /**
     * <code>bytes message = 2;</code>
     * @return The message.
     */
    com.google.protobuf.ByteString getMessage();
  }
  /**
   * Protobuf type {@code RoundUp}
   */
  public static final class RoundUp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:RoundUp)
      RoundUpOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use RoundUp.newBuilder() to construct.
    private RoundUp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private RoundUp() {
      className_ = "";
      message_ = com.google.protobuf.ByteString.EMPTY;
    }

    @Override
    @SuppressWarnings({"unused"})
    protected Object newInstance(
        UnusedPrivateParameter unused) {
      return new RoundUp();
    }

    @Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private RoundUp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new NullPointerException();
      }
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
            case 10: {
              String s = input.readStringRequireUtf8();

              className_ = s;
              break;
            }
            case 18: {

              message_ = input.readBytes();
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return RoundUppro.internal_static_RoundUp_descriptor;
    }

    @Override
    protected FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RoundUppro.internal_static_RoundUp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RoundUp.class, Builder.class);
    }

    public static final int CLASSNAME_FIELD_NUMBER = 1;
    private volatile Object className_;
    /**
     * <code>string className = 1;</code>
     * @return The className.
     */
    @Override
    public String getClassName() {
      Object ref = className_;
      if (ref instanceof String) {
        return (String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        String s = bs.toStringUtf8();
        className_ = s;
        return s;
      }
    }
    /**
     * <code>string className = 1;</code>
     * @return The bytes for className.
     */
    @Override
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      Object ref = className_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (String) ref);
        className_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString message_;
    /**
     * <code>bytes message = 2;</code>
     * @return The message.
     */
    @Override
    public com.google.protobuf.ByteString getMessage() {
      return message_;
    }

    private byte memoizedIsInitialized = -1;
    @Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getClassNameBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, className_);
      }
      if (!message_.isEmpty()) {
        output.writeBytes(2, message_);
      }
      unknownFields.writeTo(output);
    }

    @Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getClassNameBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, className_);
      }
      if (!message_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, message_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @Override
    public boolean equals(final Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RoundUp)) {
        return super.equals(obj);
      }
      RoundUp other = (RoundUp) obj;

      if (!getClassName()
          .equals(other.getClassName())) return false;
      if (!getMessage()
          .equals(other.getMessage())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CLASSNAME_FIELD_NUMBER;
      hash = (53 * hash) + getClassName().hashCode();
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessage().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RoundUp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoundUp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoundUp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoundUp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoundUp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RoundUp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RoundUp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoundUp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoundUp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RoundUp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RoundUp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RoundUp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(RoundUp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @Override
    protected Builder newBuilderForType(
        BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code RoundUp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:RoundUp)
        RoundUpOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RoundUppro.internal_static_RoundUp_descriptor;
      }

      @Override
      protected FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RoundUppro.internal_static_RoundUp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RoundUp.class, Builder.class);
      }

      // Construct using com.example.mq_protocol.dynamic_protocol.RoundUppro.RoundUp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @Override
      public Builder clear() {
        super.clear();
        className_ = "";

        message_ = com.google.protobuf.ByteString.EMPTY;

        return this;
      }

      @Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RoundUppro.internal_static_RoundUp_descriptor;
      }

      @Override
      public RoundUp getDefaultInstanceForType() {
        return RoundUp.getDefaultInstance();
      }

      @Override
      public RoundUp build() {
        RoundUp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @Override
      public RoundUp buildPartial() {
        RoundUp result = new RoundUp(this);
        result.className_ = className_;
        result.message_ = message_;
        onBuilt();
        return result;
      }

      @Override
      public Builder clone() {
        return super.clone();
      }
      @Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.setField(field, value);
      }
      @Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          Object value) {
        return super.addRepeatedField(field, value);
      }
      @Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof RoundUp) {
          return mergeFrom((RoundUp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RoundUp other) {
        if (other == RoundUp.getDefaultInstance()) return this;
        if (!other.getClassName().isEmpty()) {
          className_ = other.className_;
          onChanged();
        }
        if (other.getMessage() != com.google.protobuf.ByteString.EMPTY) {
          setMessage(other.getMessage());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @Override
      public final boolean isInitialized() {
        return true;
      }

      @Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        RoundUp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RoundUp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private Object className_ = "";
      /**
       * <code>string className = 1;</code>
       * @return The className.
       */
      public String getClassName() {
        Object ref = className_;
        if (!(ref instanceof String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          String s = bs.toStringUtf8();
          className_ = s;
          return s;
        } else {
          return (String) ref;
        }
      }
      /**
       * <code>string className = 1;</code>
       * @return The bytes for className.
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        Object ref = className_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (String) ref);
          className_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string className = 1;</code>
       * @param value The className to set.
       * @return This builder for chaining.
       */
      public Builder setClassName(
          String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        className_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string className = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearClassName() {
        
        className_ = getDefaultInstance().getClassName();
        onChanged();
        return this;
      }
      /**
       * <code>string className = 1;</code>
       * @param value The bytes for className to set.
       * @return This builder for chaining.
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        className_ = value;
        onChanged();
        return this;
      }

      private com.google.protobuf.ByteString message_ = com.google.protobuf.ByteString.EMPTY;
      /**
       * <code>bytes message = 2;</code>
       * @return The message.
       */
      @Override
      public com.google.protobuf.ByteString getMessage() {
        return message_;
      }
      /**
       * <code>bytes message = 2;</code>
       * @param value The message to set.
       * @return This builder for chaining.
       */
      public Builder setMessage(com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        message_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bytes message = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearMessage() {
        
        message_ = getDefaultInstance().getMessage();
        onChanged();
        return this;
      }
      @Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:RoundUp)
    }

    // @@protoc_insertion_point(class_scope:RoundUp)
    private static final RoundUp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RoundUp();
    }

    public static RoundUp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<RoundUp>
        PARSER = new com.google.protobuf.AbstractParser<RoundUp>() {
      @Override
      public RoundUp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new RoundUp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<RoundUp> parser() {
      return PARSER;
    }

    @Override
    public com.google.protobuf.Parser<RoundUp> getParserForType() {
      return PARSER;
    }

    @Override
    public RoundUp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_RoundUp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_RoundUp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\rroundup.proto\"-\n\007RoundUp\022\021\n\tclassName\030" +
      "\001 \001(\t\022\017\n\007message\030\002 \001(\014B6\n(com.example.mq" +
      "_protocol.dynamic_protocolB\nRoundUpprob\006" +
      "proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_RoundUp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_RoundUp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_RoundUp_descriptor,
        new String[] { "ClassName", "Message", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
