package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dto.FlightDto;

public interface FlightServiceJPA {
    void deleteFlightByIdJPA(int id);
    void updateFlightByIdJPA (FlightDto flight);
    FlightDto getFlightByIdJPA(int id);
}
