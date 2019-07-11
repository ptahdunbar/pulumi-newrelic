# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from . import utilities, tables

class NrqlAlertCondition(pulumi.CustomResource):
    enabled: pulumi.Output[bool]
    """
    Set whether to enable the alert condition. Defaults to `true`.
    """
    name: pulumi.Output[str]
    """
    The title of the condition
    """
    nrql: pulumi.Output[dict]
    """
    A NRQL query. See NRQL below for details.
    """
    policy_id: pulumi.Output[float]
    """
    The ID of the policy where this condition should be used.
    """
    runbook_url: pulumi.Output[str]
    """
    Runbook URL to display in notifications.
    """
    terms: pulumi.Output[list]
    """
    A list of terms for this condition. See Terms below for details.
    """
    value_function: pulumi.Output[str]
    """
    Possible values are `single_value`, `sum`.
    """
    def __init__(__self__, resource_name, opts=None, enabled=None, name=None, nrql=None, policy_id=None, runbook_url=None, terms=None, value_function=None, __name__=None, __opts__=None):
        """
        ## Terms
        
        The `term` mapping supports the following arguments:
        
          * `duration` - (Required) In minutes, must be: `1`, `2`, `3`, `4`, `5`, `10`, `15`, `30`, `60`, or `120`.
          * `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
          * `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`.
          * `threshold` - (Required) Must be 0 or greater.
          * `time_function` - (Required) `all` or `any`.
        
        ## NRQL
        
        The `nrql` attribute supports the following arguments:
        
          * `query` - (Required) The NRQL query to execute for the condition.
          * `since_value` - (Required) The value to be used in the `SINCE <X> MINUTES AGO` clause for the NRQL query. Must be between `1` and `20`.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[bool] enabled: Set whether to enable the alert condition. Defaults to `true`.
        :param pulumi.Input[str] name: The title of the condition
        :param pulumi.Input[dict] nrql: A NRQL query. See NRQL below for details.
        :param pulumi.Input[float] policy_id: The ID of the policy where this condition should be used.
        :param pulumi.Input[str] runbook_url: Runbook URL to display in notifications.
        :param pulumi.Input[list] terms: A list of terms for this condition. See Terms below for details.
        :param pulumi.Input[str] value_function: Possible values are `single_value`, `sum`.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/nrql_alert_condition.html.markdown.
        """
        if __name__ is not None:
            warnings.warn("explicit use of __name__ is deprecated", DeprecationWarning)
            resource_name = __name__
        if __opts__ is not None:
            warnings.warn("explicit use of __opts__ is deprecated, use 'opts' instead", DeprecationWarning)
            opts = __opts__
        if not resource_name:
            raise TypeError('Missing resource name argument (for URN creation)')
        if not isinstance(resource_name, str):
            raise TypeError('Expected resource name to be a string')
        if opts and not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')

        __props__ = dict()

        __props__['enabled'] = enabled

        __props__['name'] = name

        if nrql is None:
            raise TypeError("Missing required property 'nrql'")
        __props__['nrql'] = nrql

        if policy_id is None:
            raise TypeError("Missing required property 'policy_id'")
        __props__['policy_id'] = policy_id

        __props__['runbook_url'] = runbook_url

        if terms is None:
            raise TypeError("Missing required property 'terms'")
        __props__['terms'] = terms

        __props__['value_function'] = value_function

        super(NrqlAlertCondition, __self__).__init__(
            'newrelic:index/nrqlAlertCondition:NrqlAlertCondition',
            resource_name,
            __props__,
            opts)


    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

