// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.synthetics.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetSecureCredentialResult {
    private Integer accountId;
    /**
     * @return The secure credential&#39;s description.
     * 
     */
    private String description;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String key;
    /**
     * @return The time the secure credential was last updated.
     * 
     */
    private String lastUpdated;

    private GetSecureCredentialResult() {}
    public Integer accountId() {
        return this.accountId;
    }
    /**
     * @return The secure credential&#39;s description.
     * 
     */
    public String description() {
        return this.description;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String key() {
        return this.key;
    }
    /**
     * @return The time the secure credential was last updated.
     * 
     */
    public String lastUpdated() {
        return this.lastUpdated;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecureCredentialResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Integer accountId;
        private String description;
        private String id;
        private String key;
        private String lastUpdated;
        public Builder() {}
        public Builder(GetSecureCredentialResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accountId = defaults.accountId;
    	      this.description = defaults.description;
    	      this.id = defaults.id;
    	      this.key = defaults.key;
    	      this.lastUpdated = defaults.lastUpdated;
        }

        @CustomType.Setter
        public Builder accountId(Integer accountId) {
            this.accountId = Objects.requireNonNull(accountId);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder lastUpdated(String lastUpdated) {
            this.lastUpdated = Objects.requireNonNull(lastUpdated);
            return this;
        }
        public GetSecureCredentialResult build() {
            final var o = new GetSecureCredentialResult();
            o.accountId = accountId;
            o.description = description;
            o.id = id;
            o.key = key;
            o.lastUpdated = lastUpdated;
            return o;
        }
    }
}
