// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package newrelic

import (
	"github.com/pulumi/pulumi/sdk/v2/go/pulumi"
)

func GetApplication(ctx *pulumi.Context, args *GetApplicationArgs, opts ...pulumi.InvokeOption) (*GetApplicationResult, error) {
	var rv GetApplicationResult
	err := ctx.Invoke("newrelic:index/getApplication:getApplication", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getApplication.
type GetApplicationArgs struct {
	// The name of the application in New Relic.
	Name string `pulumi:"name"`
}

// A collection of values returned by getApplication.
type GetApplicationResult struct {
	// A list of host IDs associated with the application.
	HostIds []int `pulumi:"hostIds"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// A list of instance IDs associated with the application.
	InstanceIds []int  `pulumi:"instanceIds"`
	Name        string `pulumi:"name"`
}
