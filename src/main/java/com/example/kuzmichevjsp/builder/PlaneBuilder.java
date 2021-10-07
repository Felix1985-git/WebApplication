package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.dbBuildClass.PlaneDbBuild;
import com.example.kuzmichevjsp.validator.PlaneValidator;
import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class PlaneBuilder {
    public static PlaneDbBuild build(String planesLine) {
        String[] planesData = planesLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(planesData[0]);
        String brand = planesData[1];
        String model = planesData[2];
        Integer capacity = Integer.valueOf(planesData[3]);
        String taleNumber = planesData[4];

        PlaneDbBuild plane = new PlaneDbBuild(id, brand, model, capacity, taleNumber);

        PlaneValidator.validatePlane(plane);

        return plane;
    }
}