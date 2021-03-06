package ru.sdetteam.easygauge.factory;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import lombok.NoArgsConstructor;
import org.apache.ibatis.datasource.pooled.PooledDataSource;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;


import javax.sql.DataSource;

@Singleton
@NoArgsConstructor
public class GaugeSqlSessionFactory {

    public static final String DRIVER = "org.mariadb.jdbc.Driver";
    public static final String URL = "jdbc:mariadb://192.168.1.71:3306/mantis";
    public static final String USERNAME = "mantisuser";
    public static final String PASSWORD = "mantisuser";
    private static SqlSessionFactory sqlSessionFactory;

    public void create(){
        DataSource dataSource = new PooledDataSource(DRIVER, URL, USERNAME, PASSWORD);
        Environment environment = new Environment("Development", new JdbcTransactionFactory(), dataSource);
        Configuration configuration = new Configuration(environment);
        configuration.addMappers("ru.sdetteam.easygauge.dao");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = builder.build(configuration);
    }

    public SqlSession getSession() {
        return sqlSessionFactory.openSession();
    }

}
