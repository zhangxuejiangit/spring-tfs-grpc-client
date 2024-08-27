// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/example/feature.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.example;

public final class FeatureProtos {
  private FeatureProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      FeatureProtos.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BytesList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_BytesList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FloatList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_FloatList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Int64List_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_Int64List_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Feature_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_Feature_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Features_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_Features_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Features_FeatureEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_Features_FeatureEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_FeatureList_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureLists_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_FeatureLists_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_FeatureLists_FeatureListEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%tensorflow/core/example/feature.proto\022" +
      "\ntensorflow\"\032\n\tBytesList\022\r\n\005value\030\001 \003(\014\"" +
      "\036\n\tFloatList\022\021\n\005value\030\001 \003(\002B\002\020\001\"\036\n\tInt64" +
      "List\022\021\n\005value\030\001 \003(\003B\002\020\001\"\230\001\n\007Feature\022+\n\nb" +
      "ytes_list\030\001 \001(\0132\025.tensorflow.BytesListH\000" +
      "\022+\n\nfloat_list\030\002 \001(\0132\025.tensorflow.FloatL" +
      "istH\000\022+\n\nint64_list\030\003 \001(\0132\025.tensorflow.I" +
      "nt64ListH\000B\006\n\004kind\"\203\001\n\010Features\0222\n\007featu" +
      "re\030\001 \003(\0132!.tensorflow.Features.FeatureEn" +
      "try\032C\n\014FeatureEntry\022\013\n\003key\030\001 \001(\t\022\"\n\005valu" +
      "e\030\002 \001(\0132\023.tensorflow.Feature:\0028\001\"3\n\013Feat" +
      "ureList\022$\n\007feature\030\001 \003(\0132\023.tensorflow.Fe" +
      "ature\"\234\001\n\014FeatureLists\022?\n\014feature_list\030\001" +
      " \003(\0132).tensorflow.FeatureLists.FeatureLi" +
      "stEntry\032K\n\020FeatureListEntry\022\013\n\003key\030\001 \001(\t" +
      "\022&\n\005value\030\002 \001(\0132\027.tensorflow.FeatureList" +
      ":\0028\001B\201\001\n\026org.tensorflow.exampleB\rFeature" +
      "ProtosP\001ZSgithub.com/tensorflow/tensorfl" +
      "ow/tensorflow/go/core/example/example_pr" +
      "otos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tensorflow_BytesList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_BytesList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_BytesList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_FloatList_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_FloatList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_FloatList_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_Int64List_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_Int64List_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_Int64List_descriptor,
        new java.lang.String[] { "Value", });
    internal_static_tensorflow_Feature_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_Feature_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_Feature_descriptor,
        new java.lang.String[] { "BytesList", "FloatList", "Int64List", "Kind", });
    internal_static_tensorflow_Features_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_Features_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_Features_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_tensorflow_Features_FeatureEntry_descriptor =
      internal_static_tensorflow_Features_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_Features_FeatureEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_Features_FeatureEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_FeatureList_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_FeatureList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_FeatureList_descriptor,
        new java.lang.String[] { "Feature", });
    internal_static_tensorflow_FeatureLists_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_FeatureLists_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_FeatureLists_descriptor,
        new java.lang.String[] { "FeatureList", });
    internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor =
      internal_static_tensorflow_FeatureLists_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_FeatureLists_FeatureListEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_FeatureLists_FeatureListEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
