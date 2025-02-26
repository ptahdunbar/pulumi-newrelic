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


public final class GetObfuscationExpressionArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetObfuscationExpressionArgs Empty = new GetObfuscationExpressionArgs();

    /**
     * The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Name of expression.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return Name of expression.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    private GetObfuscationExpressionArgs() {}

    private GetObfuscationExpressionArgs(GetObfuscationExpressionArgs $) {
        this.accountId = $.accountId;
        this.name = $.name;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetObfuscationExpressionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetObfuscationExpressionArgs $;

        public Builder() {
            $ = new GetObfuscationExpressionArgs();
        }

        public Builder(GetObfuscationExpressionArgs defaults) {
            $ = new GetObfuscationExpressionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id associated with the obfuscation expression. If left empty will default to account ID specified in provider level configuration.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param name Name of expression.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Name of expression.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public GetObfuscationExpressionArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
