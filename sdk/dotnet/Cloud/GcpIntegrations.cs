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
    /// ## Import
    /// 
    /// Linked GCP account integrations can be imported using the `id`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:cloud/gcpIntegrations:GcpIntegrations foo &lt;id&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:cloud/gcpIntegrations:GcpIntegrations")]
    public partial class GcpIntegrations : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Alloy DB integration. See Integration blocks below for details.
        /// </summary>
        [Output("alloyDb")]
        public Output<Outputs.GcpIntegrationsAlloyDb?> AlloyDb { get; private set; } = null!;

        /// <summary>
        /// App Engine integration. See Integration blocks below for details.
        /// </summary>
        [Output("appEngine")]
        public Output<Outputs.GcpIntegrationsAppEngine?> AppEngine { get; private set; } = null!;

        /// <summary>
        /// Biq Query integration. See Integration blocks below for details.
        /// </summary>
        [Output("bigQuery")]
        public Output<Outputs.GcpIntegrationsBigQuery?> BigQuery { get; private set; } = null!;

        /// <summary>
        /// Big Table. See Integration blocks below for details.
        /// </summary>
        [Output("bigTable")]
        public Output<Outputs.GcpIntegrationsBigTable?> BigTable { get; private set; } = null!;

        /// <summary>
        /// Composer integration. See Integration blocks below for details.
        /// </summary>
        [Output("composer")]
        public Output<Outputs.GcpIntegrationsComposer?> Composer { get; private set; } = null!;

        /// <summary>
        /// Data Flow integration. See Integration blocks below for details.
        /// </summary>
        [Output("dataFlow")]
        public Output<Outputs.GcpIntegrationsDataFlow?> DataFlow { get; private set; } = null!;

        /// <summary>
        /// Data Proc integration. See Integration blocks below for details.
        /// </summary>
        [Output("dataProc")]
        public Output<Outputs.GcpIntegrationsDataProc?> DataProc { get; private set; } = null!;

        /// <summary>
        /// Data Store integration. See Integration blocks below for details.
        /// </summary>
        [Output("dataStore")]
        public Output<Outputs.GcpIntegrationsDataStore?> DataStore { get; private set; } = null!;

        /// <summary>
        /// Fire Base Database integration. See Integration blocks below for details.
        /// </summary>
        [Output("fireBaseDatabase")]
        public Output<Outputs.GcpIntegrationsFireBaseDatabase?> FireBaseDatabase { get; private set; } = null!;

        /// <summary>
        /// Fire Base Hosting integration. See Integration blocks below for details.
        /// </summary>
        [Output("fireBaseHosting")]
        public Output<Outputs.GcpIntegrationsFireBaseHosting?> FireBaseHosting { get; private set; } = null!;

        /// <summary>
        /// Fire Base Storage integration. See Integration blocks below for details.
        /// </summary>
        [Output("fireBaseStorage")]
        public Output<Outputs.GcpIntegrationsFireBaseStorage?> FireBaseStorage { get; private set; } = null!;

        /// <summary>
        /// Fire Store integration. See Integration blocks below for details.
        /// </summary>
        [Output("fireStore")]
        public Output<Outputs.GcpIntegrationsFireStore?> FireStore { get; private set; } = null!;

        /// <summary>
        /// Functions integration. See Integration blocks below for details.
        /// </summary>
        [Output("functions")]
        public Output<Outputs.GcpIntegrationsFunctions?> Functions { get; private set; } = null!;

        /// <summary>
        /// Interconnect integration. See Integration blocks below for details.
        /// </summary>
        [Output("interconnect")]
        public Output<Outputs.GcpIntegrationsInterconnect?> Interconnect { get; private set; } = null!;

        /// <summary>
        /// Kubernetes integration. See Integration blocks below for details.
        /// </summary>
        [Output("kubernetes")]
        public Output<Outputs.GcpIntegrationsKubernetes?> Kubernetes { get; private set; } = null!;

        /// <summary>
        /// The ID of the linked GCP account in New Relic.
        /// </summary>
        [Output("linkedAccountId")]
        public Output<int> LinkedAccountId { get; private set; } = null!;

        /// <summary>
        /// GCP big table service
        /// </summary>
        [Output("loadBalancing")]
        public Output<Outputs.GcpIntegrationsLoadBalancing?> LoadBalancing { get; private set; } = null!;

        /// <summary>
        /// Mem cache integration. See Integration blocks below for details.
        /// </summary>
        [Output("memCache")]
        public Output<Outputs.GcpIntegrationsMemCache?> MemCache { get; private set; } = null!;

        /// <summary>
        /// Pub/Sub integration. See Integration blocks below for details.
        /// </summary>
        [Output("pubSub")]
        public Output<Outputs.GcpIntegrationsPubSub?> PubSub { get; private set; } = null!;

        /// <summary>
        /// Redis integration. See Integration blocks below for details.
        /// </summary>
        [Output("redis")]
        public Output<Outputs.GcpIntegrationsRedis?> Redis { get; private set; } = null!;

        /// <summary>
        /// Router integration. See Integration blocks below for details.
        /// </summary>
        [Output("router")]
        public Output<Outputs.GcpIntegrationsRouter?> Router { get; private set; } = null!;

        /// <summary>
        /// Run integration. See Integration blocks below for details.
        /// </summary>
        [Output("run")]
        public Output<Outputs.GcpIntegrationsRun?> Run { get; private set; } = null!;

        /// <summary>
        /// Spanner integration. See Integration blocks below for details.
        /// </summary>
        [Output("spanner")]
        public Output<Outputs.GcpIntegrationsSpanner?> Spanner { get; private set; } = null!;

        /// <summary>
        /// SQL integration. See Integration blocks below for details.
        /// </summary>
        [Output("sql")]
        public Output<Outputs.GcpIntegrationsSql?> Sql { get; private set; } = null!;

        /// <summary>
        /// Storage integration. See Integration blocks below for details.
        /// </summary>
        [Output("storage")]
        public Output<Outputs.GcpIntegrationsStorage?> Storage { get; private set; } = null!;

        /// <summary>
        /// Virtual machines integration. See Integration blocks below for details.
        /// </summary>
        [Output("virtualMachines")]
        public Output<Outputs.GcpIntegrationsVirtualMachines?> VirtualMachines { get; private set; } = null!;

        /// <summary>
        /// VPC Access integration. See Integration blocks below for details.
        /// </summary>
        [Output("vpcAccess")]
        public Output<Outputs.GcpIntegrationsVpcAccess?> VpcAccess { get; private set; } = null!;


        /// <summary>
        /// Create a GcpIntegrations resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public GcpIntegrations(string name, GcpIntegrationsArgs args, CustomResourceOptions? options = null)
            : base("newrelic:cloud/gcpIntegrations:GcpIntegrations", name, args ?? new GcpIntegrationsArgs(), MakeResourceOptions(options, ""))
        {
        }

        private GcpIntegrations(string name, Input<string> id, GcpIntegrationsState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:cloud/gcpIntegrations:GcpIntegrations", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing GcpIntegrations resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static GcpIntegrations Get(string name, Input<string> id, GcpIntegrationsState? state = null, CustomResourceOptions? options = null)
        {
            return new GcpIntegrations(name, id, state, options);
        }
    }

    public sealed class GcpIntegrationsArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Alloy DB integration. See Integration blocks below for details.
        /// </summary>
        [Input("alloyDb")]
        public Input<Inputs.GcpIntegrationsAlloyDbArgs>? AlloyDb { get; set; }

        /// <summary>
        /// App Engine integration. See Integration blocks below for details.
        /// </summary>
        [Input("appEngine")]
        public Input<Inputs.GcpIntegrationsAppEngineArgs>? AppEngine { get; set; }

        /// <summary>
        /// Biq Query integration. See Integration blocks below for details.
        /// </summary>
        [Input("bigQuery")]
        public Input<Inputs.GcpIntegrationsBigQueryArgs>? BigQuery { get; set; }

        /// <summary>
        /// Big Table. See Integration blocks below for details.
        /// </summary>
        [Input("bigTable")]
        public Input<Inputs.GcpIntegrationsBigTableArgs>? BigTable { get; set; }

        /// <summary>
        /// Composer integration. See Integration blocks below for details.
        /// </summary>
        [Input("composer")]
        public Input<Inputs.GcpIntegrationsComposerArgs>? Composer { get; set; }

        /// <summary>
        /// Data Flow integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataFlow")]
        public Input<Inputs.GcpIntegrationsDataFlowArgs>? DataFlow { get; set; }

        /// <summary>
        /// Data Proc integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataProc")]
        public Input<Inputs.GcpIntegrationsDataProcArgs>? DataProc { get; set; }

        /// <summary>
        /// Data Store integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataStore")]
        public Input<Inputs.GcpIntegrationsDataStoreArgs>? DataStore { get; set; }

        /// <summary>
        /// Fire Base Database integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseDatabase")]
        public Input<Inputs.GcpIntegrationsFireBaseDatabaseArgs>? FireBaseDatabase { get; set; }

        /// <summary>
        /// Fire Base Hosting integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseHosting")]
        public Input<Inputs.GcpIntegrationsFireBaseHostingArgs>? FireBaseHosting { get; set; }

        /// <summary>
        /// Fire Base Storage integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseStorage")]
        public Input<Inputs.GcpIntegrationsFireBaseStorageArgs>? FireBaseStorage { get; set; }

        /// <summary>
        /// Fire Store integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireStore")]
        public Input<Inputs.GcpIntegrationsFireStoreArgs>? FireStore { get; set; }

        /// <summary>
        /// Functions integration. See Integration blocks below for details.
        /// </summary>
        [Input("functions")]
        public Input<Inputs.GcpIntegrationsFunctionsArgs>? Functions { get; set; }

        /// <summary>
        /// Interconnect integration. See Integration blocks below for details.
        /// </summary>
        [Input("interconnect")]
        public Input<Inputs.GcpIntegrationsInterconnectArgs>? Interconnect { get; set; }

        /// <summary>
        /// Kubernetes integration. See Integration blocks below for details.
        /// </summary>
        [Input("kubernetes")]
        public Input<Inputs.GcpIntegrationsKubernetesArgs>? Kubernetes { get; set; }

        /// <summary>
        /// The ID of the linked GCP account in New Relic.
        /// </summary>
        [Input("linkedAccountId", required: true)]
        public Input<int> LinkedAccountId { get; set; } = null!;

        /// <summary>
        /// GCP big table service
        /// </summary>
        [Input("loadBalancing")]
        public Input<Inputs.GcpIntegrationsLoadBalancingArgs>? LoadBalancing { get; set; }

        /// <summary>
        /// Mem cache integration. See Integration blocks below for details.
        /// </summary>
        [Input("memCache")]
        public Input<Inputs.GcpIntegrationsMemCacheArgs>? MemCache { get; set; }

        /// <summary>
        /// Pub/Sub integration. See Integration blocks below for details.
        /// </summary>
        [Input("pubSub")]
        public Input<Inputs.GcpIntegrationsPubSubArgs>? PubSub { get; set; }

        /// <summary>
        /// Redis integration. See Integration blocks below for details.
        /// </summary>
        [Input("redis")]
        public Input<Inputs.GcpIntegrationsRedisArgs>? Redis { get; set; }

        /// <summary>
        /// Router integration. See Integration blocks below for details.
        /// </summary>
        [Input("router")]
        public Input<Inputs.GcpIntegrationsRouterArgs>? Router { get; set; }

        /// <summary>
        /// Run integration. See Integration blocks below for details.
        /// </summary>
        [Input("run")]
        public Input<Inputs.GcpIntegrationsRunArgs>? Run { get; set; }

        /// <summary>
        /// Spanner integration. See Integration blocks below for details.
        /// </summary>
        [Input("spanner")]
        public Input<Inputs.GcpIntegrationsSpannerArgs>? Spanner { get; set; }

        /// <summary>
        /// SQL integration. See Integration blocks below for details.
        /// </summary>
        [Input("sql")]
        public Input<Inputs.GcpIntegrationsSqlArgs>? Sql { get; set; }

        /// <summary>
        /// Storage integration. See Integration blocks below for details.
        /// </summary>
        [Input("storage")]
        public Input<Inputs.GcpIntegrationsStorageArgs>? Storage { get; set; }

        /// <summary>
        /// Virtual machines integration. See Integration blocks below for details.
        /// </summary>
        [Input("virtualMachines")]
        public Input<Inputs.GcpIntegrationsVirtualMachinesArgs>? VirtualMachines { get; set; }

        /// <summary>
        /// VPC Access integration. See Integration blocks below for details.
        /// </summary>
        [Input("vpcAccess")]
        public Input<Inputs.GcpIntegrationsVpcAccessArgs>? VpcAccess { get; set; }

        public GcpIntegrationsArgs()
        {
        }
        public static new GcpIntegrationsArgs Empty => new GcpIntegrationsArgs();
    }

    public sealed class GcpIntegrationsState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Alloy DB integration. See Integration blocks below for details.
        /// </summary>
        [Input("alloyDb")]
        public Input<Inputs.GcpIntegrationsAlloyDbGetArgs>? AlloyDb { get; set; }

        /// <summary>
        /// App Engine integration. See Integration blocks below for details.
        /// </summary>
        [Input("appEngine")]
        public Input<Inputs.GcpIntegrationsAppEngineGetArgs>? AppEngine { get; set; }

        /// <summary>
        /// Biq Query integration. See Integration blocks below for details.
        /// </summary>
        [Input("bigQuery")]
        public Input<Inputs.GcpIntegrationsBigQueryGetArgs>? BigQuery { get; set; }

        /// <summary>
        /// Big Table. See Integration blocks below for details.
        /// </summary>
        [Input("bigTable")]
        public Input<Inputs.GcpIntegrationsBigTableGetArgs>? BigTable { get; set; }

        /// <summary>
        /// Composer integration. See Integration blocks below for details.
        /// </summary>
        [Input("composer")]
        public Input<Inputs.GcpIntegrationsComposerGetArgs>? Composer { get; set; }

        /// <summary>
        /// Data Flow integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataFlow")]
        public Input<Inputs.GcpIntegrationsDataFlowGetArgs>? DataFlow { get; set; }

        /// <summary>
        /// Data Proc integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataProc")]
        public Input<Inputs.GcpIntegrationsDataProcGetArgs>? DataProc { get; set; }

        /// <summary>
        /// Data Store integration. See Integration blocks below for details.
        /// </summary>
        [Input("dataStore")]
        public Input<Inputs.GcpIntegrationsDataStoreGetArgs>? DataStore { get; set; }

        /// <summary>
        /// Fire Base Database integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseDatabase")]
        public Input<Inputs.GcpIntegrationsFireBaseDatabaseGetArgs>? FireBaseDatabase { get; set; }

        /// <summary>
        /// Fire Base Hosting integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseHosting")]
        public Input<Inputs.GcpIntegrationsFireBaseHostingGetArgs>? FireBaseHosting { get; set; }

        /// <summary>
        /// Fire Base Storage integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireBaseStorage")]
        public Input<Inputs.GcpIntegrationsFireBaseStorageGetArgs>? FireBaseStorage { get; set; }

        /// <summary>
        /// Fire Store integration. See Integration blocks below for details.
        /// </summary>
        [Input("fireStore")]
        public Input<Inputs.GcpIntegrationsFireStoreGetArgs>? FireStore { get; set; }

        /// <summary>
        /// Functions integration. See Integration blocks below for details.
        /// </summary>
        [Input("functions")]
        public Input<Inputs.GcpIntegrationsFunctionsGetArgs>? Functions { get; set; }

        /// <summary>
        /// Interconnect integration. See Integration blocks below for details.
        /// </summary>
        [Input("interconnect")]
        public Input<Inputs.GcpIntegrationsInterconnectGetArgs>? Interconnect { get; set; }

        /// <summary>
        /// Kubernetes integration. See Integration blocks below for details.
        /// </summary>
        [Input("kubernetes")]
        public Input<Inputs.GcpIntegrationsKubernetesGetArgs>? Kubernetes { get; set; }

        /// <summary>
        /// The ID of the linked GCP account in New Relic.
        /// </summary>
        [Input("linkedAccountId")]
        public Input<int>? LinkedAccountId { get; set; }

        /// <summary>
        /// GCP big table service
        /// </summary>
        [Input("loadBalancing")]
        public Input<Inputs.GcpIntegrationsLoadBalancingGetArgs>? LoadBalancing { get; set; }

        /// <summary>
        /// Mem cache integration. See Integration blocks below for details.
        /// </summary>
        [Input("memCache")]
        public Input<Inputs.GcpIntegrationsMemCacheGetArgs>? MemCache { get; set; }

        /// <summary>
        /// Pub/Sub integration. See Integration blocks below for details.
        /// </summary>
        [Input("pubSub")]
        public Input<Inputs.GcpIntegrationsPubSubGetArgs>? PubSub { get; set; }

        /// <summary>
        /// Redis integration. See Integration blocks below for details.
        /// </summary>
        [Input("redis")]
        public Input<Inputs.GcpIntegrationsRedisGetArgs>? Redis { get; set; }

        /// <summary>
        /// Router integration. See Integration blocks below for details.
        /// </summary>
        [Input("router")]
        public Input<Inputs.GcpIntegrationsRouterGetArgs>? Router { get; set; }

        /// <summary>
        /// Run integration. See Integration blocks below for details.
        /// </summary>
        [Input("run")]
        public Input<Inputs.GcpIntegrationsRunGetArgs>? Run { get; set; }

        /// <summary>
        /// Spanner integration. See Integration blocks below for details.
        /// </summary>
        [Input("spanner")]
        public Input<Inputs.GcpIntegrationsSpannerGetArgs>? Spanner { get; set; }

        /// <summary>
        /// SQL integration. See Integration blocks below for details.
        /// </summary>
        [Input("sql")]
        public Input<Inputs.GcpIntegrationsSqlGetArgs>? Sql { get; set; }

        /// <summary>
        /// Storage integration. See Integration blocks below for details.
        /// </summary>
        [Input("storage")]
        public Input<Inputs.GcpIntegrationsStorageGetArgs>? Storage { get; set; }

        /// <summary>
        /// Virtual machines integration. See Integration blocks below for details.
        /// </summary>
        [Input("virtualMachines")]
        public Input<Inputs.GcpIntegrationsVirtualMachinesGetArgs>? VirtualMachines { get; set; }

        /// <summary>
        /// VPC Access integration. See Integration blocks below for details.
        /// </summary>
        [Input("vpcAccess")]
        public Input<Inputs.GcpIntegrationsVpcAccessGetArgs>? VpcAccess { get; set; }

        public GcpIntegrationsState()
        {
        }
        public static new GcpIntegrationsState Empty => new GcpIntegrationsState();
    }
}
