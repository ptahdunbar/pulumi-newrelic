# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = ['AzureLinkAccountArgs', 'AzureLinkAccount']

@pulumi.input_type
class AzureLinkAccountArgs:
    def __init__(__self__, *,
                 application_id: pulumi.Input[str],
                 client_secret: pulumi.Input[str],
                 subscription_id: pulumi.Input[str],
                 tenant_id: pulumi.Input[str],
                 account_id: Optional[pulumi.Input[int]] = None,
                 name: Optional[pulumi.Input[str]] = None):
        """
        The set of arguments for constructing a AzureLinkAccount resource.
        :param pulumi.Input[str] application_id: - Application ID of the App.
        :param pulumi.Input[str] client_secret: - Secret Value of the client.
        :param pulumi.Input[str] subscription_id: - Subscription ID of the Azure cloud account.
        :param pulumi.Input[str] tenant_id: - Tenant ID of the Azure cloud account.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic.
        :param pulumi.Input[str] name: - The name of the application in New Relic APM.
        """
        pulumi.set(__self__, "application_id", application_id)
        pulumi.set(__self__, "client_secret", client_secret)
        pulumi.set(__self__, "subscription_id", subscription_id)
        pulumi.set(__self__, "tenant_id", tenant_id)
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if name is not None:
            pulumi.set(__self__, "name", name)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Input[str]:
        """
        - Application ID of the App.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Input[str]:
        """
        - Secret Value of the client.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: pulumi.Input[str]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Input[str]:
        """
        - Subscription ID of the Azure cloud account.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Input[str]:
        """
        - Tenant ID of the Azure cloud account.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: pulumi.Input[str]):
        pulumi.set(self, "tenant_id", value)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        - Account ID of the New Relic.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The name of the application in New Relic APM.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)


@pulumi.input_type
class _AzureLinkAccountState:
    def __init__(__self__, *,
                 account_id: Optional[pulumi.Input[int]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None):
        """
        Input properties used for looking up and filtering AzureLinkAccount resources.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic.
        :param pulumi.Input[str] application_id: - Application ID of the App.
        :param pulumi.Input[str] client_secret: - Secret Value of the client.
        :param pulumi.Input[str] name: - The name of the application in New Relic APM.
        :param pulumi.Input[str] subscription_id: - Subscription ID of the Azure cloud account.
        :param pulumi.Input[str] tenant_id: - Tenant ID of the Azure cloud account.
        """
        if account_id is not None:
            pulumi.set(__self__, "account_id", account_id)
        if application_id is not None:
            pulumi.set(__self__, "application_id", application_id)
        if client_secret is not None:
            pulumi.set(__self__, "client_secret", client_secret)
        if name is not None:
            pulumi.set(__self__, "name", name)
        if subscription_id is not None:
            pulumi.set(__self__, "subscription_id", subscription_id)
        if tenant_id is not None:
            pulumi.set(__self__, "tenant_id", tenant_id)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> Optional[pulumi.Input[int]]:
        """
        - Account ID of the New Relic.
        """
        return pulumi.get(self, "account_id")

    @account_id.setter
    def account_id(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "account_id", value)

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> Optional[pulumi.Input[str]]:
        """
        - Application ID of the App.
        """
        return pulumi.get(self, "application_id")

    @application_id.setter
    def application_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "application_id", value)

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> Optional[pulumi.Input[str]]:
        """
        - Secret Value of the client.
        """
        return pulumi.get(self, "client_secret")

    @client_secret.setter
    def client_secret(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "client_secret", value)

    @property
    @pulumi.getter
    def name(self) -> Optional[pulumi.Input[str]]:
        """
        - The name of the application in New Relic APM.
        """
        return pulumi.get(self, "name")

    @name.setter
    def name(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "name", value)

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> Optional[pulumi.Input[str]]:
        """
        - Subscription ID of the Azure cloud account.
        """
        return pulumi.get(self, "subscription_id")

    @subscription_id.setter
    def subscription_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "subscription_id", value)

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> Optional[pulumi.Input[str]]:
        """
        - Tenant ID of the Azure cloud account.
        """
        return pulumi.get(self, "tenant_id")

    @tenant_id.setter
    def tenant_id(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "tenant_id", value)


