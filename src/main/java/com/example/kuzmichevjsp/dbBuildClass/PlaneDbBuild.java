package com.example.kuzmichevjsp.dbBuildClass;

public class PlaneDbBuild {
    private int id;
    private String brand;
    private String model;
    private Integer capacity;
    private String taleNumber;

    public PlaneDbBuild() {
    }

    public PlaneDbBuild(int id, String brand, String model, Integer capacity, String taleNumber) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.taleNumber = taleNumber;
    }

    public PlaneDbBuild(String brand, String model, Integer capacity, String taleNumber) {
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
