package com.example.kuzmichevjsp.db.writer;

import com.example.kuzmichevjsp.dbBuildClass.PlaneDbBuild;
import com.example.kuzmichevjsp.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class PlaneWriter {

    private static final String INSERT_TABLE = "planes";
    private static final String INSERT = "INSERT INTO " + INSERT_TABLE + " (id, brand, model, capacity, tale_number) VALUES(?, ?, ? ,? ,?)";

    public static void write(List<PlaneDbBuild> planes) {
        Connection connection = ConnectionUtil.getConnection();
        for (PlaneDbBuild plane : planes) {
            try (PreparedStatement statement = connection.prepareStatement(INSERT)) {
                statement.setInt(1, plane.getId());
                statement.setString(2, plane.getBrand());
                statement.setString(3, plane.getModel());
                statement.setInt(4, plane.getCapacity());
                statement.setString(5, plane.getTaleNumber());

                statement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}