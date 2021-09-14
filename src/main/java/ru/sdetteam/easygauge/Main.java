package ru.sdetteam.easygauge;

import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import ru.sdetteam.easygauge.dao.UserMapper;
import ru.sdetteam.easygauge.factory.GaugeSqlSessionFactory;

import java.io.IOException;
import java.io.InputStream;

//example temporary main class for mybatis testing
public class Main {


    public static void main(String[] args) {
        GaugeSqlSessionFactory gaugeSqlSessionFactory = new GaugeSqlSessionFactory();
        gaugeSqlSessionFactory.create();
        gaugeSqlSessionFactory.getSession().getMapper(UserMapper.class).findAll().forEach(System.out::println);
        System.out.println();
    }

}
