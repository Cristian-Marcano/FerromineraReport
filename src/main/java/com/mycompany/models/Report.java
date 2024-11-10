package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Report {
    private int id, createBy, noveltiesId;
    private String title, content;
    private boolean checked;
    private Timestamp createAt;

    public Report(int id, int createBy, int noveltiesId, String title, String content, boolean checked, Timestamp createAt) {
        this.id = id;
        this.createBy = createBy;
        this.noveltiesId = noveltiesId;
        this.title = title;
        this.content = content;
        this.checked = checked;
        this.createAt = createAt;
    }
    
    //*Setters
    public void noveltiesId(int noveltiesId) {
        this.noveltiesId = noveltiesId;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }

    public void setContent(String content) {
        this.content = content;
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

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public boolean isChecked() {
        return checked;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }
}
