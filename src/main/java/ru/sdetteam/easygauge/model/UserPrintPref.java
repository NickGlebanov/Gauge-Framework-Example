package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_user_print_pref_table
 */
@Data
public class UserPrintPref {
    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: print_pref
     */
    private String printPref;
}