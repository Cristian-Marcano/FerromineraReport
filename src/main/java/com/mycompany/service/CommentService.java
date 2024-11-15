package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Comment;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class CommentService extends Database {
    
    public Comment getComment(int id) throws SQLException {
        String sql = "SELECT * FROM comment WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        result = statement.executeQuery();
        Comment com = null;
        if(result.next())
            com = new Comment(result.getInt("id"), result.getInt("create_by"), result.getInt("report_id"), 
                              result.getString("content"), result.getTimestamp("create_at"));
        closeConnection();
        return com;
    }
    
    public List<Comment> getComments(int reportId) throws SQLException {
        String sql = "SELECT * FROM comment WHERE report_id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, reportId);
        result = statement.executeQuery();
        List<Comment> listComments = new ArrayList<>();
        if(result.next())
            listComments.add(new Comment(result.getInt("id"), result.getInt("create_by"), result.getInt("report_id"), 
                              result.getString("content"), result.getTimestamp("create_at")));
        closeConnection();
        return listComments;
    }
    
    public void createComment(String content, int createBy, int reportId) throws SQLException {
        String sql = "INSERT INTO comment(content, create_by, report_id) VALUES (?,?,?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, content);
        statement.setInt(2, createBy);
        statement.setInt(3, reportId);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void updateComment(String content, int id) throws SQLException {
        String sql = "UPDATE comment SET content = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, content);
        statement.setInt(2, id);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void removeComment(int id) throws SQLException {
        String sql = "UPDATE comment SET active = 0 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}
