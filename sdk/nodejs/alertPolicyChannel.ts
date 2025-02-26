// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * ## Example Usage
 *
 * The example below will apply multiple alert channels to an existing New Relic alert policy.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const examplePolicy = newrelic.getAlertPolicy({
 *     name: "my-alert-policy",
 * });
 * // Creates an email alert channel.
 * const emailChannel = new newrelic.AlertChannel("emailChannel", {
 *     type: "email",
 *     config: {
 *         recipients: "foo@example.com",
 *         includeJsonAttachment: "1",
 *     },
 * });
 * // Creates a Slack alert channel.
 * const slackChannel = new newrelic.AlertChannel("slackChannel", {
 *     type: "slack",
 *     config: {
 *         channel: "#example-channel",
 *         url: "http://example-org.slack.com",
 *     },
 * });
 * // Applies the created channels above to the alert policy
 * // referenced at the top of the config.
 * const foo = new newrelic.AlertPolicyChannel("foo", {
 *     policyId: examplePolicy.then(examplePolicy => examplePolicy.id),
 *     channelIds: [
 *         emailChannel.id,
 *         slackChannel.id,
 *     ],
 * });
 * ```
 *
 * ## Import
 *
 * Alert policy channels can be imported using the following notation`<policyID>:<channelID>:<channelID>`, e.g.
 *
 * ```sh
 *  $ pulumi import newrelic:index/alertPolicyChannel:AlertPolicyChannel foo 123456:3462754:2938324
 * ```
 *
 *  When importing `newrelic_alert_policy_channel` resource, the attribute `channel_ids`\* will be set in your Terraform state. You can import multiple channels as long as those channel IDs are included as part of the import ID hash.
 */
export class AlertPolicyChannel extends pulumi.CustomResource {
    /**
     * Get an existing AlertPolicyChannel resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AlertPolicyChannelState, opts?: pulumi.CustomResourceOptions): AlertPolicyChannel {
        return new AlertPolicyChannel(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:index/alertPolicyChannel:AlertPolicyChannel';

    /**
     * Returns true if the given object is an instance of AlertPolicyChannel.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AlertPolicyChannel {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AlertPolicyChannel.__pulumiType;
    }

    /**
     * Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     */
    public readonly accountId!: pulumi.Output<number>;
    /**
     * Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     */
    public readonly channelIds!: pulumi.Output<number[]>;
    /**
     * The ID of the policy.
     */
    public readonly policyId!: pulumi.Output<number>;

    /**
     * Create a AlertPolicyChannel resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AlertPolicyChannelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AlertPolicyChannelArgs | AlertPolicyChannelState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AlertPolicyChannelState | undefined;
            resourceInputs["accountId"] = state ? state.accountId : undefined;
            resourceInputs["channelIds"] = state ? state.channelIds : undefined;
            resourceInputs["policyId"] = state ? state.policyId : undefined;
        } else {
            const args = argsOrState as AlertPolicyChannelArgs | undefined;
            if ((!args || args.channelIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'channelIds'");
            }
            if ((!args || args.policyId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'policyId'");
            }
            resourceInputs["accountId"] = args ? args.accountId : undefined;
            resourceInputs["channelIds"] = args ? args.channelIds : undefined;
            resourceInputs["policyId"] = args ? args.policyId : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AlertPolicyChannel.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AlertPolicyChannel resources.
 */
export interface AlertPolicyChannelState {
    /**
     * Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     */
    channelIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The ID of the policy.
     */
    policyId?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AlertPolicyChannel resource.
 */
export interface AlertPolicyChannelArgs {
    /**
     * Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
     */
    accountId?: pulumi.Input<number>;
    /**
     * Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
     */
    channelIds: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * The ID of the policy.
     */
    policyId: pulumi.Input<number>;
}
