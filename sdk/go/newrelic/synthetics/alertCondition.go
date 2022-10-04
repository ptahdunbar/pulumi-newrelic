// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage synthetics alert conditions in New Relic.
//
// > **NOTE:** The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. Other condition types may be deprecated in the future and receive fewer product updates.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic/synthetics"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := synthetics.NewAlertCondition(ctx, "foo", &synthetics.AlertConditionArgs{
//				PolicyId:   pulumi.Any(newrelic_alert_policy.Foo.Id),
//				MonitorId:  pulumi.Any(newrelic_synthetics_monitor.Foo.Id),
//				RunbookUrl: pulumi.String("https://www.example.com"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Synthetics alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/alertCondition:AlertCondition main 12345:67890
//
// ```
type AlertCondition struct {
	pulumi.CustomResourceState

	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The GUID of the Synthetics monitor to be referenced in the alert condition.
	MonitorId pulumi.StringOutput `pulumi:"monitorId"`
	// The title of this condition.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
}

// NewAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewAlertCondition(ctx *pulumi.Context,
	name string, args *AlertConditionArgs, opts ...pulumi.ResourceOption) (*AlertCondition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitorId == nil {
		return nil, errors.New("invalid value for required argument 'MonitorId'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	var resource AlertCondition
	err := ctx.RegisterResource("newrelic:synthetics/alertCondition:AlertCondition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertCondition gets an existing AlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertConditionState, opts ...pulumi.ResourceOption) (*AlertCondition, error) {
	var resource AlertCondition
	err := ctx.ReadResource("newrelic:synthetics/alertCondition:AlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertCondition resources.
type alertConditionState struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The GUID of the Synthetics monitor to be referenced in the alert condition.
	MonitorId *string `pulumi:"monitorId"`
	// The title of this condition.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId *int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
}

type AlertConditionState struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The GUID of the Synthetics monitor to be referenced in the alert condition.
	MonitorId pulumi.StringPtrInput
	// The title of this condition.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
}

func (AlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConditionState)(nil)).Elem()
}

type alertConditionArgs struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The GUID of the Synthetics monitor to be referenced in the alert condition.
	MonitorId string `pulumi:"monitorId"`
	// The title of this condition.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
}

// The set of arguments for constructing a AlertCondition resource.
type AlertConditionArgs struct {
	// Set whether to enable the alert condition. Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The GUID of the Synthetics monitor to be referenced in the alert condition.
	MonitorId pulumi.StringInput
	// The title of this condition.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
}

func (AlertConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConditionArgs)(nil)).Elem()
}

type AlertConditionInput interface {
	pulumi.Input

	ToAlertConditionOutput() AlertConditionOutput
	ToAlertConditionOutputWithContext(ctx context.Context) AlertConditionOutput
}

func (*AlertCondition) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertCondition)(nil)).Elem()
}

func (i *AlertCondition) ToAlertConditionOutput() AlertConditionOutput {
	return i.ToAlertConditionOutputWithContext(context.Background())
}

func (i *AlertCondition) ToAlertConditionOutputWithContext(ctx context.Context) AlertConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConditionOutput)
}

// AlertConditionArrayInput is an input type that accepts AlertConditionArray and AlertConditionArrayOutput values.
// You can construct a concrete instance of `AlertConditionArrayInput` via:
//
//	AlertConditionArray{ AlertConditionArgs{...} }
type AlertConditionArrayInput interface {
	pulumi.Input

	ToAlertConditionArrayOutput() AlertConditionArrayOutput
	ToAlertConditionArrayOutputWithContext(context.Context) AlertConditionArrayOutput
}

type AlertConditionArray []AlertConditionInput

func (AlertConditionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertCondition)(nil)).Elem()
}

func (i AlertConditionArray) ToAlertConditionArrayOutput() AlertConditionArrayOutput {
	return i.ToAlertConditionArrayOutputWithContext(context.Background())
}

