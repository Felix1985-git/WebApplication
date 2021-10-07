package com.example.kuzmichevjsp.data.reader;

import com.example.kuzmichevjsp.builder.FlightBuilder;
import com.example.kuzmichevjsp.dbBuildClass.FlightDbBuild;
import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FlightDataReader implements FileDataReader<FlightDbBuild> {
    private final String fileName;

    public FlightDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<FlightDbBuild> read() throws EmptyDataFileException {
        List<FlightDbBuild> flights = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String flightsLine;

            while ((flightsLine = reader.readLine()) != null) {
                FlightDbBuild flight = FlightBuilder.build(flightsLine);

                flights.add(flight);
            }
            if (flights.size() == 0) {
                throw new EmptyDataFileException(fileName, "пуст");
            }
        } catch (FileNotFoundException e) {
            throw new EmptyDataFileException(fileName, "не найден");
        } catch (IOException e) {
            e.getMessage();
        }
        return flights;
    }
}
