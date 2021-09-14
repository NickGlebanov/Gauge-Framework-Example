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
import ru.sdetteam.easygauge.model.Project;

@Repository
public interface ProjectMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_project_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_project_table (id, `name`, ",
        "`status`, enabled, ",
        "view_state, access_min, ",
        "file_path, category_id, ",
        "inherit_global, description)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{status,jdbcType=SMALLINT}, #{enabled,jdbcType=TINYINT}, ",
        "#{viewState,jdbcType=SMALLINT}, #{accessMin,jdbcType=SMALLINT}, ",
        "#{filePath,jdbcType=VARCHAR}, #{categoryId,jdbcType=INTEGER}, ",
        "#{inheritGlobal,jdbcType=TINYINT}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(Project row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, `status`, enabled, view_state, access_min, file_path, category_id, ",
        "inherit_global, description",
        "from mantis_project_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="access_min", property="accessMin", jdbcType=JdbcType.SMALLINT),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="inherit_global", property="inheritGlobal", jdbcType=JdbcType.TINYINT),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    Project selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, `status`, enabled, view_state, access_min, file_path, category_id, ",
        "inherit_global, description",
        "from mantis_project_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="status", property="status", jdbcType=JdbcType.SMALLINT),
        @Result(column="enabled", property="enabled", jdbcType=JdbcType.TINYINT),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="access_min", property="accessMin", jdbcType=JdbcType.SMALLINT),
        @Result(column="file_path", property="filePath", jdbcType=JdbcType.VARCHAR),
        @Result(column="category_id", property="categoryId", jdbcType=JdbcType.INTEGER),
        @Result(column="inherit_global", property="inheritGlobal", jdbcType=JdbcType.TINYINT),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Project> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_project_table",
        "set `name` = #{name,jdbcType=VARCHAR},",
          "`status` = #{status,jdbcType=SMALLINT},",
          "enabled = #{enabled,jdbcType=TINYINT},",
          "view_state = #{viewState,jdbcType=SMALLINT},",
          "access_min = #{accessMin,jdbcType=SMALLINT},",
          "file_path = #{filePath,jdbcType=VARCHAR},",
          "category_id = #{categoryId,jdbcType=INTEGER},",
          "inherit_global = #{inheritGlobal,jdbcType=TINYINT},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Project row);
}