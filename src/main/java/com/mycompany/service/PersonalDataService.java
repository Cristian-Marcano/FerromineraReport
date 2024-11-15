package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.PersonalData;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class PersonalDataService extends Database {
    
    public void createPersonalData(PersonalData data) throws SQLException {
        String sql = "INSERT INTO personal_data(name, last_name, ficha, tlf, user_id) VALUES (?,?,?,?,?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, data.getName());
        statement.setString(2, data.getLastName());
        statement.setString(3, data.getFicha());
        statement.setString(4, data.getTlf());
        statement.setInt(5, data.getUserId());
        statement.executeUpdate();
        closeConnection();
    }
    
    public void updatePersonalData(PersonalData data) throws SQLException {
        String sql = "UPDATE personal_data SET name = ?, last_name = ?, ficha = ?, tlf = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, data.getName());
        statement.setString(2, data.getLastName());
        statement.setString(3, data.getFicha());
        statement.setString(4, data.getTlf());
        statement.setInt(5, data.getId());
        statement.executeUpdate();
        closeConnection();
    }
}
