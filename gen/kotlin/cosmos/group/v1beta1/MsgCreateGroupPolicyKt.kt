//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/tx.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgCreateGroupPolicy(block: cosmos.group.v1beta1.MsgCreateGroupPolicyKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy =
  cosmos.group.v1beta1.MsgCreateGroupPolicyKt.Dsl._create(cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy.newBuilder()).apply { block() }._build()
public object MsgCreateGroupPolicyKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy = _builder.build()

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
     * metadata is any arbitrary metadata attached to the group policy.
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
     * metadata is any arbitrary metadata attached to the group policy.
     * </pre>
     *
     * <code>bytes metadata = 3 [json_name = "metadata"];</code>
     */
    public fun clearMetadata() {
      _builder.clearMetadata()
    }

    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     */
    public var decisionPolicy: com.google.protobuf.Any
      @JvmName("getDecisionPolicy")
      get() = _builder.getDecisionPolicy()
      @JvmName("setDecisionPolicy")
      set(value) {
        _builder.setDecisionPolicy(value)
      }
    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     */
    public fun clearDecisionPolicy() {
      _builder.clearDecisionPolicy()
    }
    /**
     * <pre>
     * decision_policy specifies the group policy's decision policy.
     * </pre>
     *
     * <code>.google.protobuf.Any decision_policy = 4 [json_name = "decisionPolicy", (.cosmos_proto.accepts_interface) = "DecisionPolicy"];</code>
     * @return Whether the decisionPolicy field is set.
     */
    public fun hasDecisionPolicy(): kotlin.Boolean {
      return _builder.hasDecisionPolicy()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy.copy(block: cosmos.group.v1beta1.MsgCreateGroupPolicyKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Tx.MsgCreateGroupPolicy =
  cosmos.group.v1beta1.MsgCreateGroupPolicyKt.Dsl._create(this.toBuilder()).apply { block() }._build()
