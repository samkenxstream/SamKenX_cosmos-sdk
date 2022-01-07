//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/evidence/v1beta1/genesis.proto

package cosmos.evidence.v1beta1;

@kotlin.jvm.JvmSynthetic
public inline fun genesisState(block: cosmos.evidence.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.Genesis.GenesisState =
  cosmos.evidence.v1beta1.GenesisStateKt.Dsl._create(cosmos.evidence.v1beta1.Genesis.GenesisState.newBuilder()).apply { block() }._build()
public object GenesisStateKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.evidence.v1beta1.Genesis.GenesisState.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.evidence.v1beta1.Genesis.GenesisState.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.evidence.v1beta1.Genesis.GenesisState = _builder.build()

    /**
     * An uninstantiable, behaviorless type to represent the field in
     * generics.
     */
    @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
    public class EvidenceProxy private constructor() : com.google.protobuf.kotlin.DslProxy()
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
     public val evidence: com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>
      @kotlin.jvm.JvmSynthetic
      get() = com.google.protobuf.kotlin.DslList(
        _builder.getEvidenceList()
      )
    /**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addEvidence")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.add(value: com.google.protobuf.Any) {
      _builder.addEvidence(value)
    }/**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @param value The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignEvidence")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.plusAssign(value: com.google.protobuf.Any) {
      add(value)
    }/**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("addAllEvidence")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.addAll(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      _builder.addAllEvidence(values)
    }/**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @param values The evidence to add.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("plusAssignAllEvidence")
    @Suppress("NOTHING_TO_INLINE")
    public inline operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.plusAssign(values: kotlin.collections.Iterable<com.google.protobuf.Any>) {
      addAll(values)
    }/**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     * @param index The index to set the value at.
     * @param value The evidence to set.
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("setEvidence")
    public operator fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.set(index: kotlin.Int, value: com.google.protobuf.Any) {
      _builder.setEvidence(index, value)
    }/**
     * <pre>
     * evidence defines all the evidence at genesis.
     * </pre>
     *
     * <code>repeated .google.protobuf.Any evidence = 1 [json_name = "evidence"];</code>
     */
    @kotlin.jvm.JvmSynthetic
    @kotlin.jvm.JvmName("clearEvidence")
    public fun com.google.protobuf.kotlin.DslList<com.google.protobuf.Any, EvidenceProxy>.clear() {
      _builder.clearEvidence()
    }}
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.evidence.v1beta1.Genesis.GenesisState.copy(block: cosmos.evidence.v1beta1.GenesisStateKt.Dsl.() -> kotlin.Unit): cosmos.evidence.v1beta1.Genesis.GenesisState =
  cosmos.evidence.v1beta1.GenesisStateKt.Dsl._create(this.toBuilder()).apply { block() }._build()
