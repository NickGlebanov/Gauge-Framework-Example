package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_plugin_table
 */
@Data
public class Plugin {
    /**
     * Column: basename
     */
    private String basename;

    /**
     * Column: enabled
     */
    private Byte enabled;

    /**
     * Column: protected
     */
    private Byte isProtected;

    /**
     * Column: priority
     */
    private Integer priority;
}