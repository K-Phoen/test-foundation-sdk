---
title: <span class="badge object-type-interface"></span> TimeInterval
---
# <span class="badge object-type-interface"></span> TimeInterval

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

## Definition

```typescript
export interface TimeInterval {
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	days_of_month?: string[];
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	location?: string;
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	months?: string[];
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	times?: alerting.TimeRange[];
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	weekdays?: string[];
	// TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained
	// within the interval.
	years?: string[];
}

```
## Methods

No methods.
## See also

 * <span class="badge builder"></span> [TimeIntervalBuilder](./builder-TimeIntervalBuilder.md)
