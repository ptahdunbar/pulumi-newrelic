// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetArea;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetBar;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetBillboard;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetBullet;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetFunnel;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHeatmap;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetHistogram;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetJson;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLine;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetLogTable;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetMarkdown;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetPy;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetStackedBar;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetTable;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPage {
    /**
     * @return Brief text describing the dashboard.
     * 
     */
    private @Nullable String description;
    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    private @Nullable String guid;
    /**
     * @return The title of the dashboard.
     * 
     */
    private String name;
    private @Nullable List<OneDashboardPageWidgetArea> widgetAreas;
    private @Nullable List<OneDashboardPageWidgetBar> widgetBars;
    private @Nullable List<OneDashboardPageWidgetBillboard> widgetBillboards;
    private @Nullable List<OneDashboardPageWidgetBullet> widgetBullets;
    private @Nullable List<OneDashboardPageWidgetFunnel> widgetFunnels;
    private @Nullable List<OneDashboardPageWidgetHeatmap> widgetHeatmaps;
    private @Nullable List<OneDashboardPageWidgetHistogram> widgetHistograms;
    private @Nullable List<OneDashboardPageWidgetJson> widgetJsons;
    private @Nullable List<OneDashboardPageWidgetLine> widgetLines;
    private @Nullable List<OneDashboardPageWidgetLogTable> widgetLogTables;
    private @Nullable List<OneDashboardPageWidgetMarkdown> widgetMarkdowns;
    private @Nullable List<OneDashboardPageWidgetPy> widgetPies;
    private @Nullable List<OneDashboardPageWidgetStackedBar> widgetStackedBars;
    private @Nullable List<OneDashboardPageWidgetTable> widgetTables;

    private OneDashboardPage() {}
    /**
     * @return Brief text describing the dashboard.
     * 
     */
    public Optional<String> description() {
        return Optional.ofNullable(this.description);
    }
    /**
     * @return The unique entity identifier of the dashboard page in New Relic.
     * 
     */
    public Optional<String> guid() {
        return Optional.ofNullable(this.guid);
    }
    /**
     * @return The title of the dashboard.
     * 
     */
    public String name() {
        return this.name;
    }
    public List<OneDashboardPageWidgetArea> widgetAreas() {
        return this.widgetAreas == null ? List.of() : this.widgetAreas;
    }
    public List<OneDashboardPageWidgetBar> widgetBars() {
        return this.widgetBars == null ? List.of() : this.widgetBars;
    }
    public List<OneDashboardPageWidgetBillboard> widgetBillboards() {
        return this.widgetBillboards == null ? List.of() : this.widgetBillboards;
    }
    public List<OneDashboardPageWidgetBullet> widgetBullets() {
        return this.widgetBullets == null ? List.of() : this.widgetBullets;
    }
    public List<OneDashboardPageWidgetFunnel> widgetFunnels() {
        return this.widgetFunnels == null ? List.of() : this.widgetFunnels;
    }
    public List<OneDashboardPageWidgetHeatmap> widgetHeatmaps() {
        return this.widgetHeatmaps == null ? List.of() : this.widgetHeatmaps;
    }
    public List<OneDashboardPageWidgetHistogram> widgetHistograms() {
        return this.widgetHistograms == null ? List.of() : this.widgetHistograms;
    }
    public List<OneDashboardPageWidgetJson> widgetJsons() {
        return this.widgetJsons == null ? List.of() : this.widgetJsons;
    }
    public List<OneDashboardPageWidgetLine> widgetLines() {
        return this.widgetLines == null ? List.of() : this.widgetLines;
    }
    public List<OneDashboardPageWidgetLogTable> widgetLogTables() {
        return this.widgetLogTables == null ? List.of() : this.widgetLogTables;
    }
    public List<OneDashboardPageWidgetMarkdown> widgetMarkdowns() {
        return this.widgetMarkdowns == null ? List.of() : this.widgetMarkdowns;
    }
    public List<OneDashboardPageWidgetPy> widgetPies() {
        return this.widgetPies == null ? List.of() : this.widgetPies;
    }
    public List<OneDashboardPageWidgetStackedBar> widgetStackedBars() {
        return this.widgetStackedBars == null ? List.of() : this.widgetStackedBars;
    }
    public List<OneDashboardPageWidgetTable> widgetTables() {
        return this.widgetTables == null ? List.of() : this.widgetTables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPage defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String description;
        private @Nullable String guid;
        private String name;
        private @Nullable List<OneDashboardPageWidgetArea> widgetAreas;
        private @Nullable List<OneDashboardPageWidgetBar> widgetBars;
        private @Nullable List<OneDashboardPageWidgetBillboard> widgetBillboards;
        private @Nullable List<OneDashboardPageWidgetBullet> widgetBullets;
        private @Nullable List<OneDashboardPageWidgetFunnel> widgetFunnels;
        private @Nullable List<OneDashboardPageWidgetHeatmap> widgetHeatmaps;
        private @Nullable List<OneDashboardPageWidgetHistogram> widgetHistograms;
        private @Nullable List<OneDashboardPageWidgetJson> widgetJsons;
        private @Nullable List<OneDashboardPageWidgetLine> widgetLines;
        private @Nullable List<OneDashboardPageWidgetLogTable> widgetLogTables;
        private @Nullable List<OneDashboardPageWidgetMarkdown> widgetMarkdowns;
        private @Nullable List<OneDashboardPageWidgetPy> widgetPies;
        private @Nullable List<OneDashboardPageWidgetStackedBar> widgetStackedBars;
        private @Nullable List<OneDashboardPageWidgetTable> widgetTables;
        public Builder() {}
        public Builder(OneDashboardPage defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.description = defaults.description;
    	      this.guid = defaults.guid;
    	      this.name = defaults.name;
    	      this.widgetAreas = defaults.widgetAreas;
    	      this.widgetBars = defaults.widgetBars;
    	      this.widgetBillboards = defaults.widgetBillboards;
    	      this.widgetBullets = defaults.widgetBullets;
    	      this.widgetFunnels = defaults.widgetFunnels;
    	      this.widgetHeatmaps = defaults.widgetHeatmaps;
    	      this.widgetHistograms = defaults.widgetHistograms;
    	      this.widgetJsons = defaults.widgetJsons;
    	      this.widgetLines = defaults.widgetLines;
    	      this.widgetLogTables = defaults.widgetLogTables;
    	      this.widgetMarkdowns = defaults.widgetMarkdowns;
    	      this.widgetPies = defaults.widgetPies;
    	      this.widgetStackedBars = defaults.widgetStackedBars;
    	      this.widgetTables = defaults.widgetTables;
        }

        @CustomType.Setter
        public Builder description(@Nullable String description) {
            this.description = description;
            return this;
        }
        @CustomType.Setter
        public Builder guid(@Nullable String guid) {
            this.guid = guid;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder widgetAreas(@Nullable List<OneDashboardPageWidgetArea> widgetAreas) {
            this.widgetAreas = widgetAreas;
            return this;
        }
        public Builder widgetAreas(OneDashboardPageWidgetArea... widgetAreas) {
            return widgetAreas(List.of(widgetAreas));
        }
        @CustomType.Setter
        public Builder widgetBars(@Nullable List<OneDashboardPageWidgetBar> widgetBars) {
            this.widgetBars = widgetBars;
            return this;
        }
        public Builder widgetBars(OneDashboardPageWidgetBar... widgetBars) {
            return widgetBars(List.of(widgetBars));
        }
        @CustomType.Setter
        public Builder widgetBillboards(@Nullable List<OneDashboardPageWidgetBillboard> widgetBillboards) {
            this.widgetBillboards = widgetBillboards;
            return this;
        }
        public Builder widgetBillboards(OneDashboardPageWidgetBillboard... widgetBillboards) {
            return widgetBillboards(List.of(widgetBillboards));
        }
        @CustomType.Setter
        public Builder widgetBullets(@Nullable List<OneDashboardPageWidgetBullet> widgetBullets) {
            this.widgetBullets = widgetBullets;
            return this;
        }
        public Builder widgetBullets(OneDashboardPageWidgetBullet... widgetBullets) {
            return widgetBullets(List.of(widgetBullets));
        }
        @CustomType.Setter
        public Builder widgetFunnels(@Nullable List<OneDashboardPageWidgetFunnel> widgetFunnels) {
            this.widgetFunnels = widgetFunnels;
            return this;
        }
        public Builder widgetFunnels(OneDashboardPageWidgetFunnel... widgetFunnels) {
            return widgetFunnels(List.of(widgetFunnels));
        }
        @CustomType.Setter
        public Builder widgetHeatmaps(@Nullable List<OneDashboardPageWidgetHeatmap> widgetHeatmaps) {
            this.widgetHeatmaps = widgetHeatmaps;
            return this;
        }
        public Builder widgetHeatmaps(OneDashboardPageWidgetHeatmap... widgetHeatmaps) {
            return widgetHeatmaps(List.of(widgetHeatmaps));
        }
        @CustomType.Setter
        public Builder widgetHistograms(@Nullable List<OneDashboardPageWidgetHistogram> widgetHistograms) {
            this.widgetHistograms = widgetHistograms;
            return this;
        }
        public Builder widgetHistograms(OneDashboardPageWidgetHistogram... widgetHistograms) {
            return widgetHistograms(List.of(widgetHistograms));
        }
        @CustomType.Setter
        public Builder widgetJsons(@Nullable List<OneDashboardPageWidgetJson> widgetJsons) {
            this.widgetJsons = widgetJsons;
            return this;
        }
        public Builder widgetJsons(OneDashboardPageWidgetJson... widgetJsons) {
            return widgetJsons(List.of(widgetJsons));
        }
        @CustomType.Setter
        public Builder widgetLines(@Nullable List<OneDashboardPageWidgetLine> widgetLines) {
            this.widgetLines = widgetLines;
            return this;
        }
        public Builder widgetLines(OneDashboardPageWidgetLine... widgetLines) {
            return widgetLines(List.of(widgetLines));
        }
        @CustomType.Setter
        public Builder widgetLogTables(@Nullable List<OneDashboardPageWidgetLogTable> widgetLogTables) {
            this.widgetLogTables = widgetLogTables;
            return this;
        }
        public Builder widgetLogTables(OneDashboardPageWidgetLogTable... widgetLogTables) {
            return widgetLogTables(List.of(widgetLogTables));
        }
        @CustomType.Setter
        public Builder widgetMarkdowns(@Nullable List<OneDashboardPageWidgetMarkdown> widgetMarkdowns) {
            this.widgetMarkdowns = widgetMarkdowns;
            return this;
        }
        public Builder widgetMarkdowns(OneDashboardPageWidgetMarkdown... widgetMarkdowns) {
            return widgetMarkdowns(List.of(widgetMarkdowns));
        }
        @CustomType.Setter
        public Builder widgetPies(@Nullable List<OneDashboardPageWidgetPy> widgetPies) {
            this.widgetPies = widgetPies;
            return this;
        }
        public Builder widgetPies(OneDashboardPageWidgetPy... widgetPies) {
            return widgetPies(List.of(widgetPies));
        }
        @CustomType.Setter
        public Builder widgetStackedBars(@Nullable List<OneDashboardPageWidgetStackedBar> widgetStackedBars) {
            this.widgetStackedBars = widgetStackedBars;
            return this;
        }
        public Builder widgetStackedBars(OneDashboardPageWidgetStackedBar... widgetStackedBars) {
            return widgetStackedBars(List.of(widgetStackedBars));
        }
        @CustomType.Setter
        public Builder widgetTables(@Nullable List<OneDashboardPageWidgetTable> widgetTables) {
            this.widgetTables = widgetTables;
            return this;
        }
        public Builder widgetTables(OneDashboardPageWidgetTable... widgetTables) {
            return widgetTables(List.of(widgetTables));
        }
        public OneDashboardPage build() {
            final var o = new OneDashboardPage();
            o.description = description;
            o.guid = guid;
            o.name = name;
            o.widgetAreas = widgetAreas;
            o.widgetBars = widgetBars;
            o.widgetBillboards = widgetBillboards;
            o.widgetBullets = widgetBullets;
            o.widgetFunnels = widgetFunnels;
            o.widgetHeatmaps = widgetHeatmaps;
            o.widgetHistograms = widgetHistograms;
            o.widgetJsons = widgetJsons;
            o.widgetLines = widgetLines;
            o.widgetLogTables = widgetLogTables;
            o.widgetMarkdowns = widgetMarkdowns;
            o.widgetPies = widgetPies;
            o.widgetStackedBars = widgetStackedBars;
            o.widgetTables = widgetTables;
            return o;
        }
    }
}
