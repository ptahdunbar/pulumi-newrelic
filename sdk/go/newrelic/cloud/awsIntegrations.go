// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package cloud

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Import
//
// Linked AWS account integrations can be imported using the `id`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:cloud/awsIntegrations:AwsIntegrations foo <id>
//
// ```
type AwsIntegrations struct {
	pulumi.CustomResourceState

	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Billing integration. See Integration blocks below for details.
	Billing AwsIntegrationsBillingPtrOutput `pulumi:"billing"`
	// Cloudtrail integration. See Integration blocks below for details.
	Cloudtrail AwsIntegrationsCloudtrailPtrOutput `pulumi:"cloudtrail"`
	// Billing integration
	DocDb AwsIntegrationsDocDbPtrOutput `pulumi:"docDb"`
	// Health integration. See Integration blocks below for details.
	Health AwsIntegrationsHealthPtrOutput `pulumi:"health"`
	// The ID of the linked AWS account in New Relic.
	LinkedAccountId pulumi.IntOutput `pulumi:"linkedAccountId"`
	// S3 integration
	S3 AwsIntegrationsS3PtrOutput `pulumi:"s3"`
	// Trusted Advisor integration. See Integration blocks below for details.
	TrustedAdvisor AwsIntegrationsTrustedAdvisorPtrOutput `pulumi:"trustedAdvisor"`
	// VPC integration. See Integration blocks below for details.
	Vpc AwsIntegrationsVpcPtrOutput `pulumi:"vpc"`
	// X-Ray integration. See Integration blocks below for details.
	XRay AwsIntegrationsXRayPtrOutput `pulumi:"xRay"`
}

// NewAwsIntegrations registers a new resource with the given unique name, arguments, and options.
func NewAwsIntegrations(ctx *pulumi.Context,
	name string, args *AwsIntegrationsArgs, opts ...pulumi.ResourceOption) (*AwsIntegrations, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LinkedAccountId == nil {
		return nil, errors.New("invalid value for required argument 'LinkedAccountId'")
	}
	var resource AwsIntegrations
	err := ctx.RegisterResource("newrelic:cloud/awsIntegrations:AwsIntegrations", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAwsIntegrations gets an existing AwsIntegrations resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAwsIntegrations(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AwsIntegrationsState, opts ...pulumi.ResourceOption) (*AwsIntegrations, error) {
	var resource AwsIntegrations
	err := ctx.ReadResource("newrelic:cloud/awsIntegrations:AwsIntegrations", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AwsIntegrations resources.
type awsIntegrationsState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Billing integration. See Integration blocks below for details.
	Billing *AwsIntegrationsBilling `pulumi:"billing"`
	// Cloudtrail integration. See Integration blocks below for details.
	Cloudtrail *AwsIntegrationsCloudtrail `pulumi:"cloudtrail"`
	// Billing integration
	DocDb *AwsIntegrationsDocDb `pulumi:"docDb"`
	// Health integration. See Integration blocks below for details.
	Health *AwsIntegrationsHealth `pulumi:"health"`
	// The ID of the linked AWS account in New Relic.
	LinkedAccountId *int `pulumi:"linkedAccountId"`
	// S3 integration
	S3 *AwsIntegrationsS3 `pulumi:"s3"`
	// Trusted Advisor integration. See Integration blocks below for details.
	TrustedAdvisor *AwsIntegrationsTrustedAdvisor `pulumi:"trustedAdvisor"`
	// VPC integration. See Integration blocks below for details.
	Vpc *AwsIntegrationsVpc `pulumi:"vpc"`
	// X-Ray integration. See Integration blocks below for details.
	XRay *AwsIntegrationsXRay `pulumi:"xRay"`
}

type AwsIntegrationsState struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Billing integration. See Integration blocks below for details.
	Billing AwsIntegrationsBillingPtrInput
	// Cloudtrail integration. See Integration blocks below for details.
	Cloudtrail AwsIntegrationsCloudtrailPtrInput
	// Billing integration
	DocDb AwsIntegrationsDocDbPtrInput
	// Health integration. See Integration blocks below for details.
	Health AwsIntegrationsHealthPtrInput
	// The ID of the linked AWS account in New Relic.
	LinkedAccountId pulumi.IntPtrInput
	// S3 integration
	S3 AwsIntegrationsS3PtrInput
	// Trusted Advisor integration. See Integration blocks below for details.
	TrustedAdvisor AwsIntegrationsTrustedAdvisorPtrInput
	// VPC integration. See Integration blocks below for details.
	Vpc AwsIntegrationsVpcPtrInput
	// X-Ray integration. See Integration blocks below for details.
	XRay AwsIntegrationsXRayPtrInput
}

func (AwsIntegrationsState) ElementType() reflect.Type {
	return reflect.TypeOf((*awsIntegrationsState)(nil)).Elem()
}

type awsIntegrationsArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId *int `pulumi:"accountId"`
	// Billing integration. See Integration blocks below for details.
	Billing *AwsIntegrationsBilling `pulumi:"billing"`
	// Cloudtrail integration. See Integration blocks below for details.
	Cloudtrail *AwsIntegrationsCloudtrail `pulumi:"cloudtrail"`
	// Billing integration
	DocDb *AwsIntegrationsDocDb `pulumi:"docDb"`
	// Health integration. See Integration blocks below for details.
	Health *AwsIntegrationsHealth `pulumi:"health"`
	// The ID of the linked AWS account in New Relic.
	LinkedAccountId int `pulumi:"linkedAccountId"`
	// S3 integration
	S3 *AwsIntegrationsS3 `pulumi:"s3"`
	// Trusted Advisor integration. See Integration blocks below for details.
	TrustedAdvisor *AwsIntegrationsTrustedAdvisor `pulumi:"trustedAdvisor"`
	// VPC integration. See Integration blocks below for details.
	Vpc *AwsIntegrationsVpc `pulumi:"vpc"`
	// X-Ray integration. See Integration blocks below for details.
	XRay *AwsIntegrationsXRay `pulumi:"xRay"`
}

// The set of arguments for constructing a AwsIntegrations resource.
type AwsIntegrationsArgs struct {
	// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
	AccountId pulumi.IntPtrInput
	// Billing integration. See Integration blocks below for details.
	Billing AwsIntegrationsBillingPtrInput
	// Cloudtrail integration. See Integration blocks below for details.
	Cloudtrail AwsIntegrationsCloudtrailPtrInput
	// Billing integration
	DocDb AwsIntegrationsDocDbPtrInput
	// Health integration. See Integration blocks below for details.
	Health AwsIntegrationsHealthPtrInput
	// The ID of the linked AWS account in New Relic.
	LinkedAccountId pulumi.IntInput
	// S3 integration
	S3 AwsIntegrationsS3PtrInput
	// Trusted Advisor integration. See Integration blocks below for details.
	TrustedAdvisor AwsIntegrationsTrustedAdvisorPtrInput
	// VPC integration. See Integration blocks below for details.
	Vpc AwsIntegrationsVpcPtrInput
	// X-Ray integration. See Integration blocks below for details.
	XRay AwsIntegrationsXRayPtrInput
}

func (AwsIntegrationsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*awsIntegrationsArgs)(nil)).Elem()
}

