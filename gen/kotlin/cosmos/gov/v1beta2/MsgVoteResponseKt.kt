//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta2/tx.proto

package cosmos.gov.v1beta2;

@kotlin.jvm.JvmSynthetic
public inline fun msgVoteResponse(block: cosmos.gov.v1beta2.MsgVoteResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.Tx.MsgVoteResponse =
  cosmos.gov.v1beta2.MsgVoteResponseKt.Dsl._create(cosmos.gov.v1beta2.Tx.MsgVoteResponse.newBuilder()).apply { block() }._build()
public object MsgVoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta2.Tx.MsgVoteResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta2.Tx.MsgVoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta2.Tx.MsgVoteResponse = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta2.Tx.MsgVoteResponse.copy(block: cosmos.gov.v1beta2.MsgVoteResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.Tx.MsgVoteResponse =
  cosmos.gov.v1beta2.MsgVoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
