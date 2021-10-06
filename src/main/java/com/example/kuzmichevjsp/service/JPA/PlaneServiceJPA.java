package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.entity.Plane;

public interface PlaneServiceJPA {
    void deletePlaneByIdJPA(int id);
    PlaneDto getPlaneByIdJPA(int id);
    void updatePlaneByIdJPA (PlaneDto plane);
}
