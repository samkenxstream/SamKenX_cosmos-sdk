//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/tx.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgUndelegateResponse(block: cosmos.staking.v1beta1.MsgUndelegateResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgUndelegateResponse =
  cosmos.staking.v1beta1.MsgUndelegateResponseKt.Dsl._create(cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.newBuilder()).apply { block() }._build()
public object MsgUndelegateResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Tx.MsgUndelegateResponse = _builder.build()

    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var completionTime: com.google.protobuf.Timestamp
      @JvmName("getCompletionTime")
      get() = _builder.getCompletionTime()
      @JvmName("setCompletionTime")
      set(value) {
        _builder.setCompletionTime(value)
      }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearCompletionTime() {
      _builder.clearCompletionTime()
    }
    /**
     * <code>.google.protobuf.Timestamp completion_time = 1 [json_name = "completionTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the completionTime field is set.
     */
    public fun hasCompletionTime(): kotlin.Boolean {
      return _builder.hasCompletionTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Tx.MsgUndelegateResponse.copy(block: cosmos.staking.v1beta1.MsgUndelegateResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Tx.MsgUndelegateResponse =
  cosmos.staking.v1beta1.MsgUndelegateResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
