---
title: <span class="badge object-type-class"></span> ExprTypeReduceTimeRange
---
# <span class="badge object-type-class"></span> ExprTypeReduceTimeRange

## Definition

```python
class ExprTypeReduceTimeRange:
    # From is the start time of the query.
    from_val: str
    # To is the end time of the query.
    to: str
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

 * <span class="badge builder"></span> [ExprTypeReduceTimeRange](./builder-ExprTypeReduceTimeRange.md)