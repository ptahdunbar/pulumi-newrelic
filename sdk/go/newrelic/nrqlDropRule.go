// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// ## Example Usage
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
// 		_, err := newrelic.NewNrqlDropRule(ctx, "foo", &newrelic.NrqlDropRuleArgs{
// 			AccountId:   pulumi.Int(12345),
// 			Action:      pulumi.String("drop_data"),
// 			Description: pulumi.String("Drops all data for MyCustomEvent that comes from the LoadGeneratingApp in the dev environment, because there is too much and we don’t look at it."),
// 			Nrql:        pulumi.String("SELECT * FROM MyCustomEvent WHERE appName='LoadGeneratingApp' AND environment='development'"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewNrqlDropRule(ctx, "bar", &newrelic.NrqlDropRuleArgs{
// 			AccountId:   pulumi.Int(12345),
// 			Action:      pulumi.String("drop_attributes"),
// 			Description: pulumi.String("Removes the user name and email fields from MyCustomEvent"),
// 			Nrql:        pulumi.String("SELECT userEmail, userName FROM MyCustomEvent"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = newrelic.NewNrqlDropRule(ctx, "baz", &newrelic.NrqlDropRuleArgs{
// 			AccountId:   pulumi.Int(12345),
// 			Action:      pulumi.String("drop_attributes_from_metric_aggregates"),
// 			Description: pulumi.String("Removes containerId from metric aggregates to reduce metric cardinality."),
// 			Nrql:        pulumi.String("SELECT containerId FROM Metric"),
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
// New Relic NRQL drop rules can be imported using a concatenated string of the format
//
// `<account_id>:<rule_id>`, e.g. bash
//
// ```sh
//  $ pulumi import newrelic:index/nrqlDropRule:NrqlDropRule foo 12345:34567
// ```
type NrqlDropRule struct {
	pulumi.CustomResourceState

	// Account where the drop rule will be put. Defaults to the account associated with the API key used.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
	Action pulumi.StringOutput `pulumi:"action"`
	// The description of the drop rule.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A NRQL string that specifies what data types to drop.
	Nrql pulumi.StringOutput `pulumi:"nrql"`
	// The id, uniquely identifying the rule.
	RuleId pulumi.StringOutput `pulumi:"ruleId"`
}

// NewNrqlDropRule registers a new resource with the given unique name, arguments, and options.
func NewNrqlDropRule(ctx *pulumi.Context,
	name string, args *NrqlDropRuleArgs, opts ...pulumi.ResourceOption) (*NrqlDropRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Action == nil {
		return nil, errors.New("invalid value for required argument 'Action'")
	}
	if args.Nrql == nil {
		return nil, errors.New("invalid value for required argument 'Nrql'")
	}
	var resource NrqlDropRule
	err := ctx.RegisterResource("newrelic:index/nrqlDropRule:NrqlDropRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetNrqlDropRule gets an existing NrqlDropRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetNrqlDropRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *NrqlDropRuleState, opts ...pulumi.ResourceOption) (*NrqlDropRule, error) {
	var resource NrqlDropRule
	err := ctx.ReadResource("newrelic:index/nrqlDropRule:NrqlDropRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering NrqlDropRule resources.
type nrqlDropRuleState struct {
	// Account where the drop rule will be put. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
	Action *string `pulumi:"action"`
	// The description of the drop rule.
	Description *string `pulumi:"description"`
	// A NRQL string that specifies what data types to drop.
	Nrql *string `pulumi:"nrql"`
	// The id, uniquely identifying the rule.
	RuleId *string `pulumi:"ruleId"`
}

type NrqlDropRuleState struct {
	// Account where the drop rule will be put. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
	Action pulumi.StringPtrInput
	// The description of the drop rule.
	Description pulumi.StringPtrInput
	// A NRQL string that specifies what data types to drop.
	Nrql pulumi.StringPtrInput
	// The id, uniquely identifying the rule.
	RuleId pulumi.StringPtrInput
}

func (NrqlDropRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*nrqlDropRuleState)(nil)).Elem()
}

type nrqlDropRuleArgs struct {
	// Account where the drop rule will be put. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
	Action string `pulumi:"action"`
	// The description of the drop rule.
	Description *string `pulumi:"description"`
	// A NRQL string that specifies what data types to drop.
	Nrql string `pulumi:"nrql"`
}

// The set of arguments for constructing a NrqlDropRule resource.
type NrqlDropRuleArgs struct {
	// Account where the drop rule will be put. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
	Action pulumi.StringInput
	// The description of the drop rule.
	Description pulumi.StringPtrInput
	// A NRQL string that specifies what data types to drop.
	Nrql pulumi.StringInput
}

func (NrqlDropRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*nrqlDropRuleArgs)(nil)).Elem()
}

type NrqlDropRuleInput interface {
	pulumi.Input

	ToNrqlDropRuleOutput() NrqlDropRuleOutput
	ToNrqlDropRuleOutputWithContext(ctx context.Context) NrqlDropRuleOutput
}

func (*NrqlDropRule) ElementType() reflect.Type {
	return reflect.TypeOf((**NrqlDropRule)(nil)).Elem()
}

func (i *NrqlDropRule) ToNrqlDropRuleOutput() NrqlDropRuleOutput {
	return i.ToNrqlDropRuleOutputWithContext(context.Background())
}

func (i *NrqlDropRule) ToNrqlDropRuleOutputWithContext(ctx context.Context) NrqlDropRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlDropRuleOutput)
}

