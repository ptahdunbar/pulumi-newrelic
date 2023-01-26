// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRuleArgs;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkloadStatusConfigAutomaticArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadStatusConfigAutomaticArgs Empty = new WorkloadStatusConfigAutomaticArgs();

    /**
     * Whether the automatic status configuration is enabled or not.
     * 
     */
    @Import(name="enabled", required=true)
    private Output<Boolean> enabled;

    /**
     * @return Whether the automatic status configuration is enabled or not.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }

    /**
     * An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
     * 
     */
    @Import(name="remainingEntitiesRule")
    private @Nullable Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs> remainingEntitiesRule;

    /**
     * @return An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
     * 
     */
    public Optional<Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs>> remainingEntitiesRule() {
        return Optional.ofNullable(this.remainingEntitiesRule);
    }

    /**
     * The input object used to represent a rollup strategy. See Nested rule blocks below for details.
     * 
     */
    @Import(name="rules")
    private @Nullable Output<List<WorkloadStatusConfigAutomaticRuleArgs>> rules;

    /**
     * @return The input object used to represent a rollup strategy. See Nested rule blocks below for details.
     * 
     */
    public Optional<Output<List<WorkloadStatusConfigAutomaticRuleArgs>>> rules() {
        return Optional.ofNullable(this.rules);
    }

    private WorkloadStatusConfigAutomaticArgs() {}

    private WorkloadStatusConfigAutomaticArgs(WorkloadStatusConfigAutomaticArgs $) {
        this.enabled = $.enabled;
        this.remainingEntitiesRule = $.remainingEntitiesRule;
        this.rules = $.rules;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadStatusConfigAutomaticArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadStatusConfigAutomaticArgs $;

        public Builder() {
            $ = new WorkloadStatusConfigAutomaticArgs();
        }

        public Builder(WorkloadStatusConfigAutomaticArgs defaults) {
            $ = new WorkloadStatusConfigAutomaticArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param enabled Whether the automatic status configuration is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Whether the automatic status configuration is enabled or not.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param remainingEntitiesRule An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder remainingEntitiesRule(@Nullable Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs> remainingEntitiesRule) {
            $.remainingEntitiesRule = remainingEntitiesRule;
            return this;
        }

        /**
         * @param remainingEntitiesRule An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder remainingEntitiesRule(WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs remainingEntitiesRule) {
            return remainingEntitiesRule(Output.of(remainingEntitiesRule));
        }

        /**
         * @param rules The input object used to represent a rollup strategy. See Nested rule blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(@Nullable Output<List<WorkloadStatusConfigAutomaticRuleArgs>> rules) {
            $.rules = rules;
            return this;
        }

        /**
         * @param rules The input object used to represent a rollup strategy. See Nested rule blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(List<WorkloadStatusConfigAutomaticRuleArgs> rules) {
            return rules(Output.of(rules));
        }

        /**
         * @param rules The input object used to represent a rollup strategy. See Nested rule blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder rules(WorkloadStatusConfigAutomaticRuleArgs... rules) {
            return rules(List.of(rules));
        }

        public WorkloadStatusConfigAutomaticArgs build() {
            $.enabled = Objects.requireNonNull($.enabled, "expected parameter 'enabled' to be non-null");
            return $;
        }
    }

}
