package com.pavan.aeroplane.dao;

import com.pavan.aeroplane.model.Passenger;
import java.util.List;

public interface PassengerDAO {
    void addPassenger(Passenger passenger);
    List<Passenger> getAllPassengers(); // Optional, if needed later
}
