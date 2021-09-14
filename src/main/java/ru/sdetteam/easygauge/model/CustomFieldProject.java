package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_custom_field_project_table
 */
@Data
public class CustomFieldProject {
    /**
     * Column: field_id
     */
    private Integer fieldId;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: sequence
     */
    private Short sequence;
}