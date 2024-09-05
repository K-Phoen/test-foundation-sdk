// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.alerting;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import java.util.List;

public class TimeInterval {
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("name")
    public String name;
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("time_intervals")
    public List<TimeIntervalItem> timeIntervals;
    
    public String toJSON() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }

    
    public static class Builder implements com.grafana.foundation.cog.Builder<TimeInterval> {
        private final TimeInterval internal;
        
        public Builder() {
            this.internal = new TimeInterval();
        }
    public Builder name(String name) {
    this.internal.name = name;
        return this;
    }
    
    public Builder timeIntervals(com.grafana.foundation.cog.Builder<List<TimeIntervalItem>> timeIntervals) {
    this.internal.timeIntervals = timeIntervals.build();
        return this;
    }
    public TimeInterval build() {
            return this.internal;
        }
    }
}