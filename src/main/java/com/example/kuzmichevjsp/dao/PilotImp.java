package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.rowMapper.PilotRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PilotImp implements PilotDao {

    private JdbcTemplate jdbcTemplate;
    private final String GET_PILOT_BY_ID_JDBC = "select * from pilots where id = ?";
    private final String GET_ALL_PILOT_JDBC = "select * from pilots";
    private final String INSERT_PILOT_JDBC = "INSERT INTO pilots (FIRST_NAME , LAST_NAME, RANG , CODE) VALUES(?, ?, ?, ?)";

    @Autowired
    public PilotImp(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public PilotDto getPilotByIdJDBC(int id) {
        return jdbcTemplate.queryForObject(GET_PILOT_BY_ID_JDBC,new PilotRowMapper(), id);
    }

    @Override
    public List<PilotDto> getAllPilotJDBC() {
        return jdbcTemplate.query(GET_ALL_PILOT_JDBC, new PilotRowMapper());
    }

    @Override
    public void insertPilotJDBC(PilotDto pilot) {
        jdbcTemplate.update(INSERT_PILOT_JDBC, pilot.getFirstName(), pilot.getLastName(), pilot.getRang(), pilot.getCode());
    }
}
