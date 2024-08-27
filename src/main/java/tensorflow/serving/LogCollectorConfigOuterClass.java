// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow_serving/config/log_collector_config.proto
// Protobuf Java Version: 4.28.0-rc3

package tensorflow.serving;

public final class LogCollectorConfigOuterClass {
  private LogCollectorConfigOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 0,
      /* suffix= */ "-rc3",
      LogCollectorConfigOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface LogCollectorConfigOrBuilder extends
      // @@protoc_insertion_point(interface_extends:tensorflow.serving.LogCollectorConfig)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Identifies the type of the LogCollector we will use to collect these logs.
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <pre>
     * Identifies the type of the LogCollector we will use to collect these logs.
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <pre>
     * The prefix to use for the filenames of the logs.
     * </pre>
     *
     * <code>string filename_prefix = 2;</code>
     * @return The filenamePrefix.
     */
    java.lang.String getFilenamePrefix();
    /**
     * <pre>
     * The prefix to use for the filenames of the logs.
     * </pre>
     *
     * <code>string filename_prefix = 2;</code>
     * @return The bytes for filenamePrefix.
     */
    com.google.protobuf.ByteString
        getFilenamePrefixBytes();
  }
  /**
   * Protobuf type {@code tensorflow.serving.LogCollectorConfig}
   */
  public static final class LogCollectorConfig extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:tensorflow.serving.LogCollectorConfig)
      LogCollectorConfigOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 28,
        /* patch= */ 0,
        /* suffix= */ "-rc3",
        LogCollectorConfig.class.getName());
    }
    // Use LogCollectorConfig.newBuilder() to construct.
    private LogCollectorConfig(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private LogCollectorConfig() {
      type_ = "";
      filenamePrefix_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tensorflow.serving.LogCollectorConfigOuterClass.internal_static_tensorflow_serving_LogCollectorConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tensorflow.serving.LogCollectorConfigOuterClass.internal_static_tensorflow_serving_LogCollectorConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.class, tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object type_ = "";
    /**
     * <pre>
     * Identifies the type of the LogCollector we will use to collect these logs.
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * Identifies the type of the LogCollector we will use to collect these logs.
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FILENAME_PREFIX_FIELD_NUMBER = 2;
    @SuppressWarnings("serial")
    private volatile java.lang.Object filenamePrefix_ = "";
    /**
     * <pre>
     * The prefix to use for the filenames of the logs.
     * </pre>
     *
     * <code>string filename_prefix = 2;</code>
     * @return The filenamePrefix.
     */
    @java.lang.Override
    public java.lang.String getFilenamePrefix() {
      java.lang.Object ref = filenamePrefix_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        filenamePrefix_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The prefix to use for the filenames of the logs.
     * </pre>
     *
     * <code>string filename_prefix = 2;</code>
     * @return The bytes for filenamePrefix.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getFilenamePrefixBytes() {
      java.lang.Object ref = filenamePrefix_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        filenamePrefix_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 1, type_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(filenamePrefix_)) {
        com.google.protobuf.GeneratedMessage.writeString(output, 2, filenamePrefix_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(type_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, type_);
      }
      if (!com.google.protobuf.GeneratedMessage.isStringEmpty(filenamePrefix_)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(2, filenamePrefix_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig)) {
        return super.equals(obj);
      }
      tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig other = (tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig) obj;

      if (!getType()
          .equals(other.getType())) return false;
      if (!getFilenamePrefix()
          .equals(other.getFilenamePrefix())) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      hash = (37 * hash) + FILENAME_PREFIX_FIELD_NUMBER;
      hash = (53 * hash) + getFilenamePrefix().hashCode();
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * Protobuf type {@code tensorflow.serving.LogCollectorConfig}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:tensorflow.serving.LogCollectorConfig)
        tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfigOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return tensorflow.serving.LogCollectorConfigOuterClass.internal_static_tensorflow_serving_LogCollectorConfig_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return tensorflow.serving.LogCollectorConfigOuterClass.internal_static_tensorflow_serving_LogCollectorConfig_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.class, tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.Builder.class);
      }

      // Construct using tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        type_ = "";
        filenamePrefix_ = "";
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return tensorflow.serving.LogCollectorConfigOuterClass.internal_static_tensorflow_serving_LogCollectorConfig_descriptor;
      }

      @java.lang.Override
      public tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig getDefaultInstanceForType() {
        return tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.getDefaultInstance();
      }

      @java.lang.Override
      public tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig build() {
        tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig buildPartial() {
        tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig result = new tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.type_ = type_;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.filenamePrefix_ = filenamePrefix_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig) {
          return mergeFrom((tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig other) {
        if (other == tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig.getDefaultInstance()) return this;
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (!other.getFilenamePrefix().isEmpty()) {
          filenamePrefix_ = other.filenamePrefix_;
          bitField0_ |= 0x00000002;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 18: {
                filenamePrefix_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private java.lang.Object type_ = "";
      /**
       * <pre>
       * Identifies the type of the LogCollector we will use to collect these logs.
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Identifies the type of the LogCollector we will use to collect these logs.
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Identifies the type of the LogCollector we will use to collect these logs.
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        type_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Identifies the type of the LogCollector we will use to collect these logs.
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        type_ = getDefaultInstance().getType();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Identifies the type of the LogCollector we will use to collect these logs.
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        type_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private java.lang.Object filenamePrefix_ = "";
      /**
       * <pre>
       * The prefix to use for the filenames of the logs.
       * </pre>
       *
       * <code>string filename_prefix = 2;</code>
       * @return The filenamePrefix.
       */
      public java.lang.String getFilenamePrefix() {
        java.lang.Object ref = filenamePrefix_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          filenamePrefix_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The prefix to use for the filenames of the logs.
       * </pre>
       *
       * <code>string filename_prefix = 2;</code>
       * @return The bytes for filenamePrefix.
       */
      public com.google.protobuf.ByteString
          getFilenamePrefixBytes() {
        java.lang.Object ref = filenamePrefix_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          filenamePrefix_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The prefix to use for the filenames of the logs.
       * </pre>
       *
       * <code>string filename_prefix = 2;</code>
       * @param value The filenamePrefix to set.
       * @return This builder for chaining.
       */
      public Builder setFilenamePrefix(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        filenamePrefix_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The prefix to use for the filenames of the logs.
       * </pre>
       *
       * <code>string filename_prefix = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearFilenamePrefix() {
        filenamePrefix_ = getDefaultInstance().getFilenamePrefix();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The prefix to use for the filenames of the logs.
       * </pre>
       *
       * <code>string filename_prefix = 2;</code>
       * @param value The bytes for filenamePrefix to set.
       * @return This builder for chaining.
       */
      public Builder setFilenamePrefixBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        checkByteStringIsUtf8(value);
        filenamePrefix_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:tensorflow.serving.LogCollectorConfig)
    }

    // @@protoc_insertion_point(class_scope:tensorflow.serving.LogCollectorConfig)
    private static final tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig();
    }

    public static tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<LogCollectorConfig>
        PARSER = new com.google.protobuf.AbstractParser<LogCollectorConfig>() {
      @java.lang.Override
      public LogCollectorConfig parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<LogCollectorConfig> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<LogCollectorConfig> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public tensorflow.serving.LogCollectorConfigOuterClass.LogCollectorConfig getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_serving_LogCollectorConfig_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_serving_LogCollectorConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n4tensorflow_serving/config/log_collecto" +
      "r_config.proto\022\022tensorflow.serving\";\n\022Lo" +
      "gCollectorConfig\022\014\n\004type\030\001 \001(\t\022\027\n\017filena" +
      "me_prefix\030\002 \001(\tB\003\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_serving_LogCollectorConfig_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_serving_LogCollectorConfig_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_serving_LogCollectorConfig_descriptor,
        new java.lang.String[] { "Type", "FilenamePrefix", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
