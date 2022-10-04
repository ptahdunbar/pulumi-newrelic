// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowEnrichmentsNrqlArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("configurations", required: true)]
        private InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs>? _configurations;

        /// <summary>
        /// A list of nrql enrichments.
        /// </summary>
        public InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs> Configurations
        {
            get => _configurations ?? (_configurations = new InputList<Inputs.WorkflowEnrichmentsNrqlConfigurationArgs>());
            set => _configurations = value;
        }

        [Input("enrichmentId")]
        public Input<string>? EnrichmentId { get; set; }

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        /// <summary>
        /// the filter's type.   One of: `FILTER` or `VIEW`.
        /// * `predicate`
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public WorkflowEnrichmentsNrqlArgs()
        {
        }
        public static new WorkflowEnrichmentsNrqlArgs Empty => new WorkflowEnrichmentsNrqlArgs();
    }
}
