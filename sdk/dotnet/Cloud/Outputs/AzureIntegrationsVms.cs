// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Outputs
{

    [OutputType]
    public sealed class AzureIntegrationsVms
    {
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        public readonly int? MetricsPollingInterval;
        /// <summary>
        /// Specify each Resource group associated with the resources that you want to monitor. Filter values are case-sensitive
        /// </summary>
        public readonly ImmutableArray<string> ResourceGroups;

        [OutputConstructor]
        private AzureIntegrationsVms(
            int? metricsPollingInterval,

            ImmutableArray<string> resourceGroups)
        {
            MetricsPollingInterval = metricsPollingInterval;
            ResourceGroups = resourceGroups;
        }
    }
}
