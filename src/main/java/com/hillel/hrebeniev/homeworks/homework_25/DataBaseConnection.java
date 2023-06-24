package com.hillel.hrebeniev.homeworks.homework_25;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public enum DataBaseConnection {
    INSTANCE;
    private final String url;
    private final String user;
    private final String pass;

    DataBaseConnection() {
        Properties properties = new PropertyReader().getProperties("application.properties");
        this.url = properties.getProperty("db.url");
        this.user = properties.getProperty("db.user");
        this.pass = properties.getProperty("db.pass");
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(this.url, this.user, this.pass);
    }

    public void close(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }
}