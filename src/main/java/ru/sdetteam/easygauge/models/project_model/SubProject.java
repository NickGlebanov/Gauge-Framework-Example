package ru.sdetteam.easygauge.models.project_model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "summary",
        "description",
        "category",
        "project",
        "inherit_parent"
})
public class SubProject {
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("inherit_parent")
    private Boolean inheritParent;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public SubProject setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public SubProject setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public SubProject setCategory(Category category) {
        this.category = category;
        return this;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public SubProject setProject(Project project) {
        this.project = project;
        return this;
    }

    @JsonProperty("inherit_parent")
    public Boolean getInheritParent() {
        return inheritParent;
    }

    @JsonProperty("inherit_parent")
    public SubProject setInheritParent(Boolean inheritParent) {
        this.inheritParent = inheritParent;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public SubProject setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }
}
