package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_custom_field_table
 */
@Data
public class CustomField {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: name
     */
    private String name;

    /**
     * Column: type
     */
    private Short type;

    /**
     * Column: default_value
     */
    private String defaultValue;

    /**
     * Column: valid_regexp
     */
    private String validRegexp;

    /**
     * Column: access_level_r
     */
    private Short accessLevelR;

    /**
     * Column: access_level_rw
     */
    private Short accessLevelRw;

    /**
     * Column: length_min
     */
    private Integer lengthMin;

    /**
     * Column: length_max
     */
    private Integer lengthMax;

    /**
     * Column: require_report
     */
    private Byte requireReport;

    /**
     * Column: require_update
     */
    private Byte requireUpdate;

    /**
     * Column: display_report
     */
    private Byte displayReport;

    /**
     * Column: display_update
     */
    private Byte displayUpdate;

    /**
     * Column: require_resolved
     */
    private Byte requireResolved;

    /**
     * Column: display_resolved
     */
    private Byte displayResolved;

    /**
     * Column: display_closed
     */
    private Byte displayClosed;

    /**
     * Column: require_closed
     */
    private Byte requireClosed;

    /**
     * Column: filter_by
     */
    private Byte filterBy;

    /**
     * Column: possible_values
     */
    private String possibleValues;
}