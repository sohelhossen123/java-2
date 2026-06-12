//A travel company wants to manage flight and hotel bookings.
// Package Structure:
// 1. Package: travel.flights
//  A. Class: Flight
//      a. Attributes: flightNumber, destination, price
//      b. Methods: getDetails()

// 2. Package: travel.hotels
//  A. Class: Hotel
//      a. Attributes: hotelName, location, price
//      b. Methods: getDetails()

// 3. Package: travel.bookings
//  A. Class: Booking
//      a. Methods: bookFlight(Flight f), bookHotel(Hotel h)

// Task:
// 1. Implement the package structure and define the classes.
// 2. Book a flight and a hotel.
// 3. Display the booking details.

package Ass7;

import Ass7.bookings.Booking;
import Ass7.flights.Flight;
import Ass7.hotels.Hotel;

public class ass7 {
    public static void main(String[] args) {

        Flight flight = new Flight(
                "AI101",
                "Delhi",
                8500.00
        );

        Hotel hotel = new Hotel(
                "Grand Palace",
                "Delhi",
                4500.00
        );

        Booking booking = new Booking();

        booking.bookFlight(flight);
        booking.bookHotel(hotel);
    }
}