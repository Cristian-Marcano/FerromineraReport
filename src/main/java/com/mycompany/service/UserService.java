package com.mycompany.service;

import com.mycompany.DB.Database;
import com.mycompany.models.PersonalData;
import com.mycompany.models.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Cristian
 */
public class UserService extends Database {
    
    public Object[] getUser(int id) throws Exception {
        String sql = "SELECT * FROM user JOIN personal_data AS pd ON user.id = pd.user_id WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        result = statement.executeQuery();
        Object[] user = null;
        if(result.next()) user = new Object[]{new User(result.getInt("user.id"), result.getString("user.username"), result.getString("user.password"), 
                                                result.getString("user.role"), result.getBoolean("user.active")),
                                              new PersonalData(result.getInt("pd.id"), result.getInt("pd.user_id"), result.getString("pd.name"),
                                                result.getString("pd.last_name"), result.getString("pd.ficha"), result.getString("pd.tlf"))};
        closeConnection();
        return user;
    }
    
    public User getUser(String username) throws Exception {
        String sql = "SELECT * FROM user WHERE username = ? AND active = 1";
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
    
    public int getCountUsers() throws Exception {
        String sql = "SELECT COUNT(*) AS count FROM user";
        applyConnection();
        statement = connection.prepareStatement(sql);
        result = statement.executeQuery();
        int count = 0;
        if(result.next())
            count = result.getInt("count");
        return count;
    }
    
    public List<Object[]> searchUsers(List<String[]> sentencesAndValues) throws Exception {
        String sql = "SELECT * FROM user JOIN personal_data AS pd ON user.id = pd.user_id";
        if(!sentencesAndValues.isEmpty()) {
            sql += " WHERE ";
            for(String[] sentence: sentencesAndValues) 
                sql += (sql.endsWith("? ")) ? "AND " + sentence[0] : sentence[0];
        }
        applyConnection();
        statement = connection.prepareStatement(sql);
        for(int i=0; i<sentencesAndValues.size(); i++) statement.setString(i+1, sentencesAndValues.get(i)[1]);
        result = statement.executeQuery();
        List<Object[]> users = new ArrayList<>();
        while(result.next()) 
            users.add(new Object[]{new User(result.getInt("user.id"), result.getString("user.username"), 
                                            result.getString("user.password"), result.getString("user.role"), result.getBoolean("user.active")),
                                   new PersonalData(result.getInt("pd.id"), result.getInt("pd.user_id"), result.getString("pd.name"),
                                                    result.getString("pd.last_name"), result.getString("pd.ficha"), result.getString("pd.tlf"))});
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
    
    public void updateUser(User user) throws Exception {
        String sql = "UPDATE user SET username = ?, password = ?, role = ? WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setString(1, user.getUsername());
        statement.setString(2, user.getPassword());
        statement.setString(3, user.getRole());
        statement.setInt(4, user.getId());
        statement.executeUpdate();
        closeConnection();
    }
    
    public void updateUserPersonalData(PersonalData data) throws Exception {
        String sql = "UPDATE personal_data SET name = ?, last_name = ?, ficha = ?, tlf = ? WHERE user_id = ?";
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
    
    public void removeUser(int id) throws Exception {
        String sql = "UPDATE user SET active = 0 WHERE id = ?";
        applyConnection();
        statement = connection.prepareStatement(sql);
        statement.setInt(1, id);
        statement.executeUpdate();
        closeConnection();
    }
}