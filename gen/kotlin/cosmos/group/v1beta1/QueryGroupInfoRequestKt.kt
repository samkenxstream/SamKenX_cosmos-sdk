//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/query.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryGroupInfoRequest(block: cosmos.group.v1beta1.QueryGroupInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest =
  cosmos.group.v1beta1.QueryGroupInfoRequestKt.Dsl._create(cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest.newBuilder()).apply { block() }._build()
public object QueryGroupInfoRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest = _builder.build()

    /**
     * <pre>
     * group_id is the unique ID of the group.
     * </pre>
     *
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
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
     * <code>uint64 group_id = 1 [json_name = "groupId"];</code>
     */
    public fun clearGroupId() {
      _builder.clearGroupId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest.copy(block: cosmos.group.v1beta1.QueryGroupInfoRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryGroupInfoRequest =
  cosmos.group.v1beta1.QueryGroupInfoRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
