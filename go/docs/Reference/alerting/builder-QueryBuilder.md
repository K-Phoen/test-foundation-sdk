---
title: <span class="badge builder"></span> QueryBuilder
---
# <span class="badge builder"></span> QueryBuilder

## Constructor

```go
func NewQueryBuilder(refId string) *QueryBuilder
```
## Methods

### <span class="badge object-method"></span> Build

Builds the object.

```go
func (builder *QueryBuilder) Build() (Query, error)
```

### <span class="badge object-method"></span> DatasourceUid

```go
func (builder *QueryBuilder) DatasourceUid(datasourceUid string) *QueryBuilder
```

### <span class="badge object-method"></span> Model

```go
func (builder *QueryBuilder) Model(model cog.Builder[cog/variants.Dataquery]) *QueryBuilder
```

### <span class="badge object-method"></span> QueryType

```go
func (builder *QueryBuilder) QueryType(queryType string) *QueryBuilder
```

### <span class="badge object-method"></span> RefId

```go
func (builder *QueryBuilder) RefId(refId string) *QueryBuilder
```

### <span class="badge object-method"></span> RelativeTimeRange

```go
func (builder *QueryBuilder) RelativeTimeRange(from alerting.Duration, to alerting.Duration) *QueryBuilder
```

## See also

 * <span class="badge object-type-struct"></span> [Query](./object-Query.md)
