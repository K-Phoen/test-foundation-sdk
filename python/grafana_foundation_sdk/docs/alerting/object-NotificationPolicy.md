---
title: <span class="badge object-type-class"></span> NotificationPolicy
---
# <span class="badge object-type-class"></span> NotificationPolicy

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

## Definition

```python
class NotificationPolicy:
    """
    A Route is a node that contains definitions of how to handle alerts. This is modified
    from the upstream alertmanager in that it adds the ObjectMatchers property.
    """

    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    active_time_intervals: typing.Optional[list[str]]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    continue_val: typing.Optional[bool]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    group_by: typing.Optional[list[str]]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    group_interval: typing.Optional[str]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    group_wait: typing.Optional[str]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    match: typing.Optional[dict[str, str]]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    match_re: typing.Optional[alerting.MatchRegexps]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    matchers: typing.Optional[alerting.Matchers]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    mute_time_intervals: typing.Optional[list[str]]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    object_matchers: typing.Optional[alerting.ObjectMatchers]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    provenance: typing.Optional[alerting.Provenance]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    receiver: typing.Optional[str]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    repeat_interval: typing.Optional[str]
    # A Route is a node that contains definitions of how to handle alerts. This is modified
    # from the upstream alertmanager in that it adds the ObjectMatchers property.
    routes: typing.Optional[list[alerting.NotificationPolicy]]
```
## Methods

### <span class="badge object-method"></span> to_json

Converts this object into a representation that can easily be encoded to JSON.

```python
def to_json() -> dict[str, object]
```

### <span class="badge object-method"></span> from_json

Builds this object from a JSON-decoded dict.

```python
@classmethod
def from_json(data: dict[str, typing.Any]) -> typing.Self
```

## See also

 * <span class="badge builder"></span> [NotificationPolicy](./builder-NotificationPolicy.md)
