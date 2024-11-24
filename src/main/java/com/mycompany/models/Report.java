package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Report {
    private int id, createBy, noveltiesId;
    private String content, schedule;
    private boolean checked, active;
    private Timestamp createAt;

    public Report(int id, int createBy, int noveltiesId, String content, String schedule, boolean checked, boolean active, Timestamp createAt) {
        this.id = id;
        this.createBy = createBy;
        this.noveltiesId = noveltiesId;
        this.content = content;
        this.schedule = schedule;
        this.checked = checked;
        this.active = active;
        this.createAt = createAt;
    }
    
    //*Setters
    public void setNoveltiesId(int noveltiesId) {
        this.noveltiesId = noveltiesId;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
    
    //*Getters
    public int getId() {
        return id;
    }

    public int getCreateBy() {
        return createBy;
    }
    
    public int getNoveltiesId() {
        return noveltiesId;
    }

    public String getContent() {
        return content;
    }

    public String getSchedule() {
        return schedule;
    }

    public boolean isActive() {
        return active;
    }

    public boolean isChecked() {
        return checked;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }
}
