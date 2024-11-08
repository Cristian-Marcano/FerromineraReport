package com.mycompany.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Cristian
 */
public class Database {
    private final String host = "localhost";
    private final int port = 3306;
    private final String db = "ferrominera_project";
    private final String username = "root";
    private final String password = "Contraseña1/";
    protected static Connection connection;
    protected static PreparedStatement statement;
    protected static ResultSet result;
    
    public void applyConnection() throws SQLException {
        String url = String.format("jdbc:mysql://%s:%d/%s",host,port,db);
        connection = DriverManager.getConnection(url,username,password);
    }
    
    public static boolean verifyController(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return true;
        } catch (ClassNotFoundException e) {
            System.out.println("Error al cargar el controlador JDBC: " + e.getMessage());
            return false;
        }
    }
    
    public void closeConnection() throws SQLException {
        if(connection!=null && (!connection.isClosed())) connection.close();
        if(statement!=null && (!statement.isClosed())) statement.close();
        if(result!=null && (!result.isClosed())) result.close();
    }
    
}
