// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.elasticsearch;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.annotation.JsonInclude;

public class ExtendedStat {
    @JsonProperty("label")
    public String label;
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    @JsonProperty("value")
    public ExtendedStatMetaType value;
    
    public String toJSON() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }

    
    public static class Builder implements com.grafana.foundation.cog.Builder<ExtendedStat> {
        protected final ExtendedStat internal;
        
        public Builder() {
            this.internal = new ExtendedStat();
        }
    public Builder label(String label) {
    this.internal.label = label;
        return this;
    }
    
    public Builder value(ExtendedStatMetaType value) {
    this.internal.value = value;
        return this;
    }
    public ExtendedStat build() {
            return this.internal;
        }
    }
}