// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    /// <summary>
    /// Use this resource to create update, and delete a Script API or Script Browser Synthetics Monitor in New Relic.
    /// 
    /// ## Example Usage
    /// 
    /// ##### Type: `SCRIPT_API`
    /// 
    /// &gt; **NOTE:** The preferred runtime is `NODE_16.10.0` while configuring the `SCRIPT_API` monitor. Other runtime may be deprecated in the future and receive fewer product updates.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///             "AP_EAST_1",
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         RuntimeType = "NODE_API",
    ///         RuntimeTypeVersion = "16.10",
    ///         Script = "console.log('terraform integration test updated')",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
    ///             {
    ///                 Key = "some_key",
    ///                 Values = new[]
    ///                 {
    ///                     "some_value",
    ///                 },
    ///             },
    ///         },
    ///         Type = "SCRIPT_API",
    ///     });
    /// 
    /// });
    /// ```
    /// ##### Type: `SCRIPT_BROWSER`
    /// 
    /// &gt; **NOTE:** The preferred runtime is `CHROME_BROWSER_100` while configuring the `SCRIPT_BROWSER` monitor. Other runtime may be deprecated in the future and receive fewer product updates.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         EnableScreenshotOnFailureAndScript = false,
    ///         LocationsPublics = new[]
    ///         {
    ///             "AP_SOUTH_1",
    ///             "AP_EAST_1",
    ///         },
    ///         Period = "EVERY_HOUR",
    ///         RuntimeType = "CHROME_BROWSER",
    ///         RuntimeTypeVersion = "100",
    ///         Script = "$browser.get('https://one.newrelic.com')",
    ///         ScriptLanguage = "JAVASCRIPT",
    ///         Status = "DISABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
    ///             {
    ///                 Key = "Name",
    ///                 Values = new[]
    ///                 {
    ///                     "scriptedMonitor",
    ///                     "hello",
    ///                 },
    ///             },
    ///         },
    ///         Type = "SCRIPT_BROWSER",
    ///     });
    /// 
    /// });
    /// ```
    /// See additional examples.
    /// ## Additional Examples
    /// 
    /// ### Create a monitor with a private location
    /// 
    /// The below example shows how you can define a private location and attach it to a monitor.
    /// 
    /// &gt; **NOTE:** It can take up to 10 minutes for a private location to become available.
    /// 
    /// &gt; **NOTE:** Currently, it's only possible to use a private location with a monitor running on a legacy runtime. Leave `runtime_type_version`, `runtime_type` &amp; `script_language` empty to use legacy runtime. See example below.
    /// 
    /// ##### Type: `SCRIPT_API`
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var privateLocation = new NewRelic.Synthetics.PrivateLocation("privateLocation", new()
    ///     {
    ///         Description = "Test Description",
    ///         VerifiedScriptExecution = true,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         LocationPrivates = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorLocationPrivateArgs
    ///             {
    ///                 Guid = "newrelic_synthetics_private_location.private_location.id",
    ///                 VsePassword = "secret",
    ///             },
    ///         },
    ///         Period = "EVERY_6_HOURS",
    ///         RuntimeType = "",
    ///         RuntimeTypeVersion = "",
    ///         Script = "console.log('terraform integration test updated')",
    ///         ScriptLanguage = "",
    ///         Status = "ENABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
    ///             {
    ///                 Key = "some_key",
    ///                 Values = new[]
    ///                 {
    ///                     "some_value",
    ///                 },
    ///             },
    ///         },
    ///         Type = "SCRIPT_API",
    ///     });
    /// 
    /// });
    /// ```
    /// ##### Type: `SCRIPT_BROWSER`
    /// 
    /// &gt; **NOTE:** Currently, it's only possible to use a private location with a monitor running on a legacy runtime. Leave `runtime_type_version`, `runtime_type` &amp; `script_language` empty to use legacy runtime. See example below.
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using Pulumi;
    /// using NewRelic = Pulumi.NewRelic;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var privateLocation = new NewRelic.Synthetics.PrivateLocation("privateLocation", new()
    ///     {
    ///         Description = "Test Description",
    ///         VerifiedScriptExecution = true,
    ///     });
    /// 
    ///     var monitor = new NewRelic.Synthetics.ScriptMonitor("monitor", new()
    ///     {
    ///         EnableScreenshotOnFailureAndScript = false,
    ///         LocationPrivates = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorLocationPrivateArgs
    ///             {
    ///                 Guid = "newrelic_synthetics_private_location.private_location.id",
    ///                 VsePassword = "secret",
    ///             },
    ///         },
    ///         Period = "EVERY_HOUR",
    ///         RuntimeType = "",
    ///         RuntimeTypeVersion = "",
    ///         Script = "$browser.get('https://one.newrelic.com')",
    ///         ScriptLanguage = "",
    ///         Status = "DISABLED",
    ///         Tags = new[]
    ///         {
    ///             new NewRelic.Synthetics.Inputs.ScriptMonitorTagArgs
    ///             {
    ///                 Key = "some_key",
    ///                 Values = new[]
    ///                 {
    ///                     "some_value",
    ///                 },
    ///             },
    ///         },
    ///         Type = "SCRIPT_BROWSER",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Synthetics monitor scripts can be imported using the `guid`, e.g. bash
    /// 
    /// ```sh
    ///  $ pulumi import newrelic:synthetics/scriptMonitor:ScriptMonitor bar &lt;guid&gt;
    /// ```
    /// </summary>
    [NewRelicResourceType("newrelic:synthetics/scriptMonitor:ScriptMonitor")]
    public partial class ScriptMonitor : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Output("accountId")]
        public Output<int> AccountId { get; private set; } = null!;

        /// <summary>
        /// Capture a screenshot during job execution
        /// </summary>
        [Output("enableScreenshotOnFailureAndScript")]
        public Output<bool?> EnableScreenshotOnFailureAndScript { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the Synthetics private location in New Relic.
        /// </summary>
        [Output("guid")]
        public Output<string> Guid { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        [Output("locationPrivates")]
        public Output<ImmutableArray<Outputs.ScriptMonitorLocationPrivate>> LocationPrivates { get; private set; } = null!;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        [Output("locationsPublics")]
        public Output<ImmutableArray<string>> LocationsPublics { get; private set; } = null!;

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Output("period")]
        public Output<string> Period { get; private set; } = null!;

        /// <summary>
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Output("runtimeType")]
        public Output<string?> RuntimeType { get; private set; } = null!;

        /// <summary>
        /// The specific version of the runtime type selected.
        /// </summary>
        [Output("runtimeTypeVersion")]
        public Output<string?> RuntimeTypeVersion { get; private set; } = null!;

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Output("script")]
        public Output<string?> Script { get; private set; } = null!;

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Output("scriptLanguage")]
        public Output<string?> ScriptLanguage { get; private set; } = null!;

        /// <summary>
        /// The run state of the monitor.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableArray<Outputs.ScriptMonitorTag>> Tags { get; private set; } = null!;

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ScriptMonitor resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ScriptMonitor(string name, ScriptMonitorArgs args, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, args ?? new ScriptMonitorArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ScriptMonitor(string name, Input<string> id, ScriptMonitorState? state = null, CustomResourceOptions? options = null)
            : base("newrelic:synthetics/scriptMonitor:ScriptMonitor", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ScriptMonitor resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ScriptMonitor Get(string name, Input<string> id, ScriptMonitorState? state = null, CustomResourceOptions? options = null)
        {
            return new ScriptMonitor(name, id, state, options);
        }
    }

    public sealed class ScriptMonitorArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

        [Input("locationPrivates")]
        private InputList<Inputs.ScriptMonitorLocationPrivateArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<Inputs.ScriptMonitorLocationPrivateArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.ScriptMonitorLocationPrivateArgs>());
            set => _locationPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<string> LocationsPublics
        {
            get => _locationsPublics ?? (_locationsPublics = new InputList<string>());
            set => _locationsPublics = value;
        }

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Input("period", required: true)]
        public Input<string> Period { get; set; } = null!;

        /// <summary>
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The run state of the monitor.
        /// </summary>
        [Input("status", required: true)]
        public Input<string> Status { get; set; } = null!;

        [Input("tags")]
        private InputList<Inputs.ScriptMonitorTagArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.ScriptMonitorTagArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ScriptMonitorTagArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public ScriptMonitorArgs()
        {
        }
        public static new ScriptMonitorArgs Empty => new ScriptMonitorArgs();
    }

    public sealed class ScriptMonitorState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The account in which the Synthetics monitor will be created.
        /// </summary>
        [Input("accountId")]
        public Input<int>? AccountId { get; set; }

        /// <summary>
        /// Capture a screenshot during job execution
        /// </summary>
        [Input("enableScreenshotOnFailureAndScript")]
        public Input<bool>? EnableScreenshotOnFailureAndScript { get; set; }

        /// <summary>
        /// The unique identifier for the Synthetics private location in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        [Input("locationPrivates")]
        private InputList<Inputs.ScriptMonitorLocationPrivateGetArgs>? _locationPrivates;

        /// <summary>
        /// The location the monitor will run from. See Nested location_private blocks below for details. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<Inputs.ScriptMonitorLocationPrivateGetArgs> LocationPrivates
        {
            get => _locationPrivates ?? (_locationPrivates = new InputList<Inputs.ScriptMonitorLocationPrivateGetArgs>());
            set => _locationPrivates = value;
        }

        [Input("locationsPublics")]
        private InputList<string>? _locationsPublics;

        /// <summary>
        /// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. At least one of either `locations_public` or `location_private` is required.
        /// </summary>
        public InputList<string> LocationsPublics
        {
            get => _locationsPublics ?? (_locationsPublics = new InputList<string>());
            set => _locationsPublics = value;
        }

        /// <summary>
        /// The name for the monitor.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        /// <summary>
        /// The runtime that the monitor will use to run jobs.
        /// </summary>
        [Input("runtimeType")]
        public Input<string>? RuntimeType { get; set; }

        /// <summary>
        /// The specific version of the runtime type selected.
        /// </summary>
        [Input("runtimeTypeVersion")]
        public Input<string>? RuntimeTypeVersion { get; set; }

        /// <summary>
        /// The script that the monitor runs.
        /// </summary>
        [Input("script")]
        public Input<string>? Script { get; set; }

        /// <summary>
        /// The programing language that should execute the script.
        /// </summary>
        [Input("scriptLanguage")]
        public Input<string>? ScriptLanguage { get; set; }

        /// <summary>
        /// The run state of the monitor.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputList<Inputs.ScriptMonitorTagGetArgs>? _tags;

        /// <summary>
        /// The tags that will be associated with the monitor. See Nested tag blocks below for details.
        /// </summary>
        public InputList<Inputs.ScriptMonitorTagGetArgs> Tags
        {
            get => _tags ?? (_tags = new InputList<Inputs.ScriptMonitorTagGetArgs>());
            set => _tags = value;
        }

        /// <summary>
        /// The plaintext representing the monitor script. Valid values are SCRIPT_BROWSER or SCRIPT_API
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ScriptMonitorState()
        {
        }
        public static new ScriptMonitorState Empty => new ScriptMonitorState();
    }
}
