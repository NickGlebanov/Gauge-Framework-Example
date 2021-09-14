package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.UserProfile;


public interface UserProfileMapper {

    @Delete({
        "delete from mantis_user_profile_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);


    @Insert({
        "insert into mantis_user_profile_table (id, user_id, ",
        "platform, os, os_build, ",
        "description)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{platform,jdbcType=VARCHAR}, #{os,jdbcType=VARCHAR}, #{osBuild,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    int insert(UserProfile row);


    @Select({
        "select",
        "id, user_id, platform, os, os_build, description",
        "from mantis_user_profile_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="os", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_build", property="osBuild", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    UserProfile selectByPrimaryKey(Integer id);


    @Select({
        "select",
        "id, user_id, platform, os, os_build, description",
        "from mantis_user_profile_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="platform", property="platform", jdbcType=JdbcType.VARCHAR),
        @Result(column="os", property="os", jdbcType=JdbcType.VARCHAR),
        @Result(column="os_build", property="osBuild", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<UserProfile> selectAll();


    @Update({
        "update mantis_user_profile_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "platform = #{platform,jdbcType=VARCHAR},",
          "os = #{os,jdbcType=VARCHAR},",
          "os_build = #{osBuild,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserProfile row);
}