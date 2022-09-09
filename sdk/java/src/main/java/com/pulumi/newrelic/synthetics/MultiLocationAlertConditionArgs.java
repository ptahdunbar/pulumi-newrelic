// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionCriticalArgs;
import com.pulumi.newrelic.synthetics.inputs.MultiLocationAlertConditionWarningArgs;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MultiLocationAlertConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final MultiLocationAlertConditionArgs Empty = new MultiLocationAlertConditionArgs();

    /**
     * A condition term with the priority set to critical.
     * 
     */
    @Import(name="critical", required=true)
    private Output<MultiLocationAlertConditionCriticalArgs> critical;

    /**
     * @return A condition term with the priority set to critical.
     * 
     */
    public Output<MultiLocationAlertConditionCriticalArgs> critical() {
        return this.critical;
    }

    /**
     * Set whether to enable the alert condition.  Defaults to true.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return Set whether to enable the alert condition.  Defaults to true.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    /**
     * The Monitor GUID&#39;s of the Synthetics monitors to alert on.
     * 
     */
    @Import(name="entities", required=true)
    private Output<List<String>> entities;

    /**
     * @return The Monitor GUID&#39;s of the Synthetics monitors to alert on.
     * 
     */
    public Output<List<String>> entities() {
        return this.entities;
    }

    /**
     * The title of the condition.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of the condition.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * The ID of the policy where this condition will be used.
     * 
     */
    @Import(name="policyId", required=true)
    private Output<Integer> policyId;

    /**
     * @return The ID of the policy where this condition will be used.
     * 
     */
    public Output<Integer> policyId() {
        return this.policyId;
    }

    /**
     * Runbook URL to display in notifications.
     * 
     */
    @Import(name="runbookUrl")
    private @Nullable Output<String> runbookUrl;

    /**
     * @return Runbook URL to display in notifications.
     * 
     */
    public Optional<Output<String>> runbookUrl() {
        return Optional.ofNullable(this.runbookUrl);
    }

    /**
     * The maximum number of seconds a violation can remain open before being closed by the system. Must be one of: 0, 3600, 7200, 14400, 28800, 43200, 86400.
     * 
     */
    @Import(name="violationTimeLimitSeconds", required=true)
    private Output<Integer> violationTimeLimitSeconds;

    /**
     * @return The maximum number of seconds a violation can remain open before being closed by the system. Must be one of: 0, 3600, 7200, 14400, 28800, 43200, 86400.
     * 
     */
    public Output<Integer> violationTimeLimitSeconds() {
        return this.violationTimeLimitSeconds;
    }

    /**
     * A condition term with the priority set to warning.
     * 
     */
    @Import(name="warning")
    private @Nullable Output<MultiLocationAlertConditionWarningArgs> warning;

    /**
     * @return A condition term with the priority set to warning.
     * 
     */
    public Optional<Output<MultiLocationAlertConditionWarningArgs>> warning() {
        return Optional.ofNullable(this.warning);
    }

    private MultiLocationAlertConditionArgs() {}

    private MultiLocationAlertConditionArgs(MultiLocationAlertConditionArgs $) {
        this.critical = $.critical;
        this.enabled = $.enabled;
        this.entities = $.entities;
        this.name = $.name;
        this.policyId = $.policyId;
        this.runbookUrl = $.runbookUrl;
        this.violationTimeLimitSeconds = $.violationTimeLimitSeconds;
        this.warning = $.warning;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MultiLocationAlertConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MultiLocationAlertConditionArgs $;

        public Builder() {
            $ = new MultiLocationAlertConditionArgs();
        }

        public Builder(MultiLocationAlertConditionArgs defaults) {
            $ = new MultiLocationAlertConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param critical A condition term with the priority set to critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(Output<MultiLocationAlertConditionCriticalArgs> critical) {
            $.critical = critical;
            return this;
        }

        /**
         * @param critical A condition term with the priority set to critical.
         * 
         * @return builder
         * 
         */
        public Builder critical(MultiLocationAlertConditionCriticalArgs critical) {
            return critical(Output.of(critical));
        }

        /**
         * @param enabled Set whether to enable the alert condition.  Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled Set whether to enable the alert condition.  Defaults to true.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        /**
         * @param entities The Monitor GUID&#39;s of the Synthetics monitors to alert on.
         * 
         * @return builder
         * 
         */
        public Builder entities(Output<List<String>> entities) {
            $.entities = entities;
            return this;
        }

        /**
         * @param entities The Monitor GUID&#39;s of the Synthetics monitors to alert on.
         * 
         * @return builder
         * 
         */
        public Builder entities(List<String> entities) {
            return entities(Output.of(entities));
        }

        /**
         * @param entities The Monitor GUID&#39;s of the Synthetics monitors to alert on.
         * 
         * @return builder
         * 
         */
        public Builder entities(String... entities) {
            return entities(List.of(entities));
        }

        /**
         * @param name The title of the condition.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of the condition.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param policyId The ID of the policy where this condition will be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Output<Integer> policyId) {
            $.policyId = policyId;
            return this;
        }

        /**
         * @param policyId The ID of the policy where this condition will be used.
         * 
         * @return builder
         * 
         */
        public Builder policyId(Integer policyId) {
            return policyId(Output.of(policyId));
        }

        /**
         * @param runbookUrl Runbook URL to display in notifications.
         * 
         * @return builder
         * 
         */
        public Builder runbookUrl(@Nullable Output<String> runbookUrl) {
            $.runbookUrl = runbookUrl;
            return this;
        }

        /**
         * @param runbookUrl Runbook URL to display in notifications.
         * 
         * @return builder
         * 
         */
        public Builder runbookUrl(String runbookUrl) {
            return runbookUrl(Output.of(runbookUrl));
        }

        /**
         * @param violationTimeLimitSeconds The maximum number of seconds a violation can remain open before being closed by the system. Must be one of: 0, 3600, 7200, 14400, 28800, 43200, 86400.
         * 
         * @return builder
         * 
         */
        public Builder violationTimeLimitSeconds(Output<Integer> violationTimeLimitSeconds) {
            $.violationTimeLimitSeconds = violationTimeLimitSeconds;
            return this;
        }

        /**
         * @param violationTimeLimitSeconds The maximum number of seconds a violation can remain open before being closed by the system. Must be one of: 0, 3600, 7200, 14400, 28800, 43200, 86400.
         * 
         * @return builder
         * 
         */
        public Builder violationTimeLimitSeconds(Integer violationTimeLimitSeconds) {
            return violationTimeLimitSeconds(Output.of(violationTimeLimitSeconds));
        }

        /**
         * @param warning A condition term with the priority set to warning.
         * 
         * @return builder
         * 
         */
        public Builder warning(@Nullable Output<MultiLocationAlertConditionWarningArgs> warning) {
            $.warning = warning;
            return this;
        }

        /**
         * @param warning A condition term with the priority set to warning.
         * 
         * @return builder
         * 
         */
        public Builder warning(MultiLocationAlertConditionWarningArgs warning) {
            return warning(Output.of(warning));
        }

        public MultiLocationAlertConditionArgs build() {
            $.critical = Objects.requireNonNull($.critical, "expected parameter 'critical' to be non-null");
            $.entities = Objects.requireNonNull($.entities, "expected parameter 'entities' to be non-null");
            $.policyId = Objects.requireNonNull($.policyId, "expected parameter 'policyId' to be non-null");
            $.violationTimeLimitSeconds = Objects.requireNonNull($.violationTimeLimitSeconds, "expected parameter 'violationTimeLimitSeconds' to be non-null");
            return $;
        }
    }

}
