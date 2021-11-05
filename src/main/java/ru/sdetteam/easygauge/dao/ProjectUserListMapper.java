package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.ProjectUserList;


public interface ProjectUserListMapper {

    @Delete({
        "delete from mantis_project_user_list_table",
        "where project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("projectId") Integer projectId, @Param("userId") Integer userId);

    @Insert({
        "insert into mantis_project_user_list_table (project_id, user_id, ",
        "access_level)",
        "values (#{projectId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{accessLevel,jdbcType=SMALLINT})"
    })
    int insert(ProjectUserList row);

    @Select({
        "select",
        "project_id, user_id, access_level",
        "from mantis_project_user_list_table",
        "where project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_level", property="accessLevel", jdbcType=JdbcType.SMALLINT)
    })
    ProjectUserList selectByPrimaryKey(@Param("projectId") Integer projectId, @Param("userId") Integer userId);

    @Select({
        "select",
        "project_id, user_id, access_level",
        "from mantis_project_user_list_table"
    })
    @Results({
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_level", property="accessLevel", jdbcType=JdbcType.SMALLINT)
    })
    List<ProjectUserList> selectAll();

    @Update({
        "update mantis_project_user_list_table",
        "set access_level = #{accessLevel,jdbcType=SMALLINT}",
        "where project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectUserList row);
}