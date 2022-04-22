// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to programmatically create and manage the following types of keys:
// - [User API keys](https://docs.newrelic.com/docs/apis/get-started/intro-apis/types-new-relic-api-keys#user-api-key)
// - License (or ingest) keys, including:
//     - General [license key](https://docs.newrelic.com/docs/accounts/install-new-relic/account-setup/license-key) used for APM
//     - [Browser license key](https://docs.newrelic.com/docs/browser/new-relic-browser/configuration/copy-browser-monitoring-license-key-app-id)
//
// Please visit the New Relic article ['Use NerdGraph to manage license keys and User API keys'](https://docs.newrelic.com/docs/apis/nerdgraph/examples/use-nerdgraph-manage-license-keys-user-keys)
// for more information.
//
// > **IMPORTANT!**
// Please be very careful when updating existing `ApiAccessKey` resources as only `newrelic_api_access_key.name`
// and `newrelic_api_access_key.notes` are updatable. All other resource attributes will force a resource recreation which will
// invalidate the previous API key(s).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := newrelic.NewApiAccessKey(ctx, "foobar", &newrelic.ApiAccessKeyArgs{
// 			AccountId:  pulumi.Int(1234567),
// 			IngestType: pulumi.String("LICENSE"),
// 			KeyType:    pulumi.String("INGEST"),
// 			Notes:      pulumi.String("To be used with service X"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Existing API access keys can be imported using a composite ID of `<api_access_key_id>:<key_type>`. `<key_type>` will be either `INGEST` or `USER`. For example
//
// ```sh
//  $ pulumi import newrelic:index/apiAccessKey:ApiAccessKey foobar "1234567:INGEST"
// ```
type ApiAccessKey struct {
	pulumi.CustomResourceState

	// The New Relic account ID of the account you wish to create the API access key.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
	IngestType pulumi.StringOutput `pulumi:"ingestType"`
	// The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
	Key pulumi.StringOutput `pulumi:"key"`
	// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
	KeyType pulumi.StringOutput `pulumi:"keyType"`
	// The name of the key.
	Name pulumi.StringOutput `pulumi:"name"`
	// Any notes about this ingest key.
	Notes pulumi.StringOutput `pulumi:"notes"`
	// Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
	UserId pulumi.IntOutput `pulumi:"userId"`
}

// NewApiAccessKey registers a new resource with the given unique name, arguments, and options.
func NewApiAccessKey(ctx *pulumi.Context,
	name string, args *ApiAccessKeyArgs, opts ...pulumi.ResourceOption) (*ApiAccessKey, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AccountId == nil {
		return nil, errors.New("invalid value for required argument 'AccountId'")
	}
	if args.KeyType == nil {
		return nil, errors.New("invalid value for required argument 'KeyType'")
	}
	var resource ApiAccessKey
	err := ctx.RegisterResource("newrelic:index/apiAccessKey:ApiAccessKey", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApiAccessKey gets an existing ApiAccessKey resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApiAccessKey(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApiAccessKeyState, opts ...pulumi.ResourceOption) (*ApiAccessKey, error) {
	var resource ApiAccessKey
	err := ctx.ReadResource("newrelic:index/apiAccessKey:ApiAccessKey", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApiAccessKey resources.
type apiAccessKeyState struct {
	// The New Relic account ID of the account you wish to create the API access key.
	AccountId *int `pulumi:"accountId"`
	// Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
	IngestType *string `pulumi:"ingestType"`
	// The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
	Key *string `pulumi:"key"`
	// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
	KeyType *string `pulumi:"keyType"`
	// The name of the key.
	Name *string `pulumi:"name"`
	// Any notes about this ingest key.
	Notes *string `pulumi:"notes"`
	// Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
	UserId *int `pulumi:"userId"`
}

type ApiAccessKeyState struct {
	// The New Relic account ID of the account you wish to create the API access key.
	AccountId pulumi.IntPtrInput
	// Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
	IngestType pulumi.StringPtrInput
	// The actual API key. This attribute is masked and not be visible in your terminal, CI, etc.
	Key pulumi.StringPtrInput
	// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
	KeyType pulumi.StringPtrInput
	// The name of the key.
	Name pulumi.StringPtrInput
	// Any notes about this ingest key.
	Notes pulumi.StringPtrInput
	// Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
	UserId pulumi.IntPtrInput
}

func (ApiAccessKeyState) ElementType() reflect.Type {
	return reflect.TypeOf((*apiAccessKeyState)(nil)).Elem()
}

type apiAccessKeyArgs struct {
	// The New Relic account ID of the account you wish to create the API access key.
	AccountId int `pulumi:"accountId"`
	// Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
	IngestType *string `pulumi:"ingestType"`
	// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
	KeyType string `pulumi:"keyType"`
	// The name of the key.
	Name *string `pulumi:"name"`
	// Any notes about this ingest key.
	Notes *string `pulumi:"notes"`
	// Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
	UserId *int `pulumi:"userId"`
}

// The set of arguments for constructing a ApiAccessKey resource.
type ApiAccessKeyArgs struct {
	// The New Relic account ID of the account you wish to create the API access key.
	AccountId pulumi.IntInput
	// Required if `keyType = INGEST`. Valid options are `BROWSER` or `LICENSE`, case-sensitive.
	IngestType pulumi.StringPtrInput
	// What type of API key to create. Valid options are `INGEST` or `USER`, case-sensitive.
	KeyType pulumi.StringInput
	// The name of the key.
	Name pulumi.StringPtrInput
	// Any notes about this ingest key.
	Notes pulumi.StringPtrInput
	// Required if `keyType = USER`. The New Relic user ID yous wish to create the API access key for in an account.
	UserId pulumi.IntPtrInput
}

func (ApiAccessKeyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*apiAccessKeyArgs)(nil)).Elem()
}

type ApiAccessKeyInput interface {
	pulumi.Input

	ToApiAccessKeyOutput() ApiAccessKeyOutput
	ToApiAccessKeyOutputWithContext(ctx context.Context) ApiAccessKeyOutput
}

func (*ApiAccessKey) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiAccessKey)(nil)).Elem()
}

