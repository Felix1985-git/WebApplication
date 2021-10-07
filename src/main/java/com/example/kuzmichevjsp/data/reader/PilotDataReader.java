package com.example.kuzmichevjsp.data.reader;

import com.example.kuzmichevjsp.builder.PilotBuilder;
import com.example.kuzmichevjsp.dbBuildClass.PilotDbBuild;
import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PilotDataReader implements FileDataReader<PilotDbBuild> {
    private final String fileName;

    public PilotDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<PilotDbBuild> read() throws EmptyDataFileException {
        List<PilotDbBuild> pilots = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String pilotLine;

            while ((pilotLine = reader.readLine()) != null) {
                PilotDbBuild pilot = PilotBuilder.build(pilotLine);

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