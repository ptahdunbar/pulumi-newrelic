// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to map alert policies to alert channels in New Relic.
//
// ## Example Usage
//
// The example below will apply multiple alert channels to an existing New Relic alert policy.
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := newrelic.LookupAlertPolicy(ctx, &GetAlertPolicyArgs{
// 			Name: "my-alert-policy",
// 		}, nil)
// 		if err != nil {
// 			return err
// 		}
// 		emailChannel, err := newrelic.NewAlertChannel(ctx, "emailChannel", &newrelic.AlertChannelArgs{
// 			Type: pulumi.String("email"),
// 			Config: &AlertChannelConfigArgs{
// 				Recipients:            pulumi.String("foo@example.com"),
// 				IncludeJsonAttachment: pulumi.String("1"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		slackChannel, err := newrelic.NewAlertChannel(ctx, "slackChannel", &newrelic.AlertChannelArgs{
// 			Type: pulumi.String("slack"),
// 			Config: &AlertChannelConfigArgs{
// 				Channel: pulumi.String("#example-channel"),
// 				Url:     pulumi.String("http://example-org.slack.com"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewAlertPolicyChannel(ctx, "foo", &newrelic.AlertPolicyChannelArgs{
// 			PolicyId: pulumi.Any(newrelic_alert_policy.Example_policy.Id),
// 			ChannelIds: pulumi.IntArray{
// 				emailChannel.ID(),
// 				slackChannel.ID(),
// 			},
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
// Alert policy channels can be imported using the following notation`<policyID>:<channelID>:<channelID>`, e.g.
//
// ```sh
//  $ pulumi import newrelic:index/alertPolicyChannel:AlertPolicyChannel foo 123456:3462754:2938324
// ```
//
//  When importing `newrelic_alert_policy_channel` resource, the attribute `channel_ids`\* will be set in your Terraform state. You can import multiple channels as long as those channel IDs are included as part of the import ID hash.
type AlertPolicyChannel struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
	ChannelIds pulumi.IntArrayOutput `pulumi:"channelIds"`
	// The ID of the policy.
	PolicyId pulumi.IntOutput `pulumi:"policyId"`
}

// NewAlertPolicyChannel registers a new resource with the given unique name, arguments, and options.
func NewAlertPolicyChannel(ctx *pulumi.Context,
	name string, args *AlertPolicyChannelArgs, opts ...pulumi.ResourceOption) (*AlertPolicyChannel, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ChannelIds == nil {
		return nil, errors.New("invalid value for required argument 'ChannelIds'")
	}
	if args.PolicyId == nil {
		return nil, errors.New("invalid value for required argument 'PolicyId'")
	}
	var resource AlertPolicyChannel
	err := ctx.RegisterResource("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAlertPolicyChannel gets an existing AlertPolicyChannel resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAlertPolicyChannel(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AlertPolicyChannelState, opts ...pulumi.ResourceOption) (*AlertPolicyChannel, error) {
	var resource AlertPolicyChannel
	err := ctx.ReadResource("newrelic:index/alertPolicyChannel:AlertPolicyChannel", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AlertPolicyChannel resources.
type alertPolicyChannelState struct {
	// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
	ChannelIds []int `pulumi:"channelIds"`
	// The ID of the policy.
	PolicyId *int `pulumi:"policyId"`
}

type AlertPolicyChannelState struct {
	// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
	ChannelIds pulumi.IntArrayInput
	// The ID of the policy.
	PolicyId pulumi.IntPtrInput
}

func (AlertPolicyChannelState) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyChannelState)(nil)).Elem()
}

type alertPolicyChannelArgs struct {
	// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
	ChannelIds []int `pulumi:"channelIds"`
	// The ID of the policy.
	PolicyId int `pulumi:"policyId"`
}

// The set of arguments for constructing a AlertPolicyChannel resource.
type AlertPolicyChannelArgs struct {
	// Determines the New Relic account where the alert policy channel will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// Array of channel IDs to apply to the specified policy. We recommended sorting channel IDs in ascending order to avoid drift in your state.
	ChannelIds pulumi.IntArrayInput
	// The ID of the policy.
	PolicyId pulumi.IntInput
}

func (AlertPolicyChannelArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*alertPolicyChannelArgs)(nil)).Elem()
}

type AlertPolicyChannelInput interface {
	pulumi.Input

	ToAlertPolicyChannelOutput() AlertPolicyChannelOutput
	ToAlertPolicyChannelOutputWithContext(ctx context.Context) AlertPolicyChannelOutput
}

func (*AlertPolicyChannel) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicyChannel)(nil)).Elem()
}

func (i *AlertPolicyChannel) ToAlertPolicyChannelOutput() AlertPolicyChannelOutput {
	return i.ToAlertPolicyChannelOutputWithContext(context.Background())
}

func (i *AlertPolicyChannel) ToAlertPolicyChannelOutputWithContext(ctx context.Context) AlertPolicyChannelOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyChannelOutput)
}

