package com.example.kuzmichevjsp.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "planes")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column (nullable = false)
    private String brand;
    @Column (nullable = false)
    private String model;
    @Column (nullable = false)
    private Integer capacity;
    @Column (name = "tale_number", nullable = false,unique = true)
    private String taleNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pilot")
    private List<Flight> flights;

    public Plane() {
    }

    public Plane(Integer id, String brand, String model, Integer capacity, String taleNumber, List<Flight> flights) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.taleNumber = taleNumber;
        this.flights = flights;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}




