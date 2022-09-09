// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotificationDestinationAuthToken {
    /**
     * @return The prefix of the token auth.
     * 
     */
    private @Nullable String prefix;
    /**
     * @return Specifies the token for integrating.
     * 
     */
    private String token;

    private NotificationDestinationAuthToken() {}
    /**
     * @return The prefix of the token auth.
     * 
     */
    public Optional<String> prefix() {
        return Optional.ofNullable(this.prefix);
    }
    /**
     * @return Specifies the token for integrating.
     * 
     */
    public String token() {
        return this.token;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotificationDestinationAuthToken defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String prefix;
        private String token;
        public Builder() {}
        public Builder(NotificationDestinationAuthToken defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.prefix = defaults.prefix;
    	      this.token = defaults.token;
        }

        @CustomType.Setter
        public Builder prefix(@Nullable String prefix) {
            this.prefix = prefix;
            return this;
        }
        @CustomType.Setter
        public Builder token(String token) {
            this.token = Objects.requireNonNull(token);
            return this;
        }
        public NotificationDestinationAuthToken build() {
            final var o = new NotificationDestinationAuthToken();
            o.prefix = prefix;
            o.token = token;
            return o;
        }
    }
}
