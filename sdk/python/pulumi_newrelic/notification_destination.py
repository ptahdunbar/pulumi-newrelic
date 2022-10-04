# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['NotificationDestinationArgs', 'NotificationDestination']

@pulumi.input_type
class NotificationDestinationArgs:
    def __init__(__self__, *,
                 properties: pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]],
                 type: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 auth_basic: Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']] = None,
                 auth_token: Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a NotificationDestination resource.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]] properties: A nested block that describes a notification destination property. See Nested property blocks below for details.
        :param pulumi.Input[str] type: (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
               PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        :param pulumi.Input[int] account_id: Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[bool] active: Indicates whether the destination is active.
        :param pulumi.Input['NotificationDestinationAuthBasicArgs'] auth_basic: A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        :param pulumi.Input['NotificationDestinationAuthTokenArgs'] auth_token: A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        :param pulumi.Input[str] name: The name of the destination.
        """
        pulumi.set(__self__, "properties", properties)
        pulumi.set(__self__, "type", type)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if auth_basic is not None:
            pulumi.set(__self__, "auth_basic", auth_basic)
        if auth_token is not None:
            pulumi.set(__self__, "auth_token", auth_token)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]]:
        """
        A nested block that describes a notification destination property. See Nested property blocks below for details.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def type(self) -> pulumi.Input[str]:
        """
        (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
        PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: pulumi.Input[str]):
        pulumi.set(self, "type", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the destination is active.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="authBasic")
    def auth_basic(self) -> Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']]:
        """
        A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        """
        return pulumi.get(self, "auth_basic")

    @auth_basic.setter
    def auth_basic(self, value: Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']]):
        pulumi.set(self, "auth_basic", value)

    @property
    @pulumi.getter(name="authToken")
    def auth_token(self) -> Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']]:
        """
        A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        """
        return pulumi.get(self, "auth_token")

    @auth_token.setter
    def auth_token(self, value: Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']]):
        pulumi.set(self, "auth_token", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the destination.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _NotificationDestinationState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 auth_basic: Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']] = None,
                 auth_token: Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']] = None,
                 last_sent: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]]] = None,
                 status: Optional[pulumi.Input[str]] = None,
                 type: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering NotificationDestination resources.
        :param pulumi.Input[int] account_id: Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[bool] active: Indicates whether the destination is active.
        :param pulumi.Input['NotificationDestinationAuthBasicArgs'] auth_basic: A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        :param pulumi.Input['NotificationDestinationAuthTokenArgs'] auth_token: A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        :param pulumi.Input[str] last_sent: The last time a notification was sent.
        :param pulumi.Input[str] name: The name of the destination.
        :param pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]] properties: A nested block that describes a notification destination property. See Nested property blocks below for details.
        :param pulumi.Input[str] status: The status of the destination.
        :param pulumi.Input[str] type: (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
               PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if active is not None:
            pulumi.set(__self__, "active", active)
        if auth_basic is not None:
            pulumi.set(__self__, "auth_basic", auth_basic)
        if auth_token is not None:
            pulumi.set(__self__, "auth_token", auth_token)
        if last_sent is not None:
            pulumi.set(__self__, "last_sent", last_sent)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if properties is not None:
            pulumi.set(__self__, "properties", properties)
        if status is not None:
            pulumi.set(__self__, "status", status)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def active(self) -> Optional[pulumi.Input[bool]]:
        """
        Indicates whether the destination is active.
        """
        return pulumi.get(self, "active")

    @active.setter
    def active(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "active", value)

    @property
    @pulumi.getter(name="authBasic")
    def auth_basic(self) -> Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']]:
        """
        A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        """
        return pulumi.get(self, "auth_basic")

    @auth_basic.setter
    def auth_basic(self, value: Optional[pulumi.Input['NotificationDestinationAuthBasicArgs']]):
        pulumi.set(self, "auth_basic", value)

    @property
    @pulumi.getter(name="authToken")
    def auth_token(self) -> Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']]:
        """
        A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        """
        return pulumi.get(self, "auth_token")

    @auth_token.setter
    def auth_token(self, value: Optional[pulumi.Input['NotificationDestinationAuthTokenArgs']]):
        pulumi.set(self, "auth_token", value)

    @property
    @pulumi.getter(name="lastSent")
    def last_sent(self) -> Optional[pulumi.Input[str]]:
        """
        The last time a notification was sent.
        """
        return pulumi.get(self, "last_sent")

    @last_sent.setter
    def last_sent(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "last_sent", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the destination.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def properties(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]]]:
        """
        A nested block that describes a notification destination property. See Nested property blocks below for details.
        """
        return pulumi.get(self, "properties")

    @properties.setter
    def properties(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['NotificationDestinationPropertyArgs']]]]):
        pulumi.set(self, "properties", value)

    @property
    @pulumi.getter
    def status(self) -> Optional[pulumi.Input[str]]:
        """
        The status of the destination.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def type(self) -> Optional[pulumi.Input[str]]:
        """
        (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
        PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        return pulumi.get(self, "type")

    @type.setter
    def type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "type", value)


class NotificationDestination(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 auth_basic: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthBasicArgs']]] = None,
                 auth_token: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthTokenArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationDestinationPropertyArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Create a NotificationDestination resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[bool] active: Indicates whether the destination is active.
        :param pulumi.Input[pulumi.InputType['NotificationDestinationAuthBasicArgs']] auth_basic: A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        :param pulumi.Input[pulumi.InputType['NotificationDestinationAuthTokenArgs']] auth_token: A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        :param pulumi.Input[str] name: The name of the destination.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationDestinationPropertyArgs']]]] properties: A nested block that describes a notification destination property. See Nested property blocks below for details.
        :param pulumi.Input[str] type: (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
               PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: NotificationDestinationArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Create a NotificationDestination resource with the given unique name, props, and options.
        :param str resource_name: The name of the resource.
        :param NotificationDestinationArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(NotificationDestinationArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 active: Optional[pulumi.Input[bool]] = None,
                 auth_basic: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthBasicArgs']]] = None,
                 auth_token: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthTokenArgs']]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationDestinationPropertyArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = NotificationDestinationArgs.__new__(NotificationDestinationArgs)

            __props__.__dict__["account_id"] = account_id
            __props__.__dict__["active"] = active
            __props__.__dict__["auth_basic"] = auth_basic
            __props__.__dict__["auth_token"] = auth_token
            __props__.__dict__["name"] = name
            if properties is None and not opts.urn:
                raise TypeError("Missing required property 'properties'")
            __props__.__dict__["properties"] = properties
            if type is None and not opts.urn:
                raise TypeError("Missing required property 'type'")
            __props__.__dict__["type"] = type
            __props__.__dict__["last_sent"] = None
            __props__.__dict__["status"] = None
        super(NotificationDestination, __self__).__init__(
            'newrelic:index/notificationDestination:NotificationDestination',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            active: Optional[pulumi.Input[bool]] = None,
            auth_basic: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthBasicArgs']]] = None,
            auth_token: Optional[pulumi.Input[pulumi.InputType['NotificationDestinationAuthTokenArgs']]] = None,
            last_sent: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            properties: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationDestinationPropertyArgs']]]]] = None,
            status: Optional[pulumi.Input[str]] = None,
            type: Optional[pulumi.Input[str]] = None) -> 'NotificationDestination':
        """
        Get an existing NotificationDestination resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        :param pulumi.Input[bool] active: Indicates whether the destination is active.
        :param pulumi.Input[pulumi.InputType['NotificationDestinationAuthBasicArgs']] auth_basic: A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        :param pulumi.Input[pulumi.InputType['NotificationDestinationAuthTokenArgs']] auth_token: A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        :param pulumi.Input[str] last_sent: The last time a notification was sent.
        :param pulumi.Input[str] name: The name of the destination.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['NotificationDestinationPropertyArgs']]]] properties: A nested block that describes a notification destination property. See Nested property blocks below for details.
        :param pulumi.Input[str] status: The status of the destination.
        :param pulumi.Input[str] type: (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
               PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _NotificationDestinationState.__new__(_NotificationDestinationState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["active"] = active
        __props__.__dict__["auth_basic"] = auth_basic
        __props__.__dict__["auth_token"] = auth_token
        __props__.__dict__["last_sent"] = last_sent
        __props__.__dict__["name"] = name
        __props__.__dict__["properties"] = properties
        __props__.__dict__["status"] = status
        __props__.__dict__["type"] = type
        return NotificationDestination(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def active(self) -> pulumi.Output[Optional[bool]]:
        """
        Indicates whether the destination is active.
        """
        return pulumi.get(self, "active")

    @property
    @pulumi.getter(name="authBasic")
    def auth_basic(self) -> pulumi.Output[Optional['outputs.NotificationDestinationAuthBasic']]:
        """
        A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
        """
        return pulumi.get(self, "auth_basic")

    @property
    @pulumi.getter(name="authToken")
    def auth_token(self) -> pulumi.Output[Optional['outputs.NotificationDestinationAuthToken']]:
        """
        A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
        """
        return pulumi.get(self, "auth_token")

    @property
    @pulumi.getter(name="lastSent")
    def last_sent(self) -> pulumi.Output[str]:
        """
        The last time a notification was sent.
        """
        return pulumi.get(self, "last_sent")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the destination.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def properties(self) -> pulumi.Output[Sequence['outputs.NotificationDestinationProperty']]:
        """
        A nested block that describes a notification destination property. See Nested property blocks below for details.
        """
        return pulumi.get(self, "properties")

    @property
    @pulumi.getter
    def status(self) -> pulumi.Output[str]:
        """
        The status of the destination.
        """
        return pulumi.get(self, "status")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
        PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
        """
        return pulumi.get(self, "type")

