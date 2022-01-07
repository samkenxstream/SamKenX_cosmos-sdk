//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/authz/v1beta1/event.proto

package cosmos.authz.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun eventRevoke(block: cosmos.authz.v1beta1.EventRevokeKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Event.EventRevoke =
  cosmos.authz.v1beta1.EventRevokeKt.Dsl._create(cosmos.authz.v1beta1.Event.EventRevoke.newBuilder()).apply { block() }._build()
public object EventRevokeKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.authz.v1beta1.Event.EventRevoke.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.authz.v1beta1.Event.EventRevoke.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.authz.v1beta1.Event.EventRevoke = _builder.build()

    /**
     * <pre>
     * Msg type URL for which an autorization is revoked
     * </pre>
     *
     * <code>string msg_type_url = 2 [json_name = "msgTypeUrl"];</code>
     */
    public var msgTypeUrl: kotlin.String
      @JvmName("getMsgTypeUrl")
      get() = _builder.getMsgTypeUrl()
      @JvmName("setMsgTypeUrl")
      set(value) {
        _builder.setMsgTypeUrl(value)
      }
    /**
     * <pre>
     * Msg type URL for which an autorization is revoked
     * </pre>
     *
     * <code>string msg_type_url = 2 [json_name = "msgTypeUrl"];</code>
     */
    public fun clearMsgTypeUrl() {
      _builder.clearMsgTypeUrl()
    }

    /**
     * <pre>
     * Granter account address
     * </pre>
     *
     * <code>string granter = 3 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var granter: kotlin.String
      @JvmName("getGranter")
      get() = _builder.getGranter()
      @JvmName("setGranter")
      set(value) {
        _builder.setGranter(value)
      }
    /**
     * <pre>
     * Granter account address
     * </pre>
     *
     * <code>string granter = 3 [json_name = "granter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearGranter() {
      _builder.clearGranter()
    }

    /**
     * <pre>
     * Grantee account address
     * </pre>
     *
     * <code>string grantee = 4 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var grantee: kotlin.String
      @JvmName("getGrantee")
      get() = _builder.getGrantee()
      @JvmName("setGrantee")
      set(value) {
        _builder.setGrantee(value)
      }
    /**
     * <pre>
     * Grantee account address
     * </pre>
     *
     * <code>string grantee = 4 [json_name = "grantee", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearGrantee() {
      _builder.clearGrantee()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.authz.v1beta1.Event.EventRevoke.copy(block: cosmos.authz.v1beta1.EventRevokeKt.Dsl.() -> kotlin.Unit): cosmos.authz.v1beta1.Event.EventRevoke =
  cosmos.authz.v1beta1.EventRevokeKt.Dsl._create(this.toBuilder()).apply { block() }._build()
