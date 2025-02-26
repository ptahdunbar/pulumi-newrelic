// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLevelEventsGoodEventsSelectArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelEventsGoodEventsSelectArgs Empty = new ServiceLevelEventsGoodEventsSelectArgs();

    /**
     * The event attribute to use in the SELECT clause.
     * 
     */
    @Import(name="attribute")
    private @Nullable Output<String> attribute;

    /**
     * @return The event attribute to use in the SELECT clause.
     * 
     */
    public Optional<Output<String>> attribute() {
        return Optional.ofNullable(this.attribute);
    }

    /**
     * The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
     * 
     */
    @Import(name="function", required=true)
    private Output<String> function;

    /**
     * @return The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
     * 
     */
    public Output<String> function() {
        return this.function;
    }

    @Import(name="threshold")
    private @Nullable Output<Double> threshold;

    public Optional<Output<Double>> threshold() {
        return Optional.ofNullable(this.threshold);
    }

    private ServiceLevelEventsGoodEventsSelectArgs() {}

    private ServiceLevelEventsGoodEventsSelectArgs(ServiceLevelEventsGoodEventsSelectArgs $) {
        this.attribute = $.attribute;
        this.function = $.function;
        this.threshold = $.threshold;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelEventsGoodEventsSelectArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelEventsGoodEventsSelectArgs $;

        public Builder() {
            $ = new ServiceLevelEventsGoodEventsSelectArgs();
        }

        public Builder(ServiceLevelEventsGoodEventsSelectArgs defaults) {
            $ = new ServiceLevelEventsGoodEventsSelectArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute The event attribute to use in the SELECT clause.
         * 
         * @return builder
         * 
         */
        public Builder attribute(@Nullable Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute The event attribute to use in the SELECT clause.
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param function The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
         * 
         * @return builder
         * 
         */
        public Builder function(Output<String> function) {
            $.function = function;
            return this;
        }

        /**
         * @param function The function to use in the SELECT clause. Valid values are `COUNT` and `SUM`.
         * 
         * @return builder
         * 
         */
        public Builder function(String function) {
            return function(Output.of(function));
        }

        public Builder threshold(@Nullable Output<Double> threshold) {
            $.threshold = threshold;
            return this;
        }

        public Builder threshold(Double threshold) {
            return threshold(Output.of(threshold));
        }

        public ServiceLevelEventsGoodEventsSelectArgs build() {
            $.function = Objects.requireNonNull($.function, "expected parameter 'function' to be non-null");
            return $;
        }
    }

}
