// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorLocationPrivateArgs;
import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ScriptMonitorArgs extends com.pulumi.resources.ResourceArgs {

    public static final ScriptMonitorArgs Empty = new ScriptMonitorArgs();

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
     * Capture a screenshot during job execution
     * 
     */
    @Import(name="enableScreenshotOnFailureAndScript")
    private @Nullable Output<Boolean> enableScreenshotOnFailureAndScript;

    /**
     * @return Capture a screenshot during job execution
     * 
     */
    public Optional<Output<Boolean>> enableScreenshotOnFailureAndScript() {
        return Optional.ofNullable(this.enableScreenshotOnFailureAndScript);
    }

    /**
     * The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Import(name="locationPrivates")
    private @Nullable Output<List<ScriptMonitorLocationPrivateArgs>> locationPrivates;

    /**
     * @return The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Optional<Output<List<ScriptMonitorLocationPrivateArgs>>> locationPrivates() {
        return Optional.ofNullable(this.locationPrivates);
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
     * The runtime that the monitor will use to run jobs.
     * 
     */
    @Import(name="runtimeType")
    private @Nullable Output<String> runtimeType;

    /**
     * @return The runtime that the monitor will use to run jobs.
     * 
     */
    public Optional<Output<String>> runtimeType() {
        return Optional.ofNullable(this.runtimeType);
    }

    /**
     * The specific version of the runtime type selected.
     * 
     */
    @Import(name="runtimeTypeVersion")
    private @Nullable Output<String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected.
     * 
     */
    public Optional<Output<String>> runtimeTypeVersion() {
        return Optional.ofNullable(this.runtimeTypeVersion);
    }

    /**
     * The script that the monitor runs.
     * 
     */
    @Import(name="script")
    private @Nullable Output<String> script;

    /**
     * @return The script that the monitor runs.
     * 
     */
    public Optional<Output<String>> script() {
        return Optional.ofNullable(this.script);
    }

    /**
     * The programing language that should execute the script.
     * 
     */
    @Import(name="scriptLanguage")
    private @Nullable Output<String> scriptLanguage;

    /**
     * @return The programing language that should execute the script.
     * 
     */
    public Optional<Output<String>> scriptLanguage() {
        return Optional.ofNullable(this.scriptLanguage);
    }

    /**
     * The run state of the monitor.
     * 
     */
    @Import(name="status", required=true)
    private Output<String> status;

    /**
     * @return The run state of the monitor.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<List<ScriptMonitorTagArgs>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    public Optional<Output<List<ScriptMonitorTagArgs>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    @Import(name="type", required=true)
    private Output<String> type;

    /**
     * @return The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    private ScriptMonitorArgs() {}

    private ScriptMonitorArgs(ScriptMonitorArgs $) {
        this.accountId = $.accountId;
        this.enableScreenshotOnFailureAndScript = $.enableScreenshotOnFailureAndScript;
        this.locationPrivates = $.locationPrivates;
        this.locationsPublics = $.locationsPublics;
        this.name = $.name;
        this.period = $.period;
        this.runtimeType = $.runtimeType;
        this.runtimeTypeVersion = $.runtimeTypeVersion;
        this.script = $.script;
        this.scriptLanguage = $.scriptLanguage;
        this.status = $.status;
        this.tags = $.tags;
        this.type = $.type;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ScriptMonitorArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ScriptMonitorArgs $;

        public Builder() {
            $ = new ScriptMonitorArgs();
        }

        public Builder(ScriptMonitorArgs defaults) {
            $ = new ScriptMonitorArgs(Objects.requireNonNull(defaults));
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
         * @param enableScreenshotOnFailureAndScript Capture a screenshot during job execution
         * 
         * @return builder
         * 
         */
        public Builder enableScreenshotOnFailureAndScript(@Nullable Output<Boolean> enableScreenshotOnFailureAndScript) {
            $.enableScreenshotOnFailureAndScript = enableScreenshotOnFailureAndScript;
            return this;
        }

        /**
         * @param enableScreenshotOnFailureAndScript Capture a screenshot during job execution
         * 
         * @return builder
         * 
         */
        public Builder enableScreenshotOnFailureAndScript(Boolean enableScreenshotOnFailureAndScript) {
            return enableScreenshotOnFailureAndScript(Output.of(enableScreenshotOnFailureAndScript));
        }

        /**
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(@Nullable Output<List<ScriptMonitorLocationPrivateArgs>> locationPrivates) {
            $.locationPrivates = locationPrivates;
            return this;
        }

        /**
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(List<ScriptMonitorLocationPrivateArgs> locationPrivates) {
            return locationPrivates(Output.of(locationPrivates));
        }

        /**
         * @param locationPrivates The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
         * 
         * @return builder
         * 
         */
        public Builder locationPrivates(ScriptMonitorLocationPrivateArgs... locationPrivates) {
            return locationPrivates(List.of(locationPrivates));
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
         * @param runtimeType The runtime that the monitor will use to run jobs.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(@Nullable Output<String> runtimeType) {
            $.runtimeType = runtimeType;
            return this;
        }

        /**
         * @param runtimeType The runtime that the monitor will use to run jobs.
         * 
         * @return builder
         * 
         */
        public Builder runtimeType(String runtimeType) {
            return runtimeType(Output.of(runtimeType));
        }

        /**
         * @param runtimeTypeVersion The specific version of the runtime type selected.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(@Nullable Output<String> runtimeTypeVersion) {
            $.runtimeTypeVersion = runtimeTypeVersion;
            return this;
        }

        /**
         * @param runtimeTypeVersion The specific version of the runtime type selected.
         * 
         * @return builder
         * 
         */
        public Builder runtimeTypeVersion(String runtimeTypeVersion) {
            return runtimeTypeVersion(Output.of(runtimeTypeVersion));
        }

        /**
         * @param script The script that the monitor runs.
         * 
         * @return builder
         * 
         */
        public Builder script(@Nullable Output<String> script) {
            $.script = script;
            return this;
        }

        /**
         * @param script The script that the monitor runs.
         * 
         * @return builder
         * 
         */
        public Builder script(String script) {
            return script(Output.of(script));
        }

        /**
         * @param scriptLanguage The programing language that should execute the script.
         * 
         * @return builder
         * 
         */
        public Builder scriptLanguage(@Nullable Output<String> scriptLanguage) {
            $.scriptLanguage = scriptLanguage;
            return this;
        }

        /**
         * @param scriptLanguage The programing language that should execute the script.
         * 
         * @return builder
         * 
         */
        public Builder scriptLanguage(String scriptLanguage) {
            return scriptLanguage(Output.of(scriptLanguage));
        }

        /**
         * @param status The run state of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder status(Output<String> status) {
            $.status = status;
            return this;
        }

        /**
         * @param status The run state of the monitor.
         * 
         * @return builder
         * 
         */
        public Builder status(String status) {
            return status(Output.of(status));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<List<ScriptMonitorTagArgs>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(List<ScriptMonitorTagArgs> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param tags The tags that will be associated with the monitor. See Nested tag blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder tags(ScriptMonitorTagArgs... tags) {
            return tags(List.of(tags));
        }

        /**
         * @param type The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
         * 
         * @return builder
         * 
         */
        public Builder type(Output<String> type) {
            $.type = type;
            return this;
        }

        /**
         * @param type The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
         * 
         * @return builder
         * 
         */
        public Builder type(String type) {
            return type(Output.of(type));
        }

        public ScriptMonitorArgs build() {
            $.period = Objects.requireNonNull($.period, "expected parameter 'period' to be non-null");
            $.status = Objects.requireNonNull($.status, "expected parameter 'status' to be non-null");
            $.type = Objects.requireNonNull($.type, "expected parameter 'type' to be non-null");
            return $;
        }
    }

}
