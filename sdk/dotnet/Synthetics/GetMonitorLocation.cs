// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics
{
    public static class GetMonitorLocation
    {
        /// <summary>
        /// Use this data source to get information about a specific Synthetics monitor location in New Relic that already exists.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// class MyStack : Stack
        /// {
        ///     public MyStack()
        ///     {
        ///         var bar = Output.Create(NewRelic.Synthetics.GetMonitorLocation.InvokeAsync(new NewRelic.Synthetics.GetMonitorLocationArgs
        ///         {
        ///             Label = "My private location",
        ///         }));
        ///         var foo = new NewRelic.Synthetics.Monitor("foo", new NewRelic.Synthetics.MonitorArgs
        ///         {
        ///             Type = "SIMPLE",
        ///             Frequency = 5,
        ///             Status = "ENABLED",
        ///             Locations = 
        ///             {
        ///                 bar.Apply(bar =&gt; bar.Name),
        ///             },
        ///             Uri = "https://example.com",
        ///             ValidationString = "add example validation check here",
        ///             VerifySsl = true,
        ///         });
        ///         // Optional for type "SIMPLE" and "BROWSER"
        ///     }
        /// 
        /// }
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetMonitorLocationResult> InvokeAsync(GetMonitorLocationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetMonitorLocationResult>("newrelic:synthetics/getMonitorLocation:getMonitorLocation", args ?? new GetMonitorLocationArgs(), options.WithVersion());
    }


    public sealed class GetMonitorLocationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The label of the Synthetics monitor location.
        /// </summary>
        [Input("label", required: true)]
        public string Label { get; set; } = null!;

        public GetMonitorLocationArgs()
        {
        }
    }


    [OutputType]
    public sealed class GetMonitorLocationResult
    {
        /// <summary>
        /// A description of the Synthetics monitor location.
        /// </summary>
        public readonly string Description;
        /// <summary>
        /// Represents if high security mode is enabled for the location. A value of true means that high security mode is enabled, and a value of false means it is disabled.
        /// </summary>
        public readonly bool HighSecurityMode;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Label;
        /// <summary>
        /// The name of the Synthetics monitor location.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// Represents if this location is a private location. A value of true means that the location is private, and a value of false means it is public.
        /// </summary>
        public readonly bool Private;

        [OutputConstructor]
        private GetMonitorLocationResult(
            string description,

            bool highSecurityMode,

            string id,

            string label,

            string name,

            bool @private)
        {
            Description = description;
            HighSecurityMode = highSecurityMode;
            Id = id;
            Label = label;
            Name = name;
            Private = @private;
        }
    }
}
