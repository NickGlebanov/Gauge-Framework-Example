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
import ru.sdetteam.easygauge.model.BugRelationship;

@Repository
public interface BugRelationshipMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_relationship_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_relationship_table (id, source_bug_id, ",
        "destination_bug_id, relationship_type)",
        "values (#{id,jdbcType=INTEGER}, #{sourceBugId,jdbcType=INTEGER}, ",
        "#{destinationBugId,jdbcType=INTEGER}, #{relationshipType,jdbcType=SMALLINT})"
    })
    int insert(BugRelationship row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bug_relationship_table",
        "set source_bug_id = #{sourceBugId,jdbcType=INTEGER},",
          "destination_bug_id = #{destinationBugId,jdbcType=INTEGER},",
          "relationship_type = #{relationshipType,jdbcType=SMALLINT}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugRelationship row);
}