package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.rowMapper.PlaneRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PlaneImp implements PlaneDao {

    private JdbcTemplate jdbcTemplate;
    private final String GET_PLANE_BY_ID_JDBC = "select * from planes where id = ?";
    private final String GET_ALL_PLANE_JDBC = "select * from planes";

    @Autowired
    public PlaneImp(JdbcTemplate jdbcTemplate) {
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
}
