package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugRevision;


public interface BugRevisionMapper {

    @Delete({
        "delete from mantis_bug_revision_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_bug_revision_table (id, bug_id, ",
        "bugnote_id, user_id, ",
        "`type`, `timestamp`, ",
        "`value`)",
        "values (#{id,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER}, ",
        "#{bugnoteId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER}, #{timestamp,jdbcType=INTEGER}, ",
        "#{value,jdbcType=LONGVARCHAR})"
    })
    int insert(BugRevision row);

    @Select({
        "select",
        "id, bug_id, bugnote_id, user_id, `type`, `timestamp`, `value`",
        "from mantis_bug_revision_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_id", property="bugnoteId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    BugRevision selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, bug_id, bugnote_id, user_id, `type`, `timestamp`, `value`",
        "from mantis_bug_revision_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="bugnote_id", property="bugnoteId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BugRevision> selectAll();

    @Update({
        "update mantis_bug_revision_table",
        "set bug_id = #{bugId,jdbcType=INTEGER},",
          "bugnote_id = #{bugnoteId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "`type` = #{type,jdbcType=INTEGER},",
          "`timestamp` = #{timestamp,jdbcType=INTEGER},",
          "`value` = #{value,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugRevision row);
}