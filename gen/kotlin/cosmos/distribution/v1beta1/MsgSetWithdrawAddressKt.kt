//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgSetWithdrawAddress(block: cosmos.distribution.v1beta1.MsgSetWithdrawAddressKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress =
  cosmos.distribution.v1beta1.MsgSetWithdrawAddressKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress.newBuilder()).apply { block() }._build()
public object MsgSetWithdrawAddressKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress = _builder.build()

    /**
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
     * <code>string delegator_address = 1 [json_name = "delegatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearDelegatorAddress() {
      _builder.clearDelegatorAddress()
    }

    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var withdrawAddress: kotlin.String
      @JvmName("getWithdrawAddress")
      get() = _builder.getWithdrawAddress()
      @JvmName("setWithdrawAddress")
      set(value) {
        _builder.setWithdrawAddress(value)
      }
    /**
     * <code>string withdraw_address = 2 [json_name = "withdrawAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearWithdrawAddress() {
      _builder.clearWithdrawAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress.copy(block: cosmos.distribution.v1beta1.MsgSetWithdrawAddressKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgSetWithdrawAddress =
  cosmos.distribution.v1beta1.MsgSetWithdrawAddressKt.Dsl._create(this.toBuilder()).apply { block() }._build()
