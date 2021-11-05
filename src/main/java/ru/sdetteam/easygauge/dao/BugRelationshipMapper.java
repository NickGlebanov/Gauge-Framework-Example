package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugRelationship;


public interface BugRelationshipMapper {

    @Delete({
        "delete from mantis_bug_relationship_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_bug_relationship_table (id, source_bug_id, ",
        "destination_bug_id, relationship_type)",
        "values (#{id,jdbcType=INTEGER}, #{sourceBugId,jdbcType=INTEGER}, ",
        "#{destinationBugId,jdbcType=INTEGER}, #{relationshipType,jdbcType=SMALLINT})"
    })
    int insert(BugRelationship row);

    @Select({
        "select",
        "id, source_bug_id, destination_bug_id, relationship_type",
        "from mantis_bug_relationship_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="source_bug_id", property="sourceBugId", jdbcType=JdbcType.INTEGER),
        @Result(column="destination_bug_id", property="destinationBugId", jdbcType=JdbcType.INTEGER),
        @Result(column="relationship_type", property="relationshipType", jdbcType=JdbcType.SMALLINT)
    })
    BugRelationship selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, source_bug_id, destination_bug_id, relationship_type",
        "from mantis_bug_relationship_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="source_bug_id", property="sourceBugId", jdbcType=JdbcType.INTEGER),
        @Result(column="destination_bug_id", property="destinationBugId", jdbcType=JdbcType.INTEGER),
        @Result(column="relationship_type", property="relationshipType", jdbcType=JdbcType.SMALLINT)
    })
    List<BugRelationship> selectAll();

    @Update({
        "update mantis_bug_relationship_table",
        "set source_bug_id = #{sourceBugId,jdbcType=INTEGER},",
          "destination_bug_id = #{destinationBugId,jdbcType=INTEGER},",
          "relationship_type = #{relationshipType,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugRelationship row);
}