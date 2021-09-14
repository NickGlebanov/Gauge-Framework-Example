package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_tag_table
 */
@Data
public class Tag {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: date_created
     */
    private Integer dateCreated;

    /**
     * Column: date_updated
     */
    private Integer dateUpdated;

    /**
     * Column: description
     */
    private String description;
}