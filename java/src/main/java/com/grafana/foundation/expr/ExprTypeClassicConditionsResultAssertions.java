// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.expr;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.annotation.Nulls;
import java.util.List;

public class ExprTypeClassicConditionsResultAssertions {
    // Maximum frame count
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("maxFrames")
    public Long maxFrames;
    // Type asserts that the frame matches a known type structure.
    // Possible enum values:
    //  - `""` 
    //  - `"timeseries-wide"` 
    //  - `"timeseries-long"` 
    //  - `"timeseries-many"` 
    //  - `"timeseries-multi"` 
    //  - `"directory-listing"` 
    //  - `"table"` 
    //  - `"numeric-wide"` 
    //  - `"numeric-multi"` 
    //  - `"numeric-long"` 
    //  - `"log-lines"` 
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("type")
    public TypeClassicConditionsType type;
    // TypeVersion is the version of the Type property. Versions greater than 0.0 correspond to the dataplane
    // contract documentation https://grafana.github.io/dataplane/contract/.
    @JsonSetter(nulls = Nulls.AS_EMPTY)
    @JsonProperty("typeVersion")
    public List<Long> typeVersion;
    
    public String toJSON() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }

    
    public static class Builder implements com.grafana.foundation.cog.Builder<ExprTypeClassicConditionsResultAssertions> {
        protected final ExprTypeClassicConditionsResultAssertions internal;
        
        public Builder() {
            this.internal = new ExprTypeClassicConditionsResultAssertions();
        }
    public Builder maxFrames(Long maxFrames) {
    this.internal.maxFrames = maxFrames;
        return this;
    }
    
    public Builder type(TypeClassicConditionsType type) {
    this.internal.type = type;
        return this;
    }
    
    public Builder typeVersion(List<Long> typeVersion) {
    this.internal.typeVersion = typeVersion;
        return this;
    }
    public ExprTypeClassicConditionsResultAssertions build() {
            return this.internal;
        }
    }
}