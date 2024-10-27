---
title: <span class="badge builder"></span> TimeIntervalBuilder
---
# <span class="badge builder"></span> TimeIntervalBuilder

## Constructor

```go
func NewTimeIntervalBuilder() *TimeIntervalBuilder
```
## Methods

### <span class="badge object-method"></span> Build

Builds the object.

```go
func (builder *TimeIntervalBuilder) Build() (TimeInterval, error)
```

### <span class="badge object-method"></span> DaysOfMonth

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) DaysOfMonth(daysOfMonth []string) *TimeIntervalBuilder
```

### <span class="badge object-method"></span> Location

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) Location(location string) *TimeIntervalBuilder
```

### <span class="badge object-method"></span> Months

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) Months(months []string) *TimeIntervalBuilder
```

### <span class="badge object-method"></span> Times

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) Times(times []cog.Builder[alerting.TimeRange]) *TimeIntervalBuilder
```

### <span class="badge object-method"></span> Weekdays

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) Weekdays(weekdays []string) *TimeIntervalBuilder
```

### <span class="badge object-method"></span> Years

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```go
func (builder *TimeIntervalBuilder) Years(years []string) *TimeIntervalBuilder
```

## See also

 * <span class="badge object-type-struct"></span> [TimeInterval](./object-TimeInterval.md)
