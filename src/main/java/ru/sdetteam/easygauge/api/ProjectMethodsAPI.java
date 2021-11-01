package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.sdetteam.easygauge.parser.ProjectParser;
import ru.sdetteam.easygauge.project_model.Project;
import ru.sdetteam.easygauge.project_model.Projects;
import ru.sdetteam.easygauge.project_model.Version;

import java.io.IOException;
import java.net.URL;

public class ProjectMethodsAPI {

    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();
    final ProjectParser projectParser = new ProjectParser();

    public Projects getAllProjects() throws IOException {

        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return projectParser.parseInProjects(response);
    }

    public Project getProjectById(Integer id) throws IOException {

        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(id))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return projectParser.parseInProject(response);
    }

    public Project postProject(Project project) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .buildUrl();

        final String json = projectParser.parseInJSON(project);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return projectParser.parseInProject(response);
    }

    public Project patchProject(Project project, Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(issueId))
                .buildUrl();

        final String json = projectParser.parseInJSON(project);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("PATCH", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return projectParser.parseInProject(response);
    }

    public void deleteProject(Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(issueId))
                .buildUrl();

        MediaType mediaType = MediaType.parse("text/plain");
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create("{}", JSON);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("DELETE", body)
                .buildGetAndDelete();
        Response response = builderAPI.caller(request);
        projectParser.parseInProject(response);
    }

    public Project postSubProject(Project subProject, Integer id) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(id))
                .addPathSegment("subprojects")
                .buildUrl();

        final String json = projectParser.parseInJSON(subProject);

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return projectParser.parseInProject(response);
    }

    public Project patchSubProject(Project subProject, Integer issueId, Integer subProjectId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("subprojects")
                .addPathSegment(String.valueOf(subProjectId))
                .buildUrl();

        final String json = projectParser.parseInJSON(subProject);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("PATCH", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return projectParser.parseInProject(response);
    }

    public void deleteSubProject(Integer id) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(id))
                .buildUrl();

        MediaType mediaType = MediaType.parse("text/plain");
        MediaType JSON = MediaType.parse("application/json; charset=utf-8");
        RequestBody body = RequestBody.create("{}", JSON);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("DELETE", body)
                .buildGetAndDelete();
        Response response = builderAPI.caller(request);
        projectParser.parseInProject(response);
    }

    public Project createProjectVersion(Version version, Integer id) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("projects")
                .addPathSegment(String.valueOf(id))
                .addPathSegment("versions")
                .buildUrl();

        final String json = projectParser.parseInJSON(version);
        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create(json, mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        Response response = builderAPI.caller(request);
        return projectParser.parseInProject(response);
    }
}
