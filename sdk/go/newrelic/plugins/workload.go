// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package plugins

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create, update, and delete a New Relic One workload.
//
// A New Relic User API key is required to provision this resource.  Set the `apiKey`
// attribute in the `provider` block or the `NEW_RELIC_API_KEY` environment
// variable with your User API key.
//
// ## Example Usage
//
// Include entities with a certain string on the name.
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/plugins"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := plugins.NewWorkload(ctx, "foo", &plugins.WorkloadArgs{
// 			AccountId: pulumi.Int(12345678),
// 			EntityGuids: pulumi.StringArray{
// 				pulumi.String("MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1"),
// 			},
// 			EntitySearchQueries: plugins.WorkloadEntitySearchQueryArray{
// 				&plugins.WorkloadEntitySearchQueryArgs{
// 					Query: pulumi.String(fmt.Sprintf("%v%v%v%v%v", "name like '", "%", "Example application", "%", "'")),
// 				},
// 			},
// 			ScopeAccountIds: pulumi.IntArray{
// 				pulumi.Int(12345678),
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
// Include entities with a set of tags.
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-newrelic/sdk/v4/go/newrelic/plugins"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := plugins.NewWorkload(ctx, "foo", &plugins.WorkloadArgs{
// 			AccountId: pulumi.Int(12345678),
// 			EntityGuids: pulumi.StringArray{
// 				pulumi.String("MjUyMDUyOHxBUE18QVBQTElDQVRJT058MjE1MDM3Nzk1"),
// 			},
// 			EntitySearchQueries: plugins.WorkloadEntitySearchQueryArray{
// 				&plugins.WorkloadEntitySearchQueryArgs{
// 					Query: pulumi.String("tags.accountId = '12345678' AND tags.environment='production' AND tags.language='java'"),
// 				},
// 			},
// 			ScopeAccountIds: pulumi.IntArray{
// 				pulumi.Int(12345678),
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
// New Relic One workloads can be imported using a concatenated string of the format
//
// `<account_id>:<workload_id>:<guid>`, e.g. bash
//
// ```sh
//  $ pulumi import newrelic:plugins/workload:Workload foo 12345678:1456:MjUyMDUyOHxBUE18QVBRTElDQVRJT058MjE1MDM3Nzk1
// ```
type Workload struct {
	pulumi.CustomResourceState

	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntOutput `pulumi:"accountId"`
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery pulumi.StringOutput `pulumi:"compositeEntitySearchQuery"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayOutput `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayOutput `pulumi:"entitySearchQueries"`
	// The unique entity identifier of the workload in New Relic.
	Guid pulumi.StringOutput `pulumi:"guid"`
	// The workload's name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The URL of the workload.
	Permalink pulumi.StringOutput `pulumi:"permalink"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayOutput `pulumi:"scopeAccountIds"`
	// The unique entity identifier of the workload.
	WorkloadId pulumi.IntOutput `pulumi:"workloadId"`
}

// NewWorkload registers a new resource with the given unique name, arguments, and options.
func NewWorkload(ctx *pulumi.Context,
	name string, args *WorkloadArgs, opts ...pulumi.ResourceOption) (*Workload, error) {
	if args == nil {
		args = &WorkloadArgs{}
	}

	var resource Workload
	err := ctx.RegisterResource("newrelic:plugins/workload:Workload", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkload gets an existing Workload resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkload(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkloadState, opts ...pulumi.ResourceOption) (*Workload, error) {
	var resource Workload
	err := ctx.ReadResource("newrelic:plugins/workload:Workload", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workload resources.
type workloadState struct {
	// The New Relic account ID where you want to create the workload.
	AccountId *int `pulumi:"accountId"`
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery *string `pulumi:"compositeEntitySearchQuery"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids []string `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries []WorkloadEntitySearchQuery `pulumi:"entitySearchQueries"`
	// The unique entity identifier of the workload in New Relic.
	Guid *string `pulumi:"guid"`
	// The workload's name.
	Name *string `pulumi:"name"`
	// The URL of the workload.
	Permalink *string `pulumi:"permalink"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds []int `pulumi:"scopeAccountIds"`
	// The unique entity identifier of the workload.
	WorkloadId *int `pulumi:"workloadId"`
}

type WorkloadState struct {
	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntPtrInput
	// The composite query used to compose a dynamic workload.
	CompositeEntitySearchQuery pulumi.StringPtrInput
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayInput
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayInput
	// The unique entity identifier of the workload in New Relic.
	Guid pulumi.StringPtrInput
	// The workload's name.
	Name pulumi.StringPtrInput
	// The URL of the workload.
	Permalink pulumi.StringPtrInput
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayInput
	// The unique entity identifier of the workload.
	WorkloadId pulumi.IntPtrInput
}

func (WorkloadState) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadState)(nil)).Elem()
}

type workloadArgs struct {
	// The New Relic account ID where you want to create the workload.
	AccountId *int `pulumi:"accountId"`
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids []string `pulumi:"entityGuids"`
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries []WorkloadEntitySearchQuery `pulumi:"entitySearchQueries"`
	// The workload's name.
	Name *string `pulumi:"name"`
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds []int `pulumi:"scopeAccountIds"`
}

