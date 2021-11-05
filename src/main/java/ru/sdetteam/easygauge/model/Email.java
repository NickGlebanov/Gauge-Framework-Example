package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_email_table
 */
@Data
public class Email {
    /**
     * Column: email_id
     */
    private Integer emailId;

    /**
     * Column: email
     */
    private String email;

    /**
     * Column: subject
     */
    private String subject;

    /**
     * Column: submitted
     */
    private Integer submitted;

    /**
     * Column: metadata
     */
    private String metadata;

    /**
     * Column: body
     */
    private String body;
}