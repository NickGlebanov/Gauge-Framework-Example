package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.UserPrintPref;


public interface UserPrintPrefMapper {

    @Delete({
        "delete from mantis_user_print_pref_table",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);


    @Insert({
        "insert into mantis_user_print_pref_table (user_id, print_pref)",
        "values (#{userId,jdbcType=INTEGER}, #{printPref,jdbcType=VARCHAR})"
    })
    int insert(UserPrintPref row);


    @Select({
        "select",
        "user_id, print_pref",
        "from mantis_user_print_pref_table",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="print_pref", property="printPref", jdbcType=JdbcType.VARCHAR)
    })
    UserPrintPref selectByPrimaryKey(Integer userId);


    @Select({
        "select",
        "user_id, print_pref",
        "from mantis_user_print_pref_table"
    })
    @Results({
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="print_pref", property="printPref", jdbcType=JdbcType.VARCHAR)
    })
    List<UserPrintPref> selectAll();


    @Update({
        "update mantis_user_print_pref_table",
        "set print_pref = #{printPref,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserPrintPref row);
}