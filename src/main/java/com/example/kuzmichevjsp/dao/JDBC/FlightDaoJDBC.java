package com.example.kuzmichevjsp.dao.JDBC;

import com.example.kuzmichevjsp.dto.FlightDto;

import java.util.List;

public interface FlightDaoJDBC {
    FlightDto getFlightByIdJDBC(int id);
    List<FlightDto> getAllFlightJDBC();
    void insertFlightJDBC(FlightDto flight);
}
