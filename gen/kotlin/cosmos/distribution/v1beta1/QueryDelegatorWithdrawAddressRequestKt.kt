//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/query.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDelegatorWithdrawAddressRequest(block: cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequestKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest =
  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequestKt.Dsl._create(cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest.newBuilder()).apply { block() }._build()
public object QueryDelegatorWithdrawAddressRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest = _builder.build()

    /**
     * <pre>
     * delegator_address defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var delegatorAddress: kotlin.String
      @JvmName("getDelegatorAddress")
      get() = _builder.getDelegatorAddress()
      @JvmName("setDelegatorAddress")
      set(value) {
        _builder.setDelegatorAddress(value)
      }
    /**
     * <pre>
     * delegator_address defines the delegator address to query for.
     * </pre>
     *
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest.copy(block: cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequestKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.QueryOuterClass.QueryDelegatorWithdrawAddressRequest =
  cosmos.distribution.v1beta1.QueryDelegatorWithdrawAddressRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
