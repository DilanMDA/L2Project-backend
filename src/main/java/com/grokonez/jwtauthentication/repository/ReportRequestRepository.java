package com.grokonez.jwtauthentication.repository;

import com.grokonez.jwtauthentication.model.ReportRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportRequestRepository extends JpaRepository<ReportRequest,Long>{
}
