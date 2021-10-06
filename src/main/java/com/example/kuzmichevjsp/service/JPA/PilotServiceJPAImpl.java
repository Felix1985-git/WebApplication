package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.RangDto;
import com.example.kuzmichevjsp.entity.Pilot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
    public void updatePilotByIdJPA(PilotDto pilot) {
        pilotDaoJPA.save(new Pilot(pilot.getId(), pilot.getFirstName(), pilot.getLastName(), pilot.getRang(), pilot.getCode()));
    }

    @Override
    @Transactional
    public PilotDto getPilotByIdJPA(int id) {
        Pilot pilot = pilotDaoJPA.findById(id).get();
        return new PilotDto(pilot.getId(), pilot.getFirstName(), pilot.getLastName(), pilot.getRang(), pilot.getCode());
    }

}
