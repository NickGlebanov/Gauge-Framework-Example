package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.BugTag;

@Repository
public interface BugTagMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_tag_table",
        "where bug_id = #{bugId,jdbcType=INTEGER}",
          "and tag_id = #{tagId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("bugId") Integer bugId, @Param("tagId") Integer tagId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_tag_table (bug_id, tag_id, ",
        "user_id, date_attached)",
        "values (#{bugId,jdbcType=INTEGER}, #{tagId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{dateAttached,jdbcType=INTEGER})"
    })
    int insert(BugTag row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bug_tag_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "date_attached = #{dateAttached,jdbcType=INTEGER}",
        "where bug_id = #{bugId,jdbcType=INTEGER}",
          "and tag_id = #{tagId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugTag row);
}