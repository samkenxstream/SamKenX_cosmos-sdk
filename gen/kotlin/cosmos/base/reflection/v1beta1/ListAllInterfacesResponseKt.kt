//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v1beta1/reflection.proto

package cosmos.base.reflection.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun listAllInterfacesResponse(block: cosmos.base.reflection.v1beta1.ListAllInterfacesResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse =
  cosmos.base.reflection.v1beta1.ListAllInterfacesResponseKt.Dsl._create(cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse.newBuilder()).apply { block() }._build()
public object ListAllInterfacesResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class InterfaceNamesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @return A list containing the interfaceNames.
     */
    public val interfaceNames: com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getInterfaceNamesList()
      )
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @param value The interfaceNames to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addInterfaceNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.add(value: kotlin.String) {
      _builder.addInterfaceNames(value)
    }
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @param value The interfaceNames to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignInterfaceNames")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.plusAssign(value: kotlin.String) {
      add(value)
    }
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @param values The interfaceNames to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllInterfaceNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.addAll(values: kotlin.collections.Iterable<kotlin.String>) {
      _builder.addAllInterfaceNames(values)
    }
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @param values The interfaceNames to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllInterfaceNames")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.plusAssign(values: kotlin.collections.Iterable<kotlin.String>) {
      addAll(values)
    }
    /**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     * @param index The index to set the value at.
     * @param value The interfaceNames to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setInterfaceNames")
    public operator fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.set(index: kotlin.Int, value: kotlin.String) {
      _builder.setInterfaceNames(index, value)
    }/**
     * <pre>
     * interface_names is an array of all the registered interfaces.
     * </pre>
     *
     * <code>repeated string interface_names = 1 [json_name = "interfaceNames"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearInterfaceNames")
    public fun com.google.protobuf.kotlin.DslList<kotlin.String, InterfaceNamesProxy>.clear() {
      _builder.clearInterfaceNames()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse.copy(block: cosmos.base.reflection.v1beta1.ListAllInterfacesResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v1beta1.Reflection.ListAllInterfacesResponse =
  cosmos.base.reflection.v1beta1.ListAllInterfacesResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
