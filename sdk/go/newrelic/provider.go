// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"reflect"

	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

// The provider type for the newrelic package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}
	if args.AccountId == nil {
		args.AccountId = pulumi.IntPtr(getEnvOrDefault(0, parseEnvInt, "NEW_RELIC_ACCOUNT_ID").(int))
	}
	if args.AdminApiKey == nil {
		args.AdminApiKey = pulumi.StringPtr(getEnvOrDefault("", nil, "NEW_RELIC_ADMIN_API_KEY").(string))
	}
	if args.ApiKey == nil {
		args.ApiKey = pulumi.StringPtr(getEnvOrDefault("", nil, "NEW_RELIC_API_KEY").(string))
	}
	if args.CacertFile == nil {
		args.CacertFile = pulumi.StringPtr(getEnvOrDefault("", nil, "NEW_RELIC_API_CACERT").(string))
	}
	if args.InsecureSkipVerify == nil {
		args.InsecureSkipVerify = pulumi.BoolPtr(getEnvOrDefault(false, parseEnvBool, "NEW_RELIC_API_SKIP_VERIFY").(bool))
	}
	if args.InsightsInsertKey == nil {
		args.InsightsInsertKey = pulumi.StringPtr(getEnvOrDefault("", nil, "NEW_RELIC_INSIGHTS_INSERT_KEY").(string))
	}
	if args.InsightsInsertUrl == nil {
		args.InsightsInsertUrl = pulumi.StringPtr(getEnvOrDefault("https://insights-collector.newrelic.com/v1/accounts", nil, "NEW_RELIC_INSIGHTS_INSERT_URL").(string))
	}
	if args.InsightsQueryUrl == nil {
		args.InsightsQueryUrl = pulumi.StringPtr(getEnvOrDefault("https://insights-api.newrelic.com/v1/accounts", nil, "NEW_RELIC_INSIGHTS_QUERY_URL").(string))
	}
	if args.Region == nil {
		args.Region = pulumi.StringPtr(getEnvOrDefault("US", nil, "NEW_RELIC_REGION").(string))
	}
	var resource Provider
	err := ctx.RegisterResource("pulumi:providers:newrelic", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

type providerArgs struct {
	AccountId   *int    `pulumi:"accountId"`
	AdminApiKey *string `pulumi:"adminApiKey"`
	ApiKey      *string `pulumi:"apiKey"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	ApiUrl     *string `pulumi:"apiUrl"`
	CacertFile *string `pulumi:"cacertFile"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	InfrastructureApiUrl *string `pulumi:"infrastructureApiUrl"`
	InsecureSkipVerify   *bool   `pulumi:"insecureSkipVerify"`
	InsightsInsertKey    *string `pulumi:"insightsInsertKey"`
	InsightsInsertUrl    *string `pulumi:"insightsInsertUrl"`
	InsightsQueryUrl     *string `pulumi:"insightsQueryUrl"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	NerdgraphApiUrl *string `pulumi:"nerdgraphApiUrl"`
	// The data center for which your New Relic account is configured. Only one region per provider block is permitted.
	Region *string `pulumi:"region"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	SyntheticsApiUrl *string `pulumi:"syntheticsApiUrl"`
}

// The set of arguments for constructing a Provider resource.
type ProviderArgs struct {
	AccountId   pulumi.IntPtrInput
	AdminApiKey pulumi.StringPtrInput
	ApiKey      pulumi.StringPtrInput
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	ApiUrl     pulumi.StringPtrInput
	CacertFile pulumi.StringPtrInput
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	InfrastructureApiUrl pulumi.StringPtrInput
	InsecureSkipVerify   pulumi.BoolPtrInput
	InsightsInsertKey    pulumi.StringPtrInput
	InsightsInsertUrl    pulumi.StringPtrInput
	InsightsQueryUrl     pulumi.StringPtrInput
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	NerdgraphApiUrl pulumi.StringPtrInput
	// The data center for which your New Relic account is configured. Only one region per provider block is permitted.
	Region pulumi.StringPtrInput
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	SyntheticsApiUrl pulumi.StringPtrInput
}

func (ProviderArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*providerArgs)(nil)).Elem()
}
