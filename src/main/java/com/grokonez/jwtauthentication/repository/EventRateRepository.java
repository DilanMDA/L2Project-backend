package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.EventRate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventRateRepository extends JpaRepository<EventRate,Long> {

    @Query("select r from EventRate r where r.event_id=?1")
    List<EventRate> findEventRatesByEvent_id(Long event_id);

    @Query("select r from EventRate r where r.user_id=?1")
    List<EventRate> findEventRatesByUser_id(Long user_id);
}
