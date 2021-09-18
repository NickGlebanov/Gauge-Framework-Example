package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.sdetteam.easygauge.model.Project;
import ru.sdetteam.easygauge.model.User;

import java.util.List;

public interface ProjectMapper {

    @Select(value="select * from mantis_project_table")
    List<Project> findAll();

    @Select(value="select * from mantis_project_table where id = #{id}" )
    Project getProjectById(Integer id);

    @Delete(value = "delete from mantis_project_table where id = #{id}")
    void deleteProjectById(Integer id);

    @Delete(value = "delete from mantis_project_table")
    void deleteAllProjects();

    @Insert(value =
            "insert into mantis_project_table " +
                    "(name, status, inherit_global, view_state, description) " +
                    "values (#{name}, #{status}, #{inherit_global}, #{view_state}, #{description})")
    Project insertNewProject(Project user);

    @Update(value = "update from mantis_project_table " +
            "set name = #{newName}, status = #{newStatus}, enabled = #{newEnabled}, inherit_global = #{newInheritGlobal}, view_state = #{newViewState}, description = #{newDescription} " +
            "where name = #{oldName}, status = #{oldStatus}, enabled = #{oldEnabled}, inherit_global = #{oldInheritGlobal}, view_state = #{oldViewState}, description = #{oldDescription}")
    Project updateProject(Project newProject, Project oldProject);
}
