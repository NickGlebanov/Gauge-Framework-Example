package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Select;
import ru.sdetteam.easygauge.model.User;

import java.util.List;


public interface UserMapper {

    @Delete({
        "delete from mantis_user_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);


    @Insert({
        "insert into mantis_user_table (id, username, ",
        "realname, email, ",
        "`password`, enabled, ",
        "protected, access_level, ",
        "login_count, lost_password_request_count, ",
        "failed_login_count, cookie_string, ",
        "last_visit, date_created)",
        "values (#{id,jdbcType=INTEGER}, #{username,jdbcType=VARCHAR}, ",
        "#{realname,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR}, ",
        "#{password,jdbcType=VARCHAR}, #{enabled,jdbcType=TINYINT}, ",
        "#{protected,jdbcType=TINYINT}, #{accessLevel,jdbcType=SMALLINT}, ",
        "#{loginCount,jdbcType=INTEGER}, #{lostPasswordRequestCount,jdbcType=SMALLINT}, ",
        "#{failedLoginCount,jdbcType=SMALLINT}, #{cookieString,jdbcType=VARCHAR}, ",
        "#{lastVisit,jdbcType=INTEGER}, #{dateCreated,jdbcType=INTEGER})"
    })
    int insert(User row);


    @Select({
        "select",
        "id, username, realname, email, `password`, enabled, protected, access_level, ",
        "login_count, lost_password_request_count, failed_login_count, cookie_string, ",
        "last_visit, date_created",
        "from mantis_user_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="isProtected", jdbcType=JdbcType.TINYINT),
        @Result(column="access_level", property="accessLevel", jdbcType=JdbcType.SMALLINT),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="lost_password_request_count", property="lostPasswordRequestCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="failed_login_count", property="failedLoginCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="cookie_string", property="cookieString", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_visit", property="lastVisit", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER)
    })
    User selectByPrimaryKey(Integer id);


    @Select({
        "select",
        "id, username, realname, email, `password`, enabled, protected, access_level, ",
        "login_count, lost_password_request_count, failed_login_count, cookie_string, ",
        "last_visit, date_created",
        "from mantis_user_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="username", property="username", jdbcType=JdbcType.VARCHAR),
        @Result(column="realname", property="realname", jdbcType=JdbcType.VARCHAR),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="password", property="password", jdbcType=JdbcType.VARCHAR),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="protected", property="protected", jdbcType=JdbcType.TINYINT),
        @Result(column="access_level", property="accessLevel", jdbcType=JdbcType.SMALLINT),
        @Result(column="login_count", property="loginCount", jdbcType=JdbcType.INTEGER),
        @Result(column="lost_password_request_count", property="lostPasswordRequestCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="failed_login_count", property="failedLoginCount", jdbcType=JdbcType.SMALLINT),
        @Result(column="cookie_string", property="cookieString", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_visit", property="lastVisit", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER)
    })
    List<User> selectAll();


    @Update({
        "update mantis_user_table",
        "set username = #{username,jdbcType=VARCHAR},",
          "realname = #{realname,jdbcType=VARCHAR},",
          "email = #{email,jdbcType=VARCHAR},",
          "`password` = #{password,jdbcType=VARCHAR},",
          "enabled = #{enabled,jdbcType=TINYINT},",
          "protected = #{protected,jdbcType=TINYINT},",
          "access_level = #{accessLevel,jdbcType=SMALLINT},",
          "login_count = #{loginCount,jdbcType=INTEGER},",
          "lost_password_request_count = #{lostPasswordRequestCount,jdbcType=SMALLINT},",
          "failed_login_count = #{failedLoginCount,jdbcType=SMALLINT},",
          "cookie_string = #{cookieString,jdbcType=VARCHAR},",
          "last_visit = #{lastVisit,jdbcType=INTEGER},",
          "date_created = #{dateCreated,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(User row);


    @Select(value="select * from mantis_user_table")
    List<User> findAll();

    User getUserById(Integer id);
}
