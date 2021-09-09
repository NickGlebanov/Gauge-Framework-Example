package ru.sdetteam.easygauge.tests;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import ru.sdetteam.easygauge.dao.UserMapper;
import ru.sdetteam.easygauge.factory.GaugeSqlSessionFactory;
import ru.sdetteam.easygauge.model.User;

import java.util.List;

public class UserManipulationTest {

    UserMapper userMapper;

    GaugeSqlSessionFactory gaugeSqlSessionFactory;

    @Test
    public void userManipulationTest(){
        User user = new User();
        user.setUsername("Lox");
        user.setRealname("Petrovich");
        user.setEmail("porosenok@pisos.com");
        user.setPassword("12345678");


        final List<User> users = userMapper.findAll();

        userMapper.getUserById(users.get(0).getId());

        userMapper.insertNewUser(user);

        userMapper.deleteUserById(users.get(0).getId());

    }
}
