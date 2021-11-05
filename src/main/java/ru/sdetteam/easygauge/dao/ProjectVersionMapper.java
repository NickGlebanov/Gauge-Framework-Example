package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.ProjectVersion;


public interface ProjectVersionMapper {

    @Delete({
        "delete from mantis_project_version_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_project_version_table (id, project_id, ",
        "version, released, ",
        "obsolete, date_order, ",
        "description)",
        "values (#{id,jdbcType=INTEGER}, #{projectId,jdbcType=INTEGER}, ",
        "#{version,jdbcType=VARCHAR}, #{released,jdbcType=TINYINT}, ",
        "#{obsolete,jdbcType=TINYINT}, #{dateOrder,jdbcType=INTEGER}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    int insert(ProjectVersion row);

    @Select({
        "select",
        "id, project_id, version, released, obsolete, date_order, description",
        "from mantis_project_version_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="released", property="released", jdbcType=JdbcType.TINYINT),
        @Result(column="obsolete", property="obsolete", jdbcType=JdbcType.TINYINT),
        @Result(column="date_order", property="dateOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    ProjectVersion selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, project_id, version, released, obsolete, date_order, description",
        "from mantis_project_version_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="released", property="released", jdbcType=JdbcType.TINYINT),
        @Result(column="obsolete", property="obsolete", jdbcType=JdbcType.TINYINT),
        @Result(column="date_order", property="dateOrder", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<ProjectVersion> selectAll();

    @Update({
        "update mantis_project_version_table",
        "set project_id = #{projectId,jdbcType=INTEGER},",
          "version = #{version,jdbcType=VARCHAR},",
          "released = #{released,jdbcType=TINYINT},",
          "obsolete = #{obsolete,jdbcType=TINYINT},",
          "date_order = #{dateOrder,jdbcType=INTEGER},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ProjectVersion row);
}