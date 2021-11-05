package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.CustomFieldProject;


public interface CustomFieldProjectMapper {

    @Delete({
        "delete from mantis_custom_field_project_table",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and project_id = #{projectId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("fieldId") Integer fieldId, @Param("projectId") Integer projectId);

    @Insert({
        "insert into mantis_custom_field_project_table (field_id, project_id, ",
        "`sequence`)",
        "values (#{fieldId,jdbcType=INTEGER}, #{projectId,jdbcType=INTEGER}, ",
        "#{sequence,jdbcType=SMALLINT})"
    })
    int insert(CustomFieldProject row);

    @Select({
        "select",
        "field_id, project_id, `sequence`",
        "from mantis_custom_field_project_table",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and project_id = #{projectId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="field_id", property="fieldId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.SMALLINT)
    })
    CustomFieldProject selectByPrimaryKey(@Param("fieldId") Integer fieldId, @Param("projectId") Integer projectId);

    @Select({
        "select",
        "field_id, project_id, `sequence`",
        "from mantis_custom_field_project_table"
    })
    @Results({
        @Result(column="field_id", property="fieldId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="sequence", property="sequence", jdbcType=JdbcType.SMALLINT)
    })
    List<CustomFieldProject> selectAll();

    @Update({
        "update mantis_custom_field_project_table",
        "set `sequence` = #{sequence,jdbcType=SMALLINT}",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and project_id = #{projectId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CustomFieldProject row);
}