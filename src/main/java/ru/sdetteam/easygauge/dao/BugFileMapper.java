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
import ru.sdetteam.easygauge.model.BugFile;

@Repository
public interface BugFileMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_file_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_file_table (id, bug_id, ",
        "title, description, ",
        "diskfile, filename, ",
        "folder, filesize, ",
        "file_type, date_added, ",
        "user_id, content)",
        "values (#{id,jdbcType=INTEGER}, #{bugId,jdbcType=INTEGER}, ",
        "#{title,jdbcType=VARCHAR}, #{description,jdbcType=VARCHAR}, ",
        "#{diskfile,jdbcType=VARCHAR}, #{filename,jdbcType=VARCHAR}, ",
        "#{folder,jdbcType=VARCHAR}, #{filesize,jdbcType=INTEGER}, ",
        "#{fileType,jdbcType=VARCHAR}, #{dateAdded,jdbcType=INTEGER}, ",
        "#{userId,jdbcType=INTEGER}, #{content,jdbcType=LONGVARBINARY})"
    })
    int insert(BugFile row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, title, description, diskfile, filename, folder, filesize, file_type, ",
        "date_added, user_id, content",
        "from mantis_bug_file_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="diskfile", property="diskfile", jdbcType=JdbcType.VARCHAR),
        @Result(column="filename", property="filename", jdbcType=JdbcType.VARCHAR),
        @Result(column="folder", property="folder", jdbcType=JdbcType.VARCHAR),
        @Result(column="filesize", property="filesize", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_added", property="dateAdded", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARBINARY)
    })
    BugFile selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, bug_id, title, description, diskfile, filename, folder, filesize, file_type, ",
        "date_added, user_id, content",
        "from mantis_bug_file_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="bug_id", property="bugId", jdbcType=JdbcType.INTEGER),
        @Result(column="title", property="title", jdbcType=JdbcType.VARCHAR),
        @Result(column="description", property="description", jdbcType=JdbcType.VARCHAR),
        @Result(column="diskfile", property="diskfile", jdbcType=JdbcType.VARCHAR),
        @Result(column="filename", property="filename", jdbcType=JdbcType.VARCHAR),
        @Result(column="folder", property="folder", jdbcType=JdbcType.VARCHAR),
        @Result(column="filesize", property="filesize", jdbcType=JdbcType.INTEGER),
        @Result(column="file_type", property="fileType", jdbcType=JdbcType.VARCHAR),
        @Result(column="date_added", property="dateAdded", jdbcType=JdbcType.INTEGER),
        @Result(column="user_id", property="userId", jdbcType=JdbcType.INTEGER),
        @Result(column="content", property="content", jdbcType=JdbcType.LONGVARBINARY)
    })
    List<BugFile> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bug_file_table",
        "set bug_id = #{bugId,jdbcType=INTEGER},",
          "title = #{title,jdbcType=VARCHAR},",
          "description = #{description,jdbcType=VARCHAR},",
          "diskfile = #{diskfile,jdbcType=VARCHAR},",
          "filename = #{filename,jdbcType=VARCHAR},",
          "folder = #{folder,jdbcType=VARCHAR},",
          "filesize = #{filesize,jdbcType=INTEGER},",
          "file_type = #{fileType,jdbcType=VARCHAR},",
          "date_added = #{dateAdded,jdbcType=INTEGER},",
          "user_id = #{userId,jdbcType=INTEGER},",
          "content = #{content,jdbcType=LONGVARBINARY}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugFile row);
}