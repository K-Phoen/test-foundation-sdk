---
title: <span class="badge builder"></span> NotificationPolicyBuilder
---
# <span class="badge builder"></span> NotificationPolicyBuilder

## Constructor

```typescript
new NotificationPolicyBuilder()
```
## Methods

### <span class="badge object-method"></span> build

Builds the object.

```typescript
build()
```

### <span class="badge object-method"></span> continueVal

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
continueVal(continueVal: boolean)
```

### <span class="badge object-method"></span> groupBy

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
groupBy(groupBy: string[])
```

### <span class="badge object-method"></span> groupInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
groupInterval(groupInterval: string)
```

### <span class="badge object-method"></span> groupWait

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
groupWait(groupWait: string)
```

### <span class="badge object-method"></span> match

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
match(match: Record<string, string>)
```

### <span class="badge object-method"></span> matchRe

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
matchRe(matchRe: alerting.MatchRegexps)
```

### <span class="badge object-method"></span> matchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
matchers(matchers: alerting.Matchers)
```

### <span class="badge object-method"></span> muteTimeIntervals

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
muteTimeIntervals(muteTimeIntervals: string[])
```

### <span class="badge object-method"></span> objectMatchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
objectMatchers(objectMatchers: alerting.ObjectMatchers)
```

### <span class="badge object-method"></span> provenance

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
provenance(provenance: alerting.Provenance)
```

### <span class="badge object-method"></span> receiver

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
receiver(receiver: string)
```

### <span class="badge object-method"></span> repeatInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
repeatInterval(repeatInterval: string)
```

### <span class="badge object-method"></span> routes

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```typescript
routes(routes: cog.Builder<alerting.NotificationPolicy>[])
```

## See also

 * <span class="badge object-type-interface"></span> [NotificationPolicy](./object-NotificationPolicy.md)
