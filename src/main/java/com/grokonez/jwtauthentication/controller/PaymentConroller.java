package com.grokonez.jwtauthentication.controller;

import com.grokonez.jwtauthentication.model.Payment;
import com.grokonez.jwtauthentication.model.User;
import com.grokonez.jwtauthentication.repository.PaymentRepository;
import com.grokonez.jwtauthentication.repository.UserRepository;
import com.grokonez.jwtauthentication.services.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.IOException;

@RestController
@RequestMapping("/api")
public class PaymentConroller {

    @Autowired
    PaymentRepository paymentRepository;

    @Autowired
    UserRepository userRepository;

    @PostMapping("/paymentCallback")
    public void paymentCallback(@RequestBody Payment payment){
        //System.out.println(payment.toString());
        switch (payment.getStatus_code()){
            case 2:
                paymentRepository.save(payment);
                User user = userRepository.getOne(Long.parseLong(payment.getCustom_1())); //custom 1 -> user_id
                EmailService es = new EmailService();
                try {
                    es.sendmail(user.getEmail());
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                //return "Success";
            default:
                //return "failed";
        }
    }

    //testing for mail
    @GetMapping("/sendMail")
    public void sendMail(@RequestParam String email){
        EmailService es = new EmailService();
        try {
            es.sendmail(email);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
