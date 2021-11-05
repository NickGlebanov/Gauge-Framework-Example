package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_news_table
 */
@Data
public class News {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: poster_id
     */
    private Integer posterId;

    /**
     * Column: view_state
     */
    private Short viewState;

    /**
     * Column: announcement
     */
    private Byte announcement;

    /**
     * Column: headline
     */
    private String headline;

    /**
     * Column: last_modified
     */
    private Integer lastModified;

    /**
     * Column: date_posted
     */
    private Integer datePosted;

    /**
     * Column: body
     */
    private String body;
}