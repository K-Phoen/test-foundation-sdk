# alerting

## Objects

 * <span class="badge object-type-struct"></span> [ContactPoint](./object-ContactPoint.md)
 * <span class="badge object-type-enum"></span> [ContactPointType](./object-ContactPointType.md)
 * <span class="badge object-type-scalar"></span> [Duration](./object-Duration.md)
 * <span class="badge object-type-scalar"></span> [Json](./object-Json.md)
 * <span class="badge object-type-map"></span> [MatchRegexps](./object-MatchRegexps.md)
 * <span class="badge object-type-enum"></span> [MatchType](./object-MatchType.md)
 * <span class="badge object-type-struct"></span> [Matcher](./object-Matcher.md)
 * <span class="badge object-type-array"></span> [Matchers](./object-Matchers.md)
 * <span class="badge object-type-struct"></span> [MuteTiming](./object-MuteTiming.md)
 * <span class="badge object-type-struct"></span> [NotificationPolicy](./object-NotificationPolicy.md)
 * <span class="badge object-type-struct"></span> [NotificationSettings](./object-NotificationSettings.md)
 * <span class="badge object-type-struct"></span> [NotificationTemplate](./object-NotificationTemplate.md)
 * <span class="badge object-type-array"></span> [ObjectMatcher](./object-ObjectMatcher.md)
 * <span class="badge object-type-array"></span> [ObjectMatchers](./object-ObjectMatchers.md)
 * <span class="badge object-type-scalar"></span> [Provenance](./object-Provenance.md)
 * <span class="badge object-type-struct"></span> [Query](./object-Query.md)
 * <span class="badge object-type-struct"></span> [RecordRule](./object-RecordRule.md)
 * <span class="badge object-type-struct"></span> [RelativeTimeRange](./object-RelativeTimeRange.md)
 * <span class="badge object-type-struct"></span> [Rule](./object-Rule.md)
 * <span class="badge object-type-enum"></span> [RuleExecErrState](./object-RuleExecErrState.md)
 * <span class="badge object-type-struct"></span> [RuleGroup](./object-RuleGroup.md)
 * <span class="badge object-type-enum"></span> [RuleNoDataState](./object-RuleNoDataState.md)
 * <span class="badge object-type-struct"></span> [TimeInterval](./object-TimeInterval.md)
 * <span class="badge object-type-struct"></span> [TimeIntervalItem](./object-TimeIntervalItem.md)
 * <span class="badge object-type-struct"></span> [TimeIntervalTimeRange](./object-TimeIntervalTimeRange.md)
## Builders

 * <span class="badge builder"></span> [ContactPointBuilder](./builder-ContactPointBuilder.md)
 * <span class="badge builder"></span> [MatcherBuilder](./builder-MatcherBuilder.md)
 * <span class="badge builder"></span> [MuteTimingBuilder](./builder-MuteTimingBuilder.md)
 * <span class="badge builder"></span> [NotificationPolicyBuilder](./builder-NotificationPolicyBuilder.md)
 * <span class="badge builder"></span> [NotificationSettingsBuilder](./builder-NotificationSettingsBuilder.md)
 * <span class="badge builder"></span> [NotificationTemplateBuilder](./builder-NotificationTemplateBuilder.md)
 * <span class="badge builder"></span> [QueryBuilder](./builder-QueryBuilder.md)
 * <span class="badge builder"></span> [RecordRuleBuilder](./builder-RecordRuleBuilder.md)
 * <span class="badge builder"></span> [RuleBuilder](./builder-RuleBuilder.md)
 * <span class="badge builder"></span> [RuleGroupBuilder](./builder-RuleGroupBuilder.md)
 * <span class="badge builder"></span> [TimeIntervalBuilder](./builder-TimeIntervalBuilder.md)
 * <span class="badge builder"></span> [TimeIntervalItemBuilder](./builder-TimeIntervalItemBuilder.md)
 * <span class="badge builder"></span> [TimeIntervalTimeRangeBuilder](./builder-TimeIntervalTimeRangeBuilder.md)
## Functions

### <span class="badge function"></span> QueryConverter

QueryConverter accepts a `Query` object and generates the Go code to build this object using builders.

```go
func QueryConverter(input Query) string
```

### <span class="badge function"></span> RuleGroupConverter

RuleGroupConverter accepts a `RuleGroup` object and generates the Go code to build this object using builders.

```go
func RuleGroupConverter(input RuleGroup) string
```

### <span class="badge function"></span> NotificationSettingsConverter

NotificationSettingsConverter accepts a `NotificationSettings` object and generates the Go code to build this object using builders.

```go
func NotificationSettingsConverter(input NotificationSettings) string
```

### <span class="badge function"></span> ContactPointConverter

ContactPointConverter accepts a `ContactPoint` object and generates the Go code to build this object using builders.

```go
func ContactPointConverter(input ContactPoint) string
```

### <span class="badge function"></span> MatcherConverter

MatcherConverter accepts a `Matcher` object and generates the Go code to build this object using builders.

```go
func MatcherConverter(input Matcher) string
```

### <span class="badge function"></span> MuteTimingConverter

MuteTimingConverter accepts a `MuteTiming` object and generates the Go code to build this object using builders.

```go
func MuteTimingConverter(input MuteTiming) string
```

### <span class="badge function"></span> NotificationTemplateConverter

NotificationTemplateConverter accepts a `NotificationTemplate` object and generates the Go code to build this object using builders.

```go
func NotificationTemplateConverter(input NotificationTemplate) string
```

### <span class="badge function"></span> RuleConverter

RuleConverter accepts a `Rule` object and generates the Go code to build this object using builders.

```go
func RuleConverter(input Rule) string
```

### <span class="badge function"></span> RecordRuleConverter

RecordRuleConverter accepts a `RecordRule` object and generates the Go code to build this object using builders.

```go
func RecordRuleConverter(input RecordRule) string
```

### <span class="badge function"></span> NotificationPolicyConverter

NotificationPolicyConverter accepts a `NotificationPolicy` object and generates the Go code to build this object using builders.

```go
func NotificationPolicyConverter(input NotificationPolicy) string
```

### <span class="badge function"></span> TimeIntervalConverter

TimeIntervalConverter accepts a `TimeInterval` object and generates the Go code to build this object using builders.

```go
func TimeIntervalConverter(input TimeInterval) string
```

### <span class="badge function"></span> TimeIntervalItemConverter

TimeIntervalItemConverter accepts a `TimeIntervalItem` object and generates the Go code to build this object using builders.

```go
func TimeIntervalItemConverter(input TimeIntervalItem) string
```

### <span class="badge function"></span> TimeIntervalTimeRangeConverter

TimeIntervalTimeRangeConverter accepts a `TimeIntervalTimeRange` object and generates the Go code to build this object using builders.

```go
func TimeIntervalTimeRangeConverter(input TimeIntervalTimeRange) string
```
