package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_user_profile_table
 */
@Data
public class UserProfile {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: platform
     */
    private String platform;

    /**
     * Column: os
     */
    private String os;

    /**
     * Column: os_build
     */
    private String osBuild;

    /**
     * Column: description
     */
    private String description;
}