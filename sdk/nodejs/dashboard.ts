// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * Use this resource to create and manage New Relic dashboards.
 *
 * ## Example Usage
 * ### Create A New Relic Dashboard
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const myApplication = newrelic.getEntity({
 *     name: "My Application",
 *     type: "APPLICATION",
 *     domain: "APM",
 * });
 * const exampledash = new newrelic.Dashboard("exampledash", {
 *     title: "New Relic Terraform Example",
 *     filter: {
 *         eventTypes: ["Transaction"],
 *         attributes: [
 *             "appName",
 *             "name",
 *         ],
 *     },
 *     widgets: [
 *         {
 *             title: "Requests per minute",
 *             visualization: "billboard",
 *             nrql: "SELECT rate(count(*), 1 minute) FROM Transaction",
 *             row: 1,
 *             column: 1,
 *         },
 *         {
 *             title: "Error rate",
 *             visualization: "gauge",
 *             nrql: "SELECT percentage(count(*), WHERE error IS True) FROM Transaction",
 *             thresholdRed: 2.5,
 *             row: 1,
 *             column: 2,
 *         },
 *         {
 *             title: "Average transaction duration, by application",
 *             visualization: "facet_bar_chart",
 *             nrql: "SELECT average(duration) FROM Transaction FACET appName",
 *             row: 1,
 *             column: 3,
 *         },
 *         {
 *             title: "Apdex, top 5 by host",
 *             duration: 1800000,
 *             visualization: "metric_line_chart",
 *             entityIds: [myApplication.then(myApplication => myApplication.applicationId)],
 *             metrics: [{
 *                 name: "Apdex",
 *                 values: ["score"],
 *             }],
 *             facet: "host",
 *             limit: 5,
 *             orderBy: "score",
 *             row: 2,
 *             column: 1,
 *         },
 *         {
 *             title: "Requests per minute, by transaction",
 *             visualization: "facet_table",
 *             nrql: "SELECT rate(count(*), 1 minute) FROM Transaction FACET name",
 *             row: 2,
 *             column: 2,
 *         },
 *         {
 *             title: "Dashboard Note",
 *             visualization: "markdown",
 *             source: `### Helpful Links
 *
 * * [New Relic One](https://one.newrelic.com)
 * * [Developer Portal](https://developer.newrelic.com)`,
 *             row: 2,
 *             column: 3,
 *         },
 *     ],
 * });
 * ```
 * See additional examples.
 * ## Additional Examples
 *
 * ### Create cross-account widgets in your dashboard.
 *
 * The example below shows how you can display data for an application from a primary account and an application from a subaccount. In order to create cross-account widgets, you must use an API key from a user with admin permissions in the primary account. Please see the `widget` attribute documentation for more details.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const primaryAccountApplication = newrelic.getEntity({
 *     name: "Main Account Application Name",
 *     type: "APPLICATION",
 *     domain: "APM",
 * });
 * const subaccountApplication = newrelic.getEntity({
 *     name: "Subaccount Application Name",
 *     type: "APPLICATION",
 *     domain: "APM",
 * });
 * const crossAccountWidgetExample = new newrelic.Dashboard("crossAccountWidgetExample", {
 *     title: "tf-test-cross-account-widget-dashboard",
 *     filter: {
 *         eventTypes: ["Transaction"],
 *         attributes: [
 *             "appName",
 *             "envName",
 *         ],
 *     },
 *     gridColumnCount: 12,
 *     widgets: [
 *         {
 *             title: "Apdex (primary account)",
 *             row: 1,
 *             column: 1,
 *             width: 6,
 *             height: 3,
 *             visualization: "metric_line_chart",
 *             duration: 1800000,
 *             metrics: [{
 *                 name: "Apdex",
 *                 values: ["score"],
 *             }],
 *             entityIds: [primaryAccountApplication.then(primaryAccountApplication => primaryAccountApplication.applicationId)],
 *         },
 *         {
 *             accountId: _var.subaccount_id,
 *             title: "Apdex (subaccount)",
 *             row: 1,
 *             column: 7,
 *             width: 6,
 *             height: 3,
 *             visualization: "metric_line_chart",
 *             duration: 1800000,
 *             metrics: [{
 *                 name: "Apdex",
 *                 values: ["score"],
 *             }],
 *             entityIds: [subaccountApplication.then(subaccountApplication => subaccountApplication.applicationId)],
 *         },
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * New Relic dashboards can be imported using their ID, e.g.
 *
 * ```sh
 *  $ pulumi import newrelic:index/dashboard:Dashboard my_dashboard 8675309
 * ```
 *
 *  ~> **NOTE** Due to API restrictions, importing a dashboard resource will set the `grid_column_count` attribute to `3`. If your dashboard is a New Relic One dashboard _and_ uses a 12 column grid, you will need to make sure `grid_column_count` is set to `12` in your configuration, then run `terraform apply` after importing to sync remote state with Terraform state. Also note, cross-account widgets cannot be imported due to API restrictions.
 */
export class Dashboard extends pulumi.CustomResource {
    /**
     * Get an existing Dashboard resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DashboardState, opts?: pulumi.CustomResourceOptions): Dashboard {
        return new Dashboard(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/dashboard:Dashboard';

    /**
     * Returns true if the given object is an instance of Dashboard.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Dashboard {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Dashboard.__pulumiType;
    }

    /**
     * The URL for viewing the dashboard.
     */
    public /*out*/ readonly dashboardUrl!: pulumi.Output<string>;
    /**
     * Determines who can edit the dashboard in an account. Valid values are `all`,  `editableByAll`, `editableByOwner`, or `readOnly`.  Defaults to `editableByAll`.
     */
    public readonly editable!: pulumi.Output<string | undefined>;
    /**
     * A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
     */
    public readonly filter!: pulumi.Output<outputs.DashboardFilter | undefined>;
    /**
     * The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    public readonly gridColumnCount!: pulumi.Output<number | undefined>;
    /**
     * The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
     */
    public readonly icon!: pulumi.Output<string | undefined>;
    /**
     * The title of the dashboard.
     */
    public readonly title!: pulumi.Output<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
     */
    public readonly visibility!: pulumi.Output<string | undefined>;
    /**
     * A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
     */
    public readonly widgets!: pulumi.Output<outputs.DashboardWidget[] | undefined>;

    /**
     * Create a Dashboard resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DashboardArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DashboardArgs | DashboardState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as DashboardState | undefined;
            inputs["dashboardUrl"] = state ? state.dashboardUrl : undefined;
            inputs["editable"] = state ? state.editable : undefined;
            inputs["filter"] = state ? state.filter : undefined;
            inputs["gridColumnCount"] = state ? state.gridColumnCount : undefined;
            inputs["icon"] = state ? state.icon : undefined;
            inputs["title"] = state ? state.title : undefined;
            inputs["visibility"] = state ? state.visibility : undefined;
            inputs["widgets"] = state ? state.widgets : undefined;
        } else {
            const args = argsOrState as DashboardArgs | undefined;
            if ((!args || args.title === undefined) && !(opts && opts.urn)) {
                throw new Error("Missing required property 'title'");
            }
            inputs["editable"] = args ? args.editable : undefined;
            inputs["filter"] = args ? args.filter : undefined;
            inputs["gridColumnCount"] = args ? args.gridColumnCount : undefined;
            inputs["icon"] = args ? args.icon : undefined;
            inputs["title"] = args ? args.title : undefined;
            inputs["visibility"] = args ? args.visibility : undefined;
            inputs["widgets"] = args ? args.widgets : undefined;
            inputs["dashboardUrl"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Dashboard.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Dashboard resources.
 */
export interface DashboardState {
    /**
     * The URL for viewing the dashboard.
     */
    readonly dashboardUrl?: pulumi.Input<string>;
    /**
     * Determines who can edit the dashboard in an account. Valid values are `all`,  `editableByAll`, `editableByOwner`, or `readOnly`.  Defaults to `editableByAll`.
     */
    readonly editable?: pulumi.Input<string>;
    /**
     * A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
     */
    readonly filter?: pulumi.Input<inputs.DashboardFilter>;
    /**
     * The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    readonly gridColumnCount?: pulumi.Input<number>;
    /**
     * The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
     */
    readonly icon?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    readonly title?: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
     */
    readonly visibility?: pulumi.Input<string>;
    /**
     * A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
     */
    readonly widgets?: pulumi.Input<pulumi.Input<inputs.DashboardWidget>[]>;
}

/**
 * The set of arguments for constructing a Dashboard resource.
 */
export interface DashboardArgs {
    /**
     * Determines who can edit the dashboard in an account. Valid values are `all`,  `editableByAll`, `editableByOwner`, or `readOnly`.  Defaults to `editableByAll`.
     */
    readonly editable?: pulumi.Input<string>;
    /**
     * A nested block that describes a dashboard filter.  Exactly one nested `filter` block is allowed. See Nested filter block below for details.
     */
    readonly filter?: pulumi.Input<inputs.DashboardFilter>;
    /**
     * The number of columns to use when organizing and displaying widgets. New Relic One supports a 3 column grid and a 12 column grid. New Relic Insights supports a 3 column grid.
     */
    readonly gridColumnCount?: pulumi.Input<number>;
    /**
     * The icon for the dashboard.  Valid values are `adjust`, `archive`, `bar-chart`, `bell`, `bolt`, `bug`, `bullhorn`, `bullseye`, `clock-o`, `cloud`, `cog`, `comments-o`, `crosshairs`, `dashboard`, `envelope`, `fire`, `flag`, `flask`, `globe`, `heart`, `leaf`, `legal`, `life-ring`, `line-chart`, `magic`, `mobile`, `money`, `none`, `paper-plane`, `pie-chart`, `puzzle-piece`, `road`, `rocket`, `shopping-cart`, `sitemap`, `sliders`, `tablet`, `thumbs-down`, `thumbs-up`, `trophy`, `usd`, `user`, and `users`.  Defaults to `bar-chart`.
     */
    readonly icon?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    readonly title: pulumi.Input<string>;
    /**
     * Determines who can see the dashboard in an account. Valid values are `all` or `owner`.  Defaults to `all`.
     */
    readonly visibility?: pulumi.Input<string>;
    /**
     * A nested block that describes a visualization.  Up to 300 `widget` blocks are allowed in a dashboard definition. See Nested widget blocks below for details.
     */
    readonly widgets?: pulumi.Input<pulumi.Input<inputs.DashboardWidget>[]>;
}
