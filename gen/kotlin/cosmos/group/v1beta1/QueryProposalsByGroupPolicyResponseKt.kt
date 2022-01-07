//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/group/v1beta1/query.proto

package cosmos.group.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryProposalsByGroupPolicyResponse(block: cosmos.group.v1beta1.QueryProposalsByGroupPolicyResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse =
  cosmos.group.v1beta1.QueryProposalsByGroupPolicyResponseKt.Dsl._create(cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse.newBuilder()).apply { block() }._build()
public object QueryProposalsByGroupPolicyResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ProposalsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     */
     public val proposals: com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getProposalsList()
      )
    /**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.add(value: cosmos.group.v1beta1.Types.Proposal) {
      _builder.addProposals(value)
    }/**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.plusAssign(value: cosmos.group.v1beta1.Types.Proposal) {
      add(value)
    }/**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.group.v1beta1.Types.Proposal>) {
      _builder.addAllProposals(values)
    }/**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.group.v1beta1.Types.Proposal>) {
      addAll(values)
    }/**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param index The index to set the value at.
     * @param value The proposals to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setProposals")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.set(index: kotlin.Int, value: cosmos.group.v1beta1.Types.Proposal) {
      _builder.setProposals(index, value)
    }/**
     * <pre>
     * proposals are the proposals with given group policy.
     * </pre>
     *
     * <code>repeated .cosmos.group.v1beta1.Proposal proposals = 1 [json_name = "proposals"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.group.v1beta1.Types.Proposal, ProposalsProxy>.clear() {
      _builder.clearProposals()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse.copy(block: cosmos.group.v1beta1.QueryProposalsByGroupPolicyResponseKt.Dsl.() -> kotlin.Unit): cosmos.group.v1beta1.QueryOuterClass.QueryProposalsByGroupPolicyResponse =
  cosmos.group.v1beta1.QueryProposalsByGroupPolicyResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
