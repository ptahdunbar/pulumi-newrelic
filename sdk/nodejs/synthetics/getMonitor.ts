// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this data source to get information about a specific synthetics monitor in New Relic that already exists. This can be used to set up a Synthetics alert condition.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 *
 * const bar = newrelic.synthetics.getMonitor({
 *     name: "bar",
 * });
 * const baz = new newrelic.synthetics.AlertCondition("baz", {
 *     policyId: newrelic_alert_policy.foo.id,
 *     monitorId: bar.then(bar => bar.id),
 *     runbookUrl: "https://www.example.com",
 * });
 * ```
 */
export function getMonitor(args: GetMonitorArgs, opts?: pulumi.InvokeOptions): Promise<GetMonitorResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("newrelic:synthetics/getMonitor:getMonitor", {
        "name": args.name,
    }, opts);
}

/**
 * A collection of arguments for invoking getMonitor.
 */
export interface GetMonitorArgs {
    /**
     * The name of the synthetics monitor in New Relic.
     */
    name: string;
}

/**
 * A collection of values returned by getMonitor.
 */
export interface GetMonitorResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * The ID of the synthetics monitor.
     */
    readonly monitorId: string;
    readonly name: string;
}

export function getMonitorOutput(args: GetMonitorOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetMonitorResult> {
    return pulumi.output(args).apply(a => getMonitor(a, opts))
}

/**
 * A collection of arguments for invoking getMonitor.
 */
export interface GetMonitorOutputArgs {
    /**
     * The name of the synthetics monitor in New Relic.
     */
    name: pulumi.Input<string>;
}
