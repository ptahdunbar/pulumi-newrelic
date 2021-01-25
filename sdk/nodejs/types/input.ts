// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";

export interface AlertChannelConfig {
    /**
     * The API key for integrating with OpsGenie.
     */
    apiKey?: pulumi.Input<string>;
    /**
     * Specifies an authentication password for use with a channel.  Supported by the `webhook` channel type.
     */
    authPassword?: pulumi.Input<string>;
    /**
     * Specifies an authentication method for use with a channel.  Supported by the `webhook` channel type.  Only HTTP basic authentication is currently supported via the value `BASIC`.
     */
    authType?: pulumi.Input<string>;
    /**
     * Specifies an authentication username for use with a channel.  Supported by the `webhook` channel type.
     */
    authUsername?: pulumi.Input<string>;
    /**
     * The base URL of the webhook destination.
     */
    baseUrl?: pulumi.Input<string>;
    /**
     * The Slack channel to send notifications to.
     * * `opsgenie`
     */
    channel?: pulumi.Input<string>;
    /**
     * A map of key/value pairs that represents extra HTTP headers to be sent along with the webhook payload.
     */
    headers?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Use instead of `headers` if the desired payload is more complex than a list of key/value pairs (e.g. a set of headers that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `headers`.
     */
    headersString?: pulumi.Input<string>;
    /**
     * `0` or `1`. Flag for whether or not to attach a JSON document containing information about the associated alert to the email that is sent to recipients.
     * * `webhook`
     */
    includeJsonAttachment?: pulumi.Input<string>;
    /**
     * The key for integrating with VictorOps.
     */
    key?: pulumi.Input<string>;
    /**
     * A map of key/value pairs that represents the webhook payload.  Must provide `payloadType` if setting this argument.
     */
    payload?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Use instead of `payload` if the desired payload is more complex than a list of key/value pairs (e.g. a payload that makes use of nested objects).  The value provided should be a valid JSON string with escaped double quotes. Conflicts with `payload`.
     */
    payloadString?: pulumi.Input<string>;
    /**
     * Can either be `application/json` or `application/x-www-form-urlencoded`. The `payloadType` argument is _required_ if `payload` is set.
     * * `pagerduty`
     */
    payloadType?: pulumi.Input<string>;
    /**
     * A set of recipients for targeting notifications.  Multiple values are comma separated.
     */
    recipients?: pulumi.Input<string>;
    /**
     * The data center region to store your data.  Valid values are `US` and `EU`.  Default is `US`.
     */
    region?: pulumi.Input<string>;
    /**
     * The route key for integrating with VictorOps.
     * * `slack`
     */
    routeKey?: pulumi.Input<string>;
    /**
     * Specifies the service key for integrating with Pagerduty.
     * * `victorops`
     */
    serviceKey?: pulumi.Input<string>;
    /**
     * A set of tags for targeting notifications. Multiple values are comma separated.
     */
    tags?: pulumi.Input<string>;
    /**
     * A set of teams for targeting notifications. Multiple values are comma separated.
     */
    teams?: pulumi.Input<string>;
    /**
     * [Slack Webhook URL](https://slack.com/intl/en-es/help/articles/115005265063-Incoming-webhooks-for-Slack).
     */
    url?: pulumi.Input<string>;
    userId?: pulumi.Input<string>;
}

export interface AlertConditionTerm {
    duration: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    priority?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    timeFunction: pulumi.Input<string>;
}

export interface AlertMutingRuleCondition {
    /**
     * The individual MutingRuleConditions within the group. See Nested conditions blocks below for details.
     */
    conditions: pulumi.Input<pulumi.Input<inputs.AlertMutingRuleConditionCondition>[]>;
    /**
     * The operator used to combine all the MutingRuleConditions within the group.
     */
    operator: pulumi.Input<string>;
}

export interface AlertMutingRuleConditionCondition {
    /**
     * The attribute on a violation.
     */
    attribute: pulumi.Input<string>;
    /**
     * The operator used to compare the attribute's value with the supplied value(s)
     */
    operator: pulumi.Input<string>;
    /**
     * The value(s) to compare against the attribute's value.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DashboardFilter {
    /**
     * (Optional) A list of attributes belonging to the specified event types to enable filtering for.
     */
    attributes?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * (Optional) A list of event types to enable filtering for.
     */
    eventTypes: pulumi.Input<pulumi.Input<string>[]>;
}

export interface DashboardWidget {
    /**
     * (Optional) The account ID to use when querying data. If `accountId` is omitted, the widget will use the account ID associated with the API key used in your provider configuration. You can also use `accountId` to configure cross-account widgets or simply to be explicit about which account the widget will be pulling data from.
     */
    accountId?: pulumi.Input<number>;
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    compareWiths?: pulumi.Input<pulumi.Input<inputs.DashboardWidgetCompareWith>[]>;
    /**
     * (Optional) The ID of a dashboard to link to from the widget's facets.
     * * `attributeSheet`, `comparisonLineChart`, `eventFeed`, `eventTable`, `funnel`, `histogram`, `lineChart`, `rawJson`, `singleEvent`, or `uniquesList`:
     */
    drilldownDashboardId?: pulumi.Input<number>;
    /**
     * (Required) The duration, in ms, of the time window represented in the chart.
     */
    duration?: pulumi.Input<number>;
    /**
     * (Optional) The end time of the time window represented in the chart in epoch time.  When not set, the time window will end at the current time.
     */
    endTime?: pulumi.Input<number>;
    /**
     * (Required) A collection of entity IDs to display data. These are typically application IDs.
     */
    entityIds?: pulumi.Input<pulumi.Input<number>[]>;
    /**
     * (Optional) Can be set to "host" to facet the metric data by host.
     */
    facet?: pulumi.Input<string>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `3` inclusive.  Defaults to `1`.
     */
    height?: pulumi.Input<number>;
    /**
     * (Optional) The limit of distinct data series to display.  Requires `orderBy` to be set.
     */
    limit?: pulumi.Input<number>;
    /**
     * (Required) A nested block that describes a metric.  Nested `metric` blocks support the following arguments:
     */
    metrics?: pulumi.Input<pulumi.Input<inputs.DashboardWidgetMetric>[]>;
    /**
     * (Optional) Description of the widget.
     */
    notes?: pulumi.Input<string>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     * * `markdown`:
     */
    nrql?: pulumi.Input<string>;
    /**
     * (Optional) Set the order of the results.  Required when using `limit`.
     * * `applicationBreakdown`:
     */
    orderBy?: pulumi.Input<string>;
    rawMetricName?: pulumi.Input<string>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) The markdown source to be rendered in the widget.
     * * `metricLineChart`:
     */
    source?: pulumi.Input<string>;
    /**
     * (Required) Threshold above which the displayed value will be styled with a red color.
     */
    thresholdRed?: pulumi.Input<number>;
    /**
     * (Optional) Threshold above which the displayed value will be styled with a yellow color.
     * * `facetBarChart`, `facetPieChart`, `facetTable`, `facetedAreaChart`, `facetedLineChart`, or `heatmap`:
     */
    thresholdYellow?: pulumi.Input<number>;
    /**
     * The title of the dashboard.
     */
    title: pulumi.Input<string>;
    /**
     * (Required) How the widget visualizes data.  Valid values are `billboard`, `gauge`, `billboardComparison`, `facetBarChart`, `facetedLineChart`, `facetPieChart`, `facetTable`, `facetedAreaChart`, `heatmap`, `attributeSheet`, `singleEvent`, `histogram`, `funnel`, `rawJson`, `eventFeed`, `eventTable`, `uniquesList`, `lineChart`, `comparisonLineChart`, `markdown`, and `metricLineChart`.
     */
    visualization: pulumi.Input<string>;
    widgetId?: pulumi.Input<number>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `3` inclusive.  Defaults to `1`.
     */
    width?: pulumi.Input<number>;
}

