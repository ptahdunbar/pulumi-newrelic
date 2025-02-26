// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class NotificationChannelPropertyArgs extends com.pulumi.resources.ResourceArgs {

    public static final NotificationChannelPropertyArgs Empty = new NotificationChannelPropertyArgs();

    /**
     * The notification property display value.
     * 
     */
    @Import(name="displayValue")
    private @Nullable Output<String> displayValue;

    /**
     * @return The notification property display value.
     * 
     */
    public Optional<Output<String>> displayValue() {
        return Optional.ofNullable(this.displayValue);
    }

    /**
     * The notification property key.
     * 
     */
    @Import(name="key", required=true)
    private Output<String> key;

    /**
     * @return The notification property key.
     * 
     */
    public Output<String> key() {
        return this.key;
    }

    /**
     * The notification property label.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The notification property label.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * The notification property value.
     * 
     */
    @Import(name="value", required=true)
    private Output<String> value;

    /**
     * @return The notification property value.
     * 
     */
    public Output<String> value() {
        return this.value;
    }

    private NotificationChannelPropertyArgs() {}

    private NotificationChannelPropertyArgs(NotificationChannelPropertyArgs $) {
        this.displayValue = $.displayValue;
        this.key = $.key;
        this.label = $.label;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(NotificationChannelPropertyArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private NotificationChannelPropertyArgs $;

        public Builder() {
            $ = new NotificationChannelPropertyArgs();
        }

        public Builder(NotificationChannelPropertyArgs defaults) {
            $ = new NotificationChannelPropertyArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param displayValue The notification property display value.
         * 
         * @return builder
         * 
         */
        public Builder displayValue(@Nullable Output<String> displayValue) {
            $.displayValue = displayValue;
            return this;
        }

        /**
         * @param displayValue The notification property display value.
         * 
         * @return builder
         * 
         */
        public Builder displayValue(String displayValue) {
            return displayValue(Output.of(displayValue));
        }

        /**
         * @param key The notification property key.
         * 
         * @return builder
         * 
         */
        public Builder key(Output<String> key) {
            $.key = key;
            return this;
        }

        /**
         * @param key The notification property key.
         * 
         * @return builder
         * 
         */
        public Builder key(String key) {
            return key(Output.of(key));
        }

        /**
         * @param label The notification property label.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The notification property label.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param value The notification property value.
         * 
         * @return builder
         * 
         */
        public Builder value(Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value The notification property value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public NotificationChannelPropertyArgs build() {
            $.key = Objects.requireNonNull($.key, "expected parameter 'key' to be non-null");
            $.value = Objects.requireNonNull($.value, "expected parameter 'value' to be non-null");
            return $;
        }
    }

}
