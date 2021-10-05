package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.entity.Flight;

public interface FlightServiceJPA {
    void deleteFlightByIdJPA(int id);
    void updateFlightByIdJPA (Flight flight);
    Flight getFlightByIdJPA(int id);
}
