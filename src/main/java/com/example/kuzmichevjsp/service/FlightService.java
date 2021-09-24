package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Flight;

public interface FlightService {

    Flight getFlightByIdJDBC(int id);
}