func (i AlertConditionArray) ToAlertConditionArrayOutputWithContext(ctx context.Context) AlertConditionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConditionArrayOutput)
}

// AlertConditionMapInput is an input type that accepts AlertConditionMap and AlertConditionMapOutput values.
// You can construct a concrete instance of `AlertConditionMapInput` via:
//
//	AlertConditionMap{ "key": AlertConditionArgs{...} }
type AlertConditionMapInput interface {
	pulumi.Input

	ToAlertConditionMapOutput() AlertConditionMapOutput
	ToAlertConditionMapOutputWithContext(context.Context) AlertConditionMapOutput
}

type AlertConditionMap map[string]AlertConditionInput

func (AlertConditionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertCondition)(nil)).Elem()
}

func (i AlertConditionMap) ToAlertConditionMapOutput() AlertConditionMapOutput {
	return i.ToAlertConditionMapOutputWithContext(context.Background())
}

func (i AlertConditionMap) ToAlertConditionMapOutputWithContext(ctx context.Context) AlertConditionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertConditionMapOutput)
}

type AlertConditionOutput struct{ *pulumi.OutputState }

func (AlertConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertCondition)(nil)).Elem()
}

func (o AlertConditionOutput) ToAlertConditionOutput() AlertConditionOutput {
	return o
}

func (o AlertConditionOutput) ToAlertConditionOutputWithContext(ctx context.Context) AlertConditionOutput {
	return o
}

// Set whether to enable the alert condition. Defaults to `true`.
func (o AlertConditionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The GUID of the Synthetics monitor to be referenced in the alert condition.
func (o AlertConditionOutput) MonitorId() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringOutput { return v.MonitorId }).(pulumi.StringOutput)
}

// The title of this condition.
func (o AlertConditionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The ID of the policy where this condition should be used.
func (o AlertConditionOutput) PolicyId() pulumi.IntOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.IntOutput { return v.PolicyId }).(pulumi.IntOutput)
}

// Runbook URL to display in notifications.
func (o AlertConditionOutput) RunbookUrl() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringPtrOutput { return v.RunbookUrl }).(pulumi.StringPtrOutput)
}

type AlertConditionArrayOutput struct{ *pulumi.OutputState }

func (AlertConditionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertCondition)(nil)).Elem()
}

func (o AlertConditionArrayOutput) ToAlertConditionArrayOutput() AlertConditionArrayOutput {
	return o
}

func (o AlertConditionArrayOutput) ToAlertConditionArrayOutputWithContext(ctx context.Context) AlertConditionArrayOutput {
	return o
}

func (o AlertConditionArrayOutput) Index(i pulumi.IntInput) AlertConditionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertCondition {
		return vs[0].([]*AlertCondition)[vs[1].(int)]
	}).(AlertConditionOutput)
}

type AlertConditionMapOutput struct{ *pulumi.OutputState }

func (AlertConditionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertCondition)(nil)).Elem()
}

func (o AlertConditionMapOutput) ToAlertConditionMapOutput() AlertConditionMapOutput {
	return o
}

func (o AlertConditionMapOutput) ToAlertConditionMapOutputWithContext(ctx context.Context) AlertConditionMapOutput {
	return o
}

func (o AlertConditionMapOutput) MapIndex(k pulumi.StringInput) AlertConditionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertCondition {
		return vs[0].(map[string]*AlertCondition)[vs[1].(string)]
	}).(AlertConditionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConditionInput)(nil)).Elem(), &AlertCondition{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConditionArrayInput)(nil)).Elem(), AlertConditionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertConditionMapInput)(nil)).Elem(), AlertConditionMap{})
	pulumi.RegisterOutputType(AlertConditionOutput{})
	pulumi.RegisterOutputType(AlertConditionArrayOutput{})
	pulumi.RegisterOutputType(AlertConditionMapOutput{})
}
