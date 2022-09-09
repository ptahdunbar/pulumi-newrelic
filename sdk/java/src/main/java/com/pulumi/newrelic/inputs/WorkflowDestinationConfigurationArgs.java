// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class WorkflowDestinationConfigurationArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowDestinationConfigurationArgs Empty = new WorkflowDestinationConfigurationArgs();

    @Import(name="channelId", required=true)
    private Output<String> channelId;

    public Output<String> channelId() {
        return this.channelId;
    }

    /**
     * A nrql enrichment name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return A nrql enrichment name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * the filter&#39;s type.   One of: `FILTER` or `VIEW`.
     * * `predicates`
     * 
     */
    @Import(name="type")
    private @Nullable Output<String> type;

    /**
     * @return the filter&#39;s type.   One of: `FILTER` or `VIEW`.
     * * `predicates`
     * 
     */
    public Optional<Output<String>> type() {
        return Optional.ofNullable(this.type);
    }

    private WorkflowDestinationConfigurationArgs() {}

    private WorkflowDestinationConfigurationArgs(WorkflowDestinationConfigurationArgs $) {
        this.channelId = $.channelId;
        this.name = $.name;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowDestinationConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowDestinationConfigurationArgs $;

        public Builder() {
            $ = new WorkflowDestinationConfigurationArgs();
        }

        public Builder(WorkflowDestinationConfigurationArgs defaults) {
            $ = new WorkflowDestinationConfigurationArgs(Objects.requireNonNull(defaults));
        }

        public Builder channelId(Output<String> channelId) {
            $.channelId = channelId;
            return this;
        }

        public Builder channelId(String channelId) {
            return channelId(Output.of(channelId));
        }

        /**
         * @param name A nrql enrichment name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name A nrql enrichment name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param type the filter&#39;s type.   One of: `FILTER` or `VIEW`.
         * * `predicates`
         * 
         * @return builder
         * 
         */
        public Builder type(@Nullable Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type the filter&#39;s type.   One of: `FILTER` or `VIEW`.
         * * `predicates`
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public WorkflowDestinationConfigurationArgs build() {
            $.channelId = Objects.requireNonNull($.channelId, "expected parameter 'channelId' to be non-null");
            return $;
        }
    }

}
