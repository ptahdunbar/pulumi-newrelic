// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

type OneDashboardJson struct {
	pulumi.CustomResourceState

	// The New Relic account ID where you want to create the dashboard.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The unique entity identifier of the dashboard in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
	Json pulumi.StringOutput `pulumi:"json"`
	// The URL for viewing the dashboard.
	Permalink pulumi.StringOutput `pulumi:"permalink"`
	// The date and time when the dashboard was last updated.
	UpdatedAt pulumi.StringOutput `pulumi:"updatedAt"`
}

// NewOneDashboardJson registers a new resource with the given unique name, arguments, and options.
func NewOneDashboardJson(ctx *pulumi.Context,
	name string, args *OneDashboardJsonArgs, opts ...pulumi.ResourceOption) (*OneDashboardJson, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Json == nil {
		return nil, errors.New("invalid value for required argument 'Json'")
	}
	var resource OneDashboardJson
	err := ctx.RegisterResource("newrelic:index/oneDashboardJson:OneDashboardJson", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetOneDashboardJson gets an existing OneDashboardJson resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetOneDashboardJson(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *OneDashboardJsonState, opts ...pulumi.ResourceOption) (*OneDashboardJson, error) {
	var resource OneDashboardJson
	err := ctx.ReadResource("newrelic:index/oneDashboardJson:OneDashboardJson", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering OneDashboardJson resources.
type oneDashboardJsonState struct {
	// The New Relic account ID where you want to create the dashboard.
	AccountId *int `pulumi:"accountId"`
	// The unique entity identifier of the dashboard in New Relic.
	Guid *string `pulumi:"guid"`
	// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
	Json *string `pulumi:"json"`
	// The URL for viewing the dashboard.
	Permalink *string `pulumi:"permalink"`
	// The date and time when the dashboard was last updated.
	UpdatedAt *string `pulumi:"updatedAt"`
}

type OneDashboardJsonState struct {
	// The New Relic account ID where you want to create the dashboard.
	AccountId pulumi.IntPtrInput
	// The unique entity identifier of the dashboard in New Relic.
	Guid pulumi.StringPtrInput
	// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
	Json pulumi.StringPtrInput
	// The URL for viewing the dashboard.
	Permalink pulumi.StringPtrInput
	// The date and time when the dashboard was last updated.
	UpdatedAt pulumi.StringPtrInput
}

func (OneDashboardJsonState) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardJsonState)(nil)).Elem()
}

type oneDashboardJsonArgs struct {
	// The New Relic account ID where you want to create the dashboard.
	AccountId *int `pulumi:"accountId"`
	// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
	Json string `pulumi:"json"`
}

// The set of arguments for constructing a OneDashboardJson resource.
type OneDashboardJsonArgs struct {
	// The New Relic account ID where you want to create the dashboard.
	AccountId pulumi.IntPtrInput
	// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
	Json pulumi.StringInput
}

func (OneDashboardJsonArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*oneDashboardJsonArgs)(nil)).Elem()
}

type OneDashboardJsonInput interface {
	pulumi.Input

	ToOneDashboardJsonOutput() OneDashboardJsonOutput
	ToOneDashboardJsonOutputWithContext(ctx context.Context) OneDashboardJsonOutput
}

func (*OneDashboardJson) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboardJson)(nil)).Elem()
}

func (i *OneDashboardJson) ToOneDashboardJsonOutput() OneDashboardJsonOutput {
	return i.ToOneDashboardJsonOutputWithContext(context.Background())
}

func (i *OneDashboardJson) ToOneDashboardJsonOutputWithContext(ctx context.Context) OneDashboardJsonOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardJsonOutput)
}

// OneDashboardJsonArrayInput is an input type that accepts OneDashboardJsonArray and OneDashboardJsonArrayOutput values.
// You can construct a concrete instance of `OneDashboardJsonArrayInput` via:
//
//	OneDashboardJsonArray{ OneDashboardJsonArgs{...} }
type OneDashboardJsonArrayInput interface {
	pulumi.Input

	ToOneDashboardJsonArrayOutput() OneDashboardJsonArrayOutput
	ToOneDashboardJsonArrayOutputWithContext(context.Context) OneDashboardJsonArrayOutput
}

type OneDashboardJsonArray []OneDashboardJsonInput

func (OneDashboardJsonArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboardJson)(nil)).Elem()
}

func (i OneDashboardJsonArray) ToOneDashboardJsonArrayOutput() OneDashboardJsonArrayOutput {
	return i.ToOneDashboardJsonArrayOutputWithContext(context.Background())
}

func (i OneDashboardJsonArray) ToOneDashboardJsonArrayOutputWithContext(ctx context.Context) OneDashboardJsonArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardJsonArrayOutput)
}

