package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.PilotDao;
import com.example.kuzmichevjsp.entity.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PilotServiceImp implements PilotService {

    private PilotDao pilotDao;

    @Autowired
    public PilotServiceImp(PilotDao pilotDao) {
        this.pilotDao = pilotDao;
    }

    @Override
    public Pilot getPilotByIdJDBC(int id) {
        return pilotDao.getPilotByIdJDBC(id);
    }
}