func (i *ApiAccessKey) ToApiAccessKeyOutput() ApiAccessKeyOutput {
	return i.ToApiAccessKeyOutputWithContext(context.Background())
}

func (i *ApiAccessKey) ToApiAccessKeyOutputWithContext(ctx context.Context) ApiAccessKeyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiAccessKeyOutput)
}

// ApiAccessKeyArrayInput is an input type that accepts ApiAccessKeyArray and ApiAccessKeyArrayOutput values.
// You can construct a concrete instance of `ApiAccessKeyArrayInput` via:
//
//          ApiAccessKeyArray{ ApiAccessKeyArgs{...} }
type ApiAccessKeyArrayInput interface {
	pulumi.Input

	ToApiAccessKeyArrayOutput() ApiAccessKeyArrayOutput
	ToApiAccessKeyArrayOutputWithContext(context.Context) ApiAccessKeyArrayOutput
}

type ApiAccessKeyArray []ApiAccessKeyInput

func (ApiAccessKeyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiAccessKey)(nil)).Elem()
}

func (i ApiAccessKeyArray) ToApiAccessKeyArrayOutput() ApiAccessKeyArrayOutput {
	return i.ToApiAccessKeyArrayOutputWithContext(context.Background())
}

func (i ApiAccessKeyArray) ToApiAccessKeyArrayOutputWithContext(ctx context.Context) ApiAccessKeyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiAccessKeyArrayOutput)
}

// ApiAccessKeyMapInput is an input type that accepts ApiAccessKeyMap and ApiAccessKeyMapOutput values.
// You can construct a concrete instance of `ApiAccessKeyMapInput` via:
//
//          ApiAccessKeyMap{ "key": ApiAccessKeyArgs{...} }
type ApiAccessKeyMapInput interface {
	pulumi.Input

	ToApiAccessKeyMapOutput() ApiAccessKeyMapOutput
	ToApiAccessKeyMapOutputWithContext(context.Context) ApiAccessKeyMapOutput
}

type ApiAccessKeyMap map[string]ApiAccessKeyInput

func (ApiAccessKeyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiAccessKey)(nil)).Elem()
}

func (i ApiAccessKeyMap) ToApiAccessKeyMapOutput() ApiAccessKeyMapOutput {
	return i.ToApiAccessKeyMapOutputWithContext(context.Background())
}

func (i ApiAccessKeyMap) ToApiAccessKeyMapOutputWithContext(ctx context.Context) ApiAccessKeyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApiAccessKeyMapOutput)
}

type ApiAccessKeyOutput struct{ *pulumi.OutputState }

func (ApiAccessKeyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApiAccessKey)(nil)).Elem()
}

func (o ApiAccessKeyOutput) ToApiAccessKeyOutput() ApiAccessKeyOutput {
	return o
}

func (o ApiAccessKeyOutput) ToApiAccessKeyOutputWithContext(ctx context.Context) ApiAccessKeyOutput {
	return o
}

type ApiAccessKeyArrayOutput struct{ *pulumi.OutputState }

func (ApiAccessKeyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApiAccessKey)(nil)).Elem()
}

func (o ApiAccessKeyArrayOutput) ToApiAccessKeyArrayOutput() ApiAccessKeyArrayOutput {
	return o
}

func (o ApiAccessKeyArrayOutput) ToApiAccessKeyArrayOutputWithContext(ctx context.Context) ApiAccessKeyArrayOutput {
	return o
}

func (o ApiAccessKeyArrayOutput) Index(i pulumi.IntInput) ApiAccessKeyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApiAccessKey {
		return vs[0].([]*ApiAccessKey)[vs[1].(int)]
	}).(ApiAccessKeyOutput)
}

type ApiAccessKeyMapOutput struct{ *pulumi.OutputState }

func (ApiAccessKeyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApiAccessKey)(nil)).Elem()
}

func (o ApiAccessKeyMapOutput) ToApiAccessKeyMapOutput() ApiAccessKeyMapOutput {
	return o
}

func (o ApiAccessKeyMapOutput) ToApiAccessKeyMapOutputWithContext(ctx context.Context) ApiAccessKeyMapOutput {
	return o
}

func (o ApiAccessKeyMapOutput) MapIndex(k pulumi.StringInput) ApiAccessKeyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApiAccessKey {
		return vs[0].(map[string]*ApiAccessKey)[vs[1].(string)]
	}).(ApiAccessKeyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApiAccessKeyInput)(nil)).Elem(), &ApiAccessKey{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiAccessKeyArrayInput)(nil)).Elem(), ApiAccessKeyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApiAccessKeyMapInput)(nil)).Elem(), ApiAccessKeyMap{})
	pulumi.RegisterOutputType(ApiAccessKeyOutput{})
	pulumi.RegisterOutputType(ApiAccessKeyArrayOutput{})
	pulumi.RegisterOutputType(ApiAccessKeyMapOutput{})
}
