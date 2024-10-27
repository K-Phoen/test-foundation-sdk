---
title: <span class="badge object-type-class"></span> Query
---
# <span class="badge object-type-class"></span> Query

## Definition

```python
class Query:
    datasource_uid: typing.Optional[str]
    model: typing.Optional[cogvariants.Dataquery]
    query_type: typing.Optional[str]
    ref_id: typing.Optional[str]
    relative_time_range: typing.Optional[alerting.RelativeTimeRange]
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

 * <span class="badge builder"></span> [Query](./builder-Query.md)
