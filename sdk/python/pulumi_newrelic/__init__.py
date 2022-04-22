# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

from . import _utilities
import typing
# Export this package's modules as members:
from .alert_channel import *
from .alert_condition import *
from .alert_muting_rule import *
from .alert_policy import *
from .alert_policy_channel import *
from .api_access_key import *
from .dashboard import *
from .entity_tags import *
from .events_to_metrics_rule import *
from .get_account import *
from .get_alert_channel import *
from .get_alert_policy import *
from .get_application import *
from .get_cloud_account import *
from .get_entity import *
from .get_key_transaction import *
from .infra_alert_condition import *
from .nrql_alert_condition import *
from .nrql_drop_rule import *
from .one_dashboard import *
from .one_dashboard_raw import *
from .provider import *
from .service_level import *
from ._inputs import *
from . import outputs

# Make subpackages available:
if typing.TYPE_CHECKING:
    import pulumi_newrelic.cloud as __cloud
    cloud = __cloud
    import pulumi_newrelic.config as __config
    config = __config
    import pulumi_newrelic.insights as __insights
    insights = __insights
    import pulumi_newrelic.plugins as __plugins
    plugins = __plugins
    import pulumi_newrelic.synthetics as __synthetics
    synthetics = __synthetics
else:
    cloud = _utilities.lazy_import('pulumi_newrelic.cloud')
    config = _utilities.lazy_import('pulumi_newrelic.config')
    insights = _utilities.lazy_import('pulumi_newrelic.insights')
    plugins = _utilities.lazy_import('pulumi_newrelic.plugins')
    synthetics = _utilities.lazy_import('pulumi_newrelic.synthetics')

_utilities.register(
    resource_modules="""
[
 {
  "pkg": "newrelic",
  "mod": "cloud/awsGovcloudIntegrations",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/awsGovcloudIntegrations:AwsGovcloudIntegrations": "AwsGovcloudIntegrations"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/awsGovcloudLinkAccount",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/awsGovcloudLinkAccount:AwsGovcloudLinkAccount": "AwsGovcloudLinkAccount"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/awsIntegrations",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/awsIntegrations:AwsIntegrations": "AwsIntegrations"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/awsLinkAccount",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/awsLinkAccount:AwsLinkAccount": "AwsLinkAccount"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/azureIntegrations",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/azureIntegrations:AzureIntegrations": "AzureIntegrations"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/azureLinkAccount",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/azureLinkAccount:AzureLinkAccount": "AzureLinkAccount"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/gcpIntegrations",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/gcpIntegrations:GcpIntegrations": "GcpIntegrations"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "cloud/gcpLinkAccount",
  "fqn": "pulumi_newrelic.cloud",
  "classes": {
   "newrelic:cloud/gcpLinkAccount:GcpLinkAccount": "GcpLinkAccount"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/alertChannel",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/alertChannel:AlertChannel": "AlertChannel"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/alertCondition",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/alertCondition:AlertCondition": "AlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/alertMutingRule",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/alertMutingRule:AlertMutingRule": "AlertMutingRule"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/alertPolicy",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/alertPolicy:AlertPolicy": "AlertPolicy"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/alertPolicyChannel",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/alertPolicyChannel:AlertPolicyChannel": "AlertPolicyChannel"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/apiAccessKey",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/apiAccessKey:ApiAccessKey": "ApiAccessKey"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/dashboard",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/dashboard:Dashboard": "Dashboard"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/entityTags",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/entityTags:EntityTags": "EntityTags"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/eventsToMetricsRule",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/eventsToMetricsRule:EventsToMetricsRule": "EventsToMetricsRule"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/infraAlertCondition",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/infraAlertCondition:InfraAlertCondition": "InfraAlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/nrqlAlertCondition",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/nrqlAlertCondition:NrqlAlertCondition": "NrqlAlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/nrqlDropRule",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/nrqlDropRule:NrqlDropRule": "NrqlDropRule"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/oneDashboard",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/oneDashboard:OneDashboard": "OneDashboard"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/oneDashboardRaw",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/oneDashboardRaw:OneDashboardRaw": "OneDashboardRaw"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "index/serviceLevel",
  "fqn": "pulumi_newrelic",
  "classes": {
   "newrelic:index/serviceLevel:ServiceLevel": "ServiceLevel"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "insights/event",
  "fqn": "pulumi_newrelic.insights",
  "classes": {
   "newrelic:insights/event:Event": "Event"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "plugins/alertCondition",
  "fqn": "pulumi_newrelic.plugins",
  "classes": {
   "newrelic:plugins/alertCondition:AlertCondition": "AlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "plugins/applicationSettings",
  "fqn": "pulumi_newrelic.plugins",
  "classes": {
   "newrelic:plugins/applicationSettings:ApplicationSettings": "ApplicationSettings"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "plugins/workload",
  "fqn": "pulumi_newrelic.plugins",
  "classes": {
   "newrelic:plugins/workload:Workload": "Workload"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "synthetics/alertCondition",
  "fqn": "pulumi_newrelic.synthetics",
  "classes": {
   "newrelic:synthetics/alertCondition:AlertCondition": "AlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "synthetics/monitor",
  "fqn": "pulumi_newrelic.synthetics",
  "classes": {
   "newrelic:synthetics/monitor:Monitor": "Monitor"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "synthetics/monitorScript",
  "fqn": "pulumi_newrelic.synthetics",
  "classes": {
   "newrelic:synthetics/monitorScript:MonitorScript": "MonitorScript"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "synthetics/multiLocationAlertCondition",
  "fqn": "pulumi_newrelic.synthetics",
  "classes": {
   "newrelic:synthetics/multiLocationAlertCondition:MultiLocationAlertCondition": "MultiLocationAlertCondition"
  }
 },
 {
  "pkg": "newrelic",
  "mod": "synthetics/secureCredential",
  "fqn": "pulumi_newrelic.synthetics",
  "classes": {
   "newrelic:synthetics/secureCredential:SecureCredential": "SecureCredential"
  }
 }
]
""",
    resource_packages="""
[
 {
  "pkg": "newrelic",
  "token": "pulumi:providers:newrelic",
  "fqn": "pulumi_newrelic",
  "class": "Provider"
 }
]
"""
)
