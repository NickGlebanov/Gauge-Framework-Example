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
import ru.sdetteam.easygauge.model.Email;

@Repository
public interface EmailMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_email_table",
        "where email_id = #{emailId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer emailId);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_email_table (email_id, email, ",
        "subject, submitted, ",
        "metadata, body)",
        "values (#{emailId,jdbcType=INTEGER}, #{email,jdbcType=VARCHAR}, ",
        "#{subject,jdbcType=VARCHAR}, #{submitted,jdbcType=INTEGER}, ",
        "#{metadata,jdbcType=LONGVARCHAR}, #{body,jdbcType=LONGVARCHAR})"
    })
    int insert(Email row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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