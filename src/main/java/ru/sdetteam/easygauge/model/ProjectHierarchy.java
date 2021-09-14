package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_project_hierarchy_table
 */
@Data
public class ProjectHierarchy {
    /**
     * Column: child_id
     */
    private Integer childId;

    /**
     * Column: parent_id
     */
    private Integer parentId;

    /**
     * Column: inherit_parent
     */
    private Byte inheritParent;
}