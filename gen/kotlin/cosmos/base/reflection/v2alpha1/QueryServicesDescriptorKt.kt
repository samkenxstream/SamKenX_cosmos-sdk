//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun queryServicesDescriptor(block: cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor =
  cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.newBuilder()).apply { block() }._build()
public object QueryServicesDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class QueryServicesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     */
     public val queryServices: com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getQueryServicesList()
      )
    /**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     * @param value The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addQueryServices")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.add(value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      _builder.addQueryServices(value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     * @param value The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignQueryServices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.plusAssign(value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      add(value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     * @param values The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllQueryServices")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor>) {
      _builder.addAllQueryServices(values)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     * @param values The queryServices to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllQueryServices")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor>) {
      addAll(values)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     * @param index The index to set the value at.
     * @param value The queryServices to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setQueryServices")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.set(index: kotlin.Int, value: cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor) {
      _builder.setQueryServices(index, value)
    }/**
     * <pre>
     * query_services is a list of cosmos-sdk QueryServiceDescriptor
     * </pre>
     *
     * <code>repeated .cosmos.base.reflection.v2alpha1.QueryServiceDescriptor query_services = 1 [json_name = "queryServices"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearQueryServices")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.reflection.v2alpha1.Reflection.QueryServiceDescriptor, QueryServicesProxy>.clear() {
      _builder.clearQueryServices()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor.copy(block: cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.QueryServicesDescriptor =
  cosmos.base.reflection.v2alpha1.QueryServicesDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
