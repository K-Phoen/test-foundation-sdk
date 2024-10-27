---
title: <span class="badge builder"></span> NotificationSettingsBuilder
---
# <span class="badge builder"></span> NotificationSettingsBuilder

## Constructor

```go
func NewNotificationSettingsBuilder() *NotificationSettingsBuilder
```
## Methods

### <span class="badge object-method"></span> Build

Builds the object.

```go
func (builder *NotificationSettingsBuilder) Build() (NotificationSettings, error)
```

### <span class="badge object-method"></span> GroupBy

```go
func (builder *NotificationSettingsBuilder) GroupBy(groupBy []string) *NotificationSettingsBuilder
```

### <span class="badge object-method"></span> GroupInterval

```go
func (builder *NotificationSettingsBuilder) GroupInterval(groupInterval string) *NotificationSettingsBuilder
```

### <span class="badge object-method"></span> GroupWait

```go
func (builder *NotificationSettingsBuilder) GroupWait(groupWait string) *NotificationSettingsBuilder
```

### <span class="badge object-method"></span> MuteTimeIntervals

```go
func (builder *NotificationSettingsBuilder) MuteTimeIntervals(muteTimeIntervals []string) *NotificationSettingsBuilder
```

### <span class="badge object-method"></span> Receiver

```go
func (builder *NotificationSettingsBuilder) Receiver(receiver string) *NotificationSettingsBuilder
```

### <span class="badge object-method"></span> RepeatInterval

```go
func (builder *NotificationSettingsBuilder) RepeatInterval(repeatInterval string) *NotificationSettingsBuilder
```

## See also

 * <span class="badge object-type-struct"></span> [NotificationSettings](./object-NotificationSettings.md)
