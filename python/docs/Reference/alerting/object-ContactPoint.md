---
title: <span class="badge object-type-class"></span> ContactPoint
---
# <span class="badge object-type-class"></span> ContactPoint

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

## Definition

```python
class ContactPoint:
    """
    EmbeddedContactPoint is the contact point type that is used
    by grafanas embedded alertmanager implementation.
    """

    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    disable_resolve_message: typing.Optional[bool]
    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    name: typing.Optional[str]
    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    provenance: typing.Optional[str]
    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    settings: alerting.Json
    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    type_val: typing.Literal["alertmanager", " dingding", " discord", " email", " googlechat", " kafka", " line", " opsgenie", " pagerduty", " pushover", " sensugo", " slack", " teams", " telegram", " threema", " victorops", " webhook", " wecom"]
    # EmbeddedContactPoint is the contact point type that is used
    # by grafanas embedded alertmanager implementation.
    uid: typing.Optional[str]
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

 * <span class="badge builder"></span> [ContactPoint](./builder-ContactPoint.md)
