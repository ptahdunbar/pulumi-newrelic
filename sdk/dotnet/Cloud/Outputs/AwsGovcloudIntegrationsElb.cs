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
    public sealed class AwsGovcloudIntegrationsElb
    {
        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// * `direct connect`
        /// * `aws states`
        /// * `cloudtrail`
        /// * `dynamoDB`
        /// </summary>
        public readonly ImmutableArray<string> AwsRegions;
        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// * `s3`
        /// * `sqs`
        /// </summary>
        public readonly bool? FetchExtendedInventory;
        /// <summary>
        /// Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// * `emr`
        /// </summary>
        public readonly bool? FetchTags;
        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        public readonly int? MetricsPollingInterval;

        [OutputConstructor]
        private AwsGovcloudIntegrationsElb(
            ImmutableArray<string> awsRegions,

            bool? fetchExtendedInventory,

            bool? fetchTags,

            int? metricsPollingInterval)
        {
            AwsRegions = awsRegions;
            FetchExtendedInventory = fetchExtendedInventory;
            FetchTags = fetchTags;
            MetricsPollingInterval = metricsPollingInterval;
        }
    }
}
