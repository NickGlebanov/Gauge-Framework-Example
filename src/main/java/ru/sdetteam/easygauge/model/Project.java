package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_project_table
 */
@Data
public class Project {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: status
     */
    private Short status;

    /**
     * Column: enabled
     */
    private Byte enabled;

    /**
     * Column: view_state
     */
    private Short viewState;

    /**
     * Column: access_min
     */
    private Short accessMin;

    /**
     * Column: file_path
     */
    private String filePath;

    /**
     * Column: category_id
     */
    private Integer categoryId;

    /**
     * Column: inherit_global
     */
    private Byte inheritGlobal;

    /**
     * Column: description
     */
    private String description;
}