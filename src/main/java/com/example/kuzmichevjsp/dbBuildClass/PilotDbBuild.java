package com.example.kuzmichevjsp.dbBuildClass;

public class PilotDbBuild {
    private int id;
    private String firstName;
    private String lastName;
    private RangDbBuild rang;
    private String code;

    public PilotDbBuild() {
    }

    public PilotDbBuild(int id, String firstName, String lastName, RangDbBuild rang, String code) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }

    public PilotDbBuild(String firstName, String lastName, RangDbBuild rang, String code) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.rang = rang;
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public RangDbBuild getRang() {
        return rang;
    }

    public void setRang(RangDbBuild rang) {
        this.rang = rang;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Pilots{" +
                "id=" + id +
                ", first_name='" + firstName + '\'' +
                ", last_name='" + lastName + '\'' +
                ", rang='" + rang + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
