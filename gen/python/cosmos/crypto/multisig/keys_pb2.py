# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: cosmos/crypto/multisig/keys.proto
"""Generated protocol buffer code."""
from google.protobuf import descriptor as _descriptor
from google.protobuf import descriptor_pool as _descriptor_pool
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from gogoproto import gogo_pb2 as gogoproto_dot_gogo__pb2
from google.protobuf import any_pb2 as google_dot_protobuf_dot_any__pb2


DESCRIPTOR = _descriptor_pool.Default().AddSerializedFile(b'\n!cosmos/crypto/multisig/keys.proto\x12\x16\x63osmos.crypto.multisig\x1a\x14gogoproto/gogo.proto\x1a\x19google/protobuf/any.proto\"{\n\x11LegacyAminoPubKey\x12\x1c\n\tthreshold\x18\x01 \x01(\rR\tthreshold\x12\x42\n\x0bpublic_keys\x18\x02 \x03(\x0b\x32\x14.google.protobuf.AnyB\x0b\xe2\xde\x1f\x07PubKeysR\npublicKeys:\x04\x88\xa0\x1f\x00\x42\x33Z1github.com/cosmos/cosmos-sdk/crypto/keys/multisigb\x06proto3')



_LEGACYAMINOPUBKEY = DESCRIPTOR.message_types_by_name['LegacyAminoPubKey']
LegacyAminoPubKey = _reflection.GeneratedProtocolMessageType('LegacyAminoPubKey', (_message.Message,), {
  'DESCRIPTOR' : _LEGACYAMINOPUBKEY,
  '__module__' : 'cosmos.crypto.multisig.keys_pb2'
  # @@protoc_insertion_point(class_scope:cosmos.crypto.multisig.LegacyAminoPubKey)
  })
_sym_db.RegisterMessage(LegacyAminoPubKey)

if _descriptor._USE_C_DESCRIPTORS == False:

  DESCRIPTOR._options = None
  DESCRIPTOR._serialized_options = b'Z1github.com/cosmos/cosmos-sdk/crypto/keys/multisig'
  _LEGACYAMINOPUBKEY.fields_by_name['public_keys']._options = None
  _LEGACYAMINOPUBKEY.fields_by_name['public_keys']._serialized_options = b'\342\336\037\007PubKeys'
  _LEGACYAMINOPUBKEY._options = None
  _LEGACYAMINOPUBKEY._serialized_options = b'\210\240\037\000'
  _LEGACYAMINOPUBKEY._serialized_start=110
  _LEGACYAMINOPUBKEY._serialized_end=233
# @@protoc_insertion_point(module_scope)
