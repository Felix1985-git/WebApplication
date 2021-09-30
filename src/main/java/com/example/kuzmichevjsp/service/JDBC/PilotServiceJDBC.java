package com.example.kuzmichevjsp.service.JDBC;

import com.example.kuzmichevjsp.dto.PilotDto;

import java.util.List;

public interface PilotServiceJDBC {

    PilotDto getPilotByIdJDBC(int id);
    List<PilotDto> getAllPilotJDBC();
    void insertPilotJDBC (PilotDto pilot);
}
