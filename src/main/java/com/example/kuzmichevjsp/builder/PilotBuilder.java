package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.dbBuildClass.PilotDbBuild;
import com.example.kuzmichevjsp.dbBuildClass.RangDbBuild;
import com.example.kuzmichevjsp.validator.PilotValidator;

import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class PilotBuilder {
    public static PilotDbBuild build(String pilotLine) {
        String[] pilotData = pilotLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(pilotData[0]);
        String firstName = pilotData[1];
        String lastName = pilotData[2];
        RangDbBuild rang = RangDbBuild.valueOf(pilotData[3]);
        String code = pilotData[4];

        PilotDbBuild pilot = new PilotDbBuild(id, firstName, lastName, rang, code);

        PilotValidator.validatePilot(pilot);

        return pilot;
    }
}
