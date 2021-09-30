package com.example.kuzmichevjsp.service.JDBC;

import com.example.kuzmichevjsp.dto.FlightDto;

import java.util.List;

public interface FlightServiceJDBC {

    FlightDto getFlightByIdJDBC(int id);
    List<FlightDto> getAllFlightJDBC();
    void insertFlightJDBC(FlightDto flight);
}
