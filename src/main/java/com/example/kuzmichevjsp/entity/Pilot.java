package com.example.kuzmichevjsp.entity;

import com.example.kuzmichevjsp.dto.RangDto;

import javax.persistence.*;

@Entity
@Table(name = "pilots")
public class Pilot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String first_name;
    @Column(nullable = false)
    private String last_name;
    @Column
    @Enumerated(EnumType.STRING)
    private RangDto rang;
    @Column(nullable = false, unique = true)
    private String code;

    public Pilot() {
    }

    public Pilot(Integer id, String first_name, String last_name, RangDto rang, String code) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.rang = rang;
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
}
