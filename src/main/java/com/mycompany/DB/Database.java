package com.mycompany.DB;

import java.util.Map;
import java.util.HashMap;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author Cristian
 */
public class Database {
    
    private static String host;
    private static Integer port;
    private static String db;
    private static String username;
    private static String password;
    protected static Connection connection;
    protected static PreparedStatement statement;
    protected static ResultSet result;
    
    public Database() {
        Map<String, String> envVariables = new HashMap<>();
        String line;
        if(validateAttributes())
        try (BufferedReader br = new BufferedReader(new FileReader(".env"))) {
            while ((line = br.readLine()) != null) {
                // Ignorar líneas vacías y comentarios
                if (line.trim().isEmpty() || line.startsWith("#"))
                    continue;
                
                String[] parts = line.split("=", 2);
                
                if(parts.length == 2) 
                    envVariables.put(parts[0].trim(), parts[1].trim());
            }
            
            if(!validateEnv(envVariables)) {
                host = envVariables.get("host");
                port = Integer.valueOf(envVariables.get("port"));
                db = envVariables.get("database");
                username = envVariables.get("user");
                password = envVariables.get("password");
            } else throw new IOException("environment variables not found");
            
        } catch (IOException | NumberFormatException e) { 
            System.err.println(e.getMessage());
                
            host = "localhost";
            port = 3306;
            db = "ferrominera_project";
            username = "root";
            password = "Contraseña1/";
        }
    }
    
    private boolean validateAttributes() {
        return host == null && port==null && db == null && username == null && password == null;
    }
    
    private boolean validateEnv(Map<String, String> envs) {
        return envs.get("host")==null && envs.get("port")==null && envs.get("database")==null && envs.get("user")==null && envs.get("password")==null; 
    }
    
    public void applyConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s",host,port,db);
        connection = DriverManager.getConnection(url,username,password);
    }
    
    public static boolean verifyController(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            System.err.println("Error al cargar el controlador JDBC: " + e.getMessage());
            return false;
        }
    }
    
    public void CloseConnection() throws SQLException {
        if(connection!=null && (!connection.isClosed())) connection.close();
        if(statement!=null && (!statement.isClosed())) statement.close();
        if(result!=null && (!result.isClosed())) result.close();
    }
    
}
