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

__all__ = ['AlertMutingRuleArgs', 'AlertMutingRule']

@pulumi.input_type
class AlertMutingRuleArgs:
    def __init__(__self__, *,
                 condition: pulumi.Input['AlertMutingRuleConditionArgs'],
                 enabled: pulumi.Input[bool],
                 account_id: Optional[pulumi.Input[int]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']] = None):
        """
        The set of arguments for constructing a AlertMutingRule resource.
        :param pulumi.Input['AlertMutingRuleConditionArgs'] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[int] account_id: The account id of the MutingRule.
        :param pulumi.Input[str] description: The description of the MutingRule.
        :param pulumi.Input[str] name: The name of the MutingRule.
        :param pulumi.Input['AlertMutingRuleScheduleArgs'] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        pulumi.set(__self__, "condition", condition)
        pulumi.set(__self__, "enabled", enabled)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Input['AlertMutingRuleConditionArgs']:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: pulumi.Input['AlertMutingRuleConditionArgs']):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)


@pulumi.input_type
class _AlertMutingRuleState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 condition: Optional[pulumi.Input['AlertMutingRuleConditionArgs']] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']] = None):
        """
        Input properties used for looking up and filtering AlertMutingRule resources.
        :param pulumi.Input[int] account_id: The account id of the MutingRule.
        :param pulumi.Input['AlertMutingRuleConditionArgs'] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[str] description: The description of the MutingRule.
        :param pulumi.Input[bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[str] name: The name of the MutingRule.
        :param pulumi.Input['AlertMutingRuleScheduleArgs'] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if condition is not None:
            pulumi.set(__self__, "condition", condition)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if enabled is not None:
            pulumi.set(__self__, "enabled", enabled)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if schedule is not None:
            pulumi.set(__self__, "schedule", schedule)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def condition(self) -> Optional[pulumi.Input['AlertMutingRuleConditionArgs']]:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @condition.setter
    def condition(self, value: Optional[pulumi.Input['AlertMutingRuleConditionArgs']]):
        pulumi.set(self, "condition", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def enabled(self) -> Optional[pulumi.Input[bool]]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: Optional[pulumi.Input[bool]]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter
    def schedule(self) -> Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

    @schedule.setter
    def schedule(self, value: Optional[pulumi.Input['AlertMutingRuleScheduleArgs']]):
        pulumi.set(self, "schedule", value)


class AlertMutingRule(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 condition: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleConditionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleScheduleArgs']]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertMutingRule("foo",
            condition=newrelic.AlertMutingRuleConditionArgs(
                conditions=[
                    newrelic.AlertMutingRuleConditionConditionArgs(
                        attribute="product",
                        operator="EQUALS",
                        values=["APM"],
                    ),
                    newrelic.AlertMutingRuleConditionConditionArgs(
                        attribute="targetId",
                        operator="EQUALS",
                        values=["Muted"],
                    ),
                ],
                operator="AND",
            ),
            description="muting rule test.",
            enabled=True,
            schedule=newrelic.AlertMutingRuleScheduleArgs(
                end_time="2021-01-28T16:30:00",
                repeat="WEEKLY",
                repeat_count=42,
                start_time="2021-01-28T15:30:00",
                time_zone="America/Los_Angeles",
                weekly_repeat_days=[
                    "MONDAY",
                    "WEDNESDAY",
                    "FRIDAY",
                ],
            ))
        ```

        ## Import

        Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.

        ```sh
         $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id of the MutingRule.
        :param pulumi.Input[pulumi.InputType['AlertMutingRuleConditionArgs']] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[str] description: The description of the MutingRule.
        :param pulumi.Input[bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[str] name: The name of the MutingRule.
        :param pulumi.Input[pulumi.InputType['AlertMutingRuleScheduleArgs']] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AlertMutingRuleArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.AlertMutingRule("foo",
            condition=newrelic.AlertMutingRuleConditionArgs(
                conditions=[
                    newrelic.AlertMutingRuleConditionConditionArgs(
                        attribute="product",
                        operator="EQUALS",
                        values=["APM"],
                    ),
                    newrelic.AlertMutingRuleConditionConditionArgs(
                        attribute="targetId",
                        operator="EQUALS",
                        values=["Muted"],
                    ),
                ],
                operator="AND",
            ),
            description="muting rule test.",
            enabled=True,
            schedule=newrelic.AlertMutingRuleScheduleArgs(
                end_time="2021-01-28T16:30:00",
                repeat="WEEKLY",
                repeat_count=42,
                start_time="2021-01-28T15:30:00",
                time_zone="America/Los_Angeles",
                weekly_repeat_days=[
                    "MONDAY",
                    "WEDNESDAY",
                    "FRIDAY",
                ],
            ))
        ```

        ## Import

        Alert conditions can be imported using a composite ID of `<account_id>:<muting_rule_id>`, e.g.

        ```sh
         $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
        ```

        :param str resource_name: The name of the resource.
        :param AlertMutingRuleArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AlertMutingRuleArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 condition: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleConditionArgs']]] = None,
                 description: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 schedule: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleScheduleArgs']]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AlertMutingRuleArgs.__new__(AlertMutingRuleArgs)

            __props__.__dict__["account_id"] = account_id
            if condition is None and not opts.urn:
                raise TypeError("Missing required property 'condition'")
            __props__.__dict__["condition"] = condition
            __props__.__dict__["description"] = description
            if enabled is None and not opts.urn:
                raise TypeError("Missing required property 'enabled'")
            __props__.__dict__["enabled"] = enabled
            __props__.__dict__["name"] = name
            __props__.__dict__["schedule"] = schedule
        super(AlertMutingRule, __self__).__init__(
            'newrelic:index/alertMutingRule:AlertMutingRule',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            condition: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleConditionArgs']]] = None,
            description: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            name: Optional[pulumi.Input[str]] = None,
            schedule: Optional[pulumi.Input[pulumi.InputType['AlertMutingRuleScheduleArgs']]] = None) -> 'AlertMutingRule':
        """
        Get an existing AlertMutingRule resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: The account id of the MutingRule.
        :param pulumi.Input[pulumi.InputType['AlertMutingRuleConditionArgs']] condition: The condition that defines which incidents to target. See Nested condition blocks below for details.
        :param pulumi.Input[str] description: The description of the MutingRule.
        :param pulumi.Input[bool] enabled: Whether the MutingRule is enabled.
        :param pulumi.Input[str] name: The name of the MutingRule.
        :param pulumi.Input[pulumi.InputType['AlertMutingRuleScheduleArgs']] schedule: Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AlertMutingRuleState.__new__(_AlertMutingRuleState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["condition"] = condition
        __props__.__dict__["description"] = description
        __props__.__dict__["enabled"] = enabled
        __props__.__dict__["name"] = name
        __props__.__dict__["schedule"] = schedule
        return AlertMutingRule(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The account id of the MutingRule.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter
    def condition(self) -> pulumi.Output['outputs.AlertMutingRuleCondition']:
        """
        The condition that defines which incidents to target. See Nested condition blocks below for details.
        """
        return pulumi.get(self, "condition")

    @property
    @pulumi.getter
    def description(self) -> pulumi.Output[Optional[str]]:
        """
        The description of the MutingRule.
        """
        return pulumi.get(self, "description")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[bool]:
        """
        Whether the MutingRule is enabled.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the MutingRule.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter
    def schedule(self) -> pulumi.Output[Optional['outputs.AlertMutingRuleSchedule']]:
        """
        Specify a schedule for enabling the MutingRule. See Schedule below for details
        """
        return pulumi.get(self, "schedule")

