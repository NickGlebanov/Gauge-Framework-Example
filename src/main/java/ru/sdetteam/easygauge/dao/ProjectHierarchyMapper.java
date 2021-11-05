package ru.sdetteam.easygauge.dao;

import java.util.List;

import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import ru.sdetteam.easygauge.model.ProjectHierarchy;


public interface ProjectHierarchyMapper {

    @Insert({
        "insert into mantis_project_hierarchy_table (child_id, parent_id, ",
        "inherit_parent)",
        "values (#{childId,jdbcType=INTEGER}, #{parentId,jdbcType=INTEGER}, ",
        "#{inheritParent,jdbcType=TINYINT})"
    })
    int insert(ProjectHierarchy row);

    @Select({
        "select",
        "child_id, parent_id, inherit_parent",
        "from mantis_project_hierarchy_table"
    })
    @Results({
        @Result(column="child_id", property="childId", jdbcType=JdbcType.INTEGER),
        @Result(column="parent_id", property="parentId", jdbcType=JdbcType.INTEGER),
        @Result(column="inherit_parent", property="inheritParent", jdbcType=JdbcType.TINYINT)
    })
    List<ProjectHierarchy> selectAll();
}