package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_project_file_table
 */
@Data
public class ProjectFile {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: title
     */
    private String title;

    /**
     * Column: description
     */
    private String description;

    /**
     * Column: diskfile
     */
    private String diskfile;

    /**
     * Column: filename
     */
    private String filename;

    /**
     * Column: folder
     */
    private String folder;

    /**
     * Column: filesize
     */
    private Integer filesize;

    /**
     * Column: file_type
     */
    private String fileType;

    /**
     * Column: date_added
     */
    private Integer dateAdded;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: content
     */
    private byte[] content;
}