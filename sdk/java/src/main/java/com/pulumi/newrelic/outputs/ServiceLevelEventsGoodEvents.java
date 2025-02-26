// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.ServiceLevelEventsGoodEventsSelect;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLevelEventsGoodEvents {
    /**
     * @return The event type where NRDB data will be fetched from.
     * 
     */
    private String from;
    /**
     * @return The NRQL SELECT clause to aggregate events.
     * 
     */
    private @Nullable ServiceLevelEventsGoodEventsSelect select;
    /**
     * @return A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
     * a particular entity and were successful).
     * a particular entity and returned an error).
     * 
     */
    private @Nullable String where;

    private ServiceLevelEventsGoodEvents() {}
    /**
     * @return The event type where NRDB data will be fetched from.
     * 
     */
    public String from() {
        return this.from;
    }
    /**
     * @return The NRQL SELECT clause to aggregate events.
     * 
     */
    public Optional<ServiceLevelEventsGoodEventsSelect> select() {
        return Optional.ofNullable(this.select);
    }
    /**
     * @return A filter that specifies all the NRDB events that are considered in this SLI (e.g, those that refer to a particular entity).
     * a particular entity and were successful).
     * a particular entity and returned an error).
     * 
     */
    public Optional<String> where() {
        return Optional.ofNullable(this.where);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelEventsGoodEvents defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String from;
        private @Nullable ServiceLevelEventsGoodEventsSelect select;
        private @Nullable String where;
        public Builder() {}
        public Builder(ServiceLevelEventsGoodEvents defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.from = defaults.from;
    	      this.select = defaults.select;
    	      this.where = defaults.where;
        }

        @CustomType.Setter
        public Builder from(String from) {
            this.from = Objects.requireNonNull(from);
            return this;
        }
        @CustomType.Setter
        public Builder select(@Nullable ServiceLevelEventsGoodEventsSelect select) {
            this.select = select;
            return this;
        }
        @CustomType.Setter
        public Builder where(@Nullable String where) {
            this.where = where;
            return this;
        }
        public ServiceLevelEventsGoodEvents build() {
            final var o = new ServiceLevelEventsGoodEvents();
            o.from = from;
            o.select = select;
            o.where = where;
            return o;
        }
    }
}
