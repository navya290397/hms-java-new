// BookingControllerTest.java
package com.hms.controller;

import com.hms.entity.Booking;
import com.hms.service.BookingService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.mockito.Mockito.*;

@WebMvcTest(BookingController.class)
class BookingControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private BookingService bookingService;

    @Test
    void testCreateBooking() throws Exception {
        Booking booking = new Booking();
        // Add booking details here
        when(bookingService.createBooking(any())).thenReturn(booking);
        mockMvc.perform(MockMvcRequestBuilders.post("/api/bookings")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{}"))
                .andExpect(MockMvcResultMatchers.status().isCreated());
    }
}