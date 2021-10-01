package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;

import com.example.kuzmichevjsp.entity.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PilotServiceJPAImpl implements PilotServiceJPA{

    private PilotDaoJPA pilotDaoJPA;

    @Autowired
    public PilotServiceJPAImpl(PilotDaoJPA pilotDaoJPA) {
        this.pilotDaoJPA = pilotDaoJPA;
    }


    @Override
    public void deletePilotByIdJPA(int id) {
        pilotDaoJPA.deleteById(id);
    }

    @Override
    public void updatePilotByIdJPA(Pilot pilot) {
        pilotDaoJPA.save(pilot);
    }

    @Override
    public Optional<Pilot> getPilotByIdJPA(int id) {
        return pilotDaoJPA.findById(id);
    }

}
