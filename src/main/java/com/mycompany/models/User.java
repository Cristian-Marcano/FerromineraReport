package com.mycompany.models;

/**
 *
 * @author Cristian
 */
public class User {
    private int id;
    private String username, password, role;
    private boolean active;

    public User(int id, String username, String password, String role, boolean active) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.role = role;
        this.active = active;
    }
    
    //* Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    //* Getters
    public int getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }
    
    public boolean getActive() {
        return active;
    }
}
