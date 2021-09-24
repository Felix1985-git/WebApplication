package com.example.kuzmichevjsp.service;

import com.example.kuzmichevjsp.dao.PlaneDao;
import com.example.kuzmichevjsp.entity.Plane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PlaneServiceImp implements PlaneService {

    private PlaneDao planeDao;

    @Autowired
    public PlaneServiceImp(PlaneDao planeDao) {
        this.planeDao = planeDao;
    }

    @Override
    public Plane getPlaneByIdJDBC(int id) {
        return planeDao.getPlaneByIdJDBC(id);
    }
}
