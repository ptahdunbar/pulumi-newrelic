// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Inputs
{

    public sealed class NotificationDestinationAuthTokenGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The prefix of the token auth.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        /// <summary>
        /// Specifies the token for integrating.
        /// </summary>
        [Input("token", required: true)]
        public Input<string> Token { get; set; } = null!;

        public NotificationDestinationAuthTokenGetArgs()
        {
        }
        public static new NotificationDestinationAuthTokenGetArgs Empty => new NotificationDestinationAuthTokenGetArgs();
    }
}
