package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PlaneDaoJPA;
import com.example.kuzmichevjsp.dbBuildClass.PlaneDbBuild;
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
    public PlaneDbBuild getPlaneByIdJPA(int id) {
        Plane plane = planeDaoJPA.findById(id).get();
        return new PlaneDbBuild(plane.getId(), plane.getBrand(), plane.getModel(), plane.getCapacity(), plane.getTaleNumber());
    }

    @Override
    @Transactional
    public void updatePlaneByIdJPA(PlaneDbBuild plane) {
//        planeDaoJPA.save(new Plane(plane.getId(), plane.getBrand(), plane.getModel(),plane.getCapacity(),plane.getTaleNumber()));

    }
}
