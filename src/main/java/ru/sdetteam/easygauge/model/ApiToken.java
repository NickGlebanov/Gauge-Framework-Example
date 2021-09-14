package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_api_token_table
 */
@Data
public class ApiToken {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: hash
     */
    private String hash;

    /**
     * Column: date_created
     */
    private Integer dateCreated;

    /**
     * Column: date_used
     */
    private Integer dateUsed;
}