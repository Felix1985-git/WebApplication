package com.example.kuzmichevjsp.db.writer;

import com.example.kuzmichevjsp.dbBuildClass.FlightDbBuild;
import com.example.kuzmichevjsp.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class FlightWriter {

    private static final String INSERT_TABLE = "flights";
    private static final String INSERT = "INSERT INTO " + INSERT_TABLE + " (id, planes_id, pilots_id, date, time, number) VALUES(?, ?, ? ,? ,? ,?)";


    public static void write(List<FlightDbBuild> flights) {
        Connection connection = ConnectionUtil.getConnection();

        for (FlightDbBuild flight : flights) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, flight.getId());
                statement.setInt(2, flight.getPlanesId());
                statement.setInt(3, flight.getPilotsId());
                statement.setDate(4, flight.getDate());
                statement.setTime(5, flight.getTime());
                statement.setString(6, flight.getNumber());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}