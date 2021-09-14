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
import ru.sdetteam.easygauge.model.Bugnote;

@Repository
public interface BugnoteMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bugnote_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bugnote_table (id, bug_id, ",
        "reporter_id, bugnote_text_id, ",
        "view_state, note_type, ",
        "note_attr, time_tracking, ",
        "last_modified, date_submitted)",
        "values (#{id,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER}, ",
        "#{reporterId,jdbcType=INTEGER}, #{bugnoteTextId,jdbcType=INTEGER}, ",
        "#{viewState,jdbcType=SMALLINT}, #{noteType,jdbcType=INTEGER}, ",
        "#{noteAttr,jdbcType=VARCHAR}, #{timeTracking,jdbcType=INTEGER}, ",
        "#{lastModified,jdbcType=INTEGER}, #{dateSubmitted,jdbcType=INTEGER})"
    })
    int insert(Bugnote row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, reporter_id, bugnote_text_id, view_state, note_type, note_attr, ",
        "time_tracking, last_modified, date_submitted",
        "from mantis_bugnote_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="reporter_id", property="reporterId", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_text_id", property="bugnoteTextId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="note_type", property="noteType", jdbcType=JdbcType.INTEGER),
        @Result(column="note_attr", property="noteAttr", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_tracking", property="timeTracking", jdbcType=JdbcType.INTEGER),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.INTEGER),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER)
    })
    Bugnote selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, reporter_id, bugnote_text_id, view_state, note_type, note_attr, ",
        "time_tracking, last_modified, date_submitted",
        "from mantis_bugnote_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="reporter_id", property="reporterId", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_text_id", property="bugnoteTextId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="note_type", property="noteType", jdbcType=JdbcType.INTEGER),
        @Result(column="note_attr", property="noteAttr", jdbcType=JdbcType.VARCHAR),
        @Result(column="time_tracking", property="timeTracking", jdbcType=JdbcType.INTEGER),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.INTEGER),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER)
    })
    List<Bugnote> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bugnote_table",
        "set bug_id = #{bugId,jdbcType=INTEGER},",
          "reporter_id = #{reporterId,jdbcType=INTEGER},",
          "bugnote_text_id = #{bugnoteTextId,jdbcType=INTEGER},",
          "view_state = #{viewState,jdbcType=SMALLINT},",
          "note_type = #{noteType,jdbcType=INTEGER},",
          "note_attr = #{noteAttr,jdbcType=VARCHAR},",
          "time_tracking = #{timeTracking,jdbcType=INTEGER},",
          "last_modified = #{lastModified,jdbcType=INTEGER},",
          "date_submitted = #{dateSubmitted,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Bugnote row);
}