package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Plane;

public interface PlaneService {
    Plane getPlaneByIdJDBC(int id);
}
