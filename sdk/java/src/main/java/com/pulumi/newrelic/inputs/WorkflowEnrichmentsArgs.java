// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.WorkflowEnrichmentsNrqlArgs;
import java.util.List;
import java.util.Objects;


public final class WorkflowEnrichmentsArgs extends com.pulumi.resources.ResourceArgs {

    public static final WorkflowEnrichmentsArgs Empty = new WorkflowEnrichmentsArgs();

    @Import(name="nrqls", required=true)
    private Output<List<WorkflowEnrichmentsNrqlArgs>> nrqls;

    public Output<List<WorkflowEnrichmentsNrqlArgs>> nrqls() {
        return this.nrqls;
    }

    private WorkflowEnrichmentsArgs() {}

    private WorkflowEnrichmentsArgs(WorkflowEnrichmentsArgs $) {
        this.nrqls = $.nrqls;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(WorkflowEnrichmentsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private WorkflowEnrichmentsArgs $;

        public Builder() {
            $ = new WorkflowEnrichmentsArgs();
        }

        public Builder(WorkflowEnrichmentsArgs defaults) {
            $ = new WorkflowEnrichmentsArgs(Objects.requireNonNull(defaults));
        }

        public Builder nrqls(Output<List<WorkflowEnrichmentsNrqlArgs>> nrqls) {
            $.nrqls = nrqls;
            return this;
        }

        public Builder nrqls(List<WorkflowEnrichmentsNrqlArgs> nrqls) {
            return nrqls(Output.of(nrqls));
        }

        public Builder nrqls(WorkflowEnrichmentsNrqlArgs... nrqls) {
            return nrqls(List.of(nrqls));
        }

        public WorkflowEnrichmentsArgs build() {
            $.nrqls = Objects.requireNonNull($.nrqls, "expected parameter 'nrqls' to be non-null");
            return $;
        }
    }

}
