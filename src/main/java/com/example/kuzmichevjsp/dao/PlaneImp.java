package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Plane;
import com.example.kuzmichevjsp.rowMapper.PlaneRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

import org.springframework.stereotype.Repository;

@Repository
public class PlaneImp implements PlaneDao {

    private JdbcTemplate jdbcTemplate;
    private final String GET_PLANE_BY_ID_JDBC = "select * from planes where id = ?";

    @Autowired
    public PlaneImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Plane getPlaneByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_PLANE_BY_ID_JDBC, new PlaneRowMapper(), id);
    }
}
