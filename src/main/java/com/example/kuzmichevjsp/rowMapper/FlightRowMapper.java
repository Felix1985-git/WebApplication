package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.FlightDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class FlightRowMapper implements RowMapper <FlightDto> {

    @Override
    public FlightDto mapRow(ResultSet resultSet, int i) throws SQLException {
        FlightDto flight = new FlightDto();
        flight.setId(resultSet.getInt(1));
        flight.setPlanesId(resultSet.getInt(2));
        flight.setPilotsId(resultSet.getInt(3));
        flight.setDate(resultSet.getDate(4));
        flight.setTime(resultSet.getTime(5));
        flight.setNumber(resultSet.getString(6));
        return flight;
    }
}
