package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_user_table
 */
@Data
public class User {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: username
     */
    private String username;

    /**
     * Column: realname
     */
    private String realname;

    /**
     * Column: email
     */
    private String email;

    /**
     * Column: password
     */
    private String password;


    private Byte enabled;

    /**
     * Column: protected
     */
    private Byte isProtected;

    /**
     * Column: access_level
     */
    private Short accessLevel;

    /**
     * Column: login_count
     */
    private Integer loginCount;

    /**
     * Column: lost_password_request_count
     */
    private Short lostPasswordRequestCount;

    /**
     * Column: failed_login_count
     */
    private Short failedLoginCount;

    /**
     * Column: cookie_string
     */
    private String cookieString;

    /**
     * Column: last_visit
     */
    private Integer lastVisit;

    /**
     * Column: date_created
     */
    private Integer dateCreated;
}