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
    public sealed class OneDashboardPageWidgetBar
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
        public readonly ImmutableArray<string> LinkedEntityGuids;
        /// <summary>
        /// (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
        /// * `linked_entity_guids`: (Optional) Related entity GUIDs. Currently only supports Dashboard entity GUIDs.
        /// </summary>
        public readonly ImmutableArray<Outputs.OneDashboardPageWidgetBarNrqlQuery> NrqlQueries;
        /// <summary>
        /// (Required) Row position of widget from top left, starting at `1`.
        /// </summary>
        public readonly int Row;
        /// <summary>
        /// (Required) A title for the widget.
        /// </summary>
        public readonly string Title;
        /// <summary>
        /// (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
        /// </summary>
        public readonly int? Width;

        [OutputConstructor]
        private OneDashboardPageWidgetBar(
            int column,

            bool? filterCurrentDashboard,

            int? height,

            string? id,

            ImmutableArray<string> linkedEntityGuids,

            ImmutableArray<Outputs.OneDashboardPageWidgetBarNrqlQuery> nrqlQueries,

            int row,

            string title,

            int? width)
        {
            Column = column;
            FilterCurrentDashboard = filterCurrentDashboard;
            Height = height;
            Id = id;
            LinkedEntityGuids = linkedEntityGuids;
            NrqlQueries = nrqlQueries;
            Row = row;
            Title = title;
            Width = width;
        }
    }
}
