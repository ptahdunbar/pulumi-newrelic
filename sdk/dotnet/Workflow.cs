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
    /// Use this resource to create and manage New Relic workflow.
    /// 
    /// ## Full Scenario Example
    /// 
    /// Create a destination resource and reference that destination to the channel resource. Then create a workflow and reference the channel resource to it.
    /// 
    /// ### Create a policy
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var collector_policy = new NewRelic.AlertPolicy("collector-policy");
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a destination
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var webhook_destination = new NewRelic.NotificationDestination("webhook-destination", new()
    ///     {
    ///         AccountId = 12345678,
    ///         AuthBasic = new NewRelic.Inputs.NotificationDestinationAuthBasicArgs
    ///         {
    ///             Password = "password",
    ///             User = "username",
    ///         },
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationDestinationPropertyArgs
    ///             {
    ///                 Key = "url",
    ///                 Value = "https://webhook.mywebhook.com",
    ///             },
    ///         },
    ///         Type = "WEBHOOK",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a channel
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var webhook_channel = new NewRelic.NotificationChannel("webhook-channel", new()
    ///     {
    ///         AccountId = 12345678,
    ///         Type = "WEBHOOK",
    ///         DestinationId = newrelic_notification_destination.Webhook_destination.Id,
    ///         Product = "IINT",
    ///         Properties = new[]
    ///         {
    ///             new NewRelic.Inputs.NotificationChannelPropertyArgs
    ///             {
    ///                 Key = "payload",
    ///                 Value = "{name: {{ variable }} }",
    ///                 Label = "Payload Template",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ### Create a workflow
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var workflow_example = new NewRelic.Workflow("workflow-example", new()
    ///     {
    ///         AccountId = 12345678,
    ///         MutingRulesHandling = "NOTIFY_ALL_ISSUES",
    ///         Enrichments = new NewRelic.Inputs.WorkflowEnrichmentsArgs
    ///         {
    ///             Nrqls = new[]
    ///             {
    ///                 new NewRelic.Inputs.WorkflowEnrichmentsNrqlArgs
    ///                 {
    ///                     Name = "Log count",
    ///                     Configurations = new[]
    ///                     {
    ///                         new NewRelic.Inputs.WorkflowEnrichmentsNrqlConfigurationArgs
    ///                         {
    ///                             Query = "SELECT count(*) FROM Log WHERE message like '%error%' since 10 minutes ago",
    ///                         },
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         IssuesFilter = new NewRelic.Inputs.WorkflowIssuesFilterArgs
    ///         {
    ///             Name = "Filter-name",
    ///             Type = "FILTER",
    ///             Predicates = new[]
    ///             {
    ///                 new NewRelic.Inputs.WorkflowIssuesFilterPredicateArgs
    ///                 {
    ///                     Attribute = "accumulations.policyName",
    ///                     Operator = "EXACTLY_MATCHES",
    ///                     Values = new[]
    ///                     {
    ///                         "my_policy",
    ///                     },
    ///                 },
    ///                 new NewRelic.Inputs.WorkflowIssuesFilterPredicateArgs
    ///                 {
    ///                     Attribute = "accumulations.sources",
    ///                     Operator = "EXACTLY_MATCHES",
    ///                     Values = new[]
    ///                     {
    ///                         "newrelic",
    ///                     },
    ///                 },
    ///             },
    ///         },
    ///         Destinations = new[]
    ///         {
    ///             new NewRelic.Inputs.WorkflowDestinationArgs
    ///             {
    ///                 ChannelId = newrelic_notification_channel.Webhook_channel.Id,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Additional Information
    /// 
    /// More details about the workflows can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/applied-intelligence/incident-workflows/incident-workflows/).
    /// 
    /// ## v3.3 changes
    /// 
    /// In version v3.3 we renamed the following arguments:
    /// 
    /// - `workflow_enabled` changed to `enabled`.
    /// - `destination_configuration` changed to `destination`.
    /// - `predicates` changed to `predicate`.
    /// - Enrichment's `configurations` changed to `configuration`.
    /// </summary>
    [NewRelicResourceType("newrelic:index/workflow:Workflow")]
    public partial class Workflow : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Output("accountId")]
        public Output<int?> AccountId { get; private set; } = null!;

        /// <summary>
        /// A nested block that contains a channel id.
        /// </summary>
        [Output("destinations")]
        public Output<ImmutableArray<Outputs.WorkflowDestination>> Destinations { get; private set; } = null!;

        /// <summary>
        /// Whether destinations are enabled..
        /// </summary>
        [Output("destinationsEnabled")]
        public Output<bool?> DestinationsEnabled { get; private set; } = null!;

        /// <summary>
        /// Whether workflow is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
        /// </summary>
        [Output("enrichments")]
        public Output<Outputs.WorkflowEnrichments?> Enrichments { get; private set; } = null!;

        /// <summary>
        /// Whether enrichments are enabled..
        /// </summary>
        [Output("enrichmentsEnabled")]
        public Output<bool?> EnrichmentsEnabled { get; private set; } = null!;

        /// <summary>
        /// The issues filter.  See Nested issues_filter blocks below for details.
        /// </summary>
        [Output("issuesFilter")]
        public Output<Outputs.WorkflowIssuesFilter> IssuesFilter { get; private set; } = null!;

        /// <summary>
        /// The last time notification was sent for this workflow.
        /// </summary>
        [Output("lastRun")]
        public Output<string> LastRun { get; private set; } = null!;

        /// <summary>
        /// Which muting rule handling this workflow has.
        /// </summary>
        [Output("mutingRulesHandling")]
        public Output<string> MutingRulesHandling { get; private set; } = null!;

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The id of the workflow.
        /// </summary>
        [Output("workflowId")]
        public Output<string> WorkflowId { get; private set; } = null!;


        /// <summary>
        /// Create a Workflow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Workflow(string name, WorkflowArgs args, CustomResourceOptions? options = null)
            : base("newrelic:index/workflow:Workflow", name, args ?? new WorkflowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Workflow(string name, Input<string> id, WorkflowState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:index/workflow:Workflow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Workflow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Workflow Get(string name, Input<string> id, WorkflowState? state = null, CustomResourceOptions? options = null)
        {
            return new Workflow(name, id, state, options);
        }
    }

    public sealed class WorkflowArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("destinations", required: true)]
        private InputList<Inputs.WorkflowDestinationArgs>? _destinations;

        /// <summary>
        /// A nested block that contains a channel id.
        /// </summary>
        public InputList<Inputs.WorkflowDestinationArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.WorkflowDestinationArgs>());
            set => _destinations = value;
        }

        /// <summary>
        /// Whether destinations are enabled..
        /// </summary>
        [Input("destinationsEnabled")]
        public Input<bool>? DestinationsEnabled { get; set; }

        /// <summary>
        /// Whether workflow is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
        /// </summary>
        [Input("enrichments")]
        public Input<Inputs.WorkflowEnrichmentsArgs>? Enrichments { get; set; }

        /// <summary>
        /// Whether enrichments are enabled..
        /// </summary>
        [Input("enrichmentsEnabled")]
        public Input<bool>? EnrichmentsEnabled { get; set; }

        /// <summary>
        /// The issues filter.  See Nested issues_filter blocks below for details.
        /// </summary>
        [Input("issuesFilter", required: true)]
        public Input<Inputs.WorkflowIssuesFilterArgs> IssuesFilter { get; set; } = null!;

        /// <summary>
        /// Which muting rule handling this workflow has.
        /// </summary>
        [Input("mutingRulesHandling", required: true)]
        public Input<string> MutingRulesHandling { get; set; } = null!;

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public WorkflowArgs()
        {
        }
        public static new WorkflowArgs Empty => new WorkflowArgs();
    }

    public sealed class WorkflowState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        [Input("destinations")]
        private InputList<Inputs.WorkflowDestinationGetArgs>? _destinations;

        /// <summary>
        /// A nested block that contains a channel id.
        /// </summary>
        public InputList<Inputs.WorkflowDestinationGetArgs> Destinations
        {
            get => _destinations ?? (_destinations = new InputList<Inputs.WorkflowDestinationGetArgs>());
            set => _destinations = value;
        }

        /// <summary>
        /// Whether destinations are enabled..
        /// </summary>
        [Input("destinationsEnabled")]
        public Input<bool>? DestinationsEnabled { get; set; }

        /// <summary>
        /// Whether workflow is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
        /// </summary>
        [Input("enrichments")]
        public Input<Inputs.WorkflowEnrichmentsGetArgs>? Enrichments { get; set; }

        /// <summary>
        /// Whether enrichments are enabled..
        /// </summary>
        [Input("enrichmentsEnabled")]
        public Input<bool>? EnrichmentsEnabled { get; set; }

        /// <summary>
        /// The issues filter.  See Nested issues_filter blocks below for details.
        /// </summary>
        [Input("issuesFilter")]
        public Input<Inputs.WorkflowIssuesFilterGetArgs>? IssuesFilter { get; set; }

        /// <summary>
        /// The last time notification was sent for this workflow.
        /// </summary>
        [Input("lastRun")]
        public Input<string>? LastRun { get; set; }

        /// <summary>
        /// Which muting rule handling this workflow has.
        /// </summary>
        [Input("mutingRulesHandling")]
        public Input<string>? MutingRulesHandling { get; set; }

        /// <summary>
        /// A nrql enrichment name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The id of the workflow.
        /// </summary>
        [Input("workflowId")]
        public Input<string>? WorkflowId { get; set; }

        public WorkflowState()
        {
        }
        public static new WorkflowState Empty => new WorkflowState();
    }
}
