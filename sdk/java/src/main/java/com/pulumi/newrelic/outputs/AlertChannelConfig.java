// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class AlertChannelConfig {
    /**
     * @return The API key for integrating with OpsGenie.
     * 
     */
    private @Nullable String apiKey;
    /**
     * @return Specifies an authentication password for use with a channel.  Supported by the `webhook` channel type.
     * 
     */
    private @Nullable String authPassword;
    /**
     * @return Specifies an authentication method for use with a channel.  Supported by the `webhook` channel type.  Only HTTP basic authentication is currently supported via the value `BASIC`.
     * 
     */
    private @Nullable String authType;
    /**
     * @return Specifies an authentication username for use with a channel.  Supported by the `webhook` channel type.
     * 
     */
    private @Nullable String authUsername;
    /**
     * @return The base URL of the webhook destination.
     * 
     */
    private @Nullable String baseUrl;
    /**
     * @return The Slack channel to send notifications to.
     * 
     */
    private @Nullable String channel;
    /**
     * @return A map of key/value pairs that represents extra HTTP headers to be sent along with the webhook payload.
     * 
     */
    private @Nullable Map<String,String> headers;
    /**
     * @return Use instead of `headers` if the desired payload is more complex than a list of key/value pairs (e.g. a set of headers that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `headers`.
     * 
     */
    private @Nullable String headersString;
    /**
     * @return `true` or `false`. Flag for whether or not to attach a JSON document containing information about the associated alert to the email that is sent to recipients.
     * 
     */
    private @Nullable String includeJsonAttachment;
    /**
     * @return The key for integrating with VictorOps.
     * 
     */
    private @Nullable String key;
    /**
     * @return A map of key/value pairs that represents the webhook payload.  Must provide `payload_type` if setting this argument.
     * 
     */
    private @Nullable Map<String,String> payload;
    /**
     * @return Use instead of `payload` if the desired payload is more complex than a list of key/value pairs (e.g. a payload that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `payload`.
     * 
     */
    private @Nullable String payloadString;
    /**
     * @return Can either be `application/json` or `application/x-www-form-urlencoded`. The `payload_type` argument is _required_ if `payload` is set.
     * 
     */
    private @Nullable String payloadType;
    /**
     * @return Comma delimited list of email addresses.
     * 
     */
    private @Nullable String recipients;
    /**
     * @return The data center region to store your data.  Valid values are `US` and `EU`.  Default is `US`.
     * 
     */
    private @Nullable String region;
    /**
     * @return The route key for integrating with VictorOps.
     * 
     */
    private @Nullable String routeKey;
    /**
     * @return Specifies the service key for integrating with Pagerduty.
     * 
     */
    private @Nullable String serviceKey;
    /**
     * @return A set of tags for targeting notifications. Multiple values are comma separated.
     * 
     */
    private @Nullable String tags;
    /**
     * @return A set of teams for targeting notifications. Multiple values are comma separated.
     * 
     */
    private @Nullable String teams;
    /**
     * @return [Slack Webhook URL](https://slack.com/intl/en-es/help/articles/115005265063-Incoming-webhooks-for-Slack).
     * 
     */
    private @Nullable String url;
    private @Nullable String userId;

    private AlertChannelConfig() {}
    /**
     * @return The API key for integrating with OpsGenie.
     * 
     */
    public Optional<String> apiKey() {
        return Optional.ofNullable(this.apiKey);
    }
    /**
     * @return Specifies an authentication password for use with a channel.  Supported by the `webhook` channel type.
     * 
     */
    public Optional<String> authPassword() {
        return Optional.ofNullable(this.authPassword);
    }
    /**
     * @return Specifies an authentication method for use with a channel.  Supported by the `webhook` channel type.  Only HTTP basic authentication is currently supported via the value `BASIC`.
     * 
     */
    public Optional<String> authType() {
        return Optional.ofNullable(this.authType);
    }
    /**
     * @return Specifies an authentication username for use with a channel.  Supported by the `webhook` channel type.
     * 
     */
    public Optional<String> authUsername() {
        return Optional.ofNullable(this.authUsername);
    }
    /**
     * @return The base URL of the webhook destination.
     * 
     */
    public Optional<String> baseUrl() {
        return Optional.ofNullable(this.baseUrl);
    }
    /**
     * @return The Slack channel to send notifications to.
     * 
     */
    public Optional<String> channel() {
        return Optional.ofNullable(this.channel);
    }
    /**
     * @return A map of key/value pairs that represents extra HTTP headers to be sent along with the webhook payload.
     * 
     */
    public Map<String,String> headers() {
        return this.headers == null ? Map.of() : this.headers;
    }
    /**
     * @return Use instead of `headers` if the desired payload is more complex than a list of key/value pairs (e.g. a set of headers that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `headers`.
     * 
     */
    public Optional<String> headersString() {
        return Optional.ofNullable(this.headersString);
    }
    /**
     * @return `true` or `false`. Flag for whether or not to attach a JSON document containing information about the associated alert to the email that is sent to recipients.
     * 
     */
    public Optional<String> includeJsonAttachment() {
        return Optional.ofNullable(this.includeJsonAttachment);
    }
    /**
     * @return The key for integrating with VictorOps.
     * 
     */
    public Optional<String> key() {
        return Optional.ofNullable(this.key);
    }
    /**
     * @return A map of key/value pairs that represents the webhook payload.  Must provide `payload_type` if setting this argument.
     * 
     */
    public Map<String,String> payload() {
        return this.payload == null ? Map.of() : this.payload;
    }
    /**
     * @return Use instead of `payload` if the desired payload is more complex than a list of key/value pairs (e.g. a payload that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `payload`.
     * 
     */
    public Optional<String> payloadString() {
        return Optional.ofNullable(this.payloadString);
    }
    /**
     * @return Can either be `application/json` or `application/x-www-form-urlencoded`. The `payload_type` argument is _required_ if `payload` is set.
     * 
     */
    public Optional<String> payloadType() {
        return Optional.ofNullable(this.payloadType);
    }
    /**
     * @return Comma delimited list of email addresses.
     * 
     */
    public Optional<String> recipients() {
        return Optional.ofNullable(this.recipients);
    }
    /**
     * @return The data center region to store your data.  Valid values are `US` and `EU`.  Default is `US`.
     * 
     */
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }
    /**
     * @return The route key for integrating with VictorOps.
     * 
     */
    public Optional<String> routeKey() {
        return Optional.ofNullable(this.routeKey);
    }
    /**
     * @return Specifies the service key for integrating with Pagerduty.
     * 
     */
    public Optional<String> serviceKey() {
        return Optional.ofNullable(this.serviceKey);
    }
    /**
     * @return A set of tags for targeting notifications. Multiple values are comma separated.
     * 
     */
    public Optional<String> tags() {
        return Optional.ofNullable(this.tags);
    }
    /**
     * @return A set of teams for targeting notifications. Multiple values are comma separated.
     * 
     */
    public Optional<String> teams() {
        return Optional.ofNullable(this.teams);
    }
    /**
     * @return [Slack Webhook URL](https://slack.com/intl/en-es/help/articles/115005265063-Incoming-webhooks-for-Slack).
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }
    public Optional<String> userId() {
        return Optional.ofNullable(this.userId);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(AlertChannelConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String apiKey;
        private @Nullable String authPassword;
        private @Nullable String authType;
        private @Nullable String authUsername;
        private @Nullable String baseUrl;
        private @Nullable String channel;
        private @Nullable Map<String,String> headers;
        private @Nullable String headersString;
        private @Nullable String includeJsonAttachment;
        private @Nullable String key;
        private @Nullable Map<String,String> payload;
        private @Nullable String payloadString;
        private @Nullable String payloadType;
        private @Nullable String recipients;
        private @Nullable String region;
        private @Nullable String routeKey;
        private @Nullable String serviceKey;
        private @Nullable String tags;
        private @Nullable String teams;
        private @Nullable String url;
        private @Nullable String userId;
        public Builder() {}
        public Builder(AlertChannelConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.apiKey = defaults.apiKey;
    	      this.authPassword = defaults.authPassword;
    	      this.authType = defaults.authType;
    	      this.authUsername = defaults.authUsername;
    	      this.baseUrl = defaults.baseUrl;
    	      this.channel = defaults.channel;
    	      this.headers = defaults.headers;
    	      this.headersString = defaults.headersString;
    	      this.includeJsonAttachment = defaults.includeJsonAttachment;
    	      this.key = defaults.key;
    	      this.payload = defaults.payload;
    	      this.payloadString = defaults.payloadString;
    	      this.payloadType = defaults.payloadType;
    	      this.recipients = defaults.recipients;
    	      this.region = defaults.region;
    	      this.routeKey = defaults.routeKey;
    	      this.serviceKey = defaults.serviceKey;
    	      this.tags = defaults.tags;
    	      this.teams = defaults.teams;
    	      this.url = defaults.url;
    	      this.userId = defaults.userId;
        }

        @CustomType.Setter
        public Builder apiKey(@Nullable String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        @CustomType.Setter
        public Builder authPassword(@Nullable String authPassword) {
            this.authPassword = authPassword;
            return this;
        }
        @CustomType.Setter
        public Builder authType(@Nullable String authType) {
            this.authType = authType;
            return this;
        }
        @CustomType.Setter
        public Builder authUsername(@Nullable String authUsername) {
            this.authUsername = authUsername;
            return this;
        }
        @CustomType.Setter
        public Builder baseUrl(@Nullable String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }
        @CustomType.Setter
        public Builder channel(@Nullable String channel) {
            this.channel = channel;
            return this;
        }
        @CustomType.Setter
        public Builder headers(@Nullable Map<String,String> headers) {
            this.headers = headers;
            return this;
        }
        @CustomType.Setter
        public Builder headersString(@Nullable String headersString) {
            this.headersString = headersString;
            return this;
        }
        @CustomType.Setter
        public Builder includeJsonAttachment(@Nullable String includeJsonAttachment) {
            this.includeJsonAttachment = includeJsonAttachment;
            return this;
        }
        @CustomType.Setter
        public Builder key(@Nullable String key) {
            this.key = key;
            return this;
        }
        @CustomType.Setter
        public Builder payload(@Nullable Map<String,String> payload) {
            this.payload = payload;
            return this;
        }
        @CustomType.Setter
        public Builder payloadString(@Nullable String payloadString) {
            this.payloadString = payloadString;
            return this;
        }
        @CustomType.Setter
        public Builder payloadType(@Nullable String payloadType) {
            this.payloadType = payloadType;
            return this;
        }
        @CustomType.Setter
        public Builder recipients(@Nullable String recipients) {
            this.recipients = recipients;
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        @CustomType.Setter
        public Builder routeKey(@Nullable String routeKey) {
            this.routeKey = routeKey;
            return this;
        }
        @CustomType.Setter
        public Builder serviceKey(@Nullable String serviceKey) {
            this.serviceKey = serviceKey;
            return this;
        }
        @CustomType.Setter
        public Builder tags(@Nullable String tags) {
            this.tags = tags;
            return this;
        }
        @CustomType.Setter
        public Builder teams(@Nullable String teams) {
            this.teams = teams;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        @CustomType.Setter
        public Builder userId(@Nullable String userId) {
            this.userId = userId;
            return this;
        }
        public AlertChannelConfig build() {
            final var o = new AlertChannelConfig();
            o.apiKey = apiKey;
            o.authPassword = authPassword;
            o.authType = authType;
            o.authUsername = authUsername;
            o.baseUrl = baseUrl;
            o.channel = channel;
            o.headers = headers;
            o.headersString = headersString;
            o.includeJsonAttachment = includeJsonAttachment;
            o.key = key;
            o.payload = payload;
            o.payloadString = payloadString;
            o.payloadType = payloadType;
            o.recipients = recipients;
            o.region = region;
            o.routeKey = routeKey;
            o.serviceKey = serviceKey;
            o.tags = tags;
            o.teams = teams;
            o.url = url;
            o.userId = userId;
            return o;
        }
    }
}
