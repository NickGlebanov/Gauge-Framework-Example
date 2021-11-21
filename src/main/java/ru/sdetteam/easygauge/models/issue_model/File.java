package ru.sdetteam.easygauge.models.issue_model;

import com.fasterxml.jackson.annotation.*;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "reporter",
        "created_at",
        "filename",
        "size",
        "content_type",
        "content"
})
public class File {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("reporter")
    private Reporter reporter;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("filename")
    private String filename;
    @JsonProperty("size")
    private Integer size;
    @JsonProperty("content_type")
    private String contentType;
    @JsonProperty("content")
    private String content;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public File setId(Integer id) {
        this.id = id;
        return this;
    }

    @JsonProperty("reporter")
    public Reporter getReporter() {
        return reporter;
    }

    @JsonProperty("reporter")
    public File setReporter(Reporter reporter) {
        this.reporter = reporter;
        return this;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public File setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    @JsonProperty("filename")
    public String getFilename() {
        return filename;
    }

    @JsonProperty("filename")
    public File setFilename(String filename) {
        this.filename = filename;
        return this;
    }

    @JsonProperty("size")
    public Integer getSize() {
        return size;
    }

    @JsonProperty("size")
    public File setSize(Integer size) {
        this.size = size;
        return this;
    }

    @JsonProperty("content_type")
    public String getContentType() {
        return contentType;
    }

    @JsonProperty("content_type")
    public File setContentType(String contentType) {
        this.contentType = contentType;
        return this;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public File setContent(String content) {
        this.content = content;
        return this;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public File setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
        return this;
    }

}
