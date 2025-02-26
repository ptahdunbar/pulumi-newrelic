// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NrqlAlertConditionCritical {
    /**
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    private @Nullable Integer duration;
    private @Nullable String operator;
    private Double threshold;
    private @Nullable Integer thresholdDuration;
    private @Nullable String thresholdOccurrences;
    /**
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    private @Nullable String timeFunction;

    private NrqlAlertConditionCritical() {}
    /**
     * @deprecated
     * use `threshold_duration` attribute instead
     * 
     */
    @Deprecated /* use `threshold_duration` attribute instead */
    public Optional<Integer> duration() {
        return Optional.ofNullable(this.duration);
    }
    public Optional<String> operator() {
        return Optional.ofNullable(this.operator);
    }
    public Double threshold() {
        return this.threshold;
    }
    public Optional<Integer> thresholdDuration() {
        return Optional.ofNullable(this.thresholdDuration);
    }
    public Optional<String> thresholdOccurrences() {
        return Optional.ofNullable(this.thresholdOccurrences);
    }
    /**
     * @deprecated
     * use `threshold_occurrences` attribute instead
     * 
     */
    @Deprecated /* use `threshold_occurrences` attribute instead */
    public Optional<String> timeFunction() {
        return Optional.ofNullable(this.timeFunction);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NrqlAlertConditionCritical defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Integer duration;
        private @Nullable String operator;
        private Double threshold;
        private @Nullable Integer thresholdDuration;
        private @Nullable String thresholdOccurrences;
        private @Nullable String timeFunction;
        public Builder() {}
        public Builder(NrqlAlertConditionCritical defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.duration = defaults.duration;
    	      this.operator = defaults.operator;
    	      this.threshold = defaults.threshold;
    	      this.thresholdDuration = defaults.thresholdDuration;
    	      this.thresholdOccurrences = defaults.thresholdOccurrences;
    	      this.timeFunction = defaults.timeFunction;
        }

        @CustomType.Setter
        public Builder duration(@Nullable Integer duration) {
            this.duration = duration;
            return this;
        }
        @CustomType.Setter
        public Builder operator(@Nullable String operator) {
            this.operator = operator;
            return this;
        }
        @CustomType.Setter
        public Builder threshold(Double threshold) {
            this.threshold = Objects.requireNonNull(threshold);
            return this;
        }
        @CustomType.Setter
        public Builder thresholdDuration(@Nullable Integer thresholdDuration) {
            this.thresholdDuration = thresholdDuration;
            return this;
        }
        @CustomType.Setter
        public Builder thresholdOccurrences(@Nullable String thresholdOccurrences) {
            this.thresholdOccurrences = thresholdOccurrences;
            return this;
        }
        @CustomType.Setter
        public Builder timeFunction(@Nullable String timeFunction) {
            this.timeFunction = timeFunction;
            return this;
        }
        public NrqlAlertConditionCritical build() {
            final var o = new NrqlAlertConditionCritical();
            o.duration = duration;
            o.operator = operator;
            o.threshold = threshold;
            o.thresholdDuration = thresholdDuration;
            o.thresholdOccurrences = thresholdOccurrences;
            o.timeFunction = timeFunction;
            return o;
        }
    }
}
