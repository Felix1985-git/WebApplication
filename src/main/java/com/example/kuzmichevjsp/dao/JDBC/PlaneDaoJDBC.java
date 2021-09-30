package com.example.kuzmichevjsp.dao.JDBC;

import com.example.kuzmichevjsp.dto.PlaneDto;

import java.util.List;

public interface PlaneDaoJDBC {
    PlaneDto getPlaneByIdJDBC (int id);
    List<PlaneDto> getAllPlaneJDBC();
    void insertPlaneJDBC (PlaneDto plane);
}
