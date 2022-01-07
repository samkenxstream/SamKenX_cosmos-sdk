# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/mint/v1beta1/query.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.api import annotations_pb2 as google_dot_api_dot_annotations__pb2
from cosmos.mint.v1beta1 import mint_pb2 as cosmos_dot_mint_dot_v1beta1_dot_mint__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\x1f\x63osmos/mint/v1beta1/query.proto\x12\x13\x63osmos.mint.v1beta1\x1a\x14gogoproto/gogo.proto\x1a\x1cgoogle/api/annotations.proto\x1a\x1e\x63osmos/mint/v1beta1/mint.proto\"\x14\n\x12QueryParamsRequest\"P\n\x13QueryParamsResponse\x12\x39\n\x06params\x18\x01 \x01(\x0b\x32\x1b.cosmos.mint.v1beta1.ParamsB\x04\xc8\xde\x1f\x00R\x06params\"\x17\n\x15QueryInflationRequest\"f\n\x16QueryInflationResponse\x12L\n\tinflation\x18\x01 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\tinflation\"\x1e\n\x1cQueryAnnualProvisionsRequest\"|\n\x1dQueryAnnualProvisionsResponse\x12[\n\x11\x61nnual_provisions\x18\x01 \x01(\x0c\x42.\xc8\xde\x1f\x00\xda\xde\x1f&github.com/cosmos/cosmos-sdk/types.DecR\x10\x61nnualProvisions2\xc5\x03\n\x05Query\x12\x80\x01\n\x06Params\x12\'.cosmos.mint.v1beta1.QueryParamsRequest\x1a(.cosmos.mint.v1beta1.QueryParamsResponse\"#\x82\xd3\xe4\x93\x02\x1d\x12\x1b/cosmos/mint/v1beta1/params\x12\x8c\x01\n\tInflation\x12*.cosmos.mint.v1beta1.QueryInflationRequest\x1a+.cosmos.mint.v1beta1.QueryInflationResponse\"&\x82\xd3\xe4\x93\x02 \x12\x1e/cosmos/mint/v1beta1/inflation\x12\xa9\x01\n\x10\x41nnualProvisions\x12\x31.cosmos.mint.v1beta1.QueryAnnualProvisionsRequest\x1a\x32.cosmos.mint.v1beta1.QueryAnnualProvisionsResponse\".\x82\xd3\xe4\x93\x02(\x12&/cosmos/mint/v1beta1/annual_provisionsB+Z)github.com/cosmos/cosmos-sdk/x/mint/typesb\x06proto3')



_QUERYPARAMSREQUEST = DESCRIPTOR.message_types_by_name['QueryParamsRequest']
_QUERYPARAMSRESPONSE = DESCRIPTOR.message_types_by_name['QueryParamsResponse']
_QUERYINFLATIONREQUEST = DESCRIPTOR.message_types_by_name['QueryInflationRequest']
_QUERYINFLATIONRESPONSE = DESCRIPTOR.message_types_by_name['QueryInflationResponse']
_QUERYANNUALPROVISIONSREQUEST = DESCRIPTOR.message_types_by_name['QueryAnnualProvisionsRequest']
_QUERYANNUALPROVISIONSRESPONSE = DESCRIPTOR.message_types_by_name['QueryAnnualProvisionsResponse']
QueryParamsRequest = _reflection.GeneratedProtocolMessageType('QueryParamsRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYPARAMSREQUEST,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryParamsRequest)
  })
_sym_db.RegisterMessage(QueryParamsRequest)

QueryParamsResponse = _reflection.GeneratedProtocolMessageType('QueryParamsResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYPARAMSRESPONSE,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryParamsResponse)
  })
_sym_db.RegisterMessage(QueryParamsResponse)

QueryInflationRequest = _reflection.GeneratedProtocolMessageType('QueryInflationRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYINFLATIONREQUEST,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryInflationRequest)
  })
_sym_db.RegisterMessage(QueryInflationRequest)

QueryInflationResponse = _reflection.GeneratedProtocolMessageType('QueryInflationResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYINFLATIONRESPONSE,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryInflationResponse)
  })
_sym_db.RegisterMessage(QueryInflationResponse)

QueryAnnualProvisionsRequest = _reflection.GeneratedProtocolMessageType('QueryAnnualProvisionsRequest', (_message.Message,), {
  'DESCRIPTOR' : _QUERYANNUALPROVISIONSREQUEST,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryAnnualProvisionsRequest)
  })
_sym_db.RegisterMessage(QueryAnnualProvisionsRequest)

QueryAnnualProvisionsResponse = _reflection.GeneratedProtocolMessageType('QueryAnnualProvisionsResponse', (_message.Message,), {
  'DESCRIPTOR' : _QUERYANNUALPROVISIONSRESPONSE,
  '__module__' : 'cosmos.mint.v1beta1.query_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.mint.v1beta1.QueryAnnualProvisionsResponse)
  })
_sym_db.RegisterMessage(QueryAnnualProvisionsResponse)

_QUERY = DESCRIPTOR.services_by_name['Query']
if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z)github.com/cosmos/cosmos-sdk/x/mint/types'
  _QUERYPARAMSRESPONSE.fields_by_name['params']._options = None
  _QUERYPARAMSRESPONSE.fields_by_name['params']._serialized_options = b'\310\336\037\000'
  _QUERYINFLATIONRESPONSE.fields_by_name['inflation']._options = None
  _QUERYINFLATIONRESPONSE.fields_by_name['inflation']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _QUERYANNUALPROVISIONSRESPONSE.fields_by_name['annual_provisions']._options = None
  _QUERYANNUALPROVISIONSRESPONSE.fields_by_name['annual_provisions']._serialized_options = b'\310\336\037\000\332\336\037&github.com/cosmos/cosmos-sdk/types.Dec'
  _QUERY.methods_by_name['Params']._options = None
  _QUERY.methods_by_name['Params']._serialized_options = b'\202\323\344\223\002\035\022\033/cosmos/mint/v1beta1/params'
  _QUERY.methods_by_name['Inflation']._options = None
  _QUERY.methods_by_name['Inflation']._serialized_options = b'\202\323\344\223\002 \022\036/cosmos/mint/v1beta1/inflation'
  _QUERY.methods_by_name['AnnualProvisions']._options = None
  _QUERY.methods_by_name['AnnualProvisions']._serialized_options = b'\202\323\344\223\002(\022&/cosmos/mint/v1beta1/annual_provisions'
  _QUERYPARAMSREQUEST._serialized_start=140
  _QUERYPARAMSREQUEST._serialized_end=160
  _QUERYPARAMSRESPONSE._serialized_start=162
  _QUERYPARAMSRESPONSE._serialized_end=242
  _QUERYINFLATIONREQUEST._serialized_start=244
  _QUERYINFLATIONREQUEST._serialized_end=267
  _QUERYINFLATIONRESPONSE._serialized_start=269
  _QUERYINFLATIONRESPONSE._serialized_end=371
  _QUERYANNUALPROVISIONSREQUEST._serialized_start=373
  _QUERYANNUALPROVISIONSREQUEST._serialized_end=403
  _QUERYANNUALPROVISIONSRESPONSE._serialized_start=405
  _QUERYANNUALPROVISIONSRESPONSE._serialized_end=529
  _QUERY._serialized_start=532
  _QUERY._serialized_end=985
# @@protoc_insertion_point(module_scope)
