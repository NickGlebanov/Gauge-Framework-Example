package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.BugnoteText;


public interface BugnoteTextMapper {

    @Delete({
        "delete from mantis_bugnote_text_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer id);

    @Insert({
        "insert into mantis_bugnote_text_table (id, note)",
        "values (#{id,jdbcType=INTEGER}, #{note,jdbcType=LONGVARCHAR})"
    })
    int insert(BugnoteText row);

    @Select({
        "select",
        "id, note",
        "from mantis_bugnote_text_table",
        "where id = #{id,jdbcType=INTEGER}"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="note", property="note", jdbcType=JdbcType.LONGVARCHAR)
    })
    BugnoteText selectByPrimaryKey(Integer id);

    @Select({
        "select",
        "id, note",
        "from mantis_bugnote_text_table"
    })
    @Results({
        @Result(column="id", property="id", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="note", property="note", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<BugnoteText> selectAll();

    @Update({
        "update mantis_bugnote_text_table",
        "set note = #{note,jdbcType=LONGVARCHAR}",
        "where id = #{id,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(BugnoteText row);
}