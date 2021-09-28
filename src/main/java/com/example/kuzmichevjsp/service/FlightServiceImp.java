package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.FlightDao;
import com.example.kuzmichevjsp.dto.FlightDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.beans.Transient;
import java.util.List;

@Service
public class FlightServiceImp implements FlightService {

    private FlightDao flightDao;

    @Autowired
    public FlightServiceImp(FlightDao flightDao) {
        this.flightDao = flightDao;
    }

    @Override
    public FlightDto getFlightByIdJDBC(int id) {
        return flightDao.getFlightByIdJDBC(id);
    }

    @Override
    public List<FlightDto> getAllFlightJDBC() {
        return flightDao.getAllFlightJDBC();
    }

    @Override
    @Transient
    public void insertFlightJDBC(FlightDto flight) {
        FlightDto flightDto = new FlightDto();
        flightDto.setPlanesId(flight.getPlanesId());
        flightDto.setPilotsId(flight.getPilotsId());
        flightDto.setDate(flight.getDate());
        flightDto.setTime(flight.getTime());
        flightDto.setNumber(flight.getNumber());
        flightDao.insertFlightJDBC(flightDto);
    }
}
