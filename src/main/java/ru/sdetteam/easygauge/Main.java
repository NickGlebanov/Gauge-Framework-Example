package ru.sdetteam.easygauge;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import ru.sdetteam.easygauge.dao.UserMapper;
import ru.sdetteam.easygauge.factory.GaugeSqlSessionFactory;
import ru.sdetteam.easygauge.guice.GuiceModule;

//example temporary main class for mybatis testing
public class Main {


    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new GuiceModule());
        GaugeSqlSessionFactory gaugeSqlSessionFactory = new GaugeSqlSessionFactory();
        gaugeSqlSessionFactory.create();
        gaugeSqlSessionFactory.getSession().getMapper(UserMapper.class).findAll().forEach(System.out::println);
    }

}
