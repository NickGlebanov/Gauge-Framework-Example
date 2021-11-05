package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_tokens_table
 */
@Data
public class Tokens {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: owner
     */
    private Integer owner;

    /**
     * Column: type
     */
    private Integer type;

    /**
     * Column: timestamp
     */
    private Integer timestamp;

    /**
     * Column: expiry
     */
    private Integer expiry;

    /**
     * Column: value
     */
    private String value;
}