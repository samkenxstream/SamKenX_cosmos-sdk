//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/params/v1beta1/query.proto

package cosmos.params.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryParamsRequest(block: cosmos.params.v1beta1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest =
  cosmos.params.v1beta1.QueryParamsRequestKt.Dsl._create(cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest.newBuilder()).apply { block() }._build()
public object QueryParamsRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest = _builder.build()

    /**
     * <pre>
     * subspace defines the module to query the parameter for.
     * </pre>
     *
     * <code>string subspace = 1 [json_name = "subspace"];</code>
     */
    public var subspace: kotlin.String
      @JvmName("getSubspace")
      get() = _builder.getSubspace()
      @JvmName("setSubspace")
      set(value) {
        _builder.setSubspace(value)
      }
    /**
     * <pre>
     * subspace defines the module to query the parameter for.
     * </pre>
     *
     * <code>string subspace = 1 [json_name = "subspace"];</code>
     */
    public fun clearSubspace() {
      _builder.clearSubspace()
    }

    /**
     * <pre>
     * key defines the key of the parameter in the subspace.
     * </pre>
     *
     * <code>string key = 2 [json_name = "key"];</code>
     */
    public var key: kotlin.String
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <pre>
     * key defines the key of the parameter in the subspace.
     * </pre>
     *
     * <code>string key = 2 [json_name = "key"];</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest.copy(block: cosmos.params.v1beta1.QueryParamsRequestKt.Dsl.() -> kotlin.Unit): cosmos.params.v1beta1.QueryOuterClass.QueryParamsRequest =
  cosmos.params.v1beta1.QueryParamsRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
