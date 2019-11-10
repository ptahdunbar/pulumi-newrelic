# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class InfraAlertCondition(pulumi.CustomResource):
    comparison: pulumi.Output[str]
    """
    The operator used to evaluate the threshold value; "above", "below", "equal".
    """
    created_at: pulumi.Output[float]
    critical: pulumi.Output[dict]
    """
    Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
    
      * `duration` (`float`)
      * `timeFunction` (`str`)
      * `value` (`float`)
    """
    enabled: pulumi.Output[bool]
    """
    Set whether to enable the alert condition. Defaults to `true`.
    """
    event: pulumi.Output[str]
    """
    The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
    """
    integration_provider: pulumi.Output[str]
    """
    For alerts on integrations, use this instead of `event`. 
    """
    name: pulumi.Output[str]
    """
    The Infrastructure alert condition's name.
    """
    policy_id: pulumi.Output[float]
    """
    The ID of the alert policy where this condition should be used.
    """
    process_where: pulumi.Output[str]
    """
    Any filters applied to processes; for example: `"commandName = 'java'"`.
    """
    runbook_url: pulumi.Output[str]
    select: pulumi.Output[str]
    """
    The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
    """
    type: pulumi.Output[str]
    """
    The type of Infrastructure alert condition: "infra_process_running", "infra_metric", or "infra_host_not_reporting".
    """
    updated_at: pulumi.Output[float]
    warning: pulumi.Output[dict]
    """
    Identifies the warning threshold parameters. See Thresholds below for details.
    
      * `duration` (`float`)
      * `timeFunction` (`str`)
      * `value` (`float`)
    """
    where: pulumi.Output[str]
    """
    Infrastructure host filter for the alert condition.
    """
    def __init__(__self__, resource_name, opts=None, comparison=None, critical=None, enabled=None, event=None, integration_provider=None, name=None, policy_id=None, process_where=None, runbook_url=None, select=None, type=None, warning=None, where=None, __props__=None, __name__=None, __opts__=None):
        """
        ## Thresholds
        
        The `critical` and `warning` threshold mapping supports the following arguments:
        
          * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
          * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by "infra_metric" and "infra_process_running" alert condition types.
          * `time_function` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the "infra_metric" alert condition type.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comparison: The operator used to evaluate the threshold value; "above", "below", "equal".
        :param pulumi.Input[dict] critical: Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] event: The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
        :param pulumi.Input[str] integration_provider: For alerts on integrations, use this instead of `event`. 
        :param pulumi.Input[str] name: The Infrastructure alert condition's name.
        :param pulumi.Input[float] policy_id: The ID of the alert policy where this condition should be used.
        :param pulumi.Input[str] process_where: Any filters applied to processes; for example: `"commandName = 'java'"`.
        :param pulumi.Input[str] select: The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
        :param pulumi.Input[str] type: The type of Infrastructure alert condition: "infra_process_running", "infra_metric", or "infra_host_not_reporting".
        :param pulumi.Input[dict] warning: Identifies the warning threshold parameters. See Thresholds below for details.
        :param pulumi.Input[str] where: Infrastructure host filter for the alert condition.
        
        The **critical** object supports the following:
        
          * `duration` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[float]`)
        
        The **warning** object supports the following:
        
          * `duration` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/infra_alert_condition.html.markdown.
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
            opts.version = utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = dict()

            __props__['comparison'] = comparison
            __props__['critical'] = critical
            __props__['enabled'] = enabled
            __props__['event'] = event
            __props__['integration_provider'] = integration_provider
            __props__['name'] = name
            if policy_id is None:
                raise TypeError("Missing required property 'policy_id'")
            __props__['policy_id'] = policy_id
            __props__['process_where'] = process_where
            __props__['runbook_url'] = runbook_url
            __props__['select'] = select
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            __props__['warning'] = warning
            __props__['where'] = where
            __props__['created_at'] = None
            __props__['updated_at'] = None
        super(InfraAlertCondition, __self__).__init__(
            'newrelic:index/infraAlertCondition:InfraAlertCondition',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, comparison=None, created_at=None, critical=None, enabled=None, event=None, integration_provider=None, name=None, policy_id=None, process_where=None, runbook_url=None, select=None, type=None, updated_at=None, warning=None, where=None):
        """
        Get an existing InfraAlertCondition resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] comparison: The operator used to evaluate the threshold value; "above", "below", "equal".
        :param pulumi.Input[dict] critical: Identifies the critical threshold parameters for triggering an alert notification. See Thresholds below for details.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] event: The metric event; for example, system metrics, process metrics, storage metrics, or network metrics.
        :param pulumi.Input[str] integration_provider: For alerts on integrations, use this instead of `event`. 
        :param pulumi.Input[str] name: The Infrastructure alert condition's name.
        :param pulumi.Input[float] policy_id: The ID of the alert policy where this condition should be used.
        :param pulumi.Input[str] process_where: Any filters applied to processes; for example: `"commandName = 'java'"`.
        :param pulumi.Input[str] select: The attribute name to identify the type of metric condition; for example, "network", "process", "system", or "storage".
        :param pulumi.Input[str] type: The type of Infrastructure alert condition: "infra_process_running", "infra_metric", or "infra_host_not_reporting".
        :param pulumi.Input[dict] warning: Identifies the warning threshold parameters. See Thresholds below for details.
        :param pulumi.Input[str] where: Infrastructure host filter for the alert condition.
        
        The **critical** object supports the following:
        
          * `duration` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[float]`)
        
        The **warning** object supports the following:
        
          * `duration` (`pulumi.Input[float]`)
          * `timeFunction` (`pulumi.Input[str]`)
          * `value` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/infra_alert_condition.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["comparison"] = comparison
        __props__["created_at"] = created_at
        __props__["critical"] = critical
        __props__["enabled"] = enabled
        __props__["event"] = event
        __props__["integration_provider"] = integration_provider
        __props__["name"] = name
        __props__["policy_id"] = policy_id
        __props__["process_where"] = process_where
        __props__["runbook_url"] = runbook_url
        __props__["select"] = select
        __props__["type"] = type
        __props__["updated_at"] = updated_at
        __props__["warning"] = warning
        __props__["where"] = where
        return InfraAlertCondition(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

