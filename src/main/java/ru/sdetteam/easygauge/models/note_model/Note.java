package ru.sdetteam.easygauge.models.note_model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.sdetteam.easygauge.models.issue_model.Reporter;
import ru.sdetteam.easygauge.models.issue_model.ViewState;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "reporter",
        "text",
        "view_state",
        "type",
        "created_at",
        "updated_at"
})
public class Note {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("text")
    private String text;
    @JsonProperty("view_state")
    private ViewState viewState;
    @JsonProperty("type")
    private String type;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public Note setId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public Note setReporter(Reporter reporter) {
        this.reporter = reporter;
        return this;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public Note setText(String text) {
        this.text = text;
        return this;
    }

    @JsonProperty("view_state")
    public ViewState getViewState() {
        return viewState;
    }

    @JsonProperty("view_state")
    public Note setViewState(ViewState viewState) {
        this.viewState = viewState;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public Note setType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public Note setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public Note setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public Note setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
