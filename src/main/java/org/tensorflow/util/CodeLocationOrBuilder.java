// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: tensorflow/core/protobuf/debug_event.proto
// Protobuf Java Version: 4.27.3

package org.tensorflow.util;

public interface CodeLocationOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.CodeLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Host name on which the source files are located.
   * </pre>
   *
   * <code>string host_name = 1;</code>
   * @return The hostName.
   */
  java.lang.String getHostName();
  /**
   * <pre>
   * Host name on which the source files are located.
   * </pre>
   *
   * <code>string host_name = 1;</code>
   * @return The bytes for hostName.
   */
  com.google.protobuf.ByteString
      getHostNameBytes();

  /**
   * <pre>
   * ID to a stack frame, each of which is pointed to
   * by a unique ID. The ordering of the frames is consistent with Python's
   * `traceback.extract_tb()`.
   * </pre>
   *
   * <code>repeated string stack_frame_ids = 2;</code>
   * @return A list containing the stackFrameIds.
   */
  java.util.List<java.lang.String>
      getStackFrameIdsList();
  /**
   * <pre>
   * ID to a stack frame, each of which is pointed to
   * by a unique ID. The ordering of the frames is consistent with Python's
   * `traceback.extract_tb()`.
   * </pre>
   *
   * <code>repeated string stack_frame_ids = 2;</code>
   * @return The count of stackFrameIds.
   */
  int getStackFrameIdsCount();
  /**
   * <pre>
   * ID to a stack frame, each of which is pointed to
   * by a unique ID. The ordering of the frames is consistent with Python's
   * `traceback.extract_tb()`.
   * </pre>
   *
   * <code>repeated string stack_frame_ids = 2;</code>
   * @param index The index of the element to return.
   * @return The stackFrameIds at the given index.
   */
  java.lang.String getStackFrameIds(int index);
  /**
   * <pre>
   * ID to a stack frame, each of which is pointed to
   * by a unique ID. The ordering of the frames is consistent with Python's
   * `traceback.extract_tb()`.
   * </pre>
   *
   * <code>repeated string stack_frame_ids = 2;</code>
   * @param index The index of the value to return.
   * @return The bytes of the stackFrameIds at the given index.
   */
  com.google.protobuf.ByteString
      getStackFrameIdsBytes(int index);
}
