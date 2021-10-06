package com.example.kuzmichevjsp.dao.JDBC;

import com.example.kuzmichevjsp.dto.FullDataDto;

import com.example.kuzmichevjsp.rowMapper.FullDataRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FullDataJDBCImpl implements FullDataJDBC{

    private JdbcTemplate jdbcTemplate;

    private final String SELECT_FULL_DATA = "SELECT fl.number, fl.date, fl.time, pl.tale_number, pl.brand, " +
            "pl.model, pl.capacity, p.last_name, p.first_name, p.code, p.rang\n" +
            "FROM flights fl\n" +
            "JOIN planes pl ON fl.planes_id = pl.id \n" +
            "JOIN pilots p ON fl.pilots_id = p.id;";

    @Autowired
    public FullDataJDBCImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    @Override
    public List<FullDataDto> getFullDataJDBC() {
        return jdbcTemplate.query(SELECT_FULL_DATA, new FullDataRowMapper());
    }
}
