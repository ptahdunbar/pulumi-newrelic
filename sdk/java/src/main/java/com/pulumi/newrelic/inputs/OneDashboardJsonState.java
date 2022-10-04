// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardJsonState extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardJsonState Empty = new OneDashboardJsonState();

    /**
     * The New Relic account ID where you want to create the dashboard.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return The New Relic account ID where you want to create the dashboard.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

    /**
     * The unique entity identifier of the dashboard in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
     * 
     */
    @Import(name="json")
    private @Nullable Output<String> json;

    /**
     * @return The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
     * 
     */
    public Optional<Output<String>> json() {
        return Optional.ofNullable(this.json);
    }

    /**
     * The URL for viewing the dashboard.
     * 
     */
    @Import(name="permalink")
    private @Nullable Output<String> permalink;

    /**
     * @return The URL for viewing the dashboard.
     * 
     */
    public Optional<Output<String>> permalink() {
        return Optional.ofNullable(this.permalink);
    }

    /**
     * The date and time when the dashboard was last updated.
     * 
     */
    @Import(name="updatedAt")
    private @Nullable Output<String> updatedAt;

    /**
     * @return The date and time when the dashboard was last updated.
     * 
     */
    public Optional<Output<String>> updatedAt() {
        return Optional.ofNullable(this.updatedAt);
    }

    private OneDashboardJsonState() {}

    private OneDashboardJsonState(OneDashboardJsonState $) {
        this.accountId = $.accountId;
        this.guid = $.guid;
        this.json = $.json;
        this.permalink = $.permalink;
        this.updatedAt = $.updatedAt;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardJsonState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardJsonState $;

        public Builder() {
            $ = new OneDashboardJsonState();
        }

        public Builder(OneDashboardJsonState defaults) {
            $ = new OneDashboardJsonState(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId The New Relic account ID where you want to create the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId The New Relic account ID where you want to create the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
        }

        /**
         * @param guid The unique entity identifier of the dashboard in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the dashboard in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param json The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
         * 
         * @return builder
         * 
         */
        public Builder json(@Nullable Output<String> json) {
            $.json = json;
            return this;
        }

        /**
         * @param json The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
         * 
         * @return builder
         * 
         */
        public Builder json(String json) {
            return json(Output.of(json));
        }

        /**
         * @param permalink The URL for viewing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder permalink(@Nullable Output<String> permalink) {
            $.permalink = permalink;
            return this;
        }

        /**
         * @param permalink The URL for viewing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder permalink(String permalink) {
            return permalink(Output.of(permalink));
        }

        /**
         * @param updatedAt The date and time when the dashboard was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(@Nullable Output<String> updatedAt) {
            $.updatedAt = updatedAt;
            return this;
        }

        /**
         * @param updatedAt The date and time when the dashboard was last updated.
         * 
         * @return builder
         * 
         */
        public Builder updatedAt(String updatedAt) {
            return updatedAt(Output.of(updatedAt));
        }

        public OneDashboardJsonState build() {
            return $;
        }
    }

}
