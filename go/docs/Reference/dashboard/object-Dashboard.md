---
title: <span class="badge object-type-struct"></span> Dashboard
---
# <span class="badge object-type-struct"></span> Dashboard

## Definition

```go
type Dashboard struct {
    // Unique numeric identifier for the dashboard.
    // `id` is internal to a specific Grafana instance. `uid` should be used to identify a dashboard across Grafana instances.
    Id *int64 `json:"id,omitempty"`
    // Unique dashboard identifier that can be generated by anyone. string (8-40)
    Uid *string `json:"uid,omitempty"`
    // Title of dashboard.
    Title *string `json:"title,omitempty"`
    // Description of dashboard.
    Description *string `json:"description,omitempty"`
    // This property should only be used in dashboards defined by plugins.  It is a quick check
    // to see if the version has changed since the last time.
    Revision *int64 `json:"revision,omitempty"`
    // ID of a dashboard imported from the https://grafana.com/grafana/dashboards/ portal
    GnetId *string `json:"gnetId,omitempty"`
    // Tags associated with dashboard.
    Tags []string `json:"tags,omitempty"`
    // Timezone of dashboard. Accepted values are IANA TZDB zone ID or "browser" or "utc".
    Timezone *string `json:"timezone,omitempty"`
    // Whether a dashboard is editable or not.
    Editable *bool `json:"editable,omitempty"`
    // Configuration of dashboard cursor sync behavior.
    // Accepted values are 0 (sync turned off), 1 (shared crosshair), 2 (shared crosshair and tooltip).
    GraphTooltip *dashboard.DashboardCursorSync `json:"graphTooltip,omitempty"`
    // Time range for dashboard.
    // Accepted values are relative time strings like {from: 'now-6h', to: 'now'} or absolute time strings like {from: '2020-07-10T08:00:00.000Z', to: '2020-07-10T14:00:00.000Z'}.
    Time *dashboard.DashboardDashboardTime `json:"time,omitempty"`
    // Configuration of the time picker shown at the top of a dashboard.
    Timepicker *dashboard.TimePickerConfig `json:"timepicker,omitempty"`
    // The month that the fiscal year starts on.  0 = January, 11 = December
    FiscalYearStartMonth *uint8 `json:"fiscalYearStartMonth,omitempty"`
    // When set to true, the dashboard will redraw panels at an interval matching the pixel width.
    // This will keep data "moving left" regardless of the query refresh rate. This setting helps
    // avoid dashboards presenting stale live data
    LiveNow *bool `json:"liveNow,omitempty"`
    // Day when the week starts. Expressed by the name of the day in lowercase, e.g. "monday".
    WeekStart *string `json:"weekStart,omitempty"`
    // Refresh rate of dashboard. Represented via interval string, e.g. "5s", "1m", "1h", "1d".
    Refresh *string `json:"refresh,omitempty"`
    // Version of the JSON schema, incremented each time a Grafana update brings
    // changes to said schema.
    SchemaVersion uint16 `json:"schemaVersion"`
    // Version of the dashboard, incremented each time the dashboard is updated.
    Version *uint32 `json:"version,omitempty"`
    // List of dashboard panels
    Panels []dashboard.PanelOrRowPanel `json:"panels,omitempty"`
    // Configured template variables
    Templating dashboard.DashboardDashboardTemplating `json:"templating"`
    // Contains the list of annotations that are associated with the dashboard.
    // Annotations are used to overlay event markers and overlay event tags on graphs.
    // Grafana comes with a native annotation store and the ability to add annotation events directly from the graph panel or via the HTTP API.
    // See https://grafana.com/docs/grafana/latest/dashboards/build-dashboards/annotate-visualizations/
    Annotations dashboard.AnnotationContainer `json:"annotations"`
    // Links with references to other dashboards or external websites.
    Links []dashboard.DashboardLink `json:"links,omitempty"`
    // Snapshot options. They are present only if the dashboard is a snapshot.
    Snapshot *dashboard.Snapshot `json:"snapshot,omitempty"`
    // When set to true, the dashboard will load all panels in the dashboard when it's loaded.
    Preload *bool `json:"preload,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `Dashboard` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (dashboard *Dashboard) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `Dashboard` objects.

```go
func (dashboard *Dashboard) Equals(other Dashboard) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `Dashboard` fields for violations and returns them.

```go
func (dashboard *Dashboard) Validate() error
```

## Examples

### Marshalling to JSON

```go
package main

import (
    "encoding/json"
    "fmt"
    "os"

    "github.com/grafana/grafana-foundation-sdk/go/cog"
    "github.com/grafana/grafana-foundation-sdk/go/dashboard"
)

func main() {
    sampleDashboard := &dashboard.Dashboard{
        Uid: cog.ToPtr("sample-dashboard-uid"),
        Title: cog.ToPtr("Sample dashboard"),
    }

    dashboardJson, err := json.MarshalIndent(sampleDashboard, "", "  ")
    if err != nil {
        panic(err)
    }

    fmt.Println(string(dashboardJson))
}
```

### Unmarshalling from JSON

```go
package main

import (
    "encoding/json"
    "fmt"
    "os"

    "github.com/grafana/grafana-foundation-sdk/go/cog/plugins"
    "github.com/grafana/grafana-foundation-sdk/go/dashboard"
)

func main() {
    // Required to correctly unmarshal panels and dataqueries
    plugins.RegisterDefaultPlugins()

    dashboardJSON, err := os.ReadFile("dashboard.json")
    if err != nil {
        panic(err)
    }

    sampleDashboard := &dashboard.Dashboard{}
    if err := json.Unmarshal(dashboardJSON, sampleDashboard); err != nil {
        panic(fmt.Sprintf("%s", err))
    }

    fmt.Printf("%#v\n", sampleDashboard)
}
```
## See also

 * <span class="badge builder"></span> [DashboardBuilder](./builder-DashboardBuilder.md)