---
title: <span class="badge object-type-class"></span> NotificationPolicy
---
# <span class="badge object-type-class"></span> NotificationPolicy

A Route is a node that contains definitions of how to handle alerts. This is modified

from the upstream alertmanager in that it adds the ObjectMatchers property.

## Definition

```php
class NotificationPolicy implements \JsonSerializable
{
    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public ?bool $continue;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<string>|null
     */
    public ?array $groupBy;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public ?string $groupInterval;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public ?string $groupWait;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<string, string>|null
     */
    public ?array $match;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<string, mixed>
     */
    public array $matchRe;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<\Grafana\Foundation\Alerting\Matcher>
     */
    public array $matchers;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<string>|null
     */
    public ?array $muteTimeIntervals;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<\Grafana\Foundation\Alerting\Matcher>
     */
    public array $objectMatchers;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public string $provenance;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public ?string $receiver;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     */
    public ?string $repeatInterval;

    /**
     * A Route is a node that contains definitions of how to handle alerts. This is modified
     * from the upstream alertmanager in that it adds the ObjectMatchers property.
     * @var array<\Grafana\Foundation\Alerting\NotificationPolicy>|null
     */
    public ?array $routes;

}
```
## Methods

### <span class="badge object-method"></span> fromArray

Builds this object from an array.

This function is meant to be used with the return value of `json_decode($json, true)`.

```php
static fromArray(array $inputData)
```

### <span class="badge object-method"></span> jsonSerialize

Returns the data representing this object, preparing it for JSON serialization with `json_encode()`.

```php
jsonSerialize()
```

## See also

 * <span class="badge builder"></span> [NotificationPolicyBuilder](./builder-NotificationPolicyBuilder.md)
