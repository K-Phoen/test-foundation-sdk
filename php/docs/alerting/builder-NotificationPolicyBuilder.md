---
title: <span class="badge builder"></span> NotificationPolicyBuilder
---
# <span class="badge builder"></span> NotificationPolicyBuilder

## Constructor

```php
new NotificationPolicyBuilder()
```
## Methods

### <span class="badge object-method"></span> build

Builds the object.

```php
build()
```

### <span class="badge object-method"></span> continue

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
continue(bool $continue)
```

### <span class="badge object-method"></span> groupBy

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<string> $groupBy

```php
groupBy(array $groupBy)
```

### <span class="badge object-method"></span> groupInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
groupInterval(string $groupInterval)
```

### <span class="badge object-method"></span> groupWait

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
groupWait(string $groupWait)
```

### <span class="badge object-method"></span> match

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<string, string> $match

```php
match(array $match)
```

### <span class="badge object-method"></span> matchRe

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<string, mixed> $matchRe

```php
matchRe(array $matchRe)
```

### <span class="badge object-method"></span> matchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<\Grafana\Foundation\Cog\Builder<\Grafana\Foundation\Alerting\Matcher>> $matchers

```php
matchers(array $matchers)
```

### <span class="badge object-method"></span> muteTimeIntervals

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<string> $muteTimeIntervals

```php
muteTimeIntervals(array $muteTimeIntervals)
```

### <span class="badge object-method"></span> objectMatchers

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<\Grafana\Foundation\Cog\Builder<\Grafana\Foundation\Alerting\Matcher>> $objectMatchers

```php
objectMatchers(array $objectMatchers)
```

### <span class="badge object-method"></span> provenance

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
provenance(string $provenance)
```

### <span class="badge object-method"></span> receiver

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
receiver(string $receiver)
```

### <span class="badge object-method"></span> repeatInterval

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

```php
repeatInterval(string $repeatInterval)
```

### <span class="badge object-method"></span> routes

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

@param array<\Grafana\Foundation\Cog\Builder<\Grafana\Foundation\Alerting\NotificationPolicy>> $routes

```php
routes(array $routes)
```

## See also

 * <span class="badge object-type-class"></span> [NotificationPolicy](./object-NotificationPolicy.md)
