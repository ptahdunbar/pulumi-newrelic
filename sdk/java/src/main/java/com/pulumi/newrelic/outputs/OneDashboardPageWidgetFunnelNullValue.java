// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.newrelic.outputs.OneDashboardPageWidgetFunnelNullValueSeriesOverride;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetFunnelNullValue {
    /**
     * @return Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    private @Nullable String nullValue;
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    private @Nullable List<OneDashboardPageWidgetFunnelNullValueSeriesOverride> seriesOverrides;

    private OneDashboardPageWidgetFunnelNullValue() {}
    /**
     * @return Choose an option in displaying null values. Accepted values are `default`, `remove`, `preserve`, or `zero`.
     * 
     */
    public Optional<String> nullValue() {
        return Optional.ofNullable(this.nullValue);
    }
    /**
     * @return (Optional) A Nested block which will take two string attributes `color` and `series_name`. This nested block is used to customize colors of individual.
     * 
     */
    public List<OneDashboardPageWidgetFunnelNullValueSeriesOverride> seriesOverrides() {
        return this.seriesOverrides == null ? List.of() : this.seriesOverrides;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetFunnelNullValue defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String nullValue;
        private @Nullable List<OneDashboardPageWidgetFunnelNullValueSeriesOverride> seriesOverrides;
        public Builder() {}
        public Builder(OneDashboardPageWidgetFunnelNullValue defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.nullValue = defaults.nullValue;
    	      this.seriesOverrides = defaults.seriesOverrides;
        }

        @CustomType.Setter
        public Builder nullValue(@Nullable String nullValue) {
            this.nullValue = nullValue;
            return this;
        }
        @CustomType.Setter
        public Builder seriesOverrides(@Nullable List<OneDashboardPageWidgetFunnelNullValueSeriesOverride> seriesOverrides) {
            this.seriesOverrides = seriesOverrides;
            return this;
        }
        public Builder seriesOverrides(OneDashboardPageWidgetFunnelNullValueSeriesOverride... seriesOverrides) {
            return seriesOverrides(List.of(seriesOverrides));
        }
        public OneDashboardPageWidgetFunnelNullValue build() {
            final var o = new OneDashboardPageWidgetFunnelNullValue();
            o.nullValue = nullValue;
            o.seriesOverrides = seriesOverrides;
            return o;
        }
    }
}