// OneDashboardJsonMapInput is an input type that accepts OneDashboardJsonMap and OneDashboardJsonMapOutput values.
// You can construct a concrete instance of `OneDashboardJsonMapInput` via:
//
//	OneDashboardJsonMap{ "key": OneDashboardJsonArgs{...} }
type OneDashboardJsonMapInput interface {
	pulumi.Input

	ToOneDashboardJsonMapOutput() OneDashboardJsonMapOutput
	ToOneDashboardJsonMapOutputWithContext(context.Context) OneDashboardJsonMapOutput
}

type OneDashboardJsonMap map[string]OneDashboardJsonInput

func (OneDashboardJsonMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboardJson)(nil)).Elem()
}

func (i OneDashboardJsonMap) ToOneDashboardJsonMapOutput() OneDashboardJsonMapOutput {
	return i.ToOneDashboardJsonMapOutputWithContext(context.Background())
}

func (i OneDashboardJsonMap) ToOneDashboardJsonMapOutputWithContext(ctx context.Context) OneDashboardJsonMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(OneDashboardJsonMapOutput)
}

type OneDashboardJsonOutput struct{ *pulumi.OutputState }

func (OneDashboardJsonOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**OneDashboardJson)(nil)).Elem()
}

func (o OneDashboardJsonOutput) ToOneDashboardJsonOutput() OneDashboardJsonOutput {
	return o
}

func (o OneDashboardJsonOutput) ToOneDashboardJsonOutputWithContext(ctx context.Context) OneDashboardJsonOutput {
	return o
}

// The New Relic account ID where you want to create the dashboard.
func (o OneDashboardJsonOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *OneDashboardJson) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// The unique entity identifier of the dashboard in New Relic.
func (o OneDashboardJsonOutput) Guid() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardJson) pulumi.StringOutput { return v.Guid }).(pulumi.StringOutput)
}

// The JSON export of a dashboard. [The JSON can be exported from the UI](https://docs.newrelic.com/docs/query-your-data/explore-query-data/dashboards/dashboards-charts-import-export-data/#dashboards)
func (o OneDashboardJsonOutput) Json() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardJson) pulumi.StringOutput { return v.Json }).(pulumi.StringOutput)
}

// The URL for viewing the dashboard.
func (o OneDashboardJsonOutput) Permalink() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardJson) pulumi.StringOutput { return v.Permalink }).(pulumi.StringOutput)
}

// The date and time when the dashboard was last updated.
func (o OneDashboardJsonOutput) UpdatedAt() pulumi.StringOutput {
	return o.ApplyT(func(v *OneDashboardJson) pulumi.StringOutput { return v.UpdatedAt }).(pulumi.StringOutput)
}

type OneDashboardJsonArrayOutput struct{ *pulumi.OutputState }

func (OneDashboardJsonArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*OneDashboardJson)(nil)).Elem()
}

func (o OneDashboardJsonArrayOutput) ToOneDashboardJsonArrayOutput() OneDashboardJsonArrayOutput {
	return o
}

func (o OneDashboardJsonArrayOutput) ToOneDashboardJsonArrayOutputWithContext(ctx context.Context) OneDashboardJsonArrayOutput {
	return o
}

func (o OneDashboardJsonArrayOutput) Index(i pulumi.IntInput) OneDashboardJsonOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *OneDashboardJson {
		return vs[0].([]*OneDashboardJson)[vs[1].(int)]
	}).(OneDashboardJsonOutput)
}

type OneDashboardJsonMapOutput struct{ *pulumi.OutputState }

func (OneDashboardJsonMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*OneDashboardJson)(nil)).Elem()
}

func (o OneDashboardJsonMapOutput) ToOneDashboardJsonMapOutput() OneDashboardJsonMapOutput {
	return o
}

func (o OneDashboardJsonMapOutput) ToOneDashboardJsonMapOutputWithContext(ctx context.Context) OneDashboardJsonMapOutput {
	return o
}

func (o OneDashboardJsonMapOutput) MapIndex(k pulumi.StringInput) OneDashboardJsonOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *OneDashboardJson {
		return vs[0].(map[string]*OneDashboardJson)[vs[1].(string)]
	}).(OneDashboardJsonOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardJsonInput)(nil)).Elem(), &OneDashboardJson{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardJsonArrayInput)(nil)).Elem(), OneDashboardJsonArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*OneDashboardJsonMapInput)(nil)).Elem(), OneDashboardJsonMap{})
	pulumi.RegisterOutputType(OneDashboardJsonOutput{})
	pulumi.RegisterOutputType(OneDashboardJsonArrayOutput{})
	pulumi.RegisterOutputType(OneDashboardJsonMapOutput{})
}
