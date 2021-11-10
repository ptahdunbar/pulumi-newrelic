# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

import types

__config__ = pulumi.Config('newrelic')


class _ExportableConfig(types.ModuleType):
    @property
    def account_id(self) -> Optional[int]:
        return __config__.get_int('accountId') or _utilities.get_env_int('NEW_RELIC_ACCOUNT_ID')

    @property
    def admin_api_key(self) -> Optional[str]:
        return __config__.get('adminApiKey')

    @property
    def api_key(self) -> Optional[str]:
        return __config__.get('apiKey')

    @property
    def api_url(self) -> Optional[str]:
        return __config__.get('apiUrl')

    @property
    def cacert_file(self) -> Optional[str]:
        return __config__.get('cacertFile')

    @property
    def infrastructure_api_url(self) -> Optional[str]:
        return __config__.get('infrastructureApiUrl')

    @property
    def insecure_skip_verify(self) -> Optional[bool]:
        return __config__.get_bool('insecureSkipVerify')

    @property
    def insights_insert_key(self) -> Optional[str]:
        return __config__.get('insightsInsertKey')

    @property
    def insights_insert_url(self) -> Optional[str]:
        return __config__.get('insightsInsertUrl')

    @property
    def insights_query_url(self) -> Optional[str]:
        return __config__.get('insightsQueryUrl')

    @property
    def nerdgraph_api_url(self) -> Optional[str]:
        return __config__.get('nerdgraphApiUrl')

    @property
    def region(self) -> str:
        """
        The data center for which your New Relic account is configured. Only one region per provider block is permitted.
        """
        return __config__.get('region') or (_utilities.get_env('NEW_RELIC_REGION') or 'US')

    @property
    def synthetics_api_url(self) -> Optional[str]:
        return __config__.get('syntheticsApiUrl')

