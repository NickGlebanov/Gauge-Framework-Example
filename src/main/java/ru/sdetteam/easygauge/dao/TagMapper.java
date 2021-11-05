package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Tag;


public interface TagMapper {

    @Delete({
        "delete from mantis_tag_table",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    @Insert({
        "insert into mantis_tag_table (id, `name`, ",
        "user_id, date_created, ",
        "date_updated, description)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{dateCreated,jdbcType=INTEGER}, ",
        "#{dateUpdated,jdbcType=INTEGER}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(Tag row);

    @Select({
        "select",
        "id, `name`, user_id, date_created, date_updated, description",
        "from mantis_tag_table",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_updated", property="dateUpdated", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    Tag selectByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    @Select({
        "select",
        "id, `name`, user_id, date_created, date_updated, description",
        "from mantis_tag_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_updated", property="dateUpdated", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Tag> selectAll();

    @Update({
        "update mantis_tag_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "date_created = #{dateCreated,jdbcType=INTEGER},",
          "date_updated = #{dateUpdated,jdbcType=INTEGER},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Tag row);
}