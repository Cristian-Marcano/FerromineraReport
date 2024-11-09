package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Report {
    private int id, create_by;
    private String title, content;
    private boolean checked;
    private Timestamp create_at;

    public Report(int id, int create_by, String title, String content, boolean checked, Timestamp create_at) {
        this.id = id;
        this.create_by = create_by;
        this.title = title;
        this.content = content;
        this.checked = checked;
        this.create_at = create_at;
    }
    
    //*Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
    
    //*Getters
    public int getId() {
        return id;
    }

    public int getCreate_by() {
        return create_by;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isChecked() {
        return checked;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }
}
