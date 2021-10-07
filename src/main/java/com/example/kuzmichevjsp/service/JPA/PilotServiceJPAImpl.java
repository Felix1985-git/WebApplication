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

import java.util.ArrayList;
import java.util.List;

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
        pilotDaoJPA.save(castPilotDtoToPilot(pilot));
    }

    @Override
    @Transactional
    public PilotDto getPilotByIdJPA(int id) {
        return castPilotToPilotDto(pilotDaoJPA.findById(id).get());
    }

    private Pilot castPilotDtoToPilot (PilotDto pilotDto) {
        Pilot pilot = new Pilot();
        pilot.setId(pilotDto.getId());
        pilot.setFirstName(pilotDto.getFirstName());
        pilot.setLastName(pilotDto.getLastName());
        pilot.setRang(pilotDto.getRang());
        pilot.setCode(pilotDto.getCode());
        pilot.setFlights();
        return pilot;
    }

    private PilotDto castPilotToPilotDto (Pilot pilot) {
        PilotDto pilotDto = new PilotDto();
        pilotDto.setId(pilot.getId());
        pilotDto.setFirstName(pilot.getFirstName());
        pilotDto.setLastName(pilot.getLastName());
        pilotDto.setRang(pilot.getRang());
        pilotDto.setCode(pilot.getCode());
        pilotDto.setFlights();
        return pilotDto;
    }

    private Plane castPlaneDtoToPlane (PlaneDto planeDto) {
        Plane plane = new Plane();
        plane.setId(planeDto.getId());
        plane.setBrand(planeDto.getBrand());
        plane.setModel(planeDto.getModel());
        plane.setCapacity(planeDto.getCapacity());
        plane.setTaleNumber(planeDto.getTaleNumber());
        plane.setFlights();
        return plane;
    }

    private PlaneDto castPlaneToPlaneDto (Plane plane) {
        PlaneDto planeDto = new PlaneDto();
        planeDto.setId(plane.getId());
        planeDto.setBrand(plane.getBrand());
        planeDto.setModel(plane.getModel());
        planeDto.setCapacity(plane.getCapacity());
        planeDto.setTaleNumber(plane.getTaleNumber());
        planeDto.setFlights();
        return planeDto;
    }

    private Flight castFlightDtoToFlight (FlightDto flightDto) {
        Flight flight = new Flight();
        flight.setId(flightDto.getId());
        flight.setPlane(castPlaneDtoToPlane(flightDto.getPlane()));
        flight.setPilot(castPilotDtoToPilot(flightDto.getPilot()));
        flight.setDate(flightDto.getDate());
        flight.setTime(flightDto.getTime());
        flight.setNumber(flightDto.getNumber());
        return flight;
    }

    private FlightDto castFlightTyFlightDto (Flight flight) {
        FlightDto flightDto = new FlightDto();
        flightDto.setId(flight.getId());
        flightDto.setPlane(castPlaneToPlaneDto(flight.getPlane()));
        flightDto.setPilot(castPilotToPilotDto(flight.getPilot()));
        flightDto.setDate(flight.getDate());
        flightDto.setTime(flight.getTime());
        flightDto.setNumber(flight.getNumber());
        return flightDto;
    }


}


