# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

class Label(pulumi.CustomResource):
    href: pulumi.Output[str]
    """
    The URL of the Synthetics label.
    """
    monitor_id: pulumi.Output[str]
    """
    The ID of the monitor that will be assigned the label.
    """
    type: pulumi.Output[str]
    """
    A string representing the label key/category.
    """
    value: pulumi.Output[str]
    """
    A string representing the label value.
    """
    def __init__(__self__, resource_name, opts=None, monitor_id=None, type=None, value=None, __props__=None, __name__=None, __opts__=None):
        """
        Use this resource to create, update, and delete a Synthetics label in New Relic.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] monitor_id: The ID of the monitor that will be assigned the label.
        :param pulumi.Input[str] type: A string representing the label key/category.
        :param pulumi.Input[str] value: A string representing the label value.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_label.html.markdown.
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

            if monitor_id is None:
                raise TypeError("Missing required property 'monitor_id'")
            __props__['monitor_id'] = monitor_id
            if type is None:
                raise TypeError("Missing required property 'type'")
            __props__['type'] = type
            if value is None:
                raise TypeError("Missing required property 'value'")
            __props__['value'] = value
            __props__['href'] = None
        super(Label, __self__).__init__(
            'newrelic:synthetics/label:Label',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, href=None, monitor_id=None, type=None, value=None):
        """
        Get an existing Label resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] href: The URL of the Synthetics label.
        :param pulumi.Input[str] monitor_id: The ID of the monitor that will be assigned the label.
        :param pulumi.Input[str] type: A string representing the label key/category.
        :param pulumi.Input[str] value: A string representing the label value.

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_label.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["href"] = href
        __props__["monitor_id"] = monitor_id
        __props__["type"] = type
        __props__["value"] = value
        return Label(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

