package atu.ie.oop_inclass_07;

import atu.ie.oop_inclass_07.Booking;
import atu.ie.oop_inclass_07.BookingService;
import jakarta.validation.Valid;
import jakarta.ws.rs.core.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/bookings")


public class BookingController {
    private final BookingService bookingService;
    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }
    @PostMapping
    public ResponseEntity<Booking> addBooking(@Valid @RequestBody Booking booking) {
        Booking savedBooking = bookingService.addBooking(booking);
        return ResponseEntity.status(HttpStatus.CREATED).body(savedBooking);
    }
    @PostMapping
    public ResponseEntity <Booking> getBookingbyId(@PathVariable long id){
        Booking booking = bookingService.getNextBookingId(id);
        if (booking == null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(booking);
    }
}
