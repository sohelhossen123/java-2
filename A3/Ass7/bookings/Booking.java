package Ass7.bookings;

import Ass7.flights.Flight;
import Ass7.hotels.Hotel;

public class Booking {

    public void bookFlight(Flight f) {
        System.out.println("Flight Booked Successfully!");
        System.out.println(f.getDetails());
    }

    public void bookHotel(Hotel h) {
        System.out.println("\nHotel Booked Successfully!");
        System.out.println(h.getDetails());
    }
}
