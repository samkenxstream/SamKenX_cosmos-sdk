# Generated by the gRPC Python protocol compiler plugin. DO NOT EDIT!
"""Client and server classes corresponding to protobuf-defined services."""
import grpc

from cosmos.group.v1beta1 import tx_pb2 as cosmos_dot_group_dot_v1beta1_dot_tx__pb2


class MsgStub(object):
    """Msg is the cosmos.group.v1beta1 Msg service.
    """

    def __init__(self, channel):
        """Constructor.

        Args:
            channel: A grpc.Channel.
        """
        self.CreateGroup = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/CreateGroup',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroup.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupResponse.FromString,
                )
        self.UpdateGroupMembers = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupMembers',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembers.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembersResponse.FromString,
                )
        self.UpdateGroupAdmin = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupAdmin',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdmin.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdminResponse.FromString,
                )
        self.UpdateGroupMetadata = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupMetadata',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadata.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadataResponse.FromString,
                )
        self.CreateGroupPolicy = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/CreateGroupPolicy',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicy.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicyResponse.FromString,
                )
        self.UpdateGroupPolicyAdmin = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyAdmin',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdmin.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdminResponse.FromString,
                )
        self.UpdateGroupPolicyDecisionPolicy = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyDecisionPolicy',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicy.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicyResponse.FromString,
                )
        self.UpdateGroupPolicyMetadata = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyMetadata',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadata.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadataResponse.FromString,
                )
        self.CreateProposal = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/CreateProposal',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposal.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposalResponse.FromString,
                )
        self.Vote = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/Vote',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVote.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVoteResponse.FromString,
                )
        self.Exec = channel.unary_unary(
                '/cosmos.group.v1beta1.Msg/Exec',
                request_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExec.SerializeToString,
                response_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExecResponse.FromString,
                )


class MsgServicer(object):
    """Msg is the cosmos.group.v1beta1 Msg service.
    """

    def CreateGroup(self, request, context):
        """CreateGroup creates a new group with an admin account address, a list of members and some optional metadata.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupMembers(self, request, context):
        """UpdateGroupMembers updates the group members with given group id and admin address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupAdmin(self, request, context):
        """UpdateGroupAdmin updates the group admin with given group id and previous admin address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupMetadata(self, request, context):
        """UpdateGroupMetadata updates the group metadata with given group id and admin address.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateGroupPolicy(self, request, context):
        """CreateGroupPolicy creates a new group policy using given DecisionPolicy.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupPolicyAdmin(self, request, context):
        """UpdateGroupPolicyAdmin updates a group policy admin.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupPolicyDecisionPolicy(self, request, context):
        """UpdateGroupPolicyDecisionPolicy allows a group policy's decision policy to be updated.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def UpdateGroupPolicyMetadata(self, request, context):
        """UpdateGroupPolicyMetadata updates a group policy metadata.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def CreateProposal(self, request, context):
        """CreateProposal submits a new proposal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Vote(self, request, context):
        """Vote allows a voter to vote on a proposal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')

    def Exec(self, request, context):
        """Exec executes a proposal.
        """
        context.set_code(grpc.StatusCode.UNIMPLEMENTED)
        context.set_details('Method not implemented!')
        raise NotImplementedError('Method not implemented!')


def add_MsgServicer_to_server(servicer, server):
    rpc_method_handlers = {
            'CreateGroup': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateGroup,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroup.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupResponse.SerializeToString,
            ),
            'UpdateGroupMembers': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupMembers,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembers.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembersResponse.SerializeToString,
            ),
            'UpdateGroupAdmin': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupAdmin,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdmin.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdminResponse.SerializeToString,
            ),
            'UpdateGroupMetadata': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupMetadata,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadata.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadataResponse.SerializeToString,
            ),
            'CreateGroupPolicy': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateGroupPolicy,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicy.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicyResponse.SerializeToString,
            ),
            'UpdateGroupPolicyAdmin': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupPolicyAdmin,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdmin.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdminResponse.SerializeToString,
            ),
            'UpdateGroupPolicyDecisionPolicy': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupPolicyDecisionPolicy,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicy.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicyResponse.SerializeToString,
            ),
            'UpdateGroupPolicyMetadata': grpc.unary_unary_rpc_method_handler(
                    servicer.UpdateGroupPolicyMetadata,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadata.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadataResponse.SerializeToString,
            ),
            'CreateProposal': grpc.unary_unary_rpc_method_handler(
                    servicer.CreateProposal,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposal.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposalResponse.SerializeToString,
            ),
            'Vote': grpc.unary_unary_rpc_method_handler(
                    servicer.Vote,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVote.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVoteResponse.SerializeToString,
            ),
            'Exec': grpc.unary_unary_rpc_method_handler(
                    servicer.Exec,
                    request_deserializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExec.FromString,
                    response_serializer=cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExecResponse.SerializeToString,
            ),
    }
    generic_handler = grpc.method_handlers_generic_handler(
            'cosmos.group.v1beta1.Msg', rpc_method_handlers)
    server.add_generic_rpc_handlers((generic_handler,))


 # This class is part of an EXPERIMENTAL API.
class Msg(object):
    """Msg is the cosmos.group.v1beta1 Msg service.
    """

    @staticmethod
    def CreateGroup(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/CreateGroup',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroup.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupMembers(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupMembers',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembers.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMembersResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupAdmin(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupAdmin',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdmin.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupAdminResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupMetadata(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupMetadata',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadata.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupMetadataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateGroupPolicy(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/CreateGroupPolicy',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicy.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateGroupPolicyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupPolicyAdmin(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyAdmin',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdmin.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyAdminResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupPolicyDecisionPolicy(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyDecisionPolicy',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicy.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyDecisionPolicyResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def UpdateGroupPolicyMetadata(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/UpdateGroupPolicyMetadata',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadata.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgUpdateGroupPolicyMetadataResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def CreateProposal(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/CreateProposal',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposal.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgCreateProposalResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Vote(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/Vote',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVote.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgVoteResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)

    @staticmethod
    def Exec(request,
            target,
            options=(),
            channel_credentials=None,
            call_credentials=None,
            insecure=False,
            compression=None,
            wait_for_ready=None,
            timeout=None,
            metadata=None):
        return grpc.experimental.unary_unary(request, target, '/cosmos.group.v1beta1.Msg/Exec',
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExec.SerializeToString,
            cosmos_dot_group_dot_v1beta1_dot_tx__pb2.MsgExecResponse.FromString,
            options, channel_credentials,
            insecure, call_credentials, compression, wait_for_ready, timeout, metadata)
