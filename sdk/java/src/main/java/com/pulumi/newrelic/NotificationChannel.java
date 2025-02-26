// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NotificationChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NotificationChannelState;
import com.pulumi.newrelic.outputs.NotificationChannelProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="newrelic:index/notificationChannel:NotificationChannel")
public class NotificationChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Indicates whether the channel is active.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Indicates whether the channel is active.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The id of the destination.
     * 
     */
    @Export(name="destinationId", type=String.class, parameters={})
    private Output<String> destinationId;

    /**
     * @return The id of the destination.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
    }
    /**
     * The name of the channel.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output<String> product;

    /**
     * @return The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    public Output<String> product() {
        return this.product;
    }
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    @Export(name="properties", type=List.class, parameters={NotificationChannelProperty.class})
    private Output<List<NotificationChannelProperty>> properties;

    /**
     * @return A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    public Output<List<NotificationChannelProperty>> properties() {
        return this.properties;
    }
    /**
     * The status of the channel.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the channel.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(String name, NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, args == null ? NotificationChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationChannel(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotificationChannel get(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, state, options);
    }
}
