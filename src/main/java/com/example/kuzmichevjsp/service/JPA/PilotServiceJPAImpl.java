package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.entity.Flight;
import com.example.kuzmichevjsp.entity.Pilot;

import com.example.kuzmichevjsp.entity.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

@Service
public class PilotServiceJPAImpl implements PilotServiceJPA {

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
    public void updatePilotByIdJPA(PilotDto pilotDto) {
        Pilot pilot = new Pilot(pilotDto.getId(),pilotDto.getFirstName(),pilotDto.getLastName(),pilotDto.getRang(),pilotDto.getCode(),);
        pilotDaoJPA.save(pilot);
    }

    @Override
    @Transactional
    public PilotDto getPilotByIdJPA(int id) {
        Pilot pilot = pilotDaoJPA.findById(id).get();
        return new PilotDto(pilot.getId(),pilot.getFirstName(),pilot.getLastName(),pilot.getRang(),pilot.getCode(),);
    }

}


