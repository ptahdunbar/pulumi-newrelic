// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowIssuesFilterArgs : global::Pulumi.ResourceArgs
    {
        [Input("filterId")]
        public Input<string>? FilterId { get; set; }

        /// <summary>
        /// The name of the workflow.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("predicates")]
        private InputList<Inputs.WorkflowIssuesFilterPredicateArgs>? _predicates;

        /// <summary>
        /// A condition an issue event should satisfy to be processed by the workflow
        /// </summary>
        public InputList<Inputs.WorkflowIssuesFilterPredicateArgs> Predicates
        {
            get => _predicates ?? (_predicates = new InputList<Inputs.WorkflowIssuesFilterPredicateArgs>());
            set => _predicates = value;
        }

        /// <summary>
        /// Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WorkflowIssuesFilterArgs()
        {
        }
        public static new WorkflowIssuesFilterArgs Empty => new WorkflowIssuesFilterArgs();
    }
}
