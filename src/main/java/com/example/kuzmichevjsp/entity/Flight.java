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

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "planes_Id")
    private Plane plane;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name = "pilots_Id")
    private Pilot pilot;

    @Column(nullable = false)
    private Date date;
    @Column(nullable = false)
    private Time time;
    @Column(unique = true)
    private String number;

    public Flight() {
    }

    public Flight(Integer id, Plane plane, Pilot pilot, Date date, Time time, String number) {
        this.id = id;
        this.plane = plane;
        this.pilot = pilot;
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

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public Pilot getPilot() {
        return pilot;
    }

    public void setPilot(Pilot pilot) {
        this.pilot = pilot;
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

