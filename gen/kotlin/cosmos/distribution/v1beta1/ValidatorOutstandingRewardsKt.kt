//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/distribution/v1beta1/distribution.proto

package cosmos.distribution.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun validatorOutstandingRewards(block: cosmos.distribution.v1beta1.ValidatorOutstandingRewardsKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards =
  cosmos.distribution.v1beta1.ValidatorOutstandingRewardsKt.Dsl._create(cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards.newBuilder()).apply { block() }._build()
public object ValidatorOutstandingRewardsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class RewardsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
     public val rewards: com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getRewardsList()
      )
    /**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param value The rewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.add(value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      _builder.addRewards(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param value The rewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignRewards")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.plusAssign(value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param values The rewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.DecCoin>) {
      _builder.addAllRewards(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param values The rewards to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllRewards")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.v1beta1.CoinOuterClass.DecCoin>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     * @param index The index to set the value at.
     * @param value The rewards to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setRewards")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.set(index: kotlin.Int, value: cosmos.base.v1beta1.CoinOuterClass.DecCoin) {
      _builder.setRewards(index, value)
    }/**
     * <code>repeated .cosmos.base.v1beta1.DecCoin rewards = 1 [json_name = "rewards", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.DecCoins"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearRewards")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.v1beta1.CoinOuterClass.DecCoin, RewardsProxy>.clear() {
      _builder.clearRewards()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards.copy(block: cosmos.distribution.v1beta1.ValidatorOutstandingRewardsKt.Dsl.() -> kotlin.Unit): cosmos.distribution.v1beta1.Distribution.ValidatorOutstandingRewards =
  cosmos.distribution.v1beta1.ValidatorOutstandingRewardsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
