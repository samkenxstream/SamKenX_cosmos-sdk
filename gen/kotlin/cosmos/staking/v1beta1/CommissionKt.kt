//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/staking.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun commission(block: cosmos.staking.v1beta1.CommissionKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.Commission =
  cosmos.staking.v1beta1.CommissionKt.Dsl._create(cosmos.staking.v1beta1.Staking.Commission.newBuilder()).apply { block() }._build()
public object CommissionKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.Staking.Commission.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.Staking.Commission.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.Staking.Commission = _builder.build()

    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public var commissionRates: cosmos.staking.v1beta1.Staking.CommissionRates
      @JvmName("getCommissionRates")
      get() = _builder.getCommissionRates()
      @JvmName("setCommissionRates")
      set(value) {
        _builder.setCommissionRates(value)
      }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     */
    public fun clearCommissionRates() {
      _builder.clearCommissionRates()
    }
    /**
     * <pre>
     * commission_rates defines the initial commission rates to be used for creating a validator.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.CommissionRates commission_rates = 1 [json_name = "commissionRates", (.gogoproto.nullable) = false, (.gogoproto.embed) = true];</code>
     * @return Whether the commissionRates field is set.
     */
    public fun hasCommissionRates(): kotlin.Boolean {
      return _builder.hasCommissionRates()
    }

    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public var updateTime: com.google.protobuf.Timestamp
      @JvmName("getUpdateTime")
      get() = _builder.getUpdateTime()
      @JvmName("setUpdateTime")
      set(value) {
        _builder.setUpdateTime(value)
      }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     */
    public fun clearUpdateTime() {
      _builder.clearUpdateTime()
    }
    /**
     * <pre>
     * update_time is the last time the commission rate was changed.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 2 [json_name = "updateTime", (.gogoproto.nullable) = false, (.gogoproto.stdtime) = true];</code>
     * @return Whether the updateTime field is set.
     */
    public fun hasUpdateTime(): kotlin.Boolean {
      return _builder.hasUpdateTime()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.Staking.Commission.copy(block: cosmos.staking.v1beta1.CommissionKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.Staking.Commission =
  cosmos.staking.v1beta1.CommissionKt.Dsl._create(this.toBuilder()).apply { block() }._build()
