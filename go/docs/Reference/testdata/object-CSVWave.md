---
title: <span class="badge object-type-struct"></span> CSVWave
---
# <span class="badge object-type-struct"></span> CSVWave

## Definition

```go
type CSVWave struct {
    Labels *string `json:"labels,omitempty"`
    Name *string `json:"name,omitempty"`
    TimeStep *int64 `json:"timeStep,omitempty"`
    ValuesCSV *string `json:"valuesCSV,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `CSVWave` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (cSVWave *CSVWave) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `CSVWave` objects.

```go
func (cSVWave *CSVWave) Equals(other CSVWave) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `CSVWave` fields for violations and returns them.

```go
func (cSVWave *CSVWave) Validate() error
```

## See also

 * <span class="badge builder"></span> [CSVWaveBuilder](./builder-CSVWaveBuilder.md)