package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Pilot;

public interface PilotDao {
    Pilot getPilotByIdJDBC(int id);
}
