package com.example.kuzmichevjsp.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.sql.DataSource;
import java.sql.SQLException;


public class MyApplication {
    public static void main(String[] args) throws SQLException {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.kuzmichevjsp");
        UserDao userDao = context.getBean(UserDao.class);
        DataSource dataSource = context.getBean(DataSource.class);

        UserDao userDao1 = new UserDao(dataSource);

    }

}
