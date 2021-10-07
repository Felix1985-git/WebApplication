package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dbBuildClass.PlaneDbBuild;

public interface PlaneServiceJPA {
    void deletePlaneByIdJPA(int id);
    PlaneDbBuild getPlaneByIdJPA(int id);
    void updatePlaneByIdJPA (PlaneDbBuild plane);
}
