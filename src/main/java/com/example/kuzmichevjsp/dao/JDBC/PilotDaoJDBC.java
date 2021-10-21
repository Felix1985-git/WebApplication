package com.example.kuzmichevjsp.dao.JDBC;

import com.example.kuzmichevjsp.dto.PilotDto;

import java.util.List;

public interface PilotDaoJDBC {
    PilotDto getPilotByIdJDBC(int id);
    List<PilotDto> getAllPilotJDBC();
    void insertPilotJDBC (PilotDto pilot);
    PilotDto getAllFlightsByPilotId (int id);
}
