// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage alert conditions for APM, Browser, and Mobile in New Relic.
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
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			app, err := newrelic.GetEntity(ctx, &GetEntityArgs{
//				Name:   "my-app",
//				Type:   pulumi.StringRef("APPLICATION"),
//				Domain: pulumi.StringRef("APM"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			fooAlertPolicy, err := newrelic.NewAlertPolicy(ctx, "fooAlertPolicy", nil)
//			if err != nil {
//				return err
//			}
//			_, err = newrelic.NewAlertCondition(ctx, "fooAlertCondition", &newrelic.AlertConditionArgs{
//				PolicyId: fooAlertPolicy.ID(),
//				Type:     pulumi.String("apm_app_metric"),
//				Entities: pulumi.IntArray{
//					pulumi.Int(app.ApplicationId),
//				},
//				Metric:         pulumi.String("apdex"),
//				RunbookUrl:     pulumi.String("https://www.example.com"),
//				ConditionScope: pulumi.String("application"),
//				Terms: AlertConditionTermArray{
//					&AlertConditionTermArgs{
//						Duration:     pulumi.Int(5),
//						Operator:     pulumi.String("below"),
//						Priority:     pulumi.String("critical"),
//						Threshold:    pulumi.Float64(0.75),
//						TimeFunction: pulumi.String("all"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ## Terms
//
// The `term` mapping supports the following arguments:
//
//   - `duration` - (Required) In minutes, must be in the range of `5` to `120`, inclusive.
//   - `operator` - (Optional) `above`, `below`, or `equal`.  Defaults to `equal`.
//   - `priority` - (Optional) `critical` or `warning`.  Defaults to `critical`. Terms must include at least one `critical` priority term
//   - `threshold` - (Required) Must be 0 or greater.
//   - `timeFunction` - (Required) `all` or `any`.
//
// ## Import
//
// Alert conditions can be imported using notation `alert_policy_id:alert_condition_id`, e.g.
//
// ```sh
//
//	$ pulumi import newrelic:index/alertCondition:AlertCondition main 123456:6789012345
//
// ```
type AlertCondition struct {
	pulumi.CustomResourceState

	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrOutput `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayOutput `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrOutput `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmJvmMetric`
	// * `cpuUtilizationTime`
	// * `deadlockedThreads`
	// * `gcCpuTime`
	// * `heapMemoryUsage`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringOutput `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayOutput `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringOutput `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrOutput `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrOutput `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrOutput `pulumi:"violationCloseTimer"`
}

// NewAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewAlertCondition(ctx *pulumi.Context,
	name string, args *AlertConditionArgs, opts ...pulumi.ResourceOption) (*AlertCondition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Entities == nil {
		return nil, errors.New("invalid value for required argument 'Entities'")
	}
	if args.Metric == nil {
		return nil, errors.New("invalid value for required argument 'Metric'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	if args.Terms == nil {
		return nil, errors.New("invalid value for required argument 'Terms'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource AlertCondition
	err := ctx.RegisterResource("newrelic:index/alertCondition:AlertCondition", name, args, &resource, opts...)
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
	err := ctx.ReadResource("newrelic:index/alertCondition:AlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertCondition resources.
type alertConditionState struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope *string `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities []int `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric *string `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmJvmMetric`
	// * `cpuUtilizationTime`
	// * `deadlockedThreads`
	// * `gcCpuTime`
	// * `heapMemoryUsage`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric *string `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId *int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms []AlertConditionTerm `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type *string `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric *string `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction *string `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
}

type AlertConditionState struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrInput
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayInput
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrInput
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmJvmMetric`
	// * `cpuUtilizationTime`
	// * `deadlockedThreads`
	// * `gcCpuTime`
	// * `heapMemoryUsage`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringPtrInput
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayInput
	// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringPtrInput
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrInput
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrInput
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrInput
}

func (AlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertConditionState)(nil)).Elem()
}

type alertConditionArgs struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope *string `pulumi:"conditionScope"`
	// Whether the condition is enabled or not. Defaults to true.
	Enabled *bool `pulumi:"enabled"`
	// The instance IDs associated with this condition.
	Entities []int `pulumi:"entities"`
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric *string `pulumi:"gcMetric"`
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmJvmMetric`
	// * `cpuUtilizationTime`
	// * `deadlockedThreads`
	// * `gcCpuTime`
	// * `heapMemoryUsage`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric string `pulumi:"metric"`
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name *string `pulumi:"name"`
	// The ID of the policy where this condition should be used.
	PolicyId int `pulumi:"policyId"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// A list of terms for this condition. See Terms below for details.
	Terms []AlertConditionTerm `pulumi:"terms"`
	// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type string `pulumi:"type"`
	// A custom metric to be evaluated.
	UserDefinedMetric *string `pulumi:"userDefinedMetric"`
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction *string `pulumi:"userDefinedValueFunction"`
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
}

// The set of arguments for constructing a AlertCondition resource.
type AlertConditionArgs struct {
	// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
	ConditionScope pulumi.StringPtrInput
	// Whether the condition is enabled or not. Defaults to true.
	Enabled pulumi.BoolPtrInput
	// The instance IDs associated with this condition.
	Entities pulumi.IntArrayInput
	// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
	GcMetric pulumi.StringPtrInput
	// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
	// * `apmAppMetric`
	// * `apdex`
	// * `errorPercentage`
	// * `responseTimeBackground`
	// * `responseTimeWeb`
	// * `throughputBackground`
	// * `throughputWeb`
	// * `userDefined`
	// * `apmJvmMetric`
	// * `cpuUtilizationTime`
	// * `deadlockedThreads`
	// * `gcCpuTime`
	// * `heapMemoryUsage`
	// * `apmKtMetric`
	// * `apdex`
	// * `errorCount`
	// * `errorPercentage`
	// * `responseTime`
	// * `throughput`
	// * `browserMetric`
	// * `ajaxResponseTime`
	// * `ajaxThroughput`
	// * `domProcessing`
	// * `endUserApdex`
	// * `network`
	// * `pageRendering`
	// * `pageViewThroughput`
	// * `pageViewsWithJsErrors`
	// * `requestQueuing`
	// * `totalPageLoad`
	// * `userDefined`
	// * `webApplication`
	// * `mobileMetric`
	// * `database`
	// * `images`
	// * `json`
	// * `mobileCrashRate`
	// * `networkErrorPercentage`
	// * `network`
	// * `statusErrorPercentage`
	// * `userDefined`
	// * `viewLoading`
	Metric pulumi.StringInput
	// The title of the condition. Must be between 1 and 64 characters, inclusive.
	Name pulumi.StringPtrInput
	// The ID of the policy where this condition should be used.
	PolicyId pulumi.IntInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// A list of terms for this condition. See Terms below for details.
	Terms AlertConditionTermArrayInput
	// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
	Type pulumi.StringInput
	// A custom metric to be evaluated.
	UserDefinedMetric pulumi.StringPtrInput
	// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
	UserDefinedValueFunction pulumi.StringPtrInput
	// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
	ViolationCloseTimer pulumi.IntPtrInput
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

// `application` or `instance`.  Choose `application` for most scenarios.  If you are using the JVM plugin in New Relic, the `instance` setting allows your condition to trigger [for specific app instances](https://docs.newrelic.com/docs/alerts/new-relic-alerts/defining-conditions/scope-alert-thresholds-specific-instances).
func (o AlertConditionOutput) ConditionScope() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringPtrOutput { return v.ConditionScope }).(pulumi.StringPtrOutput)
}

// Whether the condition is enabled or not. Defaults to true.
func (o AlertConditionOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// The instance IDs associated with this condition.
func (o AlertConditionOutput) Entities() pulumi.IntArrayOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.IntArrayOutput { return v.Entities }).(pulumi.IntArrayOutput)
}

// A valid Garbage Collection metric e.g. `GC/G1 Young Generation`.
func (o AlertConditionOutput) GcMetric() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringPtrOutput { return v.GcMetric }).(pulumi.StringPtrOutput)
}

// The metric field accepts parameters based on the `type` set. One of these metrics based on `type`:
// * `apmAppMetric`
// * `apdex`
// * `errorPercentage`
// * `responseTimeBackground`
// * `responseTimeWeb`
// * `throughputBackground`
// * `throughputWeb`
// * `userDefined`
// * `apmJvmMetric`
// * `cpuUtilizationTime`
// * `deadlockedThreads`
// * `gcCpuTime`
// * `heapMemoryUsage`
// * `apmKtMetric`
// * `apdex`
// * `errorCount`
// * `errorPercentage`
// * `responseTime`
// * `throughput`
// * `browserMetric`
// * `ajaxResponseTime`
// * `ajaxThroughput`
// * `domProcessing`
// * `endUserApdex`
// * `network`
// * `pageRendering`
// * `pageViewThroughput`
// * `pageViewsWithJsErrors`
// * `requestQueuing`
// * `totalPageLoad`
// * `userDefined`
// * `webApplication`
// * `mobileMetric`
// * `database`
// * `images`
// * `json`
// * `mobileCrashRate`
// * `networkErrorPercentage`
// * `network`
// * `statusErrorPercentage`
// * `userDefined`
// * `viewLoading`
func (o AlertConditionOutput) Metric() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringOutput { return v.Metric }).(pulumi.StringOutput)
}

// The title of the condition. Must be between 1 and 64 characters, inclusive.
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

// A list of terms for this condition. See Terms below for details.
func (o AlertConditionOutput) Terms() AlertConditionTermArrayOutput {
	return o.ApplyT(func(v *AlertCondition) AlertConditionTermArrayOutput { return v.Terms }).(AlertConditionTermArrayOutput)
}

// The type of condition. One of: `apmAppMetric`, `apmJvmMetric`, `apmKtMetric`, `browserMetric`, `mobileMetric`
func (o AlertConditionOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// A custom metric to be evaluated.
func (o AlertConditionOutput) UserDefinedMetric() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringPtrOutput { return v.UserDefinedMetric }).(pulumi.StringPtrOutput)
}

// One of: `average`, `min`, `max`, `total`, or `sampleSize`.
func (o AlertConditionOutput) UserDefinedValueFunction() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.StringPtrOutput { return v.UserDefinedValueFunction }).(pulumi.StringPtrOutput)
}

// Automatically close instance-based violations, including JVM health metric violations, after the number of hours specified. Must be: `1`, `2`, `4`, `8`, `12` or `24`.
func (o AlertConditionOutput) ViolationCloseTimer() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *AlertCondition) pulumi.IntPtrOutput { return v.ViolationCloseTimer }).(pulumi.IntPtrOutput)
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