type AwsIntegrationsInput interface {
	pulumi.Input

	ToAwsIntegrationsOutput() AwsIntegrationsOutput
	ToAwsIntegrationsOutputWithContext(ctx context.Context) AwsIntegrationsOutput
}

func (*AwsIntegrations) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsIntegrations)(nil)).Elem()
}

func (i *AwsIntegrations) ToAwsIntegrationsOutput() AwsIntegrationsOutput {
	return i.ToAwsIntegrationsOutputWithContext(context.Background())
}

func (i *AwsIntegrations) ToAwsIntegrationsOutputWithContext(ctx context.Context) AwsIntegrationsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsIntegrationsOutput)
}

// AwsIntegrationsArrayInput is an input type that accepts AwsIntegrationsArray and AwsIntegrationsArrayOutput values.
// You can construct a concrete instance of `AwsIntegrationsArrayInput` via:
//
//	AwsIntegrationsArray{ AwsIntegrationsArgs{...} }
type AwsIntegrationsArrayInput interface {
	pulumi.Input

	ToAwsIntegrationsArrayOutput() AwsIntegrationsArrayOutput
	ToAwsIntegrationsArrayOutputWithContext(context.Context) AwsIntegrationsArrayOutput
}

type AwsIntegrationsArray []AwsIntegrationsInput

func (AwsIntegrationsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsIntegrations)(nil)).Elem()
}

func (i AwsIntegrationsArray) ToAwsIntegrationsArrayOutput() AwsIntegrationsArrayOutput {
	return i.ToAwsIntegrationsArrayOutputWithContext(context.Background())
}

func (i AwsIntegrationsArray) ToAwsIntegrationsArrayOutputWithContext(ctx context.Context) AwsIntegrationsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsIntegrationsArrayOutput)
}

// AwsIntegrationsMapInput is an input type that accepts AwsIntegrationsMap and AwsIntegrationsMapOutput values.
// You can construct a concrete instance of `AwsIntegrationsMapInput` via:
//
//	AwsIntegrationsMap{ "key": AwsIntegrationsArgs{...} }
type AwsIntegrationsMapInput interface {
	pulumi.Input

	ToAwsIntegrationsMapOutput() AwsIntegrationsMapOutput
	ToAwsIntegrationsMapOutputWithContext(context.Context) AwsIntegrationsMapOutput
}

type AwsIntegrationsMap map[string]AwsIntegrationsInput

func (AwsIntegrationsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsIntegrations)(nil)).Elem()
}

