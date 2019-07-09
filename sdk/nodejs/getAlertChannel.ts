// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * Use this data source to get information about an specific alert channel in New Relic which already exists (e.g newrelic user).
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const fooAlertChannel = pulumi.output(newrelic.getAlertChannel({
 *     name: "foo@example.com",
 * }));
 * const fooAlertPolicy = new newrelic.AlertPolicy("foo", {});
 * const fooAlertPolicyChannel = new newrelic.AlertPolicyChannel("foo", {
 *     channelId: newrelic_alert_channel_foo.id,
 *     policyId: fooAlertPolicy.id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/d/alert_channel.html.markdown.
 */
export function getAlertChannel(args: GetAlertChannelArgs, opts?: pulumi.InvokeOptions): Promise<GetAlertChannelResult> {
    return pulumi.runtime.invoke("newrelic:index/getAlertChannel:getAlertChannel", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getAlertChannel.
 */
export interface GetAlertChannelArgs {
    /**
     * The name of the alert channel in New Relic.
     */
    readonly name: string;
}

/**
 * A collection of values returned by getAlertChannel.
 */
export interface GetAlertChannelResult {
    readonly name: string;
    /**
     * A list of policy IDs associated with the alert channel.
     */
    readonly policyIds: number[];
    /**
     * Alert channel type, either: `campfire`, `email`, `hipchat`, `opsgenie`, `pagerduty`, `slack`, `victorops`, or `webhook`..
     */
    readonly type: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
