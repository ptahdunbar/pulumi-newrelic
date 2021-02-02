// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    /// <summary>
    /// Use this resource to create and manage NRQL alert conditions in New Relic.
    /// 
    /// ## NRQL
    /// 
    /// The `nrql` block supports the following arguments:
    /// 
    /// - `query` - (Required) The NRQL query to execute for the condition.
    /// - `evaluation_offset` - (Optional) Represented in minutes and must be within 1-20 minutes (inclusive). NRQL queries are evaluated in one-minute time windows. The start time depends on this value. It's recommended to set this to 3 minutes. An offset of less than 3 minutes will trigger violations sooner, but you may see more false positives and negatives due to data latency. With `evaluation_offset` set to 3 minutes, the NRQL time window applied to your query will be: `SINCE 3 minutes ago UNTIL 2 minutes ago`.
    /// - `since_value` - (Optional)  **DEPRECATED:** Use `evaluation_offset` instead. The value to be used in the `SINCE &lt;X&gt; minutes ago` clause for the NRQL query. Must be between 1-20 (inclusive).
    /// 
    /// ## Terms
    /// 
    /// &gt; **NOTE:** The direct use of the `term` has been deprecated, and users should use `critical` and `warning` instead.  What follows now applies to the named priority attributes for `critical` and `warning`, but for those attributes the priority is not allowed.
    /// 
    /// NRQL alert conditions support up to two terms. At least one `term` must have `priority` set to `critical` and the second optional `term` must have `priority` set to `warning`.
    /// 
    /// The `term` block the following arguments:
    /// 
    /// - `duration` - (Required) In minutes, must be in the range of `1` to `120`, inclusive.
    /// - `operator` - (Optional) `above`, `below`, or `equal`. Defaults to `equal`. Note that when using a `type` of `outlier`, the only valid option here is `above`.
    /// - `priority` - (Optional) `critical` or `warning`. Defaults to `critical`.
    /// - `threshold` - (Required) The value which will trigger a violation. Must be `0` or greater.
    /// - `threshold_duration` - (Optional) The duration of time, in seconds, that the threshold must violate for in order to create a violation. Value must be a multiple of 60.
    /// &lt;br&gt;For _baseline_ NRQL alert conditions, the value must be within 120-3600 seconds (inclusive).
    /// &lt;br&gt;For _static_ NRQL alert conditions, the value must be within 120-7200 seconds (inclusive).
    /// 
    /// - `threshold_occurrences` - (Optional) The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `at_least_once` (case insensitive).
    /// - `duration` - (Optional) **DEPRECATED:** Use `threshold_duration` instead. The duration of time, in _minutes_, that the threshold must violate for in order to create a violation. Must be within 1-120 (inclusive).
    /// - `time_function` - (Optional) **DEPRECATED:** Use `threshold_occurrences` instead. The criteria for how many data points must be in violation for the specified threshold duration. Valid values are: `all` or `any`.
    /// 
    /// ## Import
    /// 
    /// Alert conditions can be imported using a composite ID of `&lt;policy_id&gt;:&lt;condition_id&gt;:&lt;conditionType&gt;`, e.g. // For `baseline` conditions
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:baseline
    /// ```
    /// 
    ///  // For `static` conditions
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:static
    /// ```
    /// 
    ///  // For `outlier` conditions
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:index/nrqlAlertCondition:NrqlAlertCondition foo 538291:6789035:outlier
    /// ```
    /// 
    ///  The actual values for `policy_id` and `condition_id` can be retrieved from the following New Relic URL when viewing the NRQL alert condition you want to import&lt;small&gt;alerts.newrelic.com/accounts/**\&lt;account_id\&gt;**/policies/**\&lt;policy_id\&gt;**/conditions/**\&lt;condition_id\&gt;**/edit&lt;/small&gt;
    /// </summary>
    [NewRelicResourceType("newrelic:index/nrqlAlertCondition:NrqlAlertCondition")]
    public partial class NrqlAlertCondition : Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// The duration of the time window used to evaluate the NRQL query, in seconds.
        /// </summary>
        [Output("aggregationWindow")]
        public Output<int> AggregationWindow { get; private set; } = null!;

        /// <summary>
        /// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lower_only`, `upper_and_lower`, `upper_only` (case insensitive).
        /// </summary>
        [Output("baselineDirection")]
        public Output<string?> BaselineDirection { get; private set; } = null!;

        /// <summary>
        /// Whether to close all open violations when the signal expires.
        /// </summary>
        [Output("closeViolationsOnExpiration")]
        public Output<bool?> CloseViolationsOnExpiration { get; private set; } = null!;

        /// <summary>
        /// A list containing the `critical` threshold values. See Terms below for details.
        /// </summary>
        [Output("critical")]
        public Output<Outputs.NrqlAlertConditionCritical?> Critical { get; private set; } = null!;

        /// <summary>
        /// The description of the NRQL alert condition.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// Number of expected groups when using `outlier` detection.
        /// </summary>
        [Output("expectedGroups")]
        public Output<int?> ExpectedGroups { get; private set; } = null!;

        /// <summary>
        /// The amount of time (in seconds) to wait before considering the signal expired.
        /// </summary>
        [Output("expirationDuration")]
        public Output<int?> ExpirationDuration { get; private set; } = null!;

        /// <summary>
        /// Which strategy to use when filling gaps in the signal. If static, the 'fill value' will be used for filling gaps in the
        /// signal. Valid values are: 'NONE', 'LAST_VALUE', or 'STATIC' (case insensitive).
        /// </summary>
        [Output("fillOption")]
        public Output<string?> FillOption { get; private set; } = null!;

        /// <summary>
        /// If using the 'static' fill option, this value will be used for filling gaps in the signal.
        /// </summary>
        [Output("fillValue")]
        public Output<double?> FillValue { get; private set; } = null!;

        /// <summary>
        /// **DEPRECATED:** Use `open_violation_on_group_overlap` instead, but use the inverse value of your boolean - e.g. if `ignore_overlap = false`, use `open_violation_on_group_overlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Output("ignoreOverlap")]
        public Output<bool?> IgnoreOverlap { get; private set; } = null!;

        /// <summary>
        /// The title of the condition.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A NRQL query. See NRQL below for details.
        /// </summary>
        [Output("nrql")]
        public Output<Outputs.NrqlAlertConditionNrql> Nrql { get; private set; } = null!;

        /// <summary>
        /// Whether to create a new violation to capture that the signal expired.
        /// </summary>
        [Output("openViolationOnExpiration")]
        public Output<bool?> OpenViolationOnExpiration { get; private set; } = null!;

        /// <summary>
        /// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Output("openViolationOnGroupOverlap")]
        public Output<bool?> OpenViolationOnGroupOverlap { get; private set; } = null!;

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Output("policyId")]
        public Output<int> PolicyId { get; private set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Output("runbookUrl")]
        public Output<string?> RunbookUrl { get; private set; } = null!;

        /// <summary>
        /// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
        /// </summary>
        [Output("terms")]
        public Output<ImmutableArray<Outputs.NrqlAlertConditionTerm>> Terms { get; private set; } = null!;

        /// <summary>
        /// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;

        /// <summary>
        /// Possible values are `single_value`, `sum` (case insensitive). Defaults to `single_value`.
        /// </summary>
        [Output("valueFunction")]
        public Output<string?> ValueFunction { get; private set; } = null!;

        /// <summary>
        /// Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
        /// </summary>
        [Output("violationTimeLimit")]
        public Output<string> ViolationTimeLimit { get; private set; } = null!;

        /// <summary>
        /// **DEPRECATED:** Use `violation_time_limit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
        /// </summary>
        [Output("violationTimeLimitSeconds")]
        public Output<int?> ViolationTimeLimitSeconds { get; private set; } = null!;

        /// <summary>
        /// A list containing the `warning` threshold values. See Terms below for details.
        /// </summary>
        [Output("warning")]
        public Output<Outputs.NrqlAlertConditionWarning?> Warning { get; private set; } = null!;


        /// <summary>
        /// Create a NrqlAlertCondition resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NrqlAlertCondition(string name, NrqlAlertConditionArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, args ?? new NrqlAlertConditionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NrqlAlertCondition(string name, Input<string> id, NrqlAlertConditionState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/nrqlAlertCondition:NrqlAlertCondition", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing NrqlAlertCondition resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NrqlAlertCondition Get(string name, Input<string> id, NrqlAlertConditionState? state = null, CustomResourceOptions? options = null)
        {
            return new NrqlAlertCondition(name, id, state, options);
        }
    }

    public sealed class NrqlAlertConditionArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The duration of the time window used to evaluate the NRQL query, in seconds.
        /// </summary>
        [Input("aggregationWindow")]
        public Input<int>? AggregationWindow { get; set; }

        /// <summary>
        /// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lower_only`, `upper_and_lower`, `upper_only` (case insensitive).
        /// </summary>
        [Input("baselineDirection")]
        public Input<string>? BaselineDirection { get; set; }

        /// <summary>
        /// Whether to close all open violations when the signal expires.
        /// </summary>
        [Input("closeViolationsOnExpiration")]
        public Input<bool>? CloseViolationsOnExpiration { get; set; }

        /// <summary>
        /// A list containing the `critical` threshold values. See Terms below for details.
        /// </summary>
        [Input("critical")]
        public Input<Inputs.NrqlAlertConditionCriticalArgs>? Critical { get; set; }

        /// <summary>
        /// The description of the NRQL alert condition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Number of expected groups when using `outlier` detection.
        /// </summary>
        [Input("expectedGroups")]
        public Input<int>? ExpectedGroups { get; set; }

        /// <summary>
        /// The amount of time (in seconds) to wait before considering the signal expired.
        /// </summary>
        [Input("expirationDuration")]
        public Input<int>? ExpirationDuration { get; set; }

        /// <summary>
        /// Which strategy to use when filling gaps in the signal. If static, the 'fill value' will be used for filling gaps in the
        /// signal. Valid values are: 'NONE', 'LAST_VALUE', or 'STATIC' (case insensitive).
        /// </summary>
        [Input("fillOption")]
        public Input<string>? FillOption { get; set; }

        /// <summary>
        /// If using the 'static' fill option, this value will be used for filling gaps in the signal.
        /// </summary>
        [Input("fillValue")]
        public Input<double>? FillValue { get; set; }

        /// <summary>
        /// **DEPRECATED:** Use `open_violation_on_group_overlap` instead, but use the inverse value of your boolean - e.g. if `ignore_overlap = false`, use `open_violation_on_group_overlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Input("ignoreOverlap")]
        public Input<bool>? IgnoreOverlap { get; set; }

        /// <summary>
        /// The title of the condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A NRQL query. See NRQL below for details.
        /// </summary>
        [Input("nrql", required: true)]
        public Input<Inputs.NrqlAlertConditionNrqlArgs> Nrql { get; set; } = null!;

        /// <summary>
        /// Whether to create a new violation to capture that the signal expired.
        /// </summary>
        [Input("openViolationOnExpiration")]
        public Input<bool>? OpenViolationOnExpiration { get; set; }

        /// <summary>
        /// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Input("openViolationOnGroupOverlap")]
        public Input<bool>? OpenViolationOnGroupOverlap { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId", required: true)]
        public Input<int> PolicyId { get; set; } = null!;

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms")]
        private InputList<Inputs.NrqlAlertConditionTermArgs>? _terms;

        /// <summary>
        /// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
        /// </summary>
        [Obsolete(@"use `critical` and `warning` attributes instead")]
        public InputList<Inputs.NrqlAlertConditionTermArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.NrqlAlertConditionTermArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Possible values are `single_value`, `sum` (case insensitive). Defaults to `single_value`.
        /// </summary>
        [Input("valueFunction")]
        public Input<string>? ValueFunction { get; set; }

        /// <summary>
        /// Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
        /// </summary>
        [Input("violationTimeLimit")]
        public Input<string>? ViolationTimeLimit { get; set; }

        /// <summary>
        /// **DEPRECATED:** Use `violation_time_limit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
        /// </summary>
        [Input("violationTimeLimitSeconds")]
        public Input<int>? ViolationTimeLimitSeconds { get; set; }

        /// <summary>
        /// A list containing the `warning` threshold values. See Terms below for details.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.NrqlAlertConditionWarningArgs>? Warning { get; set; }

        public NrqlAlertConditionArgs()
        {
        }
    }

    public sealed class NrqlAlertConditionState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID of the account you wish to create the condition. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// The duration of the time window used to evaluate the NRQL query, in seconds.
        /// </summary>
        [Input("aggregationWindow")]
        public Input<int>? AggregationWindow { get; set; }

        /// <summary>
        /// The baseline direction of a _baseline_ NRQL alert condition. Valid values are: `lower_only`, `upper_and_lower`, `upper_only` (case insensitive).
        /// </summary>
        [Input("baselineDirection")]
        public Input<string>? BaselineDirection { get; set; }

        /// <summary>
        /// Whether to close all open violations when the signal expires.
        /// </summary>
        [Input("closeViolationsOnExpiration")]
        public Input<bool>? CloseViolationsOnExpiration { get; set; }

        /// <summary>
        /// A list containing the `critical` threshold values. See Terms below for details.
        /// </summary>
        [Input("critical")]
        public Input<Inputs.NrqlAlertConditionCriticalGetArgs>? Critical { get; set; }

        /// <summary>
        /// The description of the NRQL alert condition.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Whether to enable the alert condition. Valid values are `true` and `false`. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// Number of expected groups when using `outlier` detection.
        /// </summary>
        [Input("expectedGroups")]
        public Input<int>? ExpectedGroups { get; set; }

        /// <summary>
        /// The amount of time (in seconds) to wait before considering the signal expired.
        /// </summary>
        [Input("expirationDuration")]
        public Input<int>? ExpirationDuration { get; set; }

        /// <summary>
        /// Which strategy to use when filling gaps in the signal. If static, the 'fill value' will be used for filling gaps in the
        /// signal. Valid values are: 'NONE', 'LAST_VALUE', or 'STATIC' (case insensitive).
        /// </summary>
        [Input("fillOption")]
        public Input<string>? FillOption { get; set; }

        /// <summary>
        /// If using the 'static' fill option, this value will be used for filling gaps in the signal.
        /// </summary>
        [Input("fillValue")]
        public Input<double>? FillValue { get; set; }

        /// <summary>
        /// **DEPRECATED:** Use `open_violation_on_group_overlap` instead, but use the inverse value of your boolean - e.g. if `ignore_overlap = false`, use `open_violation_on_group_overlap = true`. This argument sets whether to trigger a violation when groups overlap. If set to `true` overlapping groups will not trigger a violation. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Input("ignoreOverlap")]
        public Input<bool>? IgnoreOverlap { get; set; }

        /// <summary>
        /// The title of the condition.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// A NRQL query. See NRQL below for details.
        /// </summary>
        [Input("nrql")]
        public Input<Inputs.NrqlAlertConditionNrqlGetArgs>? Nrql { get; set; }

        /// <summary>
        /// Whether to create a new violation to capture that the signal expired.
        /// </summary>
        [Input("openViolationOnExpiration")]
        public Input<bool>? OpenViolationOnExpiration { get; set; }

        /// <summary>
        /// Whether or not to trigger a violation when groups overlap. Set to `true` if you want to trigger a violation when groups overlap. This argument is only applicable in `outlier` conditions.
        /// </summary>
        [Input("openViolationOnGroupOverlap")]
        public Input<bool>? OpenViolationOnGroupOverlap { get; set; }

        /// <summary>
        /// The ID of the policy where this condition should be used.
        /// </summary>
        [Input("policyId")]
        public Input<int>? PolicyId { get; set; }

        /// <summary>
        /// Runbook URL to display in notifications.
        /// </summary>
        [Input("runbookUrl")]
        public Input<string>? RunbookUrl { get; set; }

        [Input("terms")]
        private InputList<Inputs.NrqlAlertConditionTermGetArgs>? _terms;

        /// <summary>
        /// **DEPRECATED** Use `critical`, and `warning` instead.  A list of terms for this condition. See Terms below for details.
        /// </summary>
        [Obsolete(@"use `critical` and `warning` attributes instead")]
        public InputList<Inputs.NrqlAlertConditionTermGetArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.NrqlAlertConditionTermGetArgs>());
            set => _terms = value;
        }

        /// <summary>
        /// The type of the condition. Valid values are `static`, `baseline`, or `outlier`. Defaults to `static`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        /// <summary>
        /// Possible values are `single_value`, `sum` (case insensitive). Defaults to `single_value`.
        /// </summary>
        [Input("valueFunction")]
        public Input<string>? ValueFunction { get; set; }

        /// <summary>
        /// Sets a time limit, in hours, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `ONE_HOUR`, `TWO_HOURS`, `FOUR_HOURS`, `EIGHT_HOURS`, `TWELVE_HOURS`, `TWENTY_FOUR_HOURS` (case insensitive).
        /// </summary>
        [Input("violationTimeLimit")]
        public Input<string>? ViolationTimeLimit { get; set; }

        /// <summary>
        /// **DEPRECATED:** Use `violation_time_limit` instead. Sets a time limit, in seconds, that will automatically force-close a long-lasting violation after the time limit you select. Possible values are `3600`, `7200`, `14400`, `28800`, `43200`, and `86400`.
        /// </summary>
        [Input("violationTimeLimitSeconds")]
        public Input<int>? ViolationTimeLimitSeconds { get; set; }

        /// <summary>
        /// A list containing the `warning` threshold values. See Terms below for details.
        /// </summary>
        [Input("warning")]
        public Input<Inputs.NrqlAlertConditionWarningGetArgs>? Warning { get; set; }

        public NrqlAlertConditionState()
        {
        }
    }
}
