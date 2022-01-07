//Generated by the protocol buffer compiler. DO NOT EDIT!
// source: cosmos/gov/v1beta2/query.proto

package cosmos.gov.v1beta2;

@kotlin.jvm.JvmSynthetic
public inline fun queryVoteResponse(block: cosmos.gov.v1beta2.QueryVoteResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse =
  cosmos.gov.v1beta2.QueryVoteResponseKt.Dsl._create(cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse.newBuilder()).apply { block() }._build()
public object QueryVoteResponseKt {
  @kotlin.OptIn(com.google.protobuf.kotlin.OnlyForUseByGeneratedProtoCode::class)
  @com.google.protobuf.kotlin.ProtoDslMarker
  public class Dsl private constructor(
    private val _builder: cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse.Builder
  ) {
    public companion object {
      @kotlin.jvm.JvmSynthetic
      @kotlin.PublishedApi
      internal fun _create(builder: cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse.Builder): Dsl = Dsl(builder)
    }

    @kotlin.jvm.JvmSynthetic
    @kotlin.PublishedApi
    internal fun _build(): cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse = _builder.build()

    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Vote vote = 1 [json_name = "vote"];</code>
     */
    public var vote: cosmos.gov.v1beta2.Gov.Vote
      @JvmName("getVote")
      get() = _builder.getVote()
      @JvmName("setVote")
      set(value) {
        _builder.setVote(value)
      }
    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Vote vote = 1 [json_name = "vote"];</code>
     */
    public fun clearVote() {
      _builder.clearVote()
    }
    /**
     * <pre>
     * vote defined the queried vote.
     * </pre>
     *
     * <code>.cosmos.gov.v1beta2.Vote vote = 1 [json_name = "vote"];</code>
     * @return Whether the vote field is set.
     */
    public fun hasVote(): kotlin.Boolean {
      return _builder.hasVote()
    }
  }
}
@kotlin.jvm.JvmSynthetic
public inline fun cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse.copy(block: cosmos.gov.v1beta2.QueryVoteResponseKt.Dsl.() -> kotlin.Unit): cosmos.gov.v1beta2.QueryOuterClass.QueryVoteResponse =
  cosmos.gov.v1beta2.QueryVoteResponseKt.Dsl._create(this.toBuilder()).apply { block() }._build()
