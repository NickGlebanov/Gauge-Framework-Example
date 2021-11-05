package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bugnote_table
 */
@Data
public class Bugnote {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: reporter_id
     */
    private Integer reporterId;

    /**
     * Column: bugnote_text_id
     */
    private Integer bugnoteTextId;

    /**
     * Column: view_state
     */
    private Short viewState;

    /**
     * Column: note_type
     */
    private Integer noteType;

    /**
     * Column: note_attr
     */
    private String noteAttr;

    /**
     * Column: time_tracking
     */
    private Integer timeTracking;

    /**
     * Column: last_modified
     */
    private Integer lastModified;

    /**
     * Column: date_submitted
     */
    private Integer dateSubmitted;
}