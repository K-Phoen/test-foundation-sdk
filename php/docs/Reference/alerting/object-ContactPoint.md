---
title: <span class="badge object-type-class"></span> ContactPoint
---
# <span class="badge object-type-class"></span> ContactPoint

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

## Definition

```php
class ContactPoint implements \JsonSerializable
{
    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     */
    public ?bool $disableResolveMessage;

    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     */
    public ?string $name;

    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     */
    public ?string $provenance;

    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     * @var mixed
     */
    public $settings;

    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     */
    public \Grafana\Foundation\Alerting\ContactPointType $type;

    /**
     * EmbeddedContactPoint is the contact point type that is used
     * by grafanas embedded alertmanager implementation.
     */
    public ?string $uid;

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

 * <span class="badge builder"></span> [ContactPointBuilder](./builder-ContactPointBuilder.md)
