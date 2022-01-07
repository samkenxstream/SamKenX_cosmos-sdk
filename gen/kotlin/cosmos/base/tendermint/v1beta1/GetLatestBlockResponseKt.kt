//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/tendermint/v1beta1/query.proto

package cosmos.base.tendermint.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun getLatestBlockResponse(block: cosmos.base.tendermint.v1beta1.GetLatestBlockResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse =
  cosmos.base.tendermint.v1beta1.GetLatestBlockResponseKt.Dsl._create(cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse.newBuilder()).apply { block() }._build()
public object GetLatestBlockResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse = _builder.build()

    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId"];</code>
     */
    public var blockId: tendermint.types.Types.BlockID
      @JvmName("getBlockId")
      get() = _builder.getBlockId()
      @JvmName("setBlockId")
      set(value) {
        _builder.setBlockId(value)
      }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId"];</code>
     */
    public fun clearBlockId() {
      _builder.clearBlockId()
    }
    /**
     * <code>.tendermint.types.BlockID block_id = 1 [json_name = "blockId"];</code>
     * @return Whether the blockId field is set.
     */
    public fun hasBlockId(): kotlin.Boolean {
      return _builder.hasBlockId()
    }

    /**
     * <code>.tendermint.types.Block block = 2 [json_name = "block"];</code>
     */
    public var block: tendermint.types.BlockOuterClass.Block
      @JvmName("getBlock")
      get() = _builder.getBlock()
      @JvmName("setBlock")
      set(value) {
        _builder.setBlock(value)
      }
    /**
     * <code>.tendermint.types.Block block = 2 [json_name = "block"];</code>
     */
    public fun clearBlock() {
      _builder.clearBlock()
    }
    /**
     * <code>.tendermint.types.Block block = 2 [json_name = "block"];</code>
     * @return Whether the block field is set.
     */
    public fun hasBlock(): kotlin.Boolean {
      return _builder.hasBlock()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse.copy(block: cosmos.base.tendermint.v1beta1.GetLatestBlockResponseKt.Dsl.() -> kotlin.Unit): cosmos.base.tendermint.v1beta1.Query.GetLatestBlockResponse =
  cosmos.base.tendermint.v1beta1.GetLatestBlockResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
