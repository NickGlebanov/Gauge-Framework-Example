package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.Plugin;

@Repository
public interface PluginMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_plugin_table",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(String basename);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_plugin_table (basename, enabled, ",
        "protected, priority)",
        "values (#{basename,jdbcType=VARCHAR}, #{enabled,jdbcType=TINYINT}, ",
        "#{protected,jdbcType=TINYINT}, #{priority,jdbcType=INTEGER})"
    })
    int insert(Plugin row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "basename, enabled, protected, priority",
        "from mantis_plugin_table",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="basename", property="basename", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="protected", jdbcType=JdbcType.TINYINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    Plugin selectByPrimaryKey(String basename);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "basename, enabled, protected, priority",
        "from mantis_plugin_table"
    })
    @Results({
        @Result(column="basename", property="basename", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="protected", jdbcType=JdbcType.TINYINT),
        @Result(column="priority", property="priority", jdbcType=JdbcType.INTEGER)
    })
    List<Plugin> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_plugin_table",
        "set enabled = #{enabled,jdbcType=TINYINT},",
          "protected = #{protected,jdbcType=TINYINT},",
          "priority = #{priority,jdbcType=INTEGER}",
        "where basename = #{basename,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Plugin row);
}