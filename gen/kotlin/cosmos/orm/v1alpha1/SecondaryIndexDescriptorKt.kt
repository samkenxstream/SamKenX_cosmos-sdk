//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/orm/v1alpha1/orm.proto

package cosmos.orm.v1alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun secondaryIndexDescriptor(block: cosmos.orm.v1alpha1.SecondaryIndexDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor =
  cosmos.orm.v1alpha1.SecondaryIndexDescriptorKt.Dsl._create(cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor.newBuilder()).apply { block() }._build()
public object SecondaryIndexDescriptorKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor = _builder.build()

    /**
     * <pre>
     * fields is a comma-separated list of fields in the index. The supported
     * field types are the same as those for PrimaryKeyDescriptor.fields.
     * Index keys are prefixed by the varint encoded table id and the varint
     * encoded index id plus any additional prefix specified by the schema.
     * In addition the the field segments, non-unique index keys are suffixed with
     * any additional primary key fields not present in the index fields so that the
     * primary key can be reconstructed. Unique indexes instead of being suffixed
     * store the remaining primary key fields in the value..
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
     * fields is a comma-separated list of fields in the index. The supported
     * field types are the same as those for PrimaryKeyDescriptor.fields.
     * Index keys are prefixed by the varint encoded table id and the varint
     * encoded index id plus any additional prefix specified by the schema.
     * In addition the the field segments, non-unique index keys are suffixed with
     * any additional primary key fields not present in the index fields so that the
     * primary key can be reconstructed. Unique indexes instead of being suffixed
     * store the remaining primary key fields in the value..
     * </pre>
     *
     * <code>string fields = 1 [json_name = "fields"];</code>
     */
    public fun clearFields() {
      _builder.clearFields()
    }

    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the indexes for this
     * table. It may be deprecated in the future when this can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 2 [json_name = "id"];</code>
     */
    public var id: kotlin.Int
      @JvmName("getId")
      get() = _builder.getId()
      @JvmName("setId")
      set(value) {
        _builder.setId(value)
      }
    /**
     * <pre>
     * id is a non-zero integer ID that must be unique within the indexes for this
     * table. It may be deprecated in the future when this can be auto-generated.
     * </pre>
     *
     * <code>uint32 id = 2 [json_name = "id"];</code>
     */
    public fun clearId() {
      _builder.clearId()
    }

    /**
     * <pre>
     * unique specifies that this an unique index.
     * </pre>
     *
     * <code>bool unique = 3 [json_name = "unique"];</code>
     */
    public var unique: kotlin.Boolean
      @JvmName("getUnique")
      get() = _builder.getUnique()
      @JvmName("setUnique")
      set(value) {
        _builder.setUnique(value)
      }
    /**
     * <pre>
     * unique specifies that this an unique index.
     * </pre>
     *
     * <code>bool unique = 3 [json_name = "unique"];</code>
     */
    public fun clearUnique() {
      _builder.clearUnique()
    }

    /**
     * <pre>
     * references specifies that this index references another table defined in the same
     * proto file. Currently references are not support to tables with composite
     * primary keys, therefore fields must reference one field and its type must
     * be the same type as the primary key field of the referenced table.
     * References to tables in defined by different proto files are not supported
     * to avoid tight coupling of dependencies. Beyond validating that the reference
     * is valid key constraints are currently not enforced, but references should
     * be used by clients to perform automatic joins.
     * </pre>
     *
     * <code>string references = 4 [json_name = "references"];</code>
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
     * references specifies that this index references another table defined in the same
     * proto file. Currently references are not support to tables with composite
     * primary keys, therefore fields must reference one field and its type must
     * be the same type as the primary key field of the referenced table.
     * References to tables in defined by different proto files are not supported
     * to avoid tight coupling of dependencies. Beyond validating that the reference
     * is valid key constraints are currently not enforced, but references should
     * be used by clients to perform automatic joins.
     * </pre>
     *
     * <code>string references = 4 [json_name = "references"];</code>
     */
    public fun clearReferences() {
      _builder.clearReferences()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor.copy(block: cosmos.orm.v1alpha1.SecondaryIndexDescriptorKt.Dsl.() -> kotlin.Unit): cosmos.orm.v1alpha1.Orm.SecondaryIndexDescriptor =
  cosmos.orm.v1alpha1.SecondaryIndexDescriptorKt.Dsl._create(this.toBuilder()).apply { block() }._build()
