// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/tensor.proto

package org.tensorflow.framework;

public interface VariantTensorDataProtoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tensorflow.VariantTensorDataProto)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   */
  String getTypeName();
  /**
   * <pre>
   * Name of the type of objects being serialized.
   * </pre>
   *
   * <code>string type_name = 1;</code>
   */
  com.google.protobuf.ByteString
      getTypeNameBytes();

  /**
   * <pre>
   * Portions of the object that are not Tensors.
   * </pre>
   *
   * <code>bytes metadata = 2;</code>
   */
  com.google.protobuf.ByteString getMetadata();

  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  java.util.List<TensorProto>
      getTensorsList();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  TensorProto getTensors(int index);
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  int getTensorsCount();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  java.util.List<? extends TensorProtoOrBuilder>
      getTensorsOrBuilderList();
  /**
   * <pre>
   * Tensors contained within objects being serialized.
   * </pre>
   *
   * <code>repeated .tensorflow.TensorProto tensors = 3;</code>
   */
  TensorProtoOrBuilder getTensorsOrBuilder(
          int index);
}
