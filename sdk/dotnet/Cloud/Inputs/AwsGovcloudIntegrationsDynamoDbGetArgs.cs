// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud.Inputs
{

    public sealed class AwsGovcloudIntegrationsDynamoDbGetArgs : Pulumi.ResourceArgs
    {
        [Input("awsRegions")]
        private InputList<string>? _awsRegions;

        /// <summary>
        /// Specify each AWS region that includes the resources that you want to monitor.
        /// * `direct connect`
        /// * `aws states`
        /// * `cloudtrail`
        /// * `dynamoDB`
        /// </summary>
        public InputList<string> AwsRegions
        {
            get => _awsRegions ?? (_awsRegions = new InputList<string>());
            set => _awsRegions = value;
        }

        /// <summary>
        /// Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// * `s3`
        /// * `sqs`
        /// </summary>
        [Input("fetchExtendedInventory")]
        public Input<bool>? FetchExtendedInventory { get; set; }

        /// <summary>
        /// Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
        /// * `emr`
        /// </summary>
        [Input("fetchTags")]
        public Input<bool>? FetchTags { get; set; }

        /// <summary>
        /// The data polling interval in seconds.
        /// </summary>
        [Input("metricsPollingInterval")]
        public Input<int>? MetricsPollingInterval { get; set; }

        /// <summary>
        /// Specify a Tag key associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// </summary>
        [Input("tagKey")]
        public Input<string>? TagKey { get; set; }

        /// <summary>
        /// Specify a Tag value associated with the resources that you want to monitor. Filter values are case-sensitive.
        /// * `api Gateway`
        /// * `auto scaling`
        /// * `ebs`
        /// * `ec2`
        /// * `elastic search`
        /// * `elb`
        /// * `iam`
        /// * `lambda`
        /// * `rds`
        /// * `redshift`
        /// * `route53`
        /// * `sns`
        /// </summary>
        [Input("tagValue")]
        public Input<string>? TagValue { get; set; }

        public AwsGovcloudIntegrationsDynamoDbGetArgs()
        {
        }
    }
}
