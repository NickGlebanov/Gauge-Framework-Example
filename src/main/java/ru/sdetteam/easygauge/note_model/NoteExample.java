package ru.sdetteam.easygauge.note_model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import ru.sdetteam.easygauge.issue_model.Issue;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "note",
        "issue"
})
@Generated("jsonschema2pojo")
public class NoteExample {

    @JsonProperty("note")
    private Note note;
    @JsonProperty("issue")
    private Issue issue;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("note")
    public Note getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(Note note) {
        this.note = note;
    }

    @JsonProperty("issue")
    public Issue getIssue() {
        return issue;
    }

    @JsonProperty("issue")
    public void setIssue(Issue issue) {
        this.issue = issue;
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
