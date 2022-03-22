// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Cloud
{
    /// <summary>
    /// Use this resource to link a GCP account to New Relic.
    /// 
    /// ## Prerequisite
    /// 
    /// To start receiving Google Cloud Platform (GCP) data with New Relic GCP integrations, connect your Google project to New Relic infrastructure monitoring. If you don't have one already, create a New Relic account. It's free, forever.
    /// 
    /// Setup is required in GCP for this resource to work properly. The New Relic GCP integration can be done by creating a user account or a service account.
    /// 
    /// A user with Project IAM Admin role is needed to add the service account ID as a member in your GCP project.
    /// 
    /// In the GCP project IAM &amp; admin, the service account must have the Project Viewer role and the Service Usage Consumer role or, alternatively, a custom role.
    /// 
    /// Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/google-cloud-platform-integrations/get-started/connect-google-cloud-platform-services-new-relic) to set up the integration.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var foo = new NewRelic.Cloud.GcpLinkAccount("foo", new NewRelic.Cloud.GcpLinkAccountArgs
    ///         {
    ///             AccountId = "account id of newrelic account",
    ///             ProjectId = "id of the Project",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:cloud/gcpLinkAccount:GcpLinkAccount")]
    public partial class GcpLinkAccount : Pulumi.CustomResource
    {
        /// <summary>
        /// - Account ID of the New Relic account.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// - The name of the GCP account in New Relic.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// - Project ID of the GCP account.
        /// </summary>
        [Output("projectId")]
        public Output<string> ProjectId { get; private set; } = null!;


        /// <summary>
        /// Create a GcpLinkAccount resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GcpLinkAccount(string name, GcpLinkAccountArgs args, CustomResourceOptions? options = null)
            : base("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, args ?? new GcpLinkAccountArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GcpLinkAccount(string name, Input<string> id, GcpLinkAccountState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:cloud/gcpLinkAccount:GcpLinkAccount", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GcpLinkAccount resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GcpLinkAccount Get(string name, Input<string> id, GcpLinkAccountState? state = null, CustomResourceOptions? options = null)
        {
            return new GcpLinkAccount(name, id, state, options);
        }
    }

    public sealed class GcpLinkAccountArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Account ID of the New Relic account.
        /// </summary>
        [Input("accountId", required: true)]
        public Input<int> AccountId { get; set; } = null!;

        /// <summary>
        /// - The name of the GCP account in New Relic.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// - Project ID of the GCP account.
        /// </summary>
        [Input("projectId", required: true)]
        public Input<string> ProjectId { get; set; } = null!;

        public GcpLinkAccountArgs()
        {
        }
    }

    public sealed class GcpLinkAccountState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// - Account ID of the New Relic account.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// - The name of the GCP account in New Relic.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// - Project ID of the GCP account.
        /// </summary>
        [Input("projectId")]
        public Input<string>? ProjectId { get; set; }

        public GcpLinkAccountState()
        {
        }
    }
}
