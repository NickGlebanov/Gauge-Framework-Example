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
import ru.sdetteam.easygauge.model.ApiToken;

@Repository
public interface ApiTokenMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_api_token_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_api_token_table (id, user_id, ",
        "`name`, hash, date_created, ",
        "date_used)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{name,jdbcType=VARCHAR}, #{hash,jdbcType=VARCHAR}, #{dateCreated,jdbcType=INTEGER}, ",
        "#{dateUsed,jdbcType=INTEGER})"
    })
    int insert(ApiToken row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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