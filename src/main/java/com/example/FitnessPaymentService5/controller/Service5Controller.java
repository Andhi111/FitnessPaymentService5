package com.example.FitnessPaymentService5.controller;

import com.example.FitnessPaymentService5.model.Service5Request;
import com.example.FitnessPaymentService5.model.Service5Response;
import com.example.FitnessPaymentService5.service.Service5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/service5")
public class Service5Controller {
    @Autowired
    private Service5 service5;

    @PostMapping("/process-payment")
    public ResponseEntity<Service5Response> processPayment(@RequestBody Service5Request request) {
        Service5Response response = service5.processPayment(request.getCardHolderName(),request.getCardNUmber());
        return ResponseEntity.ok(response);
    }
}

