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
    public sealed class AwsGovcloudIntegrationsEbs
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// * `direct connect`
        /// * `aws states`
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        public readonly bool? FetchExtendedInventory;
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        public readonly int? MetricsPollingInterval;
        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        public readonly string? TagKey;
        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// * `api Gateway`
        /// * `auto scaling`
        /// * `elastic search`
        /// </summary>
        public readonly string? TagValue;

        [OutputConstructor]
        private AwsGovcloudIntegrationsEbs(
            ImmutableArray<string> awsRegions,

            bool? fetchExtendedInventory,

            int? metricsPollingInterval,

            string? tagKey,

            string? tagValue)
        {
            AwsRegions = awsRegions;
            FetchExtendedInventory = fetchExtendedInventory;
            MetricsPollingInterval = metricsPollingInterval;
            TagKey = tagKey;
            TagValue = tagValue;
        }
    }
}
