package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.sdetteam.easygauge.enums.FilterEnum;
import ru.sdetteam.easygauge.issue_model.File;
import ru.sdetteam.easygauge.issue_model.Files;
import ru.sdetteam.easygauge.issue_model.Issue;
import ru.sdetteam.easygauge.issue_model.Issues;
import ru.sdetteam.easygauge.note_model.Note;
import ru.sdetteam.easygauge.parser.FileParser;
import ru.sdetteam.easygauge.parser.IssueParser;
import ru.sdetteam.easygauge.parser.NoteParser;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class IssueMethodsAPI {

    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();
    final IssueParser issueParser = new IssueParser();
    final FileParser fileParser = new FileParser();
    final NoteParser noteParser = new NoteParser();

    public Issue getIssue(Integer issueId) throws IOException {

        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssue(response);
    }

    public Files getIssueFiles(Integer issueId) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("files")
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return fileParser.parseInFiles(response);
    }

    public File getIssueFile(Integer issueId, Integer fileId) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("files")
                .addPathSegment(String.valueOf(fileId))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return fileParser.parseInFile(response);
    }

    public Issues getAllIssues(Integer pageSize, Integer pageNumber) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addParameter("page_size", String.valueOf(pageSize))
                .addParameter("page", String.valueOf(pageNumber))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssues(response);
    }

    public Issues getIssuesForProject(Integer projectId) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addParameter("project_id", String.valueOf(projectId))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssues(response);
    }

    public Issues getIssuesMatchingFilterById(Integer filterId) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addParameter("filter_id", String.valueOf(filterId))
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssues(response);
    }

    public Issues getIssuesMatchingFilterByFilterName(FilterEnum filterName) throws IOException {
        final URL url = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addParameter("filter_id", filterName.getApiName())
                .buildUrl();

        final Request request = builderAPI
                .getIssues(url)
                .getMethod("GET", null)
                .buildGetAndDelete();

        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssues(response);
    }

    public Issue postIssue() throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .buildUrl();

        MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        RequestBody body = RequestBody.create("{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}", mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssue(response);
    }

    public void updateIssue(Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .buildUrl();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create("{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}", mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("PATCH", body)
                .buildPostAndPatch();
        builderAPI.caller(request);
    }

    public void deleteIssue(Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
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

    public void addAttachmentToIssue(Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("files")
                .buildUrl();

        MediaType mediaType = MediaType.parse("application/json");
        RequestBody body = RequestBody.create("{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}", mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        builderAPI.caller(request);
    }

    public Note createAnIssueNote(Integer issueId) throws IOException {
        final URL urls = urlBuilder
                .getSchemeAndHost()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("notes")
                .buildUrl();

        MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        RequestBody body = RequestBody.create("{\n  \"text\": \"test note\",\n  \"view_state\": {\n  \t\"name\": \"public\"\n  }\n}", mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        final Response response = builderAPI.caller(request);

        return noteParser.parseInNote(response);
    }


}
