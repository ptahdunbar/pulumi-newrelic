// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetAlertPolicy
    {
        /// <summary>
        /// Use this data source to get information about a specific alert policy in New Relic that already exists.
        /// </summary>
        public static Task<GetAlertPolicyResult> InvokeAsync(GetAlertPolicyArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetAlertPolicyResult>("newrelic:index/getAlertPolicy:getAlertPolicy", args ?? new GetAlertPolicyArgs(), options.WithVersion());
    }


    public sealed class GetAlertPolicyArgs : Pulumi.InvokeArgs
    {
        [Input("accountId")]
        public int? AccountId { get; set; }

        /// <summary>
        /// The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
        /// </summary>
        [Input("incidentPreference")]
        public string? IncidentPreference { get; set; }

        /// <summary>
        /// The name of the alert policy in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetAlertPolicyArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetAlertPolicyResult
    {
        public readonly int AccountId;
        /// <summary>
        /// The time the policy was created.
        /// </summary>
        public readonly string CreatedAt;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// The rollup strategy for the policy. Options include: PER_POLICY, PER_CONDITION, or PER_CONDITION_AND_TARGET. The default is PER_POLICY.
        /// </summary>
        public readonly string? IncidentPreference;
        public readonly string Name;
        /// <summary>
        /// The time the policy was last updated.
        /// </summary>
        public readonly string UpdatedAt;

        [OutputConstructor]
        private GetAlertPolicyResult(
            int accountId,

            string createdAt,

            string id,

            string? incidentPreference,

            string name,

            string updatedAt)
        {
            AccountId = accountId;
            CreatedAt = createdAt;
            Id = id;
            IncidentPreference = incidentPreference;
            Name = name;
            UpdatedAt = updatedAt;
        }
    }
}
