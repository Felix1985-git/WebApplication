package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.entity.Plane;
import com.example.kuzmichevjsp.validator.PlaneValidator;
import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class PlaneBuilder {
    public static Plane build(String planesLine) {
        String[] planesData = planesLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(planesData[0]);
        String brand = planesData[1];
        String model = planesData[2];
        Integer capacity = Integer.valueOf(planesData[3]);
        String taleNumber = planesData[4];

        Plane plane = new Plane(id, brand, model, capacity, taleNumber);

        PlaneValidator.validatePlane(plane);

        return plane;
    }
}