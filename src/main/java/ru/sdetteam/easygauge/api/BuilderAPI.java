package ru.sdetteam.easygauge.api;

import lombok.experimental.Accessors;
import okhttp3.*;
import okhttp3.Request.Builder;

import java.io.IOException;
import java.net.URL;

@Accessors(fluent = true)
public class BuilderAPI {

    OkHttpClient client = new OkHttpClient().newBuilder().build();
    Builder builder = new Builder();

    public BuilderAPI getMethod(String method, RequestBody body){
        builder.method(method, body);
        return this;
    }

    public Request buildGetAndDelete() {
        return builder.addHeader("Authorization", "60_dMa5GYcu0Ozt-2jWjbO0u6xLOZYdQ")
                .build();
    }

    public Request buildPostAndPatch() {
        return builder
                .addHeader("Authorization", "60_dMa5GYcu0Ozt-2jWjbO0u6xLOZYdQ")
                .addHeader("Content-Type", "application/json")
                .build();
    }

    public Response caller(Request request) throws IOException {
        return client.newCall(request).execute();
    }

    public BuilderAPI getIssues(URL url) {
        builder.url(url);
        return this;
    }
}
