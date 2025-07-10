package com.pavan.aeroplane;

import com.pavan.aeroplane.dao.impl.FlightDAOImpl;
import com.pavan.aeroplane.dao.impl.PassengerDAOImpl;
import com.pavan.aeroplane.dao.impl.BookingDAOImpl;

import com.pavan.aeroplane.model.Flight;
import com.pavan.aeroplane.model.Passenger;
import com.pavan.aeroplane.model.Booking;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightDAOImpl flightDAO = new FlightDAOImpl();
        PassengerDAOImpl passengerDAO = new PassengerDAOImpl();
        BookingDAOImpl bookingDAO = new BookingDAOImpl();

        while (true) {
            System.out.println("\n========= ✈ Aeroplane Management System ✈ =========");
            System.out.println("1. View All Flights");
            System.out.println("2. Add New Passenger");
            System.out.println("3. Book Ticket");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    List<Flight> flights = flightDAO.getAllFlights();
                    System.out.println("\nAvailable Flights:");
                    for (Flight f : flights) {
                        System.out.println(f);
                    }
                    break;

                case 2:
                    System.out.print("Enter Passenger Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    Passenger p = new Passenger(name, age, gender);
                    passengerDAO.addPassenger(p);
                    break;

                case 3:
                    System.out.print("Enter Flight ID to book: ");
                    int flightId = sc.nextInt();
                    System.out.print("Enter Passenger ID: ");
                    int passengerId = sc.nextInt();

                    Booking b = new Booking(flightId, passengerId);
                    bookingDAO.addBooking(b);
                    break;

                case 4:
                    System.out.println("Thanks for using ✈ Aeroplane Management System!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
