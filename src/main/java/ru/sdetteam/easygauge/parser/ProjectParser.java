package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.Response;
import ru.sdetteam.easygauge.project_model.Project;
import ru.sdetteam.easygauge.project_model.Projects;
import ru.sdetteam.easygauge.project_model.Version;

import java.io.IOException;

public class ProjectParser {

    public Projects parseInProjects(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Projects.class);
    }

    public Project parseInProject(Response response) throws IOException {

        ObjectReader reader = new ObjectMapper().reader();
        JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Project.class);
    }

    public String parseInJSON(Project project) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(project);
    }

    public String parseInJSON(Version version) throws JsonProcessingException {
        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(version);
    }
}
