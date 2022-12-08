// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardVariableItem {
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    private @Nullable String title;
    /**
     * @return (Required) A possible variable value
     * 
     */
    private String value;

    private OneDashboardVariableItem() {}
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    public Optional<String> title() {
        return Optional.ofNullable(this.title);
    }
    /**
     * @return (Required) A possible variable value
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardVariableItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String title;
        private String value;
        public Builder() {}
        public Builder(OneDashboardVariableItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.title = defaults.title;
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder title(@Nullable String title) {
            this.title = title;
            return this;
        }
        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public OneDashboardVariableItem build() {
            final var o = new OneDashboardVariableItem();
            o.title = title;
            o.value = value;
            return o;
        }
    }
}
