package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;
import com.example.kuzmichevjsp.entity.Pilot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class PilotServiceJPAImpl implements PilotServiceJPA{

    private PilotDaoJPA pilotDaoJPA;

    @Autowired
    public PilotServiceJPAImpl(PilotDaoJPA pilotDaoJPA) {
        this.pilotDaoJPA = pilotDaoJPA;
    }


    @Override
    @Transactional
    public void deletePilotByIdJPA(int id) {
        pilotDaoJPA.deleteById(id);
    }

    @Override
    @Transactional
    public void updatePilotByIdJPA(Pilot pilot) {
        pilotDaoJPA.save(pilot);
    }

    @Override
    @Transactional
    public Optional<Pilot> getPilotByIdJPA(int id) {
        return pilotDaoJPA.findById(id);
    }

}
