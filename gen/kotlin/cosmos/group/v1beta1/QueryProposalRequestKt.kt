//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/query.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryProposalRequest(block: cosmos.group.v1beta1.QueryProposalRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest =
  cosmos.group.v1beta1.QueryProposalRequestKt.Dsl._create(cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest.newBuilder()).apply { block() }._build()
public object QueryProposalRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest = _builder.build()

    /**
     * <pre>
     * proposal_id is the unique ID of a proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public var proposalId: kotlin.Long
      @JvmName("getProposalId")
      get() = _builder.getProposalId()
      @JvmName("setProposalId")
      set(value) {
        _builder.setProposalId(value)
      }
    /**
     * <pre>
     * proposal_id is the unique ID of a proposal.
     * </pre>
     *
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest.copy(block: cosmos.group.v1beta1.QueryProposalRequestKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalRequest =
  cosmos.group.v1beta1.QueryProposalRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
