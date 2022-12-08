// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageWidgetJsonArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        [Input("column", required: true)]
        public Input<int> Column { get; set; } = null!;

        /// <summary>
        /// (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
        /// </summary>
        [Input("height")]
        public Input<int>? Height { get; set; }

        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
        /// </summary>
        [Input("ignoreTimeRange")]
        public Input<bool>? IgnoreTimeRange { get; set; }

        [Input("nrqlQueries", required: true)]
        private InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryArgs>? _nrqlQueries;

        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryArgs> NrqlQueries
        {
            get => _nrqlQueries ?? (_nrqlQueries = new InputList<Inputs.OneDashboardPageWidgetJsonNrqlQueryArgs>());
            set => _nrqlQueries = value;
        }

        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        [Input("row", required: true)]
        public Input<int> Row { get; set; } = null!;

        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        [Input("title", required: true)]
        public Input<string> Title { get; set; } = null!;

        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        [Input("width")]
        public Input<int>? Width { get; set; }

        public OneDashboardPageWidgetJsonArgs()
        {
        }
        public static new OneDashboardPageWidgetJsonArgs Empty => new OneDashboardPageWidgetJsonArgs();
    }
}