// The set of arguments for constructing a Workload resource.
type WorkloadArgs struct {
	// The New Relic account ID where you want to create the workload.
	AccountId pulumi.IntPtrInput
	// A list of entity GUIDs manually assigned to this workload.
	EntityGuids pulumi.StringArrayInput
	// A list of search queries that define a dynamic workload.  See Nested entitySearchQuery blocks below for details.
	EntitySearchQueries WorkloadEntitySearchQueryArrayInput
	// The workload's name.
	Name pulumi.StringPtrInput
	// A list of account IDs that will be used to get entities from.
	ScopeAccountIds pulumi.IntArrayInput
}

func (WorkloadArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workloadArgs)(nil)).Elem()
}

type WorkloadInput interface {
	pulumi.Input

	ToWorkloadOutput() WorkloadOutput
	ToWorkloadOutputWithContext(ctx context.Context) WorkloadOutput
}

func (*Workload) ElementType() reflect.Type {
	return reflect.TypeOf((**Workload)(nil)).Elem()
}

func (i *Workload) ToWorkloadOutput() WorkloadOutput {
	return i.ToWorkloadOutputWithContext(context.Background())
}

func (i *Workload) ToWorkloadOutputWithContext(ctx context.Context) WorkloadOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadOutput)
}

// WorkloadArrayInput is an input type that accepts WorkloadArray and WorkloadArrayOutput values.
// You can construct a concrete instance of `WorkloadArrayInput` via:
//
//          WorkloadArray{ WorkloadArgs{...} }
type WorkloadArrayInput interface {
	pulumi.Input

	ToWorkloadArrayOutput() WorkloadArrayOutput
	ToWorkloadArrayOutputWithContext(context.Context) WorkloadArrayOutput
}

type WorkloadArray []WorkloadInput

func (WorkloadArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workload)(nil)).Elem()
}

func (i WorkloadArray) ToWorkloadArrayOutput() WorkloadArrayOutput {
	return i.ToWorkloadArrayOutputWithContext(context.Background())
}

func (i WorkloadArray) ToWorkloadArrayOutputWithContext(ctx context.Context) WorkloadArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadArrayOutput)
}

// WorkloadMapInput is an input type that accepts WorkloadMap and WorkloadMapOutput values.
// You can construct a concrete instance of `WorkloadMapInput` via:
//
//          WorkloadMap{ "key": WorkloadArgs{...} }
type WorkloadMapInput interface {
	pulumi.Input

	ToWorkloadMapOutput() WorkloadMapOutput
	ToWorkloadMapOutputWithContext(context.Context) WorkloadMapOutput
}

type WorkloadMap map[string]WorkloadInput

func (WorkloadMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workload)(nil)).Elem()
}

func (i WorkloadMap) ToWorkloadMapOutput() WorkloadMapOutput {
	return i.ToWorkloadMapOutputWithContext(context.Background())
}

func (i WorkloadMap) ToWorkloadMapOutputWithContext(ctx context.Context) WorkloadMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkloadMapOutput)
}

type WorkloadOutput struct{ *pulumi.OutputState }

func (WorkloadOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workload)(nil)).Elem()
}

func (o WorkloadOutput) ToWorkloadOutput() WorkloadOutput {
	return o
}

func (o WorkloadOutput) ToWorkloadOutputWithContext(ctx context.Context) WorkloadOutput {
	return o
}

type WorkloadArrayOutput struct{ *pulumi.OutputState }

func (WorkloadArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workload)(nil)).Elem()
}

func (o WorkloadArrayOutput) ToWorkloadArrayOutput() WorkloadArrayOutput {
	return o
}

func (o WorkloadArrayOutput) ToWorkloadArrayOutputWithContext(ctx context.Context) WorkloadArrayOutput {
	return o
}

func (o WorkloadArrayOutput) Index(i pulumi.IntInput) WorkloadOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workload {
		return vs[0].([]*Workload)[vs[1].(int)]
	}).(WorkloadOutput)
}

type WorkloadMapOutput struct{ *pulumi.OutputState }

func (WorkloadMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workload)(nil)).Elem()
}

func (o WorkloadMapOutput) ToWorkloadMapOutput() WorkloadMapOutput {
	return o
}

func (o WorkloadMapOutput) ToWorkloadMapOutputWithContext(ctx context.Context) WorkloadMapOutput {
	return o
}

func (o WorkloadMapOutput) MapIndex(k pulumi.StringInput) WorkloadOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workload {
		return vs[0].(map[string]*Workload)[vs[1].(string)]
	}).(WorkloadOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadInput)(nil)).Elem(), &Workload{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadArrayInput)(nil)).Elem(), WorkloadArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkloadMapInput)(nil)).Elem(), WorkloadMap{})
	pulumi.RegisterOutputType(WorkloadOutput{})
	pulumi.RegisterOutputType(WorkloadArrayOutput{})
	pulumi.RegisterOutputType(WorkloadMapOutput{})
}
