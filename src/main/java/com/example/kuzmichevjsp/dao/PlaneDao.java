package com.example.kuzmichevjsp.dao;

import com.example.kuzmichevjsp.dto.PlaneDto;

import java.util.List;

public interface PlaneDao {
    PlaneDto getPlaneByIdJDBC (int id);
    List<PlaneDto> getAllPlaneJDBC();
    void insertPlaneJDBC (PlaneDto plane);
}
