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
import ru.sdetteam.easygauge.model.UserPrintPref;

@Repository
public interface UserPrintPrefMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_user_print_pref_table",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer userId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_user_print_pref_table (user_id, print_pref)",
        "values (#{userId,jdbcType=INTEGER}, #{printPref,jdbcType=VARCHAR})"
    })
    int insert(UserPrintPref row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_user_print_pref_table",
        "set print_pref = #{printPref,jdbcType=VARCHAR}",
        "where user_id = #{userId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(UserPrintPref row);
}