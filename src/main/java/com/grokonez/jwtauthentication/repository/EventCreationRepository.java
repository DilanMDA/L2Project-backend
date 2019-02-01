package com.grokonez.jwtauthentication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.grokonez.jwtauthentication.model.EventCreation;


@Repository
public interface EventCreationRepository extends JpaRepository<EventCreation,Integer> {
}
