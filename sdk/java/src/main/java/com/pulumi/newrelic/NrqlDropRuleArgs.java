// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NrqlDropRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final NrqlDropRuleArgs Empty = new NrqlDropRuleArgs();

    /**
     * Account where the drop rule will be put. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Account where the drop rule will be put. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
     * 
     */
    @Import(name="action", required=true)
    private Output<String> action;

    /**
     * @return An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
     * 
     */
    public Output<String> action() {
        return this.action;
    }

    /**
     * The description of the drop rule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the drop rule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * A NRQL string that specifies what data types to drop.
     * 
     */
    @Import(name="nrql", required=true)
    private Output<String> nrql;

    /**
     * @return A NRQL string that specifies what data types to drop.
     * 
     */
    public Output<String> nrql() {
        return this.nrql;
    }

    private NrqlDropRuleArgs() {}

    private NrqlDropRuleArgs(NrqlDropRuleArgs $) {
        this.accountId = $.accountId;
        this.action = $.action;
        this.description = $.description;
        this.nrql = $.nrql;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NrqlDropRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NrqlDropRuleArgs $;

        public Builder() {
            $ = new NrqlDropRuleArgs();
        }

        public Builder(NrqlDropRuleArgs defaults) {
            $ = new NrqlDropRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Account where the drop rule will be put. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Account where the drop rule will be put. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param action An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
         * 
         * @return builder
         * 
         */
        public Builder action(Output<String> action) {
            $.action = action;
            return this;
        }

        /**
         * @param action An action type specifying how to apply the NRQL string (either `drop_data`, `drop_attributes`, or `  drop_attributes_from_metric_aggregates `).
         * 
         * @return builder
         * 
         */
        public Builder action(String action) {
            return action(Output.of(action));
        }

        /**
         * @param description The description of the drop rule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the drop rule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param nrql A NRQL string that specifies what data types to drop.
         * 
         * @return builder
         * 
         */
        public Builder nrql(Output<String> nrql) {
            $.nrql = nrql;
            return this;
        }

        /**
         * @param nrql A NRQL string that specifies what data types to drop.
         * 
         * @return builder
         * 
         */
        public Builder nrql(String nrql) {
            return nrql(Output.of(nrql));
        }

        public NrqlDropRuleArgs build() {
            $.action = Objects.requireNonNull($.action, "expected parameter 'action' to be non-null");
            $.nrql = Objects.requireNonNull($.nrql, "expected parameter 'nrql' to be non-null");
            return $;
        }
    }

}
