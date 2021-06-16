module github.com/pulumi/pulumi-newrelic/provider/v4

go 1.16

require (
	github.com/hashicorp/terraform-plugin-sdk v1.17.2
	github.com/newrelic/terraform-provider-newrelic/v2 v2.2.1
	github.com/pulumi/pulumi-terraform-bridge/v3 v3.0.0
	github.com/pulumi/pulumi/pkg/v3 v3.0.0
	github.com/pulumi/pulumi/sdk/v3 v3.0.0
)

replace (
	github.com/hashicorp/terraform-plugin-sdk/v2 => github.com/pulumi/terraform-plugin-sdk/v2 v2.0.0-20210402103405-f5979773e8ba
	github.com/hashicorp/go-getter v1.5.0 => github.com/hashicorp/go-getter v1.4.0
	github.com/newrelic/terraform-provider-newrelic/v2 => github.com/pulumi/terraform-provider-newrelic/v2 v2.19.1-0.20210615104508-f69d8e9638a3
	golang.org/x/sys => golang.org/x/sys v0.0.0-20200124204421-9fbb57f87de9
)
