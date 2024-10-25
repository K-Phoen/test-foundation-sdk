---
title: <span class="badge object-type-class"></span> Query
---
# <span class="badge object-type-class"></span> Query

## Definition

```php
class Query implements \JsonSerializable
{
    public ?string $datasourceUid;

    /**
     * @var \Grafana\Foundation\Cog\Dataquery|null
     */
    public ?\Grafana\Foundation\Cog\Dataquery $model;

    public ?string $queryType;

    public ?string $refId;

    public ?\Grafana\Foundation\Alerting\RelativeTimeRange $relativeTimeRange;

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

 * <span class="badge builder"></span> [QueryBuilder](./builder-QueryBuilder.md)
