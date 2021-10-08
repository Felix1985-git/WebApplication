package com.example.kuzmichevjsp.entity;

import com.example.kuzmichevjsp.dto.RangDto;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pilots")
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "first_name", nullable = false)
    private String firstName;
    @Column(name = "last_name", nullable = false)
    private String lastName;
    @Column
    @Enumerated(EnumType.STRING)
    private RangDto rang;
    @Column(nullable = false, unique = true)
    private String code;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "pilot")
    private List<Flight> flights;

    public Pilot() {
    }

    public Pilot(Integer id, String firstName, String lastName, RangDto rang, String code) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public List<Flight> getFlights() {
        return flights;
    }

    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }
}
