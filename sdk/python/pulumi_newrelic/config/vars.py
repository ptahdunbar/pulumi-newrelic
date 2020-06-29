# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import json
import warnings
import pulumi
import pulumi.runtime
from typing import Union
from .. import utilities, tables

__config__ = pulumi.Config('newrelic')

account_id = __config__.get('accountId') or utilities.get_env_int('NEW_RELIC_ACCOUNT_ID')

admin_api_key = __config__.get('adminApiKey') or utilities.get_env('NEW_RELIC_ADMIN_API_KEY')

api_key = __config__.get('apiKey') or utilities.get_env('NEW_RELIC_API_KEY')

api_url = __config__.get('apiUrl')

cacert_file = __config__.get('cacertFile') or utilities.get_env('NEW_RELIC_API_CACERT')

infrastructure_api_url = __config__.get('infrastructureApiUrl')

insecure_skip_verify = __config__.get('insecureSkipVerify') or utilities.get_env_bool('NEW_RELIC_API_SKIP_VERIFY')

insights_insert_key = __config__.get('insightsInsertKey') or utilities.get_env('NEW_RELIC_INSIGHTS_INSERT_KEY')

insights_insert_url = __config__.get('insightsInsertUrl') or (utilities.get_env('NEW_RELIC_INSIGHTS_INSERT_URL') or 'https://insights-collector.newrelic.com/v1/accounts')

insights_query_url = __config__.get('insightsQueryUrl') or (utilities.get_env('NEW_RELIC_INSIGHTS_QUERY_URL') or 'https://insights-api.newrelic.com/v1/accounts')

nerdgraph_api_url = __config__.get('nerdgraphApiUrl')

region = __config__.get('region') or (utilities.get_env('NEW_RELIC_REGION') or 'US')
"""
The data center for which your New Relic account is configured. Only one region per provider block is permitted.
"""

synthetics_api_url = __config__.get('syntheticsApiUrl')

