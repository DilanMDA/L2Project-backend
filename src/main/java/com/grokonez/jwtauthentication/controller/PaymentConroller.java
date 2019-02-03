package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Payment;
import com.grokonez.jwtauthentication.repository.PaymentRepository;
import com.grokonez.jwtauthentication.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PaymentConroller {

    @Autowired
    PaymentRepository paymentRepository;

    @PostMapping("/paymentCallback")
    public void paymentCallback(@RequestBody Payment payment){
        //System.out.println(payment.toString());
        switch (payment.getStatus_code()){
            case 2:
                paymentRepository.save(payment);
                //return "Success";
            default:
                //return "failed";
        }
    }
}
