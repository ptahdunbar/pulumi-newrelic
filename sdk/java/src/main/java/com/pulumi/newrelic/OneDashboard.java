// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.OneDashboardArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.OneDashboardState;
import com.pulumi.newrelic.outputs.OneDashboardPage;
import com.pulumi.newrelic.outputs.OneDashboardVariable;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Create A New Relic One Dashboard
 * 
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.OneDashboard;
 * import com.pulumi.newrelic.OneDashboardArgs;
 * import com.pulumi.newrelic.inputs.OneDashboardPageArgs;
 * import com.pulumi.newrelic.inputs.OneDashboardVariableArgs;
 * import com.pulumi.newrelic.inputs.OneDashboardVariableNrqlQueryArgs;
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
 *         var exampledash = new OneDashboard(&#34;exampledash&#34;, OneDashboardArgs.builder()        
 *             .pages(OneDashboardPageArgs.builder()
 *                 .name(&#34;New Relic Terraform Example&#34;)
 *                 .widgetBars(                
 *                     OneDashboardPageWidgetBarArgs.builder()
 *                         .column(7)
 *                         .height(3)
 *                         .linkedEntityGuids(&#34;abc123&#34;)
 *                         .nrqlQuery(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .row(1)
 *                         .title(&#34;Average transaction duration, by application&#34;)
 *                         .width(6)
 *                         .build(),
 *                     OneDashboardPageWidgetBarArgs.builder()
 *                         .colors(OneDashboardPageWidgetBarColorArgs.builder()
 *                             .color(&#34;#722727&#34;)
 *                             .seriesOverrides(                            
 *                                 OneDashboardPageWidgetBarColorSeriesOverrideArgs.builder()
 *                                     .color(&#34;#722322&#34;)
 *                                     .seriesName(&#34;Node&#34;)
 *                                     .build(),
 *                                 OneDashboardPageWidgetBarColorSeriesOverrideArgs.builder()
 *                                     .color(&#34;#236f70&#34;)
 *                                     .seriesName(&#34;Java&#34;)
 *                                     .build())
 *                             .build())
 *                         .column(1)
 *                         .filterCurrentDashboard(true)
 *                         .height(3)
 *                         .nrqlQuery(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .row(4)
 *                         .title(&#34;Average transaction duration, by application&#34;)
 *                         .width(6)
 *                         .build())
 *                 .widgetBillboards(OneDashboardPageWidgetBillboardArgs.builder()
 *                     .column(1)
 *                     .height(3)
 *                     .nrqlQuery(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                     .row(1)
 *                     .title(&#34;Requests per minute&#34;)
 *                     .width(6)
 *                     .build())
 *                 .widgetLines(                
 *                     OneDashboardPageWidgetLineArgs.builder()
 *                         .column(7)
 *                         .height(3)
 *                         .ignoreTimeRange(false)
 *                         .legendEnabled(true)
 *                         .nrqlQuery(                        
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference),
 *                             %!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .row(4)
 *                         .title(&#34;Average transaction duration and the request per minute, by application&#34;)
 *                         .units(OneDashboardPageWidgetLineUnitArgs.builder()
 *                             .seriesOverrides(OneDashboardPageWidgetLineUnitSeriesOverrideArgs.builder()
 *                                 .seriesName(&#34;max duration&#34;)
 *                                 .unit(&#34;ms&#34;)
 *                                 .build())
 *                             .unit(&#34;ms&#34;)
 *                             .build())
 *                         .width(6)
 *                         .yAxisLeftMax(1)
 *                         .yAxisLeftMin(0)
 *                         .build(),
 *                     OneDashboardPageWidgetLineArgs.builder()
 *                         .column(5)
 *                         .facetShowOtherSeries(false)
 *                         .height(3)
 *                         .ignoreTimeRange(false)
 *                         .legendEnabled(true)
 *                         .nrqlQuery(%!v(PANIC=Format method: runtime error: invalid memory address or nil pointer dereference))
 *                         .nullValues(OneDashboardPageWidgetLineNullValueArgs.builder()
 *                             .nullValue(&#34;default&#34;)
 *                             .seriesOverrides(                            
 *                                 OneDashboardPageWidgetLineNullValueSeriesOverrideArgs.builder()
 *                                     .nullValue(&#34;remove&#34;)
 *                                     .seriesName(&#34;Avg Cpu User Percent&#34;)
 *                                     .build(),
 *                                 OneDashboardPageWidgetLineNullValueSeriesOverrideArgs.builder()
 *                                     .nullValue(&#34;zero&#34;)
 *                                     .seriesName(&#34;Avg Cpu Idle Percent&#34;)
 *                                     .build(),
 *                                 OneDashboardPageWidgetLineNullValueSeriesOverrideArgs.builder()
 *                                     .nullValue(&#34;default&#34;)
 *                                     .seriesName(&#34;Avg Cpu IO Wait Percent&#34;)
 *                                     .build(),
 *                                 OneDashboardPageWidgetLineNullValueSeriesOverrideArgs.builder()
 *                                     .nullValue(&#34;preserve&#34;)
 *                                     .seriesName(&#34;Avg Cpu System Percent&#34;)
 *                                     .build())
 *                             .build())
 *                         .row(1)
 *                         .title(&#34;Overall CPU % Statistics&#34;)
 *                         .width(4)
 *                         .yAxisLeftMax(0)
 *                         .yAxisLeftMin(0)
 *                         .build())
 *                 .widgetMarkdowns(OneDashboardPageWidgetMarkdownArgs.builder()
 *                     .column(1)
 *                     .height(3)
 *                     .row(7)
 *                     .text(&#34;&#34;&#34;
 * ### Helpful Links
 * 
 * * [New Relic One](https://one.newrelic.com)
 * * [Developer Portal](https://developer.newrelic.com)
 *                     &#34;&#34;&#34;)
 *                     .title(&#34;Dashboard Note&#34;)
 *                     .width(12)
 *                     .build())
 *                 .build())
 *             .permissions(&#34;public_read_only&#34;)
 *             .variables(OneDashboardVariableArgs.builder()
 *                 .defaultValues(&#34;value&#34;)
 *                 .isMultiSelection(true)
 *                 .items(OneDashboardVariableItemArgs.builder()
 *                     .title(&#34;item&#34;)
 *                     .value(&#34;ITEM&#34;)
 *                     .build())
 *                 .name(&#34;variable&#34;)
 *                 .nrqlQuery(OneDashboardVariableNrqlQueryArgs.builder()
 *                     .accountIds(12345)
 *                     .query(&#34;FROM Transaction SELECT average(duration) FACET appName&#34;)
 *                     .build())
 *                 .replacementStrategy(&#34;default&#34;)
 *                 .title(&#34;title&#34;)
 *                 .type(&#34;nrql&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * See additional examples.
 * ## Additional Examples
 * 
 * ## Import
 * 
 * New Relic dashboards can be imported using their GUID, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:index/oneDashboard:OneDashboard my_dashboard &lt;dashboard GUID&gt;
 * ```
 * 
 *  In addition you can use the [New Relic CLI](https://github.com/newrelic/newrelic-cli#readme) to convert existing dashboards to HCL. [Copy your dashboards as JSON using the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/), save it as a file (for example `terraform.json`), and use the following command to convert it to HCL`cat terraform.json | newrelic utils terraform dashboard --label my_dashboard_resource`.
 * 
 */
@ResourceType(type="newrelic:index/oneDashboard:OneDashboard")
public class OneDashboard extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Brief text describing the dashboard.
     * 
     */
    @Export(name="description", type=String.class, parameters={})
    private Output</* @Nullable */ String> description;

    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    @Export(name="guid", type=String.class, parameters={})
    private Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The title of the dashboard.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    @Export(name="pages", type=List.class, parameters={OneDashboardPage.class})
    private Output<List<OneDashboardPage>> pages;

    /**
     * @return A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    public Output<List<OneDashboardPage>> pages() {
        return this.pages;
    }
    /**
     * The URL for viewing the dashboard.
     * 
     */
    @Export(name="permalink", type=String.class, parameters={})
    private Output<String> permalink;

    /**
     * @return The URL for viewing the dashboard.
     * 
     */
    public Output<String> permalink() {
        return this.permalink;
    }
    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    @Export(name="permissions", type=String.class, parameters={})
    private Output</* @Nullable */ String> permissions;

    /**
     * @return Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`.  Defaults to `public_read_only`.
     * 
     */
    public Output<Optional<String>> permissions() {
        return Codegen.optional(this.permissions);
    }
    /**
     * A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
     * 
     */
    @Export(name="variables", type=List.class, parameters={OneDashboardVariable.class})
    private Output</* @Nullable */ List<OneDashboardVariable>> variables;

    /**
     * @return A nested block that describes a dashboard-local variable. See Nested variable blocks below for details.
     * 
     */
    public Output<Optional<List<OneDashboardVariable>>> variables() {
        return Codegen.optional(this.variables);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OneDashboard(String name) {
        this(name, OneDashboardArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OneDashboard(String name, OneDashboardArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OneDashboard(String name, OneDashboardArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboard:OneDashboard", name, args == null ? OneDashboardArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OneDashboard(String name, Output<String> id, @Nullable OneDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboard:OneDashboard", name, state, makeResourceOptions(options, id));
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
    public static OneDashboard get(String name, Output<String> id, @Nullable OneDashboardState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OneDashboard(name, id, state, options);
    }
}
