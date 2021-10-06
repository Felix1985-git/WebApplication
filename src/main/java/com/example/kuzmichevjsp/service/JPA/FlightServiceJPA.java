package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.entity.Flight;

public interface FlightServiceJPA {
    void deleteFlightByIdJPA(int id);
    void updateFlightByIdJPA (FlightDto flight);
    FlightDto getFlightByIdJPA(int id);
}
