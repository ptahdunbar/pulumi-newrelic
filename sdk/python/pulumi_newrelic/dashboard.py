# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from . import _utilities
from . import outputs
from ._inputs import *

__all__ = ['DashboardArgs', 'Dashboard']

@pulumi.input_type
class DashboardArgs:
    def __init__(__self__, *,
                 title: pulumi.Input[str],
                 editable: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input['DashboardFilterArgs']] = None,
                 grid_column_count: Optional[pulumi.Input[int]] = None,
                 icon: Optional[pulumi.Input[str]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 widgets: Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]] = None):
        """
        The set of arguments for constructing a Dashboard resource.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] editable: Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        :param pulumi.Input['DashboardFilterArgs'] filter: A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        :param pulumi.Input[int] grid_column_count: The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        :param pulumi.Input[str] visibility: Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        :param pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]] widgets: A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        pulumi.set(__self__, "title", title)
        if editable is not None:
            pulumi.set(__self__, "editable", editable)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if grid_column_count is not None:
            pulumi.set(__self__, "grid_column_count", grid_column_count)
        if icon is not None:
            pulumi.set(__self__, "icon", icon)
        if visibility is not None:
            pulumi.set(__self__, "visibility", visibility)
        if widgets is not None:
            pulumi.set(__self__, "widgets", widgets)

    @property
    @pulumi.getter
    def title(self) -> pulumi.Input[str]:
        """
        The title of the dashboard.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: pulumi.Input[str]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def editable(self) -> Optional[pulumi.Input[str]]:
        """
        Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        """
        return pulumi.get(self, "editable")

    @editable.setter
    def editable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "editable", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['DashboardFilterArgs']]:
        """
        A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['DashboardFilterArgs']]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="gridColumnCount")
    def grid_column_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        """
        return pulumi.get(self, "grid_column_count")

    @grid_column_count.setter
    def grid_column_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "grid_column_count", value)

    @property
    @pulumi.getter
    def icon(self) -> Optional[pulumi.Input[str]]:
        """
        The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        """
        return pulumi.get(self, "icon")

    @icon.setter
    def icon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "icon", value)

    @property
    @pulumi.getter
    def visibility(self) -> Optional[pulumi.Input[str]]:
        """
        Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        """
        return pulumi.get(self, "visibility")

    @visibility.setter
    def visibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "visibility", value)

    @property
    @pulumi.getter
    def widgets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]]:
        """
        A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        return pulumi.get(self, "widgets")

    @widgets.setter
    def widgets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]]):
        pulumi.set(self, "widgets", value)


@pulumi.input_type
class _DashboardState:
    def __init__(__self__, *,
                 dashboard_url: Optional[pulumi.Input[str]] = None,
                 editable: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input['DashboardFilterArgs']] = None,
                 grid_column_count: Optional[pulumi.Input[int]] = None,
                 icon: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 widgets: Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]] = None):
        """
        Input properties used for looking up and filtering Dashboard resources.
        :param pulumi.Input[str] dashboard_url: The URL for viewing the dashboard.
        :param pulumi.Input[str] editable: Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        :param pulumi.Input['DashboardFilterArgs'] filter: A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        :param pulumi.Input[int] grid_column_count: The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] visibility: Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        :param pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]] widgets: A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        if dashboard_url is not None:
            pulumi.set(__self__, "dashboard_url", dashboard_url)
        if editable is not None:
            pulumi.set(__self__, "editable", editable)
        if filter is not None:
            pulumi.set(__self__, "filter", filter)
        if grid_column_count is not None:
            pulumi.set(__self__, "grid_column_count", grid_column_count)
        if icon is not None:
            pulumi.set(__self__, "icon", icon)
        if title is not None:
            pulumi.set(__self__, "title", title)
        if visibility is not None:
            pulumi.set(__self__, "visibility", visibility)
        if widgets is not None:
            pulumi.set(__self__, "widgets", widgets)

    @property
    @pulumi.getter(name="dashboardUrl")
    def dashboard_url(self) -> Optional[pulumi.Input[str]]:
        """
        The URL for viewing the dashboard.
        """
        return pulumi.get(self, "dashboard_url")

    @dashboard_url.setter
    def dashboard_url(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "dashboard_url", value)

    @property
    @pulumi.getter
    def editable(self) -> Optional[pulumi.Input[str]]:
        """
        Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        """
        return pulumi.get(self, "editable")

    @editable.setter
    def editable(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "editable", value)

    @property
    @pulumi.getter
    def filter(self) -> Optional[pulumi.Input['DashboardFilterArgs']]:
        """
        A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        """
        return pulumi.get(self, "filter")

    @filter.setter
    def filter(self, value: Optional[pulumi.Input['DashboardFilterArgs']]):
        pulumi.set(self, "filter", value)

    @property
    @pulumi.getter(name="gridColumnCount")
    def grid_column_count(self) -> Optional[pulumi.Input[int]]:
        """
        The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        """
        return pulumi.get(self, "grid_column_count")

    @grid_column_count.setter
    def grid_column_count(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "grid_column_count", value)

    @property
    @pulumi.getter
    def icon(self) -> Optional[pulumi.Input[str]]:
        """
        The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        """
        return pulumi.get(self, "icon")

    @icon.setter
    def icon(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "icon", value)

    @property
    @pulumi.getter
    def title(self) -> Optional[pulumi.Input[str]]:
        """
        The title of the dashboard.
        """
        return pulumi.get(self, "title")

    @title.setter
    def title(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "title", value)

    @property
    @pulumi.getter
    def visibility(self) -> Optional[pulumi.Input[str]]:
        """
        Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        """
        return pulumi.get(self, "visibility")

    @visibility.setter
    def visibility(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "visibility", value)

    @property
    @pulumi.getter
    def widgets(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]]:
        """
        A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        return pulumi.get(self, "widgets")

    @widgets.setter
    def widgets(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['DashboardWidgetArgs']]]]):
        pulumi.set(self, "widgets", value)


class Dashboard(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 editable: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input[pulumi.InputType['DashboardFilterArgs']]] = None,
                 grid_column_count: Optional[pulumi.Input[int]] = None,
                 icon: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 widgets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DashboardWidgetArgs']]]]] = None,
                 __props__=None):
        """
        ## Import

        New Relic dashboards can be imported using their ID, e.g.

        ```sh
         $ pulumi import newrelic:index/dashboard:Dashboard my_dashboard 8675309
        ```

         ~> **NOTE** Due to API restrictions, importing a dashboard resource will set the `grid_column_count` attribute to `3`. If your dashboard is a New Relic One dashboard _and_ uses a 12 column grid, you will need to make sure `grid_column_count` is set to `12` in your configuration, then run `terraform apply` after importing to sync remote state with Terraform state. Also note, cross-account widgets cannot be imported due to API restrictions.

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] editable: Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        :param pulumi.Input[pulumi.InputType['DashboardFilterArgs']] filter: A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        :param pulumi.Input[int] grid_column_count: The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] visibility: Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DashboardWidgetArgs']]]] widgets: A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: DashboardArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        New Relic dashboards can be imported using their ID, e.g.

        ```sh
         $ pulumi import newrelic:index/dashboard:Dashboard my_dashboard 8675309
        ```

         ~> **NOTE** Due to API restrictions, importing a dashboard resource will set the `grid_column_count` attribute to `3`. If your dashboard is a New Relic One dashboard _and_ uses a 12 column grid, you will need to make sure `grid_column_count` is set to `12` in your configuration, then run `terraform apply` after importing to sync remote state with Terraform state. Also note, cross-account widgets cannot be imported due to API restrictions.

        :param str resource_name: The name of the resource.
        :param DashboardArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(DashboardArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 editable: Optional[pulumi.Input[str]] = None,
                 filter: Optional[pulumi.Input[pulumi.InputType['DashboardFilterArgs']]] = None,
                 grid_column_count: Optional[pulumi.Input[int]] = None,
                 icon: Optional[pulumi.Input[str]] = None,
                 title: Optional[pulumi.Input[str]] = None,
                 visibility: Optional[pulumi.Input[str]] = None,
                 widgets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DashboardWidgetArgs']]]]] = None,
                 __props__=None):
        if opts is None:
            opts = pulumi.ResourceOptions()
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.version is None:
            opts.version = _utilities.get_version()
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = DashboardArgs.__new__(DashboardArgs)

            __props__.__dict__["editable"] = editable
            __props__.__dict__["filter"] = filter
            __props__.__dict__["grid_column_count"] = grid_column_count
            __props__.__dict__["icon"] = icon
            if title is None and not opts.urn:
                raise TypeError("Missing required property 'title'")
            __props__.__dict__["title"] = title
            __props__.__dict__["visibility"] = visibility
            __props__.__dict__["widgets"] = widgets
            __props__.__dict__["dashboard_url"] = None
        super(Dashboard, __self__).__init__(
            'newrelic:index/dashboard:Dashboard',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            dashboard_url: Optional[pulumi.Input[str]] = None,
            editable: Optional[pulumi.Input[str]] = None,
            filter: Optional[pulumi.Input[pulumi.InputType['DashboardFilterArgs']]] = None,
            grid_column_count: Optional[pulumi.Input[int]] = None,
            icon: Optional[pulumi.Input[str]] = None,
            title: Optional[pulumi.Input[str]] = None,
            visibility: Optional[pulumi.Input[str]] = None,
            widgets: Optional[pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DashboardWidgetArgs']]]]] = None) -> 'Dashboard':
        """
        Get an existing Dashboard resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] dashboard_url: The URL for viewing the dashboard.
        :param pulumi.Input[str] editable: Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        :param pulumi.Input[pulumi.InputType['DashboardFilterArgs']] filter: A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        :param pulumi.Input[int] grid_column_count: The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        :param pulumi.Input[str] icon: The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        :param pulumi.Input[str] title: The title of the dashboard.
        :param pulumi.Input[str] visibility: Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        :param pulumi.Input[Sequence[pulumi.Input[pulumi.InputType['DashboardWidgetArgs']]]] widgets: A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _DashboardState.__new__(_DashboardState)

        __props__.__dict__["dashboard_url"] = dashboard_url
        __props__.__dict__["editable"] = editable
        __props__.__dict__["filter"] = filter
        __props__.__dict__["grid_column_count"] = grid_column_count
        __props__.__dict__["icon"] = icon
        __props__.__dict__["title"] = title
        __props__.__dict__["visibility"] = visibility
        __props__.__dict__["widgets"] = widgets
        return Dashboard(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="dashboardUrl")
    def dashboard_url(self) -> pulumi.Output[str]:
        """
        The URL for viewing the dashboard.
        """
        return pulumi.get(self, "dashboard_url")

    @property
    @pulumi.getter
    def editable(self) -> pulumi.Output[Optional[str]]:
        """
        Determines who can edit the dashboard in an account. Valid values are `all`,  `editable_by_all`, `editable_by_owner`, or `read_only`.  Defaults to `editable_by_all`.
        """
        return pulumi.get(self, "editable")

    @property
    @pulumi.getter
    def filter(self) -> pulumi.Output[Optional['outputs.DashboardFilter']]:
        """
        A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
        """
        return pulumi.get(self, "filter")

    @property
    @pulumi.getter(name="gridColumnCount")
    def grid_column_count(self) -> pulumi.Output[Optional[int]]:
        """
        The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
        """
        return pulumi.get(self, "grid_column_count")

    @property
    @pulumi.getter
    def icon(self) -> pulumi.Output[Optional[str]]:
        """
        The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
        """
        return pulumi.get(self, "icon")

    @property
    @pulumi.getter
    def title(self) -> pulumi.Output[str]:
        """
        The title of the dashboard.
        """
        return pulumi.get(self, "title")

    @property
    @pulumi.getter
    def visibility(self) -> pulumi.Output[Optional[str]]:
        """
        Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
        """
        return pulumi.get(self, "visibility")

    @property
    @pulumi.getter
    def widgets(self) -> pulumi.Output[Optional[Sequence['outputs.DashboardWidget']]]:
        """
        A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
        """
        return pulumi.get(self, "widgets")

