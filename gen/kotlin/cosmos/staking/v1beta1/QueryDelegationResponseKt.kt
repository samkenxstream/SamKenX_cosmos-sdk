//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDelegationResponse(block: cosmos.staking.v1beta1.QueryDelegationResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse =
  cosmos.staking.v1beta1.QueryDelegationResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse.newBuilder()).apply { block() }._build()
public object QueryDelegationResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse = _builder.build()

    /**
     * <pre>
     * delegation_responses defines the delegation info of a delegation.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.DelegationResponse delegation_response = 1 [json_name = "delegationResponse"];</code>
     */
    public var delegationResponse: cosmos.staking.v1beta1.Staking.DelegationResponse
      @JvmName("getDelegationResponse")
      get() = _builder.getDelegationResponse()
      @JvmName("setDelegationResponse")
      set(value) {
        _builder.setDelegationResponse(value)
      }
    /**
     * <pre>
     * delegation_responses defines the delegation info of a delegation.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.DelegationResponse delegation_response = 1 [json_name = "delegationResponse"];</code>
     */
    public fun clearDelegationResponse() {
      _builder.clearDelegationResponse()
    }
    /**
     * <pre>
     * delegation_responses defines the delegation info of a delegation.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.DelegationResponse delegation_response = 1 [json_name = "delegationResponse"];</code>
     * @return Whether the delegationResponse field is set.
     */
    public fun hasDelegationResponse(): kotlin.Boolean {
      return _builder.hasDelegationResponse()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse.copy(block: cosmos.staking.v1beta1.QueryDelegationResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegationResponse =
  cosmos.staking.v1beta1.QueryDelegationResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
