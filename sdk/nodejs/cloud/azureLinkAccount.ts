// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic bash
 *
 * ```sh
 *  $ pulumi import newrelic:cloud/azureLinkAccount:AzureLinkAccount foo <id>
 * ```
 */
export class AzureLinkAccount extends pulumi.CustomResource {
    /**
     * Get an existing AzureLinkAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AzureLinkAccountState, opts?: pulumi.CustomResourceOptions): AzureLinkAccount {
        return new AzureLinkAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/azureLinkAccount:AzureLinkAccount';

    /**
     * Returns true if the given object is an instance of AzureLinkAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AzureLinkAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AzureLinkAccount.__pulumiType;
    }

    /**
     * - Account ID of the New Relic.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * - Application ID of the App.
     */
    public readonly applicationId!: pulumi.Output<string>;
    /**
     * - Secret Value of the client.
     */
    public readonly clientSecret!: pulumi.Output<string>;
    /**
     * - The name of the application in New Relic APM.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * - Subscription ID of the Azure cloud account.
     */
    public readonly subscriptionId!: pulumi.Output<string>;
    /**
     * - Tenant ID of the Azure cloud account.
     */
    public readonly tenantId!: pulumi.Output<string>;

    /**
     * Create a AzureLinkAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AzureLinkAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AzureLinkAccountArgs | AzureLinkAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AzureLinkAccountState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["applicationId"] = state ? state.applicationId : undefined;
            resourceInputs["clientSecret"] = state ? state.clientSecret : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["subscriptionId"] = state ? state.subscriptionId : undefined;
            resourceInputs["tenantId"] = state ? state.tenantId : undefined;
        } else {
            const args = argsOrState as AzureLinkAccountArgs | undefined;
            if ((!args || args.applicationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'applicationId'");
            }
            if ((!args || args.clientSecret === undefined) && !opts.urn) {
                throw new Error("Missing required property 'clientSecret'");
            }
            if ((!args || args.subscriptionId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subscriptionId'");
            }
            if ((!args || args.tenantId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'tenantId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["applicationId"] = args ? args.applicationId : undefined;
            resourceInputs["clientSecret"] = args ? args.clientSecret : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["subscriptionId"] = args ? args.subscriptionId : undefined;
            resourceInputs["tenantId"] = args ? args.tenantId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AzureLinkAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AzureLinkAccount resources.
 */
export interface AzureLinkAccountState {
    /**
     * - Account ID of the New Relic.
     */
    accountId?: pulumi.Input<number>;
    /**
     * - Application ID of the App.
     */
    applicationId?: pulumi.Input<string>;
    /**
     * - Secret Value of the client.
     */
    clientSecret?: pulumi.Input<string>;
    /**
     * - The name of the application in New Relic APM.
     */
    name?: pulumi.Input<string>;
    /**
     * - Subscription ID of the Azure cloud account.
     */
    subscriptionId?: pulumi.Input<string>;
    /**
     * - Tenant ID of the Azure cloud account.
     */
    tenantId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AzureLinkAccount resource.
 */
export interface AzureLinkAccountArgs {
    /**
     * - Account ID of the New Relic.
     */
    accountId?: pulumi.Input<number>;
    /**
     * - Application ID of the App.
     */
    applicationId: pulumi.Input<string>;
    /**
     * - Secret Value of the client.
     */
    clientSecret: pulumi.Input<string>;
    /**
     * - The name of the application in New Relic APM.
     */
    name?: pulumi.Input<string>;
    /**
     * - Subscription ID of the Azure cloud account.
     */
    subscriptionId: pulumi.Input<string>;
    /**
     * - Tenant ID of the Azure cloud account.
     */
    tenantId: pulumi.Input<string>;
}
