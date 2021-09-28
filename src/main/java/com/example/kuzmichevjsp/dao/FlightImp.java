package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.rowMapper.FlightRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public class FlightImp implements FlightDao {

    private JdbcTemplate jdbcTemplate;

    private final String GET_FLIGHT_BY_ID_JDBC = "select * from flights where id = ?";
    private final String GET_ALL_FLIGHT_JDBC = "select * from flights";
    private final String INSERT_FLIGHT_JDBC = "INSERT INTO flights (PLANES_ID , PILOTS_ID , DATE , TIME, NUMBER) VALUES(?, ?, ?, ?, ?)";

    @Autowired
    public FlightImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public FlightDto getFlightByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_FLIGHT_BY_ID_JDBC, new FlightRowMapper(), id);
    }

    @Override
    public List<FlightDto> getAllFlightJDBC() {
        return jdbcTemplate.query(GET_ALL_FLIGHT_JDBC, new FlightRowMapper());
    }

    @Override
    public void insertFlightJDBC(FlightDto flight) {
        jdbcTemplate.update(INSERT_FLIGHT_JDBC, flight.getPlanesId(), flight.getPilotsId(), flight.getDate(), flight.getTime(), flight.getNumber());
    }

}
