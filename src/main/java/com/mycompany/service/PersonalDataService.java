package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.PersonalData;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 * Clase que realiza operaciones a la tabla personal_data en la DB
 * de MySQL 
 */
public class PersonalDataService extends Database {
    
    //* Obtener datos personales por el id del usuario
    public PersonalData getPersonalData(int userId) throws SQLException {
        String sql = "SELECT * FROM personal_data WHERE user_id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, userId);
        result = statement.executeQuery();
        PersonalData data = null;
        if(result.next())
            data = new PersonalData(result.getInt("id"), result.getInt("user_id"), result.getString("name"),
                                    result.getString("last_name"), result.getString("ficha"), result.getString("tlf"));
        closeConnection();
        return data;
    }
    
    //* Crear datos personales de un usuario
    public void createPersonalData(PersonalData data) throws SQLException {
        String sql = "INSERT INTO personal_data(name, last_name, ficha, tlf, user_id) VALUES (?,?,?,?,?)";
        statement = connection.prepareStatement(sql);
        statement.setString(1, data.getName());
        statement.setString(2, data.getLastName());
        statement.setString(3, data.getFicha());
        statement.setString(4, data.getTlf());
        statement.setInt(5, data.getUserId());
        statement.executeUpdate();
        connection.commit();
        closeConnection();
    }
    
    //* Editar datos personales de un usuario
    public void updatePersonalData(PersonalData data) throws SQLException {
        String sql = "UPDATE personal_data SET name = ?, last_name = ?, ficha = ?, tlf = ? WHERE id = ?";
        statement = connection.prepareStatement(sql);
        statement.setString(1, data.getName());
        statement.setString(2, data.getLastName());
        statement.setString(3, data.getFicha());
        statement.setString(4, data.getTlf());
        statement.setInt(5, data.getId());
        statement.executeUpdate();
        connection.commit();
        closeConnection();
    }
}
