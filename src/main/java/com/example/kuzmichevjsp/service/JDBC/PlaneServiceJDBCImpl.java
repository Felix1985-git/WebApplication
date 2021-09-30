package com.example.kuzmichevjsp.service.JDBC;

import com.example.kuzmichevjsp.dao.JDBC.PlaneDaoJDBC;
import com.example.kuzmichevjsp.dto.PlaneDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceJDBCImpl implements PlaneServiceJDBC {

    private PlaneDaoJDBC planeDao;

    @Autowired
    public PlaneServiceJDBCImpl(PlaneDaoJDBC planeDao) {
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
