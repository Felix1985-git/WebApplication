package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PlaneDaoJPA;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.entity.Plane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public PlaneDto getPlaneByIdJPA(int id) {
        Plane plane = planeDaoJPA.findById(id).get();
        return new PlaneDto(plane.getId(), plane.getBrand(), plane.getModel(), plane.getCapacity(), plane.getTaleNumber());
    }

    @Override
    @Transactional
    public void updatePlaneByIdJPA(PlaneDto plane) {
        planeDaoJPA.save(new Plane(plane.getId(), plane.getBrand(), plane.getModel(),plane.getCapacity(),plane.getTaleNumber()));

    }
}
