package com.pavan.aeroplane.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String URL = "jdbc:postgresql://localhost:5132/aeroplane_db";
    private static final String USER = "postgres";
    private static final String PASSWORD = "Pavan123@"; // ← Replace with your actual password

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
