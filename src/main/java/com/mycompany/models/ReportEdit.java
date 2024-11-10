package com.mycompany.models;

import java.sql.Timestamp;

/**
 *
 * @author Cristian
 */
public class ReportEdit {
    private int id, reportId, userEditId;
    private Timestamp editAt;

    public ReportEdit(int id, int reportId, int userEditId, Timestamp editAt) {
        this.id = id;
        this.reportId = reportId;
        this.userEditId = userEditId;
        this.editAt = editAt;
    }

    //* Setters
    public void setEditAt(Timestamp editAt) {
        this.editAt = editAt;
    }

    //* Getters
    public int getId() {
        return id;
    }

    public int getReportId() {
        return reportId;
    }

    public int getUserEditId() {
        return userEditId;
    }

    public Timestamp getEditAt() {
        return editAt;
    }
}
