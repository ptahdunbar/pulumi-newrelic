// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomaticRemainingEntitiesRule;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomaticRule;
import java.lang.Boolean;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadStatusConfigAutomatic {
    /**
     * @return Whether the static status configuration is enabled or not.
     * 
     */
    private Boolean enabled;
    /**
     * @return An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
     * 
     */
    private @Nullable WorkloadStatusConfigAutomaticRemainingEntitiesRule remainingEntitiesRule;
    /**
     * @return The input object used to represent a rollup strategy. See Nested rule blocks below for details.
     * 
     */
    private @Nullable List<WorkloadStatusConfigAutomaticRule> rules;

    private WorkloadStatusConfigAutomatic() {}
    /**
     * @return Whether the static status configuration is enabled or not.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }
    /**
     * @return An additional meta-rule that can consider all entities that haven&#39;t been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
     * 
     */
    public Optional<WorkloadStatusConfigAutomaticRemainingEntitiesRule> remainingEntitiesRule() {
        return Optional.ofNullable(this.remainingEntitiesRule);
    }
    /**
     * @return The input object used to represent a rollup strategy. See Nested rule blocks below for details.
     * 
     */
    public List<WorkloadStatusConfigAutomaticRule> rules() {
        return this.rules == null ? List.of() : this.rules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadStatusConfigAutomatic defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        private @Nullable WorkloadStatusConfigAutomaticRemainingEntitiesRule remainingEntitiesRule;
        private @Nullable List<WorkloadStatusConfigAutomaticRule> rules;
        public Builder() {}
        public Builder(WorkloadStatusConfigAutomatic defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
    	      this.remainingEntitiesRule = defaults.remainingEntitiesRule;
    	      this.rules = defaults.rules;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        @CustomType.Setter
        public Builder remainingEntitiesRule(@Nullable WorkloadStatusConfigAutomaticRemainingEntitiesRule remainingEntitiesRule) {
            this.remainingEntitiesRule = remainingEntitiesRule;
            return this;
        }
        @CustomType.Setter
        public Builder rules(@Nullable List<WorkloadStatusConfigAutomaticRule> rules) {
            this.rules = rules;
            return this;
        }
        public Builder rules(WorkloadStatusConfigAutomaticRule... rules) {
            return rules(List.of(rules));
        }
        public WorkloadStatusConfigAutomatic build() {
            final var o = new WorkloadStatusConfigAutomatic();
            o.enabled = enabled;
            o.remainingEntitiesRule = remainingEntitiesRule;
            o.rules = rules;
            return o;
        }
    }
}