export interface DashboardWidgetCompareWith {
    offsetDuration: pulumi.Input<string>;
    presentation: pulumi.Input<inputs.DashboardWidgetCompareWithPresentation>;
}

export interface DashboardWidgetCompareWithPresentation {
    color: pulumi.Input<string>;
    /**
     * (Required) The metric name to display.
     */
    name: pulumi.Input<string>;
}

export interface DashboardWidgetMetric {
    /**
     * (Required) The metric name to display.
     */
    name: pulumi.Input<string>;
    scope?: pulumi.Input<string>;
    units?: pulumi.Input<string>;
    /**
     * (Required) The metric values to display.
     */
    values?: pulumi.Input<pulumi.Input<string>[]>;
}

export interface EntityTagsTag {
    /**
     * The tag key.
     */
    key: pulumi.Input<string>;
    /**
     * The tag values.
     */
    values: pulumi.Input<pulumi.Input<string>[]>;
}

export interface GetEntityTag {
    key: string;
    value: string;
}

export interface InfraAlertConditionCritical {
    duration: pulumi.Input<number>;
    timeFunction?: pulumi.Input<string>;
    value?: pulumi.Input<number>;
}

export interface InfraAlertConditionWarning {
    duration: pulumi.Input<number>;
    timeFunction?: pulumi.Input<string>;
    value?: pulumi.Input<number>;
}

