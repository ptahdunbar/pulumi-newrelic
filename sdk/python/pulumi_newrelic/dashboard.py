# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from . import utilities, tables

class Dashboard(pulumi.CustomResource):
    dashboard_url: pulumi.Output[str]
    editable: pulumi.Output[str]
    """
    Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
    """
    filter: pulumi.Output[dict]
    icon: pulumi.Output[str]
    """
    The icon for the dashboard.  Defaults to `bar-chart`.
    """
    title: pulumi.Output[str]
    """
    The title of the dashboard.
    """
    visibility: pulumi.Output[str]
    """
    Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
    """
    widgets: pulumi.Output[list]
    """
    A widget that describes a visualization. See Widgets below for details.
    
      * `column` (`float`)
      * `height` (`float`)
      * `notes` (`str`)
      * `nrql` (`str`)
      * `row` (`float`)
      * `title` (`str`) - The title of the dashboard.
      * `visualization` (`str`)
      * `width` (`float`)
    """
    def __init__(__self__, resource_name, opts=None, editable=None, filter=None, icon=None, title=None, visibility=None, widgets=None, __props__=None, __name__=None, __opts__=None):
        """
        ## Widgets
        
        The `widget` mapping supports the following arguments:
        
          * `title` - (Required) A title for the widget.
          * `visualization` - (Required) How the widget visualizes data.
          * `row` - (Required) Row position of widget from top left, starting at `1`.
          * `column` - (Required) Column position of widget from top left, starting at `1`.
          * `width` - (Optional) Width of the widget. Defaults to `1`.
          * `height` - (Optional) Height of the widget. Defaults to `1`.
          * `notes` - (Optional) Description of the widget.
          * `nrql` - (Optional) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
        
        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] editable: Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Defaults to `bar-chart`.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] visibility: Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
        :param pulumi.Input[list] widgets: A widget that describes a visualization. See Widgets below for details.
        
        The **filter** object supports the following:
        
          * `attributes` (`pulumi.Input[list]`)
          * `eventTypes` (`pulumi.Input[list]`)
        
        The **widgets** object supports the following:
        
          * `column` (`pulumi.Input[float]`)
          * `height` (`pulumi.Input[float]`)
          * `notes` (`pulumi.Input[str]`)
          * `nrql` (`pulumi.Input[str]`)
          * `row` (`pulumi.Input[float]`)
          * `title` (`pulumi.Input[str]`) - The title of the dashboard.
          * `visualization` (`pulumi.Input[str]`)
          * `width` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/dashboard.html.markdown.
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

            __props__['editable'] = editable
            __props__['filter'] = filter
            __props__['icon'] = icon
            if title is None:
                raise TypeError("Missing required property 'title'")
            __props__['title'] = title
            __props__['visibility'] = visibility
            __props__['widgets'] = widgets
            __props__['dashboard_url'] = None
        super(Dashboard, __self__).__init__(
            'newrelic:index/dashboard:Dashboard',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name, id, opts=None, dashboard_url=None, editable=None, filter=None, icon=None, title=None, visibility=None, widgets=None):
        """
        Get an existing Dashboard resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.
        
        :param str resource_name: The unique name of the resulting resource.
        :param str id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] editable: Who can edit the dashboard in an account. Must be `read_only`, `editable_by_owner`, `editable_by_all`, or `all`. Defaults to `editable_by_all`.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Defaults to `bar-chart`.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] visibility: Who can see the dashboard in an account. Must be `owner` or `all`. Defaults to `all`.
        :param pulumi.Input[list] widgets: A widget that describes a visualization. See Widgets below for details.
        
        The **filter** object supports the following:
        
          * `attributes` (`pulumi.Input[list]`)
          * `eventTypes` (`pulumi.Input[list]`)
        
        The **widgets** object supports the following:
        
          * `column` (`pulumi.Input[float]`)
          * `height` (`pulumi.Input[float]`)
          * `notes` (`pulumi.Input[str]`)
          * `nrql` (`pulumi.Input[str]`)
          * `row` (`pulumi.Input[float]`)
          * `title` (`pulumi.Input[str]`) - The title of the dashboard.
          * `visualization` (`pulumi.Input[str]`)
          * `width` (`pulumi.Input[float]`)

        > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/dashboard.html.markdown.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()
        __props__["dashboard_url"] = dashboard_url
        __props__["editable"] = editable
        __props__["filter"] = filter
        __props__["icon"] = icon
        __props__["title"] = title
        __props__["visibility"] = visibility
        __props__["widgets"] = widgets
        return Dashboard(resource_name, opts=opts, __props__=__props__)
    def translate_output_property(self, prop):
        return tables._CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return tables._SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

