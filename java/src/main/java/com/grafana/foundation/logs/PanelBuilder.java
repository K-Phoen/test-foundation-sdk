// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.logs;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.grafana.foundation.common.LogsSortOrder;
import com.grafana.foundation.common.LogsDedupStrategy;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;
import com.grafana.foundation.dashboard.Panel;
import com.grafana.foundation.cog.variants.Dataquery;
import java.util.LinkedList;
import com.grafana.foundation.dashboard.DataSourceRef;
import com.grafana.foundation.dashboard.GridPos;
import com.grafana.foundation.dashboard.DashboardLink;
import com.grafana.foundation.dashboard.PanelRepeatDirection;
import com.grafana.foundation.dashboard.DataTransformerConfig;
import com.grafana.foundation.dashboard.LibraryPanelRef;
import com.grafana.foundation.dashboard.ValueMapping;
import com.grafana.foundation.dashboard.ThresholdsConfig;
import com.grafana.foundation.dashboard.FieldColor;
import com.grafana.foundation.dashboard.DashboardFieldConfigSourceOverrides;

public class PanelBuilder implements com.grafana.foundation.cog.Builder<Panel> {
    private Panel internal;

    public PanelBuilder() {
        this.internal = new Panel();
    this.internal.type = "logs";
        this.transparent(false);
        this.height(9);
        this.span(12);
    }
    public PanelBuilder id(Integer id) {
    this.internal.id = id;
        return this;
    }
    public PanelBuilder targets(com.grafana.foundation.cog.Builder<List<Dataquery>> targets) {
    this.internal.targets = targets.build();
        return this;
    }
    public PanelBuilder withTarget(com.grafana.foundation.cog.Builder<Dataquery> targets) {
		if (this.internal.targets == null) {
			this.internal.targets = new LinkedList<>();
		}
    this.internal.targets.add(targets.build());
        return this;
    }
    public PanelBuilder title(String title) {
    this.internal.title = title;
        return this;
    }
    public PanelBuilder description(String description) {
    this.internal.description = description;
        return this;
    }
    public PanelBuilder transparent(Boolean transparent) {
    this.internal.transparent = transparent;
        return this;
    }
    public PanelBuilder datasource(DataSourceRef datasource) {
    this.internal.datasource = datasource;
        return this;
    }
    public PanelBuilder gridPos(GridPos gridPos) {
    this.internal.gridPos = gridPos;
        return this;
    }
    public PanelBuilder height(Integer h) {
        if (!(h > 0)) {
            throw new IllegalArgumentException("h must be > 0");
        }
		if (this.internal.gridPos == null) {
			this.internal.gridPos = new com.grafana.foundation.dashboard.GridPos();
		}
    this.internal.gridPos.h = h;
        return this;
    }
    public PanelBuilder span(Integer w) {
        if (!(w > 0)) {
            throw new IllegalArgumentException("w must be > 0");
        }
        if (!(w <= 24)) {
            throw new IllegalArgumentException("w must be <= 24");
        }
		if (this.internal.gridPos == null) {
			this.internal.gridPos = new com.grafana.foundation.dashboard.GridPos();
		}
    this.internal.gridPos.w = w;
        return this;
    }
    public PanelBuilder links(com.grafana.foundation.cog.Builder<List<DashboardLink>> links) {
    this.internal.links = links.build();
        return this;
    }
    public PanelBuilder repeat(String repeat) {
    this.internal.repeat = repeat;
        return this;
    }
    public PanelBuilder repeatDirection(PanelRepeatDirection repeatDirection) {
    this.internal.repeatDirection = repeatDirection;
        return this;
    }
    public PanelBuilder maxPerRow(Double maxPerRow) {
    this.internal.maxPerRow = maxPerRow;
        return this;
    }
    public PanelBuilder maxDataPoints(Double maxDataPoints) {
    this.internal.maxDataPoints = maxDataPoints;
        return this;
    }
    public PanelBuilder transformations(List<DataTransformerConfig> transformations) {
    this.internal.transformations = transformations;
        return this;
    }
    public PanelBuilder withTransformation(DataTransformerConfig transformations) {
		if (this.internal.transformations == null) {
			this.internal.transformations = new LinkedList<>();
		}
    this.internal.transformations.add(transformations);
        return this;
    }
    public PanelBuilder interval(String interval) {
    this.internal.interval = interval;
        return this;
    }
    public PanelBuilder timeFrom(String timeFrom) {
    this.internal.timeFrom = timeFrom;
        return this;
    }
    public PanelBuilder timeShift(String timeShift) {
    this.internal.timeShift = timeShift;
        return this;
    }
    public PanelBuilder hideTimeOverride(Boolean hideTimeOverride) {
    this.internal.hideTimeOverride = hideTimeOverride;
        return this;
    }
    public PanelBuilder libraryPanel(LibraryPanelRef libraryPanel) {
    this.internal.libraryPanel = libraryPanel;
        return this;
    }
    public PanelBuilder cacheTimeout(String cacheTimeout) {
    this.internal.cacheTimeout = cacheTimeout;
        return this;
    }
    public PanelBuilder queryCachingTTL(Double queryCachingTTL) {
    this.internal.queryCachingTTL = queryCachingTTL;
        return this;
    }
    public PanelBuilder displayName(String displayName) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.displayName = displayName;
        return this;
    }
    public PanelBuilder unit(String unit) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.unit = unit;
        return this;
    }
    public PanelBuilder decimals(Double decimals) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.decimals = decimals;
        return this;
    }
    public PanelBuilder min(Double min) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.min = min;
        return this;
    }
    public PanelBuilder max(Double max) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.max = max;
        return this;
    }
    public PanelBuilder mappings(List<ValueMapping> mappings) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.mappings = mappings;
        return this;
    }
    public PanelBuilder thresholds(com.grafana.foundation.cog.Builder<ThresholdsConfig> thresholds) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.thresholds = thresholds.build();
        return this;
    }
    public PanelBuilder colorScheme(com.grafana.foundation.cog.Builder<FieldColor> color) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.color = color.build();
        return this;
    }
    public PanelBuilder noValue(String noValue) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.defaults == null) {
			this.internal.fieldConfig.defaults = new com.grafana.foundation.dashboard.FieldConfig();
		}
    this.internal.fieldConfig.defaults.noValue = noValue;
        return this;
    }
    public PanelBuilder overrides(com.grafana.foundation.cog.Builder<List<DashboardFieldConfigSourceOverrides>> overrides) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
    this.internal.fieldConfig.overrides = overrides.build();
        return this;
    }
    public PanelBuilder withOverride(com.grafana.foundation.cog.Builder<DashboardFieldConfigSourceOverrides> overrides) {
		if (this.internal.fieldConfig == null) {
			this.internal.fieldConfig = new com.grafana.foundation.dashboard.FieldConfigSource();
		}
		if (this.internal.fieldConfig.overrides == null) {
			this.internal.fieldConfig.overrides = new LinkedList<>();
		}
    this.internal.fieldConfig.overrides.add(overrides.build());
        return this;
    }
    public PanelBuilder showLabels(Boolean showLabels) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.showLabels = showLabels;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder showCommonLabels(Boolean showCommonLabels) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.showCommonLabels = showCommonLabels;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder showTime(Boolean showTime) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.showTime = showTime;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder showLogContextToggle(Boolean showLogContextToggle) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.showLogContextToggle = showLogContextToggle;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder wrapLogMessage(Boolean wrapLogMessage) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.wrapLogMessage = wrapLogMessage;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder prettifyLogMessage(Boolean prettifyLogMessage) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.prettifyLogMessage = prettifyLogMessage;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder enableLogDetails(Boolean enableLogDetails) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.enableLogDetails = enableLogDetails;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder sortOrder(LogsSortOrder sortOrder) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.sortOrder = sortOrder;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder dedupStrategy(LogsDedupStrategy dedupStrategy) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.dedupStrategy = dedupStrategy;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickFilterLabel(Object onClickFilterLabel) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickFilterLabel = onClickFilterLabel;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickFilterOutLabel(Object onClickFilterOutLabel) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickFilterOutLabel = onClickFilterOutLabel;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder isFilterLabelActive(Object isFilterLabelActive) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.isFilterLabelActive = isFilterLabelActive;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickFilterString(Object onClickFilterString) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickFilterString = onClickFilterString;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickFilterOutString(Object onClickFilterOutString) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickFilterOutString = onClickFilterOutString;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickShowField(Object onClickShowField) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickShowField = onClickShowField;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder onClickHideField(Object onClickHideField) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.onClickHideField = onClickHideField;
    this.internal.options = optionsResource;
        return this;
    }
    public PanelBuilder displayedFields(List<String> displayedFields) {
		if (this.internal.options == null) {
			this.internal.options = new com.grafana.foundation.logs.Options();
		}
        com.grafana.foundation.logs.Options optionsResource = (com.grafana.foundation.logs.Options) this.internal.options;
        optionsResource.displayedFields = displayedFields;
    this.internal.options = optionsResource;
        return this;
    }
    
    public Panel build() {
        return this.internal;
    }
}