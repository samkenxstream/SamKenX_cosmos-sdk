//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun responseEndBlock(block: tendermint.abci.ResponseEndBlockKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseEndBlock =
  tendermint.abci.ResponseEndBlockKt.Dsl._create(tendermint.abci.Types.ResponseEndBlock.newBuilder()).apply { block() }._build()
public object ResponseEndBlockKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseEndBlock.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseEndBlock.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseEndBlock = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValidatorUpdatesProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     */
     public val validatorUpdates: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValidatorUpdatesList()
      )
    /**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     * @param value The validatorUpdates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValidatorUpdates")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.add(value: tendermint.abci.Types.ValidatorUpdate) {
      _builder.addValidatorUpdates(value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     * @param value The validatorUpdates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValidatorUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.plusAssign(value: tendermint.abci.Types.ValidatorUpdate) {
      add(value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     * @param values The validatorUpdates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValidatorUpdates")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.ValidatorUpdate>) {
      _builder.addAllValidatorUpdates(values)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     * @param values The validatorUpdates to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValidatorUpdates")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.ValidatorUpdate>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The validatorUpdates to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValidatorUpdates")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.ValidatorUpdate) {
      _builder.setValidatorUpdates(index, value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validator_updates = 1 [json_name = "validatorUpdates", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValidatorUpdates")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorUpdatesProxy>.clear() {
      _builder.clearValidatorUpdates()
    }
    /**
     * <code>.tendermint.abci.ConsensusParams consensus_param_updates = 2 [json_name = "consensusParamUpdates"];</code>
     */
    public var consensusParamUpdates: tendermint.abci.Types.ConsensusParams
      @JvmName("getConsensusParamUpdates")
      get() = _builder.getConsensusParamUpdates()
      @JvmName("setConsensusParamUpdates")
      set(value) {
        _builder.setConsensusParamUpdates(value)
      }
    /**
     * <code>.tendermint.abci.ConsensusParams consensus_param_updates = 2 [json_name = "consensusParamUpdates"];</code>
     */
    public fun clearConsensusParamUpdates() {
      _builder.clearConsensusParamUpdates()
    }
    /**
     * <code>.tendermint.abci.ConsensusParams consensus_param_updates = 2 [json_name = "consensusParamUpdates"];</code>
     * @return Whether the consensusParamUpdates field is set.
     */
    public fun hasConsensusParamUpdates(): kotlin.Boolean {
      return _builder.hasConsensusParamUpdates()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EventsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     */
     public val events: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEventsList()
      )
    /**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.add(value: tendermint.abci.Types.Event) {
      _builder.addEvents(value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param value The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(value: tendermint.abci.Types.Event) {
      add(value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      _builder.addAllEvents(values)
    }/**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param values The events to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvents")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.Event>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     * @param index The index to set the value at.
     * @param value The events to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvents")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.Event) {
      _builder.setEvents(index, value)
    }/**
     * <code>repeated .tendermint.abci.Event events = 3 [json_name = "events", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "events,omitempty"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvents")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.Event, EventsProxy>.clear() {
      _builder.clearEvents()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseEndBlock.copy(block: tendermint.abci.ResponseEndBlockKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseEndBlock =
  tendermint.abci.ResponseEndBlockKt.Dsl._create(this.toBuilder()).apply { block() }._build()
