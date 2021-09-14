package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_revision_table
 */
@Data
public class BugRevision {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: bugnote_id
     */
    private Integer bugnoteId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: type
     */
    private Integer type;

    /**
     * Column: timestamp
     */
    private Integer timestamp;

    /**
     * Column: value
     */
    private String value;
}