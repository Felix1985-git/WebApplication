package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PilotDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class PilotRowMapperWithFlights implements RowMapper<PilotDto> {
    @Override
    public PilotDto mapRow(ResultSet resultSet, int i) throws SQLException {
        PilotDto pilot = new PilotDto();
        List<FlightDto> flights = new ArrayList<>();

        if (pilot.getId() == 0) {
            pilot.setId(resultSet.getInt(1));
            pilot.setFirstName(resultSet.getString(2));
            pilot.setLastName(resultSet.getString(3));
            FlightDto flight = new FlightDto();
            flight.setDate(resultSet.getDate(4));
            flight.setNumber(resultSet.getString(5));
            flight.setTime(resultSet.getTime(6));
            flights.add(flight);

            while (resultSet.next()){
                FlightDto flightDto = new FlightDto();
                flightDto.setDate(resultSet.getDate(4));
                flightDto.setNumber(resultSet.getString(5));
                flightDto.setTime(resultSet.getTime(6));
                flights.add(flightDto);
            }
            pilot.setFlights(flights);}
        return pilot;
    }

}