package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_tag_table
 */
@Data
public class BugTag {
    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: tag_id
     */
    private Integer tagId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: date_attached
     */
    private Integer dateAttached;
}