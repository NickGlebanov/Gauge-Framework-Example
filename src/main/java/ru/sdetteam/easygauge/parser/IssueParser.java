package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.Response;
import ru.sdetteam.easygauge.issue_model.File;
import ru.sdetteam.easygauge.issue_model.Files;
import ru.sdetteam.easygauge.issue_model.Issue;
import ru.sdetteam.easygauge.issue_model.Issues;

import java.io.IOException;
import java.util.List;

public class IssueParser {

    public Issue parseInIssue(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Issue.class);
    }

    public Issues parseInIssues(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, new TypeReference<Issues>() {});
    }

    public File parseInFile(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, File.class);
    }

    public Files parseInFiles(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Files.class);
    }
}
