---
title: <span class="badge builder"></span> TimeInterval
---
# <span class="badge builder"></span> TimeInterval

## Constructor

```python
TimeInterval()
```
## Methods

### <span class="badge object-method"></span> build

Builds the object.

```python
def build() -> alerting.TimeInterval
```

### <span class="badge object-method"></span> days_of_month

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def days_of_month(days_of_month: list[str]) -> typing.Self
```

### <span class="badge object-method"></span> location

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def location(location: str) -> typing.Self
```

### <span class="badge object-method"></span> months

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def months(months: list[str]) -> typing.Self
```

### <span class="badge object-method"></span> times

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def times(times: list[cogbuilder.Builder[alerting.TimeRange]]) -> typing.Self
```

### <span class="badge object-method"></span> weekdays

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def weekdays(weekdays: list[str]) -> typing.Self
```

### <span class="badge object-method"></span> years

TimeInterval describes intervals of time. ContainsTime will tell you if a golang time is contained

within the interval.

```python
def years(years: list[str]) -> typing.Self
```

## See also

 * <span class="badge object-type-class"></span> [TimeInterval](./object-TimeInterval.md)
