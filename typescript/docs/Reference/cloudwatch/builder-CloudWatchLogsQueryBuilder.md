---
title: <span class="badge builder"></span> CloudWatchLogsQueryBuilder
---
# <span class="badge builder"></span> CloudWatchLogsQueryBuilder

## Constructor

```typescript
new CloudWatchLogsQueryBuilder()
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

### <span class="badge object-method"></span> expression

The CloudWatch Logs Insights query to execute

```typescript
expression(expression: string)
```

### <span class="badge object-method"></span> hide

If hide is set to true, Grafana will filter out the response(s) associated with this query before returning it to the panel.

```typescript
hide(hide: boolean)
```

### <span class="badge object-method"></span> id

```typescript
id(id: string)
```

### <span class="badge object-method"></span> logGroupNames

@deprecated use logGroups

```typescript
logGroupNames(logGroupNames: string[])
```

### <span class="badge object-method"></span> logGroups

Log groups to query

```typescript
logGroups(logGroups: cog.Builder<cloudwatch.LogGroup>[])
```

### <span class="badge object-method"></span> queryMode

Whether a query is a Metrics, Logs, or Annotations query

```typescript
queryMode(queryMode: cloudwatch.CloudWatchQueryMode)
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

### <span class="badge object-method"></span> region

AWS region to query for the logs

```typescript
region(region: string)
```

### <span class="badge object-method"></span> statsGroups

Fields to group the results by, this field is automatically populated whenever the query is updated

```typescript
statsGroups(statsGroups: string[])
```

## See also

 * <span class="badge object-type-interface"></span> [CloudWatchLogsQuery](./object-CloudWatchLogsQuery.md)