// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.plugins.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomaticRuleNrqlQuery;
import com.pulumi.newrelic.plugins.outputs.WorkloadStatusConfigAutomaticRuleRollup;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class WorkloadStatusConfigAutomaticRule {
    /**
     * @return A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
     * 
     */
    private @Nullable List<String> entityGuids;
    /**
     * @return A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
     * 
     */
    private @Nullable List<WorkloadStatusConfigAutomaticRuleNrqlQuery> nrqlQueries;
    /**
     * @return The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
     * 
     */
    private WorkloadStatusConfigAutomaticRuleRollup rollup;

    private WorkloadStatusConfigAutomaticRule() {}
    /**
     * @return A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
     * 
     */
    public List<String> entityGuids() {
        return this.entityGuids == null ? List.of() : this.entityGuids;
    }
    /**
     * @return A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
     * 
     */
    public List<WorkloadStatusConfigAutomaticRuleNrqlQuery> nrqlQueries() {
        return this.nrqlQueries == null ? List.of() : this.nrqlQueries;
    }
    /**
     * @return The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
     * 
     */
    public WorkloadStatusConfigAutomaticRuleRollup rollup() {
        return this.rollup;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WorkloadStatusConfigAutomaticRule defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> entityGuids;
        private @Nullable List<WorkloadStatusConfigAutomaticRuleNrqlQuery> nrqlQueries;
        private WorkloadStatusConfigAutomaticRuleRollup rollup;
        public Builder() {}
        public Builder(WorkloadStatusConfigAutomaticRule defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.entityGuids = defaults.entityGuids;
    	      this.nrqlQueries = defaults.nrqlQueries;
    	      this.rollup = defaults.rollup;
        }

        @CustomType.Setter
        public Builder entityGuids(@Nullable List<String> entityGuids) {
            this.entityGuids = entityGuids;
            return this;
        }
        public Builder entityGuids(String... entityGuids) {
            return entityGuids(List.of(entityGuids));
        }
        @CustomType.Setter
        public Builder nrqlQueries(@Nullable List<WorkloadStatusConfigAutomaticRuleNrqlQuery> nrqlQueries) {
            this.nrqlQueries = nrqlQueries;
            return this;
        }
        public Builder nrqlQueries(WorkloadStatusConfigAutomaticRuleNrqlQuery... nrqlQueries) {
            return nrqlQueries(List.of(nrqlQueries));
        }
        @CustomType.Setter
        public Builder rollup(WorkloadStatusConfigAutomaticRuleRollup rollup) {
            this.rollup = Objects.requireNonNull(rollup);
            return this;
        }
        public WorkloadStatusConfigAutomaticRule build() {
            final var o = new WorkloadStatusConfigAutomaticRule();
            o.entityGuids = entityGuids;
            o.nrqlQueries = nrqlQueries;
            o.rollup = rollup;
            return o;
        }
    }
}
