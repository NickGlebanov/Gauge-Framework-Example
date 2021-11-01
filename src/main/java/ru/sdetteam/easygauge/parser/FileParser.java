package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.Response;
import ru.sdetteam.easygauge.issue_model.File;
import ru.sdetteam.easygauge.issue_model.Files;

import java.io.IOException;

public class FileParser {

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
