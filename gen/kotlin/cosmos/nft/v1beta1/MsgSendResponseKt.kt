//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/tx.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgSendResponse(block: cosmos.nft.v1beta1.MsgSendResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Tx.MsgSendResponse =
  cosmos.nft.v1beta1.MsgSendResponseKt.Dsl._create(cosmos.nft.v1beta1.Tx.MsgSendResponse.newBuilder()).apply { block() }._build()
public object MsgSendResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Tx.MsgSendResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Tx.MsgSendResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Tx.MsgSendResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Tx.MsgSendResponse.copy(block: cosmos.nft.v1beta1.MsgSendResponseKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Tx.MsgSendResponse =
  cosmos.nft.v1beta1.MsgSendResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
