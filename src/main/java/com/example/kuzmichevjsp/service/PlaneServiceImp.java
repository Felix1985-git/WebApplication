package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.PlaneDao;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImp implements PlaneService {

    private PlaneDao planeDao;

    @Autowired
    public PlaneServiceImp(PlaneDao planeDao) {
        this.planeDao = planeDao;
    }

    @Override
    public PlaneDto getPlaneByIdJDBC(int id) {
        return planeDao.getPlaneByIdJDBC(id);
    }

    @Override
    public List<PlaneDto> getAllPlaneJDBC() {
        return planeDao.getAllPlaneJDBC();
    }

    @Override
    public void insertPlaneJDBC(PlaneDto plane) {
        planeDao.insertPlaneJDBC(plane);
    }
}
