package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Select;
import ru.sdetteam.easygauge.model.User;

import java.util.List;

public interface UserMapper {

    @Select(value="select * from mantis_user_table")
    List<User> findAll();

    User getUserById(Integer id);
}
