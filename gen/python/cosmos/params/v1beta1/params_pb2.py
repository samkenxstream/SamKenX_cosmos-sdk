# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/params/v1beta1/params.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n\"cosmos/params/v1beta1/params.proto\x12\x15\x63osmos.params.v1beta1\x1a\x14gogoproto/gogo.proto\"\x9f\x01\n\x17ParameterChangeProposal\x12\x14\n\x05title\x18\x01 \x01(\tR\x05title\x12 \n\x0b\x64\x65scription\x18\x02 \x01(\tR\x0b\x64\x65scription\x12\x42\n\x07\x63hanges\x18\x03 \x03(\x0b\x32\".cosmos.params.v1beta1.ParamChangeB\x04\xc8\xde\x1f\x00R\x07\x63hanges:\x08\x88\xa0\x1f\x00\x98\xa0\x1f\x00\"W\n\x0bParamChange\x12\x1a\n\x08subspace\x18\x01 \x01(\tR\x08subspace\x12\x10\n\x03key\x18\x02 \x01(\tR\x03key\x12\x14\n\x05value\x18\x03 \x01(\tR\x05value:\x04\x98\xa0\x1f\x00\x42:Z4github.com/cosmos/cosmos-sdk/x/params/types/proposal\xa8\xe2\x1e\x01\x62\x06proto3')



_PARAMETERCHANGEPROPOSAL = DESCRIPTOR.message_types_by_name['ParameterChangeProposal']
_PARAMCHANGE = DESCRIPTOR.message_types_by_name['ParamChange']
ParameterChangeProposal = _reflection.GeneratedProtocolMessageType('ParameterChangeProposal', (_message.Message,), {
  'DESCRIPTOR' : _PARAMETERCHANGEPROPOSAL,
  '__module__' : 'cosmos.params.v1beta1.params_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.params.v1beta1.ParameterChangeProposal)
  })
_sym_db.RegisterMessage(ParameterChangeProposal)

ParamChange = _reflection.GeneratedProtocolMessageType('ParamChange', (_message.Message,), {
  'DESCRIPTOR' : _PARAMCHANGE,
  '__module__' : 'cosmos.params.v1beta1.params_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.params.v1beta1.ParamChange)
  })
_sym_db.RegisterMessage(ParamChange)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z4github.com/cosmos/cosmos-sdk/x/params/types/proposal\250\342\036\001'
  _PARAMETERCHANGEPROPOSAL.fields_by_name['changes']._options = None
  _PARAMETERCHANGEPROPOSAL.fields_by_name['changes']._serialized_options = b'\310\336\037\000'
  _PARAMETERCHANGEPROPOSAL._options = None
  _PARAMETERCHANGEPROPOSAL._serialized_options = b'\210\240\037\000\230\240\037\000'
  _PARAMCHANGE._options = None
  _PARAMCHANGE._serialized_options = b'\230\240\037\000'
  _PARAMETERCHANGEPROPOSAL._serialized_start=84
  _PARAMETERCHANGEPROPOSAL._serialized_end=243
  _PARAMCHANGE._serialized_start=245
  _PARAMCHANGE._serialized_end=332
# @@protoc_insertion_point(module_scope)
