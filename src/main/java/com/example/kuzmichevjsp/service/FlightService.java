package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Flight;

import java.util.List;

public interface FlightService {

    Flight getFlightByIdJDBC(int id);
    List<Flight> getAllFlightJDBC();
    void insertFlightJDBC();
}
