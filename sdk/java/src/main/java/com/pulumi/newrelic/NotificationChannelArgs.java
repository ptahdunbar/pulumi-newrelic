// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationChannelArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelArgs Empty = new NotificationChannelArgs();

    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Indicates whether the channel is active.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Indicates whether the channel is active.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * The id of the destination.
     * 
     */
    @Import(name="destinationId", required=true)
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
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    @Import(name="product", required=true)
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
    @Import(name="properties", required=true)
    private Output<List<NotificationChannelPropertyArgs>> properties;

    /**
     * @return A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    public Output<List<NotificationChannelPropertyArgs>> properties() {
        return this.properties;
    }

    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NotificationChannelArgs() {}

    private NotificationChannelArgs(NotificationChannelArgs $) {
        this.accountId = $.accountId;
        this.active = $.active;
        this.destinationId = $.destinationId;
        this.name = $.name;
        this.product = $.product;
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelArgs $;

        public Builder() {
            $ = new NotificationChannelArgs();
        }

        public Builder(NotificationChannelArgs defaults) {
            $ = new NotificationChannelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param active Indicates whether the channel is active.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Indicates whether the channel is active.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param destinationId The id of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(Output<String> destinationId) {
            $.destinationId = destinationId;
            return this;
        }

        /**
         * @param destinationId The id of the destination.
         * 
         * @return builder
         * 
         */
        public Builder destinationId(String destinationId) {
            return destinationId(Output.of(destinationId));
        }

        /**
         * @param name The name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the channel.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param product The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
         * 
         * @return builder
         * 
         */
        public Builder product(Output<String> product) {
            $.product = product;
            return this;
        }

        /**
         * @param product The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
         * 
         * @return builder
         * 
         */
        public Builder product(String product) {
            return product(Output.of(product));
        }

        /**
         * @param properties A nested block that describes a notification channel property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<List<NotificationChannelPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A nested block that describes a notification channel property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(List<NotificationChannelPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties A nested block that describes a notification channel property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(NotificationChannelPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        /**
         * @param type The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationChannelArgs build() {
            $.destinationId = Objects.requireNonNull($.destinationId, "expected parameter 'destinationId' to be non-null");
            $.product = Objects.requireNonNull($.product, "expected parameter 'product' to be non-null");
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
