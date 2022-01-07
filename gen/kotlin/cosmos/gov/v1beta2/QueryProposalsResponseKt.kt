//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta2/query.proto

package cosmos.gov.v1beta2;

@kotlin.jvm.JvmSynthetic
public inline fun queryProposalsResponse(block: cosmos.gov.v1beta2.QueryProposalsResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse =
  cosmos.gov.v1beta2.QueryProposalsResponseKt.Dsl._create(cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse.newBuilder()).apply { block() }._build()
public object QueryProposalsResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ProposalsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     */
     public val proposals: com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getProposalsList()
      )
    /**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.add(value: cosmos.gov.v1beta2.Gov.Proposal) {
      _builder.addProposals(value)
    }/**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param value The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.plusAssign(value: cosmos.gov.v1beta2.Gov.Proposal) {
      add(value)
    }/**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1beta2.Gov.Proposal>) {
      _builder.addAllProposals(values)
    }/**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param values The proposals to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllProposals")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1beta2.Gov.Proposal>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     * @param index The index to set the value at.
     * @param value The proposals to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setProposals")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.set(index: kotlin.Int, value: cosmos.gov.v1beta2.Gov.Proposal) {
      _builder.setProposals(index, value)
    }/**
     * <code>repeated .cosmos.gov.v1beta2.Proposal proposals = 1 [json_name = "proposals"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearProposals")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta2.Gov.Proposal, ProposalsProxy>.clear() {
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
public inline fun cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse.copy(block: cosmos.gov.v1beta2.QueryProposalsResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryProposalsResponse =
  cosmos.gov.v1beta2.QueryProposalsResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
