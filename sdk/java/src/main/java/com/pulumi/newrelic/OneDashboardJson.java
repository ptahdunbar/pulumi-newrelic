// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.OneDashboardJsonArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.OneDashboardJsonState;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * ### Create A New Relic One Dashboard From A JSON File
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.OneDashboardJson;
 * import com.pulumi.newrelic.OneDashboardJsonArgs;
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
 *         var foo = new OneDashboardJson(&#34;foo&#34;, OneDashboardJsonArgs.builder()        
 *             .json(Files.readString(Paths.get(&#34;dashboard.json&#34;)))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 */
@ResourceType(type="newrelic:index/oneDashboardJson:OneDashboardJson")
public class OneDashboardJson extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID where you want to create the dashboard.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID where you want to create the dashboard.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * The unique entity identifier of the dashboard in New Relic.
     * 
     */
    @Export(name="guid", type=String.class, parameters={})
    private Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
     * 
     */
    @Export(name="json", type=String.class, parameters={})
    private Output<String> json;

    /**
     * @return The JSON exporet of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
     * 
     */
    public Output<String> json() {
        return this.json;
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
     * The date and time when the dashboard was last updated.
     * 
     */
    @Export(name="updatedAt", type=String.class, parameters={})
    private Output<String> updatedAt;

    /**
     * @return The date and time when the dashboard was last updated.
     * 
     */
    public Output<String> updatedAt() {
        return this.updatedAt;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OneDashboardJson(String name) {
        this(name, OneDashboardJsonArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OneDashboardJson(String name, OneDashboardJsonArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OneDashboardJson(String name, OneDashboardJsonArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboardJson:OneDashboardJson", name, args == null ? OneDashboardJsonArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OneDashboardJson(String name, Output<String> id, @Nullable OneDashboardJsonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/oneDashboardJson:OneDashboardJson", name, state, makeResourceOptions(options, id));
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
    public static OneDashboardJson get(String name, Output<String> id, @Nullable OneDashboardJsonState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OneDashboardJson(name, id, state, options);
    }
}
