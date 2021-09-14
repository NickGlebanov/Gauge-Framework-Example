package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_config_table
 */
@Data
public class Config {
    /**
     * Column: config_id
     */
    private String configId;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: access_reqd
     */
    private Integer accessReqd;

    /**
     * Column: type
     */
    private Integer type;

    /**
     * Column: value
     */
    private String value;
}