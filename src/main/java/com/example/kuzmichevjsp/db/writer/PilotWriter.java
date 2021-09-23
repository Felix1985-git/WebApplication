package com.example.kuzmichevjsp.db.writer;



import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;



public class PilotWriter {

    private static final String INSERT_TABLE = "pilots";
    private static final String INSERT = "INSERT INTO " + INSERT_TABLE + " (id, first_name, last_name, rang, code) VALUES(?, ?, ? ,? ,?)";

    public static void write(List<Pilot> pilots) {
        Connection connection = ConnectionUtil.getConnection();

        for (Pilot pilot : pilots) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, pilot.getId());
                statement.setString(2, pilot.getFirstName());
                statement.setString(3, pilot.getLastName());
                statement.setString(4, pilot.getRang().toString());
                statement.setString(5, pilot.getCode());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
