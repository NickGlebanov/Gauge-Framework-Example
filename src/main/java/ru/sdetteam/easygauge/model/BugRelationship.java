package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_relationship_table
 */
@Data
public class BugRelationship {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: source_bug_id
     */
    private Integer sourceBugId;

    /**
     * Column: destination_bug_id
     */
    private Integer destinationBugId;

    /**
     * Column: relationship_type
     */
    private Short relationshipType;
}