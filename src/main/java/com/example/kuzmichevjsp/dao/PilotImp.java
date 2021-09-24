package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.rowMapper.PilotRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PilotImp implements PilotDao {

    private JdbcTemplate jdbcTemplate;
    private final String GET_PILOT_BY_ID_JDBC = "select * from pilots where id = ?";

    @Autowired
    public PilotImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Pilot getPilotByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_PILOT_BY_ID_JDBC,new PilotRowMapper(), id);
    }
}
