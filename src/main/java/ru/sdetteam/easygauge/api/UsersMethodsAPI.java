package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.sdetteam.easygauge.parser.UserParser;
import ru.sdetteam.easygauge.models.user_model.User;

import java.io.IOException;
import java.net.URL;

//сравнить в том проекте откуда у меня классы берутся для ДТО и тут, мб надо другие импорты ставить
public class UsersMethodsAPI {
    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();
    final UserParser userParser = new UserParser();

    public User getMyUserInfo() throws IOException {
        final URL url = new UrlBuilder()
                .addPathSegment("users")
                .addPathSegment("me")
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);
        return userParser.parseInUser(response);
    }

    public User createUser(final User user) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("users")
                .buildUrl();

        final String json = userParser.parseInJSON(user);

        final MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        final RequestBody body = RequestBody.create(
                //"{\n  \"username\": \"testuser\",\n  \"password\": \"1234567\",\n  \"real_name\": \"Victor Boctor\",\n  \"email\": \"victor@yet-another-domain.com\",\n  \"access_level\": { \"name\": \"updater\" },\n  \"enabled\": false,\n  \"protected\": false\n}",
                json,
                mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        final Response response = builderAPI.caller(request);
        return userParser.parseInUser(response);
    }

    public void deleteUser(final Integer userId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("users")
                .addPathSegment(String.valueOf(userId))
                .buildUrl();

        final MediaType mediaType = MediaType.parse("text/plain");
        final MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        final RequestBody body = RequestBody.create("{}", JSON);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("DELETE", body)
                .buildGetAndDelete();
        builderAPI.caller(request);
    }

    public void resetUserPassword(final Integer userId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("users")
                .addPathSegment(String.valueOf(userId))
                .addPathSegment("reset")
                .buildUrl();

        final MediaType mediaType = MediaType.parse("text/plain");
        final RequestBody body = RequestBody.create("", mediaType);
        final Request request = new Request.Builder()
                .url(urls)
                .method("PUT", body)
                .build();
        builderAPI.caller(request);
    }


}
