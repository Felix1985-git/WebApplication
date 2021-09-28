package com.example.kuzmichevjsp.data.reader;

import com.example.kuzmichevjsp.builder.PilotBuilder;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotDataReader implements FileDataReader<PilotDto> {
    private final String fileName;

    public PilotDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<PilotDto> read() throws EmptyDataFileException {
        List<PilotDto> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String pilotLine;

            while ((pilotLine = reader.readLine()) != null) {
                PilotDto pilot = PilotBuilder.build(pilotLine);

                pilots.add(pilot);
            }
            if (pilots.size() == 0) {
                throw new EmptyDataFileException(fileName, "пуст");
            }
        } catch (FileNotFoundException e) {
            throw new EmptyDataFileException(fileName, "не найден");
        } catch (IOException e) {
            e.getMessage();
        }
        return pilots;
    }
}