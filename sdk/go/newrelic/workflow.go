// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Use this resource to create and manage New Relic workflow.
//
// ## Full Scenario Example
//
// Create a destination resource and reference that destination to the channel resource. Then create a workflow and reference the channel resource to it.
//
// ### Create a policy
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
//			_, err := newrelic.NewAlertPolicy(ctx, "collector-policy", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ### Create a destination
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
//			_, err := newrelic.NewNotificationDestination(ctx, "webhook-destination", &newrelic.NotificationDestinationArgs{
//				AccountId: pulumi.Int(12345678),
//				AuthBasic: &NotificationDestinationAuthBasicArgs{
//					Password: pulumi.String("password"),
//					User:     pulumi.String("username"),
//				},
//				Properties: NotificationDestinationPropertyArray{
//					&NotificationDestinationPropertyArgs{
//						Key:   pulumi.String("url"),
//						Value: pulumi.String("https://webhook.mywebhook.com"),
//					},
//				},
//				Type: pulumi.String("WEBHOOK"),
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
// ### Create a channel
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
//			_, err := newrelic.NewNotificationChannel(ctx, "webhook-channel", &newrelic.NotificationChannelArgs{
//				AccountId:     pulumi.Int(12345678),
//				Type:          pulumi.String("WEBHOOK"),
//				DestinationId: pulumi.Any(newrelic_notification_destination.Webhook - destination.Id),
//				Product:       pulumi.String("IINT"),
//				Properties: NotificationChannelPropertyArray{
//					&NotificationChannelPropertyArgs{
//						Key:   pulumi.String("payload"),
//						Value: pulumi.String("{name: {{ variable }} }"),
//						Label: pulumi.String("Payload Template"),
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
//
// ### Create a workflow
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-newrelic/sdk/v5/go/newrelic"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := newrelic.NewWorkflow(ctx, "workflow-example", &newrelic.WorkflowArgs{
//				AccountId:           pulumi.Int(12345678),
//				MutingRulesHandling: pulumi.String("NOTIFY_ALL_ISSUES"),
//				Enrichments: &WorkflowEnrichmentsArgs{
//					Nrqls: WorkflowEnrichmentsNrqlArray{
//						&WorkflowEnrichmentsNrqlArgs{
//							Name: pulumi.String("Log count"),
//							Configurations: WorkflowEnrichmentsNrqlConfigurationArray{
//								&WorkflowEnrichmentsNrqlConfigurationArgs{
//									Query: pulumi.String(fmt.Sprintf("SELECT count(*) FROM Log WHERE message like '%verror%v' since 10 minutes ago", "%", "%")),
//								},
//							},
//						},
//					},
//				},
//				IssuesFilter: &WorkflowIssuesFilterArgs{
//					Name: pulumi.String("Filter-name"),
//					Type: pulumi.String("FILTER"),
//					Predicates: WorkflowIssuesFilterPredicateArray{
//						&WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("accumulations.policyName"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								pulumi.String("my_policy"),
//							},
//						},
//						&WorkflowIssuesFilterPredicateArgs{
//							Attribute: pulumi.String("accumulations.sources"),
//							Operator:  pulumi.String("EXACTLY_MATCHES"),
//							Values: pulumi.StringArray{
//								pulumi.String("newrelic"),
//							},
//						},
//					},
//				},
//				Destinations: WorkflowDestinationArray{
//					&WorkflowDestinationArgs{
//						ChannelId: pulumi.Any(newrelic_notification_channel.Webhook - channel.Id),
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
//
// ## Additional Information
//
// More details about the workflows can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/applied-intelligence/incident-workflows/incident-workflows/).
//
// ## v3.3 changes
//
// In version v3.3 we renamed the following arguments:
//
// - `workflowEnabled` changed to `enabled`.
// - `destinationConfiguration` changed to `destination`.
// - `predicates` changed to `predicate`.
// - Enrichment's `configurations` changed to `configuration`.
type Workflow struct {
	pulumi.CustomResourceState

	// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrOutput `pulumi:"accountId"`
	// A nested block that contains a channel id.
	Destinations WorkflowDestinationArrayOutput `pulumi:"destinations"`
	// Whether destinations are enabled..
	DestinationsEnabled pulumi.BoolPtrOutput `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled.
	Enabled pulumi.BoolPtrOutput `pulumi:"enabled"`
	// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrOutput `pulumi:"enrichments"`
	// Whether enrichments are enabled..
	EnrichmentsEnabled pulumi.BoolPtrOutput `pulumi:"enrichmentsEnabled"`
	// The issues filter.  See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterOutput `pulumi:"issuesFilter"`
	// The last time notification was sent for this workflow.
	LastRun pulumi.StringOutput `pulumi:"lastRun"`
	// Which muting rule handling this workflow has.
	MutingRulesHandling pulumi.StringOutput `pulumi:"mutingRulesHandling"`
	// A nrql enrichment name.
	Name pulumi.StringOutput `pulumi:"name"`
	// The id of the workflow.
	WorkflowId pulumi.StringOutput `pulumi:"workflowId"`
}

// NewWorkflow registers a new resource with the given unique name, arguments, and options.
func NewWorkflow(ctx *pulumi.Context,
	name string, args *WorkflowArgs, opts ...pulumi.ResourceOption) (*Workflow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Destinations == nil {
		return nil, errors.New("invalid value for required argument 'Destinations'")
	}
	if args.IssuesFilter == nil {
		return nil, errors.New("invalid value for required argument 'IssuesFilter'")
	}
	if args.MutingRulesHandling == nil {
		return nil, errors.New("invalid value for required argument 'MutingRulesHandling'")
	}
	var resource Workflow
	err := ctx.RegisterResource("newrelic:index/workflow:Workflow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWorkflow gets an existing Workflow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWorkflow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WorkflowState, opts ...pulumi.ResourceOption) (*Workflow, error) {
	var resource Workflow
	err := ctx.ReadResource("newrelic:index/workflow:Workflow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Workflow resources.
type workflowState struct {
	// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// A nested block that contains a channel id.
	Destinations []WorkflowDestination `pulumi:"destinations"`
	// Whether destinations are enabled..
	DestinationsEnabled *bool `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled.
	Enabled *bool `pulumi:"enabled"`
	// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments *WorkflowEnrichments `pulumi:"enrichments"`
	// Whether enrichments are enabled..
	EnrichmentsEnabled *bool `pulumi:"enrichmentsEnabled"`
	// The issues filter.  See Nested issuesFilter blocks below for details.
	IssuesFilter *WorkflowIssuesFilter `pulumi:"issuesFilter"`
	// The last time notification was sent for this workflow.
	LastRun *string `pulumi:"lastRun"`
	// Which muting rule handling this workflow has.
	MutingRulesHandling *string `pulumi:"mutingRulesHandling"`
	// A nrql enrichment name.
	Name *string `pulumi:"name"`
	// The id of the workflow.
	WorkflowId *string `pulumi:"workflowId"`
}

