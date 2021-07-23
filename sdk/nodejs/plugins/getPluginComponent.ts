// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * New Relic Plugins reached end of life Wednesday June 16, 2021.
 *
 * **This data source has been removed.**
 *
 * For more information, [click here](https://discuss.newrelic.com/t/new-relic-plugin-eol-wednesday-june-16th-2021/127267)
 */
export function getPluginComponent(args: GetPluginComponentArgs, opts?: pulumi.InvokeOptions): Promise<GetPluginComponentResult> {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("newrelic:plugins/getPluginComponent:getPluginComponent", {
        "name": args.name,
        "pluginId": args.pluginId,
    }, opts);
}

/**
 * A collection of arguments for invoking getPluginComponent.
 */
export interface GetPluginComponentArgs {
    readonly name: string;
    readonly pluginId: number;
}

/**
 * A collection of values returned by getPluginComponent.
 */
export interface GetPluginComponentResult {
    readonly healthStatus: string;
    readonly id: string;
    readonly name: string;
    readonly pluginId: number;
}
