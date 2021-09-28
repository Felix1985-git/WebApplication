package com.example.kuzmichevjsp.data.reader;

import com.example.kuzmichevjsp.builder.PlaneBuilder;
import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PlaneDataReader implements FileDataReader<PlaneDto> {
    private final String fileName;

    public PlaneDataReader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public List<PlaneDto> read() throws EmptyDataFileException {
        List<PlaneDto> planes = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String planesLine;

            while ((planesLine = reader.readLine()) != null) {
                PlaneDto plane = PlaneBuilder.build(planesLine);

                planes.add(plane);
            }
            if (planes.size() == 0) {
                throw new EmptyDataFileException(fileName, "пуст");
            }
        } catch (FileNotFoundException e) {
            throw new EmptyDataFileException(fileName, "не найден");
        } catch (IOException e) {
            e.getMessage();
        }
        return planes;
    }
}
