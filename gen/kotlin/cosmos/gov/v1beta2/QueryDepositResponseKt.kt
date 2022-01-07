//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta2/query.proto

package cosmos.gov.v1beta2;

@kotlin.jvm.JvmSynthetic
public inline fun queryDepositResponse(block: cosmos.gov.v1beta2.QueryDepositResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse =
  cosmos.gov.v1beta2.QueryDepositResponseKt.Dsl._create(cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse.newBuilder()).apply { block() }._build()
public object QueryDepositResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse = _builder.build()

    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Deposit deposit = 1 [json_name = "deposit"];</code>
     */
    public var deposit: cosmos.gov.v1beta2.Gov.Deposit
      @JvmName("getDeposit")
      get() = _builder.getDeposit()
      @JvmName("setDeposit")
      set(value) {
        _builder.setDeposit(value)
      }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Deposit deposit = 1 [json_name = "deposit"];</code>
     */
    public fun clearDeposit() {
      _builder.clearDeposit()
    }
    /**
     * <pre>
     * deposit defines the requested deposit.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Deposit deposit = 1 [json_name = "deposit"];</code>
     * @return Whether the deposit field is set.
     */
    public fun hasDeposit(): kotlin.Boolean {
      return _builder.hasDeposit()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse.copy(block: cosmos.gov.v1beta2.QueryDepositResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryDepositResponse =
  cosmos.gov.v1beta2.QueryDepositResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
