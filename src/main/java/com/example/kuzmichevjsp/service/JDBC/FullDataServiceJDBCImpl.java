package com.example.kuzmichevjsp.service.JDBC;

import com.example.kuzmichevjsp.dao.JDBC.FullDataJDBC;
import com.example.kuzmichevjsp.dbBuildClass.FullDataDbBuild;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Controller
public class FullDataServiceJDBCImpl implements FullDataServiceJDBC{

    FullDataJDBC fullData;

    @Autowired
    public FullDataServiceJDBCImpl(FullDataJDBC fullData) {
        this.fullData = fullData;
    }

    @Override
    @Transactional
    public List<FullDataDbBuild> getFullDataJDBC() {
        return fullData.getFullDataJDBC();
    }
}
