package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.entity.Plane;

import java.util.List;

public interface PlaneDao {
    Plane getPlaneByIdJDBC (int id);
    List<Plane> getAllPlaneJDBC();
}
