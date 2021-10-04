package com.example.kuzmichevjsp.service.JPA;


import com.example.kuzmichevjsp.dao.JPA.PlaneDaoJPA;
import com.example.kuzmichevjsp.entity.Plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class PlaneServiceJPAImpl implements PlaneServiceJPA{

    private PlaneDaoJPA planeDaoJPA;

    @Autowired
    public PlaneServiceJPAImpl(PlaneDaoJPA planeDaoJPA) {
        this.planeDaoJPA = planeDaoJPA;
    }


    @Override
    @Transactional
    public void deletePlaneByIdJPA(int id) {
        planeDaoJPA.deleteById(id);
    }

    @Override
    @Transactional
    public Optional<Plane> getPlaneByIdJPA(int id) {
        return planeDaoJPA.findById(id);
    }

    @Override
    @Transactional
    public void updatePlaneByIdJPA(Plane plane) {
        planeDaoJPA.save(plane);

    }
}
