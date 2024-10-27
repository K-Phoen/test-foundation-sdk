---
title: <span class="badge builder"></span> NotificationPolicyBuilder
---
# <span class="badge builder"></span> NotificationPolicyBuilder

## Constructor

```go
func NewNotificationPolicyBuilder() *NotificationPolicyBuilder
```
## Methods

### <span class="badge object-method"></span> Build

Builds the object.

```go
func (builder *NotificationPolicyBuilder) Build() (NotificationPolicy, error)
```

### <span class="badge object-method"></span> Continue

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Continue(continueArg bool) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> GroupBy

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) GroupBy(groupBy []string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> GroupInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) GroupInterval(groupInterval string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> GroupWait

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) GroupWait(groupWait string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> Match

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Match(match map[string]string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> MatchRe

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) MatchRe(matchRe alerting.MatchRegexps) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> Matchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Matchers(matchers alerting.Matchers) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> MuteTimeIntervals

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) MuteTimeIntervals(muteTimeIntervals []string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> ObjectMatchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) ObjectMatchers(objectMatchers alerting.ObjectMatchers) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> Provenance

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Provenance(provenance alerting.Provenance) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> Receiver

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Receiver(receiver string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> RepeatInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) RepeatInterval(repeatInterval string) *NotificationPolicyBuilder
```

### <span class="badge object-method"></span> Routes

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```go
func (builder *NotificationPolicyBuilder) Routes(routes []cog.Builder[alerting.NotificationPolicy]) *NotificationPolicyBuilder
```

## See also

 * <span class="badge object-type-struct"></span> [NotificationPolicy](./object-NotificationPolicy.md)
