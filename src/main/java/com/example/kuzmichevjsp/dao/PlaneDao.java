package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.entity.Plane;

public interface PlaneDao {
    Plane getPlaneByIdJDBC (int id);
}
