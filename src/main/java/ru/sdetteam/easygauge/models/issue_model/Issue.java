package ru.sdetteam.easygauge.models.issue_model;

import com.fasterxml.jackson.annotation.*;
import ru.sdetteam.easygauge.models.project_model.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "summary",
        "description",
        "project",
        "category",
        "reporter",
        "handler",
        "status",
        "resolution",
        "view_state",
        "priority",
        "severity",
        "reproducibility",
        "sticky",
        "created_at",
        "updated_at",
        "monitors",
        "history"
})
public class Issue {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("summary")
    private String summary;
    @JsonProperty("description")
    private String description;
    @JsonProperty("project")
    private Project project;
    @JsonProperty("category")
    private Category category;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("handler")
    private Handler handler;
    @JsonProperty("status")
    private Status status;
    @JsonProperty("resolution")
    private Resolution resolution;
    @JsonProperty("view_state")
    private ViewState viewState;
    @JsonProperty("priority")
    private Priority priority;
    @JsonProperty("severity")
    private Severity severity;
    @JsonProperty("reproducibility")
    private Reproducibility reproducibility;
    @JsonProperty("sticky")
    private Boolean sticky;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("monitors")
    private List<Monitor> monitors = null;
    @JsonProperty("history")
    private List<History> history = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public Issue setId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    @JsonProperty("summary")
    public Issue setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public Issue setDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("project")
    public Project getProject() {
        return project;
    }

    @JsonProperty("project")
    public Issue setProject(Project project) {
        this.project = project;
        return this;
    }

    @JsonProperty("category")
    public Category getCategory() {
        return category;
    }

    @JsonProperty("category")
    public Issue setCategory(Category category) {
        this.category = category;
        return this;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public Issue setReporter(Reporter reporter) {
        this.reporter = reporter;
        return this;
    }

    @JsonProperty("handler")
    public Handler getHandler() {
        return handler;
    }

    @JsonProperty("handler")
    public Issue setHandler(Handler handler) {
        this.handler = handler;
        return this;
    }

    @JsonProperty("status")
    public Status getStatus() {
        return status;
    }

    @JsonProperty("status")
    public Issue setStatus(Status status) {
        this.status = status;
        return this;
    }

    @JsonProperty("resolution")
    public Resolution getResolution() {
        return resolution;
    }

    @JsonProperty("resolution")
    public Issue setResolution(Resolution resolution) {
        this.resolution = resolution;
        return this;
    }

    @JsonProperty("view_state")
    public ViewState getViewState() {
        return viewState;
    }

    @JsonProperty("view_state")
    public Issue setViewState(ViewState viewState) {
        this.viewState = viewState;
        return this;
    }

    @JsonProperty("priority")
    public Priority getPriority() {
        return priority;
    }

    @JsonProperty("priority")
    public Issue setPriority(Priority priority) {
        this.priority = priority;
        return this;
    }

    @JsonProperty("severity")
    public Severity getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public Issue setSeverity(Severity severity) {
        this.severity = severity;
        return this;
    }

    @JsonProperty("reproducibility")
    public Reproducibility getReproducibility() {
        return reproducibility;
    }

    @JsonProperty("reproducibility")
    public Issue setReproducibility(Reproducibility reproducibility) {
        this.reproducibility = reproducibility;
        return this;
    }

    @JsonProperty("sticky")
    public Boolean getSticky() {
        return sticky;
    }

    @JsonProperty("sticky")
    public Issue setSticky(Boolean sticky) {
        this.sticky = sticky;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public Issue setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public Issue setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @JsonProperty("monitors")
    public List<Monitor> getMonitors() {
        return monitors;
    }

    @JsonProperty("monitors")
    public Issue setMonitors(List<Monitor> monitors) {
        this.monitors = monitors;
        return this;
    }

    @JsonProperty("history")
    public List<History> getHistory() {
        return history;
    }

    @JsonProperty("history")
    public Issue setHistory(List<History> history) {
        this.history = history;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public Issue setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(Issue.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("id");
        sb.append('=');
        sb.append(((this.id == null)?"<null>":this.id));
        sb.append(',');
        sb.append("summary");
        sb.append('=');
        sb.append(((this.summary == null)?"<null>":this.summary));
        sb.append(',');
        sb.append("description");
        sb.append('=');
        sb.append(((this.description == null)?"<null>":this.description));
        sb.append(',');
        sb.append("project");
        sb.append('=');
        sb.append(((this.project == null)?"<null>":this.project));
        sb.append(',');
        sb.append("category");
        sb.append('=');
        sb.append(((this.category == null)?"<null>":this.category));
        sb.append(',');
        sb.append("reporter");
        sb.append('=');
        sb.append(((this.reporter == null)?"<null>":this.reporter));
        sb.append(',');
        sb.append("handler");
        sb.append('=');
        sb.append(((this.handler == null)?"<null>":this.handler));
        sb.append(',');
        sb.append("status");
        sb.append('=');
        sb.append(((this.status == null)?"<null>":this.status));
        sb.append(',');
        sb.append("resolution");
        sb.append('=');
        sb.append(((this.resolution == null)?"<null>":this.resolution));
        sb.append(',');
        sb.append("viewState");
        sb.append('=');
        sb.append(((this.viewState == null)?"<null>":this.viewState));
        sb.append(',');
        sb.append("priority");
        sb.append('=');
        sb.append(((this.priority == null)?"<null>":this.priority));
        sb.append(',');
        sb.append("severity");
        sb.append('=');
        sb.append(((this.severity == null)?"<null>":this.severity));
        sb.append(',');
        sb.append("reproducibility");
        sb.append('=');
        sb.append(((this.reproducibility == null)?"<null>":this.reproducibility));
        sb.append(',');
        sb.append("sticky");
        sb.append('=');
        sb.append(((this.sticky == null)?"<null>":this.sticky));
        sb.append(',');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("updatedAt");
        sb.append('=');
        sb.append(((this.updatedAt == null)?"<null>":this.updatedAt));
        sb.append(',');
        sb.append("monitors");
        sb.append('=');
        sb.append(((this.monitors == null)?"<null>":this.monitors));
        sb.append(',');
        sb.append("history");
        sb.append('=');
        sb.append(((this.history == null)?"<null>":this.history));
        sb.append(',');
        sb.append("additionalProperties");
        sb.append('=');
        sb.append(((this.additionalProperties == null)?"<null>":this.additionalProperties));
        sb.append(',');
        if (sb.charAt((sb.length()- 1)) == ',') {
            sb.setCharAt((sb.length()- 1), ']');
        } else {
            sb.append(']');
        }
        return sb.toString();
    }

}
