package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_sponsorship_table
 */
@Data
public class Sponsorship {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: bug_id
     */
    private Integer bugId;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: amount
     */
    private Integer amount;

    /**
     * Column: logo
     */
    private String logo;

    /**
     * Column: url
     */
    private String url;

    /**
     * Column: paid
     */
    private Byte paid;

    /**
     * Column: date_submitted
     */
    private Integer dateSubmitted;

    /**
     * Column: last_updated
     */
    private Integer lastUpdated;
}