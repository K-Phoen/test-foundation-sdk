// Code generated - EDITING IS FUTILE. DO NOT EDIT.

package com.grafana.foundation.expr;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

public class ExprTypeReduceDatasource {
    // The apiserver version
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("apiVersion")
    public String apiVersion;
    // The datasource plugin type
    @JsonProperty("type")
    public String type;
    // Datasource UID (NOTE: name in k8s)
    @JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
    @JsonProperty("uid")
    public String uid;
    
    public String toJSON() throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(this);
    }

    
    public static class Builder implements com.grafana.foundation.cog.Builder<ExprTypeReduceDatasource> {
        private final ExprTypeReduceDatasource internal;
        
        public Builder() {
            this.internal = new ExprTypeReduceDatasource();
    this.internal.type = "__expr__";
        }
    public Builder apiVersion(String apiVersion) {
    this.internal.apiVersion = apiVersion;
        return this;
    }
    
    public Builder uid(String uid) {
    this.internal.uid = uid;
        return this;
    }
    public ExprTypeReduceDatasource build() {
            return this.internal;
        }
    }
}