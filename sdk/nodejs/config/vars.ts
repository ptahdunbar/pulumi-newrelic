// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

let __config = new pulumi.Config("newrelic");

export let accountId: number | undefined = __config.getObject<number>("accountId") || <any>utilities.getEnvNumber("NEW_RELIC_ACCOUNT_ID");
export let adminApiKey: string | undefined = __config.get("adminApiKey") || utilities.getEnv("NEW_RELIC_ADMIN_API_KEY");
export let apiKey: string | undefined = __config.get("apiKey") || utilities.getEnv("NEW_RELIC_API_KEY");
export let apiUrl: string | undefined = __config.get("apiUrl");
export let cacertFile: string | undefined = __config.get("cacertFile") || utilities.getEnv("NEW_RELIC_API_CACERT");
export let infrastructureApiUrl: string | undefined = __config.get("infrastructureApiUrl");
export let insecureSkipVerify: boolean | undefined = __config.getObject<boolean>("insecureSkipVerify") || <any>utilities.getEnvBoolean("NEW_RELIC_API_SKIP_VERIFY");
export let insightsInsertKey: string | undefined = __config.get("insightsInsertKey") || utilities.getEnv("NEW_RELIC_INSIGHTS_INSERT_KEY");
export let insightsInsertUrl: string | undefined = __config.get("insightsInsertUrl") || (utilities.getEnv("NEW_RELIC_INSIGHTS_INSERT_URL") || "https://insights-collector.newrelic.com/v1/accounts");
export let insightsQueryKey: string | undefined = __config.get("insightsQueryKey") || utilities.getEnv("NEW_RELIC_INSIGHTS_QUERY_KEY");
export let insightsQueryUrl: string | undefined = __config.get("insightsQueryUrl") || (utilities.getEnv("NEW_RELIC_INSIGHTS_QUERY_URL") || "https://insights-api.newrelic.com/v1/accounts");
export let nerdgraphApiUrl: string | undefined = __config.get("nerdgraphApiUrl");
/**
 * The data center for which your New Relic account is configured. Only one region per provider block is permitted.
 */
export let region: string | undefined = __config.get("region") || (utilities.getEnv("NEW_RELIC_REGION") || "US");
export let syntheticsApiUrl: string | undefined = __config.get("syntheticsApiUrl");
