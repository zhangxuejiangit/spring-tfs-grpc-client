// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/example/example_parser_configuration.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.example;

public interface FeatureConfigurationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.FeatureConfiguration)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return Whether the fixedLenFeature field is set.
   */
  boolean hasFixedLenFeature();
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   * @return The fixedLenFeature.
   */
  org.tensorflow.example.FixedLenFeatureProto getFixedLenFeature();
  /**
   * <code>.tensorflow.FixedLenFeatureProto fixed_len_feature = 1;</code>
   */
  org.tensorflow.example.FixedLenFeatureProtoOrBuilder getFixedLenFeatureOrBuilder();

  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return Whether the varLenFeature field is set.
   */
  boolean hasVarLenFeature();
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   * @return The varLenFeature.
   */
  org.tensorflow.example.VarLenFeatureProto getVarLenFeature();
  /**
   * <code>.tensorflow.VarLenFeatureProto var_len_feature = 2;</code>
   */
  org.tensorflow.example.VarLenFeatureProtoOrBuilder getVarLenFeatureOrBuilder();

  org.tensorflow.example.FeatureConfiguration.ConfigCase getConfigCase();
}
