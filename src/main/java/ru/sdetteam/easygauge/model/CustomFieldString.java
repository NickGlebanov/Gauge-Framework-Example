package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_custom_field_string_table
 */
@Data
public class CustomFieldString {
    /**
     * Column: field_id
     */
    private Integer fieldId;

    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: value
     */
    private String value;

    /**
     * Column: text
     */
    private String text;
}