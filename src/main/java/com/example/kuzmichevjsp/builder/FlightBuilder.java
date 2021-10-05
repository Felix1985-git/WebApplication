package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.validator.FlightValidator;

import java.sql.Date;
import java.sql.Time;

import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class FlightBuilder {
    public static FlightDto build(String flightsLine) {
        String[] flightsData = flightsLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(flightsData[0]);
        Integer planesId = Integer.valueOf(flightsData[1]);
        Integer pilotsId = Integer.valueOf(flightsData[2]);
        Date date = Date.valueOf(flightsData[3]);
        Time time = Time.valueOf(flightsData[4]);
        String number = flightsData[5];

        FlightDto flight = new FlightDto(id, planesId, pilotsId, date, time, number);

        FlightValidator.validateFlight(flight);

        return flight;
    }
}