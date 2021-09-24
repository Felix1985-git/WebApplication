package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Flight;

public interface FlightDao {
    Flight getFlightByIdJDBC(int id);
}
