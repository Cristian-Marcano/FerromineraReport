package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Novelties;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class NoveltiesService extends Database {
    
    public Novelties getNovelties(int id) throws SQLException {
        String sql = "SELECT * FROM novelties WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        result = statement.executeQuery();
        Novelties novl = null;
        if(result.next())
            novl = new Novelties(result.getInt("id"), result.getString("name"), result.getBoolean("active"));
        closeConnection();
        return novl;
    }
    
    public List<Novelties> getNovelties() throws SQLException {
        String sql = "SELECT * FROM novelties WHERE active = 1";
        applyConnection();
        statement = connection.prepareStatement(sql);
        result = statement.executeQuery();
        List<Novelties> listNovelties = new ArrayList<>();
       while(result.next())
            listNovelties.add(new Novelties(result.getInt("id"), result.getString("name"), result.getBoolean("active")));
        closeConnection();
        return listNovelties;
    }
    
    public void createNovelties(String name) throws SQLException {
        String sql = "INSERT INTO novelties(name) VALUES (?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void updateNovelties(int id, String name) throws SQLException {
        String sql = "UPDATE novelties SET name = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setInt(2, id);
        statement.executeUpdate();
        closeConnection();
    }
    
    public void removeNovelties(int id) throws SQLException {
        String sql = "UPDATE novelties SET active = 0 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}