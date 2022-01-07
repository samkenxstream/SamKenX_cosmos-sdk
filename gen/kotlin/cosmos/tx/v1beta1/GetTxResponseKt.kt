//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getTxResponse(block: cosmos.tx.v1beta1.GetTxResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse =
  cosmos.tx.v1beta1.GetTxResponseKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.newBuilder()).apply { block() }._build()
public object GetTxResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse = _builder.build()

    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [json_name = "tx"];</code>
     */
    public var tx: cosmos.tx.v1beta1.TxOuterClass.Tx
      @JvmName("getTx")
      get() = _builder.getTx()
      @JvmName("setTx")
      set(value) {
        _builder.setTx(value)
      }
    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [json_name = "tx"];</code>
     */
    public fun clearTx() {
      _builder.clearTx()
    }
    /**
     * <pre>
     * tx is the queried transaction.
     * </pre>
     *
     * <code>.cosmos.tx.v1beta1.Tx tx = 1 [json_name = "tx"];</code>
     * @return Whether the tx field is set.
     */
    public fun hasTx(): kotlin.Boolean {
      return _builder.hasTx()
    }

    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2 [json_name = "txResponse"];</code>
     */
    public var txResponse: cosmos.base.abci.v1beta1.Abci.TxResponse
      @JvmName("getTxResponse")
      get() = _builder.getTxResponse()
      @JvmName("setTxResponse")
      set(value) {
        _builder.setTxResponse(value)
      }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2 [json_name = "txResponse"];</code>
     */
    public fun clearTxResponse() {
      _builder.clearTxResponse()
    }
    /**
     * <pre>
     * tx_response is the queried TxResponses.
     * </pre>
     *
     * <code>.cosmos.base.abci.v1beta1.TxResponse tx_response = 2 [json_name = "txResponse"];</code>
     * @return Whether the txResponse field is set.
     */
    public fun hasTxResponse(): kotlin.Boolean {
      return _builder.hasTxResponse()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse.copy(block: cosmos.tx.v1beta1.GetTxResponseKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxResponse =
  cosmos.tx.v1beta1.GetTxResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
