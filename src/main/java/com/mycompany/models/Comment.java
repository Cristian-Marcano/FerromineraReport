package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class Comment {
    private int id, createBy, reportId;
    private String content;
    private Timestamp createAt;

    public Comment(int id, int createBy, int reportId, String content, Timestamp createAt) {
        this.id = id;
        this.createBy = createBy;
        this.reportId = reportId;
        this.content = content;
        this.createAt = createAt;
    }
    
    //* Setters
    public void setContent(String content) {
        this.content = content;
    }

    public void setCreateAt(Timestamp createAt) {
        this.createAt = createAt;
    }
    
    //* Getters
    public int getId() {
        return id;
    }

    public int getCreateBy() {
        return createBy;
    }

    public int getReportId() {
        return reportId;
    }

    public String getContent() {
        return content;
    }

    public Timestamp getCreateAt() {
        return createAt;
    }
}
