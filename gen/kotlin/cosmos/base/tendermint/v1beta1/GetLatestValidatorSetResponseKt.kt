//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getLatestValidatorSetResponse(block: cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse =
  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponseKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse.newBuilder()).apply { block() }._build()
public object GetLatestValidatorSetResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse = _builder.build()

    /**
     * <code>int64 block_height = 1 [json_name = "blockHeight"];</code>
     */
    public var blockHeight: kotlin.Long
      @JvmName("getBlockHeight")
      get() = _builder.getBlockHeight()
      @JvmName("setBlockHeight")
      set(value) {
        _builder.setBlockHeight(value)
      }
    /**
     * <code>int64 block_height = 1 [json_name = "blockHeight"];</code>
     */
    public fun clearBlockHeight() {
      _builder.clearBlockHeight()
    }

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class ValidatorsProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     */
     public val validators: com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getValidatorsList()
      )
    /**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addValidators")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.add(value: cosmos.base.tendermint.v1beta1.Query.Validator) {
      _builder.addValidators(value)
    }/**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     * @param value The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.plusAssign(value: cosmos.base.tendermint.v1beta1.Query.Validator) {
      add(value)
    }/**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllValidators")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.addAll(values: kotlin.collections.Iterable<cosmos.base.tendermint.v1beta1.Query.Validator>) {
      _builder.addAllValidators(values)
    }/**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     * @param values The validators to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllValidators")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.plusAssign(values: kotlin.collections.Iterable<cosmos.base.tendermint.v1beta1.Query.Validator>) {
      addAll(values)
    }/**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     * @param index The index to set the value at.
     * @param value The validators to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setValidators")
    public operator fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.set(index: kotlin.Int, value: cosmos.base.tendermint.v1beta1.Query.Validator) {
      _builder.setValidators(index, value)
    }/**
     * <code>repeated .cosmos.base.tendermint.v1beta1.Validator validators = 2 [json_name = "validators"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearValidators")
    public fun com.google.protobuf.kotlin.DslList<cosmos.base.tendermint.v1beta1.Query.Validator, ValidatorsProxy>.clear() {
      _builder.clearValidators()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination"];</code>
     */
    public var pagination: cosmos.base.query.v1beta1.Pagination.PageResponse
      @JvmName("getPagination")
      get() = _builder.getPagination()
      @JvmName("setPagination")
      set(value) {
        _builder.setPagination(value)
      }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination"];</code>
     */
    public fun clearPagination() {
      _builder.clearPagination()
    }
    /**
     * <pre>
     * pagination defines an pagination for the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 3 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public fun hasPagination(): kotlin.Boolean {
      return _builder.hasPagination()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse.copy(block: cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestValidatorSetResponse =
  cosmos.base.tendermint.v1beta1.GetLatestValidatorSetResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
