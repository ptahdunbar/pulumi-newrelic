// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this data source to get information about a specific entity in New Relic One that already exists.
func GetEntity(ctx *pulumi.Context, args *GetEntityArgs, opts ...pulumi.InvokeOption) (*GetEntityResult, error) {
	var rv GetEntityResult
	err := ctx.Invoke("newrelic:index/getEntity:getEntity", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getEntity.
type GetEntityArgs struct {
	// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
	Domain *string `pulumi:"domain"`
	// Ignore case of the `name` when searching for the entity. Defaults to false.
	IgnoreCase *bool `pulumi:"ignoreCase"`
	// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
	Name string        `pulumi:"name"`
	Tag  *GetEntityTag `pulumi:"tag"`
	// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
	Type *string `pulumi:"type"`
}

// A collection of values returned by getEntity.
type GetEntityResult struct {
	// The New Relic account ID associated with this entity.
	AccountId int `pulumi:"accountId"`
	// The domain-specific application ID of the entity. Only returned for APM and Browser applications.
	ApplicationId int    `pulumi:"applicationId"`
	Domain        string `pulumi:"domain"`
	// The unique GUID of the entity.
	Guid string `pulumi:"guid"`
	// The provider-assigned unique ID for this managed resource.
	Id                      string        `pulumi:"id"`
	IgnoreCase              *bool         `pulumi:"ignoreCase"`
	Name                    string        `pulumi:"name"`
	ServingApmApplicationId int           `pulumi:"servingApmApplicationId"`
	Tag                     *GetEntityTag `pulumi:"tag"`
	Type                    string        `pulumi:"type"`
}

func GetEntityOutput(ctx *pulumi.Context, args GetEntityOutputArgs, opts ...pulumi.InvokeOption) GetEntityResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetEntityResult, error) {
			args := v.(GetEntityArgs)
			r, err := GetEntity(ctx, &args, opts...)
			return *r, err
		}).(GetEntityResultOutput)
}

// A collection of arguments for invoking getEntity.
type GetEntityOutputArgs struct {
	// The entity's domain. Valid values are APM, BROWSER, INFRA, MOBILE, SYNTH, and VIZ. If not specified, all domains are searched.
	Domain pulumi.StringPtrInput `pulumi:"domain"`
	// Ignore case of the `name` when searching for the entity. Defaults to false.
	IgnoreCase pulumi.BoolPtrInput `pulumi:"ignoreCase"`
	// The name of the entity in New Relic One.  The first entity matching this name for the given search parameters will be returned.
	Name pulumi.StringInput   `pulumi:"name"`
	Tag  GetEntityTagPtrInput `pulumi:"tag"`
	// The entity's type. Valid values are APPLICATION, DASHBOARD, HOST, MONITOR, and WORKLOAD.
	Type pulumi.StringPtrInput `pulumi:"type"`
}

func (GetEntityOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEntityArgs)(nil)).Elem()
}

// A collection of values returned by getEntity.
type GetEntityResultOutput struct{ *pulumi.OutputState }

func (GetEntityResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetEntityResult)(nil)).Elem()
}

func (o GetEntityResultOutput) ToGetEntityResultOutput() GetEntityResultOutput {
	return o
}

func (o GetEntityResultOutput) ToGetEntityResultOutputWithContext(ctx context.Context) GetEntityResultOutput {
	return o
}

// The New Relic account ID associated with this entity.
func (o GetEntityResultOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v GetEntityResult) int { return v.AccountId }).(pulumi.IntOutput)
}

// The domain-specific application ID of the entity. Only returned for APM and Browser applications.
func (o GetEntityResultOutput) ApplicationId() pulumi.IntOutput {
	return o.ApplyT(func(v GetEntityResult) int { return v.ApplicationId }).(pulumi.IntOutput)
}

func (o GetEntityResultOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v GetEntityResult) string { return v.Domain }).(pulumi.StringOutput)
}

// The unique GUID of the entity.
func (o GetEntityResultOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v GetEntityResult) string { return v.Guid }).(pulumi.StringOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetEntityResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetEntityResult) string { return v.Id }).(pulumi.StringOutput)
}

func (o GetEntityResultOutput) IgnoreCase() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v GetEntityResult) *bool { return v.IgnoreCase }).(pulumi.BoolPtrOutput)
}

func (o GetEntityResultOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v GetEntityResult) string { return v.Name }).(pulumi.StringOutput)
}

func (o GetEntityResultOutput) ServingApmApplicationId() pulumi.IntOutput {
	return o.ApplyT(func(v GetEntityResult) int { return v.ServingApmApplicationId }).(pulumi.IntOutput)
}

func (o GetEntityResultOutput) Tag() GetEntityTagPtrOutput {
	return o.ApplyT(func(v GetEntityResult) *GetEntityTag { return v.Tag }).(GetEntityTagPtrOutput)
}

func (o GetEntityResultOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v GetEntityResult) string { return v.Type }).(pulumi.StringOutput)
}

func init() {
	pulumi.RegisterOutputType(GetEntityResultOutput{})
}
