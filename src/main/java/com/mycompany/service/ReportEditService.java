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
    
    public void updateReportEdit(ReportEdit report) throws SQLException {
        String sql = "UPDATE report_edit SET user_edit_id = ?, edit_at = NOW() WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, report.getReportId());
        statement.setInt(2, report.getId());
        statement.executeUpdate();
        closeConnection();
    }
}
