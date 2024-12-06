package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Novelties;
import com.mycompany.models.Report;
import com.mycompany.models.ReportEdit;
import com.mycompany.models.User;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Cristian
 * Clase que realiza operaciones a la tabla report en la DB
 * de MySQL 
 */
public class ReportService extends Database {
    
    //* Obtener reporte por su id
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
            report = new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), 
                                              result.getString("r.content"), result.getString("r.schedule"), result.getBoolean("r.checked"),
                                              result.getBoolean("r.active"), result.getTimestamp("r.create_at")),
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
    
    //* Obtener la mayoria de los reportes en tandas que indique el limit, hasta llegar a mostrar todos los reportes
    public List<Object[]> getReports(int limit, int offset) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "JOIN user ON r.create_by = user.id LEFT JOIN report_edit AS redit ON r.id = redit.report_id "
                + "LEFT JOIN user AS u ON redit.user_edit_id = u.id "
                + "WHERE r.active = 1 AND create_at <= NOW() ORDER BY create_at DESC LIMIT ? OFFSET ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, limit);
        statement.setInt(2, offset);
        result = statement.executeQuery();
        List<Object[]> reports = new ArrayList<>();
        while(result.next())
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), 
                                                 result.getString("r.content"), result.getString("r.schedule"), result.getBoolean("r.checked"),
                                                 result.getBoolean("r.active"), result.getTimestamp("r.create_at")),
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
    
    //* Buscar los reportes por tandas que indique el limit, hasta llegar a mostrar todos los reportes
    //* con las similitudes insertadas en el filtro (WHERE)
    public List<Object[]> searchReports(List<String[]> sentencesAndValues, int limit, int offset) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "JOIN user ON r.create_by = user.id JOIN personal_data AS pd ON user.id = pd.user_id "
                + "LEFT JOIN report_edit AS redit ON r.id = redit.report_id "
                + "LEFT JOIN user AS u ON redit.user_edit_id = u.id "
                + "WHERE r.active = 1 AND ";
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
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), 
                                                 result.getString("r.content"), result.getString("r.schedule"), result.getBoolean("r.checked"),
                                                 result.getBoolean("r.active"), result.getTimestamp("r.create_at")),
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
    
    //* Obtener todos los reportes publicados en el mes de date
    public List<Object[]> getReportsInMonth(Date date) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                + "WHERE MONTH(r.create_at) = MONTH(?) AND YEAR(r.create_at) = YEAR(?) AND r.active = 1";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setTimestamp(1, new Timestamp(date.getTime()));
        statement.setTimestamp(2, new Timestamp(date.getTime()));
        result = statement.executeQuery();
        List<Object[]> reports = new ArrayList<>();
        while(result.next())
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), 
                                                 result.getString("r.content"), result.getString("r.schedule"), result.getBoolean("r.checked"),
                                                 result.getBoolean("r.active"), result.getTimestamp("r.create_at")),
                                      new Novelties(result.getInt("nv.id"), result.getString("nv.name"), result.getBoolean("nv.active"))});
        closeConnection();
        return reports;
    }
    
    //* Obtener todos los reportes publicados en la semana de date
    public List<Object[]> getReportsInWeek(Date date) throws SQLException {
        String sql = "SELECT * FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                    + "WHERE r.create_at >= DATE_SUB(?, INTERVAL WEEKDAY(?) DAY) AND "
                    + "r.create_at < DATE_ADD(DATE_SUB(?, INTERVAL WEEKDAY(?) DAY), INTERVAL 7 DAY) AND r.active = 1";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(2, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(date));
        result = statement.executeQuery();
        List<Object[]> reports = new ArrayList<>();
        while(result.next())
            reports.add(new Object[]{ new Report(result.getInt("r.id"), result.getInt("r.create_by"), result.getInt("r.novelties_id"), 
                                                 result.getString("r.content"), result.getString("r.schedule"), result.getBoolean("r.checked"),
                                                 result.getBoolean("r.active"), result.getTimestamp("r.create_at")),
                                      new Novelties(result.getInt("nv.id"), result.getString("nv.name"), result.getBoolean("nv.active"))});
        closeConnection();
        return reports;
    }
    
    //* Cantidad de reportes publicados divididos por sus categorias de novedades en el mes de date
    public List<String[]> getCountReportsInMount(Date date) throws SQLException {
        String sql = "SELECT nv.name, COUNT(*) AS count FROM report AS r JOIN novelties AS nv ON r.novelties_id = nv.id "
                    + "WHERE MONTH(r.create_at) = MONTH(?) AND YEAR(r.create_at) = YEAR(?) AND r.active = 1 GROUP BY nv.name";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setTimestamp(1, new Timestamp(date.getTime()));
        statement.setTimestamp(2, new Timestamp(date.getTime()));
        result = statement.executeQuery();
        List<String[]> countNovelties = new ArrayList<>();
        while(result.next())
            countNovelties.add(new String[]{result.getString("nv.name"), Integer.toString(result.getInt("count"))});
        closeConnection();
        return countNovelties;
    }
    
    //* Cantidad de reportes publicados divididos por sus categorias de novedades en la semana de date
    public List<String[]> getCountReportsInWeek(Date date) throws SQLException {
        String sql = "SELECT nv.name AS name, COUNT(*) AS count FROM report AS r JOIN novelties nv ON r.novelties_id = nv.id "
                    + "WHERE r.create_at >= DATE_SUB(?, INTERVAL WEEKDAY(?) DAY) AND "
                    + "r.create_at < DATE_ADD(DATE_SUB(?, INTERVAL WEEKDAY(?) DAY), INTERVAL 7 DAY) AND r.active = 1 GROUP BY nv.name";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(2, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(3, new SimpleDateFormat("yyyy-MM-dd").format(date));
        statement.setString(4, new SimpleDateFormat("yyyy-MM-dd").format(date));
        result = statement.executeQuery();
        List<String[]> countNovelties = new ArrayList<>();
        while(result.next())
            countNovelties.add(new String[]{result.getString("nv.name"), Integer.toString(result.getInt("count"))});
        closeConnection();
        return countNovelties;
    }
    
    //* Crear reporte 
    public void createReport(int createBy, int noveltiesId, String content, String schedule) throws SQLException {
        String sql = "INSERT INTO report(content, schedule, novelties_id, create_by) VALUES (?,?,?,?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, content);
        statement.setString(2, schedule);
        statement.setInt(3, noveltiesId);
        statement.setInt(4, createBy);
        statement.executeUpdate();
        closeConnection();
    }
    
    //* Editar reporte
    public void updateReport(int id, int noveltiesId, String content, String schedule) throws SQLException {
        String sql = "UPDATE report SET novelties_id = ?, content = ?, schedule = ? WHERE id = ?";
        applyConnection();
        if(connection.getAutoCommit()) connection.setAutoCommit(false);
        statement = connection.prepareStatement(sql);
        statement.setInt(1, noveltiesId);
        statement.setString(2, content);
        statement.setString(3, schedule);
        statement.setInt(4, id);
        statement.executeUpdate();
    }
    
    //* Desactivar reporte (no se mostrar el reporte desactivado en la app)
    public void removeReport(int id) throws SQLException {
        String sql = "UPDATE report SET active = 0 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
    
    //* Checar reporte
    public void checkReport(int id) throws SQLException {
        String sql = "UPDATE report SET checked = 1 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}
