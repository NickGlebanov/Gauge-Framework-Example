package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_project_version_table
 */
@Data
public class ProjectVersion {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: version
     */
    private String version;

    /**
     * Column: released
     */
    private Byte released;

    /**
     * Column: obsolete
     */
    private Byte obsolete;

    /**
     * Column: date_order
     */
    private Integer dateOrder;

    /**
     * Column: description
     */
    private String description;
}