package com.example.kuzmichevjsp.validator;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.exception.NullFieldException;

public class PilotValidator {

    public static void validatePilot(PilotDto pilot) {

        if (pilot.getFirst_name() == null) {
            throw new NullFieldException("firstName");
        }

        if (pilot.getLast_name() == null) {
            throw new NullFieldException("lastName");
        }

        if (pilot.getRang() == null) {
            throw new NullFieldException("capacity");
        }

        if (pilot.getCode() == null) {
            throw new NullFieldException("taleNumber");
        }

    }
}
