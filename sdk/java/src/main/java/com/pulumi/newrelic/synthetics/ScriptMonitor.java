// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.synthetics.ScriptMonitorArgs;
import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorState;
import com.pulumi.newrelic.synthetics.outputs.ScriptMonitorLocationPrivate;
import com.pulumi.newrelic.synthetics.outputs.ScriptMonitorTag;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create update, and delete a Script API or Script Browser Synthetics Monitor in New Relic.
 * 
 * ## Example Usage
 * 
 * ##### Type: `SCRIPT_API`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.ScriptMonitor;
 * import com.pulumi.newrelic.synthetics.ScriptMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
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
 *         var monitor = new ScriptMonitor(&#34;monitor&#34;, ScriptMonitorArgs.builder()        
 *             .locationsPublics(            
 *                 &#34;AP_SOUTH_1&#34;,
 *                 &#34;AP_EAST_1&#34;)
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .runtimeType(&#34;NODE_API&#34;)
 *             .runtimeTypeVersion(&#34;16.10&#34;)
 *             .script(&#34;console.log(&#39;it works!&#39;)&#34;)
 *             .scriptLanguage(&#34;JAVASCRIPT&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(ScriptMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .type(&#34;SCRIPT_API&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ##### Type: `SCRIPT_BROWSER`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.ScriptMonitor;
 * import com.pulumi.newrelic.synthetics.ScriptMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
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
 *         var monitor = new ScriptMonitor(&#34;monitor&#34;, ScriptMonitorArgs.builder()        
 *             .enableScreenshotOnFailureAndScript(false)
 *             .locationsPublics(            
 *                 &#34;AP_SOUTH_1&#34;,
 *                 &#34;AP_EAST_1&#34;)
 *             .period(&#34;EVERY_HOUR&#34;)
 *             .runtimeType(&#34;CHROME_BROWSER&#34;)
 *             .runtimeTypeVersion(&#34;100&#34;)
 *             .script(&#34;$browser.get(&#39;https://one.newrelic.com&#39;)&#34;)
 *             .scriptLanguage(&#34;JAVASCRIPT&#34;)
 *             .status(&#34;ENABLED&#34;)
 *             .tags(ScriptMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .type(&#34;SCRIPT_BROWSER&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * See additional examples.
 * ## Additional Examples
 * 
 * ### Create a monitor with a private location
 * 
 * The below example shows how you can define a private location and attach it to a monitor.
 * 
 * &gt; **NOTE:** It can take up to 10 minutes for a private location to become available.
 * 
 * ##### Type: `SCRIPT_API`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.PrivateLocation;
 * import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
 * import com.pulumi.newrelic.synthetics.ScriptMonitor;
 * import com.pulumi.newrelic.synthetics.ScriptMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorLocationPrivateArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
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
 *         var location = new PrivateLocation(&#34;location&#34;, PrivateLocationArgs.builder()        
 *             .description(&#34;Example private location&#34;)
 *             .verifiedScriptExecution(true)
 *             .build());
 * 
 *         var monitor = new ScriptMonitor(&#34;monitor&#34;, ScriptMonitorArgs.builder()        
 *             .status(&#34;ENABLED&#34;)
 *             .type(&#34;SCRIPT_API&#34;)
 *             .locationPrivates(ScriptMonitorLocationPrivateArgs.builder()
 *                 .guid(location.id())
 *                 .vsePassword(&#34;secret&#34;)
 *                 .build())
 *             .period(&#34;EVERY_6_HOURS&#34;)
 *             .script(&#34;console.log(&#39;terraform integration test updated&#39;)&#34;)
 *             .scriptLanguage(&#34;JAVASCRIPT&#34;)
 *             .runtimeType(&#34;NODE_API&#34;)
 *             .runtimeTypeVersion(&#34;16.10&#34;)
 *             .tags(ScriptMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ##### Type: `SCRIPT_BROWSER`
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.synthetics.PrivateLocation;
 * import com.pulumi.newrelic.synthetics.PrivateLocationArgs;
 * import com.pulumi.newrelic.synthetics.ScriptMonitor;
 * import com.pulumi.newrelic.synthetics.ScriptMonitorArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorLocationPrivateArgs;
 * import com.pulumi.newrelic.synthetics.inputs.ScriptMonitorTagArgs;
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
 *         var location = new PrivateLocation(&#34;location&#34;, PrivateLocationArgs.builder()        
 *             .description(&#34;Test Description&#34;)
 *             .verifiedScriptExecution(true)
 *             .build());
 * 
 *         var monitor = new ScriptMonitor(&#34;monitor&#34;, ScriptMonitorArgs.builder()        
 *             .status(&#34;ENABLED&#34;)
 *             .type(&#34;SCRIPT_BROWSER&#34;)
 *             .period(&#34;EVERY_HOUR&#34;)
 *             .script(&#34;$browser.get(&#39;https://one.newrelic.com&#39;)&#34;)
 *             .enableScreenshotOnFailureAndScript(false)
 *             .locationPrivates(ScriptMonitorLocationPrivateArgs.builder()
 *                 .guid(location.id())
 *                 .vsePassword(&#34;secret&#34;)
 *                 .build())
 *             .runtimeTypeVersion(&#34;100&#34;)
 *             .runtimeType(&#34;CHROME_BROWSER&#34;)
 *             .scriptLanguage(&#34;JAVASCRIPT&#34;)
 *             .tags(ScriptMonitorTagArgs.builder()
 *                 .key(&#34;some_key&#34;)
 *                 .values(&#34;some_value&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Synthetics monitor scripts can be imported using the `guid`, e.g. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:synthetics/scriptMonitor:ScriptMonitor monitor &lt;guid&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:synthetics/scriptMonitor:ScriptMonitor")
public class ScriptMonitor extends com.pulumi.resources.CustomResource {
    /**
     * The account in which the Synthetics monitor will be created.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The account in which the Synthetics monitor will be created.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Capture a screenshot during job execution
     * 
     */
    @Export(name="enableScreenshotOnFailureAndScript", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> enableScreenshotOnFailureAndScript;

    /**
     * @return Capture a screenshot during job execution
     * 
     */
    public Output<Optional<Boolean>> enableScreenshotOnFailureAndScript() {
        return Codegen.optional(this.enableScreenshotOnFailureAndScript);
    }
    /**
     * The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    @Export(name="guid", type=String.class, parameters={})
    private Output<String> guid;

    /**
     * @return The unique identifier for the Synthetics private location in New Relic.
     * 
     */
    public Output<String> guid() {
        return this.guid;
    }
    /**
     * The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Export(name="locationPrivates", type=List.class, parameters={ScriptMonitorLocationPrivate.class})
    private Output</* @Nullable */ List<ScriptMonitorLocationPrivate>> locationPrivates;

    /**
     * @return The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Output<Optional<List<ScriptMonitorLocationPrivate>>> locationPrivates() {
        return Codegen.optional(this.locationPrivates);
    }
    /**
     * The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    @Export(name="locationsPublics", type=List.class, parameters={String.class})
    private Output</* @Nullable */ List<String>> locationsPublics;

    /**
     * @return The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don&#39;t need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locations_public` or `location_private` is required.
     * 
     */
    public Output<Optional<List<String>>> locationsPublics() {
        return Codegen.optional(this.locationsPublics);
    }
    /**
     * The name for the monitor.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name for the monitor.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
     * 
     */
    @Export(name="period", type=String.class, parameters={})
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
    @Export(name="runtimeType", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeType;

    /**
     * @return The runtime that the monitor will use to run jobs.
     * 
     */
    public Output<Optional<String>> runtimeType() {
        return Codegen.optional(this.runtimeType);
    }
    /**
     * The specific version of the runtime type selected.
     * 
     */
    @Export(name="runtimeTypeVersion", type=String.class, parameters={})
    private Output</* @Nullable */ String> runtimeTypeVersion;

    /**
     * @return The specific version of the runtime type selected.
     * 
     */
    public Output<Optional<String>> runtimeTypeVersion() {
        return Codegen.optional(this.runtimeTypeVersion);
    }
    /**
     * The script that the monitor runs.
     * 
     */
    @Export(name="script", type=String.class, parameters={})
    private Output</* @Nullable */ String> script;

    /**
     * @return The script that the monitor runs.
     * 
     */
    public Output<Optional<String>> script() {
        return Codegen.optional(this.script);
    }
    /**
     * The programing language that should execute the script.
     * 
     */
    @Export(name="scriptLanguage", type=String.class, parameters={})
    private Output</* @Nullable */ String> scriptLanguage;

    /**
     * @return The programing language that should execute the script.
     * 
     */
    public Output<Optional<String>> scriptLanguage() {
        return Codegen.optional(this.scriptLanguage);
    }
    /**
     * The run state of the monitor: `ENABLED` or `DISABLED`
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The run state of the monitor: `ENABLED` or `DISABLED`
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    @Export(name="tags", type=List.class, parameters={ScriptMonitorTag.class})
    private Output</* @Nullable */ List<ScriptMonitorTag>> tags;

    /**
     * @return The tags that will be associated with the monitor. See Nested tag blocks below for details.
     * 
     */
    public Output<Optional<List<ScriptMonitorTag>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ScriptMonitor(String name) {
        this(name, ScriptMonitorArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ScriptMonitor(String name, ScriptMonitorArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ScriptMonitor(String name, ScriptMonitorArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, args == null ? ScriptMonitorArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ScriptMonitor(String name, Output<String> id, @Nullable ScriptMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, state, makeResourceOptions(options, id));
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
    public static ScriptMonitor get(String name, Output<String> id, @Nullable ScriptMonitorState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ScriptMonitor(name, id, state, options);
    }
}