// AlertPolicyChannelArrayInput is an input type that accepts AlertPolicyChannelArray and AlertPolicyChannelArrayOutput values.
// You can construct a concrete instance of `AlertPolicyChannelArrayInput` via:
//
//          AlertPolicyChannelArray{ AlertPolicyChannelArgs{...} }
type AlertPolicyChannelArrayInput interface {
	pulumi.Input

	ToAlertPolicyChannelArrayOutput() AlertPolicyChannelArrayOutput
	ToAlertPolicyChannelArrayOutputWithContext(context.Context) AlertPolicyChannelArrayOutput
}

type AlertPolicyChannelArray []AlertPolicyChannelInput

func (AlertPolicyChannelArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertPolicyChannel)(nil)).Elem()
}

func (i AlertPolicyChannelArray) ToAlertPolicyChannelArrayOutput() AlertPolicyChannelArrayOutput {
	return i.ToAlertPolicyChannelArrayOutputWithContext(context.Background())
}

func (i AlertPolicyChannelArray) ToAlertPolicyChannelArrayOutputWithContext(ctx context.Context) AlertPolicyChannelArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyChannelArrayOutput)
}

// AlertPolicyChannelMapInput is an input type that accepts AlertPolicyChannelMap and AlertPolicyChannelMapOutput values.
// You can construct a concrete instance of `AlertPolicyChannelMapInput` via:
//
//          AlertPolicyChannelMap{ "key": AlertPolicyChannelArgs{...} }
type AlertPolicyChannelMapInput interface {
	pulumi.Input

	ToAlertPolicyChannelMapOutput() AlertPolicyChannelMapOutput
	ToAlertPolicyChannelMapOutputWithContext(context.Context) AlertPolicyChannelMapOutput
}

type AlertPolicyChannelMap map[string]AlertPolicyChannelInput

func (AlertPolicyChannelMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertPolicyChannel)(nil)).Elem()
}

func (i AlertPolicyChannelMap) ToAlertPolicyChannelMapOutput() AlertPolicyChannelMapOutput {
	return i.ToAlertPolicyChannelMapOutputWithContext(context.Background())
}

func (i AlertPolicyChannelMap) ToAlertPolicyChannelMapOutputWithContext(ctx context.Context) AlertPolicyChannelMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AlertPolicyChannelMapOutput)
}

type AlertPolicyChannelOutput struct{ *pulumi.OutputState }

func (AlertPolicyChannelOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AlertPolicyChannel)(nil)).Elem()
}

func (o AlertPolicyChannelOutput) ToAlertPolicyChannelOutput() AlertPolicyChannelOutput {
	return o
}

func (o AlertPolicyChannelOutput) ToAlertPolicyChannelOutputWithContext(ctx context.Context) AlertPolicyChannelOutput {
	return o
}

type AlertPolicyChannelArrayOutput struct{ *pulumi.OutputState }

func (AlertPolicyChannelArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AlertPolicyChannel)(nil)).Elem()
}

func (o AlertPolicyChannelArrayOutput) ToAlertPolicyChannelArrayOutput() AlertPolicyChannelArrayOutput {
	return o
}

func (o AlertPolicyChannelArrayOutput) ToAlertPolicyChannelArrayOutputWithContext(ctx context.Context) AlertPolicyChannelArrayOutput {
	return o
}

func (o AlertPolicyChannelArrayOutput) Index(i pulumi.IntInput) AlertPolicyChannelOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AlertPolicyChannel {
		return vs[0].([]*AlertPolicyChannel)[vs[1].(int)]
	}).(AlertPolicyChannelOutput)
}

type AlertPolicyChannelMapOutput struct{ *pulumi.OutputState }

func (AlertPolicyChannelMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AlertPolicyChannel)(nil)).Elem()
}

func (o AlertPolicyChannelMapOutput) ToAlertPolicyChannelMapOutput() AlertPolicyChannelMapOutput {
	return o
}

func (o AlertPolicyChannelMapOutput) ToAlertPolicyChannelMapOutputWithContext(ctx context.Context) AlertPolicyChannelMapOutput {
	return o
}

func (o AlertPolicyChannelMapOutput) MapIndex(k pulumi.StringInput) AlertPolicyChannelOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AlertPolicyChannel {
		return vs[0].(map[string]*AlertPolicyChannel)[vs[1].(string)]
	}).(AlertPolicyChannelOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyChannelInput)(nil)).Elem(), &AlertPolicyChannel{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyChannelArrayInput)(nil)).Elem(), AlertPolicyChannelArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AlertPolicyChannelMapInput)(nil)).Elem(), AlertPolicyChannelMap{})
	pulumi.RegisterOutputType(AlertPolicyChannelOutput{})
	pulumi.RegisterOutputType(AlertPolicyChannelArrayOutput{})
	pulumi.RegisterOutputType(AlertPolicyChannelMapOutput{})
}
