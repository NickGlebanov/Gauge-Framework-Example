package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Category;


public interface CategoryMapper {

    @Delete({
        "delete from mantis_category_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_category_table (id, project_id, ",
        "user_id, `name`, `status`)",
        "values (#{id,jdbcType=INTEGER}, #{projectId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, #{status,jdbcType=INTEGER})"
    })
    int insert(Category row);

    @Select({
        "select",
        "id, project_id, user_id, `name`, `status`",
        "from mantis_category_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    Category selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, project_id, user_id, `name`, `status`",
        "from mantis_category_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.INTEGER)
    })
    List<Category> selectAll();

    @Update({
        "update mantis_category_table",
        "set project_id = #{projectId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "`status` = #{status,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Category row);
}