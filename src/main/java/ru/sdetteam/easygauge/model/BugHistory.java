package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_history_table
 */
@Data
public class BugHistory {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: field_name
     */
    private String fieldName;

    /**
     * Column: old_value
     */
    private String oldValue;

    /**
     * Column: new_value
     */
    private String newValue;

    /**
     * Column: type
     */
    private Short type;

    /**
     * Column: date_modified
     */
    private Integer dateModified;
}