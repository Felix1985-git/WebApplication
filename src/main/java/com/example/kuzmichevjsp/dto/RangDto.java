package com.example.kuzmichevjsp.dto;

public enum RangDto {
    ASE("АС"), MASTER("Мастер"), AMATEUR("Любитель"),NEWBIE("Новичок");

    private String type;

    RangDto() {
    }

    RangDto (String type) {
        this.type = type;
    }

    public String getRangDto() {
        return type.toString();
    }

    public void setRangDto(String type) {
        this.type = type;
    }
}
