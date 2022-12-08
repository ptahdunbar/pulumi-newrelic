// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class WorkflowIssuesFilterPredicateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Issue event attribute to check
        /// </summary>
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        /// <summary>
        /// An operator to use to compare the attribute with the provided `values`. 
        /// One of: `CONTAINS`, `DOES_NOT_CONTAIN`, `EQUAL`, `DOES_NOT_EQUAL`, `DOES_NOT_EXACTLY_MATCH`, `STARTS_WITH`, `ENDS_WITH`,
        /// `EXACTLY_MATCHES`, `IS`, `IS_NOT`, `LESS_OR_EQUAL`, `LESS_THAN`, `GREATER_OR_EQUAL`, `GREATER_THAN` (see the note below)
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// The `attribute` must match **any** of the values in this list
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public WorkflowIssuesFilterPredicateArgs()
        {
        }
        public static new WorkflowIssuesFilterPredicateArgs Empty => new WorkflowIssuesFilterPredicateArgs();
    }
}
