//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/abci/v1beta1/abci.proto

package cosmos.base.abci.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgData(block: cosmos.base.abci.v1beta1.MsgDataKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.MsgData =
  cosmos.base.abci.v1beta1.MsgDataKt.Dsl._create(cosmos.base.abci.v1beta1.Abci.MsgData.newBuilder()).apply { block() }._build()
public object MsgDataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.abci.v1beta1.Abci.MsgData.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.abci.v1beta1.Abci.MsgData.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.abci.v1beta1.Abci.MsgData = _builder.build()

    /**
     * <code>string msg_type = 1 [json_name = "msgType"];</code>
     */
    public var msgType: kotlin.String
      @JvmName("getMsgType")
      get() = _builder.getMsgType()
      @JvmName("setMsgType")
      set(value) {
        _builder.setMsgType(value)
      }
    /**
     * <code>string msg_type = 1 [json_name = "msgType"];</code>
     */
    public fun clearMsgType() {
      _builder.clearMsgType()
    }

    /**
     * <code>bytes data = 2 [json_name = "data"];</code>
     */
    public var data: com.google.protobuf.ByteString
      @JvmName("getData")
      get() = _builder.getData()
      @JvmName("setData")
      set(value) {
        _builder.setData(value)
      }
    /**
     * <code>bytes data = 2 [json_name = "data"];</code>
     */
    public fun clearData() {
      _builder.clearData()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.abci.v1beta1.Abci.MsgData.copy(block: cosmos.base.abci.v1beta1.MsgDataKt.Dsl.() -> kotlin.Unit): cosmos.base.abci.v1beta1.Abci.MsgData =
  cosmos.base.abci.v1beta1.MsgDataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
