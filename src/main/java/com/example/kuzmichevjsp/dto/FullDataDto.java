package com.example.kuzmichevjsp.dto;

import java.sql.Date;
import java.sql.Time;

public class FullDataDto {
    private String flightNumber;
    private Date flightDate;
    private Time flightTime;
    private String planeTaleNumber;
    private String planeBrandModel;
    private Integer planeCapacity;
    private String pilotFullName;
    private String pilotCodeRang;

    public FullDataDto() {
    }

    public FullDataDto(String flightNumber, Date flightDate, Time flightTime, String planeTaleNumber, String planeBrandModel, Integer planeCapacity, String pilotFullName, String pilotCodeRang) {
        this.flightNumber = flightNumber;
        this.flightDate = flightDate;
        this.flightTime = flightTime;
        this.planeTaleNumber = planeTaleNumber;
        this.planeBrandModel = planeBrandModel;
        this.planeCapacity = planeCapacity;
        this.pilotFullName = pilotFullName;
        this.pilotCodeRang = pilotCodeRang;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public Time getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(Time flightTime) {
        this.flightTime = flightTime;
    }

    public String getPlaneTaleNumber() {
        return planeTaleNumber;
    }

    public void setPlaneTaleNumber(String planeTaleNumber) {
        this.planeTaleNumber = planeTaleNumber;
    }

    public String getPlaneBrandModel() {
        return planeBrandModel;
    }

    public void setPlaneBrandModel(String planeBrandModel) {
        this.planeBrandModel = planeBrandModel;
    }

    public Integer getPlaneCapacity() {
        return planeCapacity;
    }

    public void setPlaneCapacity(Integer planeCapacity) {
        this.planeCapacity = planeCapacity;
    }

    public String getPilotFullName() {
        return pilotFullName;
    }

    public void setPilotFullName(String pilotFullName) {
        this.pilotFullName = pilotFullName;
    }

    public String getPilotCodeRang() {
        return pilotCodeRang;
    }

    public void setPilotCodeRang(String pilotCodeRang) {
        this.pilotCodeRang = pilotCodeRang;
    }

    @Override
    public String toString() {
        return "FullData{" +
                "flightNumber=" + flightNumber +
                ", flightDate='" + flightDate + '\'' +
                ", flightTime='" + flightTime + '\'' +
                ", planeTaleNumber='" + planeTaleNumber + '\'' +
                ", planeBrandModel='" + planeBrandModel + '\'' +
                ", planeCapacity='" + planeCapacity + '\'' +
                ", pilotFullName='" + pilotFullName + '\'' +
                ", pilotCodeRang='" + pilotCodeRang + '\'' +
                '}';
    }
}
