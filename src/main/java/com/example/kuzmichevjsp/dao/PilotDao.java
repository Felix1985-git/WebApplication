package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.PilotDto;

import java.util.List;

public interface PilotDao {
    PilotDto getPilotByIdJDBC(int id);
    List<PilotDto> getAllPilotJDBC();
}
