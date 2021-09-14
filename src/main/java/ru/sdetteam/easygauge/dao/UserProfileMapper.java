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
import ru.sdetteam.easygauge.model.UserProfile;

@Repository
public interface UserProfileMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_user_profile_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_user_profile_table (id, user_id, ",
        "platform, os, os_build, ",
        "description)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{platform,jdbcType=VARCHAR}, #{os,jdbcType=VARCHAR}, #{osBuild,jdbcType=VARCHAR}, ",
        "#{description,jdbcType=LONGVARCHAR})"
    })
    int insert(UserProfile row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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