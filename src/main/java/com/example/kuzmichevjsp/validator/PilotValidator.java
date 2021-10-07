package com.example.kuzmichevjsp.validator;

import com.example.kuzmichevjsp.dbBuildClass.PilotDbBuild;
import com.example.kuzmichevjsp.exception.NullFieldException;

public class PilotValidator {

    public static void validatePilot(PilotDbBuild pilot) {

        if (pilot.getFirstName() == null) {
            throw new NullFieldException("firstName");
        }

        if (pilot.getLastName() == null) {
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
