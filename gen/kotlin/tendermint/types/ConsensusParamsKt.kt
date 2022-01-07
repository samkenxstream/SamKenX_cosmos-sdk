//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun consensusParams(block: tendermint.types.ConsensusParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.ConsensusParams =
  tendermint.types.ConsensusParamsKt.Dsl._create(tendermint.types.Params.ConsensusParams.newBuilder()).apply { block() }._build()
public object ConsensusParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Params.ConsensusParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Params.ConsensusParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Params.ConsensusParams = _builder.build()

    /**
     * <code>.tendermint.types.BlockParams block = 1 [json_name = "block", (.gogoproto.nullable) = false];</code>
     */
    public var block: tendermint.types.Params.BlockParams
      @JvmName("getBlock")
      get() = _builder.getBlock()
      @JvmName("setBlock")
      set(value) {
        _builder.setBlock(value)
      }
    /**
     * <code>.tendermint.types.BlockParams block = 1 [json_name = "block", (.gogoproto.nullable) = false];</code>
     */
    public fun clearBlock() {
      _builder.clearBlock()
    }
    /**
     * <code>.tendermint.types.BlockParams block = 1 [json_name = "block", (.gogoproto.nullable) = false];</code>
     * @return Whether the block field is set.
     */
    public fun hasBlock(): kotlin.Boolean {
      return _builder.hasBlock()
    }

    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
    public var evidence: tendermint.types.Params.EvidenceParams
      @JvmName("getEvidence")
      get() = _builder.getEvidence()
      @JvmName("setEvidence")
      set(value) {
        _builder.setEvidence(value)
      }
    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     */
    public fun clearEvidence() {
      _builder.clearEvidence()
    }
    /**
     * <code>.tendermint.types.EvidenceParams evidence = 2 [json_name = "evidence", (.gogoproto.nullable) = false];</code>
     * @return Whether the evidence field is set.
     */
    public fun hasEvidence(): kotlin.Boolean {
      return _builder.hasEvidence()
    }

    /**
     * <code>.tendermint.types.ValidatorParams validator = 3 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public var validator: tendermint.types.Params.ValidatorParams
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <code>.tendermint.types.ValidatorParams validator = 3 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public fun clearValidator() {
      _builder.clearValidator()
    }
    /**
     * <code>.tendermint.types.ValidatorParams validator = 3 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return Whether the validator field is set.
     */
    public fun hasValidator(): kotlin.Boolean {
      return _builder.hasValidator()
    }

    /**
     * <code>.tendermint.types.VersionParams version = 4 [json_name = "version", (.gogoproto.nullable) = false];</code>
     */
    public var version: tendermint.types.Params.VersionParams
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>.tendermint.types.VersionParams version = 4 [json_name = "version", (.gogoproto.nullable) = false];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }
    /**
     * <code>.tendermint.types.VersionParams version = 4 [json_name = "version", (.gogoproto.nullable) = false];</code>
     * @return Whether the version field is set.
     */
    public fun hasVersion(): kotlin.Boolean {
      return _builder.hasVersion()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Params.ConsensusParams.copy(block: tendermint.types.ConsensusParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.ConsensusParams =
  tendermint.types.ConsensusParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
