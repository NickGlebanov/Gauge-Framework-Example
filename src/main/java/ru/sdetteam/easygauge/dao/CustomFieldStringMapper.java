package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.CustomFieldString;


public interface CustomFieldStringMapper {

    @Delete({
        "delete from mantis_custom_field_string_table",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and bug_id = #{bugId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(@Param("fieldId") Integer fieldId, @Param("bugId") Integer bugId);

    @Insert({
        "insert into mantis_custom_field_string_table (field_id, bug_id, ",
        "`value`, `text`)",
        "values (#{fieldId,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER}, ",
        "#{value,jdbcType=VARCHAR}, #{text,jdbcType=LONGVARCHAR})"
    })
    int insert(CustomFieldString row);

    @Select({
        "select",
        "field_id, bug_id, `value`, `text`",
        "from mantis_custom_field_string_table",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and bug_id = #{bugId,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="field_id", property="fieldId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="text", property="text", jdbcType=JdbcType.LONGVARCHAR)
    })
    CustomFieldString selectByPrimaryKey(@Param("fieldId") Integer fieldId, @Param("bugId") Integer bugId);

    @Select({
        "select",
        "field_id, bug_id, `value`, `text`",
        "from mantis_custom_field_string_table"
    })
    @Results({
        @Result(column="field_id", property="fieldId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="value", property="value", jdbcType=JdbcType.VARCHAR),
        @Result(column="text", property="text", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CustomFieldString> selectAll();

    @Update({
        "update mantis_custom_field_string_table",
        "set `value` = #{value,jdbcType=VARCHAR},",
          "`text` = #{text,jdbcType=LONGVARCHAR}",
        "where field_id = #{fieldId,jdbcType=INTEGER}",
          "and bug_id = #{bugId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CustomFieldString row);
}