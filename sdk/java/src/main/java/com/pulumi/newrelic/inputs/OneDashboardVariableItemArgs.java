// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardVariableItemArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardVariableItemArgs Empty = new OneDashboardVariableItemArgs();

    /**
     * (Optional) A human-friendly display string for this value.
     * 
     */
    @Import(name="title")
    private @Nullable Output<String> title;

    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    public Optional<Output<String>> title() {
        return Optional.ofNullable(this.title);
    }

    /**
     * (Required) A possible variable value
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return (Required) A possible variable value
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private OneDashboardVariableItemArgs() {}

    private OneDashboardVariableItemArgs(OneDashboardVariableItemArgs $) {
        this.title = $.title;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardVariableItemArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardVariableItemArgs $;

        public Builder() {
            $ = new OneDashboardVariableItemArgs();
        }

        public Builder(OneDashboardVariableItemArgs defaults) {
            $ = new OneDashboardVariableItemArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param title (Optional) A human-friendly display string for this value.
         * 
         * @return builder
         * 
         */
        public Builder title(@Nullable Output<String> title) {
            $.title = title;
            return this;
        }

        /**
         * @param title (Optional) A human-friendly display string for this value.
         * 
         * @return builder
         * 
         */
        public Builder title(String title) {
            return title(Output.of(title));
        }

        /**
         * @param value (Required) A possible variable value
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value (Required) A possible variable value
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public OneDashboardVariableItemArgs build() {
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
