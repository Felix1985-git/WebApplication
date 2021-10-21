package com.example.kuzmichevjsp.dto;

import java.util.List;

public class PlaneDto {
    private int id;
    private String brand;
    private String model;
    private Integer capacity;
    private String taleNumber;
    private List<FlightDto> flights;

    public PlaneDto() {
    }

    public PlaneDto(int id, String brand, String model, Integer capacity, String taleNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.taleNumber = taleNumber;
    }

    public PlaneDto(String brand, String model, Integer capacity, String taleNumber) {
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.taleNumber = taleNumber;
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

    public String getTaleNumber() {
        return taleNumber;
    }

    public void setTaleNumber(String taleNumber) {
        this.taleNumber = taleNumber;
    }

    public List<FlightDto> getFlights() {
        return flights;
    }

    public void setFlights(List<FlightDto> flights) {
        this.flights = flights;
    }

    @Override
    public String toString() {
        return "Planes{" +
                "id=" + id +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", taleNumber='" + taleNumber + '\'' +
                '}';
    }
}
