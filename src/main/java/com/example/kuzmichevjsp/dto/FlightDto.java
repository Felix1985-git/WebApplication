package com.example.kuzmichevjsp.dto;

import com.example.kuzmichevjsp.entity.Pilot;
import com.example.kuzmichevjsp.entity.Plane;

import java.sql.Date;
import java.sql.Time;

public class FlightDto {

    private Integer id;
    private Integer planeId;
    private Integer pilotId;
    private Date date;
    private Time time;
    private String number;

    public FlightDto() {
    }

    public FlightDto(Integer id, Integer planeId, Integer pilotId, Date date, Time time, String number) {
        this.id = id;
        this.planeId = planeId;
        this.pilotId = pilotId;
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

    public Integer getPlaneId() {
        return planeId;
    }

    public void setPlaneId(Integer planeId) {
        this.planeId = planeId;
    }

    public Integer getPilotId() {
        return pilotId;
    }

    public void setPilotId(Integer pilotId) {
        this.pilotId = pilotId;
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

