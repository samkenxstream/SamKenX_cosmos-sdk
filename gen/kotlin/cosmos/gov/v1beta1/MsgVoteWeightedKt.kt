//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta1/tx.proto

package cosmos.gov.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun msgVoteWeighted(block: cosmos.gov.v1beta1.MsgVoteWeightedKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Tx.MsgVoteWeighted =
  cosmos.gov.v1beta1.MsgVoteWeightedKt.Dsl._create(cosmos.gov.v1beta1.Tx.MsgVoteWeighted.newBuilder()).apply { block() }._build()
public object MsgVoteWeightedKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta1.Tx.MsgVoteWeighted.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta1.Tx.MsgVoteWeighted.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta1.Tx.MsgVoteWeighted = _builder.build()

    /**
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
     * <code>uint64 proposal_id = 1 [json_name = "proposalId"];</code>
     */
    public fun clearProposalId() {
      _builder.clearProposalId()
    }

    /**
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var voter: kotlin.String
      @JvmName("getVoter")
      get() = _builder.getVoter()
      @JvmName("setVoter")
      set(value) {
        _builder.setVoter(value)
      }
    /**
     * <code>string voter = 2 [json_name = "voter", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearVoter() {
      _builder.clearVoter()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class OptionsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
     public val options: com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getOptionsList()
      )
    /**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     * @param value The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addOptions")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.add(value: cosmos.gov.v1beta1.Gov.WeightedVoteOption) {
      _builder.addOptions(value)
    }/**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     * @param value The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.plusAssign(value: cosmos.gov.v1beta1.Gov.WeightedVoteOption) {
      add(value)
    }/**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     * @param values The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllOptions")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.gov.v1beta1.Gov.WeightedVoteOption>) {
      _builder.addAllOptions(values)
    }/**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     * @param values The options to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllOptions")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.gov.v1beta1.Gov.WeightedVoteOption>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The options to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setOptions")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.set(index: kotlin.Int, value: cosmos.gov.v1beta1.Gov.WeightedVoteOption) {
      _builder.setOptions(index, value)
    }/**
     * <code>repeated .cosmos.gov.v1beta1.WeightedVoteOption options = 3 [json_name = "options", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearOptions")
    public fun com.google.protobuf.kotlin.DslList<cosmos.gov.v1beta1.Gov.WeightedVoteOption, OptionsProxy>.clear() {
      _builder.clearOptions()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta1.Tx.MsgVoteWeighted.copy(block: cosmos.gov.v1beta1.MsgVoteWeightedKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta1.Tx.MsgVoteWeighted =
  cosmos.gov.v1beta1.MsgVoteWeightedKt.Dsl._create(this.toBuilder()).apply { block() }._build()
