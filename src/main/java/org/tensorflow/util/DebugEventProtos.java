// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/protobuf/debug_event.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.util;

public final class DebugEventProtos {
  private DebugEventProtos() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 3,
      /* suffix= */ "",
      DebugEventProtos.class.getName());
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
    internal_static_tensorflow_DebugEvent_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_DebugEvent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebugMetadata_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_DebugMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_SourceFile_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_SourceFile_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StackFrameWithId_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_StackFrameWithId_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_CodeLocation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_CodeLocation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphOpCreation_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_GraphOpCreation_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedGraph_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_DebuggedGraph_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DebuggedDevice_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_DebuggedDevice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_Execution_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_Execution_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_GraphExecutionTrace_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n*tensorflow/core/protobuf/debug_event.p" +
      "roto\022\ntensorflow\0320tensorflow/core/framew" +
      "ork/graph_debug_info.proto\032&tensorflow/c" +
      "ore/framework/tensor.proto\"\376\003\n\nDebugEven" +
      "t\022\021\n\twall_time\030\001 \001(\001\022\014\n\004step\030\002 \001(\003\0223\n\016de" +
      "bug_metadata\030\003 \001(\0132\031.tensorflow.DebugMet" +
      "adataH\000\022-\n\013source_file\030\004 \001(\0132\026.tensorflo" +
      "w.SourceFileH\000\022;\n\023stack_frame_with_id\030\006 " +
      "\001(\0132\034.tensorflow.StackFrameWithIdH\000\0228\n\021g" +
      "raph_op_creation\030\007 \001(\0132\033.tensorflow.Grap" +
      "hOpCreationH\000\0223\n\016debugged_graph\030\010 \001(\0132\031." +
      "tensorflow.DebuggedGraphH\000\022*\n\texecution\030" +
      "\t \001(\0132\025.tensorflow.ExecutionH\000\022@\n\025graph_" +
      "execution_trace\030\n \001(\0132\037.tensorflow.Graph" +
      "ExecutionTraceH\000\022\022\n\010graph_id\030\013 \001(\tH\000\0225\n\017" +
      "debugged_device\030\014 \001(\0132\032.tensorflow.Debug" +
      "gedDeviceH\000B\006\n\004what\"W\n\rDebugMetadata\022\032\n\022" +
      "tensorflow_version\030\001 \001(\t\022\024\n\014file_version" +
      "\030\002 \001(\t\022\024\n\014tfdbg_run_id\030\003 \001(\t\"A\n\nSourceFi" +
      "le\022\021\n\tfile_path\030\001 \001(\t\022\021\n\thost_name\030\002 \001(\t" +
      "\022\r\n\005lines\030\003 \003(\t\"]\n\020StackFrameWithId\022\n\n\002i" +
      "d\030\001 \001(\t\022=\n\rfile_line_col\030\002 \001(\0132&.tensorf" +
      "low.GraphDebugInfo.FileLineCol\":\n\014CodeLo" +
      "cation\022\021\n\thost_name\030\001 \001(\t\022\027\n\017stack_frame" +
      "_ids\030\002 \003(\t\"\344\001\n\017GraphOpCreation\022\017\n\007op_typ" +
      "e\030\001 \001(\t\022\017\n\007op_name\030\002 \001(\t\022\022\n\ngraph_name\030\003" +
      " \001(\t\022\020\n\010graph_id\030\004 \001(\t\022\023\n\013device_name\030\005 " +
      "\001(\t\022\023\n\013input_names\030\006 \003(\t\022\023\n\013num_outputs\030" +
      "\007 \001(\005\022/\n\rcode_location\030\010 \001(\0132\030.tensorflo" +
      "w.CodeLocation\022\031\n\021output_tensor_ids\030\t \003(" +
      "\005\"\245\001\n\rDebuggedGraph\022\020\n\010graph_id\030\001 \001(\t\022\022\n" +
      "\ngraph_name\030\002 \001(\t\022\030\n\020instrumented_ops\030\003 " +
      "\003(\t\022\032\n\022original_graph_def\030\004 \001(\014\022\036\n\026instr" +
      "umented_graph_def\030\005 \001(\014\022\030\n\020outer_context" +
      "_id\030\006 \001(\t\"8\n\016DebuggedDevice\022\023\n\013device_na" +
      "me\030\001 \001(\t\022\021\n\tdevice_id\030\002 \001(\005\"\263\002\n\tExecutio" +
      "n\022\017\n\007op_type\030\001 \001(\t\022\023\n\013num_outputs\030\002 \001(\005\022" +
      "\020\n\010graph_id\030\003 \001(\t\022\030\n\020input_tensor_ids\030\004 " +
      "\003(\003\022\031\n\021output_tensor_ids\030\005 \003(\003\0226\n\021tensor" +
      "_debug_mode\030\006 \001(\0162\033.tensorflow.TensorDeb" +
      "ugMode\022.\n\rtensor_protos\030\007 \003(\0132\027.tensorfl" +
      "ow.TensorProto\022/\n\rcode_location\030\010 \001(\0132\030." +
      "tensorflow.CodeLocation\022 \n\030output_tensor" +
      "_device_ids\030\t \003(\005\"\321\001\n\023GraphExecutionTrac" +
      "e\022\030\n\020tfdbg_context_id\030\001 \001(\t\022\017\n\007op_name\030\002" +
      " \001(\t\022\023\n\013output_slot\030\003 \001(\005\0226\n\021tensor_debu" +
      "g_mode\030\004 \001(\0162\033.tensorflow.TensorDebugMod" +
      "e\022-\n\014tensor_proto\030\005 \001(\0132\027.tensorflow.Ten" +
      "sorProto\022\023\n\013device_name\030\006 \001(\t*\266\001\n\017Tensor" +
      "DebugMode\022\017\n\013UNSPECIFIED\020\000\022\r\n\tNO_TENSOR\020" +
      "\001\022\017\n\013CURT_HEALTH\020\002\022\022\n\016CONCISE_HEALTH\020\003\022\017" +
      "\n\013FULL_HEALTH\020\004\022\t\n\005SHAPE\020\005\022\021\n\rFULL_NUMER" +
      "ICS\020\006\022\017\n\013FULL_TENSOR\020\007\022\036\n\032REDUCE_INF_NAN" +
      "_THREE_SLOTS\020\010B\203\001\n\023org.tensorflow.utilB\020" +
      "DebugEventProtosP\001ZUgithub.com/tensorflo" +
      "w/tensorflow/tensorflow/go/core/protobuf" +
      "/for_core_protos_go_proto\370\001\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.framework.GraphDebugInfoProtos.getDescriptor(),
          org.tensorflow.framework.TensorProtos.getDescriptor(),
        });
    internal_static_tensorflow_DebugEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_DebugEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_DebugEvent_descriptor,
        new java.lang.String[] { "WallTime", "Step", "DebugMetadata", "SourceFile", "StackFrameWithId", "GraphOpCreation", "DebuggedGraph", "Execution", "GraphExecutionTrace", "GraphId", "DebuggedDevice", "What", });
    internal_static_tensorflow_DebugMetadata_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_DebugMetadata_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_DebugMetadata_descriptor,
        new java.lang.String[] { "TensorflowVersion", "FileVersion", "TfdbgRunId", });
    internal_static_tensorflow_SourceFile_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_SourceFile_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_SourceFile_descriptor,
        new java.lang.String[] { "FilePath", "HostName", "Lines", });
    internal_static_tensorflow_StackFrameWithId_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_StackFrameWithId_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_StackFrameWithId_descriptor,
        new java.lang.String[] { "Id", "FileLineCol", });
    internal_static_tensorflow_CodeLocation_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_CodeLocation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_CodeLocation_descriptor,
        new java.lang.String[] { "HostName", "StackFrameIds", });
    internal_static_tensorflow_GraphOpCreation_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_GraphOpCreation_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_GraphOpCreation_descriptor,
        new java.lang.String[] { "OpType", "OpName", "GraphName", "GraphId", "DeviceName", "InputNames", "NumOutputs", "CodeLocation", "OutputTensorIds", });
    internal_static_tensorflow_DebuggedGraph_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_DebuggedGraph_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_DebuggedGraph_descriptor,
        new java.lang.String[] { "GraphId", "GraphName", "InstrumentedOps", "OriginalGraphDef", "InstrumentedGraphDef", "OuterContextId", });
    internal_static_tensorflow_DebuggedDevice_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_DebuggedDevice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_DebuggedDevice_descriptor,
        new java.lang.String[] { "DeviceName", "DeviceId", });
    internal_static_tensorflow_Execution_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_Execution_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_Execution_descriptor,
        new java.lang.String[] { "OpType", "NumOutputs", "GraphId", "InputTensorIds", "OutputTensorIds", "TensorDebugMode", "TensorProtos", "CodeLocation", "OutputTensorDeviceIds", });
    internal_static_tensorflow_GraphExecutionTrace_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_GraphExecutionTrace_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_tensorflow_GraphExecutionTrace_descriptor,
        new java.lang.String[] { "TfdbgContextId", "OpName", "OutputSlot", "TensorDebugMode", "TensorProto", "DeviceName", });
    descriptor.resolveAllFeaturesImmutable();
    org.tensorflow.framework.GraphDebugInfoProtos.getDescriptor();
    org.tensorflow.framework.TensorProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
