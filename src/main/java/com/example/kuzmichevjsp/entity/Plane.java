package com.example.kuzmichevjsp.entity;

import javax.persistence.*;

@Entity
@Table(name = "planes")
public class Plane {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
    @Column (nullable = false)
    String brand;
    @Column (nullable = false)
    String model;
    @Column (nullable = false)
    Integer capacity;
    @Column (nullable = false,unique = true)
    String tale_number;

    public Plane() {
    }

    public Plane(Integer id, String brand, String model, Integer capacity, String tale_number) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.tale_number = tale_number;
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

    public String getTale_number() {
        return tale_number;
    }

    public void setTale_number(String tale_number) {
        this.tale_number = tale_number;
    }
}




