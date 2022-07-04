// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class OneDashboardPageArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Brief text describing the dashboard.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The unique entity identifier of the dashboard page in New Relic.
        /// </summary>
        [Input("guid")]
        public Input<string>? Guid { get; set; }

        /// <summary>
        /// The title of the dashboard.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        [Input("widgetAreas")]
        private InputList<Inputs.OneDashboardPageWidgetAreaArgs>? _widgetAreas;

        /// <summary>
        /// (Optional) A nested block that describes an Area widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetAreaArgs> WidgetAreas
        {
            get => _widgetAreas ?? (_widgetAreas = new InputList<Inputs.OneDashboardPageWidgetAreaArgs>());
            set => _widgetAreas = value;
        }

        [Input("widgetBars")]
        private InputList<Inputs.OneDashboardPageWidgetBarArgs>? _widgetBars;

        /// <summary>
        /// (Optional) A nested block that describes a Bar widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetBarArgs> WidgetBars
        {
            get => _widgetBars ?? (_widgetBars = new InputList<Inputs.OneDashboardPageWidgetBarArgs>());
            set => _widgetBars = value;
        }

        [Input("widgetBillboards")]
        private InputList<Inputs.OneDashboardPageWidgetBillboardArgs>? _widgetBillboards;

        /// <summary>
        /// (Optional) A nested block that describes a Billboard widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetBillboardArgs> WidgetBillboards
        {
            get => _widgetBillboards ?? (_widgetBillboards = new InputList<Inputs.OneDashboardPageWidgetBillboardArgs>());
            set => _widgetBillboards = value;
        }

        [Input("widgetBullets")]
        private InputList<Inputs.OneDashboardPageWidgetBulletArgs>? _widgetBullets;

        /// <summary>
        /// (Optional) A nested block that describes a Bullet widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetBulletArgs> WidgetBullets
        {
            get => _widgetBullets ?? (_widgetBullets = new InputList<Inputs.OneDashboardPageWidgetBulletArgs>());
            set => _widgetBullets = value;
        }

        [Input("widgetFunnels")]
        private InputList<Inputs.OneDashboardPageWidgetFunnelArgs>? _widgetFunnels;

        /// <summary>
        /// (Optional) A nested block that describes a Funnel widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetFunnelArgs> WidgetFunnels
        {
            get => _widgetFunnels ?? (_widgetFunnels = new InputList<Inputs.OneDashboardPageWidgetFunnelArgs>());
            set => _widgetFunnels = value;
        }

        [Input("widgetHeatmaps")]
        private InputList<Inputs.OneDashboardPageWidgetHeatmapArgs>? _widgetHeatmaps;

        /// <summary>
        /// (Optional) A nested block that describes a Heatmap widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHeatmapArgs> WidgetHeatmaps
        {
            get => _widgetHeatmaps ?? (_widgetHeatmaps = new InputList<Inputs.OneDashboardPageWidgetHeatmapArgs>());
            set => _widgetHeatmaps = value;
        }

        [Input("widgetHistograms")]
        private InputList<Inputs.OneDashboardPageWidgetHistogramArgs>? _widgetHistograms;

        /// <summary>
        /// (Optional) A nested block that describes a Histogram widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetHistogramArgs> WidgetHistograms
        {
            get => _widgetHistograms ?? (_widgetHistograms = new InputList<Inputs.OneDashboardPageWidgetHistogramArgs>());
            set => _widgetHistograms = value;
        }

        [Input("widgetJsons")]
        private InputList<Inputs.OneDashboardPageWidgetJsonArgs>? _widgetJsons;

        /// <summary>
        /// (Optional) A nested block that describes a JSON widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetJsonArgs> WidgetJsons
        {
            get => _widgetJsons ?? (_widgetJsons = new InputList<Inputs.OneDashboardPageWidgetJsonArgs>());
            set => _widgetJsons = value;
        }

        [Input("widgetLines")]
        private InputList<Inputs.OneDashboardPageWidgetLineArgs>? _widgetLines;

        /// <summary>
        /// (Optional) A nested block that describes a Line widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetLineArgs> WidgetLines
        {
            get => _widgetLines ?? (_widgetLines = new InputList<Inputs.OneDashboardPageWidgetLineArgs>());
            set => _widgetLines = value;
        }

        [Input("widgetLogTables")]
        private InputList<Inputs.OneDashboardPageWidgetLogTableArgs>? _widgetLogTables;

        /// <summary>
        /// (Optional) A nested block that describes a Log Table widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetLogTableArgs> WidgetLogTables
        {
            get => _widgetLogTables ?? (_widgetLogTables = new InputList<Inputs.OneDashboardPageWidgetLogTableArgs>());
            set => _widgetLogTables = value;
        }

        [Input("widgetMarkdowns")]
        private InputList<Inputs.OneDashboardPageWidgetMarkdownArgs>? _widgetMarkdowns;

        /// <summary>
        /// (Optional) A nested block that describes a Markdown widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetMarkdownArgs> WidgetMarkdowns
        {
            get => _widgetMarkdowns ?? (_widgetMarkdowns = new InputList<Inputs.OneDashboardPageWidgetMarkdownArgs>());
            set => _widgetMarkdowns = value;
        }

        [Input("widgetPies")]
        private InputList<Inputs.OneDashboardPageWidgetPyArgs>? _widgetPies;

        /// <summary>
        /// (Optional) A nested block that describes a Pie widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetPyArgs> WidgetPies
        {
            get => _widgetPies ?? (_widgetPies = new InputList<Inputs.OneDashboardPageWidgetPyArgs>());
            set => _widgetPies = value;
        }

        [Input("widgetStackedBars")]
        private InputList<Inputs.OneDashboardPageWidgetStackedBarArgs>? _widgetStackedBars;

        /// <summary>
        /// (Optional) A nested block that describes a Stacked Bar widget. See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetStackedBarArgs> WidgetStackedBars
        {
            get => _widgetStackedBars ?? (_widgetStackedBars = new InputList<Inputs.OneDashboardPageWidgetStackedBarArgs>());
            set => _widgetStackedBars = value;
        }

        [Input("widgetTables")]
        private InputList<Inputs.OneDashboardPageWidgetTableArgs>? _widgetTables;

        /// <summary>
        /// (Optional) A nested block that describes a Table widget.  See Nested widget blocks below for details.
        /// </summary>
        public InputList<Inputs.OneDashboardPageWidgetTableArgs> WidgetTables
        {
            get => _widgetTables ?? (_widgetTables = new InputList<Inputs.OneDashboardPageWidgetTableArgs>());
            set => _widgetTables = value;
        }

        public OneDashboardPageArgs()
        {
        }
    }
}
