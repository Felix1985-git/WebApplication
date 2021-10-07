package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dto.PilotDto;

public interface PilotServiceJPA {
    void deletePilotByIdJPA(int id);
    void updatePilotByIdJPA (PilotDto pilot);
    PilotDto getPilotByIdJPA(int id);
}
