import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

/**
 * Service quản lý hãng hàng không - tuân thủ Single Responsibility Principle
 */
public class AirlineService {
    private List<Flight> flights;
    private List<Booking> bookings;
    
    public AirlineService() {
        this.flights = new ArrayList<>();
        this.bookings = new ArrayList<>();
    }
    
    public void addFlight(Flight flight) throws InvalidFlightException {
        if (!flight.isValid()) {
            throw new InvalidFlightException("Invalid flight data");
        }
        
        for (Flight f : flights) {
            if (f.getFlightNumber().equals(flight.getFlightNumber())) {
                throw new InvalidFlightException("Flight number already exists");
            }
        }
        
        flights.add(flight);
    }
    
    public Flight findFlightByNumber(String flightNumber) throws InvalidFlightException {
        for (Flight flight : flights) {
            if (flight.getFlightNumber().equals(flightNumber)) {
                return flight;
            }
        }
        throw new InvalidFlightException("Flight " + flightNumber + " not found");
    }
    
    public void createBooking(Booking booking) throws InvalidBookingException {
        if (!booking.isValid()) {
            throw new InvalidBookingException("Invalid booking data");
        }
        
        // Kiểm tra trùng lặp bookingId
        for (Booking b : bookings) {
            if (b.getBookingId().equals(booking.getBookingId())) {
                 throw new InvalidBookingException("Booking ID already exists");
            }
        }
        
        bookings.add(booking);
    }
    
    public Booking findBookingById(String bookingId) throws InvalidBookingException {
        for (Booking booking : bookings) {
            if (booking.getBookingId().equals(bookingId)) {
                return booking;
            }
        }
        throw new InvalidBookingException("Booking " + bookingId + " not found");
    }
    
    public List<Flight> getFlightsByRoute(String origin, String destination) {
        List<Flight> filtered = new ArrayList<>();
        for (Flight flight : flights) {
            if (flight.getOrigin().equals(origin) && flight.getDestination().equals(destination)) {
                filtered.add(flight);
            }
        }
        return filtered;
    }
    
    public List<Booking> getBookingsByPassenger(String passengerName) {
        List<Booking> filtered = new ArrayList<>();
        for (Booking booking : bookings) {
            if (booking.getPassengerName().equalsIgnoreCase(passengerName)) {
                filtered.add(booking);
            }
        }
        return filtered;
    }
    
    public List<Flight> getAllFlights() {
        return new ArrayList<>(flights);
    }
    
    public List<Booking> getAllBookings() {
        return new ArrayList<>(bookings);
    }
}