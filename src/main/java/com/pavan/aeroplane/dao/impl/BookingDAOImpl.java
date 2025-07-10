package com.pavan.aeroplane.dao.impl;

import com.pavan.aeroplane.dao.BookingDAO;
import com.pavan.aeroplane.model.Booking;
import com.pavan.aeroplane.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookingDAOImpl implements BookingDAO {

    @Override
    public void addBooking(Booking booking) {
        String sql = "INSERT INTO bookings (flight_id, passenger_id) VALUES (?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, booking.getFlightId());
            stmt.setInt(2, booking.getPassengerId());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Booking added successfully!");
            } else {
                System.out.println("❌ Failed to add booking.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
