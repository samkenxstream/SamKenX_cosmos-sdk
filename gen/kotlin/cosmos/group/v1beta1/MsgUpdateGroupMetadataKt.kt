//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgUpdateGroupMetadata(block: cosmos.group.v1beta1.MsgUpdateGroupMetadataKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata =
  cosmos.group.v1beta1.MsgUpdateGroupMetadataKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata.newBuilder()).apply { block() }._build()
public object MsgUpdateGroupMetadataKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata = _builder.build()

    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var admin: kotlin.String
      @JvmName("getAdmin")
      get() = _builder.getAdmin()
      @JvmName("setAdmin")
      set(value) {
        _builder.setAdmin(value)
      }
    /**
     * <pre>
     * admin is the account address of the group admin.
     * </pre>
     *
     * <code>string admin = 1 [json_name = "admin", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearAdmin() {
      _builder.clearAdmin()
    }

    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 2 [json_name = "groupId"];</code>
     */
    public var groupId: kotlin.Long
      @JvmName("getGroupId")
      get() = _builder.getGroupId()
      @JvmName("setGroupId")
      set(value) {
        _builder.setGroupId(value)
      }
    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 2 [json_name = "groupId"];</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }

    /**
     * <pre>
     * metadata is the updated group's metadata.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     */
    public var metadata: com.google.protobuf.ByteString
      @JvmName("getMetadata")
      get() = _builder.getMetadata()
      @JvmName("setMetadata")
      set(value) {
        _builder.setMetadata(value)
      }
    /**
     * <pre>
     * metadata is the updated group's metadata.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata.copy(block: cosmos.group.v1beta1.MsgUpdateGroupMetadataKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgUpdateGroupMetadata =
  cosmos.group.v1beta1.MsgUpdateGroupMetadataKt.Dsl._create(this.toBuilder()).apply { block() }._build()
