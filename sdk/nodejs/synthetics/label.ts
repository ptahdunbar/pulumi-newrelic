// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create, update, and delete a Synthetics label in New Relic.
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_label.html.markdown.
 */
export class Label extends pulumi.CustomResource {
    /**
     * Get an existing Label resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: LabelState, opts?: pulumi.CustomResourceOptions): Label {
        return new Label(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/label:Label';

    /**
     * Returns true if the given object is an instance of Label.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Label {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Label.__pulumiType;
    }

    /**
     * The URL of the Synthetics label.
     */
    public /*out*/ readonly href!: pulumi.Output<string>;
    /**
     * The ID of the monitor that will be assigned the label.
     */
    public readonly monitorId!: pulumi.Output<string>;
    /**
     * A string representing the label key/category.
     */
    public readonly type!: pulumi.Output<string>;
    /**
     * A string representing the label value.
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a Label resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: LabelArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: LabelArgs | LabelState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as LabelState | undefined;
            inputs["href"] = state ? state.href : undefined;
            inputs["monitorId"] = state ? state.monitorId : undefined;
            inputs["type"] = state ? state.type : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as LabelArgs | undefined;
            if (!args || args.monitorId === undefined) {
                throw new Error("Missing required property 'monitorId'");
            }
            if (!args || args.type === undefined) {
                throw new Error("Missing required property 'type'");
            }
            if (!args || args.value === undefined) {
                throw new Error("Missing required property 'value'");
            }
            inputs["monitorId"] = args ? args.monitorId : undefined;
            inputs["type"] = args ? args.type : undefined;
            inputs["value"] = args ? args.value : undefined;
            inputs["href"] = undefined /*out*/;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Label.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Label resources.
 */
export interface LabelState {
    /**
     * The URL of the Synthetics label.
     */
    readonly href?: pulumi.Input<string>;
    /**
     * The ID of the monitor that will be assigned the label.
     */
    readonly monitorId?: pulumi.Input<string>;
    /**
     * A string representing the label key/category.
     */
    readonly type?: pulumi.Input<string>;
    /**
     * A string representing the label value.
     */
    readonly value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Label resource.
 */
export interface LabelArgs {
    /**
     * The ID of the monitor that will be assigned the label.
     */
    readonly monitorId: pulumi.Input<string>;
    /**
     * A string representing the label key/category.
     */
    readonly type: pulumi.Input<string>;
    /**
     * A string representing the label value.
     */
    readonly value: pulumi.Input<string>;
}
