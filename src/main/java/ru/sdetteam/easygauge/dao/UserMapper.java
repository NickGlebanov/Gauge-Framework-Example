package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.sdetteam.easygauge.model.User;

import java.util.List;

public interface UserMapper {

    @Select(value="select * from mantis_user_table")
    List<User> findAll();

    @Select(value="select * from mantis_user_table where id = #{id}" )
    User getUserById(Integer id);

    @Delete(value = "delete from mantis_user_table where id = #{id}")
    void deleteUserById(Integer id);

    @Delete(value = "delete from mantis_user_table")
    void deleteAllUsers();

    @Insert(value = "insert into mantis_user_table (username, realname, email, password) values (#{username}, #{realname}, #{email}, #{password})")
    User insertNewUser(User user);

//    @Update(value = "update from mantis_user_table set username = #{newName}, realname = #{realNewName}, email = #{email}")
//    User updateUser();
}
