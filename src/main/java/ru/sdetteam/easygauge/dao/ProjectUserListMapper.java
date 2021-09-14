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
import ru.sdetteam.easygauge.model.ProjectUserList;

@Repository
public interface ProjectUserListMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_project_user_list_table",
        "where project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("projectId") Integer projectId, @Param("userId") Integer userId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_project_user_list_table (project_id, user_id, ",
        "access_level)",
        "values (#{projectId,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{accessLevel,jdbcType=SMALLINT})"
    })
    int insert(ProjectUserList row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_project_user_list_table",
        "set access_level = #{accessLevel,jdbcType=SMALLINT}",
        "where project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectUserList row);
}