// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.NotificationChannelArgs;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.inputs.NotificationChannelState;
import com.pulumi.newrelic.outputs.NotificationChannelProperty;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Use this resource to create and manage New Relic notification channels. Details regarding supported products and permissions can be found [here](https://docs.newrelic.com/docs/alerts-applied-intelligence/notifications/destinations).
 * 
 * ## Example Usage
 * 
 * ##### [Webhook](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#webhook)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;payload&#34;)
 *                 .label(&#34;Payload Template&#34;)
 *                 .value(&#34;name: {{ foo }}&#34;)
 *                 .build())
 *             .type(&#34;WEBHOOK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * See additional examples.
 * ## Additional Examples
 * 
 * ##### [ServiceNow](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#servicenow)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;description&#34;)
 *                     .value(&#34;General description&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;short_description&#34;)
 *                     .value(&#34;Short description&#34;)
 *                     .build())
 *             .type(&#34;SERVICENOW_INCIDENTS&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### [Email](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#email)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;ERROR_TRACKING&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;subject&#34;)
 *                 .value(&#34;New Subject Title&#34;)
 *                 .build())
 *             .type(&#34;EMAIL&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### [Jira Classic](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#jira)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;ERROR_TRACKING&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;project&#34;)
 *                     .value(&#34;10000&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;issuetype&#34;)
 *                     .value(&#34;10004&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;description&#34;)
 *                     .value(&#34;Issue ID: {{ issueId }}&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;summary&#34;)
 *                     .value(&#34;{{ annotations.title.[0] }}&#34;)
 *                     .build())
 *             .type(&#34;JIRA_CLASSIC&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### [PagerDuty with account integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;summary&#34;)
 *                     .value(&#34;General summary&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;service&#34;)
 *                     .value(&#34;PTQK3FM&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;email&#34;)
 *                     .value(&#34;example@email.com&#34;)
 *                     .build())
 *             .type(&#34;PAGERDUTY_ACCOUNT_INTEGRATION&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ##### [PagerDuty with service integration](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#pagerduty)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;summary&#34;)
 *                 .value(&#34;General summary&#34;)
 *                 .build())
 *             .type(&#34;PAGERDUTY_SERVICE_INTEGRATION&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * #### Mobile Push
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .type(&#34;MOBILE_PUSH&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * #### [AWS Event Bridge](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#eventBridge)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(            
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;eventSource&#34;)
 *                     .value(&#34;aws.partner/mydomain/myaccountid/name&#34;)
 *                     .build(),
 *                 NotificationChannelPropertyArgs.builder()
 *                     .key(&#34;eventContent&#34;)
 *                     .value(&#34;{ id: {{ json issueId }} }&#34;)
 *                     .build())
 *             .type(&#34;EVENT_BRIDGE&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * #### [SLACK](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels/#slack)
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var foo = new NotificationChannel(&#34;foo&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .destinationId(&#34;00b6bd1d-ac06-4d3d-bd72-49551e70f7a8&#34;)
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;channelId&#34;)
 *                 .value(&#34;123456&#34;)
 *                 .build())
 *             .type(&#34;SLACK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * &gt; **NOTE:** Sensitive data such as channel API keys, service keys, etc are not returned from the underlying API for security reasons and may not be set in state when importing.
 * 
 * ## Full Scenario Example
 * 
 * Create a destination resource and reference that destination to the channel resource:
 * 
 * ### Create a destination
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationDestination;
 * import com.pulumi.newrelic.NotificationDestinationArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationAuthBasicArgs;
 * import com.pulumi.newrelic.inputs.NotificationDestinationPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var webhook_destination = new NotificationDestination(&#34;webhook-destination&#34;, NotificationDestinationArgs.builder()        
 *             .accountId(12345678)
 *             .authBasic(NotificationDestinationAuthBasicArgs.builder()
 *                 .password(&#34;password&#34;)
 *                 .user(&#34;username&#34;)
 *                 .build())
 *             .properties(NotificationDestinationPropertyArgs.builder()
 *                 .key(&#34;url&#34;)
 *                 .value(&#34;https://webhook.mywebhook.com&#34;)
 *                 .build())
 *             .type(&#34;WEBHOOK&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ### Create a channel
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.newrelic.NotificationChannel;
 * import com.pulumi.newrelic.NotificationChannelArgs;
 * import com.pulumi.newrelic.inputs.NotificationChannelPropertyArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var webhook_channel = new NotificationChannel(&#34;webhook-channel&#34;, NotificationChannelArgs.builder()        
 *             .accountId(12345678)
 *             .type(&#34;WEBHOOK&#34;)
 *             .destinationId(newrelic_notification_destination.webhook-destination().id())
 *             .product(&#34;IINT&#34;)
 *             .properties(NotificationChannelPropertyArgs.builder()
 *                 .key(&#34;payload&#34;)
 *                 .value(&#34;{name: foo}&#34;)
 *                 .label(&#34;Payload Template&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Additional Information
 * 
 * More details about the channels API can be found [here](https://docs.newrelic.com/docs/apis/nerdgraph/examples/nerdgraph-api-notifications-channels).
 * 
 */
@ResourceType(type="newrelic:index/notificationChannel:NotificationChannel")
public class NotificationChannel extends com.pulumi.resources.CustomResource {
    /**
     * Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return Determines the New Relic account where the notification channel will be created. Defaults to the account associated with the API key used.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Indicates whether the channel is active.
     * 
     */
    @Export(name="active", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> active;

    /**
     * @return Indicates whether the channel is active.
     * 
     */
    public Output<Optional<Boolean>> active() {
        return Codegen.optional(this.active);
    }
    /**
     * The id of the destination.
     * 
     */
    @Export(name="destinationId", type=String.class, parameters={})
    private Output<String> destinationId;

    /**
     * @return The id of the destination.
     * 
     */
    public Output<String> destinationId() {
        return this.destinationId;
    }
    /**
     * The name of the channel.
     * 
     */
    @Export(name="name", type=String.class, parameters={})
    private Output<String> name;

    /**
     * @return The name of the channel.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    @Export(name="product", type=String.class, parameters={})
    private Output<String> product;

    /**
     * @return The type of product.  One of: `DISCUSSIONS`, `ERROR_TRACKING` or `IINT` (workflows).
     * 
     */
    public Output<String> product() {
        return this.product;
    }
    /**
     * A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    @Export(name="properties", type=List.class, parameters={NotificationChannelProperty.class})
    private Output<List<NotificationChannelProperty>> properties;

    /**
     * @return A nested block that describes a notification channel property. See Nested property blocks below for details.
     * 
     */
    public Output<List<NotificationChannelProperty>> properties() {
        return this.properties;
    }
    /**
     * The status of the channel.
     * 
     */
    @Export(name="status", type=String.class, parameters={})
    private Output<String> status;

    /**
     * @return The status of the channel.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    @Export(name="type", type=String.class, parameters={})
    private Output<String> type;

    /**
     * @return The type of channel.  One of: `EMAIL`, `SERVICENOW_INCIDENTS`, `WEBHOOK`, `JIRA_CLASSIC`, `MOBILE_PUSH`, `EVENT_BRIDGE`, `SLACK` and `SLACK_COLLABORATION`, `PAGERDUTY_ACCOUNT_INTEGRATION` or `PAGERDUTY_SERVICE_INTEGRATION`.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotificationChannel(String name) {
        this(name, NotificationChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotificationChannel(String name, NotificationChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotificationChannel(String name, NotificationChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, args == null ? NotificationChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotificationChannel(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:index/notificationChannel:NotificationChannel", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static NotificationChannel get(String name, Output<String> id, @Nullable NotificationChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotificationChannel(name, id, state, options);
    }
}
