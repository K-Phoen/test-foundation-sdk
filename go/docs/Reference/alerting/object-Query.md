---
title: <span class="badge object-type-struct"></span> Query
---
# <span class="badge object-type-struct"></span> Query

## Definition

```go
type Query struct {
    DatasourceUid *string `json:"datasourceUid,omitempty"`
    Model cog/variants.Dataquery `json:"model,omitempty"`
    QueryType *string `json:"queryType,omitempty"`
    RefId *string `json:"refId,omitempty"`
    RelativeTimeRange *alerting.RelativeTimeRange `json:"relativeTimeRange,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> UnmarshalJSON

UnmarshalJSON implements a custom JSON unmarshalling logic to decode `Query` from JSON.

```go
func (query *Query) UnmarshalJSON(raw []byte) error
```

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `Query` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (query *Query) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `Query` objects.

```go
func (query *Query) Equals(other Query) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `Query` fields for violations and returns them.

```go
func (query *Query) Validate() error
```

## See also

 * <span class="badge builder"></span> [QueryBuilder](./builder-QueryBuilder.md)
