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
import ru.sdetteam.easygauge.model.CustomField;

@Repository
public interface CustomFieldMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_custom_field_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_custom_field_table (id, `name`, ",
        "`type`, default_value, ",
        "valid_regexp, access_level_r, ",
        "access_level_rw, length_min, ",
        "length_max, require_report, ",
        "require_update, display_report, ",
        "display_update, require_resolved, ",
        "display_resolved, display_closed, ",
        "require_closed, filter_by, ",
        "possible_values)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{type,jdbcType=SMALLINT}, #{defaultValue,jdbcType=VARCHAR}, ",
        "#{validRegexp,jdbcType=VARCHAR}, #{accessLevelR,jdbcType=SMALLINT}, ",
        "#{accessLevelRw,jdbcType=SMALLINT}, #{lengthMin,jdbcType=INTEGER}, ",
        "#{lengthMax,jdbcType=INTEGER}, #{requireReport,jdbcType=TINYINT}, ",
        "#{requireUpdate,jdbcType=TINYINT}, #{displayReport,jdbcType=TINYINT}, ",
        "#{displayUpdate,jdbcType=TINYINT}, #{requireResolved,jdbcType=TINYINT}, ",
        "#{displayResolved,jdbcType=TINYINT}, #{displayClosed,jdbcType=TINYINT}, ",
        "#{requireClosed,jdbcType=TINYINT}, #{filterBy,jdbcType=TINYINT}, ",
        "#{possibleValues,jdbcType=LONGVARCHAR})"
    })
    int insert(CustomField row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, `type`, default_value, valid_regexp, access_level_r, access_level_rw, ",
        "length_min, length_max, require_report, require_update, display_report, display_update, ",
        "require_resolved, display_resolved, display_closed, require_closed, filter_by, ",
        "possible_values",
        "from mantis_custom_field_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="default_value", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_regexp", property="validRegexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_level_r", property="accessLevelR", jdbcType=JdbcType.SMALLINT),
        @Result(column="access_level_rw", property="accessLevelRw", jdbcType=JdbcType.SMALLINT),
        @Result(column="length_min", property="lengthMin", jdbcType=JdbcType.INTEGER),
        @Result(column="length_max", property="lengthMax", jdbcType=JdbcType.INTEGER),
        @Result(column="require_report", property="requireReport", jdbcType=JdbcType.TINYINT),
        @Result(column="require_update", property="requireUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="display_report", property="displayReport", jdbcType=JdbcType.TINYINT),
        @Result(column="display_update", property="displayUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="require_resolved", property="requireResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="display_resolved", property="displayResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="display_closed", property="displayClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="require_closed", property="requireClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="filter_by", property="filterBy", jdbcType=JdbcType.TINYINT),
        @Result(column="possible_values", property="possibleValues", jdbcType=JdbcType.LONGVARCHAR)
    })
    CustomField selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, `type`, default_value, valid_regexp, access_level_r, access_level_rw, ",
        "length_min, length_max, require_report, require_update, display_report, display_update, ",
        "require_resolved, display_resolved, display_closed, require_closed, filter_by, ",
        "possible_values",
        "from mantis_custom_field_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="type", property="type", jdbcType=JdbcType.SMALLINT),
        @Result(column="default_value", property="defaultValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="valid_regexp", property="validRegexp", jdbcType=JdbcType.VARCHAR),
        @Result(column="access_level_r", property="accessLevelR", jdbcType=JdbcType.SMALLINT),
        @Result(column="access_level_rw", property="accessLevelRw", jdbcType=JdbcType.SMALLINT),
        @Result(column="length_min", property="lengthMin", jdbcType=JdbcType.INTEGER),
        @Result(column="length_max", property="lengthMax", jdbcType=JdbcType.INTEGER),
        @Result(column="require_report", property="requireReport", jdbcType=JdbcType.TINYINT),
        @Result(column="require_update", property="requireUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="display_report", property="displayReport", jdbcType=JdbcType.TINYINT),
        @Result(column="display_update", property="displayUpdate", jdbcType=JdbcType.TINYINT),
        @Result(column="require_resolved", property="requireResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="display_resolved", property="displayResolved", jdbcType=JdbcType.TINYINT),
        @Result(column="display_closed", property="displayClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="require_closed", property="requireClosed", jdbcType=JdbcType.TINYINT),
        @Result(column="filter_by", property="filterBy", jdbcType=JdbcType.TINYINT),
        @Result(column="possible_values", property="possibleValues", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CustomField> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_custom_field_table",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "`type` = #{type,jdbcType=SMALLINT},",
          "default_value = #{defaultValue,jdbcType=VARCHAR},",
          "valid_regexp = #{validRegexp,jdbcType=VARCHAR},",
          "access_level_r = #{accessLevelR,jdbcType=SMALLINT},",
          "access_level_rw = #{accessLevelRw,jdbcType=SMALLINT},",
          "length_min = #{lengthMin,jdbcType=INTEGER},",
          "length_max = #{lengthMax,jdbcType=INTEGER},",
          "require_report = #{requireReport,jdbcType=TINYINT},",
          "require_update = #{requireUpdate,jdbcType=TINYINT},",
          "display_report = #{displayReport,jdbcType=TINYINT},",
          "display_update = #{displayUpdate,jdbcType=TINYINT},",
          "require_resolved = #{requireResolved,jdbcType=TINYINT},",
          "display_resolved = #{displayResolved,jdbcType=TINYINT},",
          "display_closed = #{displayClosed,jdbcType=TINYINT},",
          "require_closed = #{requireClosed,jdbcType=TINYINT},",
          "filter_by = #{filterBy,jdbcType=TINYINT},",
          "possible_values = #{possibleValues,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(CustomField row);
}