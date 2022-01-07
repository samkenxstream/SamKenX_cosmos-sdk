//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/staking/v1beta1/query.proto

package cosmos.staking.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun queryDelegatorValidatorResponse(block: cosmos.staking.v1beta1.QueryDelegatorValidatorResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse =
  cosmos.staking.v1beta1.QueryDelegatorValidatorResponseKt.Dsl._create(cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse.newBuilder()).apply { block() }._build()
public object QueryDelegatorValidatorResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse = _builder.build()

    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public var validator: cosmos.staking.v1beta1.Staking.Validator
      @JvmName("getValidator")
      get() = _builder.getValidator()
      @JvmName("setValidator")
      set(value) {
        _builder.setValidator(value)
      }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     */
    public fun clearValidator() {
      _builder.clearValidator()
    }
    /**
     * <pre>
     * validator defines the the validator info.
     * </pre>
     *
     * <code>.cosmos.staking.v1beta1.Validator validator = 1 [json_name = "validator", (.gogoproto.nullable) = false];</code>
     * @return Whether the validator field is set.
     */
    public fun hasValidator(): kotlin.Boolean {
      return _builder.hasValidator()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse.copy(block: cosmos.staking.v1beta1.QueryDelegatorValidatorResponseKt.Dsl.() -> kotlin.Unit): cosmos.staking.v1beta1.QueryOuterClass.QueryDelegatorValidatorResponse =
  cosmos.staking.v1beta1.QueryDelegatorValidatorResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
