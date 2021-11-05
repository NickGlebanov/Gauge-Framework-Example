package ru.sdetteam.easygauge.model;

import lombok.Data;

/**
 * Table: mantis_bug_table
 */
@Data
public class Bug {
    /**
     * Column: id
     */
    private Integer id;

    /**
     * Column: project_id
     */
    private Integer projectId;

    /**
     * Column: reporter_id
     */
    private Integer reporterId;

    /**
     * Column: handler_id
     */
    private Integer handlerId;

    /**
     * Column: duplicate_id
     */
    private Integer duplicateId;

    /**
     * Column: priority
     */
    private Short priority;

    /**
     * Column: severity
     */
    private Short severity;

    /**
     * Column: reproducibility
     */
    private Short reproducibility;

    /**
     * Column: status
     */
    private Short status;

    /**
     * Column: resolution
     */
    private Short resolution;

    /**
     * Column: projection
     */
    private Short projection;

    /**
     * Column: eta
     */
    private Short eta;

    /**
     * Column: bug_text_id
     */
    private Integer bugTextId;

    /**
     * Column: os
     */
    private String os;

    /**
     * Column: os_build
     */
    private String osBuild;

    /**
     * Column: platform
     */
    private String platform;

    /**
     * Column: version
     */
    private String version;

    /**
     * Column: fixed_in_version
     */
    private String fixedInVersion;

    /**
     * Column: build
     */
    private String build;

    /**
     * Column: profile_id
     */
    private Integer profileId;

    /**
     * Column: view_state
     */
    private Short viewState;

    /**
     * Column: summary
     */
    private String summary;

    /**
     * Column: sponsorship_total
     */
    private Integer sponsorshipTotal;

    /**
     * Column: sticky
     */
    private Byte sticky;

    /**
     * Column: target_version
     */
    private String targetVersion;

    /**
     * Column: category_id
     */
    private Integer categoryId;

    /**
     * Column: date_submitted
     */
    private Integer dateSubmitted;

    /**
     * Column: due_date
     */
    private Integer dueDate;

    /**
     * Column: last_updated
     */
    private Integer lastUpdated;
}