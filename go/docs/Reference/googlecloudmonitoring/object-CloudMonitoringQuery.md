---
title: <span class="badge object-type-struct"></span> CloudMonitoringQuery
---
# <span class="badge object-type-struct"></span> CloudMonitoringQuery

## Definition

```go
type CloudMonitoringQuery struct {
    // A unique identifier for the query within the list of targets.
    // In server side expressions, the refId is used as a variable name to identify results.
    // By default, the UI will assign A->Z; however setting meaningful names may be useful.
    RefId string `json:"refId"`
    // If hide is set to true, Grafana will filter out the response(s) associated with this query before returning it to the panel.
    Hide *bool `json:"hide,omitempty"`
    // Specify the query flavor
    // TODO make this required and give it a default
    QueryType *string `json:"queryType,omitempty"`
    // Aliases can be set to modify the legend labels. e.g. {{metric.label.xxx}}. See docs for more detail.
    AliasBy *string `json:"aliasBy,omitempty"`
    // GCM query type.
    // queryType: #QueryType
    // Time Series List sub-query properties.
    TimeSeriesList *googlecloudmonitoring.TimeSeriesList `json:"timeSeriesList,omitempty"`
    // Time Series sub-query properties.
    TimeSeriesQuery *googlecloudmonitoring.TimeSeriesQuery `json:"timeSeriesQuery,omitempty"`
    // SLO sub-query properties.
    SloQuery *googlecloudmonitoring.SLOQuery `json:"sloQuery,omitempty"`
    // PromQL sub-query properties.
    PromQLQuery *googlecloudmonitoring.PromQLQuery `json:"promQLQuery,omitempty"`
    // For mixed data sources the selected datasource is on the query level.
    // For non mixed scenarios this is undefined.
    // TODO find a better way to do this ^ that's friendly to schema
    // TODO this shouldn't be unknown but DataSourceRef | null
    Datasource *dashboard.DataSourceRef `json:"datasource,omitempty"`
    // Time interval in milliseconds.
    IntervalMs *float64 `json:"intervalMs,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `CloudMonitoringQuery` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (cloudMonitoringQuery *CloudMonitoringQuery) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `CloudMonitoringQuery` objects.

```go
func (cloudMonitoringQuery *CloudMonitoringQuery) Equals(other CloudMonitoringQuery) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `CloudMonitoringQuery` fields for violations and returns them.

```go
func (cloudMonitoringQuery *CloudMonitoringQuery) Validate() error
```

## See also

 * <span class="badge builder"></span> [CloudMonitoringQueryBuilder](./builder-CloudMonitoringQueryBuilder.md)