package com.pavan.aeroplane;

import java.sql.Connection;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            if (conn != null) {
                System.out.println(" Connected to the database!");
                conn.close();
            } else {
                System.out.println(" Failed to connect.");
            }
        } catch (SQLException e) {
            System.out.println(" Database error: " + e.getMessage());
            e.printStackTrace();
        }
    }
}