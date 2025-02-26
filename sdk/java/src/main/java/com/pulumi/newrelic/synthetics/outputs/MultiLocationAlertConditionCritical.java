// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.util.Objects;

@CustomType
public final class MultiLocationAlertConditionCritical {
    private Integer threshold;

    private MultiLocationAlertConditionCritical() {}
    public Integer threshold() {
        return this.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MultiLocationAlertConditionCritical defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer threshold;
        public Builder() {}
        public Builder(MultiLocationAlertConditionCritical defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.threshold = defaults.threshold;
        }

        @CustomType.Setter
        public Builder threshold(Integer threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        public MultiLocationAlertConditionCritical build() {
            final var o = new MultiLocationAlertConditionCritical();
            o.threshold = threshold;
            return o;
        }
    }
}
