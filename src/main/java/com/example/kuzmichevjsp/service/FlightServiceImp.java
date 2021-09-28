package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.FlightDao;
import com.example.kuzmichevjsp.entity.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    private FlightDao flightDao;

    @Autowired
    public FlightServiceImp(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public Flight getFlightByIdJDBC(int id) {
        return flightDao.getFlightByIdJDBC(id);
    }

    @Override
    public List<Flight> getAllFlightJDBC() {
        return flightDao.getAllFlightJDBC();
    }
}
