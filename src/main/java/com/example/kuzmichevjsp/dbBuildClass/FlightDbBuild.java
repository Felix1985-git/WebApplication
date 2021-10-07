package com.example.kuzmichevjsp.dbBuildClass;

import java.sql.Date;
import java.sql.Time;

public class FlightDbBuild {
    private int id;
    private Integer planesId;
    private Integer pilotsId;
    private Date date;
    private Time time;
    private String number;

    public FlightDbBuild() {
    }

    public FlightDbBuild(int id, Integer planesId, Integer pilotsId, Date date, Time time, String number) {
        this.id = id;
        this.planesId = planesId;
        this.pilotsId = pilotsId;
        this.date = date;
        this.time = time;
        this.number = number;
    }

    public FlightDbBuild(Integer planesId, Integer pilotsId, Date date, Time time, String number) {

        this.planesId = planesId;
        this.pilotsId = pilotsId;
        this.date = date;
        this.time = time;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public Integer getPlanesId() {
        return planesId;
    }

    public Integer getPilotsId() {
        return pilotsId;
    }

    public Date getDate() {
        return date;
    }

    public Time getTime() {
        return time;
    }

    public String getNumber() {
        return number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPlanesId(Integer planesId) {
        this.planesId = planesId;
    }

    public void setPilotsId(Integer pilotsId) {
        this.pilotsId = pilotsId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Flights{" +
                "id=" + id +
                ", planesId='" + planesId + '\'' +
                ", pilotsId='" + pilotsId + '\'' +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
