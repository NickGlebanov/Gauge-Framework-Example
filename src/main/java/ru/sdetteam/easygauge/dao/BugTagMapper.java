package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugTag;


public interface BugTagMapper {
    @Delete({
        "delete from mantis_bug_tag_table",
        "where bug_id = #{bugId,jdbcType=INTEGER}",
          "and tag_id = #{tagId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("bugId") Integer bugId, @Param("tagId") Integer tagId);

    @Insert({
        "insert into mantis_bug_tag_table (bug_id, tag_id, ",
        "user_id, date_attached)",
        "values (#{bugId,jdbcType=INTEGER}, #{tagId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{dateAttached,jdbcType=INTEGER})"
    })
    int insert(BugTag row);

    @Select({
        "select",
        "bug_id, tag_id, user_id, date_attached",
        "from mantis_bug_tag_table",
        "where bug_id = #{bugId,jdbcType=INTEGER}",
          "and tag_id = #{tagId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_attached", property="dateAttached", jdbcType=JdbcType.INTEGER)
    })
    BugTag selectByPrimaryKey(@Param("bugId") Integer bugId, @Param("tagId") Integer tagId);

    @Select({
        "select",
        "bug_id, tag_id, user_id, date_attached",
        "from mantis_bug_tag_table"
    })
    @Results({
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="tag_id", property="tagId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_attached", property="dateAttached", jdbcType=JdbcType.INTEGER)
    })
    List<BugTag> selectAll();

    @Update({
        "update mantis_bug_tag_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "date_attached = #{dateAttached,jdbcType=INTEGER}",
        "where bug_id = #{bugId,jdbcType=INTEGER}",
          "and tag_id = #{tagId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugTag row);
}