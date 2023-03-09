// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package synthetics

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a Synthetics Certificate Check monitor in New Relic.
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
//			_, err := synthetics.NewCertCheckMonitor(ctx, "cert-check-monitor", &synthetics.CertCheckMonitorArgs{
//				CertificateExpiration: pulumi.Int(10),
//				Domain:                pulumi.String("www.example.com"),
//				LocationsPublics: pulumi.StringArray{
//					pulumi.String("AP_SOUTH_1"),
//				},
//				Period: pulumi.String("EVERY_6_HOURS"),
//				Status: pulumi.String("ENABLED"),
//				Tags: synthetics.CertCheckMonitorTagArray{
//					&synthetics.CertCheckMonitorTagArgs{
//						Key: pulumi.String("some_key"),
//						Values: pulumi.StringArray{
//							pulumi.String("some_value"),
//						},
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
// See additional examples.
// ## Additional Examples
//
// ## Import
//
// Synthetics certificate check monitor scripts can be imported using the `guid`, e.g. bash
//
// ```sh
//
//	$ pulumi import newrelic:synthetics/certCheckMonitor:CertCheckMonitor monitor <guid>
//
// ```
type CertCheckMonitor struct {
	pulumi.CustomResourceState

	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The desired number of remaining days until the certificate expires to trigger a monitor failure.
	CertificateExpiration pulumi.IntOutput `pulumi:"certificateExpiration"`
	// The domain of the host that will have its certificate checked.
	Domain pulumi.StringOutput `pulumi:"domain"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayOutput `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayOutput `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringOutput `pulumi:"period"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringOutput `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags CertCheckMonitorTagArrayOutput `pulumi:"tags"`
}

// NewCertCheckMonitor registers a new resource with the given unique name, arguments, and options.
func NewCertCheckMonitor(ctx *pulumi.Context,
	name string, args *CertCheckMonitorArgs, opts ...pulumi.ResourceOption) (*CertCheckMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateExpiration == nil {
		return nil, errors.New("invalid value for required argument 'CertificateExpiration'")
	}
	if args.Domain == nil {
		return nil, errors.New("invalid value for required argument 'Domain'")
	}
	if args.Period == nil {
		return nil, errors.New("invalid value for required argument 'Period'")
	}
	if args.Status == nil {
		return nil, errors.New("invalid value for required argument 'Status'")
	}
	var resource CertCheckMonitor
	err := ctx.RegisterResource("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCertCheckMonitor gets an existing CertCheckMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCertCheckMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *CertCheckMonitorState, opts ...pulumi.ResourceOption) (*CertCheckMonitor, error) {
	var resource CertCheckMonitor
	err := ctx.ReadResource("newrelic:synthetics/certCheckMonitor:CertCheckMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering CertCheckMonitor resources.
type certCheckMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// The desired number of remaining days until the certificate expires to trigger a monitor failure.
	CertificateExpiration *int `pulumi:"certificateExpiration"`
	// The domain of the host that will have its certificate checked.
	Domain *string `pulumi:"domain"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period *string `pulumi:"period"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status *string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags []CertCheckMonitorTag `pulumi:"tags"`
}

type CertCheckMonitorState struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// The desired number of remaining days until the certificate expires to trigger a monitor failure.
	CertificateExpiration pulumi.IntPtrInput
	// The domain of the host that will have its certificate checked.
	Domain pulumi.StringPtrInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringPtrInput
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringPtrInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags CertCheckMonitorTagArrayInput
}

func (CertCheckMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*certCheckMonitorState)(nil)).Elem()
}

type certCheckMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId *int `pulumi:"accountId"`
	// The desired number of remaining days until the certificate expires to trigger a monitor failure.
	CertificateExpiration int `pulumi:"certificateExpiration"`
	// The domain of the host that will have its certificate checked.
	Domain string `pulumi:"domain"`
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates []string `pulumi:"locationsPrivates"`
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics []string `pulumi:"locationsPublics"`
	// The name for the monitor.
	Name *string `pulumi:"name"`
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period string `pulumi:"period"`
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status string `pulumi:"status"`
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags []CertCheckMonitorTag `pulumi:"tags"`
}

// The set of arguments for constructing a CertCheckMonitor resource.
type CertCheckMonitorArgs struct {
	// The account in which the Synthetics monitor will be created.
	AccountId pulumi.IntPtrInput
	// The desired number of remaining days until the certificate expires to trigger a monitor failure.
	CertificateExpiration pulumi.IntInput
	// The domain of the host that will have its certificate checked.
	Domain pulumi.StringInput
	// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
	LocationsPrivates pulumi.StringArrayInput
	// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
	LocationsPublics pulumi.StringArrayInput
	// The name for the monitor.
	Name pulumi.StringPtrInput
	// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
	Period pulumi.StringInput
	// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
	Status pulumi.StringInput
	// The tags that will be associated with the monitor. See Nested tag blocks below for details
	Tags CertCheckMonitorTagArrayInput
}

func (CertCheckMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*certCheckMonitorArgs)(nil)).Elem()
}

type CertCheckMonitorInput interface {
	pulumi.Input

	ToCertCheckMonitorOutput() CertCheckMonitorOutput
	ToCertCheckMonitorOutputWithContext(ctx context.Context) CertCheckMonitorOutput
}

func (*CertCheckMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**CertCheckMonitor)(nil)).Elem()
}

func (i *CertCheckMonitor) ToCertCheckMonitorOutput() CertCheckMonitorOutput {
	return i.ToCertCheckMonitorOutputWithContext(context.Background())
}

func (i *CertCheckMonitor) ToCertCheckMonitorOutputWithContext(ctx context.Context) CertCheckMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertCheckMonitorOutput)
}

// CertCheckMonitorArrayInput is an input type that accepts CertCheckMonitorArray and CertCheckMonitorArrayOutput values.
// You can construct a concrete instance of `CertCheckMonitorArrayInput` via:
//
//	CertCheckMonitorArray{ CertCheckMonitorArgs{...} }
type CertCheckMonitorArrayInput interface {
	pulumi.Input

	ToCertCheckMonitorArrayOutput() CertCheckMonitorArrayOutput
	ToCertCheckMonitorArrayOutputWithContext(context.Context) CertCheckMonitorArrayOutput
}

type CertCheckMonitorArray []CertCheckMonitorInput

func (CertCheckMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertCheckMonitor)(nil)).Elem()
}

func (i CertCheckMonitorArray) ToCertCheckMonitorArrayOutput() CertCheckMonitorArrayOutput {
	return i.ToCertCheckMonitorArrayOutputWithContext(context.Background())
}

func (i CertCheckMonitorArray) ToCertCheckMonitorArrayOutputWithContext(ctx context.Context) CertCheckMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertCheckMonitorArrayOutput)
}

// CertCheckMonitorMapInput is an input type that accepts CertCheckMonitorMap and CertCheckMonitorMapOutput values.
// You can construct a concrete instance of `CertCheckMonitorMapInput` via:
//
//	CertCheckMonitorMap{ "key": CertCheckMonitorArgs{...} }
type CertCheckMonitorMapInput interface {
	pulumi.Input

	ToCertCheckMonitorMapOutput() CertCheckMonitorMapOutput
	ToCertCheckMonitorMapOutputWithContext(context.Context) CertCheckMonitorMapOutput
}

type CertCheckMonitorMap map[string]CertCheckMonitorInput

func (CertCheckMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertCheckMonitor)(nil)).Elem()
}

func (i CertCheckMonitorMap) ToCertCheckMonitorMapOutput() CertCheckMonitorMapOutput {
	return i.ToCertCheckMonitorMapOutputWithContext(context.Background())
}

func (i CertCheckMonitorMap) ToCertCheckMonitorMapOutputWithContext(ctx context.Context) CertCheckMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(CertCheckMonitorMapOutput)
}

type CertCheckMonitorOutput struct{ *pulumi.OutputState }

func (CertCheckMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**CertCheckMonitor)(nil)).Elem()
}

func (o CertCheckMonitorOutput) ToCertCheckMonitorOutput() CertCheckMonitorOutput {
	return o
}

func (o CertCheckMonitorOutput) ToCertCheckMonitorOutputWithContext(ctx context.Context) CertCheckMonitorOutput {
	return o
}

// The account in which the Synthetics monitor will be created.
func (o CertCheckMonitorOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// The desired number of remaining days until the certificate expires to trigger a monitor failure.
func (o CertCheckMonitorOutput) CertificateExpiration() pulumi.IntOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.IntOutput { return v.CertificateExpiration }).(pulumi.IntOutput)
}

// The domain of the host that will have its certificate checked.
func (o CertCheckMonitorOutput) Domain() pulumi.StringOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringOutput { return v.Domain }).(pulumi.StringOutput)
}

// The location the monitor will run from. Accepts a list of private location GUIDs. At least one of either `locationsPublic` or `locationsPrivate` is required.
func (o CertCheckMonitorOutput) LocationsPrivates() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringArrayOutput { return v.LocationsPrivates }).(pulumi.StringArrayOutput)
}

// The location the monitor will run from. Valid public locations are https://docs.newrelic.com/docs/synthetics/synthetic-monitoring/administration/synthetic-public-minion-ips/. You don't need the `AWS_` prefix as the provider uses NerdGraph. At least one of either `locationsPublic` or `locationPrivate` is required.
func (o CertCheckMonitorOutput) LocationsPublics() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringArrayOutput { return v.LocationsPublics }).(pulumi.StringArrayOutput)
}

// The name for the monitor.
func (o CertCheckMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The interval at which this monitor should run. Valid values are EVERY_MINUTE, EVERY_5_MINUTES, EVERY_10_MINUTES, EVERY_15_MINUTES, EVERY_30_MINUTES, EVERY_HOUR, EVERY_6_HOURS, EVERY_12_HOURS, or EVERY_DAY.
func (o CertCheckMonitorOutput) Period() pulumi.StringOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringOutput { return v.Period }).(pulumi.StringOutput)
}

// The run state of the monitor. (i.e. `ENABLED`, `DISABLED`, `MUTED`).
func (o CertCheckMonitorOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *CertCheckMonitor) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The tags that will be associated with the monitor. See Nested tag blocks below for details
func (o CertCheckMonitorOutput) Tags() CertCheckMonitorTagArrayOutput {
	return o.ApplyT(func(v *CertCheckMonitor) CertCheckMonitorTagArrayOutput { return v.Tags }).(CertCheckMonitorTagArrayOutput)
}

type CertCheckMonitorArrayOutput struct{ *pulumi.OutputState }

func (CertCheckMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*CertCheckMonitor)(nil)).Elem()
}

func (o CertCheckMonitorArrayOutput) ToCertCheckMonitorArrayOutput() CertCheckMonitorArrayOutput {
	return o
}

func (o CertCheckMonitorArrayOutput) ToCertCheckMonitorArrayOutputWithContext(ctx context.Context) CertCheckMonitorArrayOutput {
	return o
}

func (o CertCheckMonitorArrayOutput) Index(i pulumi.IntInput) CertCheckMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *CertCheckMonitor {
		return vs[0].([]*CertCheckMonitor)[vs[1].(int)]
	}).(CertCheckMonitorOutput)
}

type CertCheckMonitorMapOutput struct{ *pulumi.OutputState }

func (CertCheckMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*CertCheckMonitor)(nil)).Elem()
}

func (o CertCheckMonitorMapOutput) ToCertCheckMonitorMapOutput() CertCheckMonitorMapOutput {
	return o
}

func (o CertCheckMonitorMapOutput) ToCertCheckMonitorMapOutputWithContext(ctx context.Context) CertCheckMonitorMapOutput {
	return o
}

func (o CertCheckMonitorMapOutput) MapIndex(k pulumi.StringInput) CertCheckMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *CertCheckMonitor {
		return vs[0].(map[string]*CertCheckMonitor)[vs[1].(string)]
	}).(CertCheckMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*CertCheckMonitorInput)(nil)).Elem(), &CertCheckMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertCheckMonitorArrayInput)(nil)).Elem(), CertCheckMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*CertCheckMonitorMapInput)(nil)).Elem(), CertCheckMonitorMap{})
	pulumi.RegisterOutputType(CertCheckMonitorOutput{})
	pulumi.RegisterOutputType(CertCheckMonitorArrayOutput{})
	pulumi.RegisterOutputType(CertCheckMonitorMapOutput{})
}
