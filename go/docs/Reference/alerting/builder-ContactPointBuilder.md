---
title: <span class="badge builder"></span> ContactPointBuilder
---
# <span class="badge builder"></span> ContactPointBuilder

## Constructor

```go
func NewContactPointBuilder() *ContactPointBuilder
```
## Methods

### <span class="badge object-method"></span> Build

Builds the object.

```go
func (builder *ContactPointBuilder) Build() (ContactPoint, error)
```

### <span class="badge object-method"></span> DisableResolveMessage

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) DisableResolveMessage(disableResolveMessage bool) *ContactPointBuilder
```

### <span class="badge object-method"></span> Name

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) Name(name string) *ContactPointBuilder
```

### <span class="badge object-method"></span> Provenance

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) Provenance(provenance string) *ContactPointBuilder
```

### <span class="badge object-method"></span> Settings

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) Settings(settings alerting.Json) *ContactPointBuilder
```

### <span class="badge object-method"></span> Type

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) Type(typeArg alerting.ContactPointType) *ContactPointBuilder
```

### <span class="badge object-method"></span> Uid

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

```go
func (builder *ContactPointBuilder) Uid(uid string) *ContactPointBuilder
```

## See also

 * <span class="badge object-type-struct"></span> [ContactPoint](./object-ContactPoint.md)
