# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/base/snapshots/v1beta1/snapshot.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n,cosmos/base/snapshots/v1beta1/snapshot.proto\x12\x1d\x63osmos.base.snapshots.v1beta1\x1a\x14gogoproto/gogo.proto\"\xb1\x01\n\x08Snapshot\x12\x16\n\x06height\x18\x01 \x01(\x04R\x06height\x12\x16\n\x06\x66ormat\x18\x02 \x01(\rR\x06\x66ormat\x12\x16\n\x06\x63hunks\x18\x03 \x01(\rR\x06\x63hunks\x12\x12\n\x04hash\x18\x04 \x01(\x0cR\x04hash\x12I\n\x08metadata\x18\x05 \x01(\x0b\x32\'.cosmos.base.snapshots.v1beta1.MetadataB\x04\xc8\xde\x1f\x00R\x08metadata\"-\n\x08Metadata\x12!\n\x0c\x63hunk_hashes\x18\x01 \x03(\x0cR\x0b\x63hunkHashesB.Z,github.com/cosmos/cosmos-sdk/snapshots/typesb\x06proto3')



_SNAPSHOT = DESCRIPTOR.message_types_by_name['Snapshot']
_METADATA = DESCRIPTOR.message_types_by_name['Metadata']
Snapshot = _reflection.GeneratedProtocolMessageType('Snapshot', (_message.Message,), {
  'DESCRIPTOR' : _SNAPSHOT,
  '__module__' : 'cosmos.base.snapshots.v1beta1.snapshot_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.base.snapshots.v1beta1.Snapshot)
  })
_sym_db.RegisterMessage(Snapshot)

Metadata = _reflection.GeneratedProtocolMessageType('Metadata', (_message.Message,), {
  'DESCRIPTOR' : _METADATA,
  '__module__' : 'cosmos.base.snapshots.v1beta1.snapshot_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.base.snapshots.v1beta1.Metadata)
  })
_sym_db.RegisterMessage(Metadata)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z,github.com/cosmos/cosmos-sdk/snapshots/types'
  _SNAPSHOT.fields_by_name['metadata']._options = None
  _SNAPSHOT.fields_by_name['metadata']._serialized_options = b'\310\336\037\000'
  _SNAPSHOT._serialized_start=102
  _SNAPSHOT._serialized_end=279
  _METADATA._serialized_start=281
  _METADATA._serialized_end=326
# @@protoc_insertion_point(module_scope)
