---
title: <span class="badge builder"></span> NotificationPolicy
---
# <span class="badge builder"></span> NotificationPolicy

## Constructor

```python
NotificationPolicy()
```
## Methods

### <span class="badge object-method"></span> build

Builds the object.

```python
def build() -> alerting.NotificationPolicy
```

### <span class="badge object-method"></span> continue_val

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def continue_val(continue_val: bool) -> typing.Self
```

### <span class="badge object-method"></span> group_by

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def group_by(group_by: list[str]) -> typing.Self
```

### <span class="badge object-method"></span> group_interval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def group_interval(group_interval: str) -> typing.Self
```

### <span class="badge object-method"></span> group_wait

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def group_wait(group_wait: str) -> typing.Self
```

### <span class="badge object-method"></span> match

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def match(match: dict[str, str]) -> typing.Self
```

### <span class="badge object-method"></span> match_re

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def match_re(match_re: alerting.MatchRegexps) -> typing.Self
```

### <span class="badge object-method"></span> matchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def matchers(matchers: alerting.Matchers) -> typing.Self
```

### <span class="badge object-method"></span> mute_time_intervals

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def mute_time_intervals(mute_time_intervals: list[str]) -> typing.Self
```

### <span class="badge object-method"></span> object_matchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def object_matchers(object_matchers: alerting.ObjectMatchers) -> typing.Self
```

### <span class="badge object-method"></span> provenance

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def provenance(provenance: alerting.Provenance) -> typing.Self
```

### <span class="badge object-method"></span> receiver

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def receiver(receiver: str) -> typing.Self
```

### <span class="badge object-method"></span> repeat_interval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def repeat_interval(repeat_interval: str) -> typing.Self
```

### <span class="badge object-method"></span> routes

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```python
def routes(routes: list[cogbuilder.Builder[alerting.NotificationPolicy]]) -> typing.Self
```

## See also

 * <span class="badge object-type-class"></span> [NotificationPolicy](./object-NotificationPolicy.md)
