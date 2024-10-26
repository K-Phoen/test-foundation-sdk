---
title: <span class="badge object-type-class"></span> TimeInterval
---
# <span class="badge object-type-class"></span> TimeInterval

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

## Definition

```python
class TimeInterval:
    """
    TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    within the interval.
    """

    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    days_of_month: typing.Optional[list[str]]
    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    location: typing.Optional[str]
    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    months: typing.Optional[list[str]]
    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    times: typing.Optional[list[alerting.TimeRange]]
    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    weekdays: typing.Optional[list[str]]
    # TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
    # within the interval.
    years: typing.Optional[list[str]]
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

 * <span class="badge builder"></span> [TimeInterval](./builder-TimeInterval.md)
