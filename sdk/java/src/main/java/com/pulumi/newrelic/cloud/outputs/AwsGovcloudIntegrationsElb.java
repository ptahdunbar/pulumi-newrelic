// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AwsGovcloudIntegrationsElb {
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * * `direct connect`
     * * `aws states`
     * 
     */
    private @Nullable List<String> awsRegions;
    /**
     * @return Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    private @Nullable Boolean fetchExtendedInventory;
    /**
     * @return Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    private @Nullable Boolean fetchTags;
    /**
     * @return The data polling interval in seconds.
     * 
     */
    private @Nullable Integer metricsPollingInterval;

    private AwsGovcloudIntegrationsElb() {}
    /**
     * @return Specify each AWS region that includes the resources that you want to monitor.
     * * `direct connect`
     * * `aws states`
     * 
     */
    public List<String> awsRegions() {
        return this.awsRegions == null ? List.of() : this.awsRegions;
    }
    /**
     * @return Determine if extra inventory data be collected or not. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Boolean> fetchExtendedInventory() {
        return Optional.ofNullable(this.fetchExtendedInventory);
    }
    /**
     * @return Specify if tags should be collected. May affect total data collection time and contribute to the Cloud provider API rate limit.
     * 
     */
    public Optional<Boolean> fetchTags() {
        return Optional.ofNullable(this.fetchTags);
    }
    /**
     * @return The data polling interval in seconds.
     * 
     */
    public Optional<Integer> metricsPollingInterval() {
        return Optional.ofNullable(this.metricsPollingInterval);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AwsGovcloudIntegrationsElb defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> awsRegions;
        private @Nullable Boolean fetchExtendedInventory;
        private @Nullable Boolean fetchTags;
        private @Nullable Integer metricsPollingInterval;
        public Builder() {}
        public Builder(AwsGovcloudIntegrationsElb defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.awsRegions = defaults.awsRegions;
    	      this.fetchExtendedInventory = defaults.fetchExtendedInventory;
    	      this.fetchTags = defaults.fetchTags;
    	      this.metricsPollingInterval = defaults.metricsPollingInterval;
        }

        @CustomType.Setter
        public Builder awsRegions(@Nullable List<String> awsRegions) {
            this.awsRegions = awsRegions;
            return this;
        }
        public Builder awsRegions(String... awsRegions) {
            return awsRegions(List.of(awsRegions));
        }
        @CustomType.Setter
        public Builder fetchExtendedInventory(@Nullable Boolean fetchExtendedInventory) {
            this.fetchExtendedInventory = fetchExtendedInventory;
            return this;
        }
        @CustomType.Setter
        public Builder fetchTags(@Nullable Boolean fetchTags) {
            this.fetchTags = fetchTags;
            return this;
        }
        @CustomType.Setter
        public Builder metricsPollingInterval(@Nullable Integer metricsPollingInterval) {
            this.metricsPollingInterval = metricsPollingInterval;
            return this;
        }
        public AwsGovcloudIntegrationsElb build() {
            final var o = new AwsGovcloudIntegrationsElb();
            o.awsRegions = awsRegions;
            o.fetchExtendedInventory = fetchExtendedInventory;
            o.fetchTags = fetchTags;
            o.metricsPollingInterval = metricsPollingInterval;
            return o;
        }
    }
}
