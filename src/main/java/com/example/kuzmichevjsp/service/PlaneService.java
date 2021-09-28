package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.entity.Plane;

import java.util.List;

public interface PlaneService {
    Plane getPlaneByIdJDBC(int id);
    List<Plane> getAllPlaneJDBC();
}
