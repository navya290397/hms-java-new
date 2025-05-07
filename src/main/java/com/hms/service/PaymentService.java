// PaymentService.java
package com.hms.service;

import com.hms.entity.Payment;
import com.hms.repository.PaymentRepository;
import org.springframework.stereotype.Service; 

@Service
public class PaymentService {
    private final PaymentRepository paymentRepository;

    public PaymentService(PaymentRepository paymentRepository) {
        this.paymentRepository = paymentRepository;
    }

    // Add methods for payment processing
}