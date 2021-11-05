package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Config;


public interface ConfigMapper {

    @Delete({
        "delete from mantis_config_table",
        "where config_id = #{configId,jdbcType=VARCHAR}",
          "and project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("configId") String configId, @Param("projectId") Integer projectId, @Param("userId") Integer userId);

    @Insert({
        "insert into mantis_config_table (config_id, project_id, ",
        "user_id, access_reqd, ",
        "`type`, `value`)",
        "values (#{configId,jdbcType=VARCHAR}, #{projectId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{accessReqd,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER}, #{value,jdbcType=LONGVARCHAR})"
    })
    int insert(Config row);

    @Select({
        "select",
        "config_id, project_id, user_id, access_reqd, `type`, `value`",
        "from mantis_config_table",
        "where config_id = #{configId,jdbcType=VARCHAR}",
          "and project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="config_id", property="configId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_reqd", property="accessReqd", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    Config selectByPrimaryKey(@Param("configId") String configId, @Param("projectId") Integer projectId, @Param("userId") Integer userId);

    @Select({
        "select",
        "config_id, project_id, user_id, access_reqd, `type`, `value`",
        "from mantis_config_table"
    })
    @Results({
        @Result(column="config_id", property="configId", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="access_reqd", property="accessReqd", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Config> selectAll();

    @Update({
        "update mantis_config_table",
        "set access_reqd = #{accessReqd,jdbcType=INTEGER},",
          "`type` = #{type,jdbcType=INTEGER},",
          "`value` = #{value,jdbcType=LONGVARCHAR}",
        "where config_id = #{configId,jdbcType=VARCHAR}",
          "and project_id = #{projectId,jdbcType=INTEGER}",
          "and user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Config row);
}