package ru.sdetteam.easygauge.models.issue_model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import ru.sdetteam.easygauge.models.project_model.Project;

import java.util.HashMap;
import java.util.Map;

public class Attachment {
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("project")
    private Project project;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public Attachment setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public Attachment setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public Attachment setCategory(Category category) {
        this.category = category;
        return this;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public Attachment setProject(Project project) {
        this.project = project;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public Attachment setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
