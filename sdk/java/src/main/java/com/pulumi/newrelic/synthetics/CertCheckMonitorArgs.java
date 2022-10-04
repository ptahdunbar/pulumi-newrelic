// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.CertCheckMonitorTagArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class CertCheckMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final CertCheckMonitorArgs Empty = new CertCheckMonitorArgs();

    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    @Import(name="certificateExpiration", required=true)
    private Output<Integer> certificateExpiration;

    /**
     * @return The desired number of remaining days until the certificate expires to trigger a monitor failure.
     * 
     */
    public Output<Integer> certificateExpiration() {
        return this.certificateExpiration;
    }

    /**
     * The domain of the host that will have its certificate checked.
     * 
     */
    @Import(name="domain", required=true)
    private Output<String> domain;

    /**
     * @return The domain of the host that will have its certificate checked.
     * 
     */
    public Output<String> domain() {
        return this.domain;
    }

    /**
     * The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    @Import(name="locationsPrivates")
    private @Nullable Output<List<String>> locationsPrivates;

    /**
     * @return The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
     * 
     */
    public Optional<Output<List<String>>> locationsPrivates() {
        return Optional.ofNullable(this.locationsPrivates);
    }

    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Import(name="locationsPublics")
    private @Nullable Output<List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Optional<Output<List<String>>> locationsPublics() {
        return Optional.ofNullable(this.locationsPublics);
    }

    /**
     * The name for the monitor.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name for the monitor.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    @Import(name="period", required=true)
    private Output<String> period;

    /**
     * @return The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    public Output<String> period() {
        return this.period;
    }

    /**
     * The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<CertCheckMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details
     * 
     */
    public Optional<Output<List<CertCheckMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    private CertCheckMonitorArgs() {}

    private CertCheckMonitorArgs(CertCheckMonitorArgs $) {
        this.accountId = $.accountId;
        this.certificateExpiration = $.certificateExpiration;
        this.domain = $.domain;
        this.locationsPrivates = $.locationsPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.status = $.status;
        this.tags = $.tags;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(CertCheckMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private CertCheckMonitorArgs $;

        public Builder() {
            $ = new CertCheckMonitorArgs();
        }

        public Builder(CertCheckMonitorArgs defaults) {
            $ = new CertCheckMonitorArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The account in which the Synthetics monitor will be created.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param certificateExpiration The desired number of remaining days until the certificate expires to trigger a monitor failure.
         * 
         * @return builder
         * 
         */
        public Builder certificateExpiration(Output<Integer> certificateExpiration) {
            $.certificateExpiration = certificateExpiration;
            return this;
        }

        /**
         * @param certificateExpiration The desired number of remaining days until the certificate expires to trigger a monitor failure.
         * 
         * @return builder
         * 
         */
        public Builder certificateExpiration(Integer certificateExpiration) {
            return certificateExpiration(Output.of(certificateExpiration));
        }

        /**
         * @param domain The domain of the host that will have its certificate checked.
         * 
         * @return builder
         * 
         */
        public Builder domain(Output<String> domain) {
            $.domain = domain;
            return this;
        }

        /**
         * @param domain The domain of the host that will have its certificate checked.
         * 
         * @return builder
         * 
         */
        public Builder domain(String domain) {
            return domain(Output.of(domain));
        }

        /**
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(@Nullable Output<List<String>> locationsPrivates) {
            $.locationsPrivates = locationsPrivates;
            return this;
        }

        /**
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(List<String> locationsPrivates) {
            return locationsPrivates(Output.of(locationsPrivates));
        }

        /**
         * @param locationsPrivates The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locations_public` or `locations_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPrivates(String... locationsPrivates) {
            return locationsPrivates(List.of(locationsPrivates));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(@Nullable Output<List<String>> locationsPublics) {
            $.locationsPublics = locationsPublics;
            return this;
        }

        /**
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(List<String> locationsPublics) {
            return locationsPublics(Output.of(locationsPublics));
        }

        /**
         * @param locationsPublics The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationsPublics(String... locationsPublics) {
            return locationsPublics(List.of(locationsPublics));
        }

        /**
         * @param name The name for the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name for the monitor.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param period The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
         * 
         * @return builder
         * 
         */
        public Builder period(Output<String> period) {
            $.period = period;
            return this;
        }

        /**
         * @param period The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
         * 
         * @return builder
         * 
         */
        public Builder period(String period) {
            return period(Output.of(period));
        }

        /**
         * @param status The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<CertCheckMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(List<CertCheckMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details
         * 
         * @return builder
         * 
         */
        public Builder tags(CertCheckMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        public CertCheckMonitorArgs build() {
            $.certificateExpiration = Objects.requireNonNull($.certificateExpiration, "expected parameter 'certificateExpiration' to be non-null");
            $.domain = Objects.requireNonNull($.domain, "expected parameter 'domain' to be non-null");
            $.period = Objects.requireNonNull($.period, "expected parameter 'period' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            return $;
        }
    }

}
