// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class SecureCredentialArgs extends com.pulumi.resources.ResourceArgs {

    public static final SecureCredentialArgs Empty = new SecureCredentialArgs();

    /**
     * Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The secure credential&#39;s description.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The secure credential&#39;s description.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The time the secure credential was last updated.
     * 
     */
    @Import(name="lastUpdated")
    private @Nullable Output<String> lastUpdated;

    /**
     * @return The time the secure credential was last updated.
     * 
     */
    public Optional<Output<String>> lastUpdated() {
        return Optional.ofNullable(this.lastUpdated);
    }

    /**
     * The secure credential&#39;s value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The secure credential&#39;s value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private SecureCredentialArgs() {}

    private SecureCredentialArgs(SecureCredentialArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.key = $.key;
        this.lastUpdated = $.lastUpdated;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SecureCredentialArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SecureCredentialArgs $;

        public Builder() {
            $ = new SecureCredentialArgs();
        }

        public Builder(SecureCredentialArgs defaults) {
            $ = new SecureCredentialArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the secure credential will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The secure credential&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The secure credential&#39;s description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param key The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The secure credential&#39;s key name.  Regardless of the case used in the configuration, the provider will provide an upcased key to the underlying API.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param lastUpdated The time the secure credential was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(@Nullable Output<String> lastUpdated) {
            $.lastUpdated = lastUpdated;
            return this;
        }

        /**
         * @param lastUpdated The time the secure credential was last updated.
         * 
         * @return builder
         * 
         */
        public Builder lastUpdated(String lastUpdated) {
            return lastUpdated(Output.of(lastUpdated));
        }

        /**
         * @param value The secure credential&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The secure credential&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public SecureCredentialArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
