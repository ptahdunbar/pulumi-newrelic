# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities

__all__ = [
    'GetAlertPolicyResult',
    'AwaitableGetAlertPolicyResult',
    'get_alert_policy',
    'get_alert_policy_output',
]

@pulumi.output_type
class GetAlertPolicyResult:
    """
    A collection of values returned by getAlertPolicy.
    """
    def __init__(__self__, account_id=None, created_at=None, id=None, incident_preference=None, name=None, updated_at=None):
        if account_id and not isinstance(account_id, int):
            raise TypeError("Expected argument 'account_id' to be a int")
        pulumi.set(__self__, "account_id", account_id)
        if created_at and not isinstance(created_at, str):
            raise TypeError("Expected argument 'created_at' to be a str")
        pulumi.set(__self__, "created_at", created_at)
        if id and not isinstance(id, str):
            raise TypeError("Expected argument 'id' to be a str")
        pulumi.set(__self__, "id", id)
        if incident_preference and not isinstance(incident_preference, str):
            raise TypeError("Expected argument 'incident_preference' to be a str")
        pulumi.set(__self__, "incident_preference", incident_preference)
        if name and not isinstance(name, str):
            raise TypeError("Expected argument 'name' to be a str")
        pulumi.set(__self__, "name", name)
        if updated_at and not isinstance(updated_at, str):
            raise TypeError("Expected argument 'updated_at' to be a str")
        pulumi.set(__self__, "updated_at", updated_at)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> int:
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="createdAt")
    def created_at(self) -> str:
        """
        The time the policy was created.
        """
        return pulumi.get(self, "created_at")

    @property
    @pulumi.getter
    def id(self) -> str:
        """
        The provider-assigned unique ID for this managed resource.
        """
        return pulumi.get(self, "id")

    @property
    @pulumi.getter(name="incidentPreference")
    def incident_preference(self) -> Optional[str]:
        """
        The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
        """
        return pulumi.get(self, "incident_preference")

    @property
    @pulumi.getter
    def name(self) -> str:
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="updatedAt")
    def updated_at(self) -> str:
        """
        The time the policy was last updated.
        """
        return pulumi.get(self, "updated_at")


class AwaitableGetAlertPolicyResult(GetAlertPolicyResult):
    # pylint: disable=using-constant-test
    def __await__(self):
        if False:
            yield self
        return GetAlertPolicyResult(
            account_id=self.account_id,
            created_at=self.created_at,
            id=self.id,
            incident_preference=self.incident_preference,
            name=self.name,
            updated_at=self.updated_at)


def get_alert_policy(account_id: Optional[int] = None,
                     incident_preference: Optional[str] = None,
                     name: Optional[str] = None,
                     opts: Optional[pulumi.InvokeOptions] = None) -> AwaitableGetAlertPolicyResult:
    """
    Use this data source to get information about a specific alert policy in New Relic that already exists.


    :param int account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param str incident_preference: The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
    :param str name: The name of the alert policy in New Relic.
    """
    __args__ = dict()
    __args__['accountId'] = account_id
    __args__['incidentPreference'] = incident_preference
    __args__['name'] = name
    opts = pulumi.InvokeOptions.merge(_utilities.get_invoke_opts_defaults(), opts)
    __ret__ = pulumi.runtime.invoke('newrelic:index/getAlertPolicy:getAlertPolicy', __args__, opts=opts, typ=GetAlertPolicyResult).value

    return AwaitableGetAlertPolicyResult(
        account_id=__ret__.account_id,
        created_at=__ret__.created_at,
        id=__ret__.id,
        incident_preference=__ret__.incident_preference,
        name=__ret__.name,
        updated_at=__ret__.updated_at)


@_utilities.lift_output_func(get_alert_policy)
def get_alert_policy_output(account_id: Optional[pulumi.Input[Optional[int]]] = None,
                            incident_preference: Optional[pulumi.Input[Optional[str]]] = None,
                            name: Optional[pulumi.Input[str]] = None,
                            opts: Optional[pulumi.InvokeOptions] = None) -> pulumi.Output[GetAlertPolicyResult]:
    """
    Use this data source to get information about a specific alert policy in New Relic that already exists.


    :param int account_id: The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
    :param str incident_preference: The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
    :param str name: The name of the alert policy in New Relic.
    """
    ...
