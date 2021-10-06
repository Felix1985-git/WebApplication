package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.dto.FullDataDto;
import org.springframework.jdbc.core.RowMapper;

import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Time;

public class FullDataRowMapper implements RowMapper <FullDataDto> {
    @Override
    public FullDataDto mapRow(ResultSet resultSet, int i) throws SQLException {
        FullDataDto fullData = new FullDataDto();
        fullData.setFlightNumber(resultSet.getString(1));
        fullData.setFlightDate(resultSet.getDate(2));
        fullData.setFlightTime(resultSet.getTime(3));
        fullData.setPlaneTaleNumber(resultSet.getString(4));
        fullData.setPlaneBrandModel(resultSet.getString(5) +" "+ resultSet.getString(6));
        fullData.setPlaneCapacity(resultSet.getInt(7));
        fullData.setPilotFullName(resultSet.getString(8) +" "+ resultSet.getString(9));
        fullData.setPilotCodeRang(resultSet.getString(10) +" "+ resultSet.getString(11));
        return fullData;
    }
}
