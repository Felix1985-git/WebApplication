package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PlaneDaoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceJPAImpl implements PlaneServiceJPA{

    private PlaneDaoJPA planeDaoJPA;

    @Autowired
    public PlaneServiceJPAImpl(PlaneDaoJPA planeDaoJPA) {
        this.planeDaoJPA = planeDaoJPA;
    }


    @Override
    public void deletePlaneById(int id) {
        planeDaoJPA.deleteById(id);
    }
}
