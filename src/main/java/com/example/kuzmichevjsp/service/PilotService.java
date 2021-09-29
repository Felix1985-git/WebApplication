package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dto.PilotDto;

import java.util.List;

public interface PilotService {

    PilotDto getPilotByIdJDBC(int id);
    List<PilotDto> getAllPilotJDBC();
    void insertPilotJDBC (PilotDto pilot);
}
