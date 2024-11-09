package com.mycompany.models;

/**
 *
 * @author Cristian
 */
public class PersonalData {
    private int id, user_id;
    private String name, lastName, ficha, tlf;

    public PersonalData(int id, int user_id, String name, String lastName, String ficha, String tlf) {
        this.id = id;
        this.user_id = user_id;
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

    public int getUser_id() {
        return user_id;
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
