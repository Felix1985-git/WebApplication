package com.example.kuzmichevjsp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {

    public static Connection getConnection() {
        Connection connection = null;

        try {
            connection = DriverManager.getConnection("jdbc:h2:mem:testdb","user","pass");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return connection;
    }
}


