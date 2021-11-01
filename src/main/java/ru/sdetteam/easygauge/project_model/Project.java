package ru.sdetteam.easygauge.project_model;

import com.fasterxml.jackson.annotation.*;
import ru.sdetteam.easygauge.issue_model.Status;
import ru.sdetteam.easygauge.issue_model.ViewState;

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
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Status status) {
        this.status = status;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("file_path")
    public String getFilePath() {
        return filePath;
    }

    @JsonProperty("file_path")
    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    @JsonProperty("view_state")
    public ViewState getViewState() {
        return viewState;
    }

    @JsonProperty("view_state")
    public void setViewState(ViewState viewState) {
        this.viewState = viewState;
    }

    @JsonProperty("access_level")
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("access_level")
    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    @JsonProperty("custom_fields")
    public List<Object> getCustomFields() {
        return customFields;
    }

    @JsonProperty("custom_fields")
    public void setCustomFields(List<Object> customFields) {
        this.customFields = customFields;
    }

    @JsonProperty("versions")
    public List<Object> getVersions() {
        return versions;
    }

    @JsonProperty("versions")
    public void setVersions(List<Object> versions) {
        this.versions = versions;
    }

    @JsonProperty("categories")
    public List<Category> getCategories() {
        return categories;
    }

    @JsonProperty("categories")
    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
