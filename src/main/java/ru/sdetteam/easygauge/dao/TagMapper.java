package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.sdetteam.easygauge.model.Project;
import ru.sdetteam.easygauge.model.Tag;

import java.util.List;

public interface TagMapper {

    @Select(value="select * from mantis_tag_table")
    List<Tag> findAll();

    @Select(value="select * from mantis_tag_table where id = #{id}" )
    Tag getTagById(Integer id);

    @Delete(value = "delete from mantis_tag_table where id = #{id}")
    void deleteTagById(Integer id);

    @Delete(value = "delete from mantis_tag_table")
    void deleteAllTags();

    @Insert(value =
            "insert into mantis_tag_table " +
                    "(name,  description) " +
                    "values (#{name}, #{description})")
    Tag insertNewTag(Tag user);

    @Update(value = "update from mantis_tag_table " +
            "set name = #{newName}, user_id = #{newUser}, description = #{newDescription} " +
            "where name = #{oldName}, user_id = #{oldUser}, description = #{oldDescription}")
    Tag updateTag(Tag newTag, Tag oldTag);
}
