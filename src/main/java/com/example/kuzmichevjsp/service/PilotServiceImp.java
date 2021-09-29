package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.PilotDao;
import com.example.kuzmichevjsp.dto.PilotDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PilotServiceImp implements PilotService {

    private PilotDao pilotDao;

    @Autowired
    public PilotServiceImp(PilotDao pilotDao) {
        this.pilotDao = pilotDao;
    }

    @Override
    public PilotDto getPilotByIdJDBC(int id) {
        return pilotDao.getPilotByIdJDBC(id);
    }

    @Override
    public List<PilotDto> getAllPilotJDBC() {
        return pilotDao.getAllPilotJDBC();
    }

    @Override
    public void insertPilotJDBC(PilotDto pilot) {
        pilotDao.insertPilotJDBC(pilot);
    }
}
