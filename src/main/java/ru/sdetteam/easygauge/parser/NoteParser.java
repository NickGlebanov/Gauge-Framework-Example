package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import okhttp3.Response;
import ru.sdetteam.easygauge.models.note_model.Note;

import java.io.IOException;

public class NoteParser {

    public Note parseInNote(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, Note.class);
    }
}
