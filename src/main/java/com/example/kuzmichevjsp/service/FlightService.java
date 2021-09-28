package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dto.FlightDto;

import java.util.List;

public interface FlightService {

    FlightDto getFlightByIdJDBC(int id);
    List<FlightDto> getAllFlightJDBC();
    void insertFlightJDBC(FlightDto flight);
}
