package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.entity.Pilot;

import java.util.List;

public interface PilotDao {
    Pilot getPilotByIdJDBC(int id);
    List<Pilot> getAllPilotJDBC();
}
