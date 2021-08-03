// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class NrqlAlertConditionNrql
    {
        /// <summary>
        /// Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It's recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.&lt;br&gt;
        /// &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
        /// </summary>
        public readonly int? EvaluationOffset;
        /// <summary>
        /// The NRQL query to execute for the condition.
        /// </summary>
        public readonly string Query;
        /// <summary>
        /// **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive). &lt;br&gt;
        /// &lt;small&gt;\***Note**: One of `evaluation_offset` _or_ `since_value` must be set, but not both.&lt;/small&gt;
        /// </summary>
        public readonly string? SinceValue;

        [OutputConstructor]
        private NrqlAlertConditionNrql(
            int? evaluationOffset,

            string query,

            string? sinceValue)
        {
            EvaluationOffset = evaluationOffset;
            Query = query;
            SinceValue = sinceValue;
        }
    }
}
