---
title: <span class="badge object-type-class"></span> XYDimensionConfig
---
# <span class="badge object-type-class"></span> XYDimensionConfig

Configuration for the Table/Auto mode

## Definition

```php
class XYDimensionConfig implements \JsonSerializable
{
    public int $frame;

    public ?string $x;

    /**
     * @var array<string>|null
     */
    public ?array $exclude;

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

 * <span class="badge builder"></span> [XYDimensionConfigBuilder](./builder-XYDimensionConfigBuilder.md)