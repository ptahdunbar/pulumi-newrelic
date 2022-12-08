// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Immutable;

namespace Pulumi.NewRelic
{
    public static class Config
    {
        [System.Diagnostics.CodeAnalysis.SuppressMessage("Microsoft.Design", "IDE1006", Justification = 
        "Double underscore prefix used to avoid conflicts with variable names.")]
        private sealed class __Value<T>
        {
            private readonly Func<T> _getter;
            private T _value = default!;
            private bool _set;

            public __Value(Func<T> getter)
            {
                _getter = getter;
            }

            public T Get() => _set ? _value : _getter();

            public void Set(T value)
            {
                _value = value;
                _set = true;
            }
        }

        private static readonly global::Pulumi.Config __config = new global::Pulumi.Config("newrelic");

        private static readonly __Value<int?> _accountId = new __Value<int?>(() => __config.GetInt32("accountId") ?? Utilities.GetEnvInt32("NEW_RELIC_ACCOUNT_ID"));
        public static int? AccountId
        {
            get => _accountId.Get();
            set => _accountId.Set(value);
        }

        private static readonly __Value<string?> _adminApiKey = new __Value<string?>(() => __config.Get("adminApiKey"));
        public static string? AdminApiKey
        {
            get => _adminApiKey.Get();
            set => _adminApiKey.Set(value);
        }

        private static readonly __Value<string?> _apiKey = new __Value<string?>(() => __config.Get("apiKey"));
        public static string? ApiKey
        {
            get => _apiKey.Get();
            set => _apiKey.Set(value);
        }

        private static readonly __Value<string?> _apiUrl = new __Value<string?>(() => __config.Get("apiUrl"));
        public static string? ApiUrl
        {
            get => _apiUrl.Get();
            set => _apiUrl.Set(value);
        }

        private static readonly __Value<string?> _cacertFile = new __Value<string?>(() => __config.Get("cacertFile"));
        public static string? CacertFile
        {
            get => _cacertFile.Get();
            set => _cacertFile.Set(value);
        }

        private static readonly __Value<string?> _infrastructureApiUrl = new __Value<string?>(() => __config.Get("infrastructureApiUrl"));
        public static string? InfrastructureApiUrl
        {
            get => _infrastructureApiUrl.Get();
            set => _infrastructureApiUrl.Set(value);
        }

        private static readonly __Value<bool?> _insecureSkipVerify = new __Value<bool?>(() => __config.GetBoolean("insecureSkipVerify"));
        public static bool? InsecureSkipVerify
        {
            get => _insecureSkipVerify.Get();
            set => _insecureSkipVerify.Set(value);
        }

        private static readonly __Value<string?> _insightsInsertKey = new __Value<string?>(() => __config.Get("insightsInsertKey"));
        public static string? InsightsInsertKey
        {
            get => _insightsInsertKey.Get();
            set => _insightsInsertKey.Set(value);
        }

        private static readonly __Value<string?> _insightsInsertUrl = new __Value<string?>(() => __config.Get("insightsInsertUrl"));
        public static string? InsightsInsertUrl
        {
            get => _insightsInsertUrl.Get();
            set => _insightsInsertUrl.Set(value);
        }

        private static readonly __Value<string?> _insightsQueryUrl = new __Value<string?>(() => __config.Get("insightsQueryUrl"));
        public static string? InsightsQueryUrl
        {
            get => _insightsQueryUrl.Get();
            set => _insightsQueryUrl.Set(value);
        }

        private static readonly __Value<string?> _nerdgraphApiUrl = new __Value<string?>(() => __config.Get("nerdgraphApiUrl"));
        public static string? NerdgraphApiUrl
        {
            get => _nerdgraphApiUrl.Get();
            set => _nerdgraphApiUrl.Set(value);
        }

        private static readonly __Value<string?> _region = new __Value<string?>(() => __config.Get("region") ?? Utilities.GetEnv("NEW_RELIC_REGION") ?? "US");
        /// <summary>
        /// The data center for which your New Relic account is configured. Only one region per provider block is permitted.
        /// </summary>
        public static string? Region
        {
            get => _region.Get();
            set => _region.Set(value);
        }

        private static readonly __Value<string?> _syntheticsApiUrl = new __Value<string?>(() => __config.Get("syntheticsApiUrl"));
        public static string? SyntheticsApiUrl
        {
            get => _syntheticsApiUrl.Get();
            set => _syntheticsApiUrl.Set(value);
        }

    }
}
