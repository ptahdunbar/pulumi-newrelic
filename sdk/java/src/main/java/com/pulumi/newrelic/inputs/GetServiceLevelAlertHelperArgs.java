// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Double;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetServiceLevelAlertHelperArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetServiceLevelAlertHelperArgs Empty = new GetServiceLevelAlertHelperArgs();

    /**
     * The type of alert we want to set. Valid values are:
     * 
     */
    @Import(name="alertType", required=true)
    private Output<String> alertType;

    /**
     * @return The type of alert we want to set. Valid values are:
     * 
     */
    public Output<String> alertType() {
        return this.alertType;
    }

    /**
     * Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
     * 
     */
    @Import(name="customEvaluationPeriod")
    private @Nullable Output<Integer> customEvaluationPeriod;

    /**
     * @return Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
     * 
     */
    public Optional<Output<Integer>> customEvaluationPeriod() {
        return Optional.ofNullable(this.customEvaluationPeriod);
    }

    /**
     * How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
     * 
     */
    @Import(name="customToleratedBudgetConsumption")
    private @Nullable Output<Double> customToleratedBudgetConsumption;

    /**
     * @return How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
     * 
     */
    public Optional<Output<Double>> customToleratedBudgetConsumption() {
        return Optional.ofNullable(this.customToleratedBudgetConsumption);
    }

    /**
     * The guid of the sli we want to set the alert on.
     * 
     */
    @Import(name="sliGuid", required=true)
    private Output<String> sliGuid;

    /**
     * @return The guid of the sli we want to set the alert on.
     * 
     */
    public Output<String> sliGuid() {
        return this.sliGuid;
    }

    /**
     * The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
     * 
     */
    @Import(name="sloPeriod", required=true)
    private Output<Integer> sloPeriod;

    /**
     * @return The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
     * 
     */
    public Output<Integer> sloPeriod() {
        return this.sloPeriod;
    }

    /**
     * The target of the Service Level Objective, valid values between `0` and `100`.
     * 
     */
    @Import(name="sloTarget", required=true)
    private Output<Double> sloTarget;

    /**
     * @return The target of the Service Level Objective, valid values between `0` and `100`.
     * 
     */
    public Output<Double> sloTarget() {
        return this.sloTarget;
    }

    private GetServiceLevelAlertHelperArgs() {}

    private GetServiceLevelAlertHelperArgs(GetServiceLevelAlertHelperArgs $) {
        this.alertType = $.alertType;
        this.customEvaluationPeriod = $.customEvaluationPeriod;
        this.customToleratedBudgetConsumption = $.customToleratedBudgetConsumption;
        this.sliGuid = $.sliGuid;
        this.sloPeriod = $.sloPeriod;
        this.sloTarget = $.sloTarget;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetServiceLevelAlertHelperArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetServiceLevelAlertHelperArgs $;

        public Builder() {
            $ = new GetServiceLevelAlertHelperArgs();
        }

        public Builder(GetServiceLevelAlertHelperArgs defaults) {
            $ = new GetServiceLevelAlertHelperArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param alertType The type of alert we want to set. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder alertType(Output<String> alertType) {
            $.alertType = alertType;
            return this;
        }

        /**
         * @param alertType The type of alert we want to set. Valid values are:
         * 
         * @return builder
         * 
         */
        public Builder alertType(String alertType) {
            return alertType(Output.of(alertType));
        }

        /**
         * @param customEvaluationPeriod Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customEvaluationPeriod(@Nullable Output<Integer> customEvaluationPeriod) {
            $.customEvaluationPeriod = customEvaluationPeriod;
            return this;
        }

        /**
         * @param customEvaluationPeriod Aggregation window taken into consideration in minutes. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customEvaluationPeriod(Integer customEvaluationPeriod) {
            return customEvaluationPeriod(Output.of(customEvaluationPeriod));
        }

        /**
         * @param customToleratedBudgetConsumption How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customToleratedBudgetConsumption(@Nullable Output<Double> customToleratedBudgetConsumption) {
            $.customToleratedBudgetConsumption = customToleratedBudgetConsumption;
            return this;
        }

        /**
         * @param customToleratedBudgetConsumption How much budget you tolerate to consume during the custom evaluation period, valid values between `0` and `100`. Mandatory if `alert_type` is `custom`.
         * 
         * @return builder
         * 
         */
        public Builder customToleratedBudgetConsumption(Double customToleratedBudgetConsumption) {
            return customToleratedBudgetConsumption(Output.of(customToleratedBudgetConsumption));
        }

        /**
         * @param sliGuid The guid of the sli we want to set the alert on.
         * 
         * @return builder
         * 
         */
        public Builder sliGuid(Output<String> sliGuid) {
            $.sliGuid = sliGuid;
            return this;
        }

        /**
         * @param sliGuid The guid of the sli we want to set the alert on.
         * 
         * @return builder
         * 
         */
        public Builder sliGuid(String sliGuid) {
            return sliGuid(Output.of(sliGuid));
        }

        /**
         * @param sloPeriod The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder sloPeriod(Output<Integer> sloPeriod) {
            $.sloPeriod = sloPeriod;
            return this;
        }

        /**
         * @param sloPeriod The time window of the Service Level Objective in days. Valid values are `1`, `7` and `28`.
         * 
         * @return builder
         * 
         */
        public Builder sloPeriod(Integer sloPeriod) {
            return sloPeriod(Output.of(sloPeriod));
        }

        /**
         * @param sloTarget The target of the Service Level Objective, valid values between `0` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder sloTarget(Output<Double> sloTarget) {
            $.sloTarget = sloTarget;
            return this;
        }

        /**
         * @param sloTarget The target of the Service Level Objective, valid values between `0` and `100`.
         * 
         * @return builder
         * 
         */
        public Builder sloTarget(Double sloTarget) {
            return sloTarget(Output.of(sloTarget));
        }

        public GetServiceLevelAlertHelperArgs build() {
            $.alertType = Objects.requireNonNull($.alertType, "expected parameter 'alertType' to be non-null");
            $.sliGuid = Objects.requireNonNull($.sliGuid, "expected parameter 'sliGuid' to be non-null");
            $.sloPeriod = Objects.requireNonNull($.sloPeriod, "expected parameter 'sloPeriod' to be non-null");
            $.sloTarget = Objects.requireNonNull($.sloTarget, "expected parameter 'sloTarget' to be non-null");
            return $;
        }
    }

}
