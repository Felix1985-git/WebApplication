package com.example.kuzmichevjsp.dto;

public class PilotDto {
    private int id;
    private String firstName;
    private String lastName;
    private RangDto rang;
    private String code;

    public PilotDto() {
    }

    public PilotDto(int id, String firstName, String lastName, RangDto rang, String code) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }
    public PilotDto(String firstName, String lastName, RangDto rang, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }
    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public RangDto getRang() {
        return rang;
    }

    public String getCode() {
        return code;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setRang(RangDto rang) {
        this.rang = rang;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", rang='" + rang + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
