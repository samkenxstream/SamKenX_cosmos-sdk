//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/p2p/types.proto

package tendermint.p2p;

@kotlin.jvm.JvmSynthetic
public inline fun nodeInfoOther(block: tendermint.p2p.NodeInfoOtherKt.Dsl.() -> kotlin.Unit): tendermint.p2p.Types.NodeInfoOther =
  tendermint.p2p.NodeInfoOtherKt.Dsl._create(tendermint.p2p.Types.NodeInfoOther.newBuilder()).apply { block() }._build()
public object NodeInfoOtherKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.p2p.Types.NodeInfoOther.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.p2p.Types.NodeInfoOther.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.p2p.Types.NodeInfoOther = _builder.build()

    /**
     * <code>string tx_index = 1 [json_name = "txIndex"];</code>
     */
    public var txIndex: kotlin.String
      @JvmName("getTxIndex")
      get() = _builder.getTxIndex()
      @JvmName("setTxIndex")
      set(value) {
        _builder.setTxIndex(value)
      }
    /**
     * <code>string tx_index = 1 [json_name = "txIndex"];</code>
     */
    public fun clearTxIndex() {
      _builder.clearTxIndex()
    }

    /**
     * <code>string rpc_address = 2 [json_name = "rpcAddress", (.gogoproto.customname) = "RPCAddress"];</code>
     */
    public var rpcAddress: kotlin.String
      @JvmName("getRpcAddress")
      get() = _builder.getRpcAddress()
      @JvmName("setRpcAddress")
      set(value) {
        _builder.setRpcAddress(value)
      }
    /**
     * <code>string rpc_address = 2 [json_name = "rpcAddress", (.gogoproto.customname) = "RPCAddress"];</code>
     */
    public fun clearRpcAddress() {
      _builder.clearRpcAddress()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.p2p.Types.NodeInfoOther.copy(block: tendermint.p2p.NodeInfoOtherKt.Dsl.() -> kotlin.Unit): tendermint.p2p.Types.NodeInfoOther =
  tendermint.p2p.NodeInfoOtherKt.Dsl._create(this.toBuilder()).apply { block() }._build()
