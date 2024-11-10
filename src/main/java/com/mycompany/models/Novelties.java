package com.mycompany.models;

/**
 *
 * @author Cristian
 */
public class Novelties {
    private int id;
    private String name;

    public Novelties(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    //* Setters
    public void setName(String name) {
        this.name = name;
    }
    
    //* Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
