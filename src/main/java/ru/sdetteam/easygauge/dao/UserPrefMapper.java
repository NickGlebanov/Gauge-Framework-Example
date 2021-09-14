package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.UserPref;

@Repository
public interface UserPrefMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_user_pref_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_user_pref_table (id, user_id, ",
        "project_id, default_profile, ",
        "default_project, refresh_delay, ",
        "redirect_delay, bugnote_order, ",
        "email_on_new, email_on_assigned, ",
        "email_on_feedback, email_on_resolved, ",
        "email_on_closed, email_on_reopened, ",
        "email_on_bugnote, email_on_status, ",
        "email_on_priority, email_on_priority_min_severity, ",
        "email_on_status_min_severity, email_on_bugnote_min_severity, ",
        "email_on_reopened_min_severity, email_on_closed_min_severity, ",
        "email_on_resolved_min_severity, email_on_feedback_min_severity, ",
        "email_on_assigned_min_severity, email_on_new_min_severity, ",
        "email_bugnote_limit, `language`, ",
        "timezone)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{projectId,jdbcType=INTEGER}, #{defaultProfile,jdbcType=INTEGER}, ",
        "#{defaultProject,jdbcType=INTEGER}, #{refreshDelay,jdbcType=INTEGER}, ",
        "#{redirectDelay,jdbcType=INTEGER}, #{bugnoteOrder,jdbcType=VARCHAR}, ",
        "#{emailOnNew,jdbcType=TINYINT}, #{emailOnAssigned,jdbcType=TINYINT}, ",
        "#{emailOnFeedback,jdbcType=TINYINT}, #{emailOnResolved,jdbcType=TINYINT}, ",
        "#{emailOnClosed,jdbcType=TINYINT}, #{emailOnReopened,jdbcType=TINYINT}, ",
        "#{emailOnBugnote,jdbcType=TINYINT}, #{emailOnStatus,jdbcType=TINYINT}, ",
        "#{emailOnPriority,jdbcType=TINYINT}, #{emailOnPriorityMinSeverity,jdbcType=SMALLINT}, ",
        "#{emailOnStatusMinSeverity,jdbcType=SMALLINT}, #{emailOnBugnoteMinSeverity,jdbcType=SMALLINT}, ",
        "#{emailOnReopenedMinSeverity,jdbcType=SMALLINT}, #{emailOnClosedMinSeverity,jdbcType=SMALLINT}, ",
        "#{emailOnResolvedMinSeverity,jdbcType=SMALLINT}, #{emailOnFeedbackMinSeverity,jdbcType=SMALLINT}, ",
        "#{emailOnAssignedMinSeverity,jdbcType=SMALLINT}, #{emailOnNewMinSeverity,jdbcType=SMALLINT}, ",
        "#{emailBugnoteLimit,jdbcType=SMALLINT}, #{language,jdbcType=VARCHAR}, ",
        "#{timezone,jdbcType=VARCHAR})"
    })
    int insert(UserPref row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, user_id, project_id, default_profile, default_project, refresh_delay, redirect_delay, ",
        "bugnote_order, email_on_new, email_on_assigned, email_on_feedback, email_on_resolved, ",
        "email_on_closed, email_on_reopened, email_on_bugnote, email_on_status, email_on_priority, ",
        "email_on_priority_min_severity, email_on_status_min_severity, email_on_bugnote_min_severity, ",
        "email_on_reopened_min_severity, email_on_closed_min_severity, email_on_resolved_min_severity, ",
        "email_on_feedback_min_severity, email_on_assigned_min_severity, email_on_new_min_severity, ",
        "email_bugnote_limit, `language`, timezone",
        "from mantis_user_pref_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="default_profile", property="defaultProfile", jdbcType=JdbcType.INTEGER),
        @Result(column="default_project", property="defaultProject", jdbcType=JdbcType.INTEGER),
        @Result(column="refresh_delay", property="refreshDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="redirect_delay", property="redirectDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_order", property="bugnoteOrder", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_on_new", property="emailOnNew", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_assigned", property="emailOnAssigned", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_feedback", property="emailOnFeedback", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_resolved", property="emailOnResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_closed", property="emailOnClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_reopened", property="emailOnReopened", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_bugnote", property="emailOnBugnote", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_status", property="emailOnStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_priority", property="emailOnPriority", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_priority_min_severity", property="emailOnPriorityMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_status_min_severity", property="emailOnStatusMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_bugnote_min_severity", property="emailOnBugnoteMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_reopened_min_severity", property="emailOnReopenedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_closed_min_severity", property="emailOnClosedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_resolved_min_severity", property="emailOnResolvedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_feedback_min_severity", property="emailOnFeedbackMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_assigned_min_severity", property="emailOnAssignedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_new_min_severity", property="emailOnNewMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_bugnote_limit", property="emailBugnoteLimit", jdbcType=JdbcType.SMALLINT),
        @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="timezone", property="timezone", jdbcType=JdbcType.VARCHAR)
    })
    UserPref selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, user_id, project_id, default_profile, default_project, refresh_delay, redirect_delay, ",
        "bugnote_order, email_on_new, email_on_assigned, email_on_feedback, email_on_resolved, ",
        "email_on_closed, email_on_reopened, email_on_bugnote, email_on_status, email_on_priority, ",
        "email_on_priority_min_severity, email_on_status_min_severity, email_on_bugnote_min_severity, ",
        "email_on_reopened_min_severity, email_on_closed_min_severity, email_on_resolved_min_severity, ",
        "email_on_feedback_min_severity, email_on_assigned_min_severity, email_on_new_min_severity, ",
        "email_bugnote_limit, `language`, timezone",
        "from mantis_user_pref_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="default_profile", property="defaultProfile", jdbcType=JdbcType.INTEGER),
        @Result(column="default_project", property="defaultProject", jdbcType=JdbcType.INTEGER),
        @Result(column="refresh_delay", property="refreshDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="redirect_delay", property="redirectDelay", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_order", property="bugnoteOrder", jdbcType=JdbcType.VARCHAR),
        @Result(column="email_on_new", property="emailOnNew", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_assigned", property="emailOnAssigned", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_feedback", property="emailOnFeedback", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_resolved", property="emailOnResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_closed", property="emailOnClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_reopened", property="emailOnReopened", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_bugnote", property="emailOnBugnote", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_status", property="emailOnStatus", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_priority", property="emailOnPriority", jdbcType=JdbcType.TINYINT),
        @Result(column="email_on_priority_min_severity", property="emailOnPriorityMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_status_min_severity", property="emailOnStatusMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_bugnote_min_severity", property="emailOnBugnoteMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_reopened_min_severity", property="emailOnReopenedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_closed_min_severity", property="emailOnClosedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_resolved_min_severity", property="emailOnResolvedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_feedback_min_severity", property="emailOnFeedbackMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_assigned_min_severity", property="emailOnAssignedMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_on_new_min_severity", property="emailOnNewMinSeverity", jdbcType=JdbcType.SMALLINT),
        @Result(column="email_bugnote_limit", property="emailBugnoteLimit", jdbcType=JdbcType.SMALLINT),
        @Result(column="language", property="language", jdbcType=JdbcType.VARCHAR),
        @Result(column="timezone", property="timezone", jdbcType=JdbcType.VARCHAR)
    })
    List<UserPref> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_user_pref_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "project_id = #{projectId,jdbcType=INTEGER},",
          "default_profile = #{defaultProfile,jdbcType=INTEGER},",
          "default_project = #{defaultProject,jdbcType=INTEGER},",
          "refresh_delay = #{refreshDelay,jdbcType=INTEGER},",
          "redirect_delay = #{redirectDelay,jdbcType=INTEGER},",
          "bugnote_order = #{bugnoteOrder,jdbcType=VARCHAR},",
          "email_on_new = #{emailOnNew,jdbcType=TINYINT},",
          "email_on_assigned = #{emailOnAssigned,jdbcType=TINYINT},",
          "email_on_feedback = #{emailOnFeedback,jdbcType=TINYINT},",
          "email_on_resolved = #{emailOnResolved,jdbcType=TINYINT},",
          "email_on_closed = #{emailOnClosed,jdbcType=TINYINT},",
          "email_on_reopened = #{emailOnReopened,jdbcType=TINYINT},",
          "email_on_bugnote = #{emailOnBugnote,jdbcType=TINYINT},",
          "email_on_status = #{emailOnStatus,jdbcType=TINYINT},",
          "email_on_priority = #{emailOnPriority,jdbcType=TINYINT},",
          "email_on_priority_min_severity = #{emailOnPriorityMinSeverity,jdbcType=SMALLINT},",
          "email_on_status_min_severity = #{emailOnStatusMinSeverity,jdbcType=SMALLINT},",
          "email_on_bugnote_min_severity = #{emailOnBugnoteMinSeverity,jdbcType=SMALLINT},",
          "email_on_reopened_min_severity = #{emailOnReopenedMinSeverity,jdbcType=SMALLINT},",
          "email_on_closed_min_severity = #{emailOnClosedMinSeverity,jdbcType=SMALLINT},",
          "email_on_resolved_min_severity = #{emailOnResolvedMinSeverity,jdbcType=SMALLINT},",
          "email_on_feedback_min_severity = #{emailOnFeedbackMinSeverity,jdbcType=SMALLINT},",
          "email_on_assigned_min_severity = #{emailOnAssignedMinSeverity,jdbcType=SMALLINT},",
          "email_on_new_min_severity = #{emailOnNewMinSeverity,jdbcType=SMALLINT},",
          "email_bugnote_limit = #{emailBugnoteLimit,jdbcType=SMALLINT},",
          "`language` = #{language,jdbcType=VARCHAR},",
          "timezone = #{timezone,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserPref row);
}