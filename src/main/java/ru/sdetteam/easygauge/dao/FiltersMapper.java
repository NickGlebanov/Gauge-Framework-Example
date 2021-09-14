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
import ru.sdetteam.easygauge.model.Filters;

@Repository
public interface FiltersMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_filters_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_filters_table (id, user_id, ",
        "project_id, is_public, ",
        "`name`, filter_string)",
        "values (#{id,jdbcType=INTEGER}, #{userId,jdbcType=INTEGER}, ",
        "#{projectId,jdbcType=INTEGER}, #{isPublic,jdbcType=TINYINT}, ",
        "#{name,jdbcType=VARCHAR}, #{filterString,jdbcType=LONGVARCHAR})"
    })
    int insert(Filters row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, user_id, project_id, is_public, `name`, filter_string",
        "from mantis_filters_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_public", property="isPublic", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="filter_string", property="filterString", jdbcType=JdbcType.LONGVARCHAR)
    })
    Filters selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, user_id, project_id, is_public, `name`, filter_string",
        "from mantis_filters_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="is_public", property="isPublic", jdbcType=JdbcType.TINYINT),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="filter_string", property="filterString", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Filters> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_filters_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "project_id = #{projectId,jdbcType=INTEGER},",
          "is_public = #{isPublic,jdbcType=TINYINT},",
          "`name` = #{name,jdbcType=VARCHAR},",
          "filter_string = #{filterString,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Filters row);
}