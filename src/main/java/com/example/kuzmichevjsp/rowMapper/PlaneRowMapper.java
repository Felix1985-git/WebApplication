package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.PlaneDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PlaneRowMapper implements RowMapper<PlaneDto> {

    @Override
    public PlaneDto mapRow(ResultSet resultSet, int i) throws SQLException {
        PlaneDto plane = new PlaneDto();
        plane.setId(resultSet.getInt(1));
        plane.setBrand(resultSet.getString(2));
        plane.setCapacity(resultSet.getInt(3));
        plane.setModel(resultSet.getString(4));
        plane.setTaleNumber(resultSet.getString(5));
        return plane;
    }
}
