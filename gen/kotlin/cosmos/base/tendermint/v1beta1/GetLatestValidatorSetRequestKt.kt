//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getLatestValidatorSetRequest(block: cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest =
  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequestKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest.newBuilder()).apply { block() }._build()
public object GetLatestValidatorSetRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest = _builder.build()

    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageRequest
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the request.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageRequest pagination = 1 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest.copy(block: cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetRequest =
  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
