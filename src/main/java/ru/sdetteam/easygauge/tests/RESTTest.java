package ru.sdetteam.easygauge.tests;

import org.junit.Test;
import ru.sdetteam.easygauge.api.IssueMethodsAPI;
import ru.sdetteam.easygauge.enums.FilterEnum;

import java.io.IOException;

public class RESTTest {

    IssueMethodsAPI issueMethodsAPI = new IssueMethodsAPI();

    @Test
    public void testAPI() throws IOException {
        issueMethodsAPI.getIssues(1);
        issueMethodsAPI.getIssuesMatchingFilterByName(FilterEnum.ASSIGNED);
    }
}
