package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.Tag;

@Repository
public interface TagMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_tag_table",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    int deleteByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_tag_table (id, `name`, ",
        "user_id, date_created, ",
        "date_updated, description)",
        "values (#{id,jdbcType=INTEGER}, #{name,jdbcType=VARCHAR}, ",
        "#{userId,jdbcType=INTEGER}, #{dateCreated,jdbcType=INTEGER}, ",
        "#{dateUpdated,jdbcType=INTEGER}, #{description,jdbcType=LONGVARCHAR})"
    })
    int insert(Tag row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, user_id, date_created, date_updated, description",
        "from mantis_tag_table",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_updated", property="dateUpdated", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    Tag selectByPrimaryKey(@Param("id") Integer id, @Param("name") String name);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, `name`, user_id, date_created, date_updated, description",
        "from mantis_tag_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR, id=true),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="date_created", property="dateCreated", jdbcType=JdbcType.INTEGER),
        @Result(column="date_updated", property="dateUpdated", jdbcType=JdbcType.INTEGER),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<Tag> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_tag_table",
        "set user_id = #{userId,jdbcType=INTEGER},",
          "date_created = #{dateCreated,jdbcType=INTEGER},",
          "date_updated = #{dateUpdated,jdbcType=INTEGER},",
          "description = #{description,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}",
          "and `name` = #{name,jdbcType=VARCHAR}"
    })
    int updateByPrimaryKey(Tag row);
}