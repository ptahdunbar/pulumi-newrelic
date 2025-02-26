// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetNotificationDestinationArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetNotificationDestinationArgs Empty = new GetNotificationDestinationArgs();

    /**
     * The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The id of the notification destination in New Relic.
     * 
     */
    @Import(name="id", required=true)
    private Output<String> id;

    /**
     * @return The id of the notification destination in New Relic.
     * 
     */
    public Output<String> id() {
        return this.id;
    }

    private GetNotificationDestinationArgs() {}

    private GetNotificationDestinationArgs(GetNotificationDestinationArgs $) {
        this.accountId = $.accountId;
        this.id = $.id;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetNotificationDestinationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetNotificationDestinationArgs $;

        public Builder() {
            $ = new GetNotificationDestinationArgs();
        }

        public Builder(GetNotificationDestinationArgs defaults) {
            $ = new GetNotificationDestinationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID to operate on.  This allows you to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param id The id of the notification destination in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder id(Output<String> id) {
            $.id = id;
            return this;
        }

        /**
         * @param id The id of the notification destination in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder id(String id) {
            return id(Output.of(id));
        }

        public GetNotificationDestinationArgs build() {
            $.id = Objects.requireNonNull($.id, "expected parameter 'id' to be non-null");
            return $;
        }
    }

}
