// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.ServiceLevelEventsBadEvents;
import com.pulumi.newrelic.outputs.ServiceLevelEventsGoodEvents;
import com.pulumi.newrelic.outputs.ServiceLevelEventsValidEvents;
import java.lang.Integer;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ServiceLevelEvents {
    /**
     * @return The ID of the account where the entity (e.g, APM Service, Browser application, Workload, etc.) belongs to,
     * and that contains the NRDB data for the SLI/SLO calculations. Note that changing the account ID will force a new resource.
     * 
     */
    private Integer accountId;
    /**
     * @return The definition of the bad responses. If you define an SLI from valid and bad events, you must leave the good events argument empty.
     * 
     */
    private @Nullable ServiceLevelEventsBadEvents badEvents;
    /**
     * @return The definition of good responses. If you define an SLI from valid and good events, you must leave the bad events argument empty.
     * 
     */
    private @Nullable ServiceLevelEventsGoodEvents goodEvents;
    /**
     * @return The definition of valid requests.
     * 
     */
    private ServiceLevelEventsValidEvents validEvents;

    private ServiceLevelEvents() {}
    /**
     * @return The ID of the account where the entity (e.g, APM Service, Browser application, Workload, etc.) belongs to,
     * and that contains the NRDB data for the SLI/SLO calculations. Note that changing the account ID will force a new resource.
     * 
     */
    public Integer accountId() {
        return this.accountId;
    }
    /**
     * @return The definition of the bad responses. If you define an SLI from valid and bad events, you must leave the good events argument empty.
     * 
     */
    public Optional<ServiceLevelEventsBadEvents> badEvents() {
        return Optional.ofNullable(this.badEvents);
    }
    /**
     * @return The definition of good responses. If you define an SLI from valid and good events, you must leave the bad events argument empty.
     * 
     */
    public Optional<ServiceLevelEventsGoodEvents> goodEvents() {
        return Optional.ofNullable(this.goodEvents);
    }
    /**
     * @return The definition of valid requests.
     * 
     */
    public ServiceLevelEventsValidEvents validEvents() {
        return this.validEvents;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ServiceLevelEvents defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accountId;
        private @Nullable ServiceLevelEventsBadEvents badEvents;
        private @Nullable ServiceLevelEventsGoodEvents goodEvents;
        private ServiceLevelEventsValidEvents validEvents;
        public Builder() {}
        public Builder(ServiceLevelEvents defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.badEvents = defaults.badEvents;
    	      this.goodEvents = defaults.goodEvents;
    	      this.validEvents = defaults.validEvents;
        }

        @CustomType.Setter
        public Builder accountId(Integer accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder badEvents(@Nullable ServiceLevelEventsBadEvents badEvents) {
            this.badEvents = badEvents;
            return this;
        }
        @CustomType.Setter
        public Builder goodEvents(@Nullable ServiceLevelEventsGoodEvents goodEvents) {
            this.goodEvents = goodEvents;
            return this;
        }
        @CustomType.Setter
        public Builder validEvents(ServiceLevelEventsValidEvents validEvents) {
            this.validEvents = Objects.requireNonNull(validEvents);
            return this;
        }
        public ServiceLevelEvents build() {
            final var o = new ServiceLevelEvents();
            o.accountId = accountId;
            o.badEvents = badEvents;
            o.goodEvents = goodEvents;
            o.validEvents = validEvents;
            return o;
        }
    }
}
