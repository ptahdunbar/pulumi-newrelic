// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to link an Azure account to New Relic.
//
// ## Prerequisite
//
// Some configuration is required in Azure for the New Relic Azure cloud integrations to be able to pull data.
//
// To start receiving Azure data with New Relic Azure integrations, connect your Azure account to New Relic infrastructure monitoring. If you don't have one already, create a New Relic account. It's free, forever.
//
// Setup is required in Azure for this resource to work properly. You can find instructions on how to set up Azure on [our documentation](https://docs.newrelic.com/docs/infrastructure/microsoft-azure-integrations/get-started/activate-azure-integrations/).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/cloud"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := cloud.NewAzureLinkAccount(ctx, "foo", &cloud.AzureLinkAccountArgs{
// 			AccountId:      pulumi.Int("The New Relic account ID where you want to link the Azure account"),
// 			ApplicationId:  pulumi.String("ID of the application"),
// 			ClientSecret:   pulumi.String("Secret value of client's Azure account"),
// 			SubscriptionId: pulumi.String("Subscription ID of Azure"),
// 			TenantId:       pulumi.String("Tenant ID of the Azure"),
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
// Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic bash
//
// ```sh
//  $ pulumi import newrelic:cloud/azureLinkAccount:AzureLinkAccount foo <id>
// ```
type AzureLinkAccount struct {
	pulumi.CustomResourceState

	// - Account ID of the New Relic.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// - Application ID of the App.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// - Secret Value of the client.
	ClientSecret pulumi.StringOutput `pulumi:"clientSecret"`
	// - The name of the application in New Relic APM.
	Name pulumi.StringOutput `pulumi:"name"`
	// - Subscription ID of the Azure cloud account.
	SubscriptionId pulumi.StringOutput `pulumi:"subscriptionId"`
	// - Tenant ID of the Azure cloud account.
	TenantId pulumi.StringOutput `pulumi:"tenantId"`
}

// NewAzureLinkAccount registers a new resource with the given unique name, arguments, and options.
func NewAzureLinkAccount(ctx *pulumi.Context,
	name string, args *AzureLinkAccountArgs, opts ...pulumi.ResourceOption) (*AzureLinkAccount, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationId == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationId'")
	}
	if args.ClientSecret == nil {
		return nil, errors.New("invalid value for required argument 'ClientSecret'")
	}
	if args.SubscriptionId == nil {
		return nil, errors.New("invalid value for required argument 'SubscriptionId'")
	}
	if args.TenantId == nil {
		return nil, errors.New("invalid value for required argument 'TenantId'")
	}
	var resource AzureLinkAccount
	err := ctx.RegisterResource("newrelic:cloud/azureLinkAccount:AzureLinkAccount", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAzureLinkAccount gets an existing AzureLinkAccount resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAzureLinkAccount(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AzureLinkAccountState, opts ...pulumi.ResourceOption) (*AzureLinkAccount, error) {
	var resource AzureLinkAccount
	err := ctx.ReadResource("newrelic:cloud/azureLinkAccount:AzureLinkAccount", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AzureLinkAccount resources.
type azureLinkAccountState struct {
	// - Account ID of the New Relic.
	AccountId *int `pulumi:"accountId"`
	// - Application ID of the App.
	ApplicationId *string `pulumi:"applicationId"`
	// - Secret Value of the client.
	ClientSecret *string `pulumi:"clientSecret"`
	// - The name of the application in New Relic APM.
	Name *string `pulumi:"name"`
	// - Subscription ID of the Azure cloud account.
	SubscriptionId *string `pulumi:"subscriptionId"`
	// - Tenant ID of the Azure cloud account.
	TenantId *string `pulumi:"tenantId"`
}

type AzureLinkAccountState struct {
	// - Account ID of the New Relic.
	AccountId pulumi.IntPtrInput
	// - Application ID of the App.
	ApplicationId pulumi.StringPtrInput
	// - Secret Value of the client.
	ClientSecret pulumi.StringPtrInput
	// - The name of the application in New Relic APM.
	Name pulumi.StringPtrInput
	// - Subscription ID of the Azure cloud account.
	SubscriptionId pulumi.StringPtrInput
	// - Tenant ID of the Azure cloud account.
	TenantId pulumi.StringPtrInput
}

func (AzureLinkAccountState) ElementType() reflect.Type {
	return reflect.TypeOf((*azureLinkAccountState)(nil)).Elem()
}

type azureLinkAccountArgs struct {
	// - Account ID of the New Relic.
	AccountId *int `pulumi:"accountId"`
	// - Application ID of the App.
	ApplicationId string `pulumi:"applicationId"`
	// - Secret Value of the client.
	ClientSecret string `pulumi:"clientSecret"`
	// - The name of the application in New Relic APM.
	Name *string `pulumi:"name"`
	// - Subscription ID of the Azure cloud account.
	SubscriptionId string `pulumi:"subscriptionId"`
	// - Tenant ID of the Azure cloud account.
	TenantId string `pulumi:"tenantId"`
}

// The set of arguments for constructing a AzureLinkAccount resource.
type AzureLinkAccountArgs struct {
	// - Account ID of the New Relic.
	AccountId pulumi.IntPtrInput
	// - Application ID of the App.
	ApplicationId pulumi.StringInput
	// - Secret Value of the client.
	ClientSecret pulumi.StringInput
	// - The name of the application in New Relic APM.
	Name pulumi.StringPtrInput
	// - Subscription ID of the Azure cloud account.
	SubscriptionId pulumi.StringInput
	// - Tenant ID of the Azure cloud account.
	TenantId pulumi.StringInput
}

func (AzureLinkAccountArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*azureLinkAccountArgs)(nil)).Elem()
}

type AzureLinkAccountInput interface {
	pulumi.Input

	ToAzureLinkAccountOutput() AzureLinkAccountOutput
	ToAzureLinkAccountOutputWithContext(ctx context.Context) AzureLinkAccountOutput
}

func (*AzureLinkAccount) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureLinkAccount)(nil)).Elem()
}

