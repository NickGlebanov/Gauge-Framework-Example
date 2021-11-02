package ru.sdetteam.easygauge.dao;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import ru.sdetteam.easygauge.models.model.User;

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

    @Insert(value =
            "insert into mantis_user_table " +
                    "(username, realname, email, password, enabled, protected, access_level) " +
                    "values (#{username}, #{realname}, #{email}, #{password}, #{enabled}, #{protected}, #{accessLevel})")
    User insertNewUser(User user);

    @Update(value =
            "update from mantis_user_table " +
                    "set username = #{newName}, realname = #{realNewName}, email = #{newEmail}, enabled = #{newEnabled}, protected = #{newProtected}, access_level = #{newAccessLevel} " +
                    "where username = #{oldName}, realname = #{realOldName}, email = #{oldEmail}, enabled = #{oldEnabled}, protected = #{oldProtected}, access_level = #{oldAccessLevel}")
    User updateUser(User newUser, User oldUser);
}
