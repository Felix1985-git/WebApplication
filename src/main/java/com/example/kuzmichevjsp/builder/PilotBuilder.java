package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Rang;
import com.example.kuzmichevjsp.validator.PilotValidator;

import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class PilotBuilder {
    public static Pilot build(String pilotLine) {
        String[] pilotData = pilotLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(pilotData[0]);
        String firstName = pilotData[1];
        String lastName = pilotData[2];
        Rang rang = Rang.valueOf(pilotData[3]);
        String code = pilotData[4];

        Pilot pilot = new Pilot(id, firstName, lastName, rang, code);

        PilotValidator.validatePilot(pilot);

        return pilot;
    }
}
