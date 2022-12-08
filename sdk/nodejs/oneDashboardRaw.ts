// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "./types/input";
import * as outputs from "./types/output";
import * as utilities from "./utilities";

/**
 * > **NOTE:** The newrelic.OneDashboardJson resource is preferred for configuring dashboards in New Relic. This resource does not support the latest dashboard features and will be deprecated in the future.
 *
 * ## Example Usage
 * ### Create A New Relic One Dashboard With RawConfiguration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const exampledash = new newrelic.OneDashboardRaw("exampledash", {pages: [{
 *     name: "Page Name",
 *     widgets: [
 *         {
 *             title: "Custom widget",
 *             row: 1,
 *             column: 1,
 *             width: 1,
 *             height: 1,
 *             visualizationId: "viz.custom",
 *             configuration: `      {
 *         "legend": {
 *           "enabled": false
 *         },
 *         "nrqlQueries": [
 *           {
 *             "accountId": ` + accountID + `,
 *             "query": "SELECT average(loadAverageOneMinute), average(loadAverageFiveMinute), average(loadAverageFifteenMinute) from SystemSample SINCE 60 minutes ago    TIMESERIES"
 *           }
 *         ],
 *         "yAxisLeft": {
 *           "max": 100,
 *           "min": 50,
 *           "zero": false
 *         }
 *       }
 * `,
 *         },
 *         {
 *             title: "Server CPU",
 *             row: 1,
 *             column: 2,
 *             width: 1,
 *             height: 1,
 *             visualizationId: "viz.testing",
 *             configuration: `      {
 *         "nrqlQueries": [
 *           {
 *             "accountId": ` + accountID + `,
 *             "query": "SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400"
 *           }
 *         ]
 *       }
 * `,
 *         },
 *         {
 *             title: "Docker Server CPU",
 *             row: 1,
 *             column: 3,
 *             height: 1,
 *             width: 1,
 *             visualizationId: "viz.bar",
 *             configuration: JSON.stringify({
 *                 facet: {
 *                     showOtherSeries: false,
 *                 },
 *                 nrqlQueries: [{
 *                     accountId: local.accountID,
 *                     query: "SELECT average(cpuPercent) FROM SystemSample since 3 hours ago facet hostname limit 400",
 *                 }],
 *             }),
 *             linkedEntityGuids: ["MzI5ODAxNnxWSVp8REFTSEJPQVJEfDI2MTcxNDc"],
 *         },
 *     ],
 * }]});
 * ```
 */
export class OneDashboardRaw extends pulumi.CustomResource {
    /**
     * Get an existing OneDashboardRaw resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: OneDashboardRawState, opts?: pulumi.CustomResourceOptions): OneDashboardRaw {
        return new OneDashboardRaw(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/oneDashboardRaw:OneDashboardRaw';

    /**
     * Returns true if the given object is an instance of OneDashboardRaw.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is OneDashboardRaw {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === OneDashboardRaw.__pulumiType;
    }

    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Brief text describing the dashboard.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * The title of the dashboard.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    public readonly pages!: pulumi.Output<outputs.OneDashboardRawPage[]>;
    /**
     * The URL for viewing the dashboard.
     */
    public /*out*/ readonly permalink!: pulumi.Output<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
     */
    public readonly permissions!: pulumi.Output<string | undefined>;

    /**
     * Create a OneDashboardRaw resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: OneDashboardRawArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: OneDashboardRawArgs | OneDashboardRawState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as OneDashboardRawState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["pages"] = state ? state.pages : undefined;
            resourceInputs["permalink"] = state ? state.permalink : undefined;
            resourceInputs["permissions"] = state ? state.permissions : undefined;
        } else {
            const args = argsOrState as OneDashboardRawArgs | undefined;
            if ((!args || args.pages === undefined) && !opts.urn) {
                throw new Error("Missing required property 'pages'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["pages"] = args ? args.pages : undefined;
            resourceInputs["permissions"] = args ? args.permissions : undefined;
            resourceInputs["guid"] = undefined /*out*/;
            resourceInputs["permalink"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(OneDashboardRaw.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering OneDashboardRaw resources.
 */
export interface OneDashboardRawState {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Brief text describing the dashboard.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    pages?: pulumi.Input<pulumi.Input<inputs.OneDashboardRawPage>[]>;
    /**
     * The URL for viewing the dashboard.
     */
    permalink?: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
     */
    permissions?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a OneDashboardRaw resource.
 */
export interface OneDashboardRawArgs {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Brief text describing the dashboard.
     */
    description?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    name?: pulumi.Input<string>;
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     */
    pages: pulumi.Input<pulumi.Input<inputs.OneDashboardRawPage>[]>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `publicReadOnly`, or `publicReadWrite`. Defaults to `publicReadOnly`.
     */
    permissions?: pulumi.Input<string>;
}