func (i *AzureLinkAccount) ToAzureLinkAccountOutput() AzureLinkAccountOutput {
	return i.ToAzureLinkAccountOutputWithContext(context.Background())
}

func (i *AzureLinkAccount) ToAzureLinkAccountOutputWithContext(ctx context.Context) AzureLinkAccountOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureLinkAccountOutput)
}

// AzureLinkAccountArrayInput is an input type that accepts AzureLinkAccountArray and AzureLinkAccountArrayOutput values.
// You can construct a concrete instance of `AzureLinkAccountArrayInput` via:
//
//          AzureLinkAccountArray{ AzureLinkAccountArgs{...} }
type AzureLinkAccountArrayInput interface {
	pulumi.Input

	ToAzureLinkAccountArrayOutput() AzureLinkAccountArrayOutput
	ToAzureLinkAccountArrayOutputWithContext(context.Context) AzureLinkAccountArrayOutput
}

type AzureLinkAccountArray []AzureLinkAccountInput

func (AzureLinkAccountArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureLinkAccount)(nil)).Elem()
}

func (i AzureLinkAccountArray) ToAzureLinkAccountArrayOutput() AzureLinkAccountArrayOutput {
	return i.ToAzureLinkAccountArrayOutputWithContext(context.Background())
}

func (i AzureLinkAccountArray) ToAzureLinkAccountArrayOutputWithContext(ctx context.Context) AzureLinkAccountArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureLinkAccountArrayOutput)
}

// AzureLinkAccountMapInput is an input type that accepts AzureLinkAccountMap and AzureLinkAccountMapOutput values.
// You can construct a concrete instance of `AzureLinkAccountMapInput` via:
//
//          AzureLinkAccountMap{ "key": AzureLinkAccountArgs{...} }
type AzureLinkAccountMapInput interface {
	pulumi.Input

	ToAzureLinkAccountMapOutput() AzureLinkAccountMapOutput
	ToAzureLinkAccountMapOutputWithContext(context.Context) AzureLinkAccountMapOutput
}

