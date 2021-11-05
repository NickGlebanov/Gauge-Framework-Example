package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.Email;


public interface EmailMapper {

    @Delete({
        "delete from mantis_email_table",
        "where email_id = #{emailId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer emailId);

    @Insert({
        "insert into mantis_email_table (email_id, email, ",
        "subject, submitted, ",
        "metadata, body)",
        "values (#{emailId,jdbcType=INTEGER}, #{email,jdbcType=VARCHAR}, ",
        "#{subject,jdbcType=VARCHAR}, #{submitted,jdbcType=INTEGER}, ",
        "#{metadata,jdbcType=LONGVARCHAR}, #{body,jdbcType=LONGVARCHAR})"
    })
    int insert(Email row);

    @Select({
        "select",
        "email_id, email, subject, submitted, metadata, body",
        "from mantis_email_table",
        "where email_id = #{emailId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="email_id", property="emailId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="submitted", property="submitted", jdbcType=JdbcType.INTEGER),
        @Result(column="metadata", property="metadata", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.LONGVARCHAR)
    })
    Email selectByPrimaryKey(Integer emailId);

    @Select({
        "select",
        "email_id, email, subject, submitted, metadata, body",
        "from mantis_email_table"
    })
    @Results({
        @Result(column="email_id", property="emailId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="email", property="email", jdbcType=JdbcType.VARCHAR),
        @Result(column="subject", property="subject", jdbcType=JdbcType.VARCHAR),
        @Result(column="submitted", property="submitted", jdbcType=JdbcType.INTEGER),
        @Result(column="metadata", property="metadata", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="body", property="body", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Email> selectAll();

    @Update({
        "update mantis_email_table",
        "set email = #{email,jdbcType=VARCHAR},",
          "subject = #{subject,jdbcType=VARCHAR},",
          "submitted = #{submitted,jdbcType=INTEGER},",
          "metadata = #{metadata,jdbcType=LONGVARCHAR},",
          "body = #{body,jdbcType=LONGVARCHAR}",
        "where email_id = #{emailId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Email row);
}