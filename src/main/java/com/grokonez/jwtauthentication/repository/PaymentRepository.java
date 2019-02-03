package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment,String> {

}
