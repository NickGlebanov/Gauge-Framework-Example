package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_text_table
 */
@Data
public class BugText {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: description
     */
    private String description;

    /**
     * Column: steps_to_reproduce
     */
    private String stepsToReproduce;

    /**
     * Column: additional_information
     */
    private String additionalInformation;
}