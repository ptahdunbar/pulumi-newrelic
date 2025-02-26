// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.WorkflowEnrichmentsNrqlConfigurationArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowEnrichmentsNrqlArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowEnrichmentsNrqlArgs Empty = new WorkflowEnrichmentsNrqlArgs();

    /**
     * Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * Another wrapper block
     * 
     */
    @Import(name="configurations", required=true)
    private Output<List<WorkflowEnrichmentsNrqlConfigurationArgs>> configurations;

    /**
     * @return Another wrapper block
     * 
     */
    public Output<List<WorkflowEnrichmentsNrqlConfigurationArgs>> configurations() {
        return this.configurations;
    }

    @Import(name="enrichmentId")
    private @Nullable Output<String> enrichmentId;

    public Optional<Output<String>> enrichmentId() {
        return Optional.ofNullable(this.enrichmentId);
    }

    /**
     * The name of the workflow.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     * Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkflowEnrichmentsNrqlArgs() {}

    private WorkflowEnrichmentsNrqlArgs(WorkflowEnrichmentsNrqlArgs $) {
        this.accountId = $.accountId;
        this.configurations = $.configurations;
        this.enrichmentId = $.enrichmentId;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowEnrichmentsNrqlArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowEnrichmentsNrqlArgs $;

        public Builder() {
            $ = new WorkflowEnrichmentsNrqlArgs();
        }

        public Builder(WorkflowEnrichmentsNrqlArgs defaults) {
            $ = new WorkflowEnrichmentsNrqlArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param configurations Another wrapper block
         * 
         * @return builder
         * 
         */
        public Builder configurations(Output<List<WorkflowEnrichmentsNrqlConfigurationArgs>> configurations) {
            $.configurations = configurations;
            return this;
        }

        /**
         * @param configurations Another wrapper block
         * 
         * @return builder
         * 
         */
        public Builder configurations(List<WorkflowEnrichmentsNrqlConfigurationArgs> configurations) {
            return configurations(Output.of(configurations));
        }

        /**
         * @param configurations Another wrapper block
         * 
         * @return builder
         * 
         */
        public Builder configurations(WorkflowEnrichmentsNrqlConfigurationArgs... configurations) {
            return configurations(List.of(configurations));
        }

        public Builder enrichmentId(@Nullable Output<String> enrichmentId) {
            $.enrichmentId = enrichmentId;
            return this;
        }

        public Builder enrichmentId(String enrichmentId) {
            return enrichmentId(Output.of(enrichmentId));
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the workflow.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type Type of the filter. Please just set this field to `FILTER`. The field is likely to be deprecated/removed in the near future.
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkflowEnrichmentsNrqlArgs build() {
            $.configurations = Objects.requireNonNull($.configurations, "expected parameter 'configurations' to be non-null");
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
