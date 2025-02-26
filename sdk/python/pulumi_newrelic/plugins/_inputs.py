# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import copy
import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union, overload
from .. import _utilities

__all__ = [
    'WorkloadEntitySearchQueryArgs',
    'WorkloadStatusConfigAutomaticArgs',
    'WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs',
    'WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs',
    'WorkloadStatusConfigAutomaticRuleArgs',
    'WorkloadStatusConfigAutomaticRuleNrqlQueryArgs',
    'WorkloadStatusConfigAutomaticRuleRollupArgs',
    'WorkloadStatusConfigStaticArgs',
]

@pulumi.input_type
class WorkloadEntitySearchQueryArgs:
    def __init__(__self__, *,
                 query: pulumi.Input[str]):
        """
        :param pulumi.Input[str] query: The query.
        """
        pulumi.set(__self__, "query", query)

    @property
    @pulumi.getter
    def query(self) -> pulumi.Input[str]:
        """
        The query.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: pulumi.Input[str]):
        pulumi.set(self, "query", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 remaining_entities_rule: Optional[pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs']] = None,
                 rules: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleArgs']]]] = None):
        """
        :param pulumi.Input[bool] enabled: Whether the automatic status configuration is enabled or not.
        :param pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs'] remaining_entities_rule: An additional meta-rule that can consider all entities that haven't been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleArgs']]] rules: The input object used to represent a rollup strategy. See Nested rule blocks below for details.
        """
        pulumi.set(__self__, "enabled", enabled)
        if remaining_entities_rule is not None:
            pulumi.set(__self__, "remaining_entities_rule", remaining_entities_rule)
        if rules is not None:
            pulumi.set(__self__, "rules", rules)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the automatic status configuration is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter(name="remainingEntitiesRule")
    def remaining_entities_rule(self) -> Optional[pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs']]:
        """
        An additional meta-rule that can consider all entities that haven't been evaluated by any other rule. See Nested remaining_entities_rule blocks below for details.
        """
        return pulumi.get(self, "remaining_entities_rule")

    @remaining_entities_rule.setter
    def remaining_entities_rule(self, value: Optional[pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs']]):
        pulumi.set(self, "remaining_entities_rule", value)

    @property
    @pulumi.getter
    def rules(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleArgs']]]]:
        """
        The input object used to represent a rollup strategy. See Nested rule blocks below for details.
        """
        return pulumi.get(self, "rules")

    @rules.setter
    def rules(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleArgs']]]]):
        pulumi.set(self, "rules", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticRemainingEntitiesRuleArgs:
    def __init__(__self__, *,
                 remaining_entities_rule_rollup: pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs']):
        """
        :param pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs'] remaining_entities_rule_rollup: The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
        """
        pulumi.set(__self__, "remaining_entities_rule_rollup", remaining_entities_rule_rollup)

    @property
    @pulumi.getter(name="remainingEntitiesRuleRollup")
    def remaining_entities_rule_rollup(self) -> pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs']:
        """
        The input object used to represent a rollup strategy. See Nested remaining_entities_rule_rollup blocks below for details.
        """
        return pulumi.get(self, "remaining_entities_rule_rollup")

    @remaining_entities_rule_rollup.setter
    def remaining_entities_rule_rollup(self, value: pulumi.Input['WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs']):
        pulumi.set(self, "remaining_entities_rule_rollup", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticRemainingEntitiesRuleRemainingEntitiesRuleRollupArgs:
    def __init__(__self__, *,
                 group_by: pulumi.Input[str],
                 strategy: pulumi.Input[str],
                 threshold_type: Optional[pulumi.Input[str]] = None,
                 threshold_value: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] group_by: The grouping to be applied to the remaining entities.
        :param pulumi.Input[str] strategy: The rollup strategy that is applied to a group of entities.
        :param pulumi.Input[str] threshold_type: Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        :param pulumi.Input[int] threshold_value: Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        pulumi.set(__self__, "group_by", group_by)
        pulumi.set(__self__, "strategy", strategy)
        if threshold_type is not None:
            pulumi.set(__self__, "threshold_type", threshold_type)
        if threshold_value is not None:
            pulumi.set(__self__, "threshold_value", threshold_value)

    @property
    @pulumi.getter(name="groupBy")
    def group_by(self) -> pulumi.Input[str]:
        """
        The grouping to be applied to the remaining entities.
        """
        return pulumi.get(self, "group_by")

    @group_by.setter
    def group_by(self, value: pulumi.Input[str]):
        pulumi.set(self, "group_by", value)

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Input[str]:
        """
        The rollup strategy that is applied to a group of entities.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: pulumi.Input[str]):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter(name="thresholdType")
    def threshold_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        """
        return pulumi.get(self, "threshold_type")

    @threshold_type.setter
    def threshold_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "threshold_type", value)

    @property
    @pulumi.getter(name="thresholdValue")
    def threshold_value(self) -> Optional[pulumi.Input[int]]:
        """
        Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        return pulumi.get(self, "threshold_value")

    @threshold_value.setter
    def threshold_value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "threshold_value", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticRuleArgs:
    def __init__(__self__, *,
                 rollup: pulumi.Input['WorkloadStatusConfigAutomaticRuleRollupArgs'],
                 entity_guids: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]] = None,
                 nrql_queries: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleNrqlQueryArgs']]]] = None):
        """
        :param pulumi.Input['WorkloadStatusConfigAutomaticRuleRollupArgs'] rollup: The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
        :param pulumi.Input[Sequence[pulumi.Input[str]]] entity_guids: A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
        :param pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleNrqlQueryArgs']]] nrql_queries: A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        pulumi.set(__self__, "rollup", rollup)
        if entity_guids is not None:
            pulumi.set(__self__, "entity_guids", entity_guids)
        if nrql_queries is not None:
            pulumi.set(__self__, "nrql_queries", nrql_queries)

    @property
    @pulumi.getter
    def rollup(self) -> pulumi.Input['WorkloadStatusConfigAutomaticRuleRollupArgs']:
        """
        The input object used to represent a rollup strategy. See Nested rollup blocks below for details.
        """
        return pulumi.get(self, "rollup")

    @rollup.setter
    def rollup(self, value: pulumi.Input['WorkloadStatusConfigAutomaticRuleRollupArgs']):
        pulumi.set(self, "rollup", value)

    @property
    @pulumi.getter(name="entityGuids")
    def entity_guids(self) -> Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]:
        """
        A list of entity GUIDs composing the rule. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        return pulumi.get(self, "entity_guids")

    @entity_guids.setter
    def entity_guids(self, value: Optional[pulumi.Input[Sequence[pulumi.Input[str]]]]):
        pulumi.set(self, "entity_guids", value)

    @property
    @pulumi.getter(name="nrqlQueries")
    def nrql_queries(self) -> Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleNrqlQueryArgs']]]]:
        """
        A list of entity search queries used to retrieve the entities that compose the rule. See Nested nrql_query blocks below for details. At least one of `entity_guids` or `nrql_query` must be defined.
        """
        return pulumi.get(self, "nrql_queries")

    @nrql_queries.setter
    def nrql_queries(self, value: Optional[pulumi.Input[Sequence[pulumi.Input['WorkloadStatusConfigAutomaticRuleNrqlQueryArgs']]]]):
        pulumi.set(self, "nrql_queries", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticRuleNrqlQueryArgs:
    def __init__(__self__, *,
                 query: pulumi.Input[str]):
        """
        :param pulumi.Input[str] query: The entity search query that is used to perform the search of a group of entities.
        """
        pulumi.set(__self__, "query", query)

    @property
    @pulumi.getter
    def query(self) -> pulumi.Input[str]:
        """
        The entity search query that is used to perform the search of a group of entities.
        """
        return pulumi.get(self, "query")

    @query.setter
    def query(self, value: pulumi.Input[str]):
        pulumi.set(self, "query", value)


@pulumi.input_type
class WorkloadStatusConfigAutomaticRuleRollupArgs:
    def __init__(__self__, *,
                 strategy: pulumi.Input[str],
                 threshold_type: Optional[pulumi.Input[str]] = None,
                 threshold_value: Optional[pulumi.Input[int]] = None):
        """
        :param pulumi.Input[str] strategy: The rollup strategy that is applied to a group of entities.
        :param pulumi.Input[str] threshold_type: Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        :param pulumi.Input[int] threshold_value: Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        pulumi.set(__self__, "strategy", strategy)
        if threshold_type is not None:
            pulumi.set(__self__, "threshold_type", threshold_type)
        if threshold_value is not None:
            pulumi.set(__self__, "threshold_value", threshold_value)

    @property
    @pulumi.getter
    def strategy(self) -> pulumi.Input[str]:
        """
        The rollup strategy that is applied to a group of entities.
        """
        return pulumi.get(self, "strategy")

    @strategy.setter
    def strategy(self, value: pulumi.Input[str]):
        pulumi.set(self, "strategy", value)

    @property
    @pulumi.getter(name="thresholdType")
    def threshold_type(self) -> Optional[pulumi.Input[str]]:
        """
        Type of threshold defined for the rule. This is an optional field that only applies when strategy is WORST_STATUS_WINS. Use a threshold to roll up the worst status only after a certain amount of entities are not operational.
        """
        return pulumi.get(self, "threshold_type")

    @threshold_type.setter
    def threshold_type(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "threshold_type", value)

    @property
    @pulumi.getter(name="thresholdValue")
    def threshold_value(self) -> Optional[pulumi.Input[int]]:
        """
        Threshold value defined for the rule. This optional field is used in combination with thresholdType. If the threshold type is null, the threshold value will be ignored.
        """
        return pulumi.get(self, "threshold_value")

    @threshold_value.setter
    def threshold_value(self, value: Optional[pulumi.Input[int]]):
        pulumi.set(self, "threshold_value", value)


@pulumi.input_type
class WorkloadStatusConfigStaticArgs:
    def __init__(__self__, *,
                 enabled: pulumi.Input[bool],
                 status: pulumi.Input[str],
                 description: Optional[pulumi.Input[str]] = None,
                 summary: Optional[pulumi.Input[str]] = None):
        """
        :param pulumi.Input[bool] enabled: Whether the automatic status configuration is enabled or not.
        :param pulumi.Input[str] status: The status of the workload.
        :param pulumi.Input[str] description: Relevant information about the workload.
        :param pulumi.Input[str] summary: A short description of the status of the workload.
        """
        pulumi.set(__self__, "enabled", enabled)
        pulumi.set(__self__, "status", status)
        if description is not None:
            pulumi.set(__self__, "description", description)
        if summary is not None:
            pulumi.set(__self__, "summary", summary)

    @property
    @pulumi.getter
    def enabled(self) -> pulumi.Input[bool]:
        """
        Whether the automatic status configuration is enabled or not.
        """
        return pulumi.get(self, "enabled")

    @enabled.setter
    def enabled(self, value: pulumi.Input[bool]):
        pulumi.set(self, "enabled", value)

    @property
    @pulumi.getter
    def status(self) -> pulumi.Input[str]:
        """
        The status of the workload.
        """
        return pulumi.get(self, "status")

    @status.setter
    def status(self, value: pulumi.Input[str]):
        pulumi.set(self, "status", value)

    @property
    @pulumi.getter
    def description(self) -> Optional[pulumi.Input[str]]:
        """
        Relevant information about the workload.
        """
        return pulumi.get(self, "description")

    @description.setter
    def description(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "description", value)

    @property
    @pulumi.getter
    def summary(self) -> Optional[pulumi.Input[str]]:
        """
        A short description of the status of the workload.
        """
        return pulumi.get(self, "summary")

    @summary.setter
    def summary(self, value: Optional[pulumi.Input[str]]):
        pulumi.set(self, "summary", value)