export interface NrqlAlertConditionCritical {
    /**
     * @deprecated use `threshold_duration` attribute instead
     */
    duration?: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    thresholdDuration?: pulumi.Input<number>;
    thresholdOccurrences?: pulumi.Input<string>;
    /**
     * @deprecated use `threshold_occurrences` attribute instead
     */
    timeFunction?: pulumi.Input<string>;
}

export interface NrqlAlertConditionNrql {
    evaluationOffset?: pulumi.Input<number>;
    query: pulumi.Input<string>;
    /**
     * @deprecated use `evaluation_offset` attribute instead
     */
    sinceValue?: pulumi.Input<string>;
}

export interface NrqlAlertConditionTerm {
    /**
     * @deprecated use `threshold_duration` attribute instead
     */
    duration?: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    priority?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    thresholdDuration?: pulumi.Input<number>;
    thresholdOccurrences?: pulumi.Input<string>;
    /**
     * @deprecated use `threshold_occurrences` attribute instead
     */
    timeFunction?: pulumi.Input<string>;
}

export interface NrqlAlertConditionWarning {
    /**
     * @deprecated use `threshold_duration` attribute instead
     */
    duration?: pulumi.Input<number>;
    operator?: pulumi.Input<string>;
    threshold: pulumi.Input<number>;
    thresholdDuration?: pulumi.Input<number>;
    thresholdOccurrences?: pulumi.Input<string>;
    /**
     * @deprecated use `threshold_occurrences` attribute instead
     */
    timeFunction?: pulumi.Input<string>;
}

export interface OneDashboardPage {
    /**
     * Brief text describing the dashboard.
     */
    description?: pulumi.Input<string>;
    /**
     * The unique entity identifier of the dashboard page in New Relic.
     */
    guid?: pulumi.Input<string>;
    /**
     * The title of the dashboard.
     */
    name: pulumi.Input<string>;
    /**
     * (Optional) A nested block that describes an Area widget.  See Nested widget blocks below for details.
     */
    widgetAreas?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetArea>[]>;
    /**
     * (Optional) A nested block that describes a Bar widget.  See Nested widget blocks below for details.
     */
    widgetBars?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetBar>[]>;
    /**
     * (Optional) A nested block that describes a Billboard widget.  See Nested widget blocks below for details.
     */
    widgetBillboards?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetBillboard>[]>;
    /**
     * (Optional) A nested block that describes a Line widget.  See Nested widget blocks below for details.
     */
    widgetLines?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetLine>[]>;
    /**
     * (Optional) A nested block that describes a Markdown widget.  See Nested widget blocks below for details.
     */
    widgetMarkdowns?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetMarkdown>[]>;
    /**
     * (Optional) A nested block that describes a Pie widget.  See Nested widget blocks below for details.
     */
    widgetPies?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetPy>[]>;
    /**
     * (Optional) A nested block that describes a Table widget.  See Nested widget blocks below for details.
     */
    widgetTables?: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetTable>[]>;
}

