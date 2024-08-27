// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/protobuf/debug_event.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.util;

/**
 * <pre>
 * A device on which ops and/or tensors are instrumented by the debugger.
 * </pre>
 *
 * Protobuf type {@code tensorflow.DebuggedDevice}
 */
public final class DebuggedDevice extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:tensorflow.DebuggedDevice)
    DebuggedDeviceOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      DebuggedDevice.class.getName());
  }
  // Use DebuggedDevice.newBuilder() to construct.
  private DebuggedDevice(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private DebuggedDevice() {
    deviceName_ = "";
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return org.tensorflow.util.DebugEventProtos.internal_static_tensorflow_DebuggedDevice_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return org.tensorflow.util.DebugEventProtos.internal_static_tensorflow_DebuggedDevice_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            org.tensorflow.util.DebuggedDevice.class, org.tensorflow.util.DebuggedDevice.Builder.class);
  }

  public static final int DEVICE_NAME_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object deviceName_ = "";
  /**
   * <pre>
   * Name of the device.
   * </pre>
   *
   * <code>string device_name = 1;</code>
   * @return The deviceName.
   */
  @java.lang.Override
  public java.lang.String getDeviceName() {
    java.lang.Object ref = deviceName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      deviceName_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * Name of the device.
   * </pre>
   *
   * <code>string device_name = 1;</code>
   * @return The bytes for deviceName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDeviceNameBytes() {
    java.lang.Object ref = deviceName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      deviceName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DEVICE_ID_FIELD_NUMBER = 2;
  private int deviceId_ = 0;
  /**
   * <pre>
   * A debugger-generated ID for the device. Guaranteed to be unique within
   * the scope of the debugged TensorFlow program, including single-host and
   * multi-host settings.
   * TODO(cais): Test the uniqueness guarantee in multi-host settings.
   * </pre>
   *
   * <code>int32 device_id = 2;</code>
   * @return The deviceId.
   */
  @java.lang.Override
  public int getDeviceId() {
    return deviceId_;
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
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deviceName_)) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, deviceName_);
    }
    if (deviceId_ != 0) {
      output.writeInt32(2, deviceId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessage.isStringEmpty(deviceName_)) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, deviceName_);
    }
    if (deviceId_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, deviceId_);
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
    if (!(obj instanceof org.tensorflow.util.DebuggedDevice)) {
      return super.equals(obj);
    }
    org.tensorflow.util.DebuggedDevice other = (org.tensorflow.util.DebuggedDevice) obj;

    if (!getDeviceName()
        .equals(other.getDeviceName())) return false;
    if (getDeviceId()
        != other.getDeviceId()) return false;
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
    hash = (37 * hash) + DEVICE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceName().hashCode();
    hash = (37 * hash) + DEVICE_ID_FIELD_NUMBER;
    hash = (53 * hash) + getDeviceId();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static org.tensorflow.util.DebuggedDevice parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static org.tensorflow.util.DebuggedDevice parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static org.tensorflow.util.DebuggedDevice parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static org.tensorflow.util.DebuggedDevice parseFrom(
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
  public static Builder newBuilder(org.tensorflow.util.DebuggedDevice prototype) {
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
   * <pre>
   * A device on which ops and/or tensors are instrumented by the debugger.
   * </pre>
   *
   * Protobuf type {@code tensorflow.DebuggedDevice}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tensorflow.DebuggedDevice)
      org.tensorflow.util.DebuggedDeviceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.tensorflow.util.DebugEventProtos.internal_static_tensorflow_DebuggedDevice_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.tensorflow.util.DebugEventProtos.internal_static_tensorflow_DebuggedDevice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.tensorflow.util.DebuggedDevice.class, org.tensorflow.util.DebuggedDevice.Builder.class);
    }

    // Construct using org.tensorflow.util.DebuggedDevice.newBuilder()
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
      deviceName_ = "";
      deviceId_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return org.tensorflow.util.DebugEventProtos.internal_static_tensorflow_DebuggedDevice_descriptor;
    }

    @java.lang.Override
    public org.tensorflow.util.DebuggedDevice getDefaultInstanceForType() {
      return org.tensorflow.util.DebuggedDevice.getDefaultInstance();
    }

    @java.lang.Override
    public org.tensorflow.util.DebuggedDevice build() {
      org.tensorflow.util.DebuggedDevice result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public org.tensorflow.util.DebuggedDevice buildPartial() {
      org.tensorflow.util.DebuggedDevice result = new org.tensorflow.util.DebuggedDevice(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(org.tensorflow.util.DebuggedDevice result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.deviceName_ = deviceName_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deviceId_ = deviceId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof org.tensorflow.util.DebuggedDevice) {
        return mergeFrom((org.tensorflow.util.DebuggedDevice)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(org.tensorflow.util.DebuggedDevice other) {
      if (other == org.tensorflow.util.DebuggedDevice.getDefaultInstance()) return this;
      if (!other.getDeviceName().isEmpty()) {
        deviceName_ = other.deviceName_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getDeviceId() != 0) {
        setDeviceId(other.getDeviceId());
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
              deviceName_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              deviceId_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private java.lang.Object deviceName_ = "";
    /**
     * <pre>
     * Name of the device.
     * </pre>
     *
     * <code>string device_name = 1;</code>
     * @return The deviceName.
     */
    public java.lang.String getDeviceName() {
      java.lang.Object ref = deviceName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        deviceName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * Name of the device.
     * </pre>
     *
     * <code>string device_name = 1;</code>
     * @return The bytes for deviceName.
     */
    public com.google.protobuf.ByteString
        getDeviceNameBytes() {
      java.lang.Object ref = deviceName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * Name of the device.
     * </pre>
     *
     * <code>string device_name = 1;</code>
     * @param value The deviceName to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      deviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the device.
     * </pre>
     *
     * <code>string device_name = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceName() {
      deviceName_ = getDefaultInstance().getDeviceName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Name of the device.
     * </pre>
     *
     * <code>string device_name = 1;</code>
     * @param value The bytes for deviceName to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      deviceName_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int deviceId_ ;
    /**
     * <pre>
     * A debugger-generated ID for the device. Guaranteed to be unique within
     * the scope of the debugged TensorFlow program, including single-host and
     * multi-host settings.
     * TODO(cais): Test the uniqueness guarantee in multi-host settings.
     * </pre>
     *
     * <code>int32 device_id = 2;</code>
     * @return The deviceId.
     */
    @java.lang.Override
    public int getDeviceId() {
      return deviceId_;
    }
    /**
     * <pre>
     * A debugger-generated ID for the device. Guaranteed to be unique within
     * the scope of the debugged TensorFlow program, including single-host and
     * multi-host settings.
     * TODO(cais): Test the uniqueness guarantee in multi-host settings.
     * </pre>
     *
     * <code>int32 device_id = 2;</code>
     * @param value The deviceId to set.
     * @return This builder for chaining.
     */
    public Builder setDeviceId(int value) {

      deviceId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * A debugger-generated ID for the device. Guaranteed to be unique within
     * the scope of the debugged TensorFlow program, including single-host and
     * multi-host settings.
     * TODO(cais): Test the uniqueness guarantee in multi-host settings.
     * </pre>
     *
     * <code>int32 device_id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearDeviceId() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deviceId_ = 0;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:tensorflow.DebuggedDevice)
  }

  // @@protoc_insertion_point(class_scope:tensorflow.DebuggedDevice)
  private static final org.tensorflow.util.DebuggedDevice DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new org.tensorflow.util.DebuggedDevice();
  }

  public static org.tensorflow.util.DebuggedDevice getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DebuggedDevice>
      PARSER = new com.google.protobuf.AbstractParser<DebuggedDevice>() {
    @java.lang.Override
    public DebuggedDevice parsePartialFrom(
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

  public static com.google.protobuf.Parser<DebuggedDevice> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DebuggedDevice> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public org.tensorflow.util.DebuggedDevice getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

