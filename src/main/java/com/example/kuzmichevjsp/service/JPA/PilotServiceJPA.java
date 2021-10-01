package com.example.kuzmichevjsp.service.JPA;


import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.entity.Pilot;

import java.util.Optional;

public interface PilotServiceJPA {
    void deletePilotByIdJPA(int id);
    void updatePilotByIdJPA (Pilot pilot);
    Optional<Pilot> getPilotByIdJPA(int id);
}
