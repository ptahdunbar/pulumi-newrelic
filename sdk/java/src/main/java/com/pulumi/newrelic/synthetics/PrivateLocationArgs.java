// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class PrivateLocationArgs extends com.pulumi.resources.ResourceArgs {

    public static final PrivateLocationArgs Empty = new PrivateLocationArgs();

    /**
     * Account ID of the New Relic.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Account ID of the New Relic.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The private location description.
     * 
     */
    @Import(name="description", required=true)
    private Output<String> description;

    /**
     * @return The private location description.
     * 
     */
    public Output<String> description() {
        return this.description;
    }

    /**
     * The name of the private location.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the private location.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    @Import(name="verifiedScriptExecution")
    private @Nullable Output<Boolean> verifiedScriptExecution;

    /**
     * @return The private location requires a password to edit if value is true. Defaults to `false`
     * 
     */
    public Optional<Output<Boolean>> verifiedScriptExecution() {
        return Optional.ofNullable(this.verifiedScriptExecution);
    }

    private PrivateLocationArgs() {}

    private PrivateLocationArgs(PrivateLocationArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.name = $.name;
        this.verifiedScriptExecution = $.verifiedScriptExecution;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(PrivateLocationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private PrivateLocationArgs $;

        public Builder() {
            $ = new PrivateLocationArgs();
        }

        public Builder(PrivateLocationArgs defaults) {
            $ = new PrivateLocationArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account ID of the New Relic.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account ID of the New Relic.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param description The private location description.
         * 
         * @return builder
         * 
         */
        public Builder description(Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The private location description.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param name The name of the private location.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the private location.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param verifiedScriptExecution The private location requires a password to edit if value is true. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder verifiedScriptExecution(@Nullable Output<Boolean> verifiedScriptExecution) {
            $.verifiedScriptExecution = verifiedScriptExecution;
            return this;
        }

        /**
         * @param verifiedScriptExecution The private location requires a password to edit if value is true. Defaults to `false`
         * 
         * @return builder
         * 
         */
        public Builder verifiedScriptExecution(Boolean verifiedScriptExecution) {
            return verifiedScriptExecution(Output.of(verifiedScriptExecution));
        }

        public PrivateLocationArgs build() {
            $.description = Objects.requireNonNull($.description, "expected parameter 'description' to be non-null");
            return $;
        }
    }

}
