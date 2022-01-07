//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/orm.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun primaryKeyDescriptor(block: cosmos.orm.v1alpha1.PrimaryKeyDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor =
  cosmos.orm.v1alpha1.PrimaryKeyDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor.newBuilder()).apply { block() }._build()
public object PrimaryKeyDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor = _builder.build()

    /**
     * <pre>
     * fields is a comma-separated list of fields in the primary key. Spaces are
     * not allowed. Supported field types, their encodings, and any applicable constraints
     * are described below.
     *   - uint32, uint64 are encoded as big-endian fixed width bytes and support
     *   sorted iteration.
     *   - string's are encoded as raw bytes in terminal key segments and null-terminated
     *   in non-terminal segments. Null characters are thus forbidden in strings.
     *   string fields support sorted iteration.
     *   - bytes are encoded as raw bytes in terminal segments and length-prefixed
     *   with a single byte in non-terminal segments. Because of this byte arrays
     *   longer than 255 bytes are unsupported and bytes fields should not
     *   be assumed to be lexically sorted. If you have a byte array longer than
     *   255 bytes that you'd like to index, you should consider hashing it first.
     *   - int32, sint32, int64, sint64 are encoding as fixed width bytes with
     *   an encoding that enables sorted iteration.
     *   - google.protobuf.Timestamp and google.protobuf.Duration are encoded
     *   as 12 bytes using an encoding that enables sorted iteration.
     *   - enum fields are encoded using varint encoding and do not support sorted
     *   iteration.
     *   - bool fields are encoded as a single byte 0 or 1.
     * All other fields types are unsupported in keys including repeated and
     * oneof fields.
     * Primary keys are prefixed by the varint encoded table id and the byte 0x0
     * plus any additional prefix specified by the schema.
     * </pre>
     *
     * <code>string fields = 1 [json_name = "fields"];</code>
     */
    public var fields: kotlin.String
      @JvmName("getFields")
      get() = _builder.getFields()
      @JvmName("setFields")
      set(value) {
        _builder.setFields(value)
      }
    /**
     * <pre>
     * fields is a comma-separated list of fields in the primary key. Spaces are
     * not allowed. Supported field types, their encodings, and any applicable constraints
     * are described below.
     *   - uint32, uint64 are encoded as big-endian fixed width bytes and support
     *   sorted iteration.
     *   - string's are encoded as raw bytes in terminal key segments and null-terminated
     *   in non-terminal segments. Null characters are thus forbidden in strings.
     *   string fields support sorted iteration.
     *   - bytes are encoded as raw bytes in terminal segments and length-prefixed
     *   with a single byte in non-terminal segments. Because of this byte arrays
     *   longer than 255 bytes are unsupported and bytes fields should not
     *   be assumed to be lexically sorted. If you have a byte array longer than
     *   255 bytes that you'd like to index, you should consider hashing it first.
     *   - int32, sint32, int64, sint64 are encoding as fixed width bytes with
     *   an encoding that enables sorted iteration.
     *   - google.protobuf.Timestamp and google.protobuf.Duration are encoded
     *   as 12 bytes using an encoding that enables sorted iteration.
     *   - enum fields are encoded using varint encoding and do not support sorted
     *   iteration.
     *   - bool fields are encoded as a single byte 0 or 1.
     * All other fields types are unsupported in keys including repeated and
     * oneof fields.
     * Primary keys are prefixed by the varint encoded table id and the byte 0x0
     * plus any additional prefix specified by the schema.
     * </pre>
     *
     * <code>string fields = 1 [json_name = "fields"];</code>
     */
    public fun clearFields() {
      _builder.clearFields()
    }

    /**
     * <pre>
     * auto_increment specifies that the primary key is generated by an
     * auto-incrementing integer. If this is set to true fields must only
     * contain one field of that is of type uint64.
     * </pre>
     *
     * <code>bool auto_increment = 2 [json_name = "autoIncrement"];</code>
     */
    public var autoIncrement: kotlin.Boolean
      @JvmName("getAutoIncrement")
      get() = _builder.getAutoIncrement()
      @JvmName("setAutoIncrement")
      set(value) {
        _builder.setAutoIncrement(value)
      }
    /**
     * <pre>
     * auto_increment specifies that the primary key is generated by an
     * auto-incrementing integer. If this is set to true fields must only
     * contain one field of that is of type uint64.
     * </pre>
     *
     * <code>bool auto_increment = 2 [json_name = "autoIncrement"];</code>
     */
    public fun clearAutoIncrement() {
      _builder.clearAutoIncrement()
    }

    /**
     * <pre>
     * references specifies that this primary key references the primary key
     * of another table. See the documentation for the SecondaryIndexDescriptor.references
     * field for more details. An additional constraint placed on primary keys
     * which reference another table is that those references cannot be circular.
     * </pre>
     *
     * <code>string references = 3 [json_name = "references"];</code>
     */
    public var references: kotlin.String
      @JvmName("getReferences")
      get() = _builder.getReferences()
      @JvmName("setReferences")
      set(value) {
        _builder.setReferences(value)
      }
    /**
     * <pre>
     * references specifies that this primary key references the primary key
     * of another table. See the documentation for the SecondaryIndexDescriptor.references
     * field for more details. An additional constraint placed on primary keys
     * which reference another table is that those references cannot be circular.
     * </pre>
     *
     * <code>string references = 3 [json_name = "references"];</code>
     */
    public fun clearReferences() {
      _builder.clearReferences()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor.copy(block: cosmos.orm.v1alpha1.PrimaryKeyDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.PrimaryKeyDescriptor =
  cosmos.orm.v1alpha1.PrimaryKeyDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
