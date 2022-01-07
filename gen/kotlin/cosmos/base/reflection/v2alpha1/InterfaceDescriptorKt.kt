//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun interfaceDescriptor(block: cosmos.base.reflection.v2alpha1.InterfaceDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor =
  cosmos.base.reflection.v2alpha1.InterfaceDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor.newBuilder()).apply { block() }._build()
public object InterfaceDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor = _builder.build()

    /**
     * <pre>
     * fullname is the name of the interface
     * </pre>
     *
     * <code>string fullname = 1 [json_name = "fullname"];</code>
     */
    public var fullname: kotlin.String
      @JvmName("getFullname")
      get() = _builder.getFullname()
      @JvmName("setFullname")
      set(value) {
        _builder.setFullname(value)
      }
    /**
     * <pre>
     * fullname is the name of the interface
     * </pre>
     *
     * <code>string fullname = 1 [json_name = "fullname"];</code>
     */
    public fun clearFullname() {
      _builder.clearFullname()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InterfaceAcceptingMessagesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     */
     public val interfaceAcceptingMessages: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInterfaceAcceptingMessagesList()
      )
    /**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     * @param value The interfaceAcceptingMessages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInterfaceAcceptingMessages")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor) {
      _builder.addInterfaceAcceptingMessages(value)
    }/**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     * @param value The interfaceAcceptingMessages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInterfaceAcceptingMessages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor) {
      add(value)
    }/**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     * @param values The interfaceAcceptingMessages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInterfaceAcceptingMessages")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor>) {
      _builder.addAllInterfaceAcceptingMessages(values)
    }/**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     * @param values The interfaceAcceptingMessages to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInterfaceAcceptingMessages")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     * @param index The index to set the value at.
     * @param value The interfaceAcceptingMessages to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInterfaceAcceptingMessages")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor) {
      _builder.setInterfaceAcceptingMessages(index, value)
    }/**
     * <pre>
     * interface_accepting_messages contains information regarding the proto messages which contain the interface as
     * google.protobuf.Any field
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceAcceptingMessageDescriptor interface_accepting_messages = 2 [json_name = "interfaceAcceptingMessages"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInterfaceAcceptingMessages")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceAcceptingMessageDescriptor, InterfaceAcceptingMessagesProxy>.clear() {
      _builder.clearInterfaceAcceptingMessages()
    }
    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InterfaceImplementersProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     */
     public val interfaceImplementers: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInterfaceImplementersList()
      )
    /**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     * @param value The interfaceImplementers to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInterfaceImplementers")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor) {
      _builder.addInterfaceImplementers(value)
    }/**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     * @param value The interfaceImplementers to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInterfaceImplementers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor) {
      add(value)
    }/**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     * @param values The interfaceImplementers to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInterfaceImplementers")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor>) {
      _builder.addAllInterfaceImplementers(values)
    }/**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     * @param values The interfaceImplementers to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInterfaceImplementers")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     * @param index The index to set the value at.
     * @param value The interfaceImplementers to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInterfaceImplementers")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor) {
      _builder.setInterfaceImplementers(index, value)
    }/**
     * <pre>
     * interface_implementers is a list of the descriptors of the interface implementers
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.InterfaceImplementerDescriptor interface_implementers = 3 [json_name = "interfaceImplementers"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInterfaceImplementers")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.InterfaceImplementerDescriptor, InterfaceImplementersProxy>.clear() {
      _builder.clearInterfaceImplementers()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor.copy(block: cosmos.base.reflection.v2alpha1.InterfaceDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.InterfaceDescriptor =
  cosmos.base.reflection.v2alpha1.InterfaceDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
