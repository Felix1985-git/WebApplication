package com.example.kuzmichevjsp.service.JPA;


import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Plane;

import java.util.Optional;

public interface PlaneServiceJPA {
    void deletePlaneByIdJPA(int id);
    Optional<Plane> getPlaneByIdJPA(int id);
    void updatePlaneByIdJPA (Plane plane);
}
