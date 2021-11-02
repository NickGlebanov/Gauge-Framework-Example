package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.Response;
import ru.sdetteam.easygauge.models.issue_model.Attachment;
import ru.sdetteam.easygauge.models.issue_model.Issue;
import ru.sdetteam.easygauge.models.issue_model.Issues;
import ru.sdetteam.easygauge.models.note_model.Note;
import ru.sdetteam.easygauge.models.project_model.SubProject;

import java.io.IOException;

public class IssueParser {

    public Issue parseInIssue(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Issue.class);
    }

    public Issues parseInIssues(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, new TypeReference<Issues>() {});
    }

    public String parseInJSON(final Issue issue) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(issue);
    }

    public String parseInJSON(final Attachment attachment) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(attachment);
    }

    public String parseInJSON(final Note note) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(note);
    }
}
