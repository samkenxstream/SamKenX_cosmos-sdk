//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/tx/v1beta1/service.proto

package cosmos.tx.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getTxRequest(block: cosmos.tx.v1beta1.GetTxRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest =
  cosmos.tx.v1beta1.GetTxRequestKt.Dsl._create(cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest.newBuilder()).apply { block() }._build()
public object GetTxRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest = _builder.build()

    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1 [json_name = "hash"];</code>
     */
    public var hash: kotlin.String
      @JvmName("getHash")
      get() = _builder.getHash()
      @JvmName("setHash")
      set(value) {
        _builder.setHash(value)
      }
    /**
     * <pre>
     * hash is the tx hash to query, encoded as a hex string.
     * </pre>
     *
     * <code>string hash = 1 [json_name = "hash"];</code>
     */
    public fun clearHash() {
      _builder.clearHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest.copy(block: cosmos.tx.v1beta1.GetTxRequestKt.Dsl.() -> kotlin.Unit): cosmos.tx.v1beta1.ServiceOuterClass.GetTxRequest =
  cosmos.tx.v1beta1.GetTxRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
