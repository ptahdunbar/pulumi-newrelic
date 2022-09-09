// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowIssuesFilterGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("filterId")]
        public Input<string>? FilterId { get; set; }

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("predicates")]
        private InputList<Inputs.WorkflowIssuesFilterPredicateGetArgs>? _predicates;
        public InputList<Inputs.WorkflowIssuesFilterPredicateGetArgs> Predicates
        {
            get => _predicates ?? (_predicates = new InputList<Inputs.WorkflowIssuesFilterPredicateGetArgs>());
            set => _predicates = value;
        }

        /// <summary>
        /// the filter's type.   One of: `FILTER` or `VIEW`.
        /// * `predicates`
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WorkflowIssuesFilterGetArgs()
        {
        }
        public static new WorkflowIssuesFilterGetArgs Empty => new WorkflowIssuesFilterGetArgs();
    }
}
