//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: tendermint/types/params.proto

package tendermint.types;

@kotlin.jvm.JvmSynthetic
public inline fun blockParams(block: tendermint.types.BlockParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.BlockParams =
  tendermint.types.BlockParamsKt.Dsl._create(tendermint.types.Params.BlockParams.newBuilder()).apply { block() }._build()
public object BlockParamsKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: tendermint.types.Params.BlockParams.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: tendermint.types.Params.BlockParams.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): tendermint.types.Params.BlockParams = _builder.build()

    /**
     * <pre>
     * Max block size, in bytes.
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1 [json_name = "maxBytes"];</code>
     */
    public var maxBytes: kotlin.Long
      @JvmName("getMaxBytes")
      get() = _builder.getMaxBytes()
      @JvmName("setMaxBytes")
      set(value) {
        _builder.setMaxBytes(value)
      }
    /**
     * <pre>
     * Max block size, in bytes.
     * Note: must be greater than 0
     * </pre>
     *
     * <code>int64 max_bytes = 1 [json_name = "maxBytes"];</code>
     */
    public fun clearMaxBytes() {
      _builder.clearMaxBytes()
    }

    /**
     * <pre>
     * Max gas per block.
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2 [json_name = "maxGas"];</code>
     */
    public var maxGas: kotlin.Long
      @JvmName("getMaxGas")
      get() = _builder.getMaxGas()
      @JvmName("setMaxGas")
      set(value) {
        _builder.setMaxGas(value)
      }
    /**
     * <pre>
     * Max gas per block.
     * Note: must be greater or equal to -1
     * </pre>
     *
     * <code>int64 max_gas = 2 [json_name = "maxGas"];</code>
     */
    public fun clearMaxGas() {
      _builder.clearMaxGas()
    }

    /**
     * <pre>
     * Minimum time increment between consecutive blocks (in milliseconds) If the
     * block header timestamp is ahead of the system clock, decrease this value.
     * Not exposed to the application.
     * </pre>
     *
     * <code>int64 time_iota_ms = 3 [json_name = "timeIotaMs"];</code>
     */
    public var timeIotaMs: kotlin.Long
      @JvmName("getTimeIotaMs")
      get() = _builder.getTimeIotaMs()
      @JvmName("setTimeIotaMs")
      set(value) {
        _builder.setTimeIotaMs(value)
      }
    /**
     * <pre>
     * Minimum time increment between consecutive blocks (in milliseconds) If the
     * block header timestamp is ahead of the system clock, decrease this value.
     * Not exposed to the application.
     * </pre>
     *
     * <code>int64 time_iota_ms = 3 [json_name = "timeIotaMs"];</code>
     */
    public fun clearTimeIotaMs() {
      _builder.clearTimeIotaMs()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun tendermint.types.Params.BlockParams.copy(block: tendermint.types.BlockParamsKt.Dsl.() -> kotlin.Unit): tendermint.types.Params.BlockParams =
  tendermint.types.BlockParamsKt.Dsl._create(this.toBuilder()).apply { block() }._build()
