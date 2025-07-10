package com.pavan.aeroplane.dao.impl;

import com.pavan.aeroplane.dao.PassengerDAO;
import com.pavan.aeroplane.model.Passenger;
import com.pavan.aeroplane.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PassengerDAOImpl implements PassengerDAO {

    @Override
    public void addPassenger(Passenger passenger) {
        try {
            Connection conn = DatabaseConnection.getConnection();
            String query = "INSERT INTO passengers (name, age, gender) VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, passenger.getName());
            ps.setInt(2, passenger.getAge());
            ps.setString(3, passenger.getGender());
            ps.executeUpdate();
            System.out.println("Passenger added.");
            conn.close();
        } catch (Exception e) {
            System.out.println("Error adding passenger: " + e.getMessage());
        }
    }

    @Override
    public List<Passenger> getAllPassengers() {
        List<Passenger> list = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM passengers");
            while (rs.next()) {
                Passenger p = new Passenger();
                p.setId(rs.getInt("passenger_id"));
                p.setName(rs.getString("name"));
                p.setAge(rs.getInt("age"));
                p.setGender(rs.getString("gender"));
                list.add(p);
            }
            conn.close();
        } catch (Exception e) {
            System.out.println("Error fetching passengers: " + e.getMessage());
        }
        return list;
    }
}
