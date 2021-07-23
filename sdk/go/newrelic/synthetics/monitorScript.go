// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to update a synthetics monitor script in New Relic.
//
// ## Import
//
// Synthetics monitor scripts can be imported using the `id`, e.g. bash
//
// ```sh
//  $ pulumi import newrelic:synthetics/monitorScript:MonitorScript main <id>
// ```
type MonitorScript struct {
	pulumi.CustomResourceState

	// A nested block that describes a monitor script location. See Nested location blocks below for details
	Locations MonitorScriptLocationArrayOutput `pulumi:"locations"`
	// The ID of the monitor to attach the script to.
	MonitorId pulumi.StringOutput `pulumi:"monitorId"`
	// The plaintext representing the monitor script.
	Text pulumi.StringOutput `pulumi:"text"`
}

// NewMonitorScript registers a new resource with the given unique name, arguments, and options.
func NewMonitorScript(ctx *pulumi.Context,
	name string, args *MonitorScriptArgs, opts ...pulumi.ResourceOption) (*MonitorScript, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitorId == nil {
		return nil, errors.New("invalid value for required argument 'MonitorId'")
	}
	if args.Text == nil {
		return nil, errors.New("invalid value for required argument 'Text'")
	}
	var resource MonitorScript
	err := ctx.RegisterResource("newrelic:synthetics/monitorScript:MonitorScript", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorScript gets an existing MonitorScript resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorScript(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorScriptState, opts ...pulumi.ResourceOption) (*MonitorScript, error) {
	var resource MonitorScript
	err := ctx.ReadResource("newrelic:synthetics/monitorScript:MonitorScript", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorScript resources.
type monitorScriptState struct {
	// A nested block that describes a monitor script location. See Nested location blocks below for details
	Locations []MonitorScriptLocation `pulumi:"locations"`
	// The ID of the monitor to attach the script to.
	MonitorId *string `pulumi:"monitorId"`
	// The plaintext representing the monitor script.
	Text *string `pulumi:"text"`
}

type MonitorScriptState struct {
	// A nested block that describes a monitor script location. See Nested location blocks below for details
	Locations MonitorScriptLocationArrayInput
	// The ID of the monitor to attach the script to.
	MonitorId pulumi.StringPtrInput
	// The plaintext representing the monitor script.
	Text pulumi.StringPtrInput
}

func (MonitorScriptState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorScriptState)(nil)).Elem()
}

type monitorScriptArgs struct {
	// A nested block that describes a monitor script location. See Nested location blocks below for details
	Locations []MonitorScriptLocation `pulumi:"locations"`
	// The ID of the monitor to attach the script to.
	MonitorId string `pulumi:"monitorId"`
	// The plaintext representing the monitor script.
	Text string `pulumi:"text"`
}

// The set of arguments for constructing a MonitorScript resource.
type MonitorScriptArgs struct {
	// A nested block that describes a monitor script location. See Nested location blocks below for details
	Locations MonitorScriptLocationArrayInput
	// The ID of the monitor to attach the script to.
	MonitorId pulumi.StringInput
	// The plaintext representing the monitor script.
	Text pulumi.StringInput
}

func (MonitorScriptArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorScriptArgs)(nil)).Elem()
}

type MonitorScriptInput interface {
	pulumi.Input

	ToMonitorScriptOutput() MonitorScriptOutput
	ToMonitorScriptOutputWithContext(ctx context.Context) MonitorScriptOutput
}

func (*MonitorScript) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorScript)(nil))
}

func (i *MonitorScript) ToMonitorScriptOutput() MonitorScriptOutput {
	return i.ToMonitorScriptOutputWithContext(context.Background())
}

func (i *MonitorScript) ToMonitorScriptOutputWithContext(ctx context.Context) MonitorScriptOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptOutput)
}

func (i *MonitorScript) ToMonitorScriptPtrOutput() MonitorScriptPtrOutput {
	return i.ToMonitorScriptPtrOutputWithContext(context.Background())
}

func (i *MonitorScript) ToMonitorScriptPtrOutputWithContext(ctx context.Context) MonitorScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptPtrOutput)
}

type MonitorScriptPtrInput interface {
	pulumi.Input

	ToMonitorScriptPtrOutput() MonitorScriptPtrOutput
	ToMonitorScriptPtrOutputWithContext(ctx context.Context) MonitorScriptPtrOutput
}

type monitorScriptPtrType MonitorScriptArgs

func (*monitorScriptPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorScript)(nil))
}

func (i *monitorScriptPtrType) ToMonitorScriptPtrOutput() MonitorScriptPtrOutput {
	return i.ToMonitorScriptPtrOutputWithContext(context.Background())
}

func (i *monitorScriptPtrType) ToMonitorScriptPtrOutputWithContext(ctx context.Context) MonitorScriptPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptPtrOutput)
}

