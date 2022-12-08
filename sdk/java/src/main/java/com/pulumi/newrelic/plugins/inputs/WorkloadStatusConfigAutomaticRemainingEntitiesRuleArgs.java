// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.plugins.inputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs;
import java.util.Objects;


public final class WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs Empty = new WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs();

    /**
     * The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
     * 
     */
    @Import(name="remainingEntitiesRuleRollup", required=true)
    private Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs> remainingEntitiesRuleRollup;

    /**
     * @return The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
     * 
     */
    public Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs> remainingEntitiesRuleRollup() {
        return this.remainingEntitiesRuleRollup;
    }

    private WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs() {}

    private WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs(WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs $) {
        this.remainingEntitiesRuleRollup = $.remainingEntitiesRuleRollup;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs $;

        public Builder() {
            $ = new WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs();
        }

        public Builder(WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs defaults) {
            $ = new WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param remainingEntitiesRuleRollup The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder remainingEntitiesRuleRollup(Output<WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs> remainingEntitiesRuleRollup) {
            $.remainingEntitiesRuleRollup = remainingEntitiesRuleRollup;
            return this;
        }

        /**
         * @param remainingEntitiesRuleRollup The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder remainingEntitiesRuleRollup(WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs remainingEntitiesRuleRollup) {
            return remainingEntitiesRuleRollup(Output.of(remainingEntitiesRuleRollup));
        }

        public WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs build() {
            $.remainingEntitiesRuleRollup = Objects.requireNonNull($.remainingEntitiesRuleRollup, "expected parameter 'remainingEntitiesRuleRollup' to be non-null");
            return $;
        }
    }

}
