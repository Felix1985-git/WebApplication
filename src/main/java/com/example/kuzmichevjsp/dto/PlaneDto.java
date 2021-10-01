package com.example.kuzmichevjsp.dto;

public class PlaneDto {
    private int id;
    private String brand;
    private String model;
    private Integer capacity;
    private String tale_number;

    public PlaneDto() {
    }

    public PlaneDto(int id, String brand, String model, Integer capacity, String tale_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.tale_number = tale_number;
    }

    public PlaneDto(String brand, String model, Integer capacity, String tale_number) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.tale_number = tale_number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getTale_number() {
        return tale_number;
    }

    public void setTale_number(String tale_number) {
        this.tale_number = tale_number;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", taleNumber='" + tale_number + '\'' +
                '}';
    }
}
