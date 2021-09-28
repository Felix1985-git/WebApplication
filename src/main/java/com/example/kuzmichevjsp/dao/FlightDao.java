package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Flight;

import java.util.List;

public interface FlightDao {
    Flight getFlightByIdJDBC(int id);
    List<Flight> getAllFlightJDBC();
    void insertFlightJDBC();
}
