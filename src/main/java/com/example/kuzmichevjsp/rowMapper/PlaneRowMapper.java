package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.entity.Plane;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaneRowMapper implements RowMapper<Plane> {

    @Override
    public Plane mapRow(ResultSet resultSet, int i) throws SQLException {
        Plane plane = new Plane();
        plane.setId(resultSet.getInt(1));
        plane.setBrand(resultSet.getString(2));
        plane.setModel(resultSet.getString(3));
        plane.setCapacity(resultSet.getInt(4));
        plane.setTaleNumber(resultSet.getString(5));
        return plane;
    }
}
