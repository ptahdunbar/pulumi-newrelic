// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class OneDashboardPageWidgetMarkdown {
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    private Integer column;
    /**
     * @return (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    private @Nullable Integer height;
    private @Nullable String id;
    /**
     * @return (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    private @Nullable Boolean ignoreTimeRange;
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    private Integer row;
    /**
     * @return (Required) The markdown source to be rendered in the widget.
     * 
     */
    private @Nullable String text;
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    private String title;
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    private @Nullable Integer width;

    private OneDashboardPageWidgetMarkdown() {}
    /**
     * @return (Required) Column position of widget from top left, starting at `1`.
     * 
     */
    public Integer column() {
        return this.column;
    }
    /**
     * @return (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     * 
     */
    public Optional<Integer> height() {
        return Optional.ofNullable(this.height);
    }
    public Optional<String> id() {
        return Optional.ofNullable(this.id);
    }
    /**
     * @return (Optional) With this turned on, the time range in this query will override the time picker on dashboards and other pages. Defaults to `false`.
     * 
     */
    public Optional<Boolean> ignoreTimeRange() {
        return Optional.ofNullable(this.ignoreTimeRange);
    }
    /**
     * @return (Required) Row position of widget from top left, starting at `1`.
     * 
     */
    public Integer row() {
        return this.row;
    }
    /**
     * @return (Required) The markdown source to be rendered in the widget.
     * 
     */
    public Optional<String> text() {
        return Optional.ofNullable(this.text);
    }
    /**
     * @return (Optional) A human-friendly display string for this value.
     * 
     */
    public String title() {
        return this.title;
    }
    /**
     * @return (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     * 
     */
    public Optional<Integer> width() {
        return Optional.ofNullable(this.width);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(OneDashboardPageWidgetMarkdown defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer column;
        private @Nullable Integer height;
        private @Nullable String id;
        private @Nullable Boolean ignoreTimeRange;
        private Integer row;
        private @Nullable String text;
        private String title;
        private @Nullable Integer width;
        public Builder() {}
        public Builder(OneDashboardPageWidgetMarkdown defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.column = defaults.column;
    	      this.height = defaults.height;
    	      this.id = defaults.id;
    	      this.ignoreTimeRange = defaults.ignoreTimeRange;
    	      this.row = defaults.row;
    	      this.text = defaults.text;
    	      this.title = defaults.title;
    	      this.width = defaults.width;
        }

        @CustomType.Setter
        public Builder column(Integer column) {
            this.column = Objects.requireNonNull(column);
            return this;
        }
        @CustomType.Setter
        public Builder height(@Nullable Integer height) {
            this.height = height;
            return this;
        }
        @CustomType.Setter
        public Builder id(@Nullable String id) {
            this.id = id;
            return this;
        }
        @CustomType.Setter
        public Builder ignoreTimeRange(@Nullable Boolean ignoreTimeRange) {
            this.ignoreTimeRange = ignoreTimeRange;
            return this;
        }
        @CustomType.Setter
        public Builder row(Integer row) {
            this.row = Objects.requireNonNull(row);
            return this;
        }
        @CustomType.Setter
        public Builder text(@Nullable String text) {
            this.text = text;
            return this;
        }
        @CustomType.Setter
        public Builder title(String title) {
            this.title = Objects.requireNonNull(title);
            return this;
        }
        @CustomType.Setter
        public Builder width(@Nullable Integer width) {
            this.width = width;
            return this;
        }
        public OneDashboardPageWidgetMarkdown build() {
            final var o = new OneDashboardPageWidgetMarkdown();
            o.column = column;
            o.height = height;
            o.id = id;
            o.ignoreTimeRange = ignoreTimeRange;
            o.row = row;
            o.text = text;
            o.title = title;
            o.width = width;
            return o;
        }
    }
}
