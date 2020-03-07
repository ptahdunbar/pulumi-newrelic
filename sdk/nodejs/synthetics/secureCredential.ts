// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Use this resource to create and manage New Relic Synthetic secure credentials.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as newrelic from "@pulumi/newrelic";
 * 
 * const foo = new newrelic.synthetics.SecureCredential("foo", {
 *     description: "My description",
 *     key: "MY_KEY",
 *     value: "My value",
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-newrelic/blob/master/website/docs/r/synthetics_secure_credential.html.markdown.
 */
export class SecureCredential extends pulumi.CustomResource {
    /**
     * Get an existing SecureCredential resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: SecureCredentialState, opts?: pulumi.CustomResourceOptions): SecureCredential {
        return new SecureCredential(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'newrelic:synthetics/secureCredential:SecureCredential';

    /**
     * Returns true if the given object is an instance of SecureCredential.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is SecureCredential {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === SecureCredential.__pulumiType;
    }

    /**
     * The time the secure credential was created.
     */
    public readonly createdAt!: pulumi.Output<string>;
    /**
     * The secure credential's description.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    public readonly key!: pulumi.Output<string>;
    public readonly lastUpdated!: pulumi.Output<string>;
    /**
     * The secure credential's value. 
     */
    public readonly value!: pulumi.Output<string>;

    /**
     * Create a SecureCredential resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: SecureCredentialArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: SecureCredentialArgs | SecureCredentialState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as SecureCredentialState | undefined;
            inputs["createdAt"] = state ? state.createdAt : undefined;
            inputs["description"] = state ? state.description : undefined;
            inputs["key"] = state ? state.key : undefined;
            inputs["lastUpdated"] = state ? state.lastUpdated : undefined;
            inputs["value"] = state ? state.value : undefined;
        } else {
            const args = argsOrState as SecureCredentialArgs | undefined;
            if (!args || args.key === undefined) {
                throw new Error("Missing required property 'key'");
            }
            if (!args || args.value === undefined) {
                throw new Error("Missing required property 'value'");
            }
            inputs["createdAt"] = args ? args.createdAt : undefined;
            inputs["description"] = args ? args.description : undefined;
            inputs["key"] = args ? args.key : undefined;
            inputs["lastUpdated"] = args ? args.lastUpdated : undefined;
            inputs["value"] = args ? args.value : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(SecureCredential.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering SecureCredential resources.
 */
export interface SecureCredentialState {
    /**
     * The time the secure credential was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The secure credential's description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    readonly key?: pulumi.Input<string>;
    readonly lastUpdated?: pulumi.Input<string>;
    /**
     * The secure credential's value. 
     */
    readonly value?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a SecureCredential resource.
 */
export interface SecureCredentialArgs {
    /**
     * The time the secure credential was created.
     */
    readonly createdAt?: pulumi.Input<string>;
    /**
     * The secure credential's description.
     */
    readonly description?: pulumi.Input<string>;
    /**
     * The secure credential's key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     */
    readonly key: pulumi.Input<string>;
    readonly lastUpdated?: pulumi.Input<string>;
    /**
     * The secure credential's value. 
     */
    readonly value: pulumi.Input<string>;
}
