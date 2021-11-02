package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.Response;
import ru.sdetteam.easygauge.models.project_model.Project;
import ru.sdetteam.easygauge.models.project_model.Projects;
import ru.sdetteam.easygauge.models.project_model.SubProject;
import ru.sdetteam.easygauge.models.project_model.Version;

import java.io.IOException;

public class ProjectParser {

    public Projects parseInProjects(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Projects.class);
    }

    public Project parseInProject(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Project.class);
    }

    public String parseInJSON(final Project project) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(project);
    }

    public String parseInJSON(final Version version) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(version);
    }

    public String parseInJSON(final SubProject version) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(version);
    }
}
