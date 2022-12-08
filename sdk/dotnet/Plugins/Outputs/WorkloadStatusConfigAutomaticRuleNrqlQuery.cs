// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.NewRelic.Plugins.Outputs
{

    [OutputType]
    public sealed class WorkloadStatusConfigAutomaticRuleNrqlQuery
    {
        /// <summary>
        /// The entity search query that is used to perform the search of a group of entities.
        /// </summary>
        public readonly string Query;

        [OutputConstructor]
        private WorkloadStatusConfigAutomaticRuleNrqlQuery(string query)
        {
            Query = query;
        }
    }
}
