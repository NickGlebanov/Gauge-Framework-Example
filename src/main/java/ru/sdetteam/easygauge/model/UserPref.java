package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_user_pref_table
 */
@Data
public class UserPref {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: user_id
     */
    private Integer userId;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: default_profile
     */
    private Integer defaultProfile;

    /**
     * Column: default_project
     */
    private Integer defaultProject;

    /**
     * Column: refresh_delay
     */
    private Integer refreshDelay;

    /**
     * Column: redirect_delay
     */
    private Integer redirectDelay;

    /**
     * Column: bugnote_order
     */
    private String bugnoteOrder;

    /**
     * Column: email_on_new
     */
    private Byte emailOnNew;

    /**
     * Column: email_on_assigned
     */
    private Byte emailOnAssigned;

    /**
     * Column: email_on_feedback
     */
    private Byte emailOnFeedback;

    /**
     * Column: email_on_resolved
     */
    private Byte emailOnResolved;

    /**
     * Column: email_on_closed
     */
    private Byte emailOnClosed;

    /**
     * Column: email_on_reopened
     */
    private Byte emailOnReopened;

    /**
     * Column: email_on_bugnote
     */
    private Byte emailOnBugnote;

    /**
     * Column: email_on_status
     */
    private Byte emailOnStatus;

    /**
     * Column: email_on_priority
     */
    private Byte emailOnPriority;

    /**
     * Column: email_on_priority_min_severity
     */
    private Short emailOnPriorityMinSeverity;

    /**
     * Column: email_on_status_min_severity
     */
    private Short emailOnStatusMinSeverity;

    /**
     * Column: email_on_bugnote_min_severity
     */
    private Short emailOnBugnoteMinSeverity;

    /**
     * Column: email_on_reopened_min_severity
     */
    private Short emailOnReopenedMinSeverity;

    /**
     * Column: email_on_closed_min_severity
     */
    private Short emailOnClosedMinSeverity;

    /**
     * Column: email_on_resolved_min_severity
     */
    private Short emailOnResolvedMinSeverity;

    /**
     * Column: email_on_feedback_min_severity
     */
    private Short emailOnFeedbackMinSeverity;

    /**
     * Column: email_on_assigned_min_severity
     */
    private Short emailOnAssignedMinSeverity;

    /**
     * Column: email_on_new_min_severity
     */
    private Short emailOnNewMinSeverity;

    /**
     * Column: email_bugnote_limit
     */
    private Short emailBugnoteLimit;

    /**
     * Column: language
     */
    private String language;

    /**
     * Column: timezone
     */
    private String timezone;
}