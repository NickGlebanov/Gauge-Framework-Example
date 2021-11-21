package ru.sdetteam.easygauge.models.user_model;

import com.fasterxml.jackson.annotation.*;
import ru.sdetteam.easygauge.models.project_model.AccessLevel;
import ru.sdetteam.easygauge.models.project_model.Project;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "language",
        "timezone",
        "projects",
        "username",
        "password",
        "real_name",
        "email",
        "access_level",
        "enabled",
        "protected"
})
public class User {
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("email")
    private String email;
    @JsonProperty("language")
    private String language;
    @JsonProperty("timezone")
    private String timezone;
    @JsonProperty("access_level")
    private AccessLevel accessLevel;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("real_name")
    private String realName;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("protect")
    private Boolean protect;
    @JsonProperty("projects")
    private List<Project> projects = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public User setId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public User setName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    @JsonProperty("language")
    public String getLanguage() {
        return language;
    }

    @JsonProperty("language")
    public User setLanguage(String language) {
        this.language = language;
        return this;
    }

    @JsonProperty("timezone")
    public String getTimezone() {
        return timezone;
    }

    @JsonProperty("timezone")
    public User setTimezone(String timezone) {
        this.timezone = timezone;
        return this;
    }

    @JsonProperty("access_level")
    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    @JsonProperty("access_level")
    public User setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    @JsonProperty("projects")
    public List<Project> getProjects() {
        return projects;
    }

    @JsonProperty("projects")
    public User setProjects(List<Project> projects) {
        this.projects = projects;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public User setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    @JsonProperty("username")
    public User setUsername(String username) {
        this.username = username;
        return this;
    }

    @JsonProperty("password")
    public String getPassword() {
        return password;
    }

    @JsonProperty("password")
    public User setPassword(String password) {
        this.password = password;
        return this;
    }

    @JsonProperty("real_name")
    public String getRealName() {
        return realName;
    }

    @JsonProperty("real_name")
    public User setRealName(String realName) {
        this.realName = realName;
        return this;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    @JsonProperty("enabled")
    public User setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    @JsonProperty("protected")
    public Boolean getProtected() {
        return protect;
    }

    @JsonProperty("protected")
    public User setProtected(Boolean protect) {
        this.protect = protect;
        return this;
    }
}