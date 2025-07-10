package com.pavan.aeroplane.dao.impl;

import com.pavan.aeroplane.dao.FlightDAO;
import com.pavan.aeroplane.model.Flight;
import com.pavan.aeroplane.util.DatabaseConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAOImpl implements FlightDAO {

    @Override
    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        String sql = "SELECT * FROM flights";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Flight flight = new Flight();
                flight.setFlightId(rs.getInt("flight_id"));
                flight.setFlightName(rs.getString("flight_name"));
                flight.setSource(rs.getString("source"));
                flight.setDestination(rs.getString("destination"));
                flight.setDepartureTime(rs.getTime("departure_time"));
                flight.setArrivalTime(rs.getTime("arrival_time"));

                flights.add(flight);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return flights;
    }

    @Override
    public void addFlight(Flight flight) {
        String sql = "INSERT INTO flights (flight_name, source, destination, departure_time, arrival_time) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, flight.getFlightName());
            stmt.setString(2, flight.getSource());
            stmt.setString(3, flight.getDestination());
            stmt.setTime(4, flight.getDepartureTime());
            stmt.setTime(5, flight.getArrivalTime());

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Flight added successfully!");
            } else {
                System.out.println("❌ Failed to add flight.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void deleteFlight(int flightId) {
        String sql = "DELETE FROM flights WHERE flight_id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, flightId);

            int rows = stmt.executeUpdate();
            if (rows > 0) {
                System.out.println("✅ Flight deleted successfully!");
            } else {
                System.out.println("❌ Flight not found.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
