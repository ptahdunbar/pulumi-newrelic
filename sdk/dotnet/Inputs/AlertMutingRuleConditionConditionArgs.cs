// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class AlertMutingRuleConditionConditionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The attribute on an incident. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
        /// </summary>
        [Input("attribute", required: true)]
        public Input<string> Attribute { get; set; } = null!;

        /// <summary>
        /// The operator used to compare the attribute's value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
        /// </summary>
        [Input("operator", required: true)]
        public Input<string> Operator { get; set; } = null!;

        [Input("values", required: true)]
        private InputList<string>? _values;

        /// <summary>
        /// The value(s) to compare against the attribute's value.
        /// </summary>
        public InputList<string> Values
        {
            get => _values ?? (_values = new InputList<string>());
            set => _values = value;
        }

        public AlertMutingRuleConditionConditionArgs()
        {
        }
        public static new AlertMutingRuleConditionConditionArgs Empty => new AlertMutingRuleConditionConditionArgs();
    }
}
