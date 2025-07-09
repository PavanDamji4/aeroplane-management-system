package com.pavan.aeroplane;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {  // <- Class name MUST match filename
    
    private static final String URL = "jdbc:postgresql://localhost:5432/aeroplane_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Pavan@123";
    
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
