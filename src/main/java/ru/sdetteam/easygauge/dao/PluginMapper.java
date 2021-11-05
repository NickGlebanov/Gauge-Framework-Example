package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Plugin;


public interface PluginMapper {

    @Delete({
        "delete from mantis_plugin_table",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String basename);

    @Insert({
        "insert into mantis_plugin_table (basename, enabled, ",
        "protected, priority)",
        "values (#{basename,jdbcType=VARCHAR}, #{enabled,jdbcType=TINYINT}, ",
        "#{protected,jdbcType=TINYINT}, #{priority,jdbcType=INTEGER})"
    })
    int insert(Plugin row);

    @Select({
        "select",
        "basename, enabled, protected, priority",
        "from mantis_plugin_table",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="basename", property="basename", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="isProtected", jdbcType=JdbcType.TINYINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    Plugin selectByPrimaryKey(String basename);

    @Select({
        "select",
        "basename, enabled, protected, priority",
        "from mantis_plugin_table"
    })
    @Results({
        @Result(column="basename", property="basename", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="isProtected", jdbcType=JdbcType.TINYINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    List<Plugin> selectAll();

    @Update({
        "update mantis_plugin_table",
        "set enabled = #{enabled,jdbcType=TINYINT},",
          "protected = #{protected,jdbcType=TINYINT},",
          "priority = #{priority,jdbcType=INTEGER}",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Plugin row);
}