package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.FlightDto;

import java.util.List;

public interface FlightDao {
    FlightDto getFlightByIdJDBC(int id);
    List<FlightDto> getAllFlightJDBC();
    void insertFlightJDBC(FlightDto flight);
}
