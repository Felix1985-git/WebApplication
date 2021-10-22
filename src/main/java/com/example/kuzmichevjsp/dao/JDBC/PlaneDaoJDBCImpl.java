package com.example.kuzmichevjsp.dao.JDBC;

import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.rowMapper.PilotRowMapperWithFlights;
import com.example.kuzmichevjsp.rowMapper.PlaneRowMapper;

import com.example.kuzmichevjsp.rowMapper.PlaneRowMapperWithFlights;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlaneDaoJDBCImpl implements PlaneDaoJDBC {

    private JdbcTemplate jdbcTemplate;
    private final String GET_PLANE_BY_ID_JDBC = "select * from planes where id = ?";
    private final String GET_ALL_PLANE_JDBC = "select * from planes";
    private final String INSERT_PLANE_JDBC = "INSERT INTO planes (BRAND, MODEL, CAPACITY, TALE_NUMBER) VALUES(?, ?, ?, ?)";
    private final String GET_ALL_FLIGHTS_PLANE_ID_JDBC = "SELECT planes.id, planes.brand, planes.model, flights.date, flights.number, flights.time FROM planes JOIN flights on planes.id = planes_id WHERE planes.id = ?";

    @Autowired
    public PlaneDaoJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public PlaneDto getPlaneByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_PLANE_BY_ID_JDBC, new PlaneRowMapper(), id);
    }

    @Override
    public List<PlaneDto> getAllPlaneJDBC() {
        return jdbcTemplate.query(GET_ALL_PLANE_JDBC, new PlaneRowMapper());
    }

    @Override
    public void insertPlaneJDBC(PlaneDto plane) {
        jdbcTemplate.update(INSERT_PLANE_JDBC, plane.getBrand(), plane.getModel(), plane.getCapacity(), plane.getTaleNumber());
    }

    @Override
    public PlaneDto getAllFlightsByPlaneId(int id) {
        return jdbcTemplate.queryForObject(GET_ALL_FLIGHTS_PLANE_ID_JDBC, new PlaneRowMapperWithFlights(), id);
    }
}
