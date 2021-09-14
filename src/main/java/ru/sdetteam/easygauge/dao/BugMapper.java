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
import ru.sdetteam.easygauge.model.Bug;

@Repository
public interface BugMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_table (id, project_id, ",
        "reporter_id, handler_id, ",
        "duplicate_id, priority, ",
        "severity, reproducibility, ",
        "`status`, resolution, ",
        "projection, eta, ",
        "bug_text_id, os, os_build, ",
        "platform, version, ",
        "fixed_in_version, build, ",
        "profile_id, view_state, ",
        "summary, sponsorship_total, ",
        "sticky, target_version, ",
        "category_id, date_submitted, ",
        "due_date, last_updated)",
        "values (#{id,jdbcType=INTEGER}, #{projectId,jdbcType=INTEGER}, ",
        "#{reporterId,jdbcType=INTEGER}, #{handlerId,jdbcType=INTEGER}, ",
        "#{duplicateId,jdbcType=INTEGER}, #{priority,jdbcType=SMALLINT}, ",
        "#{severity,jdbcType=SMALLINT}, #{reproducibility,jdbcType=SMALLINT}, ",
        "#{status,jdbcType=SMALLINT}, #{resolution,jdbcType=SMALLINT}, ",
        "#{projection,jdbcType=SMALLINT}, #{eta,jdbcType=SMALLINT}, ",
        "#{bugTextId,jdbcType=INTEGER}, #{os,jdbcType=VARCHAR}, #{osBuild,jdbcType=VARCHAR}, ",
        "#{platform,jdbcType=VARCHAR}, #{version,jdbcType=VARCHAR}, ",
        "#{fixedInVersion,jdbcType=VARCHAR}, #{build,jdbcType=VARCHAR}, ",
        "#{profileId,jdbcType=INTEGER}, #{viewState,jdbcType=SMALLINT}, ",
        "#{summary,jdbcType=VARCHAR}, #{sponsorshipTotal,jdbcType=INTEGER}, ",
        "#{sticky,jdbcType=TINYINT}, #{targetVersion,jdbcType=VARCHAR}, ",
        "#{categoryId,jdbcType=INTEGER}, #{dateSubmitted,jdbcType=INTEGER}, ",
        "#{dueDate,jdbcType=INTEGER}, #{lastUpdated,jdbcType=INTEGER})"
    })
    int insert(Bug row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, project_id, reporter_id, handler_id, duplicate_id, priority, severity, reproducibility, ",
        "`status`, resolution, projection, eta, bug_text_id, os, os_build, platform, ",
        "version, fixed_in_version, build, profile_id, view_state, summary, sponsorship_total, ",
        "sticky, target_version, category_id, date_submitted, due_date, last_updated",
        "from mantis_bug_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="reporter_id", property="reporterId", jdbcType=JdbcType.INTEGER),
        @Result(column="handler_id", property="handlerId", jdbcType=JdbcType.INTEGER),
        @Result(column="duplicate_id", property="duplicateId", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.SMALLINT),
        @Result(column="severity", property="severity", jdbcType=JdbcType.SMALLINT),
        @Result(column="reproducibility", property="reproducibility", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="resolution", property="resolution", jdbcType=JdbcType.SMALLINT),
        @Result(column="projection", property="projection", jdbcType=JdbcType.SMALLINT),
        @Result(column="eta", property="eta", jdbcType=JdbcType.SMALLINT),
        @Result(column="bug_text_id", property="bugTextId", jdbcType=JdbcType.INTEGER),
        @Result(column="os", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_build", property="osBuild", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="fixed_in_version", property="fixedInVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="build", property="build", jdbcType=JdbcType.VARCHAR),
        @Result(column="profile_id", property="profileId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="sponsorship_total", property="sponsorshipTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="sticky", property="sticky", jdbcType=JdbcType.TINYINT),
        @Result(column="target_version", property="targetVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER),
        @Result(column="due_date", property="dueDate", jdbcType=JdbcType.INTEGER),
        @Result(column="last_updated", property="lastUpdated", jdbcType=JdbcType.INTEGER)
    })
    Bug selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, project_id, reporter_id, handler_id, duplicate_id, priority, severity, reproducibility, ",
        "`status`, resolution, projection, eta, bug_text_id, os, os_build, platform, ",
        "version, fixed_in_version, build, profile_id, view_state, summary, sponsorship_total, ",
        "sticky, target_version, category_id, date_submitted, due_date, last_updated",
        "from mantis_bug_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="reporter_id", property="reporterId", jdbcType=JdbcType.INTEGER),
        @Result(column="handler_id", property="handlerId", jdbcType=JdbcType.INTEGER),
        @Result(column="duplicate_id", property="duplicateId", jdbcType=JdbcType.INTEGER),
        @Result(column="priority", property="priority", jdbcType=JdbcType.SMALLINT),
        @Result(column="severity", property="severity", jdbcType=JdbcType.SMALLINT),
        @Result(column="reproducibility", property="reproducibility", jdbcType=JdbcType.SMALLINT),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="resolution", property="resolution", jdbcType=JdbcType.SMALLINT),
        @Result(column="projection", property="projection", jdbcType=JdbcType.SMALLINT),
        @Result(column="eta", property="eta", jdbcType=JdbcType.SMALLINT),
        @Result(column="bug_text_id", property="bugTextId", jdbcType=JdbcType.INTEGER),
        @Result(column="os", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_build", property="osBuild", jdbcType=JdbcType.VARCHAR),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="fixed_in_version", property="fixedInVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="build", property="build", jdbcType=JdbcType.VARCHAR),
        @Result(column="profile_id", property="profileId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="sponsorship_total", property="sponsorshipTotal", jdbcType=JdbcType.INTEGER),
        @Result(column="sticky", property="sticky", jdbcType=JdbcType.TINYINT),
        @Result(column="target_version", property="targetVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER),
        @Result(column="due_date", property="dueDate", jdbcType=JdbcType.INTEGER),
        @Result(column="last_updated", property="lastUpdated", jdbcType=JdbcType.INTEGER)
    })
    List<Bug> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bug_table",
        "set project_id = #{projectId,jdbcType=INTEGER},",
          "reporter_id = #{reporterId,jdbcType=INTEGER},",
          "handler_id = #{handlerId,jdbcType=INTEGER},",
          "duplicate_id = #{duplicateId,jdbcType=INTEGER},",
          "priority = #{priority,jdbcType=SMALLINT},",
          "severity = #{severity,jdbcType=SMALLINT},",
          "reproducibility = #{reproducibility,jdbcType=SMALLINT},",
          "`status` = #{status,jdbcType=SMALLINT},",
          "resolution = #{resolution,jdbcType=SMALLINT},",
          "projection = #{projection,jdbcType=SMALLINT},",
          "eta = #{eta,jdbcType=SMALLINT},",
          "bug_text_id = #{bugTextId,jdbcType=INTEGER},",
          "os = #{os,jdbcType=VARCHAR},",
          "os_build = #{osBuild,jdbcType=VARCHAR},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "version = #{version,jdbcType=VARCHAR},",
          "fixed_in_version = #{fixedInVersion,jdbcType=VARCHAR},",
          "build = #{build,jdbcType=VARCHAR},",
          "profile_id = #{profileId,jdbcType=INTEGER},",
          "view_state = #{viewState,jdbcType=SMALLINT},",
          "summary = #{summary,jdbcType=VARCHAR},",
          "sponsorship_total = #{sponsorshipTotal,jdbcType=INTEGER},",
          "sticky = #{sticky,jdbcType=TINYINT},",
          "target_version = #{targetVersion,jdbcType=VARCHAR},",
          "category_id = #{categoryId,jdbcType=INTEGER},",
          "date_submitted = #{dateSubmitted,jdbcType=INTEGER},",
          "due_date = #{dueDate,jdbcType=INTEGER},",
          "last_updated = #{lastUpdated,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Bug row);
}