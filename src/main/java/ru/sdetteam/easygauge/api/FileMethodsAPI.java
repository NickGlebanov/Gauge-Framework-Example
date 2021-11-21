package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

import java.io.IOException;
import java.net.URL;

public class FileMethodsAPI {
    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();

    //TODO доделать десиреализацию в объекты
    public void getAllFiles() throws IOException {
        final URL url = new UrlBuilder()
                .addPathSegment("filters")
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);
    }
}
