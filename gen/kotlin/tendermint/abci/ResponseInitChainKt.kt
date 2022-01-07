//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/abci/types.proto

package tendermint.abci;

@kotlin.jvm.JvmSynthetic
public inline fun responseInitChain(block: tendermint.abci.ResponseInitChainKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseInitChain =
  tendermint.abci.ResponseInitChainKt.Dsl._create(tendermint.abci.Types.ResponseInitChain.newBuilder()).apply { block() }._build()
public object ResponseInitChainKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.abci.Types.ResponseInitChain.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.abci.Types.ResponseInitChain.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.abci.Types.ResponseInitChain = _builder.build()

    /**
     * <code>.tendermint.abci.ConsensusParams consensus_params = 1 [json_name = "consensusParams"];</code>
     */
    public var consensusParams: tendermint.abci.Types.ConsensusParams
      @JvmName("getConsensusParams")
      get() = _builder.getConsensusParams()
      @JvmName("setConsensusParams")
      set(value) {
        _builder.setConsensusParams(value)
      }
    /**
     * <code>.tendermint.abci.ConsensusParams consensus_params = 1 [json_name = "consensusParams"];</code>
     */
    public fun clearConsensusParams() {
      _builder.clearConsensusParams()
    }
    /**
     * <code>.tendermint.abci.ConsensusParams consensus_params = 1 [json_name = "consensusParams"];</code>
     * @return Whether the consensusParams field is set.
     */
    public fun hasConsensusParams(): kotlin.Boolean {
      return _builder.hasConsensusParams()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValidatorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     */
     public val validators: com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValidatorsList()
      )
    /**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.add(value: tendermint.abci.Types.ValidatorUpdate) {
      _builder.addValidators(value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.plusAssign(value: tendermint.abci.Types.ValidatorUpdate) {
      add(value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.addAll(values: kotlin.collections.Iterable<tendermint.abci.Types.ValidatorUpdate>) {
      _builder.addAllValidators(values)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.plusAssign(values: kotlin.collections.Iterable<tendermint.abci.Types.ValidatorUpdate>) {
      addAll(values)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     * @param index The index to set the value at.
     * @param value The validators to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValidators")
    public operator fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.set(index: kotlin.Int, value: tendermint.abci.Types.ValidatorUpdate) {
      _builder.setValidators(index, value)
    }/**
     * <code>repeated .tendermint.abci.ValidatorUpdate validators = 2 [json_name = "validators", (.gogoproto.nullable) = false];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValidators")
    public fun com.google.protobuf.kotlin.DslList<tendermint.abci.Types.ValidatorUpdate, ValidatorsProxy>.clear() {
      _builder.clearValidators()
    }
    /**
     * <code>bytes app_hash = 3 [json_name = "appHash"];</code>
     */
    public var appHash: com.google.protobuf.ByteString
      @JvmName("getAppHash")
      get() = _builder.getAppHash()
      @JvmName("setAppHash")
      set(value) {
        _builder.setAppHash(value)
      }
    /**
     * <code>bytes app_hash = 3 [json_name = "appHash"];</code>
     */
    public fun clearAppHash() {
      _builder.clearAppHash()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.abci.Types.ResponseInitChain.copy(block: tendermint.abci.ResponseInitChainKt.Dsl.() -> kotlin.Unit): tendermint.abci.Types.ResponseInitChain =
  tendermint.abci.ResponseInitChainKt.Dsl._create(this.toBuilder()).apply { block() }._build()
