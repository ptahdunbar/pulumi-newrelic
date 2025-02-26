// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.ServiceLevelEventsValidEventsSelectArgs;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ServiceLevelEventsValidEventsArgs extends com.pulumi.resources.ResourceArgs {

    public static final ServiceLevelEventsValidEventsArgs Empty = new ServiceLevelEventsValidEventsArgs();

    /**
     * The event type where NRDB data will be fetched from.
     * 
     */
    @Import(name="from", required=true)
    private Output<String> from;

    /**
     * @return The event type where NRDB data will be fetched from.
     * 
     */
    public Output<String> from() {
        return this.from;
    }

    /**
     * The NRQL SELECT clause to aggregate events.
     * 
     */
    @Import(name="select")
    private @Nullable Output<ServiceLevelEventsValidEventsSelectArgs> select;

    /**
     * @return The NRQL SELECT clause to aggregate events.
     * 
     */
    public Optional<Output<ServiceLevelEventsValidEventsSelectArgs>> select() {
        return Optional.ofNullable(this.select);
    }

    /**
     * A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
     * a particular entity and were successful).
     * a particular entity and returned an error).
     * 
     */
    @Import(name="where")
    private @Nullable Output<String> where;

    /**
     * @return A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
     * a particular entity and were successful).
     * a particular entity and returned an error).
     * 
     */
    public Optional<Output<String>> where() {
        return Optional.ofNullable(this.where);
    }

    private ServiceLevelEventsValidEventsArgs() {}

    private ServiceLevelEventsValidEventsArgs(ServiceLevelEventsValidEventsArgs $) {
        this.from = $.from;
        this.select = $.select;
        this.where = $.where;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ServiceLevelEventsValidEventsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ServiceLevelEventsValidEventsArgs $;

        public Builder() {
            $ = new ServiceLevelEventsValidEventsArgs();
        }

        public Builder(ServiceLevelEventsValidEventsArgs defaults) {
            $ = new ServiceLevelEventsValidEventsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param from The event type where NRDB data will be fetched from.
         * 
         * @return builder
         * 
         */
        public Builder from(Output<String> from) {
            $.from = from;
            return this;
        }

        /**
         * @param from The event type where NRDB data will be fetched from.
         * 
         * @return builder
         * 
         */
        public Builder from(String from) {
            return from(Output.of(from));
        }

        /**
         * @param select The NRQL SELECT clause to aggregate events.
         * 
         * @return builder
         * 
         */
        public Builder select(@Nullable Output<ServiceLevelEventsValidEventsSelectArgs> select) {
            $.select = select;
            return this;
        }

        /**
         * @param select The NRQL SELECT clause to aggregate events.
         * 
         * @return builder
         * 
         */
        public Builder select(ServiceLevelEventsValidEventsSelectArgs select) {
            return select(Output.of(select));
        }

        /**
         * @param where A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
         * a particular entity and were successful).
         * a particular entity and returned an error).
         * 
         * @return builder
         * 
         */
        public Builder where(@Nullable Output<String> where) {
            $.where = where;
            return this;
        }

        /**
         * @param where A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
         * a particular entity and were successful).
         * a particular entity and returned an error).
         * 
         * @return builder
         * 
         */
        public Builder where(String where) {
            return where(Output.of(where));
        }

        public ServiceLevelEventsValidEventsArgs build() {
            $.from = Objects.requireNonNull($.from, "expected parameter 'from' to be non-null");
            return $;
        }
    }

}
