package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_monitor_table
 */
@Data
public class BugMonitor {
    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: bug_id
     */
    private Integer bugId;
}