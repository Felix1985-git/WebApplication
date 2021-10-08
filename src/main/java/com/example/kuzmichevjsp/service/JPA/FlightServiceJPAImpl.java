package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.FlightDaoJPA;
import com.example.kuzmichevjsp.dao.JPA.PilotDaoJPA;
import com.example.kuzmichevjsp.dao.JPA.PlaneDaoJPA;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.entity.Flight;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightServiceJPAImpl implements FlightServiceJPA{

    private FlightDaoJPA flightDaoJPA;
    private PilotDaoJPA pilotDaoJPA;
    private PlaneDaoJPA planeDaoJPA;

    @Autowired
    public FlightServiceJPAImpl(FlightDaoJPA flightDaoJPA, PilotDaoJPA pilotDaoJPA, PlaneDaoJPA planeDaoJPA) {
        this.flightDaoJPA = flightDaoJPA;
        this.pilotDaoJPA = pilotDaoJPA;
        this.planeDaoJPA = planeDaoJPA;
    }

    @Override
    @Transactional
    public void deleteFlightByIdJPA(int id) {
        flightDaoJPA.deleteById(id);
    }

    @Override
    @Transactional
    public void updateFlightByIdJPA(FlightDto flight) {
        Pilot pilot = pilotDaoJPA.findById(flight.getPilotsId()).get();
        Plane plane = planeDaoJPA.findById(flight.getPlanesId()).get();
        planeDaoJPA.findById(flight.getPlanesId());
        flightDaoJPA.save(new Flight(flight.getId(), plane, pilot, flight.getDate(), flight.getTime(), flight.getNumber()));
    }

    @Override
    @Transactional
    public FlightDto getFlightByIdJPA(int id) {
        Flight flight = flightDaoJPA.findById(id).get();
        return new FlightDto(flight.getId(), flight.getPlane().getId(), flight.getPilot().getId(), flight.getDate(), flight.getTime(), flight.getNumber());
    }

}
//public Flight(Integer id, Plane plane, Pilot pilot, Date date, Time time, String number)
