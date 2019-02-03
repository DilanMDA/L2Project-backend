package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.SystemRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SystemRateRepository extends JpaRepository<SystemRate,Long> {
}
