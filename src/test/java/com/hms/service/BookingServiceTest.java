// BookingServiceTest.java
package com.hms.service;

import com.hms.entity.Booking;
import com.hms.repository.BookingRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class BookingServiceTest {
    @InjectMocks
    private BookingService bookingService;

    @Mock
    private BookingRepository bookingRepository;

    public BookingServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void createBooking() {
        Booking booking = new Booking();
        when(bookingRepository.save(any())).thenReturn(booking);

        Booking createdBooking = bookingService.createBooking(booking);

        verify(bookingRepository, times(1)).save(any());
        assert createdBooking != null;
    }

    @Test
    void getAllBookings() {
        when(bookingRepository.findAll()).thenReturn(Collections.emptyList());
        List<Booking> bookings = bookingService.getAllBookings();
        assert bookings.isEmpty();
    }

    @Test
    void getBookingById() {
        Booking booking = new Booking();
        when(bookingRepository.findById(1L)).thenReturn(Optional.of(booking));

        Booking foundBooking = bookingService.getBookingById(1L);
        assert foundBooking != null;
    }
}