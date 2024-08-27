// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/example/example_parser_configuration.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.example;

/**
 * Protobuf type {@code tensorflow.FeatureConfiguration}
 */
public final class FeatureConfiguration extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.FeatureConfiguration)
    FeatureConfigurationOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      FeatureConfiguration.class.getName());
  }
  // Use FeatureConfiguration.newBuilder() to construct.
  private FeatureConfiguration(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FeatureConfiguration() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FeatureConfiguration_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FeatureConfiguration_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.example.FeatureConfiguration.class, org.tensorflow.example.FeatureConfiguration.Builder.class);
  }

  private int configCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object config_;
  public enum ConfigCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    FIXED_LEN_FEATURE(1),
    VAR_LEN_FEATURE(2),
    CONFIG_NOT_SET(0);
    private final int value;
    private ConfigCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ConfigCase valueOf(int value) {
      return forNumber(value);
    }

    public static ConfigCase forNumber(int value) {
      switch (value) {
        case 1: return FIXED_LEN_FEATURE;
        case 2: return VAR_LEN_FEATURE;
        case 0: return CONFIG_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ConfigCase
  getConfigCase() {
    return ConfigCase.forNumber(
        configCase_);
  }

  public static final int FIXED_LEN_FEATURE_FIELD_NUMBER = 1;
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return Whether the fixedLenFeature field is set.
   */
  @java.lang.Override
  public boolean hasFixedLenFeature() {
    return configCase_ == 1;
  }
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return The fixedLenFeature.
   */
  @java.lang.Override
  public org.tensorflow.example.FixedLenFeatureProto getFixedLenFeature() {
    if (configCase_ == 1) {
       return (org.tensorflow.example.FixedLenFeatureProto) config_;
    }
    return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.FixedLenFeatureProtoOrBuilder getFixedLenFeatureOrBuilder() {
    if (configCase_ == 1) {
       return (org.tensorflow.example.FixedLenFeatureProto) config_;
    }
    return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
  }

  public static final int VAR_LEN_FEATURE_FIELD_NUMBER = 2;
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return Whether the varLenFeature field is set.
   */
  @java.lang.Override
  public boolean hasVarLenFeature() {
    return configCase_ == 2;
  }
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return The varLenFeature.
   */
  @java.lang.Override
  public org.tensorflow.example.VarLenFeatureProto getVarLenFeature() {
    if (configCase_ == 2) {
       return (org.tensorflow.example.VarLenFeatureProto) config_;
    }
    return org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
  }
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   */
  @java.lang.Override
  public org.tensorflow.example.VarLenFeatureProtoOrBuilder getVarLenFeatureOrBuilder() {
    if (configCase_ == 2) {
       return (org.tensorflow.example.VarLenFeatureProto) config_;
    }
    return org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
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
    if (configCase_ == 1) {
      output.writeMessage(1, (org.tensorflow.example.FixedLenFeatureProto) config_);
    }
    if (configCase_ == 2) {
      output.writeMessage(2, (org.tensorflow.example.VarLenFeatureProto) config_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (configCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, (org.tensorflow.example.FixedLenFeatureProto) config_);
    }
    if (configCase_ == 2) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, (org.tensorflow.example.VarLenFeatureProto) config_);
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
    if (!(obj instanceof org.tensorflow.example.FeatureConfiguration)) {
      return super.equals(obj);
    }
    org.tensorflow.example.FeatureConfiguration other = (org.tensorflow.example.FeatureConfiguration) obj;

    if (!getConfigCase().equals(other.getConfigCase())) return false;
    switch (configCase_) {
      case 1:
        if (!getFixedLenFeature()
            .equals(other.getFixedLenFeature())) return false;
        break;
      case 2:
        if (!getVarLenFeature()
            .equals(other.getVarLenFeature())) return false;
        break;
      case 0:
      default:
    }
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
    switch (configCase_) {
      case 1:
        hash = (37 * hash) + FIXED_LEN_FEATURE_FIELD_NUMBER;
        hash = (53 * hash) + getFixedLenFeature().hashCode();
        break;
      case 2:
        hash = (37 * hash) + VAR_LEN_FEATURE_FIELD_NUMBER;
        hash = (53 * hash) + getVarLenFeature().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.tensorflow.example.FeatureConfiguration parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.tensorflow.example.FeatureConfiguration parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.example.FeatureConfiguration parseFrom(
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
  public static Builder newBuilder(org.tensorflow.example.FeatureConfiguration prototype) {
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
   * Protobuf type {@code tensorflow.FeatureConfiguration}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.FeatureConfiguration)
      org.tensorflow.example.FeatureConfigurationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FeatureConfiguration_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FeatureConfiguration_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.example.FeatureConfiguration.class, org.tensorflow.example.FeatureConfiguration.Builder.class);
    }

    // Construct using org.tensorflow.example.FeatureConfiguration.newBuilder()
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
      if (fixedLenFeatureBuilder_ != null) {
        fixedLenFeatureBuilder_.clear();
      }
      if (varLenFeatureBuilder_ != null) {
        varLenFeatureBuilder_.clear();
      }
      configCase_ = 0;
      config_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.example.ExampleParserConfigurationProtos.internal_static_tensorflow_FeatureConfiguration_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureConfiguration getDefaultInstanceForType() {
      return org.tensorflow.example.FeatureConfiguration.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureConfiguration build() {
      org.tensorflow.example.FeatureConfiguration result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.example.FeatureConfiguration buildPartial() {
      org.tensorflow.example.FeatureConfiguration result = new org.tensorflow.example.FeatureConfiguration(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.example.FeatureConfiguration result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(org.tensorflow.example.FeatureConfiguration result) {
      result.configCase_ = configCase_;
      result.config_ = this.config_;
      if (configCase_ == 1 &&
          fixedLenFeatureBuilder_ != null) {
        result.config_ = fixedLenFeatureBuilder_.build();
      }
      if (configCase_ == 2 &&
          varLenFeatureBuilder_ != null) {
        result.config_ = varLenFeatureBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.example.FeatureConfiguration) {
        return mergeFrom((org.tensorflow.example.FeatureConfiguration)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.example.FeatureConfiguration other) {
      if (other == org.tensorflow.example.FeatureConfiguration.getDefaultInstance()) return this;
      switch (other.getConfigCase()) {
        case FIXED_LEN_FEATURE: {
          mergeFixedLenFeature(other.getFixedLenFeature());
          break;
        }
        case VAR_LEN_FEATURE: {
          mergeVarLenFeature(other.getVarLenFeature());
          break;
        }
        case CONFIG_NOT_SET: {
          break;
        }
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
              input.readMessage(
                  getFixedLenFeatureFieldBuilder().getBuilder(),
                  extensionRegistry);
              configCase_ = 1;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getVarLenFeatureFieldBuilder().getBuilder(),
                  extensionRegistry);
              configCase_ = 2;
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
    private int configCase_ = 0;
    private java.lang.Object config_;
    public ConfigCase
        getConfigCase() {
      return ConfigCase.forNumber(
          configCase_);
    }

    public Builder clearConfig() {
      configCase_ = 0;
      config_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.example.FixedLenFeatureProto, org.tensorflow.example.FixedLenFeatureProto.Builder, org.tensorflow.example.FixedLenFeatureProtoOrBuilder> fixedLenFeatureBuilder_;
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     * @return Whether the fixedLenFeature field is set.
     */
    @java.lang.Override
    public boolean hasFixedLenFeature() {
      return configCase_ == 1;
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     * @return The fixedLenFeature.
     */
    @java.lang.Override
    public org.tensorflow.example.FixedLenFeatureProto getFixedLenFeature() {
      if (fixedLenFeatureBuilder_ == null) {
        if (configCase_ == 1) {
          return (org.tensorflow.example.FixedLenFeatureProto) config_;
        }
        return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
      } else {
        if (configCase_ == 1) {
          return fixedLenFeatureBuilder_.getMessage();
        }
        return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    public Builder setFixedLenFeature(org.tensorflow.example.FixedLenFeatureProto value) {
      if (fixedLenFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        fixedLenFeatureBuilder_.setMessage(value);
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    public Builder setFixedLenFeature(
        org.tensorflow.example.FixedLenFeatureProto.Builder builderForValue) {
      if (fixedLenFeatureBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        fixedLenFeatureBuilder_.setMessage(builderForValue.build());
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    public Builder mergeFixedLenFeature(org.tensorflow.example.FixedLenFeatureProto value) {
      if (fixedLenFeatureBuilder_ == null) {
        if (configCase_ == 1 &&
            config_ != org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance()) {
          config_ = org.tensorflow.example.FixedLenFeatureProto.newBuilder((org.tensorflow.example.FixedLenFeatureProto) config_)
              .mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        if (configCase_ == 1) {
          fixedLenFeatureBuilder_.mergeFrom(value);
        } else {
          fixedLenFeatureBuilder_.setMessage(value);
        }
      }
      configCase_ = 1;
      return this;
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    public Builder clearFixedLenFeature() {
      if (fixedLenFeatureBuilder_ == null) {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
          onChanged();
        }
      } else {
        if (configCase_ == 1) {
          configCase_ = 0;
          config_ = null;
        }
        fixedLenFeatureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    public org.tensorflow.example.FixedLenFeatureProto.Builder getFixedLenFeatureBuilder() {
      return getFixedLenFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    @java.lang.Override
    public org.tensorflow.example.FixedLenFeatureProtoOrBuilder getFixedLenFeatureOrBuilder() {
      if ((configCase_ == 1) && (fixedLenFeatureBuilder_ != null)) {
        return fixedLenFeatureBuilder_.getMessageOrBuilder();
      } else {
        if (configCase_ == 1) {
          return (org.tensorflow.example.FixedLenFeatureProto) config_;
        }
        return org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.example.FixedLenFeatureProto, org.tensorflow.example.FixedLenFeatureProto.Builder, org.tensorflow.example.FixedLenFeatureProtoOrBuilder> 
        getFixedLenFeatureFieldBuilder() {
      if (fixedLenFeatureBuilder_ == null) {
        if (!(configCase_ == 1)) {
          config_ = org.tensorflow.example.FixedLenFeatureProto.getDefaultInstance();
        }
        fixedLenFeatureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.tensorflow.example.FixedLenFeatureProto, org.tensorflow.example.FixedLenFeatureProto.Builder, org.tensorflow.example.FixedLenFeatureProtoOrBuilder>(
                (org.tensorflow.example.FixedLenFeatureProto) config_,
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      configCase_ = 1;
      onChanged();
      return fixedLenFeatureBuilder_;
    }

    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.example.VarLenFeatureProto, org.tensorflow.example.VarLenFeatureProto.Builder, org.tensorflow.example.VarLenFeatureProtoOrBuilder> varLenFeatureBuilder_;
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     * @return Whether the varLenFeature field is set.
     */
    @java.lang.Override
    public boolean hasVarLenFeature() {
      return configCase_ == 2;
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     * @return The varLenFeature.
     */
    @java.lang.Override
    public org.tensorflow.example.VarLenFeatureProto getVarLenFeature() {
      if (varLenFeatureBuilder_ == null) {
        if (configCase_ == 2) {
          return (org.tensorflow.example.VarLenFeatureProto) config_;
        }
        return org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
      } else {
        if (configCase_ == 2) {
          return varLenFeatureBuilder_.getMessage();
        }
        return org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    public Builder setVarLenFeature(org.tensorflow.example.VarLenFeatureProto value) {
      if (varLenFeatureBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        config_ = value;
        onChanged();
      } else {
        varLenFeatureBuilder_.setMessage(value);
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    public Builder setVarLenFeature(
        org.tensorflow.example.VarLenFeatureProto.Builder builderForValue) {
      if (varLenFeatureBuilder_ == null) {
        config_ = builderForValue.build();
        onChanged();
      } else {
        varLenFeatureBuilder_.setMessage(builderForValue.build());
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    public Builder mergeVarLenFeature(org.tensorflow.example.VarLenFeatureProto value) {
      if (varLenFeatureBuilder_ == null) {
        if (configCase_ == 2 &&
            config_ != org.tensorflow.example.VarLenFeatureProto.getDefaultInstance()) {
          config_ = org.tensorflow.example.VarLenFeatureProto.newBuilder((org.tensorflow.example.VarLenFeatureProto) config_)
              .mergeFrom(value).buildPartial();
        } else {
          config_ = value;
        }
        onChanged();
      } else {
        if (configCase_ == 2) {
          varLenFeatureBuilder_.mergeFrom(value);
        } else {
          varLenFeatureBuilder_.setMessage(value);
        }
      }
      configCase_ = 2;
      return this;
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    public Builder clearVarLenFeature() {
      if (varLenFeatureBuilder_ == null) {
        if (configCase_ == 2) {
          configCase_ = 0;
          config_ = null;
          onChanged();
        }
      } else {
        if (configCase_ == 2) {
          configCase_ = 0;
          config_ = null;
        }
        varLenFeatureBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    public org.tensorflow.example.VarLenFeatureProto.Builder getVarLenFeatureBuilder() {
      return getVarLenFeatureFieldBuilder().getBuilder();
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    @java.lang.Override
    public org.tensorflow.example.VarLenFeatureProtoOrBuilder getVarLenFeatureOrBuilder() {
      if ((configCase_ == 2) && (varLenFeatureBuilder_ != null)) {
        return varLenFeatureBuilder_.getMessageOrBuilder();
      } else {
        if (configCase_ == 2) {
          return (org.tensorflow.example.VarLenFeatureProto) config_;
        }
        return org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
      }
    }
    /**
     * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        org.tensorflow.example.VarLenFeatureProto, org.tensorflow.example.VarLenFeatureProto.Builder, org.tensorflow.example.VarLenFeatureProtoOrBuilder> 
        getVarLenFeatureFieldBuilder() {
      if (varLenFeatureBuilder_ == null) {
        if (!(configCase_ == 2)) {
          config_ = org.tensorflow.example.VarLenFeatureProto.getDefaultInstance();
        }
        varLenFeatureBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            org.tensorflow.example.VarLenFeatureProto, org.tensorflow.example.VarLenFeatureProto.Builder, org.tensorflow.example.VarLenFeatureProtoOrBuilder>(
                (org.tensorflow.example.VarLenFeatureProto) config_,
                getParentForChildren(),
                isClean());
        config_ = null;
      }
      configCase_ = 2;
      onChanged();
      return varLenFeatureBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:tensorflow.FeatureConfiguration)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.FeatureConfiguration)
  private static final org.tensorflow.example.FeatureConfiguration DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.example.FeatureConfiguration();
  }

  public static org.tensorflow.example.FeatureConfiguration getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureConfiguration>
      PARSER = new com.google.protobuf.AbstractParser<FeatureConfiguration>() {
    @java.lang.Override
    public FeatureConfiguration parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureConfiguration> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureConfiguration> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.example.FeatureConfiguration getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

