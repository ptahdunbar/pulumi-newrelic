// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this resource to programmatically create and manage the following types of keys:
 * - [User API keys](https://docs.newrelic.com/docs/apis/get-started/intro-apis/types-new-relic-api-keys#user-api-key)
 * - License (or ingest) keys, including:
 *     - General [license key](https://docs.newrelic.com/docs/accounts/install-new-relic/account-setup/license-key) used for APM
 *     - [Browser license key](https://docs.newrelic.com/docs/browser/new-relic-browser/configuration/copy-browser-monitoring-license-key-app-id)
 *
 * Please visit the New Relic article ['Use NerdGraph to manage license keys and User API keys'](https://docs.newrelic.com/docs/apis/nerdgraph/examples/use-nerdgraph-manage-license-keys-user-keys)
 * for more information.
 *
 * > **IMPORTANT!**
 * Please be very careful when updating existing `newrelic.ApiAccessKey` resources as only `newrelic_api_access_key.name`
 * and `newrelic_api_access_key.notes` are updatable. All other resource attributes will force a resource recreation which will
 * invalidate the previous API key(s).
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foobar = new newrelic.ApiAccessKey("foobar", {
 *     accountId: 1234567,
 *     ingestType: "LICENSE",
 *     keyType: "INGEST",
 *     notes: "To be used with service X",
 * });
 * ```
 *
 * ## Import
 *
 * Existing API access keys can be imported using a composite ID of `<api_access_key_id>:<key_type>`. `<key_type>` will be either `INGEST` or `USER`. For example
 *
 * ```sh
 *  $ pulumi import newrelic:index/apiAccessKey:ApiAccessKey foobar "1234567:INGEST"
 * ```
 */
export class ApiAccessKey extends pulumi.CustomResource {
    /**
     * Get an existing ApiAccessKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ApiAccessKeyState, opts?: pulumi.CustomResourceOptions): ApiAccessKey {
        return new ApiAccessKey(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/apiAccessKey:ApiAccessKey';

    /**
     * Returns true if the given object is an instance of ApiAccessKey.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is ApiAccessKey {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === ApiAccessKey.__pulumiType;
    }

    /**
     * The New Relic account ID of the account you wish to create the API access key.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     */
    public readonly ingestType!: pulumi.Output<string>;
    /**
     * The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
     */
    public /*out*/ readonly key!: pulumi.Output<string>;
    /**
     * What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     */
    public readonly keyType!: pulumi.Output<string>;
    /**
     * The name of the key.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Any notes about this ingest key.
     */
    public readonly notes!: pulumi.Output<string>;
    /**
     * Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     */
    public readonly userId!: pulumi.Output<number>;

    /**
     * Create a ApiAccessKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ApiAccessKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ApiAccessKeyArgs | ApiAccessKeyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ApiAccessKeyState | undefined;
            inputs["accountId"] = state ? state.accountId : undefined;
            inputs["ingestType"] = state ? state.ingestType : undefined;
            inputs["key"] = state ? state.key : undefined;
            inputs["keyType"] = state ? state.keyType : undefined;
            inputs["name"] = state ? state.name : undefined;
            inputs["notes"] = state ? state.notes : undefined;
            inputs["userId"] = state ? state.userId : undefined;
        } else {
            const args = argsOrState as ApiAccessKeyArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.keyType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'keyType'");
            }
            inputs["accountId"] = args ? args.accountId : undefined;
            inputs["ingestType"] = args ? args.ingestType : undefined;
            inputs["keyType"] = args ? args.keyType : undefined;
            inputs["name"] = args ? args.name : undefined;
            inputs["notes"] = args ? args.notes : undefined;
            inputs["userId"] = args ? args.userId : undefined;
            inputs["key"] = undefined /*out*/;
        }
        if (!opts.version) {
            opts = pulumi.mergeOptions(opts, { version: utilities.getVersion()});
        }
        super(ApiAccessKey.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering ApiAccessKey resources.
 */
export interface ApiAccessKeyState {
    /**
     * The New Relic account ID of the account you wish to create the API access key.
     */
    readonly accountId?: pulumi.Input<number>;
    /**
     * Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     */
    readonly ingestType?: pulumi.Input<string>;
    /**
     * The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
     */
    readonly key?: pulumi.Input<string>;
    /**
     * What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     */
    readonly keyType?: pulumi.Input<string>;
    /**
     * The name of the key.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Any notes about this ingest key.
     */
    readonly notes?: pulumi.Input<string>;
    /**
     * Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     */
    readonly userId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a ApiAccessKey resource.
 */
export interface ApiAccessKeyArgs {
    /**
     * The New Relic account ID of the account you wish to create the API access key.
     */
    readonly accountId: pulumi.Input<number>;
    /**
     * Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
     */
    readonly ingestType?: pulumi.Input<string>;
    /**
     * What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
     */
    readonly keyType: pulumi.Input<string>;
    /**
     * The name of the key.
     */
    readonly name?: pulumi.Input<string>;
    /**
     * Any notes about this ingest key.
     */
    readonly notes?: pulumi.Input<string>;
    /**
     * Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
     */
    readonly userId?: pulumi.Input<number>;
}
