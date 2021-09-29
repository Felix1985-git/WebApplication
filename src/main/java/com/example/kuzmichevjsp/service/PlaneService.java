package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PlaneDto;

import java.util.List;

public interface PlaneService {
    PlaneDto getPlaneByIdJDBC(int id);
    List<PlaneDto> getAllPlaneJDBC();
    void insertPlaneJDBC(PlaneDto Plane);
}
