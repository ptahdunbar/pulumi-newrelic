// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic
{
    public static class GetKeyTransaction
    {
        /// <summary>
        /// Use this data source to get information about a specific key transaction in New Relic that already exists.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var txn = NewRelic.GetKeyTransaction.Invoke(new()
        ///     {
        ///         Name = "txn",
        ///     });
        /// 
        ///     var fooAlertPolicy = new NewRelic.AlertPolicy("fooAlertPolicy");
        /// 
        ///     var fooAlertCondition = new NewRelic.AlertCondition("fooAlertCondition", new()
        ///     {
        ///         PolicyId = fooAlertPolicy.Id,
        ///         Type = "apm_kt_metric",
        ///         Entities = new[]
        ///         {
        ///             txn.Apply(getKeyTransactionResult =&gt; getKeyTransactionResult.Id),
        ///         },
        ///         Metric = "error_percentage",
        ///         RunbookUrl = "https://www.example.com",
        ///         Terms = new[]
        ///         {
        ///             new NewRelic.Inputs.AlertConditionTermArgs
        ///             {
        ///                 Duration = 5,
        ///                 Operator = "below",
        ///                 Priority = "critical",
        ///                 Threshold = 0.75,
        ///                 TimeFunction = "all",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetKeyTransactionResult> InvokeAsync(GetKeyTransactionArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetKeyTransactionResult>("newrelic:index/getKeyTransaction:getKeyTransaction", args ?? new GetKeyTransactionArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a specific key transaction in New Relic that already exists.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using Pulumi;
        /// using NewRelic = Pulumi.NewRelic;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var txn = NewRelic.GetKeyTransaction.Invoke(new()
        ///     {
        ///         Name = "txn",
        ///     });
        /// 
        ///     var fooAlertPolicy = new NewRelic.AlertPolicy("fooAlertPolicy");
        /// 
        ///     var fooAlertCondition = new NewRelic.AlertCondition("fooAlertCondition", new()
        ///     {
        ///         PolicyId = fooAlertPolicy.Id,
        ///         Type = "apm_kt_metric",
        ///         Entities = new[]
        ///         {
        ///             txn.Apply(getKeyTransactionResult =&gt; getKeyTransactionResult.Id),
        ///         },
        ///         Metric = "error_percentage",
        ///         RunbookUrl = "https://www.example.com",
        ///         Terms = new[]
        ///         {
        ///             new NewRelic.Inputs.AlertConditionTermArgs
        ///             {
        ///                 Duration = 5,
        ///                 Operator = "below",
        ///                 Priority = "critical",
        ///                 Threshold = 0.75,
        ///                 TimeFunction = "all",
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetKeyTransactionResult> Invoke(GetKeyTransactionInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetKeyTransactionResult>("newrelic:index/getKeyTransaction:getKeyTransaction", args ?? new GetKeyTransactionInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetKeyTransactionArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the key transaction in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetKeyTransactionArgs()
        {
        }
        public static new GetKeyTransactionArgs Empty => new GetKeyTransactionArgs();
    }

    public sealed class GetKeyTransactionInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the key transaction in New Relic.
        /// </summary>
        [Input("name", required: true)]
        public Input<string> Name { get; set; } = null!;

        public GetKeyTransactionInvokeArgs()
        {
        }
        public static new GetKeyTransactionInvokeArgs Empty => new GetKeyTransactionInvokeArgs();
    }


    [OutputType]
    public sealed class GetKeyTransactionResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string Name;

        [OutputConstructor]
        private GetKeyTransactionResult(
            string id,

            string name)
        {
            Id = id;
            Name = name;
        }
    }
}