type AzureLinkAccountMap map[string]AzureLinkAccountInput

func (AzureLinkAccountMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureLinkAccount)(nil)).Elem()
}

func (i AzureLinkAccountMap) ToAzureLinkAccountMapOutput() AzureLinkAccountMapOutput {
	return i.ToAzureLinkAccountMapOutputWithContext(context.Background())
}

func (i AzureLinkAccountMap) ToAzureLinkAccountMapOutputWithContext(ctx context.Context) AzureLinkAccountMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AzureLinkAccountMapOutput)
}

type AzureLinkAccountOutput struct{ *pulumi.OutputState }

func (AzureLinkAccountOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AzureLinkAccount)(nil)).Elem()
}

func (o AzureLinkAccountOutput) ToAzureLinkAccountOutput() AzureLinkAccountOutput {
	return o
}

func (o AzureLinkAccountOutput) ToAzureLinkAccountOutputWithContext(ctx context.Context) AzureLinkAccountOutput {
	return o
}

// - Account ID of the New Relic.
func (o AzureLinkAccountOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// - Application ID of the App.
func (o AzureLinkAccountOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// - Secret Value of the client.
func (o AzureLinkAccountOutput) ClientSecret() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.StringOutput { return v.ClientSecret }).(pulumi.StringOutput)
}

// - The name of the application in New Relic APM.
func (o AzureLinkAccountOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// - Subscription ID of the Azure cloud account.
func (o AzureLinkAccountOutput) SubscriptionId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.StringOutput { return v.SubscriptionId }).(pulumi.StringOutput)
}

// - Tenant ID of the Azure cloud account.
func (o AzureLinkAccountOutput) TenantId() pulumi.StringOutput {
	return o.ApplyT(func(v *AzureLinkAccount) pulumi.StringOutput { return v.TenantId }).(pulumi.StringOutput)
}

type AzureLinkAccountArrayOutput struct{ *pulumi.OutputState }

func (AzureLinkAccountArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AzureLinkAccount)(nil)).Elem()
}

func (o AzureLinkAccountArrayOutput) ToAzureLinkAccountArrayOutput() AzureLinkAccountArrayOutput {
	return o
}

func (o AzureLinkAccountArrayOutput) ToAzureLinkAccountArrayOutputWithContext(ctx context.Context) AzureLinkAccountArrayOutput {
	return o
}

func (o AzureLinkAccountArrayOutput) Index(i pulumi.IntInput) AzureLinkAccountOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AzureLinkAccount {
		return vs[0].([]*AzureLinkAccount)[vs[1].(int)]
	}).(AzureLinkAccountOutput)
}

type AzureLinkAccountMapOutput struct{ *pulumi.OutputState }

func (AzureLinkAccountMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AzureLinkAccount)(nil)).Elem()
}

func (o AzureLinkAccountMapOutput) ToAzureLinkAccountMapOutput() AzureLinkAccountMapOutput {
	return o
}

func (o AzureLinkAccountMapOutput) ToAzureLinkAccountMapOutputWithContext(ctx context.Context) AzureLinkAccountMapOutput {
	return o
}

func (o AzureLinkAccountMapOutput) MapIndex(k pulumi.StringInput) AzureLinkAccountOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AzureLinkAccount {
		return vs[0].(map[string]*AzureLinkAccount)[vs[1].(string)]
	}).(AzureLinkAccountOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AzureLinkAccountInput)(nil)).Elem(), &AzureLinkAccount{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureLinkAccountArrayInput)(nil)).Elem(), AzureLinkAccountArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AzureLinkAccountMapInput)(nil)).Elem(), AzureLinkAccountMap{})
	pulumi.RegisterOutputType(AzureLinkAccountOutput{})
	pulumi.RegisterOutputType(AzureLinkAccountArrayOutput{})
	pulumi.RegisterOutputType(AzureLinkAccountMapOutput{})
}
