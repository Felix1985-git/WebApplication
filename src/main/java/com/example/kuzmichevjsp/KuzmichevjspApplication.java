package com.example.kuzmichevjsp;


import com.example.kuzmichevjsp.data.reader.FlightDataReader;
import com.example.kuzmichevjsp.data.reader.PilotDataReader;
import com.example.kuzmichevjsp.data.reader.PlaneDataReader;
import com.example.kuzmichevjsp.db.writer.FlightWriter;
import com.example.kuzmichevjsp.db.writer.PilotWriter;
import com.example.kuzmichevjsp.db.writer.PlaneWriter;
import com.example.kuzmichevjsp.dto.FlightDto;
import com.example.kuzmichevjsp.dto.PilotDto;
import com.example.kuzmichevjsp.dto.PlaneDto;
import com.example.kuzmichevjsp.exception.EmptyDataFileException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;


@SpringBootApplication
public class KuzmichevjspApplication {

    public static void main(String[] args) {
        SpringApplication.run(KuzmichevjspApplication.class, args);

        PilotDataReader pilotDataReader = new PilotDataReader("db\\data\\pilots.csv");
        try {
            List<PilotDto> pilots = pilotDataReader.read();
            PilotWriter.write(pilots);
        } catch (EmptyDataFileException e) {
            System.err.println(e.getMessage());
        }

        PlaneDataReader planeDataReader = new PlaneDataReader("db\\data\\planes.csv");
        try {
            List<PlaneDto> planes = planeDataReader.read();
            PlaneWriter.write(planes);
        } catch (EmptyDataFileException e) {
            System.err.println(e.getMessage());
        }

        FlightDataReader flightDataReader = new FlightDataReader("db\\data\\flights.csv");
        try {
            List<FlightDto> flights = flightDataReader.read();
            FlightWriter.write(flights);
        } catch (EmptyDataFileException e) {
            System.err.println(e.getMessage());
        }

    }

}
