//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/nft/v1beta1/event.proto

package cosmos.nft.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun eventBurn(block: cosmos.nft.v1beta1.EventBurnKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Event.EventBurn =
  cosmos.nft.v1beta1.EventBurnKt.Dsl._create(cosmos.nft.v1beta1.Event.EventBurn.newBuilder()).apply { block() }._build()
public object EventBurnKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.nft.v1beta1.Event.EventBurn.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.nft.v1beta1.Event.EventBurn.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.nft.v1beta1.Event.EventBurn = _builder.build()

    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public var classId: kotlin.String
      @JvmName("getClassId")
      get() = _builder.getClassId()
      @JvmName("setClassId")
      set(value) {
        _builder.setClassId(value)
      }
    /**
     * <code>string class_id = 1 [json_name = "classId"];</code>
     */
    public fun clearClassId() {
      _builder.clearClassId()
    }

    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public var id: kotlin.String
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <code>string id = 2 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <code>string owner = 3 [json_name = "owner"];</code>
     */
    public var owner: kotlin.String
      @JvmName("getOwner")
      get() = _builder.getOwner()
      @JvmName("setOwner")
      set(value) {
        _builder.setOwner(value)
      }
    /**
     * <code>string owner = 3 [json_name = "owner"];</code>
     */
    public fun clearOwner() {
      _builder.clearOwner()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.nft.v1beta1.Event.EventBurn.copy(block: cosmos.nft.v1beta1.EventBurnKt.Dsl.() -> kotlin.Unit): cosmos.nft.v1beta1.Event.EventBurn =
  cosmos.nft.v1beta1.EventBurnKt.Dsl._create(this.toBuilder()).apply { block() }._build()
