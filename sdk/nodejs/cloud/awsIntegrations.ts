// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Linked AWS account integrations can be imported using the `id`, e.g. bash
 *
 * ```sh
 *  $ pulumi import newrelic:cloud/awsIntegrations:AwsIntegrations foo <id>
 * ```
 */
export class AwsIntegrations extends pulumi.CustomResource {
    /**
     * Get an existing AwsIntegrations resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AwsIntegrationsState, opts?: pulumi.CustomResourceOptions): AwsIntegrations {
        return new AwsIntegrations(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:cloud/awsIntegrations:AwsIntegrations';

    /**
     * Returns true if the given object is an instance of AwsIntegrations.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AwsIntegrations {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AwsIntegrations.__pulumiType;
    }

    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Billing integration. See Integration blocks below for details.
     */
    public readonly billing!: pulumi.Output<outputs.cloud.AwsIntegrationsBilling | undefined>;
    /**
     * Cloudtrail integration. See Integration blocks below for details.
     */
    public readonly cloudtrail!: pulumi.Output<outputs.cloud.AwsIntegrationsCloudtrail | undefined>;
    /**
     * Billing integration
     */
    public readonly docDb!: pulumi.Output<outputs.cloud.AwsIntegrationsDocDb | undefined>;
    /**
     * Health integration. See Integration blocks below for details.
     */
    public readonly health!: pulumi.Output<outputs.cloud.AwsIntegrationsHealth | undefined>;
    /**
     * The ID of the linked AWS account in New Relic.
     */
    public readonly linkedAccountId!: pulumi.Output<number>;
    /**
     * S3 integration
     */
    public readonly s3!: pulumi.Output<outputs.cloud.AwsIntegrationsS3 | undefined>;
    /**
     * Trusted Advisor integration. See Integration blocks below for details.
     */
    public readonly trustedAdvisor!: pulumi.Output<outputs.cloud.AwsIntegrationsTrustedAdvisor | undefined>;
    /**
     * VPC integration. See Integration blocks below for details.
     */
    public readonly vpc!: pulumi.Output<outputs.cloud.AwsIntegrationsVpc | undefined>;
    /**
     * X-Ray integration. See Integration blocks below for details.
     */
    public readonly xRay!: pulumi.Output<outputs.cloud.AwsIntegrationsXRay | undefined>;

    /**
     * Create a AwsIntegrations resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AwsIntegrationsArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AwsIntegrationsArgs | AwsIntegrationsState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AwsIntegrationsState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["billing"] = state ? state.billing : undefined;
            resourceInputs["cloudtrail"] = state ? state.cloudtrail : undefined;
            resourceInputs["docDb"] = state ? state.docDb : undefined;
            resourceInputs["health"] = state ? state.health : undefined;
            resourceInputs["linkedAccountId"] = state ? state.linkedAccountId : undefined;
            resourceInputs["s3"] = state ? state.s3 : undefined;
            resourceInputs["trustedAdvisor"] = state ? state.trustedAdvisor : undefined;
            resourceInputs["vpc"] = state ? state.vpc : undefined;
            resourceInputs["xRay"] = state ? state.xRay : undefined;
        } else {
            const args = argsOrState as AwsIntegrationsArgs | undefined;
            if ((!args || args.linkedAccountId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'linkedAccountId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["billing"] = args ? args.billing : undefined;
            resourceInputs["cloudtrail"] = args ? args.cloudtrail : undefined;
            resourceInputs["docDb"] = args ? args.docDb : undefined;
            resourceInputs["health"] = args ? args.health : undefined;
            resourceInputs["linkedAccountId"] = args ? args.linkedAccountId : undefined;
            resourceInputs["s3"] = args ? args.s3 : undefined;
            resourceInputs["trustedAdvisor"] = args ? args.trustedAdvisor : undefined;
            resourceInputs["vpc"] = args ? args.vpc : undefined;
            resourceInputs["xRay"] = args ? args.xRay : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AwsIntegrations.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AwsIntegrations resources.
 */
export interface AwsIntegrationsState {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Billing integration. See Integration blocks below for details.
     */
    billing?: pulumi.Input<inputs.cloud.AwsIntegrationsBilling>;
    /**
     * Cloudtrail integration. See Integration blocks below for details.
     */
    cloudtrail?: pulumi.Input<inputs.cloud.AwsIntegrationsCloudtrail>;
    /**
     * Billing integration
     */
    docDb?: pulumi.Input<inputs.cloud.AwsIntegrationsDocDb>;
    /**
     * Health integration. See Integration blocks below for details.
     */
    health?: pulumi.Input<inputs.cloud.AwsIntegrationsHealth>;
    /**
     * The ID of the linked AWS account in New Relic.
     */
    linkedAccountId?: pulumi.Input<number>;
    /**
     * S3 integration
     */
    s3?: pulumi.Input<inputs.cloud.AwsIntegrationsS3>;
    /**
     * Trusted Advisor integration. See Integration blocks below for details.
     */
    trustedAdvisor?: pulumi.Input<inputs.cloud.AwsIntegrationsTrustedAdvisor>;
    /**
     * VPC integration. See Integration blocks below for details.
     */
    vpc?: pulumi.Input<inputs.cloud.AwsIntegrationsVpc>;
    /**
     * X-Ray integration. See Integration blocks below for details.
     */
    xRay?: pulumi.Input<inputs.cloud.AwsIntegrationsXRay>;
}

/**
 * The set of arguments for constructing a AwsIntegrations resource.
 */
export interface AwsIntegrationsArgs {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Billing integration. See Integration blocks below for details.
     */
    billing?: pulumi.Input<inputs.cloud.AwsIntegrationsBilling>;
    /**
     * Cloudtrail integration. See Integration blocks below for details.
     */
    cloudtrail?: pulumi.Input<inputs.cloud.AwsIntegrationsCloudtrail>;
    /**
     * Billing integration
     */
    docDb?: pulumi.Input<inputs.cloud.AwsIntegrationsDocDb>;
    /**
     * Health integration. See Integration blocks below for details.
     */
    health?: pulumi.Input<inputs.cloud.AwsIntegrationsHealth>;
    /**
     * The ID of the linked AWS account in New Relic.
     */
    linkedAccountId: pulumi.Input<number>;
    /**
     * S3 integration
     */
    s3?: pulumi.Input<inputs.cloud.AwsIntegrationsS3>;
    /**
     * Trusted Advisor integration. See Integration blocks below for details.
     */
    trustedAdvisor?: pulumi.Input<inputs.cloud.AwsIntegrationsTrustedAdvisor>;
    /**
     * VPC integration. See Integration blocks below for details.
     */
    vpc?: pulumi.Input<inputs.cloud.AwsIntegrationsVpc>;
    /**
     * X-Ray integration. See Integration blocks below for details.
     */
    xRay?: pulumi.Input<inputs.cloud.AwsIntegrationsXRay>;
}
