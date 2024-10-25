---
title: <span class="badge object-type-struct"></span> NotificationSettings
---
# <span class="badge object-type-struct"></span> NotificationSettings

## Definition

```go
type NotificationSettings struct {
    GroupBy []string `json:"group_by,omitempty"`
    GroupInterval *string `json:"group_interval,omitempty"`
    GroupWait *string `json:"group_wait,omitempty"`
    MuteTimeIntervals []string `json:"mute_time_intervals,omitempty"`
    Receiver string `json:"receiver"`
    RepeatInterval *string `json:"repeat_interval,omitempty"`
}
```
## Methods

### <span class="badge object-method"></span> UnmarshalJSONStrict

UnmarshalJSONStrict implements a custom JSON unmarshalling logic to decode `NotificationSettings` from JSON.

Note: the unmarshalling done by this function is strict. It will fail over required fields being absent from the input, fields having an incorrect type, unexpected fields being present, …

```go
func (notificationSettings *NotificationSettings) UnmarshalJSONStrict(raw []byte) error
```

### <span class="badge object-method"></span> Equals

Equals tests the equality of two `NotificationSettings` objects.

```go
func (notificationSettings *NotificationSettings) Equals(other NotificationSettings) bool
```

### <span class="badge object-method"></span> Validate

Validate checks all the validation constraints that may be defined on `NotificationSettings` fields for violations and returns them.

```go
func (notificationSettings *NotificationSettings) Validate() error
```

## See also

 * <span class="badge builder"></span> [NotificationSettingsBuilder](./builder-NotificationSettingsBuilder.md)
