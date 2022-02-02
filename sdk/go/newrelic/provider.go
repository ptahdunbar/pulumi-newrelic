// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The provider type for the newrelic package. By default, resources use package-wide configuration
// settings, however an explicit `Provider` instance may be created and passed during resource
// construction to achieve fine-grained programmatic control over provider settings. See the
// [documentation](https://www.pulumi.com/docs/reference/programming-model/#providers) for more information.
type Provider struct {
	pulumi.ProviderResourceState

	AdminApiKey pulumi.StringPtrOutput `pulumi:"adminApiKey"`
	ApiKey      pulumi.StringPtrOutput `pulumi:"apiKey"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	ApiUrl     pulumi.StringPtrOutput `pulumi:"apiUrl"`
	CacertFile pulumi.StringPtrOutput `pulumi:"cacertFile"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	InfrastructureApiUrl pulumi.StringPtrOutput `pulumi:"infrastructureApiUrl"`
	InsightsInsertKey    pulumi.StringPtrOutput `pulumi:"insightsInsertKey"`
	InsightsInsertUrl    pulumi.StringPtrOutput `pulumi:"insightsInsertUrl"`
	InsightsQueryUrl     pulumi.StringPtrOutput `pulumi:"insightsQueryUrl"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	NerdgraphApiUrl pulumi.StringPtrOutput `pulumi:"nerdgraphApiUrl"`
	// The data center for which your New Relic account is configured. Only one region per provider block is permitted.
	Region pulumi.StringPtrOutput `pulumi:"region"`
	// Deprecated: New Relic internal use only. API URLs are now configured based on the configured region.
	SyntheticsApiUrl pulumi.StringPtrOutput `pulumi:"syntheticsApiUrl"`
}

// NewProvider registers a new resource with the given unique name, arguments, and options.
func NewProvider(ctx *pulumi.Context,
	name string, args *ProviderArgs, opts ...pulumi.ResourceOption) (*Provider, error) {
	if args == nil {
		args = &ProviderArgs{}
	}

	if isZero(args.AccountId) {
		args.AccountId = pulumi.IntPtr(getEnvOrDefault(0, parseEnvInt, "NEW_RELIC_ACCOUNT_ID").(int))
	}
	if isZero(args.Region) {
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

type ProviderInput interface {
	pulumi.Input

	ToProviderOutput() ProviderOutput
	ToProviderOutputWithContext(ctx context.Context) ProviderOutput
}

func (*Provider) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (i *Provider) ToProviderOutput() ProviderOutput {
	return i.ToProviderOutputWithContext(context.Background())
}

func (i *Provider) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProviderOutput)
}

type ProviderOutput struct{ *pulumi.OutputState }

func (ProviderOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Provider)(nil)).Elem()
}

func (o ProviderOutput) ToProviderOutput() ProviderOutput {
	return o
}

func (o ProviderOutput) ToProviderOutputWithContext(ctx context.Context) ProviderOutput {
	return o
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProviderInput)(nil)).Elem(), &Provider{})
	pulumi.RegisterOutputType(ProviderOutput{})
}
