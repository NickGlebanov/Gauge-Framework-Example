package ru.sdetteam.easygauge.parser;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.ObjectWriter;
import okhttp3.Response;
import ru.sdetteam.easygauge.models.user_model.User;

import java.io.IOException;

public class UserParser {

    public User parseInUser(final Response response) throws IOException {

        final ObjectReader reader = new ObjectMapper().reader();
        final JsonFactory factory = new JsonFactory();
        final JsonParser parser = factory.createParser(response.body().string());

        return reader.readValue(parser, User.class);
    }

    public String parseInJSON(final User user) throws JsonProcessingException {
        final ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        return ow.writeValueAsString(user);
    }
}
