package com.mycompany.models;

/**
 *
 * @author Cristian
 */
public class PersonalData {
    private int id, userId;
    private String name, lastName, ficha, tlf;

    public PersonalData(int id, int userId, String name, String lastName, String ficha, String tlf) {
        this.id = id;
        this.userId = userId;
        this.name = name;
        this.lastName = lastName;
        this.ficha = ficha;
        this.tlf = tlf;
    }

    //* Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFicha(String ficha) {
        this.ficha = ficha;
    }

    public void setTlf(String tlf) {
        this.tlf = tlf;
    }

    //* Getters
    public int getId() {
        return id;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFicha() {
        return ficha;
    }

    public String getTlf() {
        return tlf;
    }
}
