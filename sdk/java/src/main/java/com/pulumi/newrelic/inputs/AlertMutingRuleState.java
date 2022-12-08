// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.AlertMutingRuleConditionArgs;
import com.pulumi.newrelic.inputs.AlertMutingRuleScheduleArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class AlertMutingRuleState extends com.pulumi.resources.ResourceArgs {

    public static final AlertMutingRuleState Empty = new AlertMutingRuleState();

    /**
     * The account id of the MutingRule.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account id of the MutingRule.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The condition that defines which incidents to target. See Nested condition blocks below for details.
     * 
     */
    @Import(name="condition")
    private @Nullable Output<AlertMutingRuleConditionArgs> condition;

    /**
     * @return The condition that defines which incidents to target. See Nested condition blocks below for details.
     * 
     */
    public Optional<Output<AlertMutingRuleConditionArgs>> condition() {
        return Optional.ofNullable(this.condition);
    }

    /**
     * The description of the MutingRule.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the MutingRule.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * Whether the MutingRule is enabled.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Whether the MutingRule is enabled.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The name of the MutingRule.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the MutingRule.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specify a schedule for enabling the MutingRule. See Schedule below for details
     * 
     */
    @Import(name="schedule")
    private @Nullable Output<AlertMutingRuleScheduleArgs> schedule;

    /**
     * @return Specify a schedule for enabling the MutingRule. See Schedule below for details
     * 
     */
    public Optional<Output<AlertMutingRuleScheduleArgs>> schedule() {
        return Optional.ofNullable(this.schedule);
    }

    private AlertMutingRuleState() {}

    private AlertMutingRuleState(AlertMutingRuleState $) {
        this.accountId = $.accountId;
        this.condition = $.condition;
        this.description = $.description;
        this.enabled = $.enabled;
        this.name = $.name;
        this.schedule = $.schedule;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertMutingRuleState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertMutingRuleState $;

        public Builder() {
            $ = new AlertMutingRuleState();
        }

        public Builder(AlertMutingRuleState defaults) {
            $ = new AlertMutingRuleState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account id of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account id of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param condition The condition that defines which incidents to target. See Nested condition blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder condition(@Nullable Output<AlertMutingRuleConditionArgs> condition) {
            $.condition = condition;
            return this;
        }

        /**
         * @param condition The condition that defines which incidents to target. See Nested condition blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder condition(AlertMutingRuleConditionArgs condition) {
            return condition(Output.of(condition));
        }

        /**
         * @param description The description of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled Whether the MutingRule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the MutingRule is enabled.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param name The name of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the MutingRule.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param schedule Specify a schedule for enabling the MutingRule. See Schedule below for details
         * 
         * @return builder
         * 
         */
        public Builder schedule(@Nullable Output<AlertMutingRuleScheduleArgs> schedule) {
            $.schedule = schedule;
            return this;
        }

        /**
         * @param schedule Specify a schedule for enabling the MutingRule. See Schedule below for details
         * 
         * @return builder
         * 
         */
        public Builder schedule(AlertMutingRuleScheduleArgs schedule) {
            return schedule(Output.of(schedule));
        }

        public AlertMutingRuleState build() {
            return $;
        }
    }

}
