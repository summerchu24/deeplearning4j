// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/framework/device_attributes.proto

package org.tensorflow.framework;

public final class DeviceAttributesProtos {
  private DeviceAttributesProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceLocality_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DeviceLocality_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DeviceAttributes_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DeviceAttributes_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n1tensorflow/core/framework/device_attri" +
      "butes.proto\022\ntensorflow\" \n\016DeviceLocalit" +
      "y\022\016\n\006bus_id\030\001 \001(\005\"\254\001\n\020DeviceAttributes\022\014" +
      "\n\004name\030\001 \001(\t\022\023\n\013device_type\030\002 \001(\t\022\024\n\014mem" +
      "ory_limit\030\004 \001(\003\022,\n\010locality\030\005 \001(\0132\032.tens" +
      "orflow.DeviceLocality\022\023\n\013incarnation\030\006 \001" +
      "(\006\022\034\n\024physical_device_desc\030\007 \001(\tB7\n\030org." +
      "tensorflow.frameworkB\026DeviceAttributesPr" +
      "otosP\001\370\001\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_tensorflow_DeviceLocality_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_DeviceLocality_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DeviceLocality_descriptor,
        new String[] { "BusId", });
    internal_static_tensorflow_DeviceAttributes_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_DeviceAttributes_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DeviceAttributes_descriptor,
        new String[] { "Name", "DeviceType", "MemoryLimit", "Locality", "Incarnation", "PhysicalDeviceDesc", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
