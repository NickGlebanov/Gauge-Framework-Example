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
import ru.sdetteam.easygauge.model.Sponsorship;

@Repository
public interface SponsorshipMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_sponsorship_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_sponsorship_table (id, bug_id, ",
        "user_id, amount, ",
        "logo, url, paid, ",
        "date_submitted, last_updated)",
        "values (#{id,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{amount,jdbcType=INTEGER}, ",
        "#{logo,jdbcType=VARCHAR}, #{url,jdbcType=VARCHAR}, #{paid,jdbcType=TINYINT}, ",
        "#{dateSubmitted,jdbcType=INTEGER}, #{lastUpdated,jdbcType=INTEGER})"
    })
    int insert(Sponsorship row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, user_id, amount, logo, url, paid, date_submitted, last_updated",
        "from mantis_sponsorship_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="paid", property="paid", jdbcType=JdbcType.TINYINT),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER),
        @Result(column="last_updated", property="lastUpdated", jdbcType=JdbcType.INTEGER)
    })
    Sponsorship selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, user_id, amount, logo, url, paid, date_submitted, last_updated",
        "from mantis_sponsorship_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="amount", property="amount", jdbcType=JdbcType.INTEGER),
        @Result(column="logo", property="logo", jdbcType=JdbcType.VARCHAR),
        @Result(column="url", property="url", jdbcType=JdbcType.VARCHAR),
        @Result(column="paid", property="paid", jdbcType=JdbcType.TINYINT),
        @Result(column="date_submitted", property="dateSubmitted", jdbcType=JdbcType.INTEGER),
        @Result(column="last_updated", property="lastUpdated", jdbcType=JdbcType.INTEGER)
    })
    List<Sponsorship> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_sponsorship_table",
        "set bug_id = #{bugId,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "amount = #{amount,jdbcType=INTEGER},",
          "logo = #{logo,jdbcType=VARCHAR},",
          "url = #{url,jdbcType=VARCHAR},",
          "paid = #{paid,jdbcType=TINYINT},",
          "date_submitted = #{dateSubmitted,jdbcType=INTEGER},",
          "last_updated = #{lastUpdated,jdbcType=INTEGER}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Sponsorship row);
}