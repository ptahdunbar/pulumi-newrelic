// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class OneDashboardPageWidgetBillboard
    {
        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Column;
        /// <summary>
        /// (Optional) Threshold above which the displayed value will be styled with a red color.
        /// </summary>
        public readonly double? Critical;
        /// <summary>
        /// (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
        /// </summary>
        public readonly int? Height;
        public readonly string? Id;
        /// <summary>
        /// (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
        /// * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
        /// * `filter_current_dashboard`: (Optional) Use this item to filter the current dashboard.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetBillboardNrqlQuery> NrqlQueries;
        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Row;
        /// <summary>
        /// (Required) A title for the widget.
        /// </summary>
        public readonly string Title;
        /// <summary>
        /// (Optional) Threshold above which the displayed value will be styled with a yellow color.
        /// * `widget_bullet`
        /// </summary>
        public readonly double? Warning;
        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        public readonly int? Width;

        [OutputConstructor]
        private OneDashboardPageWidgetBillboard(
            int column,

            double? critical,

            int? height,

            string? id,

            ImmutableArray<Outputs.OneDashboardPageWidgetBillboardNrqlQuery> nrqlQueries,

            int row,

            string title,

            double? warning,

            int? width)
        {
            Column = column;
            Critical = critical;
            Height = height;
            Id = id;
            NrqlQueries = nrqlQueries;
            Row = row;
            Title = title;
            Warning = warning;
            Width = width;
        }
    }
}
