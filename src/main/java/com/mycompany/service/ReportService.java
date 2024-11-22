package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Novelties;
import com.mycompany.models.Report;
import com.mycompany.models.ReportEdit;
import com.mycompany.models.User;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class ReportService extends Database {
    
    public Object[] getReport(int id) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "JOIN user ON r.create_by = user.id LEFT JOIN report_edit AS redit ON r.id = redit.report_id "
                + "LEFT JOIN user AS u ON redit.user_edit_id = u.id "
                + "WHERE r.id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        result = statement.executeQuery();
        Object[] report = null;
        if(result.next()) 
            report = new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), result.getString("r.title"), 
                                              result.getString("r.content"), result.getBoolean("r.checked"), result.getTimestamp("r.create_at")),
                                   new Novelties(result.getInt("nv.id"), result.getString("nv.name"), result.getBoolean("nv.active")), 
                                   new ReportEdit(result.getInt("redit.id"), result.getInt("redit.report_id"), result.getInt("redit.user_edit_id"),
                                                  result.getTimestamp("redit.edit_at")),
                                   new User(result.getInt("user.id"), result.getString("user.username"), result.getString("user.password"),
                                            result.getString("user.role"), result.getBoolean("user.active")),
                                   new User(result.getInt("u.id"), result.getString("u.username"), result.getString("u.password"),
                                            result.getString("u.role"), result.getBoolean("u.active"))};
        closeConnection();
        return report;
    }
    
    public List<Object[]> getReports(int limit, int offset) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "JOIN user ON r.create_by = user.id LEFT JOIN report_edit AS redit ON r.id = redit.report_id "
                + "LEFT JOIN user AS u ON redit.user_edit_id = u.id "
                + "WHERE create_at <= NOW() ORDER BY create_at DESC LIMIT ? OFFSET ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, limit);
        statement.setInt(2, offset);
        result = statement.executeQuery();
        List<Object[]> reports = new ArrayList<>();
        while(result.next())
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), result.getString("r.title"), 
                                                 result.getString("r.content"), result.getBoolean("r.checked"), result.getTimestamp("r.create_at")),
                                      new Novelties(result.getInt("nv.id"), result.getString("nv.name"), result.getBoolean("nv.active")), 
                                      new ReportEdit(result.getInt("redit.id"), result.getInt("redit.report_id"), result.getInt("redit.user_edit_id"),
                                                     result.getTimestamp("redit.edit_at")),
                                      new User(result.getInt("user.id"), result.getString("user.username"), result.getString("user.password"),
                                               result.getString("user.role"), result.getBoolean("user.active")),
                                      new User(result.getInt("u.id"), result.getString("u.username"), result.getString("u.password"),
                                               result.getString("u.role"), result.getBoolean("u.active"))});
        closeConnection();
        return reports;
    }
    
    public List<Object[]> searchReports(List<String[]> sentencesAndValues, int limit, int offset) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "JOIN user ON r.create_by = user.id JOIN personal_data AS pd ON user.id = pd.user_id "
                + "LEFT JOIN report_edit AS redit ON r.id = redit.report_id "
                + "LEFT JOIN user AS u ON redit.user_edit_id = u.id "
                + "WHERE ";
        if(sentencesAndValues.isEmpty()) sql += "create_at <= NOW() ";
        else {
            for(String[] sentence: sentencesAndValues) 
                sql += (sql.endsWith("? ")) ? "AND " + sentence[0] : sentence[0];
        }
        sql += "ORDER BY create_at DESC LIMIT ? OFFSET ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        int i;
        for(i=0; i<sentencesAndValues.size(); i++) statement.setString(i+1, sentencesAndValues.get(i)[1]);
        statement.setInt(i+1, limit);
        statement.setInt(i+2, offset);
        result = statement.executeQuery();
        List<Object[]> reports = new ArrayList<>();
        while(result.next())
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), result.getString("r.title"), 
                                                 result.getString("r.content"), result.getBoolean("r.checked"), result.getTimestamp("r.create_at")),
                                      new Novelties(result.getInt("nv.id"), result.getString("nv.name"), result.getBoolean("nv.active")), 
                                      new ReportEdit(result.getInt("redit.id"), result.getInt("redit.report_id"), result.getInt("redit.user_edit_id"),
                                                     result.getTimestamp("redit.edit_at")),
                                      new User(result.getInt("user.id"), result.getString("user.username"), result.getString("user.password"),
                                               result.getString("user.role"), result.getBoolean("user.active")),
                                      new User(result.getInt("u.id"), result.getString("u.username"), result.getString("u.password"),
                                               result.getString("u.role"), result.getBoolean("u.active"))});
        closeConnection();
        return reports;
    }
    
    public void createReport(int createBy, int noveltiesId, String title, String content) throws SQLException {
        String sql = "INSERT INTO report(title, content, novelties_id, create_by) VALUES (?,?,?,?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, title);
        statement.setString(2, content);
        statement.setInt(3, noveltiesId);
        statement.setInt(4, createBy);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void updateReport(int id, int noveltiesId, String title, String content) throws SQLException {
        String sql = "UPDATE report SET novelties_id = ?, title = ?, content = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, noveltiesId);
        statement.setString(2, title);
        statement.setString(3, content);
        statement.setInt(4, id);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void checkReport(int id) throws SQLException {
        String sql = "UPDATE report SET checked = 1 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}
