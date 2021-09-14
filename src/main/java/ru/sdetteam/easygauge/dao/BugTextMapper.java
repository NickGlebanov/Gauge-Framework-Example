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
import ru.sdetteam.easygauge.model.BugText;

@Repository
public interface BugTextMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Delete({
        "delete from mantis_bug_text_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_bug_text_table (id, description, ",
        "steps_to_reproduce, additional_information)",
        "values (#{id,jdbcType=INTEGER}, #{description,jdbcType=LONGVARCHAR}, ",
        "#{stepsToReproduce,jdbcType=LONGVARCHAR}, #{additionalInformation,jdbcType=LONGVARCHAR})"
    })
    int insert(BugText row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, description, steps_to_reproduce, additional_information",
        "from mantis_bug_text_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="steps_to_reproduce", property="stepsToReproduce", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="additional_information", property="additionalInformation", jdbcType=JdbcType.LONGVARCHAR)
    })
    BugText selectByPrimaryKey(Integer id);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Select({
        "select",
        "id, description, steps_to_reproduce, additional_information",
        "from mantis_bug_text_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="description", property="description", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="steps_to_reproduce", property="stepsToReproduce", jdbcType=JdbcType.LONGVARCHAR),
        @Result(column="additional_information", property="additionalInformation", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BugText> selectAll();

    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Update({
        "update mantis_bug_text_table",
        "set description = #{description,jdbcType=LONGVARCHAR},",
          "steps_to_reproduce = #{stepsToReproduce,jdbcType=LONGVARCHAR},",
          "additional_information = #{additionalInformation,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugText row);
}