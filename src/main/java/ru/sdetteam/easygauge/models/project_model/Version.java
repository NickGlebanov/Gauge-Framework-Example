package ru.sdetteam.easygauge.models.project_model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "description",
        "released",
        "obsolete",
        "timestamp"
})
public class Version {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("released")
    private Boolean released;
    @JsonProperty("obsolete")
    private Boolean obsolete;
    @JsonProperty("timestamp")
    private String timestamp;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public Version setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public Version setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("released")
    public Boolean getReleased() {
        return released;
    }

    @JsonProperty("released")
    public Version setReleased(Boolean released) {
        this.released = released;
        return this;
    }

    @JsonProperty("obsolete")
    public Boolean getObsolete() {
        return obsolete;
    }

    @JsonProperty("obsolete")
    public Version setObsolete(Boolean obsolete) {
        this.obsolete = obsolete;
        return this;
    }

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public Version setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public Version setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
