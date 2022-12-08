# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AwsGovcloudLinkAccountArgs', 'AwsGovcloudLinkAccount']

@pulumi.input_type
class AwsGovcloudLinkAccountArgs:
    def __init__(__self__, *,
                 access_key_id: pulumi.Input[str],
                 aws_account_id: pulumi.Input[str],
                 secret_access_key: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 metric_collection_mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AwsGovcloudLinkAccount resource.
        :param pulumi.Input[str] access_key_id: The access key of the AwsGovCloud.
        :param pulumi.Input[str] aws_account_id: The AwsGovCloud account ID.
        :param pulumi.Input[str] secret_access_key: The secret key of the AwsGovCloud.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[str] metric_collection_mode: How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        :param pulumi.Input[str] name: - The linked account name
        """
        pulumi.set(__self__, "access_key_id", access_key_id)
        pulumi.set(__self__, "aws_account_id", aws_account_id)
        pulumi.set(__self__, "secret_access_key", secret_access_key)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if metric_collection_mode is not None:
            pulumi.set(__self__, "metric_collection_mode", metric_collection_mode)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> pulumi.Input[str]:
        """
        The access key of the AwsGovCloud.
        """
        return pulumi.get(self, "access_key_id")

    @access_key_id.setter
    def access_key_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "access_key_id", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Input[str]:
        """
        The AwsGovCloud account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="secretAccessKey")
    def secret_access_key(self) -> pulumi.Input[str]:
        """
        The secret key of the AwsGovCloud.
        """
        return pulumi.get(self, "secret_access_key")

    @secret_access_key.setter
    def secret_access_key(self, value: pulumi.Input[str]):
        pulumi.set(self, "secret_access_key", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="metricCollectionMode")
    def metric_collection_mode(self) -> Optional[pulumi.Input[str]]:
        """
        How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        """
        return pulumi.get(self, "metric_collection_mode")

    @metric_collection_mode.setter
    def metric_collection_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_collection_mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The linked account name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AwsGovcloudLinkAccountState:
    def __init__(__self__, *,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 metric_collection_mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AwsGovcloudLinkAccount resources.
        :param pulumi.Input[str] access_key_id: The access key of the AwsGovCloud.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[str] aws_account_id: The AwsGovCloud account ID.
        :param pulumi.Input[str] metric_collection_mode: How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        :param pulumi.Input[str] name: - The linked account name
        :param pulumi.Input[str] secret_access_key: The secret key of the AwsGovCloud.
        """
        if access_key_id is not None:
            pulumi.set(__self__, "access_key_id", access_key_id)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if aws_account_id is not None:
            pulumi.set(__self__, "aws_account_id", aws_account_id)
        if metric_collection_mode is not None:
            pulumi.set(__self__, "metric_collection_mode", metric_collection_mode)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if secret_access_key is not None:
            pulumi.set(__self__, "secret_access_key", secret_access_key)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> Optional[pulumi.Input[str]]:
        """
        The access key of the AwsGovCloud.
        """
        return pulumi.get(self, "access_key_id")

    @access_key_id.setter
    def access_key_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "access_key_id", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> Optional[pulumi.Input[str]]:
        """
        The AwsGovCloud account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @aws_account_id.setter
    def aws_account_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "aws_account_id", value)

    @property
    @pulumi.getter(name="metricCollectionMode")
    def metric_collection_mode(self) -> Optional[pulumi.Input[str]]:
        """
        How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        """
        return pulumi.get(self, "metric_collection_mode")

    @metric_collection_mode.setter
    def metric_collection_mode(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "metric_collection_mode", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The linked account name
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="secretAccessKey")
    def secret_access_key(self) -> Optional[pulumi.Input[str]]:
        """
        The secret key of the AwsGovCloud.
        """
        return pulumi.get(self, "secret_access_key")

    @secret_access_key.setter
    def secret_access_key(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "secret_access_key", value)


class AwsGovcloudLinkAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 metric_collection_mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.cloud.AwsGovcloudLinkAccount("foo",
            access_key_id="access-key-id of aws govcloud account",
            account_id="The New Relic account ID where you want to link the AWS GovCloud account",
            aws_account_id="aws govcloud account id",
            metric_collection_mode="PULL",
            secret_access_key="secret access key of the aws govcloud account")
        ```

        ## Import

        Linked AWSGovCloud accounts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key_id: The access key of the AwsGovCloud.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[str] aws_account_id: The AwsGovCloud account ID.
        :param pulumi.Input[str] metric_collection_mode: How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        :param pulumi.Input[str] name: - The linked account name
        :param pulumi.Input[str] secret_access_key: The secret key of the AwsGovCloud.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AwsGovcloudLinkAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Example Usage

        ```python
        import pulumi
        import pulumi_newrelic as newrelic

        foo = newrelic.cloud.AwsGovcloudLinkAccount("foo",
            access_key_id="access-key-id of aws govcloud account",
            account_id="The New Relic account ID where you want to link the AWS GovCloud account",
            aws_account_id="aws govcloud account id",
            metric_collection_mode="PULL",
            secret_access_key="secret access key of the aws govcloud account")
        ```

        ## Import

        Linked AWSGovCloud accounts can be imported using the `id`, e.g. bash

        ```sh
         $ pulumi import newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param AwsGovcloudLinkAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AwsGovcloudLinkAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 access_key_id: Optional[pulumi.Input[str]] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 aws_account_id: Optional[pulumi.Input[str]] = None,
                 metric_collection_mode: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 secret_access_key: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AwsGovcloudLinkAccountArgs.__new__(AwsGovcloudLinkAccountArgs)

            if access_key_id is None and not opts.urn:
                raise TypeError("Missing required property 'access_key_id'")
            __props__.__dict__["access_key_id"] = None if access_key_id is None else pulumi.Output.secret(access_key_id)
            __props__.__dict__["account_id"] = account_id
            if aws_account_id is None and not opts.urn:
                raise TypeError("Missing required property 'aws_account_id'")
            __props__.__dict__["aws_account_id"] = aws_account_id
            __props__.__dict__["metric_collection_mode"] = metric_collection_mode
            __props__.__dict__["name"] = name
            if secret_access_key is None and not opts.urn:
                raise TypeError("Missing required property 'secret_access_key'")
            __props__.__dict__["secret_access_key"] = None if secret_access_key is None else pulumi.Output.secret(secret_access_key)
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["accessKeyId", "secretAccessKey"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AwsGovcloudLinkAccount, __self__).__init__(
            'newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            access_key_id: Optional[pulumi.Input[str]] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            aws_account_id: Optional[pulumi.Input[str]] = None,
            metric_collection_mode: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            secret_access_key: Optional[pulumi.Input[str]] = None) -> 'AwsGovcloudLinkAccount':
        """
        Get an existing AwsGovcloudLinkAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[str] access_key_id: The access key of the AwsGovCloud.
        :param pulumi.Input[int] account_id: The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        :param pulumi.Input[str] aws_account_id: The AwsGovCloud account ID.
        :param pulumi.Input[str] metric_collection_mode: How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        :param pulumi.Input[str] name: - The linked account name
        :param pulumi.Input[str] secret_access_key: The secret key of the AwsGovCloud.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AwsGovcloudLinkAccountState.__new__(_AwsGovcloudLinkAccountState)

        __props__.__dict__["access_key_id"] = access_key_id
        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["aws_account_id"] = aws_account_id
        __props__.__dict__["metric_collection_mode"] = metric_collection_mode
        __props__.__dict__["name"] = name
        __props__.__dict__["secret_access_key"] = secret_access_key
        return AwsGovcloudLinkAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accessKeyId")
    def access_key_id(self) -> pulumi.Output[str]:
        """
        The access key of the AwsGovCloud.
        """
        return pulumi.get(self, "access_key_id")

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        The New Relic account ID to operate on. This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="awsAccountId")
    def aws_account_id(self) -> pulumi.Output[str]:
        """
        The AwsGovCloud account ID.
        """
        return pulumi.get(self, "aws_account_id")

    @property
    @pulumi.getter(name="metricCollectionMode")
    def metric_collection_mode(self) -> pulumi.Output[Optional[str]]:
        """
        How metrics will be collected. Use `PUSH` for a metric stream or `PULL` to integrate with individual services.
        """
        return pulumi.get(self, "metric_collection_mode")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        - The linked account name
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="secretAccessKey")
    def secret_access_key(self) -> pulumi.Output[str]:
        """
        The secret key of the AwsGovCloud.
        """
        return pulumi.get(self, "secret_access_key")

