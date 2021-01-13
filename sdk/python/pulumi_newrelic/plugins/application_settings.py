# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables

__all__ = ['ApplicationSettings']


class ApplicationSettings(pulumi.CustomResource):
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 app_apdex_threshold: Optional[pulumi.Input[float]] = None,
                 enable_real_user_monitoring: Optional[pulumi.Input[bool]] = None,
                 end_user_apdex_threshold: Optional[pulumi.Input[float]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 __props__=None,
                 __name__=None,
                 __opts__=None):
        """
        > **NOTE:** Applications are not created by this resource, but are created by
        a reporting agent.

        Use this resource to manage configuration for an application that already
        exists in New Relic.

        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        app = newrelic.plugins.ApplicationSettings("app",
            app_apdex_threshold=0.7,
            enable_real_user_monitoring=False,
            end_user_apdex_threshold=0.8)
        ```
        ## Notes

        > **NOTE:** Applications that have reported data in the last twelve hours
        cannot be deleted.

        ## Import

        Applications can be imported using notation `application_id`, e.g.

        ```sh
         $ pulumi import newrelic:plugins/applicationSettings:ApplicationSettings main 6789012345
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] app_apdex_threshold: The appex threshold for the New Relic application.
        :param pulumi.Input[bool] enable_real_user_monitoring: Enable or disable real user monitoring for the New Relic application.
        :param pulumi.Input[float] end_user_apdex_threshold: The user's apdex threshold for the New Relic application.
        :param pulumi.Input[str] name: The name of the application in New Relic APM.
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

            if app_apdex_threshold is None and not opts.urn:
                raise TypeError("Missing required property 'app_apdex_threshold'")
            __props__['app_apdex_threshold'] = app_apdex_threshold
            if enable_real_user_monitoring is None and not opts.urn:
                raise TypeError("Missing required property 'enable_real_user_monitoring'")
            __props__['enable_real_user_monitoring'] = enable_real_user_monitoring
            if end_user_apdex_threshold is None and not opts.urn:
                raise TypeError("Missing required property 'end_user_apdex_threshold'")
            __props__['end_user_apdex_threshold'] = end_user_apdex_threshold
            __props__['name'] = name
        super(ApplicationSettings, __self__).__init__(
            'newrelic:plugins/applicationSettings:ApplicationSettings',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            app_apdex_threshold: Optional[pulumi.Input[float]] = None,
            enable_real_user_monitoring: Optional[pulumi.Input[bool]] = None,
            end_user_apdex_threshold: Optional[pulumi.Input[float]] = None,
            name: Optional[pulumi.Input[str]] = None) -> 'ApplicationSettings':
        """
        Get an existing ApplicationSettings resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[float] app_apdex_threshold: The appex threshold for the New Relic application.
        :param pulumi.Input[bool] enable_real_user_monitoring: Enable or disable real user monitoring for the New Relic application.
        :param pulumi.Input[float] end_user_apdex_threshold: The user's apdex threshold for the New Relic application.
        :param pulumi.Input[str] name: The name of the application in New Relic APM.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = dict()

        __props__["app_apdex_threshold"] = app_apdex_threshold
        __props__["enable_real_user_monitoring"] = enable_real_user_monitoring
        __props__["end_user_apdex_threshold"] = end_user_apdex_threshold
        __props__["name"] = name
        return ApplicationSettings(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="appApdexThreshold")
    def app_apdex_threshold(self) -> pulumi.Output[float]:
        """
        The appex threshold for the New Relic application.
        """
        return pulumi.get(self, "app_apdex_threshold")

    @property
    @pulumi.getter(name="enableRealUserMonitoring")
    def enable_real_user_monitoring(self) -> pulumi.Output[bool]:
        """
        Enable or disable real user monitoring for the New Relic application.
        """
        return pulumi.get(self, "enable_real_user_monitoring")

    @property
    @pulumi.getter(name="endUserApdexThreshold")
    def end_user_apdex_threshold(self) -> pulumi.Output[float]:
        """
        The user's apdex threshold for the New Relic application.
        """
        return pulumi.get(self, "end_user_apdex_threshold")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        The name of the application in New Relic APM.
        """
        return pulumi.get(self, "name")

    def translate_output_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop

    def translate_input_property(self, prop):
        return _tables.SNAKE_TO_CAMEL_CASE_TABLE.get(prop) or prop