// NrqlDropRuleArrayInput is an input type that accepts NrqlDropRuleArray and NrqlDropRuleArrayOutput values.
// You can construct a concrete instance of `NrqlDropRuleArrayInput` via:
//
//          NrqlDropRuleArray{ NrqlDropRuleArgs{...} }
type NrqlDropRuleArrayInput interface {
	pulumi.Input

	ToNrqlDropRuleArrayOutput() NrqlDropRuleArrayOutput
	ToNrqlDropRuleArrayOutputWithContext(context.Context) NrqlDropRuleArrayOutput
}

type NrqlDropRuleArray []NrqlDropRuleInput

func (NrqlDropRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NrqlDropRule)(nil)).Elem()
}

func (i NrqlDropRuleArray) ToNrqlDropRuleArrayOutput() NrqlDropRuleArrayOutput {
	return i.ToNrqlDropRuleArrayOutputWithContext(context.Background())
}

func (i NrqlDropRuleArray) ToNrqlDropRuleArrayOutputWithContext(ctx context.Context) NrqlDropRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlDropRuleArrayOutput)
}

// NrqlDropRuleMapInput is an input type that accepts NrqlDropRuleMap and NrqlDropRuleMapOutput values.
// You can construct a concrete instance of `NrqlDropRuleMapInput` via:
//
//          NrqlDropRuleMap{ "key": NrqlDropRuleArgs{...} }
type NrqlDropRuleMapInput interface {
	pulumi.Input

	ToNrqlDropRuleMapOutput() NrqlDropRuleMapOutput
	ToNrqlDropRuleMapOutputWithContext(context.Context) NrqlDropRuleMapOutput
}

type NrqlDropRuleMap map[string]NrqlDropRuleInput

func (NrqlDropRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NrqlDropRule)(nil)).Elem()
}

func (i NrqlDropRuleMap) ToNrqlDropRuleMapOutput() NrqlDropRuleMapOutput {
	return i.ToNrqlDropRuleMapOutputWithContext(context.Background())
}

func (i NrqlDropRuleMap) ToNrqlDropRuleMapOutputWithContext(ctx context.Context) NrqlDropRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(NrqlDropRuleMapOutput)
}

type NrqlDropRuleOutput struct{ *pulumi.OutputState }

func (NrqlDropRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**NrqlDropRule)(nil)).Elem()
}

func (o NrqlDropRuleOutput) ToNrqlDropRuleOutput() NrqlDropRuleOutput {
	return o
}

func (o NrqlDropRuleOutput) ToNrqlDropRuleOutputWithContext(ctx context.Context) NrqlDropRuleOutput {
	return o
}

// Account where the drop rule will be put. Defaults to the account associated with the API key used.
func (o NrqlDropRuleOutput) AccountId() pulumi.IntOutput {
	return o.ApplyT(func(v *NrqlDropRule) pulumi.IntOutput { return v.AccountId }).(pulumi.IntOutput)
}

// An action type specifying how to apply the NRQL string (either `dropData`, `dropAttributes`, or `  dropAttributesFromMetricAggregates `).
func (o NrqlDropRuleOutput) Action() pulumi.StringOutput {
	return o.ApplyT(func(v *NrqlDropRule) pulumi.StringOutput { return v.Action }).(pulumi.StringOutput)
}

// The description of the drop rule.
func (o NrqlDropRuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *NrqlDropRule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A NRQL string that specifies what data types to drop.
func (o NrqlDropRuleOutput) Nrql() pulumi.StringOutput {
	return o.ApplyT(func(v *NrqlDropRule) pulumi.StringOutput { return v.Nrql }).(pulumi.StringOutput)
}

// The id, uniquely identifying the rule.
func (o NrqlDropRuleOutput) RuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *NrqlDropRule) pulumi.StringOutput { return v.RuleId }).(pulumi.StringOutput)
}

type NrqlDropRuleArrayOutput struct{ *pulumi.OutputState }

func (NrqlDropRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*NrqlDropRule)(nil)).Elem()
}

func (o NrqlDropRuleArrayOutput) ToNrqlDropRuleArrayOutput() NrqlDropRuleArrayOutput {
	return o
}

func (o NrqlDropRuleArrayOutput) ToNrqlDropRuleArrayOutputWithContext(ctx context.Context) NrqlDropRuleArrayOutput {
	return o
}

func (o NrqlDropRuleArrayOutput) Index(i pulumi.IntInput) NrqlDropRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *NrqlDropRule {
		return vs[0].([]*NrqlDropRule)[vs[1].(int)]
	}).(NrqlDropRuleOutput)
}

type NrqlDropRuleMapOutput struct{ *pulumi.OutputState }

func (NrqlDropRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*NrqlDropRule)(nil)).Elem()
}

func (o NrqlDropRuleMapOutput) ToNrqlDropRuleMapOutput() NrqlDropRuleMapOutput {
	return o
}

func (o NrqlDropRuleMapOutput) ToNrqlDropRuleMapOutputWithContext(ctx context.Context) NrqlDropRuleMapOutput {
	return o
}

func (o NrqlDropRuleMapOutput) MapIndex(k pulumi.StringInput) NrqlDropRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *NrqlDropRule {
		return vs[0].(map[string]*NrqlDropRule)[vs[1].(string)]
	}).(NrqlDropRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*NrqlDropRuleInput)(nil)).Elem(), &NrqlDropRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*NrqlDropRuleArrayInput)(nil)).Elem(), NrqlDropRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*NrqlDropRuleMapInput)(nil)).Elem(), NrqlDropRuleMap{})
	pulumi.RegisterOutputType(NrqlDropRuleOutput{})
	pulumi.RegisterOutputType(NrqlDropRuleArrayOutput{})
	pulumi.RegisterOutputType(NrqlDropRuleMapOutput{})
}
