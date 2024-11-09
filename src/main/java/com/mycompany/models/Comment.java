package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Comment {
    private int id, create_by, report_id;
    private String content;
    private Timestamp create_at;

    public Comment(int id, int create_by, int report_id, String content, Timestamp create_at) {
        this.id = id;
        this.create_by = create_by;
        this.report_id = report_id;
        this.content = content;
        this.create_at = create_at;
    }
    
    //*Setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setCreate_at(Timestamp create_at) {
        this.create_at = create_at;
    }
    
    //* Getters
    public int getId() {
        return id;
    }

    public int getCreate_by() {
        return create_by;
    }

    public int getReport_id() {
        return report_id;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreate_at() {
        return create_at;
    }
}
