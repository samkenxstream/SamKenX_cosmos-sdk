//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/base/reflection/v2alpha1/reflection.proto

package cosmos.base.reflection.v2alpha1;

@kotlin.jvm.JvmSynthetic
public inline fun getConfigurationDescriptorRequest(block: cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest =
  cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequestKt.Dsl._create(cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest.newBuilder()).apply { block() }._build()
public object GetConfigurationDescriptorRequestKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest = _builder.build()
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest.copy(block: cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequestKt.Dsl.() -> kotlin.Unit): cosmos.base.reflection.v2alpha1.Reflection.GetConfigurationDescriptorRequest =
  cosmos.base.reflection.v2alpha1.GetConfigurationDescriptorRequestKt.Dsl._create(this.toBuilder()).apply { block() }._build()
