package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.FlightDaoJPA;
import com.example.kuzmichevjsp.entity.Flight;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class FlightServiceJPAImpl implements FlightServiceJPA{

    private FlightDaoJPA flightDaoJPA;

    @Autowired
    public FlightServiceJPAImpl(FlightDaoJPA flightDaoJPA) {
        this.flightDaoJPA = flightDaoJPA;
    }

    @Override
    public void deleteFlightByIdJPA(int id) {
        flightDaoJPA.deleteById(id);
    }

    @Override
    public void updateFlightByIdJPA(Flight flight) {
        flightDaoJPA.save(flight);
    }

    @Override
    public Optional<Flight> getFlightByIdJPA(int id) {
        return flightDaoJPA.findById(id);
    }

}
