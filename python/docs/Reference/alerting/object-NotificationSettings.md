---
title: <span class="badge object-type-class"></span> NotificationSettings
---
# <span class="badge object-type-class"></span> NotificationSettings

## Definition

```python
class NotificationSettings:
    group_by: typing.Optional[list[str]]
    group_interval: typing.Optional[str]
    group_wait: typing.Optional[str]
    mute_time_intervals: typing.Optional[list[str]]
    receiver: str
    repeat_interval: typing.Optional[str]
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

 * <span class="badge builder"></span> [NotificationSettings](./builder-NotificationSettings.md)
