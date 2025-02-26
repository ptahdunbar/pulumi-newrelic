// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import com.pulumi.newrelic.inputs.OneDashboardRawPageArgs;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OneDashboardRawArgs extends com.pulumi.resources.ResourceArgs {

    public static final OneDashboardRawArgs Empty = new OneDashboardRawArgs();

    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Import(name="accountId")
    private @Nullable Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Optional<Output<Integer>> accountId() {
        return Optional.ofNullable(this.accountId);
    }

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
     * The title of the dashboard.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The title of the dashboard.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    @Import(name="pages", required=true)
    private Output<List<OneDashboardRawPageArgs>> pages;

    /**
     * @return A nested block that describes a page. See Nested page blocks below for details.
     * 
     */
    public Output<List<OneDashboardRawPageArgs>> pages() {
        return this.pages;
    }

    /**
     * Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
     * 
     */
    @Import(name="permissions")
    private @Nullable Output<String> permissions;

    /**
     * @return Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
     * 
     */
    public Optional<Output<String>> permissions() {
        return Optional.ofNullable(this.permissions);
    }

    private OneDashboardRawArgs() {}

    private OneDashboardRawArgs(OneDashboardRawArgs $) {
        this.accountId = $.accountId;
        this.description = $.description;
        this.name = $.name;
        this.pages = $.pages;
        this.permissions = $.permissions;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OneDashboardRawArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OneDashboardRawArgs $;

        public Builder() {
            $ = new OneDashboardRawArgs();
        }

        public Builder(OneDashboardRawArgs defaults) {
            $ = new OneDashboardRawArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(@Nullable Output<Integer> accountId) {
            $.accountId = accountId;
            return this;
        }

        /**
         * @param accountId Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
         * 
         * @return builder
         * 
         */
        public Builder accountId(Integer accountId) {
            return accountId(Output.of(accountId));
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
         * @param name The title of the dashboard.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
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

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(Output<List<OneDashboardRawPageArgs>> pages) {
            $.pages = pages;
            return this;
        }

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(List<OneDashboardRawPageArgs> pages) {
            return pages(Output.of(pages));
        }

        /**
         * @param pages A nested block that describes a page. See Nested page blocks below for details.
         * 
         * @return builder
         * 
         */
        public Builder pages(OneDashboardRawPageArgs... pages) {
            return pages(List.of(pages));
        }

        /**
         * @param permissions Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(@Nullable Output<String> permissions) {
            $.permissions = permissions;
            return this;
        }

        /**
         * @param permissions Determines who can see the dashboard in an account. Valid values are `private`, `public_read_only`, or `public_read_write`. Defaults to `public_read_only`.
         * 
         * @return builder
         * 
         */
        public Builder permissions(String permissions) {
            return permissions(Output.of(permissions));
        }

        public OneDashboardRawArgs build() {
            $.pages = Objects.requireNonNull($.pages, "expected parameter 'pages' to be non-null");
            return $;
        }
    }

}
