package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.RangDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PilotRowMapper implements RowMapper<PilotDto> {

    @Override
    public PilotDto mapRow(ResultSet resultSet, int i) throws SQLException {
        PilotDto pilot = new PilotDto();
        pilot.setId(resultSet.getInt(1));
        pilot.setCode(resultSet.getString(2));
        pilot.setFirstName(resultSet.getString(3));
        pilot.setLastName(resultSet.getString(4));
        pilot.setRang(RangDto.valueOf(resultSet.getString(5)));
        return pilot;
    }
}
