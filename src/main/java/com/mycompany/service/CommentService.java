package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Comment;
import com.mycompany.models.User;
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
    
    public List<Object[]> getComments(int reportId) throws SQLException {
        String sql = "SELECT * FROM comment JOIN user ON comment.create_by=user.id WHERE report_id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, reportId);
        result = statement.executeQuery();
        List<Object[]> listComments = new ArrayList<>();
        while(result.next())
            listComments.add(new Object[]{new Comment(result.getInt("comment.id"), result.getInt("comment.create_by"), result.getInt("comment.report_id"), 
                                                      result.getString("comment.content"), result.getTimestamp("comment.create_at")),
                                          new User(result.getInt("user.id"), result.getString("user.username"), result.getString("user.password"),
                                                   result.getString("user.role"), result.getBoolean("user.active"))});
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
