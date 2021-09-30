package com.example.kuzmichevjsp.service.JPA;

import com.example.kuzmichevjsp.dao.JPA.FlightDaoJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightServiceJPAImpl implements FlightServiceJPA{

    private FlightDaoJPA flightDaoJPA;

    @Autowired
    public FlightServiceJPAImpl(FlightDaoJPA flightDaoJPA) {
        this.flightDaoJPA = flightDaoJPA;
    }

    @Override
    public void deleteFlightById(int id) {
        flightDaoJPA.deleteById(id);
    }
}
