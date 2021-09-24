package com.example.kuzmichevjsp.rowMapper;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Rang;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PilotRowMapper implements RowMapper<Pilot> {

    @Override
    public Pilot mapRow(ResultSet resultSet, int i) throws SQLException {
        Pilot pilot = new Pilot();
        pilot.setId(resultSet.getInt(1));
        pilot.setFirstName(resultSet.getString(2));
        pilot.setLastName(resultSet.getString(3));
        pilot.setRang(resultSet.getString(4),Rang.valueOf(resultSet.getString(4)));
        pilot.setCode(resultSet.getString(5));
        return pilot;
    }
}
