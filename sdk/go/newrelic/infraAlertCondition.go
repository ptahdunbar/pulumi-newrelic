// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage Infrastructure alert conditions in New Relic.
//
// > **NOTE:** The NrqlAlertCondition resource is preferred for configuring alerts conditions. In most cases feature parity can be achieved with a NRQL query. Other condition types may be deprecated in the future and receive fewer product updates.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		foo, err := newrelic.NewAlertPolicy(ctx, "foo", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewInfraAlertCondition(ctx, "highDiskUsage", &newrelic.InfraAlertConditionArgs{
// 			PolicyId:    foo.ID(),
// 			Description: pulumi.String(fmt.Sprintf("%v%v%v%v", "Warning if disk usage goes above 80", "%", " and critical alert if goes above 90", "%")),
// 			Type:        pulumi.String("infra_metric"),
// 			Event:       pulumi.String("StorageSample"),
// 			Select:      pulumi.String("diskUsedPercent"),
// 			Comparison:  pulumi.String("above"),
// 			Where:       pulumi.String(fmt.Sprintf("%v%v%v%v%v", "(hostname LIKE '", "%", "frontend", "%", "')")),
// 			Critical: &newrelic.InfraAlertConditionCriticalArgs{
// 				Duration:     pulumi.Int(25),
// 				Value:        pulumi.Float64(90),
// 				TimeFunction: pulumi.String("all"),
// 			},
// 			Warning: &newrelic.InfraAlertConditionWarningArgs{
// 				Duration:     pulumi.Int(10),
// 				Value:        pulumi.Float64(80),
// 				TimeFunction: pulumi.String("all"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewInfraAlertCondition(ctx, "highDbConnCount", &newrelic.InfraAlertConditionArgs{
// 			PolicyId:            foo.ID(),
// 			Description:         pulumi.String("Critical alert when the number of database connections goes above 90"),
// 			Type:                pulumi.String("infra_metric"),
// 			Event:               pulumi.String("DatastoreSample"),
// 			Select:              pulumi.String("provider.databaseConnections.Average"),
// 			Comparison:          pulumi.String("above"),
// 			Where:               pulumi.String(fmt.Sprintf("%v%v%v%v%v", "(hostname LIKE '", "%", "db", "%", "')")),
// 			IntegrationProvider: pulumi.String("RdsDbInstance"),
// 			Critical: &newrelic.InfraAlertConditionCriticalArgs{
// 				Duration:     pulumi.Int(25),
// 				Value:        pulumi.Float64(90),
// 				TimeFunction: pulumi.String("all"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewInfraAlertCondition(ctx, "processNotRunning", &newrelic.InfraAlertConditionArgs{
// 			PolicyId:     foo.ID(),
// 			Description:  pulumi.String("Critical alert when ruby isn't running"),
// 			Type:         pulumi.String("infra_process_running"),
// 			Comparison:   pulumi.String("equal"),
// 			Where:        pulumi.String("hostname = 'web01'"),
// 			ProcessWhere: pulumi.String("commandName = '/usr/bin/ruby'"),
// 			Critical: &newrelic.InfraAlertConditionCriticalArgs{
// 				Duration: pulumi.Int(5),
// 				Value:    pulumi.Float64(0),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewInfraAlertCondition(ctx, "hostNotReporting", &newrelic.InfraAlertConditionArgs{
// 			PolicyId:    foo.ID(),
// 			Description: pulumi.String("Critical alert when the host is not reporting"),
// 			Type:        pulumi.String("infra_host_not_reporting"),
// 			Where:       pulumi.String(fmt.Sprintf("%v%v%v%v%v", "(hostname LIKE '", "%", "frontend", "%", "')")),
// 			Critical: &newrelic.InfraAlertConditionCriticalArgs{
// 				Duration: pulumi.Int(5),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Thresholds
//
// The `critical` and `warning` threshold mapping supports the following arguments:
//
//   * `duration` - (Required) Identifies the number of minutes the threshold must be passed or met for the alert to trigger. Threshold durations must be between 1 and 60 minutes (inclusive).
//   * `value` - (Optional) Threshold value, computed against the `comparison` operator. Supported by `infraMetric` and `infraProcessRunning` alert condition types.
//   * `timeFunction` - (Optional) Indicates if the condition needs to be sustained or to just break the threshold once; `all` or `any`. Supported by the `infraMetric` alert condition type.
//
// ## Import
//
// Infrastructure alert conditions can be imported using a composite ID of `<policy_id>:<condition_id>`, e.g.
//
// ```sh
//  $ pulumi import newrelic:index/infraAlertCondition:InfraAlertCondition main 12345:67890
// ```
type InfraAlertCondition struct {
	pulumi.CustomResourceState

	// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
	Comparison pulumi.StringPtrOutput `pulumi:"comparison"`
	// The timestamp the alert condition was created.
	CreatedAt pulumi.IntOutput `pulumi:"createdAt"`
	// Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
	Critical InfraAlertConditionCriticalPtrOutput `pulumi:"critical"`
	// The description of the Infrastructure alert condition.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
	Event pulumi.StringOutput `pulumi:"event"`
	// For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
	IntegrationProvider pulumi.StringPtrOutput `pulumi:"integrationProvider"`
	// The Infrastructure alert condition's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The ID of the alert policy where this condition should be used.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
	// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
	ProcessWhere pulumi.StringPtrOutput `pulumi:"processWhere"`
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrOutput `pulumi:"runbookUrl"`
	// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
	Select pulumi.StringPtrOutput `pulumi:"select"`
	// The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The timestamp the alert condition was last updated.
	UpdatedAt pulumi.IntOutput `pulumi:"updatedAt"`
	// Determines how much time will pass (in hours) before a violation is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
	ViolationCloseTimer pulumi.IntPtrOutput `pulumi:"violationCloseTimer"`
	// Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
	Warning InfraAlertConditionWarningPtrOutput `pulumi:"warning"`
	// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
	Where pulumi.StringPtrOutput `pulumi:"where"`
}

