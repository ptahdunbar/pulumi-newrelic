// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.newrelic.cloud;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.newrelic.Utilities;
import com.pulumi.newrelic.cloud.AzureIntegrationsArgs;
import com.pulumi.newrelic.cloud.inputs.AzureIntegrationsState;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsApiManagement;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsAppGateway;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsAppService;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsContainers;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsCosmosDb;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsCostManagement;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsDataFactory;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsEventHub;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsExpressRoute;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsFirewalls;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsFrontDoor;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsFunctions;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsKeyVault;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsLoadBalancer;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsLogicApps;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsMachineLearning;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsMariaDb;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsMysql;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsMysqlFlexible;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsPostgresql;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsPostgresqlFlexible;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsPowerBiDedicated;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsRedisCache;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsServiceBus;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsSql;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsSqlManaged;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsStorage;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsVirtualMachine;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsVirtualNetworks;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsVms;
import com.pulumi.newrelic.cloud.outputs.AzureIntegrationsVpnGateway;
import java.lang.Integer;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Import
 * 
 * Linked Azure accounts can be imported using `id`, you can find the `id` of existing Azure linked accounts in Azure dashboard under Infrastructure in NewRelic. bash
 * 
 * ```sh
 *  $ pulumi import newrelic:cloud/azureIntegrations:AzureIntegrations foo &lt;id&gt;
 * ```
 * 
 */
