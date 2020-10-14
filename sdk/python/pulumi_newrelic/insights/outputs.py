# coding=utf-8
# *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
# *** Do not edit by hand unless you're certain you know what you are doing! ***

import warnings
import pulumi
import pulumi.runtime
from typing import Any, Mapping, Optional, Sequence, Union
from .. import _utilities, _tables
from . import outputs

__all__ = [
    'EventEvent',
    'EventEventAttribute',
]

@pulumi.output_type
class EventEvent(dict):
    def __init__(__self__, *,
                 attributes: Sequence['outputs.EventEventAttribute'],
                 type: str,
                 timestamp: Optional[int] = None):
        pulumi.set(__self__, "attributes", attributes)
        pulumi.set(__self__, "type", type)
        if timestamp is not None:
            pulumi.set(__self__, "timestamp", timestamp)

    @property
    @pulumi.getter
    def attributes(self) -> Sequence['outputs.EventEventAttribute']:
        return pulumi.get(self, "attributes")

    @property
    @pulumi.getter
    def type(self) -> str:
        return pulumi.get(self, "type")

    @property
    @pulumi.getter
    def timestamp(self) -> Optional[int]:
        return pulumi.get(self, "timestamp")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


@pulumi.output_type
class EventEventAttribute(dict):
    def __init__(__self__, *,
                 key: str,
                 value: str,
                 type: Optional[str] = None):
        pulumi.set(__self__, "key", key)
        pulumi.set(__self__, "value", value)
        if type is not None:
            pulumi.set(__self__, "type", type)

    @property
    @pulumi.getter
    def key(self) -> str:
        return pulumi.get(self, "key")

    @property
    @pulumi.getter
    def value(self) -> str:
        return pulumi.get(self, "value")

    @property
    @pulumi.getter
    def type(self) -> Optional[str]:
        return pulumi.get(self, "type")

    def _translate_property(self, prop):
        return _tables.CAMEL_TO_SNAKE_CASE_TABLE.get(prop) or prop


