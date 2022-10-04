# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AlertConditionArgs', 'AlertCondition']

@pulumi.input_type
class AlertConditionArgs:
    def __init__(__self__, *,
                 monitor_id: pulumi.Input[str],
                 policy_id: pulumi.Input[int],
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AlertCondition resource.
        :param pulumi.Input[str] monitor_id: The GUID of the Synthetics monitor to be referenced in the alert condition.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] name: The title of this condition.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        pulumi.set(__self__, "monitor_id", monitor_id)
        pulumi.set(__self__, "policy_id", policy_id)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> pulumi.Input[str]:
        """
        The GUID of the Synthetics monitor to be referenced in the alert condition.
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "monitor_id", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Input[int]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: pulumi.Input[int]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Set whether to enable the alert condition. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of this condition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)


@pulumi.input_type
class _AlertConditionState:
    def __init__(__self__, *,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AlertCondition resources.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] monitor_id: The GUID of the Synthetics monitor to be referenced in the alert condition.
        :param pulumi.Input[str] name: The title of this condition.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if monitor_id is not None:
            pulumi.set(__self__, "monitor_id", monitor_id)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if policy_id is not None:
            pulumi.set(__self__, "policy_id", policy_id)
        if runbook_url is not None:
            pulumi.set(__self__, "runbook_url", runbook_url)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Set whether to enable the alert condition. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> Optional[pulumi.Input[str]]:
        """
        The GUID of the Synthetics monitor to be referenced in the alert condition.
        """
        return pulumi.get(self, "monitor_id")

    @monitor_id.setter
    def monitor_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "monitor_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The title of this condition.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> Optional[pulumi.Input[int]]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @policy_id.setter
    def policy_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "policy_id", value)

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> Optional[pulumi.Input[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

    @runbook_url.setter
    def runbook_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "runbook_url", value)


class AlertCondition(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        Use this resource to create and manage synthetics alert conditions in New Relic.

        > **NOTE:** The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. Other condition types may be deprecated in the future and receive fewer product updates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.AlertCondition("foo",
            policy_id=newrelic_alert_policy["foo"]["id"],
            monitor_id=newrelic_synthetics_monitor["foo"]["id"],
            runbook_url="https://www.example.com")
        ```

        ## Import

        Synthetics alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.

        ```sh
         $ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] monitor_id: The GUID of the Synthetics monitor to be referenced in the alert condition.
        :param pulumi.Input[str] name: The title of this condition.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertConditionArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        Use this resource to create and manage synthetics alert conditions in New Relic.

        > **NOTE:** The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. Other condition types may be deprecated in the future and receive fewer product updates.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.synthetics.AlertCondition("foo",
            policy_id=newrelic_alert_policy["foo"]["id"],
            monitor_id=newrelic_synthetics_monitor["foo"]["id"],
            runbook_url="https://www.example.com")
        ```

        ## Import

        Synthetics alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.

        ```sh
         $ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
        ```

        :param str resource_name: The name of the resource.
        :param AlertConditionArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertConditionArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 monitor_id: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[int]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertConditionArgs.__new__(AlertConditionArgs)

            __props__.__dict__["enabled"] = enabled
            if monitor_id is None and not opts.urn:
                raise TypeError("Missing required property 'monitor_id'")
            __props__.__dict__["monitor_id"] = monitor_id
            __props__.__dict__["name"] = name
            if policy_id is None and not opts.urn:
                raise TypeError("Missing required property 'policy_id'")
            __props__.__dict__["policy_id"] = policy_id
            __props__.__dict__["runbook_url"] = runbook_url
        super(AlertCondition, __self__).__init__(
            'newrelic:synthetics/alertCondition:AlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            monitor_id: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[int]] = None,
            runbook_url: Optional[pulumi.Input[str]] = None) -> 'AlertCondition':
        """
        Get an existing AlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] monitor_id: The GUID of the Synthetics monitor to be referenced in the alert condition.
        :param pulumi.Input[str] name: The title of this condition.
        :param pulumi.Input[int] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertConditionState.__new__(_AlertConditionState)

        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["monitor_id"] = monitor_id
        __props__.__dict__["name"] = name
        __props__.__dict__["policy_id"] = policy_id
        __props__.__dict__["runbook_url"] = runbook_url
        return AlertCondition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Set whether to enable the alert condition. Defaults to `true`.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter(name="monitorId")
    def monitor_id(self) -> pulumi.Output[str]:
        """
        The GUID of the Synthetics monitor to be referenced in the alert condition.
        """
        return pulumi.get(self, "monitor_id")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The title of this condition.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[int]:
        """
        The ID of the policy where this condition should be used.
        """
        return pulumi.get(self, "policy_id")

    @property
    @pulumi.getter(name="runbookUrl")
    def runbook_url(self) -> pulumi.Output[Optional[str]]:
        """
        Runbook URL to display in notifications.
        """
        return pulumi.get(self, "runbook_url")

