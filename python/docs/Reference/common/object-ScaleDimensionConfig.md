---
title: <span class="badge object-type-class"></span> ScaleDimensionConfig
---
# <span class="badge object-type-class"></span> ScaleDimensionConfig

## Definition

```python
class ScaleDimensionConfig:
    min_val: float
    max_val: float
    fixed: typing.Optional[float]
    # fixed: T -- will be added by each element
    field: typing.Optional[str]
    # | *"linear"
    mode: typing.Optional[common.ScaleDimensionMode]
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

 * <span class="badge builder"></span> [ScaleDimensionConfig](./builder-ScaleDimensionConfig.md)