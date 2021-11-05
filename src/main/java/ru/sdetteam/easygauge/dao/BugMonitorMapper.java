package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugMonitor;


public interface BugMonitorMapper {

    @Delete({
        "delete from mantis_bug_monitor_table",
        "where user_id = #{userId,jdbcType=INTEGER}",
          "and bug_id = #{bugId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("bugId") Integer bugId);

    @Insert({
        "insert into mantis_bug_monitor_table (user_id, bug_id)",
        "values (#{userId,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER})"
    })
    int insert(BugMonitor row);

    @Select({
        "select",
        "user_id, bug_id",
        "from mantis_bug_monitor_table"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER, id=true)
    })
    List<BugMonitor> selectAll();
}