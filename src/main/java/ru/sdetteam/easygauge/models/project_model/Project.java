package ru.sdetteam.easygauge.models.project_model;

import com.fasterxml.jackson.annotation.*;
import ru.sdetteam.easygauge.models.issue_model.Status;
import ru.sdetteam.easygauge.models.issue_model.ViewState;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "status",
        "description",
        "enabled",
        "file_path",
        "view_state",
        "access_level",
        "custom_fields",
        "versions",
        "categories"
})
public class Project {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("description")
    private String description;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("file_path")
    private String filePath;
    @JsonProperty("view_state")
    private ViewState viewState;
    @JsonProperty("access_level")
    private AccessLevel accessLevel;
    @JsonProperty("custom_fields")
    private List<Object> customFields = null;
    @JsonProperty("versions")
    private List<Object> versions = null;
    @JsonProperty("categories")
    private List<Category> categories = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public Project setId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public Project setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public Project setStatus(Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public Project setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public Project setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("file_path")
    public String getFilePath() {
        return filePath;
    }

    @JsonProperty("file_path")
    public Project setFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    @JsonProperty("view_state")
    public ViewState getViewState() {
        return viewState;
    }

    @JsonProperty("view_state")
    public Project setViewState(ViewState viewState) {
        this.viewState = viewState;
        return this;
    }

    @JsonProperty("access_level")
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("access_level")
    public Project setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    @JsonProperty("custom_fields")
    public List<Object> getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public Project setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
        return this;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public Project setVersions(List<Object> versions) {
        this.versions = versions;
        return this;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public Project setCategories(List<Category> categories) {
        this.categories = categories;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public Project setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