class AzureLinkAccount(pulumi.CustomResource):
    @overload
    def __init__(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        """
        ## Import

        Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic bash

        ```sh
         $ pulumi import newrelic:cloud/azureLinkAccount:AzureLinkAccount foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic.
        :param pulumi.Input[str] application_id: - Application ID of the App.
        :param pulumi.Input[str] client_secret: - Secret Value of the client.
        :param pulumi.Input[str] name: - The name of the application in New Relic APM.
        :param pulumi.Input[str] subscription_id: - Subscription ID of the Azure cloud account.
        :param pulumi.Input[str] tenant_id: - Tenant ID of the Azure cloud account.
        """
        ...
    @overload
    def __init__(__self__,
                 resource_name: str,
                 args: AzureLinkAccountArgs,
                 opts: Optional[pulumi.ResourceOptions] = None):
        """
        ## Import

        Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic bash

        ```sh
         $ pulumi import newrelic:cloud/azureLinkAccount:AzureLinkAccount foo <id>
        ```

        :param str resource_name: The name of the resource.
        :param AzureLinkAccountArgs args: The arguments to use to populate this resource's properties.
        :param pulumi.ResourceOptions opts: Options for the resource.
        """
        ...
    def __init__(__self__, resource_name: str, *args, **kwargs):
        resource_args, opts = _utilities.get_resource_args_opts(AzureLinkAccountArgs, pulumi.ResourceOptions, *args, **kwargs)
        if resource_args is not None:
            __self__._internal_init(resource_name, opts, **resource_args.__dict__)
        else:
            __self__._internal_init(resource_name, *args, **kwargs)

    def _internal_init(__self__,
                 resource_name: str,
                 opts: Optional[pulumi.ResourceOptions] = None,
                 account_id: Optional[pulumi.Input[int]] = None,
                 application_id: Optional[pulumi.Input[str]] = None,
                 client_secret: Optional[pulumi.Input[str]] = None,
                 name: Optional[pulumi.Input[str]] = None,
                 subscription_id: Optional[pulumi.Input[str]] = None,
                 tenant_id: Optional[pulumi.Input[str]] = None,
                 __props__=None):
        opts = pulumi.ResourceOptions.merge(_utilities.get_resource_opts_defaults(), opts)
        if not isinstance(opts, pulumi.ResourceOptions):
            raise TypeError('Expected resource options to be a ResourceOptions instance')
        if opts.id is None:
            if __props__ is not None:
                raise TypeError('__props__ is only valid when passed in combination with a valid opts.id to get an existing resource')
            __props__ = AzureLinkAccountArgs.__new__(AzureLinkAccountArgs)

            __props__.__dict__["account_id"] = account_id
            if application_id is None and not opts.urn:
                raise TypeError("Missing required property 'application_id'")
            __props__.__dict__["application_id"] = application_id
            if client_secret is None and not opts.urn:
                raise TypeError("Missing required property 'client_secret'")
            __props__.__dict__["client_secret"] = None if client_secret is None else pulumi.Output.secret(client_secret)
            __props__.__dict__["name"] = name
            if subscription_id is None and not opts.urn:
                raise TypeError("Missing required property 'subscription_id'")
            __props__.__dict__["subscription_id"] = subscription_id
            if tenant_id is None and not opts.urn:
                raise TypeError("Missing required property 'tenant_id'")
            __props__.__dict__["tenant_id"] = tenant_id
        secret_opts = pulumi.ResourceOptions(additional_secret_outputs=["clientSecret"])
        opts = pulumi.ResourceOptions.merge(opts, secret_opts)
        super(AzureLinkAccount, __self__).__init__(
            'newrelic:cloud/azureLinkAccount:AzureLinkAccount',
            resource_name,
            __props__,
            opts)

    @staticmethod
    def get(resource_name: str,
            id: pulumi.Input[str],
            opts: Optional[pulumi.ResourceOptions] = None,
            account_id: Optional[pulumi.Input[int]] = None,
            application_id: Optional[pulumi.Input[str]] = None,
            client_secret: Optional[pulumi.Input[str]] = None,
            name: Optional[pulumi.Input[str]] = None,
            subscription_id: Optional[pulumi.Input[str]] = None,
            tenant_id: Optional[pulumi.Input[str]] = None) -> 'AzureLinkAccount':
        """
        Get an existing AzureLinkAccount resource's state with the given name, id, and optional extra
        properties used to qualify the lookup.

        :param str resource_name: The unique name of the resulting resource.
        :param pulumi.Input[str] id: The unique provider ID of the resource to lookup.
        :param pulumi.ResourceOptions opts: Options for the resource.
        :param pulumi.Input[int] account_id: - Account ID of the New Relic.
        :param pulumi.Input[str] application_id: - Application ID of the App.
        :param pulumi.Input[str] client_secret: - Secret Value of the client.
        :param pulumi.Input[str] name: - The name of the application in New Relic APM.
        :param pulumi.Input[str] subscription_id: - Subscription ID of the Azure cloud account.
        :param pulumi.Input[str] tenant_id: - Tenant ID of the Azure cloud account.
        """
        opts = pulumi.ResourceOptions.merge(opts, pulumi.ResourceOptions(id=id))

        __props__ = _AzureLinkAccountState.__new__(_AzureLinkAccountState)

        __props__.__dict__["account_id"] = account_id
        __props__.__dict__["application_id"] = application_id
        __props__.__dict__["client_secret"] = client_secret
        __props__.__dict__["name"] = name
        __props__.__dict__["subscription_id"] = subscription_id
        __props__.__dict__["tenant_id"] = tenant_id
        return AzureLinkAccount(resource_name, opts=opts, __props__=__props__)

    @property
    @pulumi.getter(name="accountId")
    def account_id(self) -> pulumi.Output[int]:
        """
        - Account ID of the New Relic.
        """
        return pulumi.get(self, "account_id")

    @property
    @pulumi.getter(name="applicationId")
    def application_id(self) -> pulumi.Output[str]:
        """
        - Application ID of the App.
        """
        return pulumi.get(self, "application_id")

    @property
    @pulumi.getter(name="clientSecret")
    def client_secret(self) -> pulumi.Output[str]:
        """
        - Secret Value of the client.
        """
        return pulumi.get(self, "client_secret")

    @property
    @pulumi.getter
    def name(self) -> pulumi.Output[str]:
        """
        - The name of the application in New Relic APM.
        """
        return pulumi.get(self, "name")

    @property
    @pulumi.getter(name="subscriptionId")
    def subscription_id(self) -> pulumi.Output[str]:
        """
        - Subscription ID of the Azure cloud account.
        """
        return pulumi.get(self, "subscription_id")

    @property
    @pulumi.getter(name="tenantId")
    def tenant_id(self) -> pulumi.Output[str]:
        """
        - Tenant ID of the Azure cloud account.
        """
        return pulumi.get(self, "tenant_id")

