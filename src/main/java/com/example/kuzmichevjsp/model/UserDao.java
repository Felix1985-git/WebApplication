package com.example.kuzmichevjsp.model;

import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Component
public class UserDao {

    private DataSource dataSource;

    public UserDao(DataSource dataSource) { // (1)
        this.dataSource = dataSource;
    }

    public User findById(Integer id) throws SQLException {
        try (Connection connection = dataSource.getConnection()) { // (2)
            PreparedStatement selectStatement = connection.prepareStatement("select * from users where id =  ?");
            // TODO execute the select etc.
        } return findById(id);
    }

    public User findByFirstName(String firstName) throws SQLException {
        try (Connection connection = dataSource.getConnection()) { // (2)
            PreparedStatement selectStatement = connection.prepareStatement("select * from users where first_name =  ?");
            // TODO execute the select etc.
        } return findByFirstName(firstName);
    }
}
