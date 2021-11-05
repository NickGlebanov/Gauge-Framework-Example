package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.ApiToken;


public interface ApiTokenMapper {
    @Delete({
        "delete from mantis_api_token_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_api_token_table (id, user_id, ",
        "`name`, hash, date_created, ",
        "date_used)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{hash,jdbcType=VARCHAR}, #{dateCreated,jdbcType=INTEGER}, ",
        "#{dateUsed,jdbcType=INTEGER})"
    })
    int insert(ApiToken row);

    @Select({
        "select",
        "id, user_id, `name`, hash, date_created, date_used",
        "from mantis_api_token_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="hash", property="hash", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_used", property="dateUsed", jdbcType=JdbcType.INTEGER)
    })
    ApiToken selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, user_id, `name`, hash, date_created, date_used",
        "from mantis_api_token_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="hash", property="hash", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_used", property="dateUsed", jdbcType=JdbcType.INTEGER)
    })
    List<ApiToken> selectAll();

    @Update({
        "update mantis_api_token_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "hash = #{hash,jdbcType=VARCHAR},",
          "date_created = #{dateCreated,jdbcType=INTEGER},",
          "date_used = #{dateUsed,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(ApiToken row);
}