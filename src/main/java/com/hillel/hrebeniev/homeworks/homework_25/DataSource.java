package com.hillel.hrebeniev.homeworks.homework_25;

import com.mysql.cj.jdbc.MysqlDataSource;
import lombok.SneakyThrows;

import java.sql.Connection;
import java.util.Properties;


public enum DataSource {
    INSTANCE;
    private final DataSource dataSource;

    DataSource() {
        this.dataSource = getDataSource();
    }

    private DataSource getDataSource() {
        MysqlDataSource mysqlDataSource = new MysqlDataSource();
        Properties properties = new PropertyReader().getProperties("application.properties");

        mysqlDataSource.setUrl(properties.getProperty("db.url"));
        mysqlDataSource.setUser(properties.getProperty("db.user"));
        mysqlDataSource.setPassword(properties.getProperty("db.pass"));

        return mysqlDataSource;
    }

    @SneakyThrows
    public Connection getConnection() {
        return dataSource.getConnection();
    }
}