package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Pilot;

import java.util.List;

public interface PilotService {

    Pilot getPilotByIdJDBC(int id);
    List<Pilot> getAllPilotJDBC();
}
