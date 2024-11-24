package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.ReportEdit;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class ReportEditService extends Database {
    
    public ReportEdit getReportEdit(int reportId) throws SQLException {
        String sql = "SELECT * FROM report_edit WHERE report_id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, reportId);
        result = statement.executeQuery();
        ReportEdit reportEdit = null;
        if(result.next())
            reportEdit = new ReportEdit(result.getInt("id"), result.getInt("report_id"), result.getInt("user_edit_id"), result.getTimestamp("edit_at"));
        closeConnection();
        return reportEdit;
    }
    
    public void createReportEdit(int userId, int reportId) throws SQLException {
        String sql = "INSERT INTO report_edit(user_edit_id, report_id) VALUES (?,?)";
        statement = connection.prepareStatement(sql);
        statement.setInt(1, userId);
        statement.setInt(2, reportId);
        statement.executeUpdate();
        connection.commit();
        closeConnection();
    }
    
    public void updateReportEdit(int id, int userId) throws SQLException {
        String sql = "UPDATE report_edit SET user_edit_id = ?, edit_at = NOW() WHERE id = ?";
        statement = connection.prepareStatement(sql);
        statement.setInt(1, userId);
        statement.setInt(2, id);
        statement.executeUpdate();
        connection.commit();
        closeConnection();
    }
}
