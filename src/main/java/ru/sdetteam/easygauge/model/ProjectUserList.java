package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_project_user_list_table
 */
@Data
public class ProjectUserList {
    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: access_level
     */
    private Short accessLevel;
}