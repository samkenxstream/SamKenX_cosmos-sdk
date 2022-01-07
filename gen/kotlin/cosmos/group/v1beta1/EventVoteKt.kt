//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/events.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun eventVote(block: cosmos.group.v1beta1.EventVoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Events.EventVote =
  cosmos.group.v1beta1.EventVoteKt.Dsl._create(cosmos.group.v1beta1.Events.EventVote.newBuilder()).apply { block() }._build()
public object EventVoteKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.Events.EventVote.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.Events.EventVote.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.Events.EventVote = _builder.build()

    /**
     * <pre>
     * proposal_id is the unique ID of the proposal.
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
     * proposal_id is the unique ID of the proposal.
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
public inline fun cosmos.group.v1beta1.Events.EventVote.copy(block: cosmos.group.v1beta1.EventVoteKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.Events.EventVote =
  cosmos.group.v1beta1.EventVoteKt.Dsl._create(this.toBuilder()).apply { block() }._build()
