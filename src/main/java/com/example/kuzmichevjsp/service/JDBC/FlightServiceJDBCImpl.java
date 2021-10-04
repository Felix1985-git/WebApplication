package com.example.kuzmichevjsp.service.JDBC;


import com.example.kuzmichevjsp.dao.JDBC.FlightDaoJDBC;
import com.example.kuzmichevjsp.dto.FlightDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class FlightServiceJDBCImpl implements FlightServiceJDBC {

    private FlightDaoJDBC flightDao;

    @Autowired
    public FlightServiceJDBCImpl(FlightDaoJDBC flightDao) {
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
    @Transactional
    public void insertFlightJDBC(FlightDto flight) {
        flightDao.insertFlightJDBC(flight);
    }
}
