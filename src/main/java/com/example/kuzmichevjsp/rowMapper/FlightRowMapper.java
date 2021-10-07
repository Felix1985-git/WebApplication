package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class FlightRowMapper implements RowMapper <FlightDto> {



    @Override
    public FlightDto mapRow(ResultSet resultSet, int i) throws SQLException {
        FlightDto flight = new FlightDto();
        flight.setId(resultSet.getInt(1));
        flight.setDate(resultSet.getDate(2));
        flight.setNumber(resultSet.getString(3));
        flight.setTime(resultSet.getTime(4));
        flight.setPilotId(resultSet.getInt(5));
        flight.setPlaneId(resultSet.getInt(6));
        return flight;
    }
}
