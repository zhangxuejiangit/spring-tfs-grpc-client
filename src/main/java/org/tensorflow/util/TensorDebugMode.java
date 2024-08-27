// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/protobuf/debug_event.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.util;

/**
 * <pre>
 * Available modes for extracting debugging information from a Tensor.
 * TODO(cais): Document the detailed column names and semantics in a separate
 * markdown file once the implementation settles.
 * </pre>
 *
 * Protobuf enum {@code tensorflow.TensorDebugMode}
 */
public enum TensorDebugMode
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  UNSPECIFIED(0),
  /**
   * <pre>
   * Only records what tensors are computed, eagerly or in graphs.
   * No information regarding the value of the tensor is available.
   * </pre>
   *
   * <code>NO_TENSOR = 1;</code>
   */
  NO_TENSOR(1),
  /**
   * <pre>
   * A minimalist health summary for float-type tensors.
   * Contains information only about the presence/absence of pathological
   * values including Infinity and NaN.
   * Applicable only to float dtypes.
   * </pre>
   *
   * <code>CURT_HEALTH = 2;</code>
   */
  CURT_HEALTH(2),
  /**
   * <pre>
   * A concise health summary for float-type tensors.
   * Contains more information that CURT_HEALTH.
   * Infinity and NaN are treated differently.
   * Applicable only to float and integer dtypes.
   * </pre>
   *
   * <code>CONCISE_HEALTH = 3;</code>
   */
  CONCISE_HEALTH(3),
  /**
   * <pre>
   * A detailed health summary.
   * Contains further detailed information than `CONCISE_HEALTH`.
   * Information about device, dtype and shape are included.
   * Counts for various types of values (Infinity, NaN, negative, zero,
   * positive) are included.
   * Applicable to float, integer and boolean dtypes.
   * </pre>
   *
   * <code>FULL_HEALTH = 4;</code>
   */
  FULL_HEALTH(4),
  /**
   * <pre>
   * Provides full runtime shape information, up to a maximum rank, beyond
   * which the dimension sizes are truncated.
   * </pre>
   *
   * <code>SHAPE = 5;</code>
   */
  SHAPE(5),
  /**
   * <pre>
   * Full numeric summary.
   * Including device, dtype, shape, counts of various types of values
   * (Infinity, NaN, negative, zero, positive), and summary statistics
   * (minimum, maximum, mean and variance).
   * Applicable to float, integer and boolean dtypes.
   * </pre>
   *
   * <code>FULL_NUMERICS = 6;</code>
   */
  FULL_NUMERICS(6),
  /**
   * <pre>
   * Full tensor value.
   * </pre>
   *
   * <code>FULL_TENSOR = 7;</code>
   */
  FULL_TENSOR(7),
  /**
   * <pre>
   * Reduce the elements of a tensor to a rank-1 tensor of shape [3], in which
   * - the 1st element is -inf if any element of the tensor is -inf,
   * or zero otherwise.
   * - the 2nd element is +inf if any element of the tensor is +inf,
   * or zero otherwise.
   * - the 3rd element is nan if any element of the tensor is nan, or zero
   * otherwise.
   * </pre>
   *
   * <code>REDUCE_INF_NAN_THREE_SLOTS = 8;</code>
   */
  REDUCE_INF_NAN_THREE_SLOTS(8),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      TensorDebugMode.class.getName());
  }
  /**
   * <code>UNSPECIFIED = 0;</code>
   */
  public static final int UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * Only records what tensors are computed, eagerly or in graphs.
   * No information regarding the value of the tensor is available.
   * </pre>
   *
   * <code>NO_TENSOR = 1;</code>
   */
  public static final int NO_TENSOR_VALUE = 1;
  /**
   * <pre>
   * A minimalist health summary for float-type tensors.
   * Contains information only about the presence/absence of pathological
   * values including Infinity and NaN.
   * Applicable only to float dtypes.
   * </pre>
   *
   * <code>CURT_HEALTH = 2;</code>
   */
  public static final int CURT_HEALTH_VALUE = 2;
  /**
   * <pre>
   * A concise health summary for float-type tensors.
   * Contains more information that CURT_HEALTH.
   * Infinity and NaN are treated differently.
   * Applicable only to float and integer dtypes.
   * </pre>
   *
   * <code>CONCISE_HEALTH = 3;</code>
   */
  public static final int CONCISE_HEALTH_VALUE = 3;
  /**
   * <pre>
   * A detailed health summary.
   * Contains further detailed information than `CONCISE_HEALTH`.
   * Information about device, dtype and shape are included.
   * Counts for various types of values (Infinity, NaN, negative, zero,
   * positive) are included.
   * Applicable to float, integer and boolean dtypes.
   * </pre>
   *
   * <code>FULL_HEALTH = 4;</code>
   */
  public static final int FULL_HEALTH_VALUE = 4;
  /**
   * <pre>
   * Provides full runtime shape information, up to a maximum rank, beyond
   * which the dimension sizes are truncated.
   * </pre>
   *
   * <code>SHAPE = 5;</code>
   */
  public static final int SHAPE_VALUE = 5;
  /**
   * <pre>
   * Full numeric summary.
   * Including device, dtype, shape, counts of various types of values
   * (Infinity, NaN, negative, zero, positive), and summary statistics
   * (minimum, maximum, mean and variance).
   * Applicable to float, integer and boolean dtypes.
   * </pre>
   *
   * <code>FULL_NUMERICS = 6;</code>
   */
  public static final int FULL_NUMERICS_VALUE = 6;
  /**
   * <pre>
   * Full tensor value.
   * </pre>
   *
   * <code>FULL_TENSOR = 7;</code>
   */
  public static final int FULL_TENSOR_VALUE = 7;
  /**
   * <pre>
   * Reduce the elements of a tensor to a rank-1 tensor of shape [3], in which
   * - the 1st element is -inf if any element of the tensor is -inf,
   * or zero otherwise.
   * - the 2nd element is +inf if any element of the tensor is +inf,
   * or zero otherwise.
   * - the 3rd element is nan if any element of the tensor is nan, or zero
   * otherwise.
   * </pre>
   *
   * <code>REDUCE_INF_NAN_THREE_SLOTS = 8;</code>
   */
  public static final int REDUCE_INF_NAN_THREE_SLOTS_VALUE = 8;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TensorDebugMode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TensorDebugMode forNumber(int value) {
    switch (value) {
      case 0: return UNSPECIFIED;
      case 1: return NO_TENSOR;
      case 2: return CURT_HEALTH;
      case 3: return CONCISE_HEALTH;
      case 4: return FULL_HEALTH;
      case 5: return SHAPE;
      case 6: return FULL_NUMERICS;
      case 7: return FULL_TENSOR;
      case 8: return REDUCE_INF_NAN_THREE_SLOTS;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TensorDebugMode>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      TensorDebugMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<TensorDebugMode>() {
          public TensorDebugMode findValueByNumber(int number) {
            return TensorDebugMode.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return org.tensorflow.util.DebugEventProtos.getDescriptor().getEnumTypes().get(0);
  }

  private static final TensorDebugMode[] VALUES = values();

  public static TensorDebugMode valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TensorDebugMode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:tensorflow.TensorDebugMode)
}

