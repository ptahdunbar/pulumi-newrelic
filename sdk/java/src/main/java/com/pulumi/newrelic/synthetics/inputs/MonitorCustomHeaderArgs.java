// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class MonitorCustomHeaderArgs extends com.pulumi.resources.ResourceArgs {

    public static final MonitorCustomHeaderArgs Empty = new MonitorCustomHeaderArgs();

    /**
     * Header name.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Header name.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Header Value.
     * 
     */
    @Import(name="value")
    private @Nullable Output<String> value;

    /**
     * @return Header Value.
     * 
     */
    public Optional<Output<String>> value() {
        return Optional.ofNullable(this.value);
    }

    private MonitorCustomHeaderArgs() {}

    private MonitorCustomHeaderArgs(MonitorCustomHeaderArgs $) {
        this.name = $.name;
        this.value = $.value;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(MonitorCustomHeaderArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MonitorCustomHeaderArgs $;

        public Builder() {
            $ = new MonitorCustomHeaderArgs();
        }

        public Builder(MonitorCustomHeaderArgs defaults) {
            $ = new MonitorCustomHeaderArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name Header name.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Header name.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param value Header Value.
         * 
         * @return builder
         * 
         */
        public Builder value(@Nullable Output<String> value) {
            $.value = value;
            return this;
        }

        /**
         * @param value Header Value.
         * 
         * @return builder
         * 
         */
        public Builder value(String value) {
            return value(Output.of(value));
        }

        public MonitorCustomHeaderArgs build() {
            return $;
        }
    }

}
