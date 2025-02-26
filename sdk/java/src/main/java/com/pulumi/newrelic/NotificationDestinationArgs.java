// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.NotificationDestinationAuthBasicArgs;
import com.pulumi.newrelic.inputs.NotificationDestinationAuthTokenArgs;
import com.pulumi.newrelic.inputs.NotificationDestinationPropertyArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationDestinationArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationDestinationArgs Empty = new NotificationDestinationArgs();

    /**
     * Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Indicates whether the destination is active.
     * 
     */
    @Import(name="active")
    private @Nullable Output<Boolean> active;

    /**
     * @return Indicates whether the destination is active.
     * 
     */
    public Optional<Output<Boolean>> active() {
        return Optional.ofNullable(this.active);
    }

    /**
     * A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
     * 
     */
    @Import(name="authBasic")
    private @Nullable Output<NotificationDestinationAuthBasicArgs> authBasic;

    /**
     * @return A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
     * 
     */
    public Optional<Output<NotificationDestinationAuthBasicArgs>> authBasic() {
        return Optional.ofNullable(this.authBasic);
    }

    /**
     * A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
     * 
     */
    @Import(name="authToken")
    private @Nullable Output<NotificationDestinationAuthTokenArgs> authToken;

    /**
     * @return A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
     * 
     */
    public Optional<Output<NotificationDestinationAuthTokenArgs>> authToken() {
        return Optional.ofNullable(this.authToken);
    }

    /**
     * The name of the destination.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the destination.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A nested block that describes a notification destination property. See Nested property blocks below for details.
     * 
     */
    @Import(name="properties", required=true)
    private Output<List<NotificationDestinationPropertyArgs>> properties;

    /**
     * @return A nested block that describes a notification destination property. See Nested property blocks below for details.
     * 
     */
    public Output<List<NotificationDestinationPropertyArgs>> properties() {
        return this.properties;
    }

    /**
     * (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
     * PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
     * PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private NotificationDestinationArgs() {}

    private NotificationDestinationArgs(NotificationDestinationArgs $) {
        this.accountId = $.accountId;
        this.active = $.active;
        this.authBasic = $.authBasic;
        this.authToken = $.authToken;
        this.name = $.name;
        this.properties = $.properties;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationDestinationArgs $;

        public Builder() {
            $ = new NotificationDestinationArgs();
        }

        public Builder(NotificationDestinationArgs defaults) {
            $ = new NotificationDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the notification destination will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param active Indicates whether the destination is active.
         * 
         * @return builder
         * 
         */
        public Builder active(@Nullable Output<Boolean> active) {
            $.active = active;
            return this;
        }

        /**
         * @param active Indicates whether the destination is active.
         * 
         * @return builder
         * 
         */
        public Builder active(Boolean active) {
            return active(Output.of(active));
        }

        /**
         * @param authBasic A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder authBasic(@Nullable Output<NotificationDestinationAuthBasicArgs> authBasic) {
            $.authBasic = authBasic;
            return this;
        }

        /**
         * @param authBasic A nested block that describes a basic username and password authentication credentials. Only one auth_basic block is permitted per notification destination definition.  See Nested auth_basic blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder authBasic(NotificationDestinationAuthBasicArgs authBasic) {
            return authBasic(Output.of(authBasic));
        }

        /**
         * @param authToken A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder authToken(@Nullable Output<NotificationDestinationAuthTokenArgs> authToken) {
            $.authToken = authToken;
            return this;
        }

        /**
         * @param authToken A nested block that describes a token authentication credentials. Only one auth_token block is permitted per notification destination definition.  See Nested auth_token blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder authToken(NotificationDestinationAuthTokenArgs authToken) {
            return authToken(Output.of(authToken));
        }

        /**
         * @param name The name of the destination.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the destination.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param properties A nested block that describes a notification destination property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(Output<List<NotificationDestinationPropertyArgs>> properties) {
            $.properties = properties;
            return this;
        }

        /**
         * @param properties A nested block that describes a notification destination property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(List<NotificationDestinationPropertyArgs> properties) {
            return properties(Output.of(properties));
        }

        /**
         * @param properties A nested block that describes a notification destination property. See Nested property blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder properties(NotificationDestinationPropertyArgs... properties) {
            return properties(List.of(properties));
        }

        /**
         * @param type (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
         * PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type (Required) The type of the destination. One of: (WEBHOOK, EMAIL, SERVICE_NOW, PAGERDUTY_ACCOUNT_INTEGRATION,
         * PAGERDUTY_SERVICE_INTEGRATION, JIRA, SLACK, SLACK_COLLABORATION, SLACK_LEGACY, MOBILE_PUSH, EVENT_BRIDGE).
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public NotificationDestinationArgs build() {
            $.properties = Objects.requireNonNull($.properties, "expected parameter 'properties' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
