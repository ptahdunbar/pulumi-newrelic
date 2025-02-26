// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const cert_check_monitor = new newrelic.synthetics.CertCheckMonitor("cert-check-monitor", {
 *     certificateExpiration: 10,
 *     domain: "www.example.com",
 *     locationsPublics: ["AP_SOUTH_1"],
 *     period: "EVERY_6_HOURS",
 *     status: "ENABLED",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 * See additional examples.
 * ## Additional Examples
 *
 * ### Create a monitor with a private location
 *
 * The below example shows how you can define a private location and attach it to a monitor.
 *
 * > **NOTE:** It can take up to 10 minutes for a private location to become available.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const location = new newrelic.synthetics.PrivateLocation("location", {
 *     description: "Test Description",
 *     verifiedScriptExecution: false,
 * });
 * const monitor = new newrelic.synthetics.CertCheckMonitor("monitor", {
 *     domain: "https://www.one.example.com",
 *     locationsPrivates: [location.id],
 *     period: "EVERY_6_HOURS",
 *     status: "ENABLED",
 *     tags: [{
 *         key: "some_key",
 *         values: ["some_value"],
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Synthetics certificate check monitor scripts can be imported using the `guid`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor <guid>
 * ```
 */
export class CertCheckMonitor extends pulumi.CustomResource {
    /**
     * Get an existing CertCheckMonitor resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: CertCheckMonitorState, opts?: pulumi.CustomResourceOptions): CertCheckMonitor {
        return new CertCheckMonitor(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/certCheckMonitor:CertCheckMonitor';

    /**
     * Returns true if the given object is an instance of CertCheckMonitor.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is CertCheckMonitor {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === CertCheckMonitor.__pulumiType;
    }

    /**
     * The account in which the Synthetics monitor will be created.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     */
    public readonly certificateExpiration!: pulumi.Output<number>;
    /**
     * The domain of the host that will have its certificate checked.
     */
    public readonly domain!: pulumi.Output<string>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    public readonly locationsPrivates!: pulumi.Output<string[] | undefined>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    public readonly locationsPublics!: pulumi.Output<string[] | undefined>;
    /**
     * The name for the monitor.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    public readonly period!: pulumi.Output<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    public readonly status!: pulumi.Output<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     */
    public readonly tags!: pulumi.Output<outputs.synthetics.CertCheckMonitorTag[] | undefined>;

    /**
     * Create a CertCheckMonitor resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: CertCheckMonitorArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: CertCheckMonitorArgs | CertCheckMonitorState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as CertCheckMonitorState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["certificateExpiration"] = state ? state.certificateExpiration : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["locationsPrivates"] = state ? state.locationsPrivates : undefined;
            resourceInputs["locationsPublics"] = state ? state.locationsPublics : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["period"] = state ? state.period : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
        } else {
            const args = argsOrState as CertCheckMonitorArgs | undefined;
            if ((!args || args.certificateExpiration === undefined) && !opts.urn) {
                throw new Error("Missing required property 'certificateExpiration'");
            }
            if ((!args || args.domain === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domain'");
            }
            if ((!args || args.period === undefined) && !opts.urn) {
                throw new Error("Missing required property 'period'");
            }
            if ((!args || args.status === undefined) && !opts.urn) {
                throw new Error("Missing required property 'status'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["certificateExpiration"] = args ? args.certificateExpiration : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["locationsPrivates"] = args ? args.locationsPrivates : undefined;
            resourceInputs["locationsPublics"] = args ? args.locationsPublics : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["period"] = args ? args.period : undefined;
            resourceInputs["status"] = args ? args.status : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(CertCheckMonitor.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering CertCheckMonitor resources.
 */
export interface CertCheckMonitorState {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     */
    certificateExpiration?: pulumi.Input<number>;
    /**
     * The domain of the host that will have its certificate checked.
     */
    domain?: pulumi.Input<string>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPrivates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    period?: pulumi.Input<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    status?: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.CertCheckMonitorTag>[]>;
}

/**
 * The set of arguments for constructing a CertCheckMonitor resource.
 */
export interface CertCheckMonitorArgs {
    /**
     * The account in which the Synthetics monitor will be created.
     */
    accountId?: pulumi.Input<number>;
    /**
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     */
    certificateExpiration: pulumi.Input<number>;
    /**
     * The domain of the host that will have its certificate checked.
     */
    domain: pulumi.Input<string>;
    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
     */
    locationsPrivates?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
     */
    locationsPublics?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The name for the monitor.
     */
    name?: pulumi.Input<string>;
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     */
    period: pulumi.Input<string>;
    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     */
    status: pulumi.Input<string>;
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     */
    tags?: pulumi.Input<pulumi.Input<inputs.synthetics.CertCheckMonitorTag>[]>;
}
