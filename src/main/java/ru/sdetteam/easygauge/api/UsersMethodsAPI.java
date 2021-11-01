package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.sdetteam.easygauge.parser.UserParser;
import ru.sdetteam.easygauge.user_model.User;

import java.io.IOException;
import java.net.URL;

//сравнить в том проекте откуда у меня классы берутся для ДТО и тут, мб надо другие импорты ставить
public class UsersMethodsAPI {
    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();
    UserParser userParser = new UserParser();

    public User getMyUserInfo() throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
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

    public User createUser() throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("users")
                .buildUrl();

        MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        RequestBody body = RequestBody.create("{\n  \"username\": \"testuser\",\n  \"password\": \"1234567\",\n  \"real_name\": \"Victor Boctor\",\n  \"email\": \"victor@yet-another-domain.com\",\n  \"access_level\": { \"name\": \"updater\" },\n  \"enabled\": false,\n  \"protected\": false\n}", mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return userParser.parseInUser(response);
    }

    public void deleteUser(Integer userId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("users")
                .addPathSegment(String.valueOf(userId))
                .buildUrl();

        MediaType mediaType = MediaType.parse("text/plain");
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create("{}", JSON);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("DELETE", body)
                .buildGetAndDelete();
        builderAPI.caller(request);
    }

    public void resetUserPassword(Integer userId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("users")
                .addPathSegment(String.valueOf(userId))
                .addPathSegment("reset")
                .buildUrl();

        MediaType mediaType = MediaType.parse("text/plain");
        RequestBody body = RequestBody.create("", mediaType);
        Request request = new Request.Builder()
                .url(urls)
                .method("PUT", body)
                .build();
        builderAPI.caller(request);
    }


}
