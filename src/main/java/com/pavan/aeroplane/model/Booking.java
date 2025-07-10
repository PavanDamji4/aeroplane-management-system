package com.pavan.aeroplane.model;

public class Booking {
    private int bookingId;
    private int flightId;
    private int passengerId;

    public Booking() {}

    public Booking(int bookingId, int flightId, int passengerId) {
        this.bookingId = bookingId;
        this.flightId = flightId;
        this.passengerId = passengerId;
    }
    
    public Booking(int flightId, int passengerId) {
    this.flightId = flightId;
    this.passengerId = passengerId;
    }


    public int getBookingId() { return bookingId; }
    public int getFlightId() { return flightId; }
    public int getPassengerId() { return passengerId; }

    public void setBookingId(int bookingId) { this.bookingId = bookingId; }
    public void setFlightId(int flightId) { this.flightId = flightId; }
    public void setPassengerId(int passengerId) { this.passengerId = passengerId; }

    @Override
    public String toString() {
        return "Booking ID: " + bookingId + ", Flight ID: " + flightId + ", Passenger ID: " + passengerId;
    }
}
