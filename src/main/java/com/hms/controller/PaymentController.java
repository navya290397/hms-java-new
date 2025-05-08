// PaymentController.java
package com.hms.controller;

import com.hms.entity.Booking;
import com.hms.entity.Payment;
import com.hms.service.PaymentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    private final PaymentService paymentService;

    public PaymentController(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

    @PostMapping
    public ResponseEntity<Payment> createBooking(@RequestBody Booking booking) {
        return new ResponseEntity<>(paymentService.doPayment(booking), HttpStatus.CREATED);
    }

    // Add endpoints for payment processing
}
