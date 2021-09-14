package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_filters_table
 */
@Data
public class Filters {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: is_public
     */
    private Byte isPublic;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: filter_string
     */
    private String filterString;
}