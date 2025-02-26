// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to create, update, and delete a standalone New Relic browser application.
 *
 * ## Example Usage
 *
 * Basic usage to create a standalone browser application.
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.BrowserApplication("foo", {
 *     cookiesEnabled: true,
 *     distributedTracingEnabled: true,
 *     loaderType: "SPA",
 * });
 * ```
 *
 * ## Import
 *
 * Browser applications can be imported using the GUID of the browser application. bash
 *
 * ```sh
 *  $ pulumi import newrelic:index/browserApplication:BrowserApplication foo <GUID>
 * ```
 */
export class BrowserApplication extends pulumi.CustomResource {
    /**
     * Get an existing BrowserApplication resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BrowserApplicationState, opts?: pulumi.CustomResourceOptions): BrowserApplication {
        return new BrowserApplication(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/browserApplication:BrowserApplication';

    /**
     * Returns true if the given object is an instance of BrowserApplication.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is BrowserApplication {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === BrowserApplication.__pulumiType;
    }

    /**
     * The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Configure cookies. The default is enabled: true.
     */
    public readonly cookiesEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * Configure distributed tracing in browser apps. The default is enabled: true.
     */
    public readonly distributedTracingEnabled!: pulumi.Output<boolean | undefined>;
    /**
     * The GUID of the browser application.
     */
    public /*out*/ readonly guid!: pulumi.Output<string>;
    /**
     * Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
     */
    public readonly loaderType!: pulumi.Output<string | undefined>;
    /**
     * The name of the browser application.
     */
    public readonly name!: pulumi.Output<string>;

    /**
     * Create a BrowserApplication resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: BrowserApplicationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BrowserApplicationArgs | BrowserApplicationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BrowserApplicationState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["cookiesEnabled"] = state ? state.cookiesEnabled : undefined;
            resourceInputs["distributedTracingEnabled"] = state ? state.distributedTracingEnabled : undefined;
            resourceInputs["guid"] = state ? state.guid : undefined;
            resourceInputs["loaderType"] = state ? state.loaderType : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
        } else {
            const args = argsOrState as BrowserApplicationArgs | undefined;
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["cookiesEnabled"] = args ? args.cookiesEnabled : undefined;
            resourceInputs["distributedTracingEnabled"] = args ? args.distributedTracingEnabled : undefined;
            resourceInputs["loaderType"] = args ? args.loaderType : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["guid"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(BrowserApplication.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering BrowserApplication resources.
 */
export interface BrowserApplicationState {
    /**
     * The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Configure cookies. The default is enabled: true.
     */
    cookiesEnabled?: pulumi.Input<boolean>;
    /**
     * Configure distributed tracing in browser apps. The default is enabled: true.
     */
    distributedTracingEnabled?: pulumi.Input<boolean>;
    /**
     * The GUID of the browser application.
     */
    guid?: pulumi.Input<string>;
    /**
     * Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
     */
    loaderType?: pulumi.Input<string>;
    /**
     * The name of the browser application.
     */
    name?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a BrowserApplication resource.
 */
export interface BrowserApplicationArgs {
    /**
     * The New Relic account ID of the account you wish to create the browser application. Defaults to the account ID set in your environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Configure cookies. The default is enabled: true.
     */
    cookiesEnabled?: pulumi.Input<boolean>;
    /**
     * Configure distributed tracing in browser apps. The default is enabled: true.
     */
    distributedTracingEnabled?: pulumi.Input<boolean>;
    /**
     * Determines which browser loader is configured. Valid values are `SPA`, `PRO`, and `LITE`. The default is `SPA`. See the [browser agent loader documentation](https://docs.newrelic.com/docs/browser/browser-monitoring/installation/install-browser-monitoring-agent/#agent-types) for a for information on the valid loader types.
     */
    loaderType?: pulumi.Input<string>;
    /**
     * The name of the browser application.
     */
    name?: pulumi.Input<string>;
}