type WorkflowState struct {
	// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// A nested block that contains a channel id.
	Destinations WorkflowDestinationArrayInput
	// Whether destinations are enabled..
	DestinationsEnabled pulumi.BoolPtrInput
	// Whether workflow is enabled.
	Enabled pulumi.BoolPtrInput
	// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrInput
	// Whether enrichments are enabled..
	EnrichmentsEnabled pulumi.BoolPtrInput
	// The issues filter.  See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterPtrInput
	// The last time notification was sent for this workflow.
	LastRun pulumi.StringPtrInput
	// Which muting rule handling this workflow has.
	MutingRulesHandling pulumi.StringPtrInput
	// A nrql enrichment name.
	Name pulumi.StringPtrInput
	// The id of the workflow.
	WorkflowId pulumi.StringPtrInput
}

func (WorkflowState) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowState)(nil)).Elem()
}

type workflowArgs struct {
	// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
	AccountId *int `pulumi:"accountId"`
	// A nested block that contains a channel id.
	Destinations []WorkflowDestination `pulumi:"destinations"`
	// Whether destinations are enabled..
	DestinationsEnabled *bool `pulumi:"destinationsEnabled"`
	// Whether workflow is enabled.
	Enabled *bool `pulumi:"enabled"`
	// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments *WorkflowEnrichments `pulumi:"enrichments"`
	// Whether enrichments are enabled..
	EnrichmentsEnabled *bool `pulumi:"enrichmentsEnabled"`
	// The issues filter.  See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilter `pulumi:"issuesFilter"`
	// Which muting rule handling this workflow has.
	MutingRulesHandling string `pulumi:"mutingRulesHandling"`
	// A nrql enrichment name.
	Name *string `pulumi:"name"`
}

