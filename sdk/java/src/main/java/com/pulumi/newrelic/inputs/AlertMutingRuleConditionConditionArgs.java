// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;


public final class AlertMutingRuleConditionConditionArgs extends com.pulumi.resources.ResourceArgs {

    public static final AlertMutingRuleConditionConditionArgs Empty = new AlertMutingRuleConditionConditionArgs();

    /**
     * The attribute on an incident. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
     * 
     */
    @Import(name="attribute", required=true)
    private Output<String> attribute;

    /**
     * @return The attribute on an incident. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
     * 
     */
    public Output<String> attribute() {
        return this.attribute;
    }

    /**
     * The operator used to compare the attribute&#39;s value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
     * 
     */
    @Import(name="operator", required=true)
    private Output<String> operator;

    /**
     * @return The operator used to compare the attribute&#39;s value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
     * 
     */
    public Output<String> operator() {
        return this.operator;
    }

    /**
     * The value(s) to compare against the attribute&#39;s value.
     * 
     */
    @Import(name="values", required=true)
    private Output<List<String>> values;

    /**
     * @return The value(s) to compare against the attribute&#39;s value.
     * 
     */
    public Output<List<String>> values() {
        return this.values;
    }

    private AlertMutingRuleConditionConditionArgs() {}

    private AlertMutingRuleConditionConditionArgs(AlertMutingRuleConditionConditionArgs $) {
        this.attribute = $.attribute;
        this.operator = $.operator;
        this.values = $.values;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AlertMutingRuleConditionConditionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AlertMutingRuleConditionConditionArgs $;

        public Builder() {
            $ = new AlertMutingRuleConditionConditionArgs();
        }

        public Builder(AlertMutingRuleConditionConditionArgs defaults) {
            $ = new AlertMutingRuleConditionConditionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attribute The attribute on an incident. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
         * 
         * @return builder
         * 
         */
        public Builder attribute(Output<String> attribute) {
            $.attribute = attribute;
            return this;
        }

        /**
         * @param attribute The attribute on an incident. Valid values are   `accountId`, `conditionId`, `conditionName`, `conditionRunbookUrl`, `conditionType`, `entity.guid`, `nrqlEventType`, `nrqlQuery`, `policyId`, `policyName`, `product`, `tags.&lt;NAME&gt;`, `targetId`, `targetName`
         * 
         * @return builder
         * 
         */
        public Builder attribute(String attribute) {
            return attribute(Output.of(attribute));
        }

        /**
         * @param operator The operator used to compare the attribute&#39;s value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder operator(Output<String> operator) {
            $.operator = operator;
            return this;
        }

        /**
         * @param operator The operator used to compare the attribute&#39;s value with the supplied value(s). Valid values are `ANY`, `CONTAINS`, `ENDS_WITH`, `EQUALS`, `IN`, `IS_BLANK`, `IS_NOT_BLANK`, `NOT_CONTAINS`, `NOT_ENDS_WITH`, `NOT_EQUALS`, `NOT_IN`, `NOT_STARTS_WITH`, `STARTS_WITH`
         * 
         * @return builder
         * 
         */
        public Builder operator(String operator) {
            return operator(Output.of(operator));
        }

        /**
         * @param values The value(s) to compare against the attribute&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder values(Output<List<String>> values) {
            $.values = values;
            return this;
        }

        /**
         * @param values The value(s) to compare against the attribute&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder values(List<String> values) {
            return values(Output.of(values));
        }

        /**
         * @param values The value(s) to compare against the attribute&#39;s value.
         * 
         * @return builder
         * 
         */
        public Builder values(String... values) {
            return values(List.of(values));
        }

        public AlertMutingRuleConditionConditionArgs build() {
            $.attribute = Objects.requireNonNull($.attribute, "expected parameter 'attribute' to be non-null");
            $.operator = Objects.requireNonNull($.operator, "expected parameter 'operator' to be non-null");
            $.values = Objects.requireNonNull($.values, "expected parameter 'values' to be non-null");
            return $;
        }
    }

}
