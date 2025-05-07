// PaymentController.java
package com.hms.controller;

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

    // Add endpoints for payment processing
}