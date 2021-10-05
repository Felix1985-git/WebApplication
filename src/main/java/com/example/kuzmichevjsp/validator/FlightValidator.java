package com.example.kuzmichevjsp.validator;

import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.exception.NullFieldException;

public class FlightValidator {

    public static void validateFlight(FlightDto flight) {

        if (flight.getDate() == null) {
            throw new NullFieldException("date");
        }

        if (flight.getTime() == null) {
            throw new NullFieldException("time");
        }

        if (flight.getNumber() == null) {
            throw new NullFieldException("number");
        }

        if (flight.getPlanesId() == null) {
            throw new NullFieldException("planesId");

        }

        if (flight.getPilotsId() == null) {
            throw new NullFieldException("pilotsId");
        }

    }
}
