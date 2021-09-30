package com.example.kuzmichevjsp.service.JDBC;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PlaneDto;

import java.util.List;

public interface PlaneServiceJDBC {
    PlaneDto getPlaneByIdJDBC(int id);
    List<PlaneDto> getAllPlaneJDBC();
    void insertPlaneJDBC(PlaneDto Plane);
}
