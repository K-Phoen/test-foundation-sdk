---
title: <span class="badge builder"></span> DataqueryBuilder
---
# <span class="badge builder"></span> DataqueryBuilder

## Constructor

```typescript
new DataqueryBuilder()
```
## Methods

### <span class="badge object-method"></span> build

Builds the object.

```typescript
build()
```

### <span class="badge object-method"></span> datasource

For mixed data sources the selected datasource is on the query level.

For non mixed scenarios this is undefined.

TODO find a better way to do this ^ that's friendly to schema

TODO this shouldn't be unknown but DataSourceRef | null

```typescript
datasource(datasource: dashboard.DataSourceRef)
```

### <span class="badge object-method"></span> groupBy

Allows to group the results.

```typescript
groupBy(groupBy: string[])
```

### <span class="badge object-method"></span> hide

If hide is set to true, Grafana will filter out the response(s) associated with this query before returning it to the panel.

```typescript
hide(hide: boolean)
```

### <span class="badge object-method"></span> labelSelector

Specifies the query label selectors.

```typescript
labelSelector(labelSelector: string)
```

### <span class="badge object-method"></span> maxNodes

Sets the maximum number of nodes in the flamegraph.

```typescript
maxNodes(maxNodes: number)
```

### <span class="badge object-method"></span> profileTypeId

Specifies the type of profile to query.

```typescript
profileTypeId(profileTypeId: string)
```

### <span class="badge object-method"></span> queryType

Specify the query flavor

TODO make this required and give it a default

```typescript
queryType(queryType: string)
```

### <span class="badge object-method"></span> refId

A unique identifier for the query within the list of targets.

In server side expressions, the refId is used as a variable name to identify results.

By default, the UI will assign A->Z; however setting meaningful names may be useful.

```typescript
refId(refId: string)
```

### <span class="badge object-method"></span> spanSelector

Specifies the query span selectors.

```typescript
spanSelector(spanSelector: string[])
```

## See also

 * <span class="badge object-type-interface"></span> [dataquery](./object-dataquery.md)