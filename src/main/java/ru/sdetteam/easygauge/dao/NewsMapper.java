package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.News;


public interface NewsMapper {

    @Delete({
        "delete from mantis_news_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_news_table (id, project_id, ",
        "poster_id, view_state, ",
        "announcement, headline, ",
        "last_modified, date_posted, ",
        "body)",
        "values (#{id,jdbcType=INTEGER}, #{projectId,jdbcType=INTEGER}, ",
        "#{posterId,jdbcType=INTEGER}, #{viewState,jdbcType=SMALLINT}, ",
        "#{announcement,jdbcType=TINYINT}, #{headline,jdbcType=VARCHAR}, ",
        "#{lastModified,jdbcType=INTEGER}, #{datePosted,jdbcType=INTEGER}, ",
        "#{body,jdbcType=LONGVARCHAR})"
    })
    int insert(News row);

    @Select({
        "select",
        "id, project_id, poster_id, view_state, announcement, headline, last_modified, ",
        "date_posted, body",
        "from mantis_news_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="poster_id", property="posterId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="announcement", property="announcement", jdbcType=JdbcType.TINYINT),
        @Result(column="headline", property="headline", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.INTEGER),
        @Result(column="date_posted", property="datePosted", jdbcType=JdbcType.INTEGER),
        @Result(column="body", property="body", jdbcType=JdbcType.LONGVARCHAR)
    })
    News selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, project_id, poster_id, view_state, announcement, headline, last_modified, ",
        "date_posted, body",
        "from mantis_news_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="project_id", property="projectId", jdbcType=JdbcType.INTEGER),
        @Result(column="poster_id", property="posterId", jdbcType=JdbcType.INTEGER),
        @Result(column="view_state", property="viewState", jdbcType=JdbcType.SMALLINT),
        @Result(column="announcement", property="announcement", jdbcType=JdbcType.TINYINT),
        @Result(column="headline", property="headline", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.INTEGER),
        @Result(column="date_posted", property="datePosted", jdbcType=JdbcType.INTEGER),
        @Result(column="body", property="body", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<News> selectAll();

    @Update({
        "update mantis_news_table",
        "set project_id = #{projectId,jdbcType=INTEGER},",
          "poster_id = #{posterId,jdbcType=INTEGER},",
          "view_state = #{viewState,jdbcType=SMALLINT},",
          "announcement = #{announcement,jdbcType=TINYINT},",
          "headline = #{headline,jdbcType=VARCHAR},",
          "last_modified = #{lastModified,jdbcType=INTEGER},",
          "date_posted = #{datePosted,jdbcType=INTEGER},",
          "body = #{body,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(News row);
}