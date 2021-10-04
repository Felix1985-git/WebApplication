package com.example.kuzmichevjsp.service.JDBC;


import com.example.kuzmichevjsp.dao.JDBC.PilotDaoJDBC;
import com.example.kuzmichevjsp.dto.PilotDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class PilotServiceJDBCImpl implements PilotServiceJDBC {

    private PilotDaoJDBC pilotDao;

    @Autowired
    public PilotServiceJDBCImpl(PilotDaoJDBC pilotDao) {
        this.pilotDao = pilotDao;
    }

    @Override
    @Transactional
    public PilotDto getPilotByIdJDBC(int id) {
        return pilotDao.getPilotByIdJDBC(id);
    }

    @Override
    @Transactional
    public List<PilotDto> getAllPilotJDBC() {
        return pilotDao.getAllPilotJDBC();
    }

    @Override
    @Transactional
    public void insertPilotJDBC(PilotDto pilot) {
        pilotDao.insertPilotJDBC(pilot);
    }
}
