---
title: <span class="badge object-type-class"></span> ExprTypeClassicConditionsResultAssertions
---
# <span class="badge object-type-class"></span> ExprTypeClassicConditionsResultAssertions

## Definition

```php
class ExprTypeClassicConditionsResultAssertions implements \JsonSerializable
{
    /**
     * Maximum frame count
     */
    public ?int $maxFrames;

    /**
     * Type asserts that the frame matches a known type structure.
     * Possible enum values:
     *  - `""` 
     *  - `"timeseries-wide"` 
     *  - `"timeseries-long"` 
     *  - `"timeseries-many"` 
     *  - `"timeseries-multi"` 
     *  - `"directory-listing"` 
     *  - `"table"` 
     *  - `"numeric-wide"` 
     *  - `"numeric-multi"` 
     *  - `"numeric-long"` 
     *  - `"log-lines"` 
     */
    public ?\Grafana\Foundation\Expr\TypeClassicConditionsType $type;

    /**
     * TypeVersion is the version of the Type property. Versions greater than 0.0 correspond to the dataplane
     * contract documentation https://grafana.github.io/dataplane/contract/.
     * @var array<int>
     */
    public array $typeVersion;

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

 * <span class="badge builder"></span> [ExprTypeClassicConditionsResultAssertionsBuilder](./builder-ExprTypeClassicConditionsResultAssertionsBuilder.md)