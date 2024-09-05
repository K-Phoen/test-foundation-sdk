// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.common;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

// TODO docs
public class HideableFieldConfig {
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("hideFrom")
    public HideSeriesConfig hideFrom;
    
    public String toJSON() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }

    
    public static class Builder implements com.grafana.foundation.cog.Builder<HideableFieldConfig> {
        private final HideableFieldConfig internal;
        
        public Builder() {
            this.internal = new HideableFieldConfig();
        }
    public Builder hideFrom(com.grafana.foundation.cog.Builder<HideSeriesConfig> hideFrom) {
    this.internal.hideFrom = hideFrom.build();
        return this;
    }
    public HideableFieldConfig build() {
            return this.internal;
        }
    }
}