// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "./types";
import * as utilities from "./utilities";

/**
 * > **New Relic Service Level Management is in preview**
 * Please contact your account team or fill in this [form](https://forms.gle/v1y3PDJ2P6sSfviC7) if you'd like to enroll your account.
 *
 * Use this resource to create, update, and delete New Relic Service Level Indicators and Objectives.
 *
 * A New Relic User API key is required to provision this resource.  Set the `apiKey`
 * attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
 * variable with your User API key.
 *
 * Important:
 * - Only roles that provide [permissions](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/) to create events to metric rules can create SLI/SLOs.
 * - Only [Full users](https://docs.newrelic.com/docs/accounts/accounts-billing/new-relic-one-user-management/new-relic-one-user-model-understand-user-structure/#user-type) can view SLI/SLOs.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.ServiceLevel("foo", {
 *     description: "SLI that measures the availability of the service.",
 *     events: {
 *         accountId: 12345678,
 *         badEvents: {
 *             from: "TransactionError",
 *             where: "appName = 'Example application' AND error.expected is false",
 *         },
 *         validEvents: {
 *             from: "Transaction",
 *             where: "appName = 'Example application'",
 *         },
 *     },
 *     guid: "MXxBUE18QVBQTElDQVRJT058MQ",
 *     objectives: [{
 *         description: "A realistic objective.",
 *         name: "Realistic",
 *         target: 99,
 *         timeWindow: {
 *             rolling: {
 *                 count: 7,
 *                 unit: "DAY",
 *             },
 *         },
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * New Relic Service Levels can be imported using a concatenated string of the format
 *
 * `<account_id>:<sli_id>:<guid>`, where the `guid` is the entity the SLI relates to. Examplebash
 *
 * ```sh
 *  $ pulumi import newrelic:index/serviceLevel:ServiceLevel foo 12345678:4321:MXxBUE18QVBQTElDQVRJT058MQ
 * ```
 */
export class ServiceLevel extends pulumi.CustomResource {
    /**
     * Get an existing ServiceLevel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServiceLevelState, opts?: pulumi.CustomResourceOptions): ServiceLevel {
        return new ServiceLevel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/serviceLevel:ServiceLevel';

    /**
     * Returns true if the given object is an instance of ServiceLevel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ServiceLevel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ServiceLevel.__pulumiType;
    }

    /**
     * The description of the SLI.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     */
    public readonly events!: pulumi.Output<outputs.ServiceLevelEvents>;
    /**
     * The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to.
     */
    public readonly guid!: pulumi.Output<string>;
    /**
     * A short name for the SLI that will help anyone understand what it is about.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * An objective for the SLI. Multiple objective blocks can be defined for an SLI.
     * See Nested objective blocks below for details.
     */
    public readonly objectives!: pulumi.Output<outputs.ServiceLevelObjective[] | undefined>;
    /**
     * The unique entity identifier of the Service Level Indicator.
     */
    public /*out*/ readonly sliId!: pulumi.Output<string>;

    /**
     * Create a ServiceLevel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ServiceLevelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServiceLevelArgs | ServiceLevelState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServiceLevelState | undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["events"] = state ? state.events : undefined;
            inputs["guid"] = state ? state.guid : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["objectives"] = state ? state.objectives : undefined;
            inputs["sliId"] = state ? state.sliId : undefined;
        } else {
            const args = argsOrState as ServiceLevelArgs | undefined;
            if ((!args || args.events === undefined) && !opts.urn) {
                throw new Error("Missing required property 'events'");
            }
            if ((!args || args.guid === undefined) && !opts.urn) {
                throw new Error("Missing required property 'guid'");
            }
            inputs["description"] = args ? args.description : undefined;
            inputs["events"] = args ? args.events : undefined;
            inputs["guid"] = args ? args.guid : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["objectives"] = args ? args.objectives : undefined;
            inputs["sliId"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ServiceLevel.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ServiceLevel resources.
 */
export interface ServiceLevelState {
    /**
     * The description of the SLI.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     */
    readonly events?: pulumi.Input<inputs.ServiceLevelEvents>;
    /**
     * The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to.
     */
    readonly guid?: pulumi.Input<string>;
    /**
     * A short name for the SLI that will help anyone understand what it is about.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * An objective for the SLI. Multiple objective blocks can be defined for an SLI.
     * See Nested objective blocks below for details.
     */
    readonly objectives?: pulumi.Input<pulumi.Input<inputs.ServiceLevelObjective>[]>;
    /**
     * The unique entity identifier of the Service Level Indicator.
     */
    readonly sliId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a ServiceLevel resource.
 */
export interface ServiceLevelArgs {
    /**
     * The description of the SLI.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The events that define the NRDB data for the SLI/SLO calculations.
     * See Events below for details.
     */
    readonly events: pulumi.Input<inputs.ServiceLevelEvents>;
    /**
     * The GUID of the entity (e.g, APM Service, Browser application, Workload, etc.) that you want to relate this SLI to.
     */
    readonly guid: pulumi.Input<string>;
    /**
     * A short name for the SLI that will help anyone understand what it is about.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * An objective for the SLI. Multiple objective blocks can be defined for an SLI.
     * See Nested objective blocks below for details.
     */
    readonly objectives?: pulumi.Input<pulumi.Input<inputs.ServiceLevelObjective>[]>;
}
