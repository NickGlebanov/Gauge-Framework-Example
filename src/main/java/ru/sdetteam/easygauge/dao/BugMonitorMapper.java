package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.BugMonitor;

@Repository
public interface BugMonitorMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_monitor_table",
        "where user_id = #{userId,jdbcType=INTEGER}",
          "and bug_id = #{bugId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("userId") Integer userId, @Param("bugId") Integer bugId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_monitor_table (user_id, bug_id)",
        "values (#{userId,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER})"
    })
    int insert(BugMonitor row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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