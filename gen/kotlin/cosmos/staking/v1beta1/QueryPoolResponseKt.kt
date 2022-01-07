//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryPoolResponse(block: cosmos.staking.v1beta1.QueryPoolResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse =
  cosmos.staking.v1beta1.QueryPoolResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse.newBuilder()).apply { block() }._build()
public object QueryPoolResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse = _builder.build()

    /**
     * <pre>
     * pool defines the pool info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     */
    public var pool: cosmos.staking.v1beta1.Staking.Pool
      @JvmName("getPool")
      get() = _builder.getPool()
      @JvmName("setPool")
      set(value) {
        _builder.setPool(value)
      }
    /**
     * <pre>
     * pool defines the pool info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     */
    public fun clearPool() {
      _builder.clearPool()
    }
    /**
     * <pre>
     * pool defines the pool info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Pool pool = 1 [json_name = "pool", (.gogoproto.nullable) = false];</code>
     * @return Whether the pool field is set.
     */
    public fun hasPool(): kotlin.Boolean {
      return _builder.hasPool()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse.copy(block: cosmos.staking.v1beta1.QueryPoolResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryPoolResponse =
  cosmos.staking.v1beta1.QueryPoolResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
