package ru.sdetteam.easygauge.api;

import okhttp3.MediaType;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import ru.sdetteam.easygauge.models.issue_model.*;
import ru.sdetteam.easygauge.variables.enums.FilterEnum;
import ru.sdetteam.easygauge.models.note_model.Note;
import ru.sdetteam.easygauge.parser.FileParser;
import ru.sdetteam.easygauge.parser.IssueParser;
import ru.sdetteam.easygauge.parser.NoteParser;

import java.io.IOException;
import java.net.URL;

public class IssueMethodsAPI {

    final BuilderAPI builderAPI = new BuilderAPI();
    final UrlBuilder urlBuilder = new UrlBuilder();
    final IssueParser issueParser = new IssueParser();
    final FileParser fileParser = new FileParser();
    final NoteParser noteParser = new NoteParser();

    public Issue getIssue(final Integer issueId) throws IOException {

        final URL url = new UrlBuilder()
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

    public Files getIssueFiles(final Integer issueId) throws IOException {
        final URL url = new UrlBuilder()
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

    public File getIssueFile(final Integer issueId, final Integer fileId) throws IOException {
        final URL url = new UrlBuilder()
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

    public Issues getAllIssues(final Integer pageSize, final Integer pageNumber) throws IOException {
        final URL url = new UrlBuilder()
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

    public Issues getIssuesForProject(final Integer projectId) throws IOException {
        final URL url = new UrlBuilder()
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

    public Issues getIssuesMatchingFilterById(final Integer filterId) throws IOException {
        final URL url = new UrlBuilder()
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

    public Issues getIssuesMatchingFilterByFilterName(final FilterEnum filterName) throws IOException {
        final URL url = new UrlBuilder()
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

    public Issue postIssue(final Issue issue) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("issues")
                .buildUrl();

        final String json = issueParser.parseInJSON(issue);

        final MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        final RequestBody body = RequestBody.create(
                //"{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}",
                json,
                mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        final Response response = builderAPI.caller(request);

        return issueParser.parseInIssue(response);
    }

    public void updateIssue(final Issue issue, final Integer issueId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .buildUrl();

        final String json = issueParser.parseInJSON(issue);

        final MediaType mediaType = MediaType.parse("application/json");
        final RequestBody body = RequestBody.create(
                //"{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}",
                json,
                mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("PATCH", body)
                .buildPostAndPatch();
        builderAPI.caller(request);
    }

    public void deleteIssue(final Integer issueId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
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

    public void addAttachmentToIssue(final Attachment attachment, final Integer issueId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("files")
                .buildUrl();

        final String json = issueParser.parseInJSON(attachment);

        final MediaType mediaType = MediaType.parse("application/json");
        final RequestBody body = RequestBody.create(
                //"{\n  \"summary\": \"This is a test issue\",\n  \"description\": \"This is a test description\",\n  \"category\": {\n    \"name\": \"General\"\n  },\n  \"project\": {\n    \"name\": \"test\"\n  }\n}",
                json,
                mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        builderAPI.caller(request);
    }

    public Note createAnIssueNote(final Note note, final Integer issueId) throws IOException {
        final URL urls = new UrlBuilder()
                .addPathSegment("issues")
                .addPathSegment(String.valueOf(issueId))
                .addPathSegment("notes")
                .buildUrl();

        final String json = issueParser.parseInJSON(note);
        final MediaType mediaType = MediaType.parse("application/json");
        // ТУТ ХОЧУ БОДИ ДЖЕЙСОН ФАЙЛ ПОЛУЧАТЬ ИЗ ВНЕ С ТЕСТОВЫМИ ДАННЫМИ, ПОКА БУДУ ГЛУШИТЬ СТАТИЧНЫМ НАБОРОМ ДАННЫХ
        final RequestBody body = RequestBody.create(
                //"{\n  \"text\": \"test note\",\n  \"view_state\": {\n  \t\"name\": \"public\"\n  }\n}",
                json,
                mediaType);
        final Request request = builderAPI
                .getIssues(urls)
                .getMethod("POST", body)
                .buildPostAndPatch();
        final Response response = builderAPI.caller(request);

        return noteParser.parseInNote(response);
    }

}
