// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.WorkflowArgs;
import com.pulumi.newrelic.inputs.WorkflowState;
import com.pulumi.newrelic.outputs.WorkflowDestination;
import com.pulumi.newrelic.outputs.WorkflowEnrichments;
import com.pulumi.newrelic.outputs.WorkflowIssuesFilter;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic workflows.
 * 
 * ## Example Usage
 * 
 * ##### Workflow
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var foo = new Workflow(&#34;foo&#34;, WorkflowArgs.builder()        
 *             .mutingRulesHandling(&#34;NOTIFY_ALL_ISSUES&#34;)
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name(&#34;filter-name&#34;)
 *                 .type(&#34;FILTER&#34;)
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute(&#34;accumulations.tag.team&#34;)
 *                     .operator(&#34;EXACTLY_MATCHES&#34;)
 *                     .values(&#34;growth&#34;)
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(newrelic_notification_channel.some_channel().id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Policy-Based Workflow Example
 * 
 * This scenario describes one of most common ways of using workflows by defining a set of policies the workflow handles
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.AlertPolicy;
 * import com.pulumi.newrelic.NotificationDestination;
 * import com.pulumi.newrelic.NotificationDestinationArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationPropertyArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationAuthBasicArgs;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var my_policy = new AlertPolicy(&#34;my-policy&#34;);
 * 
 *         var webhook_destination = new NotificationDestination(&#34;webhook-destination&#34;, NotificationDestinationArgs.builder()        
 *             .type(&#34;WEBHOOK&#34;)
 *             .properties(NotificationDestinationPropertyArgs.builder()
 *                 .key(&#34;url&#34;)
 *                 .value(&#34;https://example.com&#34;)
 *                 .build())
 *             .authBasic(NotificationDestinationAuthBasicArgs.builder()
 *                 .user(&#34;username&#34;)
 *                 .password(&#34;password&#34;)
 *                 .build())
 *             .build());
 * 
 *         var webhook_channel = new NotificationChannel(&#34;webhook-channel&#34;, NotificationChannelArgs.builder()        
 *             .type(&#34;WEBHOOK&#34;)
 *             .destinationId(webhook_destination.id())
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;payload&#34;)
 *                 .value(&#34;{}&#34;)
 *                 .label(&#34;Payload Template&#34;)
 *                 .build())
 *             .build());
 * 
 *         var workflow_example = new Workflow(&#34;workflow-example&#34;, WorkflowArgs.builder()        
 *             .mutingRulesHandling(&#34;NOTIFY_ALL_ISSUES&#34;)
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name(&#34;Filter-name&#34;)
 *                 .type(&#34;FILTER&#34;)
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute(&#34;labels.policyIds&#34;)
 *                     .operator(&#34;EXACTLY_MATCHES&#34;)
 *                     .values(my_policy.id())
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(webhook_channel.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### An example of a workflow with enrichments
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowEnrichmentsArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var workflow_example = new Workflow(&#34;workflow-example&#34;, WorkflowArgs.builder()        
 *             .mutingRulesHandling(&#34;NOTIFY_ALL_ISSUES&#34;)
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name(&#34;Filter-name&#34;)
 *                 .type(&#34;FILTER&#34;)
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute(&#34;accumulations.tag.team&#34;)
 *                     .operator(&#34;EXACTLY_MATCHES&#34;)
 *                     .values(&#34;my_team&#34;)
 *                     .build())
 *                 .build())
 *             .enrichments(WorkflowEnrichmentsArgs.builder()
 *                 .nrqls(WorkflowEnrichmentsNrqlArgs.builder()
 *                     .name(&#34;Log Count&#34;)
 *                     .configurations(WorkflowEnrichmentsNrqlConfigurationArgs.builder()
 *                         .query(&#34;SELECT count(*) FROM Log WHERE message like &#39;%error%&#39; since 10 minutes ago&#34;)
 *                         .build())
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(newrelic_notification_channel.webhook-channel().id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### An example of a workflow with notification triggers
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.Workflow;
 * import com.pulumi.newrelic.WorkflowArgs;
 * import com.pulumi.newrelic.inputs.WorkflowIssuesFilterArgs;
 * import com.pulumi.newrelic.inputs.WorkflowDestinationArgs;
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
 *         var workflow_example = new Workflow(&#34;workflow-example&#34;, WorkflowArgs.builder()        
 *             .mutingRulesHandling(&#34;NOTIFY_ALL_ISSUES&#34;)
 *             .issuesFilter(WorkflowIssuesFilterArgs.builder()
 *                 .name(&#34;Filter-name&#34;)
 *                 .type(&#34;FILTER&#34;)
 *                 .predicates(WorkflowIssuesFilterPredicateArgs.builder()
 *                     .attribute(&#34;accumulations.tag.team&#34;)
 *                     .operator(&#34;EXACTLY_MATCHES&#34;)
 *                     .values(&#34;my_team&#34;)
 *                     .build())
 *                 .build())
 *             .destinations(WorkflowDestinationArgs.builder()
 *                 .channelId(newrelic_notification_channel.webhook-channel().id())
 *                 .notificationTriggers(&#34;ACTIVATED&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Additional Information
 * 
 * More details about the workflows can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/applied-intelligence/incident-workflows/incident-workflows/).
 * 
 * ## v3.3 changes
 * 
 * In version v3.3 we renamed the following arguments:
 * 
 * - `workflow_enabled` changed to `enabled`.
 * - `destination_configuration` changed to `destination`.
 * - `predicates` changed to `predicate`.
 * - Enrichment&#39;s `configurations` changed to `configuration`.
 * 
 * ## Import
 * 
 * Workflows can be imported using the `id`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/workflow:Workflow foo &lt;id&gt;
 * ```
 * 
 *  You can find the workflow ID from the workflow table by clicking on ... at the end of the row and choosing `Copy workflow id to clipboard`.
 * 
 */
@ResourceType(type="newrelic:index/workflow:Workflow")
public class Workflow extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account in which the workflow is created. Defaults to the account defined in the provider section.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Notification configuration. See Nested destination blocks below for details.
     * 
     */
    @Export(name="destinations", type=List.class, parameters={WorkflowDestination.class})
    private Output<List<WorkflowDestination>> destinations;

    /**
     * @return Notification configuration. See Nested destination blocks below for details.
     * 
     */
    public Output<List<WorkflowDestination>> destinations() {
        return this.destinations;
    }
    /**
     * **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
     * these two are different flags, but they are functionally identical. Defaults to true.
     * 
     * @deprecated
     * Please use &#39;enabled&#39; instead
     * 
     */
    @Deprecated /* Please use 'enabled' instead */
    @Export(name="destinationsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> destinationsEnabled;

    /**
     * @return **DEPRECATED** Whether destinations are enabled. Please use `enabled` instead:
     * these two are different flags, but they are functionally identical. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> destinationsEnabled() {
        return Codegen.optional(this.destinationsEnabled);
    }
    /**
     * Whether workflow is enabled. Defaults to true.
     * 
     */
    @Export(name="enabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return Whether workflow is enabled. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    @Export(name="enrichments", type=WorkflowEnrichments.class, parameters={})
    private Output</* @Nullable */ WorkflowEnrichments> enrichments;

    /**
     * @return Workflow&#39;s enrichments. See Nested enrichments blocks below for details.
     * 
     */
    public Output<Optional<WorkflowEnrichments>> enrichments() {
        return Codegen.optional(this.enrichments);
    }
    /**
     * Whether enrichments are enabled. Defaults to true.
     * 
     */
    @Export(name="enrichmentsEnabled", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enrichmentsEnabled;

    /**
     * @return Whether enrichments are enabled. Defaults to true.
     * 
     */
    public Output<Optional<Boolean>> enrichmentsEnabled() {
        return Codegen.optional(this.enrichmentsEnabled);
    }
    /**
     * A filter used to identify issues handled by this workflow. See Nested issues_filter blocks below for details.
     * 
     */
    @Export(name="issuesFilter", type=WorkflowIssuesFilter.class, parameters={})
    private Output<WorkflowIssuesFilter> issuesFilter;

    /**
     * @return A filter used to identify issues handled by this workflow. See Nested issues_filter blocks below for details.
     * 
     */
    public Output<WorkflowIssuesFilter> issuesFilter() {
        return this.issuesFilter;
    }
    /**
     * The last time notification was sent for this workflow.
     * 
     */
    @Export(name="lastRun", type=String.class, parameters={})
    private Output<String> lastRun;

    /**
     * @return The last time notification was sent for this workflow.
     * 
     */
    public Output<String> lastRun() {
        return this.lastRun;
    }
    /**
     * How to handle muted issues. See Muting Rules below for details.
     * 
     */
    @Export(name="mutingRulesHandling", type=String.class, parameters={})
    private Output<String> mutingRulesHandling;

    /**
     * @return How to handle muted issues. See Muting Rules below for details.
     * 
     */
    public Output<String> mutingRulesHandling() {
        return this.mutingRulesHandling;
    }
    /**
     * The name of the workflow.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the workflow.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The id of the workflow.
     * 
     */
    @Export(name="workflowId", type=String.class, parameters={})
    private Output<String> workflowId;

    /**
     * @return The id of the workflow.
     * 
     */
    public Output<String> workflowId() {
        return this.workflowId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Workflow(String name) {
        this(name, WorkflowArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Workflow(String name, WorkflowArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Workflow(String name, WorkflowArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/workflow:Workflow", name, args == null ? WorkflowArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Workflow(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/workflow:Workflow", name, state, makeResourceOptions(options, id));
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
    public static Workflow get(String name, Output<String> id, @Nullable WorkflowState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Workflow(name, id, state, options);
    }
}
