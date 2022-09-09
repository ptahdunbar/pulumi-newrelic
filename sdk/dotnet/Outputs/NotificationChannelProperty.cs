// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Outputs
{

    [OutputType]
    public sealed class NotificationChannelProperty
    {
        /// <summary>
        /// The notification property display value.
        /// *
        /// Each notification channel type supports a specific set of arguments for the `property` block:
        /// </summary>
        public readonly string? DisplayValue;
        /// <summary>
        /// The notification property key.
        /// </summary>
        public readonly string Key;
        /// <summary>
        /// The notification property label.
        /// </summary>
        public readonly string? Label;
        /// <summary>
        /// The notification property value.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private NotificationChannelProperty(
            string? displayValue,

            string key,

            string? label,

            string value)
        {
            DisplayValue = displayValue;
            Key = key;
            Label = label;
            Value = value;
        }
    }
}
