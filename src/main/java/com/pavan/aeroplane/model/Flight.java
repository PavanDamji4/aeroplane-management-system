package com.pavan.aeroplane.model;

import java.sql.Time;

public class Flight {
    private int flightId;
    private String flightName;
    private String source;
    private String destination;
    private Time departureTime;
    private Time arrivalTime;

    // Getters and Setters
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Time getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Time departureTime) {
        this.departureTime = departureTime;
    }

    public Time getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(Time arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    @Override
    public String toString() {
    return "Flight ID: " + flightId +
           ", Name: " + flightName +
           ", From: " + source +
           ", To: " + destination +
           ", Departs: " + departureTime +
           ", Arrives: " + arrivalTime;
}

}
