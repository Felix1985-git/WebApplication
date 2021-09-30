package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotServiceJPAImpl implements PilotServiceJPA{

    private PilotDaoJPA pilotDaoJPA;

    @Autowired
    public PilotServiceJPAImpl(PilotDaoJPA pilotDaoJPA) {
        this.pilotDaoJPA = pilotDaoJPA;
    }


    @Override
    public void deletePilotById(int id) {
        pilotDaoJPA.deleteById(id);
    }
}
