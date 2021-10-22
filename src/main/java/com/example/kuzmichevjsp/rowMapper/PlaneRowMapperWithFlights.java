package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PlaneRowMapperWithFlights implements RowMapper<PlaneDto> {
    @Override
    public PlaneDto mapRow(ResultSet resultSet, int i) throws SQLException {
        PlaneDto plane = new PlaneDto();
        List<FlightDto> flights = new ArrayList<>();

        if (plane.getId() == 0) {
            plane.setId(resultSet.getInt(1));
            plane.setBrand(resultSet.getString(2));
            plane.setModel(resultSet.getString(3));
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
            plane.setFlights(flights);}
        return plane;
    }
}
