package com.example.FitnessPaymentService5.service;

import com.example.FitnessPaymentService5.model.Service5Response;
import org.springframework.stereotype.Service;

import java.time.Instant;

@Service
public class Service5 {
    public Service5Response processPayment(String cardNumber, String cardHolderName) {
        simulateBusinessProcess();

        String timestamp = Instant.now().toString();

        return new Service5Response("SUCCESS", timestamp);
    }

    private void simulateBusinessProcess() {
        try {
            Thread.sleep(3000); // Delay 3 detik
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
