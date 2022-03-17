// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to link a GCP account to New Relic.
 *
 * ## Prerequisite
 *
 * To start receiving Google Cloud Platform (GCP) data with New Relic GCP integrations, connect your Google project to New Relic infrastructure monitoring. If you don't have one already, create a New Relic account. It's free, forever.
 *
 * Setup is required in GCP for this resource to work properly. The New Relic GCP integration can be done by creating a user account or a service account.
 *
 * A user with Project IAM Admin role is needed to add the service account ID as a member in your GCP project.
 *
 * In the GCP project IAM & admin, the service account must have the Project Viewer role and the Service Usage Consumer role or, alternatively, a custom role.
 *
 * Follow the [steps outlined here](https://docs.newrelic.com/docs/infrastructure/google-cloud-platform-integrations/get-started/connect-google-cloud-platform-services-new-relic) to set up the integration.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const foo = new newrelic.cloud.GcpLinkAccount("foo", {
 *     accountId: Number.parseFloat("account id of newrelic account"),
 *     projectId: "id of the Project",
 * });
 * ```
 *
 * ## Import
 *
 * Linked GCP accounts can be imported using `id`, you can find the `id` of an existing GCP linked accounts in GCP dashboard under Infrastructure in Newrelic Console. bash
 *
 * ```sh
 *  $ pulumi import newrelic:cloud/gcpLinkAccount:GcpLinkAccount newrelic_cloud_gcp_link_account.foo <id>
 * ```
 */
export class GcpLinkAccount extends pulumi.CustomResource {
    /**
     * Get an existing GcpLinkAccount resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: GcpLinkAccountState, opts?: pulumi.CustomResourceOptions): GcpLinkAccount {
        return new GcpLinkAccount(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/gcpLinkAccount:GcpLinkAccount';

    /**
     * Returns true if the given object is an instance of GcpLinkAccount.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is GcpLinkAccount {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === GcpLinkAccount.__pulumiType;
    }

    /**
     * - Account ID of the New Relic account.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * - The name of the GCP account in New Relic.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * - Project ID of the GCP account.
     */
    public readonly projectId!: pulumi.Output<string>;

    /**
     * Create a GcpLinkAccount resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: GcpLinkAccountArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: GcpLinkAccountArgs | GcpLinkAccountState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as GcpLinkAccountState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["projectId"] = state ? state.projectId : undefined;
        } else {
            const args = argsOrState as GcpLinkAccountArgs | undefined;
            if ((!args || args.accountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accountId'");
            }
            if ((!args || args.projectId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'projectId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["projectId"] = args ? args.projectId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(GcpLinkAccount.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering GcpLinkAccount resources.
 */
export interface GcpLinkAccountState {
    /**
     * - Account ID of the New Relic account.
     */
    accountId?: pulumi.Input<number>;
    /**
     * - The name of the GCP account in New Relic.
     */
    name?: pulumi.Input<string>;
    /**
     * - Project ID of the GCP account.
     */
    projectId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a GcpLinkAccount resource.
 */
export interface GcpLinkAccountArgs {
    /**
     * - Account ID of the New Relic account.
     */
    accountId: pulumi.Input<number>;
    /**
     * - The name of the GCP account in New Relic.
     */
    name?: pulumi.Input<string>;
    /**
     * - Project ID of the GCP account.
     */
    projectId: pulumi.Input<string>;
}
