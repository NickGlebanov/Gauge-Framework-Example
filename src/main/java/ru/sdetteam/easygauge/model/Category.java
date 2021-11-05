package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_category_table
 */
@Data
public class Category {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: status
     */
    private Integer status;
}