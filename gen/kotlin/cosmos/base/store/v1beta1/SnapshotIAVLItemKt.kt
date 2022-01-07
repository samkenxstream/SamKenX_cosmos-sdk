//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/store/v1beta1/snapshot.proto

package cosmos.base.store.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun snapshotIAVLItem(block: cosmos.base.store.v1beta1.SnapshotIAVLItemKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem =
  cosmos.base.store.v1beta1.SnapshotIAVLItemKt.Dsl._create(cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem.newBuilder()).apply { block() }._build()
public object SnapshotIAVLItemKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem = _builder.build()

    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     */
    public var key: com.google.protobuf.ByteString
      @JvmName("getKey")
      get() = _builder.getKey()
      @JvmName("setKey")
      set(value) {
        _builder.setKey(value)
      }
    /**
     * <code>bytes key = 1 [json_name = "key"];</code>
     */
    public fun clearKey() {
      _builder.clearKey()
    }

    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     */
    public var value: com.google.protobuf.ByteString
      @JvmName("getValue")
      get() = _builder.getValue()
      @JvmName("setValue")
      set(value) {
        _builder.setValue(value)
      }
    /**
     * <code>bytes value = 2 [json_name = "value"];</code>
     */
    public fun clearValue() {
      _builder.clearValue()
    }

    /**
     * <code>int64 version = 3 [json_name = "version"];</code>
     */
    public var version: kotlin.Long
      @JvmName("getVersion")
      get() = _builder.getVersion()
      @JvmName("setVersion")
      set(value) {
        _builder.setVersion(value)
      }
    /**
     * <code>int64 version = 3 [json_name = "version"];</code>
     */
    public fun clearVersion() {
      _builder.clearVersion()
    }

    /**
     * <code>int32 height = 4 [json_name = "height"];</code>
     */
    public var height: kotlin.Int
      @JvmName("getHeight")
      get() = _builder.getHeight()
      @JvmName("setHeight")
      set(value) {
        _builder.setHeight(value)
      }
    /**
     * <code>int32 height = 4 [json_name = "height"];</code>
     */
    public fun clearHeight() {
      _builder.clearHeight()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem.copy(block: cosmos.base.store.v1beta1.SnapshotIAVLItemKt.Dsl.() -> kotlin.Unit): cosmos.base.store.v1beta1.Snapshot.SnapshotIAVLItem =
  cosmos.base.store.v1beta1.SnapshotIAVLItemKt.Dsl._create(this.toBuilder()).apply { block() }._build()
