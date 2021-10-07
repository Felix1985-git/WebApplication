package com.example.kuzmichevjsp.dto;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Plane;

import java.sql.Date;
import java.sql.Time;

public class FlightDto {

    private Integer id;
    private PlaneDto plane;
    private PilotDto pilot;
    private Date date;
    private Time time;
    private String number;

    public FlightDto() {
    }

    public FlightDto(Integer id, PlaneDto plane, PilotDto pilot, Date date, Time time, String number) {
        this.id = id;
        this.plane = plane;
        this.pilot = pilot;
        this.date = date;
        this.time = time;
        this.number = number;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public PlaneDto getPlane() {
        return plane;
    }

    public void setPlane(PlaneDto plane) {
        this.plane = plane;
    }

    public PilotDto getPilot() {
        return pilot;
    }

    public void setPilot(PilotDto pilot) {
        this.pilot = pilot;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }


}

