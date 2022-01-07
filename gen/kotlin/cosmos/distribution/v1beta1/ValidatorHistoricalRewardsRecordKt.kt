//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/genesis.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun validatorHistoricalRewardsRecord(block: cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord =
  cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecordKt.Dsl._create(cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord.newBuilder()).apply { block() }._build()
public object ValidatorHistoricalRewardsRecordKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord = _builder.build()

    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public var validatorAddress: kotlin.String
      @JvmName("getValidatorAddress")
      get() = _builder.getValidatorAddress()
      @JvmName("setValidatorAddress")
      set(value) {
        _builder.setValidatorAddress(value)
      }
    /**
     * <pre>
     * validator_address is the address of the validator.
     * </pre>
     *
     * <code>string validator_address = 1 [json_name = "validatorAddress", (.cosmos_proto.scalar) = "cosmos.AddressString"];</code>
     */
    public fun clearValidatorAddress() {
      _builder.clearValidatorAddress()
    }

    /**
     * <pre>
     * period defines the period the historical rewards apply to.
     * </pre>
     *
     * <code>uint64 period = 2 [json_name = "period"];</code>
     */
    public var period: kotlin.Long
      @JvmName("getPeriod")
      get() = _builder.getPeriod()
      @JvmName("setPeriod")
      set(value) {
        _builder.setPeriod(value)
      }
    /**
     * <pre>
     * period defines the period the historical rewards apply to.
     * </pre>
     *
     * <code>uint64 period = 2 [json_name = "period"];</code>
     */
    public fun clearPeriod() {
      _builder.clearPeriod()
    }

    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
     */
    public var rewards: cosmos.distribution.v1beta1.Distribution.ValidatorHistoricalRewards
      @JvmName("getRewards")
      get() = _builder.getRewards()
      @JvmName("setRewards")
      set(value) {
        _builder.setRewards(value)
      }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
     */
    public fun clearRewards() {
      _builder.clearRewards()
    }
    /**
     * <pre>
     * rewards defines the historical rewards of a validator.
     * </pre>
     *
     * <code>.cosmos.distribution.v1beta1.ValidatorHistoricalRewards rewards = 3 [json_name = "rewards", (.gogoproto.nullable) = false];</code>
     * @return Whether the rewards field is set.
     */
    public fun hasRewards(): kotlin.Boolean {
      return _builder.hasRewards()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord.copy(block: cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecordKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Genesis.ValidatorHistoricalRewardsRecord =
  cosmos.distribution.v1beta1.ValidatorHistoricalRewardsRecordKt.Dsl._create(this.toBuilder()).apply { block() }._build()
