---
title: <span class="badge object-type-interface"></span> ContactPoint
---
# <span class="badge object-type-interface"></span> ContactPoint

EmbeddedContactPoint is the contact point type that is used

by grafanas embedded alertmanager implementation.

## Definition

```typescript
export interface ContactPoint {
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	disableResolveMessage?: boolean;
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	name?: string;
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	provenance?: string;
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	settings: alerting.Json;
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	type: "alertmanager" | " dingding" | " discord" | " email" | " googlechat" | " kafka" | " line" | " opsgenie" | " pagerduty" | " pushover" | " sensugo" | " slack" | " teams" | " telegram" | " threema" | " victorops" | " webhook" | " wecom";
	// EmbeddedContactPoint is the contact point type that is used
	// by grafanas embedded alertmanager implementation.
	uid?: string;
}

```
## Methods

No methods.
## See also

 * <span class="badge builder"></span> [ContactPointBuilder](./builder-ContactPointBuilder.md)