// MonitorScriptArrayInput is an input type that accepts MonitorScriptArray and MonitorScriptArrayOutput values.
// You can construct a concrete instance of `MonitorScriptArrayInput` via:
//
//          MonitorScriptArray{ MonitorScriptArgs{...} }
type MonitorScriptArrayInput interface {
	pulumi.Input

	ToMonitorScriptArrayOutput() MonitorScriptArrayOutput
	ToMonitorScriptArrayOutputWithContext(context.Context) MonitorScriptArrayOutput
}

type MonitorScriptArray []MonitorScriptInput

func (MonitorScriptArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*MonitorScript)(nil))
}

func (i MonitorScriptArray) ToMonitorScriptArrayOutput() MonitorScriptArrayOutput {
	return i.ToMonitorScriptArrayOutputWithContext(context.Background())
}

func (i MonitorScriptArray) ToMonitorScriptArrayOutputWithContext(ctx context.Context) MonitorScriptArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptArrayOutput)
}

// MonitorScriptMapInput is an input type that accepts MonitorScriptMap and MonitorScriptMapOutput values.
// You can construct a concrete instance of `MonitorScriptMapInput` via:
//
//          MonitorScriptMap{ "key": MonitorScriptArgs{...} }
type MonitorScriptMapInput interface {
	pulumi.Input

	ToMonitorScriptMapOutput() MonitorScriptMapOutput
	ToMonitorScriptMapOutputWithContext(context.Context) MonitorScriptMapOutput
}

type MonitorScriptMap map[string]MonitorScriptInput

func (MonitorScriptMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*MonitorScript)(nil))
}

func (i MonitorScriptMap) ToMonitorScriptMapOutput() MonitorScriptMapOutput {
	return i.ToMonitorScriptMapOutputWithContext(context.Background())
}

func (i MonitorScriptMap) ToMonitorScriptMapOutputWithContext(ctx context.Context) MonitorScriptMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorScriptMapOutput)
}

type MonitorScriptOutput struct {
	*pulumi.OutputState
}

func (MonitorScriptOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*MonitorScript)(nil))
}

func (o MonitorScriptOutput) ToMonitorScriptOutput() MonitorScriptOutput {
	return o
}

func (o MonitorScriptOutput) ToMonitorScriptOutputWithContext(ctx context.Context) MonitorScriptOutput {
	return o
}

func (o MonitorScriptOutput) ToMonitorScriptPtrOutput() MonitorScriptPtrOutput {
	return o.ToMonitorScriptPtrOutputWithContext(context.Background())
}

func (o MonitorScriptOutput) ToMonitorScriptPtrOutputWithContext(ctx context.Context) MonitorScriptPtrOutput {
	return o.ApplyT(func(v MonitorScript) *MonitorScript {
		return &v
	}).(MonitorScriptPtrOutput)
}

type MonitorScriptPtrOutput struct {
	*pulumi.OutputState
}

func (MonitorScriptPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorScript)(nil))
}

func (o MonitorScriptPtrOutput) ToMonitorScriptPtrOutput() MonitorScriptPtrOutput {
	return o
}

func (o MonitorScriptPtrOutput) ToMonitorScriptPtrOutputWithContext(ctx context.Context) MonitorScriptPtrOutput {
	return o
}

type MonitorScriptArrayOutput struct{ *pulumi.OutputState }

func (MonitorScriptArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]MonitorScript)(nil))
}

func (o MonitorScriptArrayOutput) ToMonitorScriptArrayOutput() MonitorScriptArrayOutput {
	return o
}

func (o MonitorScriptArrayOutput) ToMonitorScriptArrayOutputWithContext(ctx context.Context) MonitorScriptArrayOutput {
	return o
}

func (o MonitorScriptArrayOutput) Index(i pulumi.IntInput) MonitorScriptOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) MonitorScript {
		return vs[0].([]MonitorScript)[vs[1].(int)]
	}).(MonitorScriptOutput)
}

type MonitorScriptMapOutput struct{ *pulumi.OutputState }

func (MonitorScriptMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]MonitorScript)(nil))
}

func (o MonitorScriptMapOutput) ToMonitorScriptMapOutput() MonitorScriptMapOutput {
	return o
}

func (o MonitorScriptMapOutput) ToMonitorScriptMapOutputWithContext(ctx context.Context) MonitorScriptMapOutput {
	return o
}

func (o MonitorScriptMapOutput) MapIndex(k pulumi.StringInput) MonitorScriptOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) MonitorScript {
		return vs[0].(map[string]MonitorScript)[vs[1].(string)]
	}).(MonitorScriptOutput)
}

func init() {
	pulumi.RegisterOutputType(MonitorScriptOutput{})
	pulumi.RegisterOutputType(MonitorScriptPtrOutput{})
	pulumi.RegisterOutputType(MonitorScriptArrayOutput{})
	pulumi.RegisterOutputType(MonitorScriptMapOutput{})
}
