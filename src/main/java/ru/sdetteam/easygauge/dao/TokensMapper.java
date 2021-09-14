package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Tokens;


public interface TokensMapper {

    @Delete({
        "delete from mantis_tokens_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);


    @Insert({
        "insert into mantis_tokens_table (id, `owner`, ",
        "`type`, `timestamp`, ",
        "expiry, `value`)",
        "values (#{id,jdbcType=INTEGER}, #{owner,jdbcType=INTEGER}, ",
        "#{type,jdbcType=INTEGER}, #{timestamp,jdbcType=INTEGER}, ",
        "#{expiry,jdbcType=INTEGER}, #{value,jdbcType=LONGVARCHAR})"
    })
    int insert(Tokens row);


    @Select({
        "select",
        "id, `owner`, `type`, `timestamp`, expiry, `value`",
        "from mantis_tokens_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="owner", property="owner", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.INTEGER),
        @Result(column="expiry", property="expiry", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    Tokens selectByPrimaryKey(Integer id);


    @Select({
        "select",
        "id, `owner`, `type`, `timestamp`, expiry, `value`",
        "from mantis_tokens_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="owner", property="owner", jdbcType=JdbcType.INTEGER),
        @Result(column="type", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="timestamp", property="timestamp", jdbcType=JdbcType.INTEGER),
        @Result(column="expiry", property="expiry", jdbcType=JdbcType.INTEGER),
        @Result(column="value", property="value", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Tokens> selectAll();


    @Update({
        "update mantis_tokens_table",
        "set `owner` = #{owner,jdbcType=INTEGER},",
          "`type` = #{type,jdbcType=INTEGER},",
          "`timestamp` = #{timestamp,jdbcType=INTEGER},",
          "expiry = #{expiry,jdbcType=INTEGER},",
          "`value` = #{value,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Tokens row);
}