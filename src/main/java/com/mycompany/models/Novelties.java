package com.mycompany.models;

/**
 *
 * @author Cristian
 */
public class Novelties {
    private int id;
    private String name;
    private boolean active;

    public Novelties(int id, String name, boolean active) {
        this.id = id;
        this.name = name;
        this.active = active;
    }
    
    //* Setters
    public void setName(String name) {
        this.name = name;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    //* Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public boolean isActive() {
        return active;
    }
}
