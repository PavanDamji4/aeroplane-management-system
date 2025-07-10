package com.pavan.aeroplane.dao;

import com.pavan.aeroplane.model.Flight;
import java.util.List;

public interface FlightDAO {
    List<Flight> getAllFlights();
    void addFlight(Flight flight);
    void deleteFlight(int flightId);
}
