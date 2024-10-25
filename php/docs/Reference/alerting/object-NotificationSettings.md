---
title: <span class="badge object-type-class"></span> NotificationSettings
---
# <span class="badge object-type-class"></span> NotificationSettings

## Definition

```php
class NotificationSettings implements \JsonSerializable
{
    /**
     * @var array<string>|null
     */
    public ?array $groupBy;

    public ?string $groupInterval;

    public ?string $groupWait;

    /**
     * @var array<string>|null
     */
    public ?array $muteTimeIntervals;

    public string $receiver;

    public ?string $repeatInterval;

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

 * <span class="badge builder"></span> [NotificationSettingsBuilder](./builder-NotificationSettingsBuilder.md)
