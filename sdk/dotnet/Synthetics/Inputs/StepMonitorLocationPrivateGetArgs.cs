// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Synthetics.Inputs
{

    public sealed class StepMonitorLocationPrivateGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for the Synthetics private location in New Relic.
        /// </summary>
        [Input("guid", required: true)]
        public Input<string> Guid { get; set; } = null!;

        [Input("vsePassword")]
        private Input<string>? _vsePassword;

        /// <summary>
        /// The location's Verified Script Execution password, only necessary if Verified Script Execution is enabled for the location.
        /// </summary>
        public Input<string>? VsePassword
        {
            get => _vsePassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _vsePassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public StepMonitorLocationPrivateGetArgs()
        {
        }
        public static new StepMonitorLocationPrivateGetArgs Empty => new StepMonitorLocationPrivateGetArgs();
    }
}
