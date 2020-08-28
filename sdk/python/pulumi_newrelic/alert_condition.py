# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Dict, List, Mapping, Optional, Tuple, Union
from . import _utilities, _tables
from . import outputs
from ._inputs import *

__all__ = ['AlertCondition']


class AlertCondition(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 condition_scope: Optional[pulumi.Input[str]] = None,
                 enabled: Optional[pulumi.Input[bool]] = None,
                 entities: Optional[pulumi.Input[List[pulumi.Input[float]]]] = None,
                 gc_metric: Optional[pulumi.Input[str]] = None,
                 metric: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 policy_id: Optional[pulumi.Input[float]] = None,
                 runbook_url: Optional[pulumi.Input[str]] = None,
                 terms: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]]] = None,
                 type: Optional[pulumi.Input[str]] = None,
                 user_defined_metric: Optional[pulumi.Input[str]] = None,
                 user_defined_value_function: Optional[pulumi.Input[str]] = None,
                 violation_close_timer: Optional[pulumi.Input[float]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        app = newrelic.get_entity(name="my-app",
            type="APPLICATION",
            domain="APM")
        foo_alert_policy = newrelic.AlertPolicy("fooAlertPolicy")
        foo_alert_condition = newrelic.AlertCondition("fooAlertCondition",
            policy_id=foo_alert_policy.id,
            type="apm_app_metric",
            entities=[data["newrelic_application"]["app"]["application_id"]],
            metric="apdex",
            runbook_url="https://www.example.com",
            condition_scope="application",
            terms=[newrelic.AlertConditionTermArgs(
                duration=5,
                operator="below",
                priority="critical",
                threshold=0.75,
                time_function="all",
            )])
        ```
        ## Terms

        The `term` mapping supports the following arguments:

          * `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
          * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
          * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
          * `threshold` - (Required) Must be 0 or greater.
          * `time_function` - (Required) `all` or `any`.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] condition_scope: `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
        :param pulumi.Input[bool] enabled: Whether the condition is enabled or not. Defaults to true.
        :param pulumi.Input[List[pulumi.Input[float]]] entities: The instance IDs associated with this condition.
        :param pulumi.Input[str] gc_metric: A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
        :param pulumi.Input[str] metric: The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
               * `apm_app_metric`
               * `apdex`
               * `error_percentage`
               * `response_time_background`
               * `response_time_web`
               * `throughput_background`
               * `throughput_web`
               * `user_defined`
               * `apm_kt_metric`
               * `apdex`
               * `error_count`
               * `error_percentage`
               * `response_time`
               * `throughput`
               * `browser_metric`
               * `ajax_response_time`
               * `ajax_throughput`
               * `dom_processing`
               * `end_user_apdex`
               * `network`
               * `page_rendering`
               * `page_view_throughput`
               * `page_views_with_js_errors`
               * `request_queuing`
               * `total_page_load`
               * `user_defined`
               * `web_application`
               * `mobile_metric`
               * `database`
               * `images`
               * `json`
               * `mobile_crash_rate`
               * `network_error_percentage`
               * `network`
               * `status_error_percentage`
               * `user_defined`
               * `view_loading`
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]] terms: A list of terms for this condition. See Terms below for details.
        :param pulumi.Input[str] type: The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
        :param pulumi.Input[str] user_defined_metric: A custom metric to be evaluated.
        :param pulumi.Input[str] user_defined_value_function: One of: `average`, `min`, `max`, `total`, or `sample_size`.
        :param pulumi.Input[float] violation_close_timer: Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['condition_scope'] = condition_scope
            __props__['enabled'] = enabled
            if entities is None:
                raise TypeError("Missing required property 'entities'")
            __props__['entities'] = entities
            __props__['gc_metric'] = gc_metric
            if metric is None:
                raise TypeError("Missing required property 'metric'")
            __props__['metric'] = metric
            __props__['name'] = name
            if policy_id is None:
                raise TypeError("Missing required property 'policy_id'")
            __props__['policy_id'] = policy_id
            __props__['runbook_url'] = runbook_url
            if terms is None:
                raise TypeError("Missing required property 'terms'")
            __props__['terms'] = terms
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['user_defined_metric'] = user_defined_metric
            __props__['user_defined_value_function'] = user_defined_value_function
            __props__['violation_close_timer'] = violation_close_timer
        super(AlertCondition, __self__).__init__(
            'newrelic:index/alertCondition:AlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            condition_scope: Optional[pulumi.Input[str]] = None,
            enabled: Optional[pulumi.Input[bool]] = None,
            entities: Optional[pulumi.Input[List[pulumi.Input[float]]]] = None,
            gc_metric: Optional[pulumi.Input[str]] = None,
            metric: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            policy_id: Optional[pulumi.Input[float]] = None,
            runbook_url: Optional[pulumi.Input[str]] = None,
            terms: Optional[pulumi.Input[List[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]]] = None,
            type: Optional[pulumi.Input[str]] = None,
            user_defined_metric: Optional[pulumi.Input[str]] = None,
            user_defined_value_function: Optional[pulumi.Input[str]] = None,
            violation_close_timer: Optional[pulumi.Input[float]] = None) -> 'AlertCondition':
        """
        Get an existing AlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] condition_scope: `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
        :param pulumi.Input[bool] enabled: Whether the condition is enabled or not. Defaults to true.
        :param pulumi.Input[List[pulumi.Input[float]]] entities: The instance IDs associated with this condition.
        :param pulumi.Input[str] gc_metric: A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
        :param pulumi.Input[str] metric: The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
               * `apm_app_metric`
               * `apdex`
               * `error_percentage`
               * `response_time_background`
               * `response_time_web`
               * `throughput_background`
               * `throughput_web`
               * `user_defined`
               * `apm_kt_metric`
               * `apdex`
               * `error_count`
               * `error_percentage`
               * `response_time`
               * `throughput`
               * `browser_metric`
               * `ajax_response_time`
               * `ajax_throughput`
               * `dom_processing`
               * `end_user_apdex`
               * `network`
               * `page_rendering`
               * `page_view_throughput`
               * `page_views_with_js_errors`
               * `request_queuing`
               * `total_page_load`
               * `user_defined`
               * `web_application`
               * `mobile_metric`
               * `database`
               * `images`
               * `json`
               * `mobile_crash_rate`
               * `network_error_percentage`
               * `network`
               * `status_error_percentage`
               * `user_defined`
               * `view_loading`
        :param pulumi.Input[str] name: The title of the condition. Must be between 1 and 64 characters, inclusive.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[List[pulumi.Input[pulumi.InputType['AlertConditionTermArgs']]]] terms: A list of terms for this condition. See Terms below for details.
        :param pulumi.Input[str] type: The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
        :param pulumi.Input[str] user_defined_metric: A custom metric to be evaluated.
        :param pulumi.Input[str] user_defined_value_function: One of: `average`, `min`, `max`, `total`, or `sample_size`.
        :param pulumi.Input[float] violation_close_timer: Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["condition_scope"] = condition_scope
        __props__["enabled"] = enabled
        __props__["entities"] = entities
        __props__["gc_metric"] = gc_metric
        __props__["metric"] = metric
        __props__["name"] = name
        __props__["policy_id"] = policy_id
        __props__["runbook_url"] = runbook_url
        __props__["terms"] = terms
        __props__["type"] = type
        __props__["user_defined_metric"] = user_defined_metric
        __props__["user_defined_value_function"] = user_defined_value_function
        __props__["violation_close_timer"] = violation_close_timer
        return AlertCondition(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="conditionScope")
    def condition_scope(self) -> pulumi.Output[Optional[str]]:
        """
        `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
        """
        return pulumi.get(self, "condition_scope")

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Output[Optional[bool]]:
        """
        Whether the condition is enabled or not. Defaults to true.
        """
        return pulumi.get(self, "enabled")

    @property
    @pulumi.getter
    def entities(self) -> pulumi.Output[List[float]]:
        """
        The instance IDs associated with this condition.
        """
        return pulumi.get(self, "entities")

    @property
    @pulumi.getter(name="gcMetric")
    def gc_metric(self) -> pulumi.Output[Optional[str]]:
        """
        A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
        """
        return pulumi.get(self, "gc_metric")

    @property
    @pulumi.getter
    def metric(self) -> pulumi.Output[str]:
        """
        The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
        * `apm_app_metric`
        * `apdex`
        * `error_percentage`
        * `response_time_background`
        * `response_time_web`
        * `throughput_background`
        * `throughput_web`
        * `user_defined`
        * `apm_kt_metric`
        * `apdex`
        * `error_count`
        * `error_percentage`
        * `response_time`
        * `throughput`
        * `browser_metric`
        * `ajax_response_time`
        * `ajax_throughput`
        * `dom_processing`
        * `end_user_apdex`
        * `network`
        * `page_rendering`
        * `page_view_throughput`
        * `page_views_with_js_errors`
        * `request_queuing`
        * `total_page_load`
        * `user_defined`
        * `web_application`
        * `mobile_metric`
        * `database`
        * `images`
        * `json`
        * `mobile_crash_rate`
        * `network_error_percentage`
        * `network`
        * `status_error_percentage`
        * `user_defined`
        * `view_loading`
        """
        return pulumi.get(self, "metric")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The title of the condition. Must be between 1 and 64 characters, inclusive.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="policyId")
    def policy_id(self) -> pulumi.Output[float]:
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

    @property
    @pulumi.getter
    def terms(self) -> pulumi.Output[List['outputs.AlertConditionTerm']]:
        """
        A list of terms for this condition. See Terms below for details.
        """
        return pulumi.get(self, "terms")

    @property
    @pulumi.getter
    def type(self) -> pulumi.Output[str]:
        """
        The type of condition. One of: `apm_app_metric`, `apm_kt_metric`, `browser_metric`, `mobile_metric`
        """
        return pulumi.get(self, "type")

    @property
    @pulumi.getter(name="userDefinedMetric")
    def user_defined_metric(self) -> pulumi.Output[Optional[str]]:
        """
        A custom metric to be evaluated.
        """
        return pulumi.get(self, "user_defined_metric")

    @property
    @pulumi.getter(name="userDefinedValueFunction")
    def user_defined_value_function(self) -> pulumi.Output[Optional[str]]:
        """
        One of: `average`, `min`, `max`, `total`, or `sample_size`.
        """
        return pulumi.get(self, "user_defined_value_function")

    @property
    @pulumi.getter(name="violationCloseTimer")
    def violation_close_timer(self) -> pulumi.Output[Optional[float]]:
        """
        Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
        """
        return pulumi.get(self, "violation_close_timer")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

