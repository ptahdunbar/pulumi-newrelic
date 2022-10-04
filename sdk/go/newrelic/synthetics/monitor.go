// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a Simple or Browser Synthetics Monitor in New Relic.
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
//			_, err := synthetics.NewMonitor(ctx, "monitor", &synthetics.MonitorArgs{
//				BypassHeadRequest: pulumi.Bool(true),
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("Name"),
//						Value: pulumi.String("simpleMonitor"),
//					},
//				},
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				Period: pulumi.String("EVERY_MINUTE"),
//				Status: pulumi.String("ENABLED"),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
//						Key: pulumi.String("some_key"),
//						Values: pulumi.StringArray{
//							pulumi.String("some_value"),
//						},
//					},
//				},
//				TreatRedirectAsFailure: pulumi.Bool(true),
//				Type:                   pulumi.String("SIMPLE"),
//				Uri:                    pulumi.String("https://www.one.newrelic.com"),
//				ValidationString:       pulumi.String("success"),
//				VerifySsl:              pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ##### Type: `SIMPLE BROWSER`
//
// > **NOTE:** The preferred runtime is `CHROME_BROWSER_100` while configuring the `SIMPLE_BROWSER` monitor. The runtime fields `runtimeType`, `runtimeTypeVersion` and `scriptLanguage` are required. Other runtime may be deprecated in the future and receive fewer product updates.
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
//			_, err := synthetics.NewMonitor(ctx, "bar", &synthetics.MonitorArgs{
//				CustomHeaders: synthetics.MonitorCustomHeaderArray{
//					&synthetics.MonitorCustomHeaderArgs{
//						Name:  pulumi.String("name"),
//						Value: pulumi.String("simple_browser"),
//					},
//				},
//				EnableScreenshotOnFailureAndScript: pulumi.Bool(true),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				Period:             pulumi.String("EVERY_MINUTE"),
//				RuntimeType:        pulumi.String("CHROME_BROWSER"),
//				RuntimeTypeVersion: pulumi.String("100"),
//				ScriptLanguage:     pulumi.String("JAVASCRIPT"),
//				Status:             pulumi.String("ENABLED"),
//				Tags: synthetics.MonitorTagArray{
//					&synthetics.MonitorTagArgs{
//						Key: pulumi.String("name"),
//						Values: pulumi.StringArray{
//							pulumi.String("SimpleBrowserMonitor"),
//						},
//					},
//				},
//				Type:             pulumi.String("BROWSER"),
//				Uri:              pulumi.String("https://www.one.newrelic.com"),
//				ValidationString: pulumi.String("success"),
//				VerifySsl:        pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// See additional examples.
// ## Additional Examples
//
// ## Import
//
// Synthetics monitor can be imported using the `guid`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/monitor:Monitor bar <guid>
//
// ```
type Monitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	BypassHeadRequest pulumi.BoolPtrOutput `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayOutput `pulumi:"customHeaders"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrOutput `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayOutput `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringOutput `pulumi:"period"`
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrOutput `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrOutput `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrOutput `pulumi:"scriptLanguage"`
	// The run state of the monitor.
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags MonitorTagArrayOutput `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrOutput `pulumi:"treatRedirectAsFailure"`
	// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringOutput `pulumi:"type"`
	// The uri the monitor runs against.
	Uri pulumi.StringPtrOutput `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrOutput `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl pulumi.BoolPtrOutput `pulumi:"verifySsl"`
}

// NewMonitor registers a new resource with the given unique name, arguments, and options.
func NewMonitor(ctx *pulumi.Context,
	name string, args *MonitorArgs, opts ...pulumi.ResourceOption) (*Monitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	if args.Type == nil {
		return nil, errors.New("invalid value for required argument 'Type'")
	}
	var resource Monitor
	err := ctx.RegisterResource("newrelic:synthetics/monitor:Monitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitor gets an existing Monitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorState, opts ...pulumi.ResourceOption) (*Monitor, error) {
	var resource Monitor
	err := ctx.ReadResource("newrelic:synthetics/monitor:Monitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Monitor resources.
type monitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
	CustomHeaders []MonitorCustomHeader `pulumi:"customHeaders"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The runtime type that the monitor will run.
	RuntimeType *string `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The run state of the monitor.
	Status *string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags []MonitorTag `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type *string `pulumi:"type"`
	// The uri the monitor runs against.
	Uri *string `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString *string `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl *bool `pulumi:"verifySsl"`
}

type MonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// Monitor should skip default HEAD request and instead use GET verb in check.
	BypassHeadRequest pulumi.BoolPtrInput
	// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The human-readable identifier for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The run state of the monitor.
	Status pulumi.StringPtrInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags MonitorTagArrayInput
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringPtrInput
	// The uri the monitor runs against.
	Uri pulumi.StringPtrInput
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrInput
	// Monitor should validate SSL certificate chain.
	VerifySsl pulumi.BoolPtrInput
}

func (MonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorState)(nil)).Elem()
}

type monitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// Monitor should skip default HEAD request and instead use GET verb in check.
	BypassHeadRequest *bool `pulumi:"bypassHeadRequest"`
	// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
	CustomHeaders []MonitorCustomHeader `pulumi:"customHeaders"`
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript *bool `pulumi:"enableScreenshotOnFailureAndScript"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The human-readable identifier for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The runtime type that the monitor will run.
	RuntimeType *string `pulumi:"runtimeType"`
	// The runtime type that the monitor will run.
	RuntimeTypeVersion *string `pulumi:"runtimeTypeVersion"`
	// The programing language that should execute the script.
	ScriptLanguage *string `pulumi:"scriptLanguage"`
	// The run state of the monitor.
	Status string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags []MonitorTag `pulumi:"tags"`
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure *bool `pulumi:"treatRedirectAsFailure"`
	// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type string `pulumi:"type"`
	// The uri the monitor runs against.
	Uri *string `pulumi:"uri"`
	// Validation text for monitor to search for at given URI.
	ValidationString *string `pulumi:"validationString"`
	// Monitor should validate SSL certificate chain.
	VerifySsl *bool `pulumi:"verifySsl"`
}

// The set of arguments for constructing a Monitor resource.
type MonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// Monitor should skip default HEAD request and instead use GET verb in check.
	BypassHeadRequest pulumi.BoolPtrInput
	// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
	CustomHeaders MonitorCustomHeaderArrayInput
	// Capture a screenshot during job execution.
	EnableScreenshotOnFailureAndScript pulumi.BoolPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The human-readable identifier for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeType pulumi.StringPtrInput
	// The runtime type that the monitor will run.
	RuntimeTypeVersion pulumi.StringPtrInput
	// The programing language that should execute the script.
	ScriptLanguage pulumi.StringPtrInput
	// The run state of the monitor.
	Status pulumi.StringInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details.
	Tags MonitorTagArrayInput
	// Categorize redirects during a monitor job as a failure.
	TreatRedirectAsFailure pulumi.BoolPtrInput
	// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
	Type pulumi.StringInput
	// The uri the monitor runs against.
	Uri pulumi.StringPtrInput
	// Validation text for monitor to search for at given URI.
	ValidationString pulumi.StringPtrInput
	// Monitor should validate SSL certificate chain.
	VerifySsl pulumi.BoolPtrInput
}

func (MonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorArgs)(nil)).Elem()
}

type MonitorInput interface {
	pulumi.Input

	ToMonitorOutput() MonitorOutput
	ToMonitorOutputWithContext(ctx context.Context) MonitorOutput
}

func (*Monitor) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (i *Monitor) ToMonitorOutput() MonitorOutput {
	return i.ToMonitorOutputWithContext(context.Background())
}

func (i *Monitor) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorOutput)
}

// MonitorArrayInput is an input type that accepts MonitorArray and MonitorArrayOutput values.
// You can construct a concrete instance of `MonitorArrayInput` via:
//
//	MonitorArray{ MonitorArgs{...} }
type MonitorArrayInput interface {
	pulumi.Input

	ToMonitorArrayOutput() MonitorArrayOutput
	ToMonitorArrayOutputWithContext(context.Context) MonitorArrayOutput
}

type MonitorArray []MonitorInput

func (MonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
}

func (i MonitorArray) ToMonitorArrayOutput() MonitorArrayOutput {
	return i.ToMonitorArrayOutputWithContext(context.Background())
}

func (i MonitorArray) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorArrayOutput)
}

// MonitorMapInput is an input type that accepts MonitorMap and MonitorMapOutput values.
// You can construct a concrete instance of `MonitorMapInput` via:
//
//	MonitorMap{ "key": MonitorArgs{...} }
type MonitorMapInput interface {
	pulumi.Input

	ToMonitorMapOutput() MonitorMapOutput
	ToMonitorMapOutputWithContext(context.Context) MonitorMapOutput
}

type MonitorMap map[string]MonitorInput

func (MonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (i MonitorMap) ToMonitorMapOutput() MonitorMapOutput {
	return i.ToMonitorMapOutputWithContext(context.Background())
}

func (i MonitorMap) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorMapOutput)
}

type MonitorOutput struct{ *pulumi.OutputState }

func (MonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Monitor)(nil)).Elem()
}

func (o MonitorOutput) ToMonitorOutput() MonitorOutput {
	return o
}

func (o MonitorOutput) ToMonitorOutputWithContext(ctx context.Context) MonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o MonitorOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *Monitor) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// Monitor should skip default HEAD request and instead use GET verb in check.
func (o MonitorOutput) BypassHeadRequest() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.BypassHeadRequest }).(pulumi.BoolPtrOutput)
}

// Custom headers to use in monitor job. See Nested customerHeader blocks below for details.
func (o MonitorOutput) CustomHeaders() MonitorCustomHeaderArrayOutput {
	return o.ApplyT(func(v *Monitor) MonitorCustomHeaderArrayOutput { return v.CustomHeaders }).(MonitorCustomHeaderArrayOutput)
}

// Capture a screenshot during job execution.
func (o MonitorOutput) EnableScreenshotOnFailureAndScript() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.EnableScreenshotOnFailureAndScript }).(pulumi.BoolPtrOutput)
}

// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
func (o MonitorOutput) LocationsPrivates() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringArrayOutput { return v.LocationsPrivates }).(pulumi.StringArrayOutput)
}

// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
func (o MonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The human-readable identifier for the monitor.
func (o MonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
func (o MonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The runtime type that the monitor will run.
func (o MonitorOutput) RuntimeType() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.RuntimeType }).(pulumi.StringPtrOutput)
}

// The runtime type that the monitor will run.
func (o MonitorOutput) RuntimeTypeVersion() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.RuntimeTypeVersion }).(pulumi.StringPtrOutput)
}

// The programing language that should execute the script.
func (o MonitorOutput) ScriptLanguage() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.ScriptLanguage }).(pulumi.StringPtrOutput)
}

// The run state of the monitor.
func (o MonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details.
func (o MonitorOutput) Tags() MonitorTagArrayOutput {
	return o.ApplyT(func(v *Monitor) MonitorTagArrayOutput { return v.Tags }).(MonitorTagArrayOutput)
}

// Categorize redirects during a monitor job as a failure.
func (o MonitorOutput) TreatRedirectAsFailure() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.TreatRedirectAsFailure }).(pulumi.BoolPtrOutput)
}

// THE monitor type. Valid values are `SIMPLE` and `BROWSER`.
func (o MonitorOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

// The uri the monitor runs against.
func (o MonitorOutput) Uri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.Uri }).(pulumi.StringPtrOutput)
}

// Validation text for monitor to search for at given URI.
func (o MonitorOutput) ValidationString() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.StringPtrOutput { return v.ValidationString }).(pulumi.StringPtrOutput)
}

// Monitor should validate SSL certificate chain.
func (o MonitorOutput) VerifySsl() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Monitor) pulumi.BoolPtrOutput { return v.VerifySsl }).(pulumi.BoolPtrOutput)
}

type MonitorArrayOutput struct{ *pulumi.OutputState }

func (MonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Monitor)(nil)).Elem()
}

func (o MonitorArrayOutput) ToMonitorArrayOutput() MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) ToMonitorArrayOutputWithContext(ctx context.Context) MonitorArrayOutput {
	return o
}

func (o MonitorArrayOutput) Index(i pulumi.IntInput) MonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].([]*Monitor)[vs[1].(int)]
	}).(MonitorOutput)
}

type MonitorMapOutput struct{ *pulumi.OutputState }

func (MonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Monitor)(nil)).Elem()
}

func (o MonitorMapOutput) ToMonitorMapOutput() MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) ToMonitorMapOutputWithContext(ctx context.Context) MonitorMapOutput {
	return o
}

func (o MonitorMapOutput) MapIndex(k pulumi.StringInput) MonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Monitor {
		return vs[0].(map[string]*Monitor)[vs[1].(string)]
	}).(MonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorInput)(nil)).Elem(), &Monitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorArrayInput)(nil)).Elem(), MonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorMapInput)(nil)).Elem(), MonitorMap{})
	pulumi.RegisterOutputType(MonitorOutput{})
	pulumi.RegisterOutputType(MonitorArrayOutput{})
	pulumi.RegisterOutputType(MonitorMapOutput{})
}