// The set of arguments for constructing a Workflow resource.
type WorkflowArgs struct {
	// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
	AccountId pulumi.IntPtrInput
	// A nested block that contains a channel id.
	Destinations WorkflowDestinationArrayInput
	// Whether destinations are enabled..
	DestinationsEnabled pulumi.BoolPtrInput
	// Whether workflow is enabled.
	Enabled pulumi.BoolPtrInput
	// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
	Enrichments WorkflowEnrichmentsPtrInput
	// Whether enrichments are enabled..
	EnrichmentsEnabled pulumi.BoolPtrInput
	// The issues filter.  See Nested issuesFilter blocks below for details.
	IssuesFilter WorkflowIssuesFilterInput
	// Which muting rule handling this workflow has.
	MutingRulesHandling pulumi.StringInput
	// A nrql enrichment name.
	Name pulumi.StringPtrInput
}

func (WorkflowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*workflowArgs)(nil)).Elem()
}

type WorkflowInput interface {
	pulumi.Input

	ToWorkflowOutput() WorkflowOutput
	ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput
}

func (*Workflow) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (i *Workflow) ToWorkflowOutput() WorkflowOutput {
	return i.ToWorkflowOutputWithContext(context.Background())
}

func (i *Workflow) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowOutput)
}

// WorkflowArrayInput is an input type that accepts WorkflowArray and WorkflowArrayOutput values.
// You can construct a concrete instance of `WorkflowArrayInput` via:
//
//	WorkflowArray{ WorkflowArgs{...} }
type WorkflowArrayInput interface {
	pulumi.Input

	ToWorkflowArrayOutput() WorkflowArrayOutput
	ToWorkflowArrayOutputWithContext(context.Context) WorkflowArrayOutput
}

type WorkflowArray []WorkflowInput

func (WorkflowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
}

func (i WorkflowArray) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return i.ToWorkflowArrayOutputWithContext(context.Background())
}

func (i WorkflowArray) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowArrayOutput)
}

// WorkflowMapInput is an input type that accepts WorkflowMap and WorkflowMapOutput values.
// You can construct a concrete instance of `WorkflowMapInput` via:
//
//	WorkflowMap{ "key": WorkflowArgs{...} }
type WorkflowMapInput interface {
	pulumi.Input

	ToWorkflowMapOutput() WorkflowMapOutput
	ToWorkflowMapOutputWithContext(context.Context) WorkflowMapOutput
}

type WorkflowMap map[string]WorkflowInput

func (WorkflowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (i WorkflowMap) ToWorkflowMapOutput() WorkflowMapOutput {
	return i.ToWorkflowMapOutputWithContext(context.Background())
}

func (i WorkflowMap) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WorkflowMapOutput)
}

type WorkflowOutput struct{ *pulumi.OutputState }

func (WorkflowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Workflow)(nil)).Elem()
}

