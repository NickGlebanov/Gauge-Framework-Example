package ru.sdetteam.easygauge.dao;

import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.springframework.stereotype.Repository;
import ru.sdetteam.easygauge.model.ProjectHierarchy;

@Repository
public interface ProjectHierarchyMapper {
    /**
     * @mbg.generated generated automatically, do not modify!
     */
    @Insert({
        "insert into mantis_project_hierarchy_table (child_id, parent_id, ",
        "inherit_parent)",
        "values (#{childId,jdbcType=INTEGER}, #{parentId,jdbcType=INTEGER}, ",
        "#{inheritParent,jdbcType=TINYINT})"
    })
    int insert(ProjectHierarchy row);

    /**
     * @mbg.generated generated automatically, do not modify!
     */
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