package com.example.kuzmichevjsp.entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer planesId;
    @Column
    private Integer pilotsId;
    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private Time time;
    @Column(unique = true)
    private String number;

    public Flight() {
    }

    public Flight(Integer id, Integer planesId, Integer pilotsId, Date date, Time time, String number) {
        this.id = id;
        this.planesId = planesId;
        this.pilotsId = pilotsId;
        this.date = date;
        this.time = time;
        this.number = number;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPlanesId() {
        return planesId;
    }

    public void setPlanesId(Integer planesId) {
        this.planesId = planesId;
    }

    public Integer getPilotsId() {
        return pilotsId;
    }

    public void setPilotsId(Integer pilotsId) {
        this.pilotsId = pilotsId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}