// NewInfraAlertCondition registers a new resource with the given unique name, arguments, and options.
func NewInfraAlertCondition(ctx *pulumi.Context,
	name string, args *InfraAlertConditionArgs, opts ...pulumi.ResourceOption) (*InfraAlertCondition, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource InfraAlertCondition
	err := ctx.RegisterResource("newrelic:index/infraAlertCondition:InfraAlertCondition", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetInfraAlertCondition gets an existing InfraAlertCondition resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetInfraAlertCondition(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *InfraAlertConditionState, opts ...pulumi.ResourceOption) (*InfraAlertCondition, error) {
	var resource InfraAlertCondition
	err := ctx.ReadResource("newrelic:index/infraAlertCondition:InfraAlertCondition", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering InfraAlertCondition resources.
type infraAlertConditionState struct {
	// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
	Comparison *string `pulumi:"comparison"`
	// The timestamp the alert condition was created.
	CreatedAt *int `pulumi:"createdAt"`
	// Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
	Critical *InfraAlertConditionCritical `pulumi:"critical"`
	// The description of the Infrastructure alert condition.
	Description *string `pulumi:"description"`
	// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
	Event *string `pulumi:"event"`
	// For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
	IntegrationProvider *string `pulumi:"integrationProvider"`
	// The Infrastructure alert condition's name.
	Name *string `pulumi:"name"`
	// The ID of the alert policy where this condition should be used.
	PolicyId *int `pulumi:"policyId"`
	// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
	ProcessWhere *string `pulumi:"processWhere"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
	Select *string `pulumi:"select"`
	// The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
	Type *string `pulumi:"type"`
	// The timestamp the alert condition was last updated.
	UpdatedAt *int `pulumi:"updatedAt"`
	// Determines how much time will pass (in hours) before a violation is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
	// Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
	Warning *InfraAlertConditionWarning `pulumi:"warning"`
	// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
	Where *string `pulumi:"where"`
}

type InfraAlertConditionState struct {
	// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
	Comparison pulumi.StringPtrInput
	// The timestamp the alert condition was created.
	CreatedAt pulumi.IntPtrInput
	// Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
	Critical InfraAlertConditionCriticalPtrInput
	// The description of the Infrastructure alert condition.
	Description pulumi.StringPtrInput
	// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
	Event pulumi.StringPtrInput
	// For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
	IntegrationProvider pulumi.StringPtrInput
	// The Infrastructure alert condition's name.
	Name pulumi.StringPtrInput
	// The ID of the alert policy where this condition should be used.
	PolicyId pulumi.IntPtrInput
	// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
	ProcessWhere pulumi.StringPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
	Select pulumi.StringPtrInput
	// The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
	Type pulumi.StringPtrInput
	// The timestamp the alert condition was last updated.
	UpdatedAt pulumi.IntPtrInput
	// Determines how much time will pass (in hours) before a violation is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
	ViolationCloseTimer pulumi.IntPtrInput
	// Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
	Warning InfraAlertConditionWarningPtrInput
	// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
	Where pulumi.StringPtrInput
}

func (InfraAlertConditionState) ElementType() reflect.Type {
	return reflect.TypeOf((*infraAlertConditionState)(nil)).Elem()
}

type infraAlertConditionArgs struct {
	// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
	Comparison *string `pulumi:"comparison"`
	// Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
	Critical *InfraAlertConditionCritical `pulumi:"critical"`
	// The description of the Infrastructure alert condition.
	Description *string `pulumi:"description"`
	// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
	Enabled *bool `pulumi:"enabled"`
	// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
	Event *string `pulumi:"event"`
	// For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
	IntegrationProvider *string `pulumi:"integrationProvider"`
	// The Infrastructure alert condition's name.
	Name *string `pulumi:"name"`
	// The ID of the alert policy where this condition should be used.
	PolicyId int `pulumi:"policyId"`
	// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
	ProcessWhere *string `pulumi:"processWhere"`
	// Runbook URL to display in notifications.
	RunbookUrl *string `pulumi:"runbookUrl"`
	// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
	Select *string `pulumi:"select"`
	// The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
	Type string `pulumi:"type"`
	// Determines how much time will pass (in hours) before a violation is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
	ViolationCloseTimer *int `pulumi:"violationCloseTimer"`
	// Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
	Warning *InfraAlertConditionWarning `pulumi:"warning"`
	// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
	Where *string `pulumi:"where"`
}

// The set of arguments for constructing a InfraAlertCondition resource.
type InfraAlertConditionArgs struct {
	// The operator used to evaluate the threshold value.  Valid values are `above`, `below`, and `equal`.  Supported by the `infraMetric` and `infraProcessRunning` condition types.
	Comparison pulumi.StringPtrInput
	// Identifies the threshold parameters for opening a critical alert violation. See Thresholds below for details.
	Critical InfraAlertConditionCriticalPtrInput
	// The description of the Infrastructure alert condition.
	Description pulumi.StringPtrInput
	// Whether the condition is turned on or off.  Valid values are `true` and `false`.  Defaults to `true`.
	Enabled pulumi.BoolPtrInput
	// The metric event; for example, `SystemSample` or `StorageSample`.  Supported by the `infraMetric` condition type.
	Event pulumi.StringPtrInput
	// For alerts on integrations, use this instead of `event`.  Supported by the `infraMetric` condition type.
	IntegrationProvider pulumi.StringPtrInput
	// The Infrastructure alert condition's name.
	Name pulumi.StringPtrInput
	// The ID of the alert policy where this condition should be used.
	PolicyId pulumi.IntInput
	// Any filters applied to processes; for example: `commandName = 'java'`.  Required by the `infraProcessRunning` condition type.
	ProcessWhere pulumi.StringPtrInput
	// Runbook URL to display in notifications.
	RunbookUrl pulumi.StringPtrInput
	// The attribute name to identify the metric being targeted; for example, `cpuPercent`, `diskFreePercent`, or `memoryResidentSizeBytes`.  The underlying API will automatically populate this value for Infrastructure integrations (for example `diskFreePercent`), so make sure to explicitly include this value to avoid diff issues.  Supported by the `infraMetric` condition type.
	Select pulumi.StringPtrInput
	// The type of Infrastructure alert condition.  Valid values are  `infraProcessRunning`, `infraMetric`, and `infraHostNotReporting`.
	Type pulumi.StringInput
	// Determines how much time will pass (in hours) before a violation is automatically closed. Valid values are `1 2 4 8 12 24 48 72`. Defaults to 24. If `0` is provided, default of `24` is used and will have configuration drift during the apply phase until a valid value is provided.
	ViolationCloseTimer pulumi.IntPtrInput
	// Identifies the threshold parameters for opening a warning alert violation. See Thresholds below for details.
	Warning InfraAlertConditionWarningPtrInput
	// If applicable, this identifies any Infrastructure host filters used; for example: `hostname LIKE '%cassandra%'`.
	Where pulumi.StringPtrInput
}

func (InfraAlertConditionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*infraAlertConditionArgs)(nil)).Elem()
}

type InfraAlertConditionInput interface {
	pulumi.Input

	ToInfraAlertConditionOutput() InfraAlertConditionOutput
	ToInfraAlertConditionOutputWithContext(ctx context.Context) InfraAlertConditionOutput
}

func (*InfraAlertCondition) ElementType() reflect.Type {
	return reflect.TypeOf((*InfraAlertCondition)(nil))
}

func (i *InfraAlertCondition) ToInfraAlertConditionOutput() InfraAlertConditionOutput {
	return i.ToInfraAlertConditionOutputWithContext(context.Background())
}

func (i *InfraAlertCondition) ToInfraAlertConditionOutputWithContext(ctx context.Context) InfraAlertConditionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfraAlertConditionOutput)
}

func (i *InfraAlertCondition) ToInfraAlertConditionPtrOutput() InfraAlertConditionPtrOutput {
	return i.ToInfraAlertConditionPtrOutputWithContext(context.Background())
}

func (i *InfraAlertCondition) ToInfraAlertConditionPtrOutputWithContext(ctx context.Context) InfraAlertConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfraAlertConditionPtrOutput)
}

type InfraAlertConditionPtrInput interface {
	pulumi.Input

	ToInfraAlertConditionPtrOutput() InfraAlertConditionPtrOutput
	ToInfraAlertConditionPtrOutputWithContext(ctx context.Context) InfraAlertConditionPtrOutput
}

type infraAlertConditionPtrType InfraAlertConditionArgs

func (*infraAlertConditionPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**InfraAlertCondition)(nil))
}

func (i *infraAlertConditionPtrType) ToInfraAlertConditionPtrOutput() InfraAlertConditionPtrOutput {
	return i.ToInfraAlertConditionPtrOutputWithContext(context.Background())
}

func (i *infraAlertConditionPtrType) ToInfraAlertConditionPtrOutputWithContext(ctx context.Context) InfraAlertConditionPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfraAlertConditionPtrOutput)
}

// InfraAlertConditionArrayInput is an input type that accepts InfraAlertConditionArray and InfraAlertConditionArrayOutput values.
// You can construct a concrete instance of `InfraAlertConditionArrayInput` via:
//
//          InfraAlertConditionArray{ InfraAlertConditionArgs{...} }
type InfraAlertConditionArrayInput interface {
	pulumi.Input

	ToInfraAlertConditionArrayOutput() InfraAlertConditionArrayOutput
	ToInfraAlertConditionArrayOutputWithContext(context.Context) InfraAlertConditionArrayOutput
}

type InfraAlertConditionArray []InfraAlertConditionInput

func (InfraAlertConditionArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*InfraAlertCondition)(nil))
}

func (i InfraAlertConditionArray) ToInfraAlertConditionArrayOutput() InfraAlertConditionArrayOutput {
	return i.ToInfraAlertConditionArrayOutputWithContext(context.Background())
}

func (i InfraAlertConditionArray) ToInfraAlertConditionArrayOutputWithContext(ctx context.Context) InfraAlertConditionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfraAlertConditionArrayOutput)
}

// InfraAlertConditionMapInput is an input type that accepts InfraAlertConditionMap and InfraAlertConditionMapOutput values.
// You can construct a concrete instance of `InfraAlertConditionMapInput` via:
//
//          InfraAlertConditionMap{ "key": InfraAlertConditionArgs{...} }
type InfraAlertConditionMapInput interface {
	pulumi.Input

	ToInfraAlertConditionMapOutput() InfraAlertConditionMapOutput
	ToInfraAlertConditionMapOutputWithContext(context.Context) InfraAlertConditionMapOutput
}

type InfraAlertConditionMap map[string]InfraAlertConditionInput

func (InfraAlertConditionMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*InfraAlertCondition)(nil))
}

func (i InfraAlertConditionMap) ToInfraAlertConditionMapOutput() InfraAlertConditionMapOutput {
	return i.ToInfraAlertConditionMapOutputWithContext(context.Background())
}

func (i InfraAlertConditionMap) ToInfraAlertConditionMapOutputWithContext(ctx context.Context) InfraAlertConditionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(InfraAlertConditionMapOutput)
}

type InfraAlertConditionOutput struct {
	*pulumi.OutputState
}

func (InfraAlertConditionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*InfraAlertCondition)(nil))
}

func (o InfraAlertConditionOutput) ToInfraAlertConditionOutput() InfraAlertConditionOutput {
	return o
}

func (o InfraAlertConditionOutput) ToInfraAlertConditionOutputWithContext(ctx context.Context) InfraAlertConditionOutput {
	return o
}

func (o InfraAlertConditionOutput) ToInfraAlertConditionPtrOutput() InfraAlertConditionPtrOutput {
	return o.ToInfraAlertConditionPtrOutputWithContext(context.Background())
}

func (o InfraAlertConditionOutput) ToInfraAlertConditionPtrOutputWithContext(ctx context.Context) InfraAlertConditionPtrOutput {
	return o.ApplyT(func(v InfraAlertCondition) *InfraAlertCondition {
		return &v
	}).(InfraAlertConditionPtrOutput)
}

type InfraAlertConditionPtrOutput struct {
	*pulumi.OutputState
}

func (InfraAlertConditionPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**InfraAlertCondition)(nil))
}

func (o InfraAlertConditionPtrOutput) ToInfraAlertConditionPtrOutput() InfraAlertConditionPtrOutput {
	return o
}

func (o InfraAlertConditionPtrOutput) ToInfraAlertConditionPtrOutputWithContext(ctx context.Context) InfraAlertConditionPtrOutput {
	return o
}

type InfraAlertConditionArrayOutput struct{ *pulumi.OutputState }

func (InfraAlertConditionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]InfraAlertCondition)(nil))
}

func (o InfraAlertConditionArrayOutput) ToInfraAlertConditionArrayOutput() InfraAlertConditionArrayOutput {
	return o
}

func (o InfraAlertConditionArrayOutput) ToInfraAlertConditionArrayOutputWithContext(ctx context.Context) InfraAlertConditionArrayOutput {
	return o
}

func (o InfraAlertConditionArrayOutput) Index(i pulumi.IntInput) InfraAlertConditionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) InfraAlertCondition {
		return vs[0].([]InfraAlertCondition)[vs[1].(int)]
	}).(InfraAlertConditionOutput)
}

type InfraAlertConditionMapOutput struct{ *pulumi.OutputState }

func (InfraAlertConditionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]InfraAlertCondition)(nil))
}

func (o InfraAlertConditionMapOutput) ToInfraAlertConditionMapOutput() InfraAlertConditionMapOutput {
	return o
}

func (o InfraAlertConditionMapOutput) ToInfraAlertConditionMapOutputWithContext(ctx context.Context) InfraAlertConditionMapOutput {
	return o
}

func (o InfraAlertConditionMapOutput) MapIndex(k pulumi.StringInput) InfraAlertConditionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) InfraAlertCondition {
		return vs[0].(map[string]InfraAlertCondition)[vs[1].(string)]
	}).(InfraAlertConditionOutput)
}

func init() {
	pulumi.RegisterOutputType(InfraAlertConditionOutput{})
	pulumi.RegisterOutputType(InfraAlertConditionPtrOutput{})
	pulumi.RegisterOutputType(InfraAlertConditionArrayOutput{})
	pulumi.RegisterOutputType(InfraAlertConditionMapOutput{})
}
