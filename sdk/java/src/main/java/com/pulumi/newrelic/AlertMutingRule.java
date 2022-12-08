// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.AlertMutingRuleArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.AlertMutingRuleState;
import com.pulumi.newrelic.outputs.AlertMutingRuleCondition;
import com.pulumi.newrelic.outputs.AlertMutingRuleSchedule;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertMutingRule;
 * import com.pulumi.newrelic.AlertMutingRuleArgs;
 * import com.pulumi.newrelic.inputs.AlertMutingRuleConditionArgs;
 * import com.pulumi.newrelic.inputs.AlertMutingRuleScheduleArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new AlertMutingRule(&#34;foo&#34;, AlertMutingRuleArgs.builder()        
 *             .condition(AlertMutingRuleConditionArgs.builder()
 *                 .conditions(                
 *                     AlertMutingRuleConditionConditionArgs.builder()
 *                         .attribute(&#34;product&#34;)
 *                         .operator(&#34;EQUALS&#34;)
 *                         .values(&#34;APM&#34;)
 *                         .build(),
 *                     AlertMutingRuleConditionConditionArgs.builder()
 *                         .attribute(&#34;targetId&#34;)
 *                         .operator(&#34;EQUALS&#34;)
 *                         .values(&#34;Muted&#34;)
 *                         .build())
 *                 .operator(&#34;AND&#34;)
 *                 .build())
 *             .description(&#34;muting rule test.&#34;)
 *             .enabled(true)
 *             .schedule(AlertMutingRuleScheduleArgs.builder()
 *                 .endTime(&#34;2021-01-28T16:30:00&#34;)
 *                 .repeat(&#34;WEEKLY&#34;)
 *                 .repeatCount(42)
 *                 .startTime(&#34;2021-01-28T15:30:00&#34;)
 *                 .timeZone(&#34;America/Los_Angeles&#34;)
 *                 .weeklyRepeatDays(                
 *                     &#34;MONDAY&#34;,
 *                     &#34;WEDNESDAY&#34;,
 *                     &#34;FRIDAY&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Alert conditions can be imported using a composite ID of `&lt;account_id&gt;:&lt;muting_rule_id&gt;`, e.g.
 * 
 * ```sh
 *  $ pulumi import newrelic:index/alertMutingRule:AlertMutingRule foo 538291:6789035
 * ```
 * 
 */
@ResourceType(type="newrelic:index/alertMutingRule:AlertMutingRule")
public class AlertMutingRule extends com.pulumi.resources.CustomResource {
    /**
     * The account id of the MutingRule.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The account id of the MutingRule.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The condition that defines which incidents to target. See Nested condition blocks below for details.
     * 
     */
    @Export(name="condition", type=AlertMutingRuleCondition.class, parameters={})
    private Output<AlertMutingRuleCondition> condition;

    /**
     * @return The condition that defines which incidents to target. See Nested condition blocks below for details.
     * 
     */
    public Output<AlertMutingRuleCondition> condition() {
        return this.condition;
    }
    /**
     * The description of the MutingRule.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the MutingRule.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Whether the MutingRule is enabled.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output<Boolean> enabled;

    /**
     * @return Whether the MutingRule is enabled.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * The name of the MutingRule.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the MutingRule.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specify a schedule for enabling the MutingRule. See Schedule below for details
     * 
     */
    @Export(name="schedule", type=AlertMutingRuleSchedule.class, parameters={})
    private Output</* @Nullable */ AlertMutingRuleSchedule> schedule;

    /**
     * @return Specify a schedule for enabling the MutingRule. See Schedule below for details
     * 
     */
    public Output<Optional<AlertMutingRuleSchedule>> schedule() {
        return Codegen.optional(this.schedule);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AlertMutingRule(String name) {
        this(name, AlertMutingRuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AlertMutingRule(String name, AlertMutingRuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AlertMutingRule(String name, AlertMutingRuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertMutingRule:AlertMutingRule", name, args == null ? AlertMutingRuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AlertMutingRule(String name, Output<String> id, @Nullable AlertMutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/alertMutingRule:AlertMutingRule", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static AlertMutingRule get(String name, Output<String> id, @Nullable AlertMutingRuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AlertMutingRule(name, id, state, options);
    }
}
