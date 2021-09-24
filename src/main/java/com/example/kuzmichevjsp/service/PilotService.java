package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Pilot;

public interface PilotService {

    Pilot getPilotByIdJDBC(int id);
}
