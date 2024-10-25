---
title: <span class="badge object-type-class"></span> TimeInterval
---
# <span class="badge object-type-class"></span> TimeInterval

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

## Definition

```php
class TimeInterval implements \JsonSerializable
{
    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     * @var array<string>|null
     */
    public ?array $daysOfMonth;

    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     */
    public ?string $location;

    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     * @var array<string>|null
     */
    public ?array $months;

    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     * @var array<\Grafana\Foundation\Alerting\TimeRange>|null
     */
    public ?array $times;

    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     * @var array<string>|null
     */
    public ?array $weekdays;

    /**
     * TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
     * within the interval.
     * @var array<string>|null
     */
    public ?array $years;

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

 * <span class="badge builder"></span> [TimeIntervalBuilder](./builder-TimeIntervalBuilder.md)
