// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class GcpIntegrationsBigQueryArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specify if labels and the extended inventory should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// </summary>
        [Input("fetchTags")]
        public Input<bool>? FetchTags { get; set; }

        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        public GcpIntegrationsBigQueryArgs()
        {
        }
    }
}
