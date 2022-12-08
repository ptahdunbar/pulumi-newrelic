// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup;
import java.util.Objects;

@CustomType
public final class WorkloadStatusConfigAutomaticRemainingEntitiesRule {
    /**
     * @return The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
     * 
     */
    private WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup remainingEntitiesRuleRollup;

    private WorkloadStatusConfigAutomaticRemainingEntitiesRule() {}
    /**
     * @return The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
     * 
     */
    public WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup remainingEntitiesRuleRollup() {
        return this.remainingEntitiesRuleRollup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadStatusConfigAutomaticRemainingEntitiesRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup remainingEntitiesRuleRollup;
        public Builder() {}
        public Builder(WorkloadStatusConfigAutomaticRemainingEntitiesRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.remainingEntitiesRuleRollup = defaults.remainingEntitiesRuleRollup;
        }

        @CustomType.Setter
        public Builder remainingEntitiesRuleRollup(WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollup remainingEntitiesRuleRollup) {
            this.remainingEntitiesRuleRollup = Objects.requireNonNull(remainingEntitiesRuleRollup);
            return this;
        }
        public WorkloadStatusConfigAutomaticRemainingEntitiesRule build() {
            final var o = new WorkloadStatusConfigAutomaticRemainingEntitiesRule();
            o.remainingEntitiesRuleRollup = remainingEntitiesRuleRollup;
            return o;
        }
    }
}
