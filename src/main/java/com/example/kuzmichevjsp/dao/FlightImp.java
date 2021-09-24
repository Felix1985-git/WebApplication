package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.rowMapper.FlightRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class FlightImp implements FlightDao {

    private JdbcTemplate jdbcTemplate;

    private final String GET_FLIGHT_BY_ID_JDBC = "select * from flights where id = ?";

    @Autowired
    public FlightImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Flight getFlightByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_FLIGHT_BY_ID_JDBC,new FlightRowMapper(), id);
    }
}
