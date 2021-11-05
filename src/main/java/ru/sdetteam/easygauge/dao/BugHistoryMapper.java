package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugHistory;


public interface BugHistoryMapper {

    @Delete({
        "delete from mantis_bug_history_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_bug_history_table (id, user_id, ",
        "bug_id, field_name, ",
        "old_value, new_value, ",
        "`type`, date_modified)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{bugId,jdbcType=INTEGER}, #{fieldName,jdbcType=VARCHAR}, ",
        "#{oldValue,jdbcType=VARCHAR}, #{newValue,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=SMALLINT}, #{dateModified,jdbcType=INTEGER})"
    })
    int insert(BugHistory row);

    @Select({
        "select",
        "id, user_id, bug_id, field_name, old_value, new_value, `type`, date_modified",
        "from mantis_bug_history_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="old_value", property="oldValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="new_value", property="newValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="date_modified", property="dateModified", jdbcType=JdbcType.INTEGER)
    })
    BugHistory selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, user_id, bug_id, field_name, old_value, new_value, `type`, date_modified",
        "from mantis_bug_history_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="field_name", property="fieldName", jdbcType=JdbcType.VARCHAR),
        @Result(column="old_value", property="oldValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="new_value", property="newValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="date_modified", property="dateModified", jdbcType=JdbcType.INTEGER)
    })
    List<BugHistory> selectAll();

    @Update({
        "update mantis_bug_history_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "bug_id = #{bugId,jdbcType=INTEGER},",
          "field_name = #{fieldName,jdbcType=VARCHAR},",
          "old_value = #{oldValue,jdbcType=VARCHAR},",
          "new_value = #{newValue,jdbcType=VARCHAR},",
          "`type` = #{type,jdbcType=SMALLINT},",
          "date_modified = #{dateModified,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugHistory row);
}