@ResourceType(type="newrelic:cloud/azureIntegrations:AzureIntegrations")
public class AzureIntegrations extends com.pulumi.resources.CustomResource {
    /**
     * The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    @Export(name="accountId", type=Integer.class, parameters={})
    private Output<Integer> accountId;

    /**
     * @return The New Relic account ID to operate on.  This allows the user to override the `account_id` attribute set on the provider. Defaults to the environment variable `NEW_RELIC_ACCOUNT_ID`.
     * 
     */
    public Output<Integer> accountId() {
        return this.accountId;
    }
    /**
     * Azure API Management. See Integration blocks below for details.
     * 
     */
    @Export(name="apiManagement", type=AzureIntegrationsApiManagement.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsApiManagement> apiManagement;

    /**
     * @return Azure API Management. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsApiManagement>> apiManagement() {
        return Codegen.optional(this.apiManagement);
    }
    /**
     * Azure App Gateway. See Integration blocks below for details.
     * 
     */
    @Export(name="appGateway", type=AzureIntegrationsAppGateway.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsAppGateway> appGateway;

    /**
     * @return Azure App Gateway. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsAppGateway>> appGateway() {
        return Codegen.optional(this.appGateway);
    }
    /**
     * Azure App Service. See Integration blocks below for details.
     * 
     */
    @Export(name="appService", type=AzureIntegrationsAppService.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsAppService> appService;

    /**
     * @return Azure App Service. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsAppService>> appService() {
        return Codegen.optional(this.appService);
    }
    /**
     * Azure Containers. See Integration blocks below for details.
     * 
     */
    @Export(name="containers", type=AzureIntegrationsContainers.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsContainers> containers;

    /**
     * @return Azure Containers. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsContainers>> containers() {
        return Codegen.optional(this.containers);
    }
    /**
     * Azure CosmosDB. See Integration blocks below for details.
     * 
     */
    @Export(name="cosmosDb", type=AzureIntegrationsCosmosDb.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsCosmosDb> cosmosDb;

    /**
     * @return Azure CosmosDB. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsCosmosDb>> cosmosDb() {
        return Codegen.optional(this.cosmosDb);
    }
    /**
     * Azure Cost Management. See Integration blocks below for details.
     * 
     */
    @Export(name="costManagement", type=AzureIntegrationsCostManagement.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsCostManagement> costManagement;

    /**
     * @return Azure Cost Management. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsCostManagement>> costManagement() {
        return Codegen.optional(this.costManagement);
    }
    /**
     * Azure Data Factory. See Integration blocks below for details.
     * 
     */
    @Export(name="dataFactory", type=AzureIntegrationsDataFactory.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsDataFactory> dataFactory;

    /**
     * @return Azure Data Factory. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsDataFactory>> dataFactory() {
        return Codegen.optional(this.dataFactory);
    }
    /**
     * Azure Event Hub. See Integration blocks below for details.
     * 
     */
    @Export(name="eventHub", type=AzureIntegrationsEventHub.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsEventHub> eventHub;

    /**
     * @return Azure Event Hub. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsEventHub>> eventHub() {
        return Codegen.optional(this.eventHub);
    }
    /**
     * Azure Express Route. See Integration blocks below for details.
     * 
     */
    @Export(name="expressRoute", type=AzureIntegrationsExpressRoute.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsExpressRoute> expressRoute;

    /**
     * @return Azure Express Route. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsExpressRoute>> expressRoute() {
        return Codegen.optional(this.expressRoute);
    }
    /**
     * Azure Firewalls. See Integration blocks below for details.
     * 
     */
    @Export(name="firewalls", type=AzureIntegrationsFirewalls.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsFirewalls> firewalls;

    /**
     * @return Azure Firewalls. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsFirewalls>> firewalls() {
        return Codegen.optional(this.firewalls);
    }
    /**
     * Azure Front Door. See Integration blocks below for details.
     * 
     */
    @Export(name="frontDoor", type=AzureIntegrationsFrontDoor.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsFrontDoor> frontDoor;

    /**
     * @return Azure Front Door. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsFrontDoor>> frontDoor() {
        return Codegen.optional(this.frontDoor);
    }
    /**
     * Azure Functions. See Integration blocks below for details.
     * 
     */
    @Export(name="functions", type=AzureIntegrationsFunctions.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsFunctions> functions;

    /**
     * @return Azure Functions. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsFunctions>> functions() {
        return Codegen.optional(this.functions);
    }
    /**
     * Azure Key Vault. See Integration blocks below for details.
     * 
     */
    @Export(name="keyVault", type=AzureIntegrationsKeyVault.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsKeyVault> keyVault;

    /**
     * @return Azure Key Vault. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsKeyVault>> keyVault() {
        return Codegen.optional(this.keyVault);
    }
    /**
     * The ID of the linked Azure account in New Relic.
     * 
     */
    @Export(name="linkedAccountId", type=Integer.class, parameters={})
    private Output<Integer> linkedAccountId;

    /**
     * @return The ID of the linked Azure account in New Relic.
     * 
     */
    public Output<Integer> linkedAccountId() {
        return this.linkedAccountId;
    }
    /**
     * Azure Load Balancer. See Integration blocks below for details.
     * 
     */
    @Export(name="loadBalancer", type=AzureIntegrationsLoadBalancer.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsLoadBalancer> loadBalancer;

    /**
     * @return Azure Load Balancer. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsLoadBalancer>> loadBalancer() {
        return Codegen.optional(this.loadBalancer);
    }
    /**
     * Azure Logic Apps. See Integration blocks below for details.
     * 
     */
    @Export(name="logicApps", type=AzureIntegrationsLogicApps.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsLogicApps> logicApps;

    /**
     * @return Azure Logic Apps. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsLogicApps>> logicApps() {
        return Codegen.optional(this.logicApps);
    }
    /**
     * Azure Machine Learning. See Integration blocks below for details.
     * 
     */
    @Export(name="machineLearning", type=AzureIntegrationsMachineLearning.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsMachineLearning> machineLearning;

    /**
     * @return Azure Machine Learning. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsMachineLearning>> machineLearning() {
        return Codegen.optional(this.machineLearning);
    }
    /**
     * Azure MariaDB. See Integration blocks below for details.
     * 
     */
    @Export(name="mariaDb", type=AzureIntegrationsMariaDb.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsMariaDb> mariaDb;

    /**
     * @return Azure MariaDB. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsMariaDb>> mariaDb() {
        return Codegen.optional(this.mariaDb);
    }
    /**
     * Azure MySQL. See Integration blocks below for details.
     * 
     */
    @Export(name="mysql", type=AzureIntegrationsMysql.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsMysql> mysql;

    /**
     * @return Azure MySQL. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsMysql>> mysql() {
        return Codegen.optional(this.mysql);
    }
    /**
     * Azure MySQL Flexible Server. See Integration blocks below for details.
     * 
     */
    @Export(name="mysqlFlexible", type=AzureIntegrationsMysqlFlexible.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsMysqlFlexible> mysqlFlexible;

    /**
     * @return Azure MySQL Flexible Server. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsMysqlFlexible>> mysqlFlexible() {
        return Codegen.optional(this.mysqlFlexible);
    }
    /**
     * Azure PostgreSQL. See Integration blocks below for details.
     * 
     */
    @Export(name="postgresql", type=AzureIntegrationsPostgresql.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsPostgresql> postgresql;

    /**
     * @return Azure PostgreSQL. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsPostgresql>> postgresql() {
        return Codegen.optional(this.postgresql);
    }
    /**
     * Azure PostgreSQL Flexible Server. See Integration blocks below for details.
     * 
     */
    @Export(name="postgresqlFlexible", type=AzureIntegrationsPostgresqlFlexible.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsPostgresqlFlexible> postgresqlFlexible;

    /**
     * @return Azure PostgreSQL Flexible Server. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsPostgresqlFlexible>> postgresqlFlexible() {
        return Codegen.optional(this.postgresqlFlexible);
    }
    /**
     * Azure Power BI Dedicated. See Integration blocks below for details.
     * 
     */
    @Export(name="powerBiDedicated", type=AzureIntegrationsPowerBiDedicated.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsPowerBiDedicated> powerBiDedicated;

    /**
     * @return Azure Power BI Dedicated. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsPowerBiDedicated>> powerBiDedicated() {
        return Codegen.optional(this.powerBiDedicated);
    }
    /**
     * Azure Redis Cache. See Integration blocks below for details.
     * 
     */
    @Export(name="redisCache", type=AzureIntegrationsRedisCache.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsRedisCache> redisCache;

    /**
     * @return Azure Redis Cache. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsRedisCache>> redisCache() {
        return Codegen.optional(this.redisCache);
    }
    /**
     * Azure Service Bus. See Integration blocks below for details.
     * 
     */
    @Export(name="serviceBus", type=AzureIntegrationsServiceBus.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsServiceBus> serviceBus;

    /**
     * @return Azure Service Bus. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsServiceBus>> serviceBus() {
        return Codegen.optional(this.serviceBus);
    }
    /**
     * Azure SQL. See Integration blocks below for details.
     * 
     */
    @Export(name="sql", type=AzureIntegrationsSql.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsSql> sql;

    /**
     * @return Azure SQL. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsSql>> sql() {
        return Codegen.optional(this.sql);
    }
    /**
     * Azure SQL Managed. See Integration blocks below for details.
     * 
     */
    @Export(name="sqlManaged", type=AzureIntegrationsSqlManaged.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsSqlManaged> sqlManaged;

    /**
     * @return Azure SQL Managed. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsSqlManaged>> sqlManaged() {
        return Codegen.optional(this.sqlManaged);
    }
    /**
     * for Azure Storage. See Integration blocks below for details.
     * 
     */
    @Export(name="storage", type=AzureIntegrationsStorage.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsStorage> storage;

    /**
     * @return for Azure Storage. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsStorage>> storage() {
        return Codegen.optional(this.storage);
    }
    /**
     * Azure Virtual machine. See Integration blocks below for details.
     * 
     */
    @Export(name="virtualMachine", type=AzureIntegrationsVirtualMachine.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsVirtualMachine> virtualMachine;

    /**
     * @return Azure Virtual machine. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsVirtualMachine>> virtualMachine() {
        return Codegen.optional(this.virtualMachine);
    }
    /**
     * for Azure Virtual networks. See Integration blocks below for details.
     * 
     */
    @Export(name="virtualNetworks", type=AzureIntegrationsVirtualNetworks.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsVirtualNetworks> virtualNetworks;

    /**
     * @return for Azure Virtual networks. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsVirtualNetworks>> virtualNetworks() {
        return Codegen.optional(this.virtualNetworks);
    }
    /**
     * Azure VMs. See Integration blocks below for details.
     * 
     */
    @Export(name="vms", type=AzureIntegrationsVms.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsVms> vms;

    /**
     * @return Azure VMs. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsVms>> vms() {
        return Codegen.optional(this.vms);
    }
    /**
     * Azure VPN Gateway. See Integration blocks below for details.
     * 
     */
    @Export(name="vpnGateway", type=AzureIntegrationsVpnGateway.class, parameters={})
    private Output</* @Nullable */ AzureIntegrationsVpnGateway> vpnGateway;

    /**
     * @return Azure VPN Gateway. See Integration blocks below for details.
     * 
     */
    public Output<Optional<AzureIntegrationsVpnGateway>> vpnGateway() {
        return Codegen.optional(this.vpnGateway);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AzureIntegrations(String name) {
        this(name, AzureIntegrationsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AzureIntegrations(String name, AzureIntegrationsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AzureIntegrations(String name, AzureIntegrationsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/azureIntegrations:AzureIntegrations", name, args == null ? AzureIntegrationsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AzureIntegrations(String name, Output<String> id, @Nullable AzureIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("newrelic:cloud/azureIntegrations:AzureIntegrations", name, state, makeResourceOptions(options, id));
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
    public static AzureIntegrations get(String name, Output<String> id, @Nullable AzureIntegrationsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AzureIntegrations(name, id, state, options);
    }
}