func (i AwsIntegrationsMap) ToAwsIntegrationsMapOutput() AwsIntegrationsMapOutput {
	return i.ToAwsIntegrationsMapOutputWithContext(context.Background())
}

func (i AwsIntegrationsMap) ToAwsIntegrationsMapOutputWithContext(ctx context.Context) AwsIntegrationsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AwsIntegrationsMapOutput)
}

type AwsIntegrationsOutput struct{ *pulumi.OutputState }

func (AwsIntegrationsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AwsIntegrations)(nil)).Elem()
}

func (o AwsIntegrationsOutput) ToAwsIntegrationsOutput() AwsIntegrationsOutput {
	return o
}

func (o AwsIntegrationsOutput) ToAwsIntegrationsOutputWithContext(ctx context.Context) AwsIntegrationsOutput {
	return o
}

// The New Relic account ID to operate on.  This allows the user to override the `accountId` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
func (o AwsIntegrationsOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *AwsIntegrations) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Billing integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) Billing() AwsIntegrationsBillingPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsBillingPtrOutput { return v.Billing }).(AwsIntegrationsBillingPtrOutput)
}

// Cloudtrail integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) Cloudtrail() AwsIntegrationsCloudtrailPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsCloudtrailPtrOutput { return v.Cloudtrail }).(AwsIntegrationsCloudtrailPtrOutput)
}

// Billing integration
func (o AwsIntegrationsOutput) DocDb() AwsIntegrationsDocDbPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsDocDbPtrOutput { return v.DocDb }).(AwsIntegrationsDocDbPtrOutput)
}

// Health integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) Health() AwsIntegrationsHealthPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsHealthPtrOutput { return v.Health }).(AwsIntegrationsHealthPtrOutput)
}

// The ID of the linked AWS account in New Relic.
func (o AwsIntegrationsOutput) LinkedAccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *AwsIntegrations) pulumi.IntOutput { return v.LinkedAccountId }).(pulumi.IntOutput)
}

// S3 integration
func (o AwsIntegrationsOutput) S3() AwsIntegrationsS3PtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsS3PtrOutput { return v.S3 }).(AwsIntegrationsS3PtrOutput)
}

// Trusted Advisor integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) TrustedAdvisor() AwsIntegrationsTrustedAdvisorPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsTrustedAdvisorPtrOutput { return v.TrustedAdvisor }).(AwsIntegrationsTrustedAdvisorPtrOutput)
}

// VPC integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) Vpc() AwsIntegrationsVpcPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsVpcPtrOutput { return v.Vpc }).(AwsIntegrationsVpcPtrOutput)
}

// X-Ray integration. See Integration blocks below for details.
func (o AwsIntegrationsOutput) XRay() AwsIntegrationsXRayPtrOutput {
	return o.ApplyT(func(v *AwsIntegrations) AwsIntegrationsXRayPtrOutput { return v.XRay }).(AwsIntegrationsXRayPtrOutput)
}

type AwsIntegrationsArrayOutput struct{ *pulumi.OutputState }

func (AwsIntegrationsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AwsIntegrations)(nil)).Elem()
}

func (o AwsIntegrationsArrayOutput) ToAwsIntegrationsArrayOutput() AwsIntegrationsArrayOutput {
	return o
}

func (o AwsIntegrationsArrayOutput) ToAwsIntegrationsArrayOutputWithContext(ctx context.Context) AwsIntegrationsArrayOutput {
	return o
}

func (o AwsIntegrationsArrayOutput) Index(i pulumi.IntInput) AwsIntegrationsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AwsIntegrations {
		return vs[0].([]*AwsIntegrations)[vs[1].(int)]
	}).(AwsIntegrationsOutput)
}

type AwsIntegrationsMapOutput struct{ *pulumi.OutputState }

func (AwsIntegrationsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AwsIntegrations)(nil)).Elem()
}

func (o AwsIntegrationsMapOutput) ToAwsIntegrationsMapOutput() AwsIntegrationsMapOutput {
	return o
}

func (o AwsIntegrationsMapOutput) ToAwsIntegrationsMapOutputWithContext(ctx context.Context) AwsIntegrationsMapOutput {
	return o
}

func (o AwsIntegrationsMapOutput) MapIndex(k pulumi.StringInput) AwsIntegrationsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AwsIntegrations {
		return vs[0].(map[string]*AwsIntegrations)[vs[1].(string)]
	}).(AwsIntegrationsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AwsIntegrationsInput)(nil)).Elem(), &AwsIntegrations{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsIntegrationsArrayInput)(nil)).Elem(), AwsIntegrationsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AwsIntegrationsMapInput)(nil)).Elem(), AwsIntegrationsMap{})
	pulumi.RegisterOutputType(AwsIntegrationsOutput{})
	pulumi.RegisterOutputType(AwsIntegrationsArrayOutput{})
	pulumi.RegisterOutputType(AwsIntegrationsMapOutput{})
}