func (o WorkflowOutput) ToWorkflowOutput() WorkflowOutput {
	return o
}

func (o WorkflowOutput) ToWorkflowOutputWithContext(ctx context.Context) WorkflowOutput {
	return o
}

// Determines the New Relic account where the workflow will be created. Defaults to the account associated with the API key used.
func (o WorkflowOutput) AccountId() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.IntPtrOutput { return v.AccountId }).(pulumi.IntPtrOutput)
}

// A nested block that contains a channel id.
func (o WorkflowOutput) Destinations() WorkflowDestinationArrayOutput {
	return o.ApplyT(func(v *Workflow) WorkflowDestinationArrayOutput { return v.Destinations }).(WorkflowDestinationArrayOutput)
}

// Whether destinations are enabled..
func (o WorkflowOutput) DestinationsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.DestinationsEnabled }).(pulumi.BoolPtrOutput)
}

// Whether workflow is enabled.
func (o WorkflowOutput) Enabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.Enabled }).(pulumi.BoolPtrOutput)
}

// A nested block that describes a workflow's enrichments. See Nested enrichments blocks below for details.
func (o WorkflowOutput) Enrichments() WorkflowEnrichmentsPtrOutput {
	return o.ApplyT(func(v *Workflow) WorkflowEnrichmentsPtrOutput { return v.Enrichments }).(WorkflowEnrichmentsPtrOutput)
}

// Whether enrichments are enabled..
func (o WorkflowOutput) EnrichmentsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Workflow) pulumi.BoolPtrOutput { return v.EnrichmentsEnabled }).(pulumi.BoolPtrOutput)
}

// The issues filter.  See Nested issuesFilter blocks below for details.
func (o WorkflowOutput) IssuesFilter() WorkflowIssuesFilterOutput {
	return o.ApplyT(func(v *Workflow) WorkflowIssuesFilterOutput { return v.IssuesFilter }).(WorkflowIssuesFilterOutput)
}

// The last time notification was sent for this workflow.
func (o WorkflowOutput) LastRun() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.LastRun }).(pulumi.StringOutput)
}

// Which muting rule handling this workflow has.
func (o WorkflowOutput) MutingRulesHandling() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.MutingRulesHandling }).(pulumi.StringOutput)
}

// A nrql enrichment name.
func (o WorkflowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The id of the workflow.
func (o WorkflowOutput) WorkflowId() pulumi.StringOutput {
	return o.ApplyT(func(v *Workflow) pulumi.StringOutput { return v.WorkflowId }).(pulumi.StringOutput)
}

type WorkflowArrayOutput struct{ *pulumi.OutputState }

func (WorkflowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Workflow)(nil)).Elem()
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutput() WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) ToWorkflowArrayOutputWithContext(ctx context.Context) WorkflowArrayOutput {
	return o
}

func (o WorkflowArrayOutput) Index(i pulumi.IntInput) WorkflowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].([]*Workflow)[vs[1].(int)]
	}).(WorkflowOutput)
}

type WorkflowMapOutput struct{ *pulumi.OutputState }

func (WorkflowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Workflow)(nil)).Elem()
}

func (o WorkflowMapOutput) ToWorkflowMapOutput() WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) ToWorkflowMapOutputWithContext(ctx context.Context) WorkflowMapOutput {
	return o
}

func (o WorkflowMapOutput) MapIndex(k pulumi.StringInput) WorkflowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Workflow {
		return vs[0].(map[string]*Workflow)[vs[1].(string)]
	}).(WorkflowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowInput)(nil)).Elem(), &Workflow{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowArrayInput)(nil)).Elem(), WorkflowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WorkflowMapInput)(nil)).Elem(), WorkflowMap{})
	pulumi.RegisterOutputType(WorkflowOutput{})
	pulumi.RegisterOutputType(WorkflowArrayOutput{})
	pulumi.RegisterOutputType(WorkflowMapOutput{})
}
