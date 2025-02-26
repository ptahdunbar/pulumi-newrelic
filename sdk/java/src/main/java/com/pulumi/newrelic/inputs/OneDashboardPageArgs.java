// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetAreaArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBarArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBillboardArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetBulletArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetFunnelArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHeatmapArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetHistogramArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetJsonArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLineArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetLogTableArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetMarkdownArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetPyArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetStackedBarArgs;
import com.pulumi.newrelic.inputs.OneDashboardPageWidgetTableArgs;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardPageArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardPageArgs Empty = new OneDashboardPageArgs();

    /**
     * Brief text describing the dashboard.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    @Import(name="guid")
    private @Nullable Output<String> guid;

    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Optional<Output<String>> guid() {
        return Optional.ofNullable(this.guid);
    }

    /**
     * The title of the dashboard.
     * 
     */
    @Import(name="name", required=true)
    private Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    @Import(name="widgetAreas")
    private @Nullable Output<List<OneDashboardPageWidgetAreaArgs>> widgetAreas;

    public Optional<Output<List<OneDashboardPageWidgetAreaArgs>>> widgetAreas() {
        return Optional.ofNullable(this.widgetAreas);
    }

    @Import(name="widgetBars")
    private @Nullable Output<List<OneDashboardPageWidgetBarArgs>> widgetBars;

    public Optional<Output<List<OneDashboardPageWidgetBarArgs>>> widgetBars() {
        return Optional.ofNullable(this.widgetBars);
    }

    @Import(name="widgetBillboards")
    private @Nullable Output<List<OneDashboardPageWidgetBillboardArgs>> widgetBillboards;

    public Optional<Output<List<OneDashboardPageWidgetBillboardArgs>>> widgetBillboards() {
        return Optional.ofNullable(this.widgetBillboards);
    }

    @Import(name="widgetBullets")
    private @Nullable Output<List<OneDashboardPageWidgetBulletArgs>> widgetBullets;

    public Optional<Output<List<OneDashboardPageWidgetBulletArgs>>> widgetBullets() {
        return Optional.ofNullable(this.widgetBullets);
    }

    @Import(name="widgetFunnels")
    private @Nullable Output<List<OneDashboardPageWidgetFunnelArgs>> widgetFunnels;

    public Optional<Output<List<OneDashboardPageWidgetFunnelArgs>>> widgetFunnels() {
        return Optional.ofNullable(this.widgetFunnels);
    }

    @Import(name="widgetHeatmaps")
    private @Nullable Output<List<OneDashboardPageWidgetHeatmapArgs>> widgetHeatmaps;

    public Optional<Output<List<OneDashboardPageWidgetHeatmapArgs>>> widgetHeatmaps() {
        return Optional.ofNullable(this.widgetHeatmaps);
    }

    @Import(name="widgetHistograms")
    private @Nullable Output<List<OneDashboardPageWidgetHistogramArgs>> widgetHistograms;

    public Optional<Output<List<OneDashboardPageWidgetHistogramArgs>>> widgetHistograms() {
        return Optional.ofNullable(this.widgetHistograms);
    }

    @Import(name="widgetJsons")
    private @Nullable Output<List<OneDashboardPageWidgetJsonArgs>> widgetJsons;

    public Optional<Output<List<OneDashboardPageWidgetJsonArgs>>> widgetJsons() {
        return Optional.ofNullable(this.widgetJsons);
    }

    @Import(name="widgetLines")
    private @Nullable Output<List<OneDashboardPageWidgetLineArgs>> widgetLines;

    public Optional<Output<List<OneDashboardPageWidgetLineArgs>>> widgetLines() {
        return Optional.ofNullable(this.widgetLines);
    }

    @Import(name="widgetLogTables")
    private @Nullable Output<List<OneDashboardPageWidgetLogTableArgs>> widgetLogTables;

    public Optional<Output<List<OneDashboardPageWidgetLogTableArgs>>> widgetLogTables() {
        return Optional.ofNullable(this.widgetLogTables);
    }

    @Import(name="widgetMarkdowns")
    private @Nullable Output<List<OneDashboardPageWidgetMarkdownArgs>> widgetMarkdowns;

    public Optional<Output<List<OneDashboardPageWidgetMarkdownArgs>>> widgetMarkdowns() {
        return Optional.ofNullable(this.widgetMarkdowns);
    }

    @Import(name="widgetPies")
    private @Nullable Output<List<OneDashboardPageWidgetPyArgs>> widgetPies;

    public Optional<Output<List<OneDashboardPageWidgetPyArgs>>> widgetPies() {
        return Optional.ofNullable(this.widgetPies);
    }

    @Import(name="widgetStackedBars")
    private @Nullable Output<List<OneDashboardPageWidgetStackedBarArgs>> widgetStackedBars;

    public Optional<Output<List<OneDashboardPageWidgetStackedBarArgs>>> widgetStackedBars() {
        return Optional.ofNullable(this.widgetStackedBars);
    }

    @Import(name="widgetTables")
    private @Nullable Output<List<OneDashboardPageWidgetTableArgs>> widgetTables;

    public Optional<Output<List<OneDashboardPageWidgetTableArgs>>> widgetTables() {
        return Optional.ofNullable(this.widgetTables);
    }

    private OneDashboardPageArgs() {}

    private OneDashboardPageArgs(OneDashboardPageArgs $) {
        this.description = $.description;
        this.guid = $.guid;
        this.name = $.name;
        this.widgetAreas = $.widgetAreas;
        this.widgetBars = $.widgetBars;
        this.widgetBillboards = $.widgetBillboards;
        this.widgetBullets = $.widgetBullets;
        this.widgetFunnels = $.widgetFunnels;
        this.widgetHeatmaps = $.widgetHeatmaps;
        this.widgetHistograms = $.widgetHistograms;
        this.widgetJsons = $.widgetJsons;
        this.widgetLines = $.widgetLines;
        this.widgetLogTables = $.widgetLogTables;
        this.widgetMarkdowns = $.widgetMarkdowns;
        this.widgetPies = $.widgetPies;
        this.widgetStackedBars = $.widgetStackedBars;
        this.widgetTables = $.widgetTables;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardPageArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardPageArgs $;

        public Builder() {
            $ = new OneDashboardPageArgs();
        }

        public Builder(OneDashboardPageArgs defaults) {
            $ = new OneDashboardPageArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param description Brief text describing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description Brief text describing the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(@Nullable Output<String> guid) {
            $.guid = guid;
            return this;
        }

        /**
         * @param guid The unique entity identifier of the dashboard page in New Relic.
         * 
         * @return builder
         * 
         */
        public Builder guid(String guid) {
            return guid(Output.of(guid));
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        public Builder widgetAreas(@Nullable Output<List<OneDashboardPageWidgetAreaArgs>> widgetAreas) {
            $.widgetAreas = widgetAreas;
            return this;
        }

        public Builder widgetAreas(List<OneDashboardPageWidgetAreaArgs> widgetAreas) {
            return widgetAreas(Output.of(widgetAreas));
        }

        public Builder widgetAreas(OneDashboardPageWidgetAreaArgs... widgetAreas) {
            return widgetAreas(List.of(widgetAreas));
        }

        public Builder widgetBars(@Nullable Output<List<OneDashboardPageWidgetBarArgs>> widgetBars) {
            $.widgetBars = widgetBars;
            return this;
        }

        public Builder widgetBars(List<OneDashboardPageWidgetBarArgs> widgetBars) {
            return widgetBars(Output.of(widgetBars));
        }

        public Builder widgetBars(OneDashboardPageWidgetBarArgs... widgetBars) {
            return widgetBars(List.of(widgetBars));
        }

        public Builder widgetBillboards(@Nullable Output<List<OneDashboardPageWidgetBillboardArgs>> widgetBillboards) {
            $.widgetBillboards = widgetBillboards;
            return this;
        }

        public Builder widgetBillboards(List<OneDashboardPageWidgetBillboardArgs> widgetBillboards) {
            return widgetBillboards(Output.of(widgetBillboards));
        }

        public Builder widgetBillboards(OneDashboardPageWidgetBillboardArgs... widgetBillboards) {
            return widgetBillboards(List.of(widgetBillboards));
        }

        public Builder widgetBullets(@Nullable Output<List<OneDashboardPageWidgetBulletArgs>> widgetBullets) {
            $.widgetBullets = widgetBullets;
            return this;
        }

        public Builder widgetBullets(List<OneDashboardPageWidgetBulletArgs> widgetBullets) {
            return widgetBullets(Output.of(widgetBullets));
        }

        public Builder widgetBullets(OneDashboardPageWidgetBulletArgs... widgetBullets) {
            return widgetBullets(List.of(widgetBullets));
        }

        public Builder widgetFunnels(@Nullable Output<List<OneDashboardPageWidgetFunnelArgs>> widgetFunnels) {
            $.widgetFunnels = widgetFunnels;
            return this;
        }

        public Builder widgetFunnels(List<OneDashboardPageWidgetFunnelArgs> widgetFunnels) {
            return widgetFunnels(Output.of(widgetFunnels));
        }

        public Builder widgetFunnels(OneDashboardPageWidgetFunnelArgs... widgetFunnels) {
            return widgetFunnels(List.of(widgetFunnels));
        }

        public Builder widgetHeatmaps(@Nullable Output<List<OneDashboardPageWidgetHeatmapArgs>> widgetHeatmaps) {
            $.widgetHeatmaps = widgetHeatmaps;
            return this;
        }

        public Builder widgetHeatmaps(List<OneDashboardPageWidgetHeatmapArgs> widgetHeatmaps) {
            return widgetHeatmaps(Output.of(widgetHeatmaps));
        }

        public Builder widgetHeatmaps(OneDashboardPageWidgetHeatmapArgs... widgetHeatmaps) {
            return widgetHeatmaps(List.of(widgetHeatmaps));
        }

        public Builder widgetHistograms(@Nullable Output<List<OneDashboardPageWidgetHistogramArgs>> widgetHistograms) {
            $.widgetHistograms = widgetHistograms;
            return this;
        }

        public Builder widgetHistograms(List<OneDashboardPageWidgetHistogramArgs> widgetHistograms) {
            return widgetHistograms(Output.of(widgetHistograms));
        }

        public Builder widgetHistograms(OneDashboardPageWidgetHistogramArgs... widgetHistograms) {
            return widgetHistograms(List.of(widgetHistograms));
        }

        public Builder widgetJsons(@Nullable Output<List<OneDashboardPageWidgetJsonArgs>> widgetJsons) {
            $.widgetJsons = widgetJsons;
            return this;
        }

        public Builder widgetJsons(List<OneDashboardPageWidgetJsonArgs> widgetJsons) {
            return widgetJsons(Output.of(widgetJsons));
        }

        public Builder widgetJsons(OneDashboardPageWidgetJsonArgs... widgetJsons) {
            return widgetJsons(List.of(widgetJsons));
        }

        public Builder widgetLines(@Nullable Output<List<OneDashboardPageWidgetLineArgs>> widgetLines) {
            $.widgetLines = widgetLines;
            return this;
        }

        public Builder widgetLines(List<OneDashboardPageWidgetLineArgs> widgetLines) {
            return widgetLines(Output.of(widgetLines));
        }

        public Builder widgetLines(OneDashboardPageWidgetLineArgs... widgetLines) {
            return widgetLines(List.of(widgetLines));
        }

        public Builder widgetLogTables(@Nullable Output<List<OneDashboardPageWidgetLogTableArgs>> widgetLogTables) {
            $.widgetLogTables = widgetLogTables;
            return this;
        }

        public Builder widgetLogTables(List<OneDashboardPageWidgetLogTableArgs> widgetLogTables) {
            return widgetLogTables(Output.of(widgetLogTables));
        }

        public Builder widgetLogTables(OneDashboardPageWidgetLogTableArgs... widgetLogTables) {
            return widgetLogTables(List.of(widgetLogTables));
        }

        public Builder widgetMarkdowns(@Nullable Output<List<OneDashboardPageWidgetMarkdownArgs>> widgetMarkdowns) {
            $.widgetMarkdowns = widgetMarkdowns;
            return this;
        }

        public Builder widgetMarkdowns(List<OneDashboardPageWidgetMarkdownArgs> widgetMarkdowns) {
            return widgetMarkdowns(Output.of(widgetMarkdowns));
        }

        public Builder widgetMarkdowns(OneDashboardPageWidgetMarkdownArgs... widgetMarkdowns) {
            return widgetMarkdowns(List.of(widgetMarkdowns));
        }

        public Builder widgetPies(@Nullable Output<List<OneDashboardPageWidgetPyArgs>> widgetPies) {
            $.widgetPies = widgetPies;
            return this;
        }

        public Builder widgetPies(List<OneDashboardPageWidgetPyArgs> widgetPies) {
            return widgetPies(Output.of(widgetPies));
        }

        public Builder widgetPies(OneDashboardPageWidgetPyArgs... widgetPies) {
            return widgetPies(List.of(widgetPies));
        }

        public Builder widgetStackedBars(@Nullable Output<List<OneDashboardPageWidgetStackedBarArgs>> widgetStackedBars) {
            $.widgetStackedBars = widgetStackedBars;
            return this;
        }

        public Builder widgetStackedBars(List<OneDashboardPageWidgetStackedBarArgs> widgetStackedBars) {
            return widgetStackedBars(Output.of(widgetStackedBars));
        }

        public Builder widgetStackedBars(OneDashboardPageWidgetStackedBarArgs... widgetStackedBars) {
            return widgetStackedBars(List.of(widgetStackedBars));
        }

        public Builder widgetTables(@Nullable Output<List<OneDashboardPageWidgetTableArgs>> widgetTables) {
            $.widgetTables = widgetTables;
            return this;
        }

        public Builder widgetTables(List<OneDashboardPageWidgetTableArgs> widgetTables) {
            return widgetTables(Output.of(widgetTables));
        }

        public Builder widgetTables(OneDashboardPageWidgetTableArgs... widgetTables) {
            return widgetTables(List.of(widgetTables));
        }

        public OneDashboardPageArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
