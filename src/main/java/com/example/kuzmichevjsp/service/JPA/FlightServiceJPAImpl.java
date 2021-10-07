package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.FlightDaoJPA;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.entity.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class FlightServiceJPAImpl implements FlightServiceJPA{

    private FlightDaoJPA flightDaoJPA;

    @Autowired
    public FlightServiceJPAImpl(FlightDaoJPA flightDaoJPA) {
        this.flightDaoJPA = flightDaoJPA;
    }

    @Override
    @Transactional
    public void deleteFlightByIdJPA(int id) {
        flightDaoJPA.deleteById(id);
    }

    @Override
    @Transactional
    public void updateFlightByIdJPA(FlightDto flight) {
        flightDaoJPA.save(new Flight(flight.getId(), flightDaoJPA.findById(flight.getId()).get().getPlane(), flightDaoJPA.findById(flight.getId()).get().getPilot(), flight.getDate(), flight.getTime(), flight.getNumber()));
    }

    @Override
    @Transactional
    public FlightDto getFlightByIdJPA(int id) {
        Flight flight = flightDaoJPA.findById(id).get();
        return new FlightDto(flight.getId(), flight.getPlane(), flight.getPilot(), flight.getDate(), flight.getTime(), flight.getNumber());
    }

}
//public Flight(Integer id, Plane plane, Pilot pilot, Date date, Time time, String number)
