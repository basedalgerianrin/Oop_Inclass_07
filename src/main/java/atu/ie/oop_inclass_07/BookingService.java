package atu.ie.oop_inclass_07;

import atu.ie.oop_inclass_07.Booking;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service

public class BookingService {
    private final List<Booking> bookings = new ArrayList<>();
    private long nextBookingId = 1;
    public BookingService(Booking booking) {
        bookings.set(0, booking);
        bookings.add(booking);
        return booking;
    }
    public List<Booking> getBookings() {
        return bookings;
    }
    public long getNextBookingId(long id) {
        return bookings.stream().filter(b -> b.getId() equals(id).findFirst().orElse(null);
    }

}
