//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/tx.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgFundCommunityPoolResponse(block: cosmos.distribution.v1beta1.MsgFundCommunityPoolResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse =
  cosmos.distribution.v1beta1.MsgFundCommunityPoolResponseKt.Dsl._create(cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse.newBuilder()).apply { block() }._build()
public object MsgFundCommunityPoolResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse.copy(block: cosmos.distribution.v1beta1.MsgFundCommunityPoolResponseKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Tx.MsgFundCommunityPoolResponse =
  cosmos.distribution.v1beta1.MsgFundCommunityPoolResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
