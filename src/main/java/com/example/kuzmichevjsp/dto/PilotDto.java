package com.example.kuzmichevjsp.dto;

import java.util.List;

public class PilotDto {
    private int id;
    private String firstName;
    private String lastName;
    private RangDto rang;
    private String code;
    private List<FlightDto> flights;

    public PilotDto() {
    }

    public PilotDto(int id, String firstName, String lastName, RangDto rang, String code) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public RangDto getRang() {
        return rang;
    }

    public void setRang(RangDto rang) {
        this.rang = rang;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<FlightDto> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightDto> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "PilotDto{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rang=" + rang +
                ", code='" + code + '\'' +
                ", flights=" + flights +
                '}';
    }
}
