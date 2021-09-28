package com.example.kuzmichevjsp.builder;

import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.RangDto;
import com.example.kuzmichevjsp.validator.PilotValidator;

import static com.example.kuzmichevjsp.builder.CsvConstants.CSV_DELIMITER;

public class PilotBuilder {
    public static PilotDto build(String pilotLine) {
        String[] pilotData = pilotLine.split(CSV_DELIMITER);

        int id = Integer.parseInt(pilotData[0]);
        String firstName = pilotData[1];
        String lastName = pilotData[2];
        RangDto rang = RangDto.valueOf(pilotData[3]);
        String code = pilotData[4];

        PilotDto pilot = new PilotDto(id, firstName, lastName, rang, code);

        PilotValidator.validatePilot(pilot);

        return pilot;
    }
}
