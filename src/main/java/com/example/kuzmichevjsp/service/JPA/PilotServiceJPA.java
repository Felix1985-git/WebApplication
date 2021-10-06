package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.entity.Pilot;

public interface PilotServiceJPA {
    void deletePilotByIdJPA(int id);
    void updatePilotByIdJPA (PilotDto pilot);
    PilotDto getPilotByIdJPA(int id);
}
