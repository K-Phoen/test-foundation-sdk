---
title: <span class="badge object-type-class"></span> MetricNamesQuery
---
# <span class="badge object-type-class"></span> MetricNamesQuery

## Definition

```python
class MetricNamesQuery:
    raw_query: typing.Optional[str]
    kind: typing.Literal["MetricNamesQuery"]
    subscription: str
    resource_group: str
    resource_name: str
    metric_namespace: str
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

 * <span class="badge builder"></span> [MetricNamesQuery](./builder-MetricNamesQuery.md)