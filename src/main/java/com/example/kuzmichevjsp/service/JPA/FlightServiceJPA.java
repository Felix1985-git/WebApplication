package com.example.kuzmichevjsp.service.JPA;


import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.entity.Flight;

import java.util.Optional;

public interface FlightServiceJPA {
    void deleteFlightByIdJPA(int id);
    void updateFlightByIdJPA (Flight flight);
    Flight getFlightByIdJPA(int id);
}
