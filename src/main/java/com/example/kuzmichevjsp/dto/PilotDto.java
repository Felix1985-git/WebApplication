package com.example.kuzmichevjsp.dto;

public class PilotDto {
    private int id;
    private String first_name;
    private String last_name;
    private RangDto rang;
    private String code;

    public PilotDto() {
    }

    public PilotDto(int id, String first_name, String last_name, RangDto rang, String code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rang = rang;
        this.code = code;
    }

    public PilotDto(String first_name, String last_name, RangDto rang, String code) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.rang = rang;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
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

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", rang='" + rang + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
