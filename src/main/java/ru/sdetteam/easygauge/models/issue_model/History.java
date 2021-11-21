package ru.sdetteam.easygauge.models.issue_model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "created_at",
        "user",
        "type",
        "message",
        "field",
        "old_value",
        "new_value",
        "change"
})
public class History {

    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("user")
    private User user;
    @JsonProperty("type")
    private Type type;
    @JsonProperty("message")
    private String message;
    @JsonProperty("field")
    private Field field;
    @JsonProperty("old_value")
    private String oldValue;
    @JsonProperty("new_value")
    private String newValue;
    @JsonProperty("change")
    private String change;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public History setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("user")
    public User getUser() {
        return user;
    }

    @JsonProperty("user")
    public History setUser(User user) {
        this.user = user;
        return this;
    }

    @JsonProperty("type")
    public Type getType() {
        return type;
    }

    @JsonProperty("type")
    public History setType(Type type) {
        this.type = type;
        return this;
    }

    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    @JsonProperty("message")
    public History setMessage(String message) {
        this.message = message;
        return this;
    }

    @JsonProperty("field")
    public Field getField() {
        return field;
    }

    @JsonProperty("field")
    public History setField(Field field) {
        this.field = field;
        return this;
    }

    @JsonProperty("old_value")
    public String getOldValue() {
        return oldValue;
    }

    @JsonProperty("old_value")
    public History setOldValue(String oldValue) {
        this.oldValue = oldValue;
        return this;
    }

    @JsonProperty("new_value")
    public String getNewValue() {
        return newValue;
    }

    @JsonProperty("new_value")
    public History setNewValue(String newValue) {
        this.newValue = newValue;
        return this;
    }

    @JsonProperty("change")
    public String getChange() {
        return change;
    }

    @JsonProperty("change")
    public History setChange(String change) {
        this.change = change;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public History setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(History.class.getName()).append('@').append(Integer.toHexString(System.identityHashCode(this))).append('[');
        sb.append("createdAt");
        sb.append('=');
        sb.append(((this.createdAt == null)?"<null>":this.createdAt));
        sb.append(',');
        sb.append("user");
        sb.append('=');
        sb.append(((this.user == null)?"<null>":this.user));
        sb.append(',');
        sb.append("type");
        sb.append('=');
        sb.append(((this.type == null)?"<null>":this.type));
        sb.append(',');
        sb.append("message");
        sb.append('=');
        sb.append(((this.message == null)?"<null>":this.message));
        sb.append(',');
        sb.append("field");
        sb.append('=');
        sb.append(((this.field == null)?"<null>":this.field));
        sb.append(',');
        sb.append("oldValue");
        sb.append('=');
        sb.append(((this.oldValue == null)?"<null>":this.oldValue));
        sb.append(',');
        sb.append("newValue");
        sb.append('=');
        sb.append(((this.newValue == null)?"<null>":this.newValue));
        sb.append(',');
        sb.append("change");
        sb.append('=');
        sb.append(((this.change == null)?"<null>":this.change));
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