export interface OneDashboardPageWidgetArea {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetAreaNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetAreaNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}

export interface OneDashboardPageWidgetBar {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetBarNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetBarNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}

export interface OneDashboardPageWidgetBillboard {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Threshold above which the displayed value will be styled with a red color.
     */
    critical?: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetBillboardNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Threshold above which the displayed value will be styled with a yellow color.
     * * `widgetMarkdown`:
     */
    warning?: pulumi.Input<number>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetBillboardNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}

export interface OneDashboardPageWidgetLine {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetLineNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetLineNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}

export interface OneDashboardPageWidgetMarkdown {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) The markdown source to be rendered in the widget.
     */
    text?: pulumi.Input<string>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetPy {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetPyNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetPyNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}

export interface OneDashboardPageWidgetTable {
    /**
     * (Required) Column position of widget from top left, starting at `1`.
     */
    column: pulumi.Input<number>;
    /**
     * (Optional) Height of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `3`.
     */
    height?: pulumi.Input<number>;
    id?: pulumi.Input<string>;
    /**
     * (Required) A nested block that describes a NRQL Query. See Nested nrql\_query blocks below for details.
     */
    nrqlQueries: pulumi.Input<pulumi.Input<inputs.OneDashboardPageWidgetTableNrqlQuery>[]>;
    /**
     * (Required) Row position of widget from top left, starting at `1`.
     */
    row: pulumi.Input<number>;
    /**
     * (Required) A title for the widget.
     */
    title: pulumi.Input<string>;
    /**
     * (Optional) Width of the widget.  Valid values are `1` to `12` inclusive.  Defaults to `4`.
     */
    width?: pulumi.Input<number>;
}

export interface OneDashboardPageWidgetTableNrqlQuery {
    /**
     * Determines the New Relic account where the dashboard will be created. Defaults to the account associated with the API key used.
     */
    accountId: pulumi.Input<number>;
    /**
     * (Required) Valid NRQL query string. See [Writing NRQL Queries](https://docs.newrelic.com/docs/insights/nrql-new-relic-query-language/using-nrql/introduction-nrql) for help.
     */
    query: pulumi.Input<string>;
}
export namespace insights {
    export interface EventEvent {
        attributes: pulumi.Input<pulumi.Input<inputs.insights.EventEventAttribute>[]>;
        timestamp?: pulumi.Input<number>;
        type: pulumi.Input<string>;
    }

    export interface EventEventAttribute {
        key: pulumi.Input<string>;
        type?: pulumi.Input<string>;
        value: pulumi.Input<string>;
    }
}

export namespace plugins {
    export interface AlertConditionTerm {
        duration: pulumi.Input<number>;
        operator?: pulumi.Input<string>;
        priority?: pulumi.Input<string>;
        threshold: pulumi.Input<number>;
        timeFunction: pulumi.Input<string>;
    }

    export interface WorkloadEntitySearchQuery {
        /**
         * The query.
         */
        query: pulumi.Input<string>;
    }
}

export namespace synthetics {
    export interface MultiLocationAlertConditionCritical {
        threshold: pulumi.Input<number>;
    }

    export interface MultiLocationAlertConditionWarning {
        threshold: pulumi.Input<number>;
    }
}
