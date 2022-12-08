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
    public sealed class OneDashboardPageWidgetHeatmap
    {
        /// <summary>
        /// (Required) Column position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Column;
        public readonly bool? FilterCurrentDashboard;
        /// <summary>
        /// (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
        /// </summary>
        public readonly int? Height;
        public readonly string? Id;
        /// <summary>
        /// (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
        /// </summary>
        public readonly bool? IgnoreTimeRange;
        public readonly ImmutableArray<string> LinkedEntityGuids;
        /// <summary>
        /// (Optional) Configuration for variables of type `nrql`. See Nested nrql\_query blocks for details.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetHeatmapNrqlQuery> NrqlQueries;
        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Row;
        /// <summary>
        /// (Optional) A human-friendly display string for this value.
        /// </summary>
        public readonly string Title;
        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        public readonly int? Width;

        [OutputConstructor]
        private OneDashboardPageWidgetHeatmap(
            int column,

            bool? filterCurrentDashboard,

            int? height,

            string? id,

            bool? ignoreTimeRange,

            ImmutableArray<string> linkedEntityGuids,

            ImmutableArray<Outputs.OneDashboardPageWidgetHeatmapNrqlQuery> nrqlQueries,

            int row,

            string title,

            int? width)
        {
            Column = column;
            FilterCurrentDashboard = filterCurrentDashboard;
            Height = height;
            Id = id;
            IgnoreTimeRange = ignoreTimeRange;
            LinkedEntityGuids = linkedEntityGuids;
            NrqlQueries = nrqlQueries;
            Row = row;
            Title = title;
            Width = width;
        }
    }
}
