package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.PersonalData;
import com.mycompany.models.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Cristian
 */
public class UserService extends Database {
    
    public User getUser(int id) throws Exception {
        String sql = "SELECT * FROM user WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        result = statement.executeQuery();
        User user = null;
        if(result.next()) user = new User(result.getInt("id"), result.getString("username"), result.getString("password"), 
                                          result.getString("role"), result.getBoolean("active"));
        closeConnection();
        return user;
    }
    
    public User getUser(String username) throws Exception {
        String sql = "SELECT * FROM user WHERE username = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, username);
        result = statement.executeQuery();
        User user = null;
        if(result.next()) user = new User(result.getInt("id"), result.getString("username"), result.getString("password"), 
                                          result.getString("role"), result.getBoolean("active"));
        closeConnection();
        return user;
    }
    
    public Map<User,PersonalData> searchUsers(List<String[]> sentencesAndValues) throws Exception {
        String sql = "SELECT * FROM user JOIN personal_data AS pd ON user.id = pd.user_id";
        if(!sentencesAndValues.isEmpty()) {
            sql += " WHERE ";
            for(String[] sentence: sentencesAndValues) 
                sql += (sql.endsWith("? ")) ? "AND " + sentence[0] : sentence[0];
        }
        statement = connection.prepareStatement(sql);
        for(int i=0; i<sentencesAndValues.size(); i++) statement.setString(i-1, sentencesAndValues.get(i)[1]);
        result = statement.executeQuery();
        Map<User,PersonalData> users = new HashMap<>();
        while(result.next()) 
            users.put(new User(result.getInt("user.id"), result.getString("user.username"), 
                                result.getString("user.password"), result.getString("user.role"), result.getBoolean("user.active")),
                      new PersonalData(result.getInt("pd.id"), result.getInt("pd.user_id"), result.getString("pd.name"),
                                        result.getString("pd.last_name"), result.getString("pd.ficha"), result.getString("pd.tlf")));
        closeConnection();
        return users;
    }
    
    public void createUser(User user) throws Exception {
        String sql = "INSERT INTO user(username, password, role) VALUES (?,?,?)";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getRole());
        statement.executeUpdate();
        closeConnection();
    }
}
