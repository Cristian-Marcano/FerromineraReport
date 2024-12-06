package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.Novelties;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 * Clase que realiza operaciones a la tabla novelties en la DB
 * de MySQL 
 */
public class NoveltiesService extends Database {
    
    //* Obtener novedad por su id
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
    
    //* Obtener todas las novedades
    public List<Novelties> getNovelties() throws SQLException {
        String sql = "SELECT * FROM novelties";
        applyConnection();
        statement = connection.prepareStatement(sql);
        result = statement.executeQuery();
        List<Novelties> listNovelties = new ArrayList<>();
       while(result.next())
            listNovelties.add(new Novelties(result.getInt("id"), result.getString("name"), result.getBoolean("active")));
        closeConnection();
        return listNovelties;
    }
    
    //* Crear novedad (funcionalidad no añadida en la app)
    public void createNovelties(String name) throws SQLException {
        String sql = "INSERT INTO novelties(name) VALUES (?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.executeUpdate();
        closeConnection();
    }
    
    //* Editar novedades (funcionalidad no añadida en la app)
    public void updateNovelties(int id, String name) throws SQLException {
        String sql = "UPDATE novelties SET name = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, name);
        statement.setInt(2, id);
        statement.executeUpdate();
        closeConnection();
    }
    
    //* Desactivar novedades, se veran en reportes ya publicados pero no apareceran para reportes nuevos 
    //* (funcionalidad no añadida en la app)
    public void removeNovelties(int id) throws SQLException {
        String sql = "UPDATE novelties SET active = 0 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}